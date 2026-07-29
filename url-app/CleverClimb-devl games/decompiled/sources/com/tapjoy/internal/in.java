package com.tapjoy.internal;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public abstract class in implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final long f8390a = 300;

    public abstract boolean a();

    @Override // java.lang.Runnable
    public void run() {
        long elapsedRealtime = SystemClock.elapsedRealtime() + this.f8390a;
        while (!a() && elapsedRealtime - SystemClock.elapsedRealtime() > 0) {
            try {
                Thread.sleep(0L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
