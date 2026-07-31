package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xk0 extends ik0 {

    /* renamed from: f, reason: collision with root package name */
    private r2.m f14231f;

    /* renamed from: g, reason: collision with root package name */
    private r2.s f14232g;

    @Override // com.google.android.gms.internal.ads.jk0
    public final void G2(cv cvVar) {
        r2.m mVar = this.f14231f;
        if (mVar != null) {
            mVar.c(cvVar.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final void I2(ck0 ck0Var) {
        r2.s sVar = this.f14232g;
        if (sVar != null) {
            sVar.b(new qk0(ck0Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final void O(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final void b() {
        r2.m mVar = this.f14231f;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final void d() {
        r2.m mVar = this.f14231f;
        if (mVar != null) {
            mVar.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final void e() {
        r2.m mVar = this.f14231f;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final void i() {
        r2.m mVar = this.f14231f;
        if (mVar != null) {
            mVar.e();
        }
    }

    public final void s6(r2.m mVar) {
        this.f14231f = mVar;
    }

    public final void t6(r2.s sVar) {
        this.f14232g = sVar;
    }
}
