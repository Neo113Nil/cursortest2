package com.crrepa.l0;

import androidx.annotation.NonNull;
import com.crrepa.ble.conn.callback.CRPJieliDfuPackageLengthCallback;
import com.crrepa.ble.util.BleLog;
import java.io.File;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public abstract class g {
    private static final int COUNTDOWN_INTERVAL = 1000;
    protected static final int DEFAULT_START_INDEX = 0;
    protected static final int DEFAULT_TIMEOUT_SECONDS = 30;
    protected h mTransFileManager;
    protected int timeout = 30;
    private Timer timer = new Timer();
    private int waitTime = 0;

    class a implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f13180h;

        a(boolean z7) {
            this.f13180h = z7;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f13180h) {
                g.this.transComplete();
            } else {
                g.this.onCrcFail();
            }
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            g.this.handleTimeout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void handleTimeout() {
        try {
            BleLog.d("waitTime: " + this.waitTime);
            int i8 = this.waitTime;
            if (i8 < this.timeout) {
                this.waitTime = i8 + 1;
            } else {
                BleLog.d("trans time out!");
                onTimeoutError();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startTrans$0(int i8) {
        com.crrepa.f0.a.a().b();
        setPacketLength(i8);
    }

    private void stopTimer() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }

    public void cancel() {
        release();
        onCrcFail();
    }

    protected void checkFileCRC(int i8) {
        int c8 = this.mTransFileManager.c();
        BleLog.i("receiveCRC: " + i8);
        BleLog.i("calcFileCrc: " + c8);
        boolean z7 = i8 == c8;
        sendFileCheckResult(z7);
        d4.a.a(new a(z7), 1000L);
    }

    protected void createFileManager(File file, int i8) {
        this.mTransFileManager = h.a(file, i8);
    }

    public abstract int getCmd();

    @NonNull
    protected byte[] getFileSizeBytes(long j8) {
        return com.crrepa.g1.c.c(j8);
    }

    public int getPacketLength() {
        h hVar = this.mTransFileManager;
        if (hVar != null) {
            return hVar.b();
        }
        return 0;
    }

    protected byte[] getTransBytes(int i8) {
        return this.mTransFileManager.a(i8);
    }

    public boolean isStarted() {
        return this.mTransFileManager != null;
    }

    protected abstract void onCrcFail();

    protected void onProgressChanged(long j8) {
        if (this.mTransFileManager == null) {
            return;
        }
        onTransChanged((int) ((j8 * 100) / r0.e()));
    }

    protected abstract void onTimeoutError();

    protected abstract void onTransChanged(int i8);

    protected abstract void onTransComplete();

    protected abstract void onTransFileError();

    protected abstract void onTransFileNull();

    protected abstract void onTransStarting();

    protected void release() {
        BleLog.d("FileTransInitiator release");
        stopTimer();
        h hVar = this.mTransFileManager;
        if (hVar != null) {
            hVar.a();
            this.mTransFileManager = null;
        }
    }

    protected synchronized void resetTimer() {
        this.waitTime = 0;
    }

    protected void sendBleMessage(byte[] bArr) {
        com.crrepa.m.f.e().c(bArr);
    }

    protected void sendFile(int i8) {
        int b8 = this.mTransFileManager.b();
        byte[] transBytes = getTransBytes(i8);
        if (transBytes != null) {
            sendMessage(i.a(transBytes, b8));
        } else {
            BleLog.e("transBytes is null");
            onTransFileError();
        }
    }

    protected void sendFileCheckResult(boolean z7) {
        BleLog.d("sendFileCheckResult: " + z7);
        byte[] bArr = new byte[4];
        if (!z7) {
            Arrays.fill(bArr, (byte) -1);
        }
        sendBleMessage(com.crrepa.f.g.a(getCmd(), bArr));
    }

    protected void sendMessage(byte[] bArr) {
        com.crrepa.m.f e8 = com.crrepa.m.f.e();
        int cmd = getCmd();
        if (cmd != -77 && cmd != -73 && cmd != -9 && cmd != 96) {
            if (cmd == 99) {
                e8.e(bArr);
                return;
            } else if (cmd != 108 && cmd != 116) {
                return;
            }
        }
        e8.d(bArr);
    }

    public void setPacketLength(int i8) {
        BleLog.d("setPacketLength: " + i8);
        h hVar = this.mTransFileManager;
        if (hVar != null) {
            hVar.b(i8);
        }
    }

    public void setTimeout(int i8) {
        this.timeout = i8;
    }

    protected void setTransLength(int i8) {
        this.mTransFileManager.c(i8);
    }

    protected void startTimer() {
        if (this.timer == null) {
            this.timer = new Timer();
        }
        resetTimer();
        this.timer.schedule(new b(), 1000L, 1000L);
    }

    protected void startTrans() {
        long d8 = this.mTransFileManager.d();
        if (d8 < 0) {
            onTransFileError();
            return;
        }
        sendBleMessage(com.crrepa.f.g.a(getCmd(), getFileSizeBytes(d8)));
        com.crrepa.f0.a.a().b(new CRPJieliDfuPackageLengthCallback() { // from class: com.crrepa.l0.f
            @Override // com.crrepa.ble.conn.callback.CRPJieliDfuPackageLengthCallback
            public final void onPackageLength(int i8) {
                g.this.lambda$startTrans$0(i8);
            }
        });
    }

    protected void transComplete() {
        onTransChanged(100);
        release();
        onTransComplete();
    }

    public void transFileIndex(com.crrepa.y0.a aVar) {
        if (this.mTransFileManager == null) {
            BleLog.e("FileManager is null");
            return;
        }
        resetTimer();
        if (aVar.d()) {
            checkFileCRC(aVar.a());
            return;
        }
        int b8 = aVar.b();
        if (b8 >= 0) {
            sendFile(b8);
            onProgressChanged(b8);
        }
    }
}
