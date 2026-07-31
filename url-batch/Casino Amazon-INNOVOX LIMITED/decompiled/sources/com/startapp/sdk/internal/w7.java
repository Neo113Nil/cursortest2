package com.startapp.sdk.internal;

import android.os.HandlerThread;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class w7 extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    public final Object f480a;

    public w7(String str) {
        super(str);
        this.f480a = new Object();
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        synchronized (this.f480a) {
            this.f480a.notifyAll();
        }
    }

    @Override // java.lang.Thread
    public final void start() {
        synchronized (this.f480a) {
            super.start();
            try {
                this.f480a.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
