package com.crrepa.ble.spp.hisilicon.write;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.crrepa.ble.spp.hisilicon.receive.bean.FileRequestInfo;
import com.crrepa.ble.util.BleLog;
import com.crrepa.k0.c;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes3.dex */
public class SPPFileTransManager {
    private static final short DEFAULT_SEND_COUNT = 20;
    private static final short DEFAULT_SEND_SIZE = 512;
    private static final long DEFAULT_TRANSFER_TIMEOUT = 30000;
    private static final String FILE_OPERATING_MODE = "r";
    private static final int MESSAGE_WHAT_TIMEOUT = 10;
    private static final int NOTIFY_STATE_DUPLICATE_ID = 13;
    private static final int NOTIFY_STATE_FINISH = 11;
    private static final int NOTIFY_STATE_FINISH_2 = 12;
    private static final int NOTIFY_STATE_INVALID_ID = 10;
    private static final int NOTIFY_STATE_SAVE_FAILED_ID = 17;
    private static final int NOTIFY_STATE_STOP_ID = 16;
    private RandomAccessFile accessFile;
    private int fileSize;
    private final Handler handler;
    private SPPMessageChangeListener messageChangeListener;
    private boolean sending;
    private c sppConnectManager;
    private boolean stop;
    private int taskID;
    private CRPSPPFileTransListener transListener;

    private static class Holder {
        private static final SPPFileTransManager INSTANCE = new SPPFileTransManager();

        private Holder() {
        }
    }

