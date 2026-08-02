package com.startapp.sdk.internal;

import android.os.HandlerThread;

/* loaded from: classes.dex */
public final class l8 extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4084a;

    public l8(String str) {
        super(str);
        this.f4084a = new Object();
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        synchronized (this.f4084a) {
            this.f4084a.notifyAll();
        }
    }

    @Override // java.lang.Thread
    public final void start() {
        synchronized (this.f4084a) {
            try {
                super.start();
                try {
                    this.f4084a.wait();
                } catch (InterruptedException e3) {
                    throw new RuntimeException(e3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
