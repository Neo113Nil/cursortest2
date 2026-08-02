package com.startapp.sdk.internal;

import android.os.HandlerThread;

/* loaded from: classes.dex */
public final class l8 extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7212a;

    public l8(String str) {
        super(str);
        this.f7212a = new Object();
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        synchronized (this.f7212a) {
            this.f7212a.notifyAll();
        }
    }

    @Override // java.lang.Thread
    public final void start() {
        synchronized (this.f7212a) {
            try {
                super.start();
                try {
                    this.f7212a.wait();
                } catch (InterruptedException e4) {
                    throw new RuntimeException(e4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
