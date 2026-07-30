package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3717p0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33247n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3932t0 f33248u;

    public /* synthetic */ RunnableC3717p0(int i, long j9, C3932t0 c3932t0) {
        this.f33247n = 1;
        this.f33248u = c3932t0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3932t0 c3932t0 = this.f33248u;
        int i = this.f33247n;
        c3932t0.getClass();
        switch (i) {
            case 0:
                String str = AbstractC3548lu.f32613a;
                OO oo = c3932t0.f34333b.f28243n.f30021L;
                oo.s(oo.z(), 1016, new C3307hK((byte) 0, 26));
                break;
            case 1:
                String str2 = AbstractC3548lu.f32613a;
                OO oo2 = c3932t0.f34333b.f28243n.f30021L;
                oo2.s(oo2.y((BQ) oo2.f26694d.f27123x), 1021, new C3307hK((byte) 0, 29));
                break;
            case 2:
                String str3 = AbstractC3548lu.f32613a;
                OO oo3 = c3932t0.f34333b.f28243n.f30021L;
                oo3.s(oo3.z(), 1019, new C3307hK((byte) 0, 27));
                break;
            case 3:
                String str4 = AbstractC3548lu.f32613a;
                OO oo4 = c3932t0.f34333b.f28243n.f30021L;
                oo4.s(oo4.z(), 1030, new MO(0));
                break;
            default:
                String str5 = AbstractC3548lu.f32613a;
                OO oo5 = c3932t0.f34333b.f28243n.f30021L;
                oo5.s(oo5.z(), 1015, new C3307hK((byte) 0, 25));
                break;
        }
    }

    public /* synthetic */ RunnableC3717p0(C3932t0 c3932t0, Object obj, int i) {
        this.f33247n = i;
        this.f33248u = c3932t0;
    }

    public /* synthetic */ RunnableC3717p0(C3932t0 c3932t0, String str, long j9, long j10) {
        this.f33247n = 0;
        this.f33248u = c3932t0;
    }
}
