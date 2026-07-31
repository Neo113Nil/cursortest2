package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class hy3 implements ex3 {

    /* renamed from: f, reason: collision with root package name */
    private final xv1 f6460f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6461g;

    /* renamed from: h, reason: collision with root package name */
    private long f6462h;

    /* renamed from: i, reason: collision with root package name */
    private long f6463i;

    /* renamed from: j, reason: collision with root package name */
    private e30 f6464j = e30.f4477d;

    public hy3(xv1 xv1Var) {
        this.f6460f = xv1Var;
    }

    public final void a(long j7) {
        this.f6462h = j7;
        if (this.f6461g) {
            this.f6463i = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (this.f6461g) {
            return;
        }
        this.f6463i = SystemClock.elapsedRealtime();
        this.f6461g = true;
    }

    @Override // com.google.android.gms.internal.ads.ex3
    public final e30 c() {
        return this.f6464j;
    }

    @Override // com.google.android.gms.internal.ads.ex3
    public final void c0(e30 e30Var) {
        if (this.f6461g) {
            a(zza());
        }
        this.f6464j = e30Var;
    }

    public final void d() {
        if (this.f6461g) {
            a(zza());
            this.f6461g = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.ex3
    public final long zza() {
        long j7 = this.f6462h;
        if (!this.f6461g) {
            return j7;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f6463i;
        e30 e30Var = this.f6464j;
        return j7 + (e30Var.f4479a == 1.0f ? nz3.c(elapsedRealtime) : e30Var.a(elapsedRealtime));
    }
}
