package com.jieli.jl_audio_decode.tool;

import com.jieli.jl_audio_decode.callback.OnStateCallback;
import com.jieli.jl_audio_decode.callback.OnThreadFinishListener;
import com.jieli.jl_audio_decode.constant.ErrorCode;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes4.dex */
public class AddStreamDataThread extends OperationThread {
    private final LinkedBlockingQueue<byte[]> dataQueue;
    private final int dataType;
    private volatile boolean isLocked;
    private volatile boolean isRunning;

    public AddStreamDataThread(BaseManager baseManager, int i8, OnStateCallback onStateCallback, OnThreadFinishListener onThreadFinishListener) {
        super("AddStreamDataThread", baseManager, onStateCallback, onThreadFinishListener);
        this.dataQueue = new LinkedBlockingQueue<>();
        this.dataType = i8;
    }

    private void lock() {
        synchronized (this.dataQueue) {
            if (this.isLocked) {
                return;
            }
            try {
                this.isLocked = true;
                this.dataQueue.wait();
            } catch (InterruptedException e8) {
                e8.printStackTrace();
            }
            this.isLocked = false;
        }
    }

    private void unlock() {
        synchronized (this.dataQueue) {
            if (this.isLocked) {
                try {
                    this.dataQueue.notifyAll();
                } catch (Exception e8) {
                    e8.printStackTrace();
                    this.isLocked = false;
                }
            }
        }
    }

    public void addStreamData(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        try {
            this.dataQueue.put(bArr);
            unlock();
        } catch (InterruptedException e8) {
            e8.printStackTrace();
        }
    }

    @Override // com.jieli.jl_audio_decode.tool.OperationThread
    public int operation() {
        return 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        r8.isRunning = false;
        callbackError(-1004);
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        if (this.manager != null) {
            synchronized (this.dataQueue) {
                while (true) {
                    try {
                        if (!this.isRunning) {
                            break;
                        }
                        if (this.dataQueue.isEmpty()) {
                            lock();
                        } else {
                            byte[] poll = this.dataQueue.poll();
                            if (poll != null && poll.length != 0) {
                                try {
                                    if (!this.manager.nativeAddAudioStream(this.dataType, poll)) {
                                        break;
                                    }
                                } catch (Exception e8) {
                                    e8.printStackTrace();
                                    callbackError(ErrorCode.ERR_IO_EXCEPTION, String.format(Locale.ENGLISH, "%s: %s", ErrorCode.getErrorMsg(ErrorCode.ERR_IO_EXCEPTION), e8.getMessage()));
                                    this.isRunning = false;
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        } else {
            callbackError(-1);
        }
        this.isRunning = false;
        this.isLocked = false;
        this.dataQueue.clear();
        onThreadFinish();
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        this.isRunning = true;
        super.start();
    }

    public void stopThread() {
        this.isRunning = false;
        unlock();
    }
}
