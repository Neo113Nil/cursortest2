package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class JO implements InterfaceC3687oO {

    /* renamed from: n, reason: collision with root package name */
    public boolean f25764n;

    /* renamed from: u, reason: collision with root package name */
    public long f25765u;

    /* renamed from: v, reason: collision with root package name */
    public long f25766v;

    /* renamed from: w, reason: collision with root package name */
    public C4045v5 f25767w;

    public final void a(long j9) {
        this.f25765u = j9;
        if (this.f25764n) {
            this.f25766v = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687oO
    public final void b(C4045v5 c4045v5) {
        if (this.f25764n) {
            a(e());
        }
        this.f25767w = c4045v5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687oO
    public final long e() {
        long j9 = this.f25765u;
        if (!this.f25764n) {
            return j9;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f25766v;
        return this.f25767w.f34712a == 1.0f ? AbstractC3548lu.u(elapsedRealtime) + j9 : (elapsedRealtime * r4.f34714c) + j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687oO
    public final C4045v5 h() {
        return this.f25767w;
    }
}
