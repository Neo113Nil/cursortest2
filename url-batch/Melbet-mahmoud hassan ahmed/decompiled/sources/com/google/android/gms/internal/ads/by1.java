package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class by1 extends i90 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f3623f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f3624g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ long f3625h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ bp0 f3626i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ cy1 f3627j;

    by1(cy1 cy1Var, Object obj, String str, long j7, bp0 bp0Var) {
        this.f3627j = cy1Var;
        this.f3623f = obj;
        this.f3624g = str;
        this.f3625h = j7;
        this.f3626i = bp0Var;
    }

    @Override // com.google.android.gms.internal.ads.j90
    public final void d() {
        gw1 gw1Var;
        th1 th1Var;
        synchronized (this.f3623f) {
            this.f3627j.u(this.f3624g, true, "", (int) (y2.t.a().a() - this.f3625h));
            gw1Var = this.f3627j.f3993l;
            gw1Var.c(this.f3624g);
            th1Var = this.f3627j.f3996o;
            th1Var.j0(this.f3624g);
            this.f3626i.e(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.j90
    public final void u(String str) {
        gw1 gw1Var;
        th1 th1Var;
        synchronized (this.f3623f) {
            this.f3627j.u(this.f3624g, false, str, (int) (y2.t.a().a() - this.f3625h));
            gw1Var = this.f3627j.f3993l;
            gw1Var.a(this.f3624g, "error");
            th1Var = this.f3627j.f3996o;
            th1Var.z(this.f3624g, "error");
            this.f3626i.e(Boolean.FALSE);
        }
    }
}
