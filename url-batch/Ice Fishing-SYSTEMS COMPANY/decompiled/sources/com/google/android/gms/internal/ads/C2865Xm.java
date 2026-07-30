package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.Xm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2865Xm {

    /* renamed from: a, reason: collision with root package name */
    public boolean f28692a;

    public final synchronized boolean a() {
        if (this.f28692a) {
            return false;
        }
        this.f28692a = true;
        notifyAll();
        return true;
    }

    public final synchronized void b() {
        boolean z8 = false;
        while (!this.f28692a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z8 = true;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j9) {
        if (j9 > 0) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = j9 + elapsedRealtime;
                if (j10 < elapsedRealtime) {
                    b();
                } else {
                    boolean z8 = false;
                    while (!this.f28692a && elapsedRealtime < j10) {
                        try {
                            wait(j10 - elapsedRealtime);
                        } catch (InterruptedException unused) {
                            z8 = true;
                        }
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (z8) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f28692a;
    }
}
