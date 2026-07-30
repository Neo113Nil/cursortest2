package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class IO extends AbstractC2982bM {

    /* renamed from: v, reason: collision with root package name */
    public final C3093dO f25556v;

    /* renamed from: w, reason: collision with root package name */
    public final C2865Xm f25557w;

    public IO(SN sn) {
        super(5);
        C2865Xm c2865Xm = new C2865Xm();
        this.f25557w = c2865Xm;
        try {
            this.f25556v = new C3093dO(sn, this);
            c2865Xm.a();
        } catch (Throwable th) {
            this.f25557w.a();
            throw th;
        }
    }

    public final boolean A1() {
        this.f25557w.b();
        return this.f25556v.T1();
    }

    public final int B1() {
        this.f25557w.b();
        return this.f25556v.U1();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final void T(int i, long j9) {
        this.f25557w.b();
        this.f25556v.T(i, j9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final void k() {
        this.f25557w.b();
        this.f25556v.P0();
    }

    public final int m() {
        this.f25557w.b();
        return this.f25556v.m();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final int m1() {
        this.f25557w.b();
        return this.f25556v.m1();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final int n1() {
        this.f25557w.b();
        return this.f25556v.n1();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final boolean p1() {
        this.f25557w.b();
        return this.f25556v.p1();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final void q1() {
        this.f25557w.b();
        this.f25556v.P0();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final AbstractC3832r8 r1() {
        this.f25557w.b();
        return this.f25556v.r1();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2982bM
    public final int t1() {
        this.f25557w.b();
        return this.f25556v.t1();
    }

    public final C4176xb v1() {
        this.f25557w.b();
        C3093dO c3093dO = this.f25556v;
        c3093dO.P0();
        return (C4176xb) c3093dO.f30014G0.i.f34152w;
    }

    public final long w1() {
        this.f25557w.b();
        return this.f25556v.P1();
    }

    public final long x1() {
        this.f25557w.b();
        return this.f25556v.Q1();
    }

    public final long z1() {
        this.f25557w.b();
        return this.f25556v.R1();
    }
}
