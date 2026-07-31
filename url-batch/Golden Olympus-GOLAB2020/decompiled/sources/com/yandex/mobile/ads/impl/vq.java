package com.yandex.mobile.ads.impl;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class vq {

    /* renamed from: a, reason: collision with root package name */
    private boolean f33722a;

    public vq() {
        this(0);
    }

    public final synchronized void a() {
        while (!this.f33722a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z4 = false;
        while (!this.f33722a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z4 = true;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized void c() {
        this.f33722a = false;
    }

    public final synchronized boolean d() {
        return this.f33722a;
    }

    public final synchronized boolean e() {
        if (this.f33722a) {
            return false;
        }
        this.f33722a = true;
        notifyAll();
        return true;
    }

    public vq(int i4) {
    }

    public final synchronized boolean a(long j4) {
        if (j4 <= 0) {
            return this.f33722a;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = j4 + elapsedRealtime;
        if (j5 < elapsedRealtime) {
            a();
        } else {
            while (!this.f33722a && elapsedRealtime < j5) {
                wait(j5 - elapsedRealtime);
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
        }
        return this.f33722a;
    }
}