    private SPPFileTransManager() {
        this.sending = false;
        this.stop = false;
        this.fileSize = 0;
        this.taskID = 0;
        this.handler = new Handler(Looper.getMainLooper()) { // from class: com.crrepa.ble.spp.hisilicon.write.SPPFileTransManager.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 10) {
                    return;
                }
                BleLog.d("SPPFileTransManager: timeout!");
                SPPFileTransManager.this.onError(10);
            }
        };
    }

    private void cancelTimeout() {
        this.handler.removeMessages(10);
    }

    private void close() {
        try {
            RandomAccessFile randomAccessFile = this.accessFile;
            if (randomAccessFile != null) {
                randomAccessFile.close();
                this.accessFile = null;
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    public static SPPFileTransManager getInstance() {
        return Holder.INSTANCE;
    }

    private int getTaskID() {
        int i8 = this.taskID + 1;
        this.taskID = i8;
        return i8;
    }

    private byte[] getTransBytes(int i8, int i9) {
        try {
            this.accessFile.seek(i8);
            byte[] bArr = new byte[i9];
            int read = this.accessFile.read(bArr);
            BleLog.d("SPPFileTransManager: len = " + read);
            if (read == i9) {
                return bArr;
            }
            if (read == -1) {
                return null;
            }
            byte[] bArr2 = new byte[read];
            System.arraycopy(bArr, 0, bArr2, 0, read);
            return bArr2;
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    private void onComplete() {
        CRPSPPFileTransListener cRPSPPFileTransListener = this.transListener;
        if (cRPSPPFileTransListener != null) {
            cRPSPPFileTransListener.onComplete();
        }
        onSendComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onError(int i8) {
        CRPSPPFileTransListener cRPSPPFileTransListener = this.transListener;
        if (cRPSPPFileTransListener != null) {
            cRPSPPFileTransListener.onError(i8);
        }
        cancelTimeout();
        onSendComplete();
    }

    private void onSendComplete() {
        this.sending = false;
        SPPMessageChangeListener sPPMessageChangeListener = this.messageChangeListener;
        if (sPPMessageChangeListener != null) {
            sPPMessageChangeListener.onSendComplete();
        }
    }

    private void onStart() {
        CRPSPPFileTransListener cRPSPPFileTransListener = this.transListener;
        if (cRPSPPFileTransListener != null) {
            cRPSPPFileTransListener.onStart();
        }
    }

    private void onTransProgress(int i8) {
        CRPSPPFileTransListener cRPSPPFileTransListener = this.transListener;
        if (cRPSPPFileTransListener != null) {
            cRPSPPFileTransListener.onTransProgress(i8);
        }
    }

    private void sendSppBytes(byte[] bArr) {
        c cVar = this.sppConnectManager;
        if (cVar != null) {
            cVar.a(bArr);
            this.handler.sendEmptyMessageDelayed(10, 30000L);
        }
    }

    private void start(String str, int i8) {
        BleLog.d("SPPFileTransManager start: path = " + str + ", " + i8);
        this.fileSize = i8;
        com.crrepa.r.c.e(false);
        sendSppBytes(com.crrepa.r.c.b(getTaskID(), i8, str, (short) 20, DEFAULT_SEND_SIZE));
    }

    public void reset() {
        BleLog.d("SPPFileTransManager: reset!");
        this.sending = false;
        this.stop = false;
        this.accessFile = null;
        this.taskID = 0;
    }

    public boolean sendFile(c cVar, SPPMessage sPPMessage) {
        if (!cVar.d()) {
            BleLog.d("SPPFileTransManager: Not connected!");
            return false;
        }
        if (this.sending) {
            BleLog.d("SPPFileTransManager: Sending file!");
            return false;
        }
        this.transListener = sPPMessage.getListener();
        File file = sPPMessage.getFile();
        String uploadPath = sPPMessage.getUploadPath();
        if (file == null || TextUtils.isEmpty(uploadPath)) {
            BleLog.d("SPPFileTransManager: File is null!");
            return false;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, FILE_OPERATING_MODE);
            this.accessFile = randomAccessFile;
            int length = (int) randomAccessFile.length();
            this.sending = true;
            this.stop = false;
            this.sppConnectManager = cVar;
            onStart();
            start(uploadPath, length);
            return true;
        } catch (Exception e8) {
            e8.printStackTrace();
            close();
            return false;
        }
    }

    public void sendNotify(int i8) {
        cancelTimeout();
        close();
        if (i8 == 11 || i8 == 12) {
            onComplete();
        } else {
            onError(i8);
        }
    }

    public void sendRequestInfo(FileRequestInfo fileRequestInfo) {
        BleLog.d("SPPFileTransManager: sendRequestInfo = " + fileRequestInfo);
        if (fileRequestInfo == null || fileRequestInfo.getTaskID() != this.taskID) {
            BleLog.d("SPPFileTransManager: taskID = " + this.taskID);
            BleLog.d("SPPFileTransManager: FileRequestInfo is null!");
            if (this.stop) {
                return;
            }
            onError(10);
            return;
        }
        int offset = fileRequestInfo.getOffset();
        onTransProgress((int) ((offset / this.fileSize) * 100.0f));
        int i8 = 0;
        while (true) {
            if (i8 >= 20) {
                break;
            }
            BleLog.d("SPPFileTransManager: offset = " + offset);
            byte[] transBytes = getTransBytes(offset, 512);
            BleLog.d("SPPFileTransManager: bytes = " + com.crrepa.g1.c.c(transBytes));
            if (transBytes != null) {
                sendSppBytes(com.crrepa.r.c.a(this.taskID, offset, transBytes.length, transBytes));
                offset += transBytes.length;
                i8++;
            } else if (i8 == 0) {
                onError(10);
                BleLog.d("SPPFileTransManager error: fileSize = " + this.fileSize);
                return;
            }
        }
        cancelTimeout();
    }

    public void sendStopAck() {
        onError(16);
    }

    public void setMessageChangeListener(SPPMessageChangeListener sPPMessageChangeListener) {
        this.messageChangeListener = sPPMessageChangeListener;
    }

    public void stop() {
        BleLog.d("SPPFileTransManager: stop!");
        this.stop = true;
        sendSppBytes(com.crrepa.r.c.c(this.taskID));
        this.taskID = 0;
    }
}
