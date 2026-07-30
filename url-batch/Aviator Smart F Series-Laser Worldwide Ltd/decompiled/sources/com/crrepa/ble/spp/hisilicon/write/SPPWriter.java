package com.crrepa.ble.spp.hisilicon.write;

import com.crrepa.ble.util.BleLog;
import com.crrepa.k0.c;

/* loaded from: classes3.dex */
public class SPPWriter {
    private c sppConnectManager;
    private final SPPMessageQueue messageQueue = new SPPMessageQueue();
    private boolean writeCompleted = true;
    private final SPPMessageChangeListener messageChangeListener = new SPPMessageChangeListener() { // from class: com.crrepa.ble.spp.hisilicon.write.a
        @Override // com.crrepa.ble.spp.hisilicon.write.SPPMessageChangeListener
        public final void onSendComplete() {
            SPPWriter.this.sendComplete();
        }
    };

    private synchronized void handleMessage() {
        c cVar = this.sppConnectManager;
        if (cVar != null && cVar.d()) {
            if (!this.writeCompleted) {
                BleLog.d("SPPWriter: busy, skip writing.");
                return;
            }
            SPPMessage sPPMessage = this.messageQueue.get();
            if (sPPMessage == null) {
                BleLog.d("SPPWriter: no message to write.");
                return;
            }
            this.writeCompleted = false;
            if (sPPMessage.isFile()) {
                sendFile(sPPMessage);
            } else {
                sendBytes(sPPMessage);
            }
            return;
        }
        BleLog.e("SPPWriter: sppConnectManager is null.");
    }

    private void sendBytes(SPPMessage sPPMessage) {
        byte[] bytes = sPPMessage.getBytes();
        int packageLength = sPPMessage.getPackageLength();
        BleLog.d("SPPWriter: send bytes: " + com.crrepa.g1.c.c(bytes) + ", length:" + packageLength);
        int i8 = 0;
        while (true) {
            if (i8 >= bytes.length) {
                break;
            }
            int i9 = i8 + packageLength;
            int min = Math.min(i9, bytes.length) - i8;
            byte[] bArr = new byte[min];
            System.arraycopy(bytes, i8, bArr, 0, min);
            if (!this.sppConnectManager.a(bArr)) {
                BleLog.d("SPPWriter: failed to send bytes.");
                break;
            }
            i8 = i9;
        }
        sendComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendComplete() {
        BleLog.d("SPPWriter: write completed.");
        this.writeCompleted = true;
        handleMessage();
    }

    private void sendFile(SPPMessage sPPMessage) {
        boolean sendFile = SPPFileTransManager.getInstance().sendFile(this.sppConnectManager, sPPMessage);
        SPPFileTransManager.getInstance().setMessageChangeListener(this.messageChangeListener);
        if (sendFile) {
            return;
        }
        sendComplete();
        CRPSPPFileTransListener listener = sPPMessage.getListener();
        if (listener != null) {
            listener.onError(0);
        }
    }

    public void abort() {
        BleLog.d("SPPWriter: abort.");
        this.messageQueue.clear();
        SPPFileTransManager.getInstance().reset();
        this.writeCompleted = true;
    }

    public void add(SPPMessage sPPMessage) {
        this.messageQueue.insert(sPPMessage);
        handleMessage();
    }

    public void setSppConnectManager(c cVar) {
        this.sppConnectManager = cVar;
    }

    public void start() {
        this.messageQueue.clear();
        this.writeCompleted = true;
        handleMessage();
    }
}
