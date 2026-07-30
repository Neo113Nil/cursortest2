package com.anythink.basead.exoplayer.k;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f8545a;

    public final synchronized boolean a() {
        if (this.f8545a) {
            return false;
        }
        this.f8545a = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean b() {
        boolean z8;
        z8 = this.f8545a;
        this.f8545a = false;
        return z8;
    }

    public final synchronized void c() {
        while (!this.f8545a) {
            wait();
        }
    }

    private synchronized boolean a(long j9) {
        boolean z8;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = j9 + elapsedRealtime;
        while (true) {
            z8 = this.f8545a;
            if (z8 || elapsedRealtime >= j10) {
                break;
            }
            wait(j10 - elapsedRealtime);
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        return z8;
    }
}
