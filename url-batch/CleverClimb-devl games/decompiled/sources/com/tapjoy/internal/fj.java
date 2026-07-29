package com.tapjoy.internal;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class fj {

    /* renamed from: a, reason: collision with root package name */
    public static final fj f8095a = new fj(-1);

    /* renamed from: b, reason: collision with root package name */
    public final long f8096b;

    /* renamed from: c, reason: collision with root package name */
    public long f8097c;

    public fj(long j) {
        this.f8096b = j;
        this.f8097c = SystemClock.elapsedRealtime();
    }

    public fj() {
        this.f8096b = 3600000L;
        try {
            this.f8097c = SystemClock.elapsedRealtime() - 3600000;
        } catch (NullPointerException unused) {
            this.f8097c = -1L;
        }
    }

    public final boolean a() {
        try {
            return SystemClock.elapsedRealtime() - this.f8097c > this.f8096b;
        } catch (NullPointerException unused) {
            return true;
        }
    }

    public final boolean a(long j) {
        try {
            return (SystemClock.elapsedRealtime() - this.f8097c) + j > this.f8096b;
        } catch (NullPointerException unused) {
            return true;
        }
    }
}
