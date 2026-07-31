package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ru1 implements td1, lc1, ya1, qb1, yu, hg1 {

    /* renamed from: f, reason: collision with root package name */
    private final ar f11420f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f11421g = false;

    public ru1(ar arVar, kp2 kp2Var) {
        this.f11420f = arVar;
        arVar.c(2);
        if (kp2Var != null) {
            arVar.c(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.hg1
    public final void C(final ur urVar) {
        this.f11420f.b(new zq() { // from class: com.google.android.gms.internal.ads.pu1
            @Override // com.google.android.gms.internal.ads.zq
            public final void a(ps psVar) {
                psVar.w(ur.this);
            }
        });
        this.f11420f.c(1104);
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final synchronized void M() {
        if (this.f11421g) {
            this.f11420f.c(8);
        } else {
            this.f11420f.c(7);
            this.f11421g = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.hg1
    public final void a() {
        this.f11420f.c(1109);
    }

    @Override // com.google.android.gms.internal.ads.hg1
    public final void b0(boolean z6) {
        this.f11420f.c(true != z6 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.ya1
    public final void d(cv cvVar) {
        ar arVar;
        int i7;
        switch (cvVar.f3954f) {
            case 1:
                arVar = this.f11420f;
                i7 = 101;
                break;
            case 2:
                arVar = this.f11420f;
                i7 = 102;
                break;
            case 3:
                arVar = this.f11420f;
                i7 = 5;
                break;
            case 4:
                arVar = this.f11420f;
                i7 = 103;
                break;
            case 5:
                arVar = this.f11420f;
                i7 = 104;
                break;
            case 6:
                arVar = this.f11420f;
                i7 = 105;
                break;
            case c4.w0.f2149o /* 7 */:
                arVar = this.f11420f;
                i7 = 106;
                break;
            default:
                arVar = this.f11420f;
                i7 = 4;
                break;
        }
        arVar.c(i7);
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final synchronized void k() {
        this.f11420f.c(6);
    }

    @Override // com.google.android.gms.internal.ads.hg1
    public final void k0(boolean z6) {
        this.f11420f.c(true != z6 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.lc1
    public final void m() {
        this.f11420f.c(3);
    }

    @Override // com.google.android.gms.internal.ads.td1
    public final void p0(vi0 vi0Var) {
    }

    @Override // com.google.android.gms.internal.ads.td1
    public final void q(final ds2 ds2Var) {
        this.f11420f.b(new zq() { // from class: com.google.android.gms.internal.ads.qu1
            @Override // com.google.android.gms.internal.ads.zq
            public final void a(ps psVar) {
                ds2 ds2Var2 = ds2.this;
                kr y6 = psVar.r().y();
                cs y7 = psVar.r().H().y();
                y7.r(ds2Var2.f4313b.f3934b.f12947b);
                y6.s(y7);
                psVar.v(y6);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.hg1
    public final void y(final ur urVar) {
        this.f11420f.b(new zq() { // from class: com.google.android.gms.internal.ads.ou1
            @Override // com.google.android.gms.internal.ads.zq
            public final void a(ps psVar) {
                psVar.w(ur.this);
            }
        });
        this.f11420f.c(1102);
    }

    @Override // com.google.android.gms.internal.ads.hg1
    public final void y0(final ur urVar) {
        this.f11420f.b(new zq() { // from class: com.google.android.gms.internal.ads.nu1
            @Override // com.google.android.gms.internal.ads.zq
            public final void a(ps psVar) {
                psVar.w(ur.this);
            }
        });
        this.f11420f.c(1103);
    }
}
