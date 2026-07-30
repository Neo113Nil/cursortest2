package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes5.dex */
public class e extends Handler implements k {
    private final c eventBus;
    private boolean handlerActive;
    private final int maxMillisInsideHandleMessage;
    private final j queue;

    public e(c cVar, Looper looper, int i8) {
        super(looper);
        this.eventBus = cVar;
        this.maxMillisInsideHandleMessage = i8;
        this.queue = new j();
    }

    @Override // org.greenrobot.eventbus.k
    public void enqueue(p pVar, Object obj) {
        i obtainPendingPost = i.obtainPendingPost(pVar, obj);
        synchronized (this) {
            try {
                this.queue.enqueue(obtainPendingPost);
                if (!this.handlerActive) {
                    this.handlerActive = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                i poll = this.queue.poll();
                if (poll == null) {
                    synchronized (this) {
                        poll = this.queue.poll();
                        if (poll == null) {
                            this.handlerActive = false;
                            return;
                        }
                    }
                }
                this.eventBus.invokeSubscriber(poll);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.maxMillisInsideHandleMessage);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.handlerActive = true;
        } catch (Throwable th) {
            this.handlerActive = false;
            throw th;
        }
    }
}
