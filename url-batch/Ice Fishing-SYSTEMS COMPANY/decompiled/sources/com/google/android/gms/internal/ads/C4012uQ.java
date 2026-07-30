package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4012uQ implements AQ, InterfaceC4282zQ {

    /* renamed from: n, reason: collision with root package name */
    public final BQ f34592n;

    /* renamed from: u, reason: collision with root package name */
    public final long f34593u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC3985u f34594v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractC3473kQ f34595w;

    /* renamed from: x, reason: collision with root package name */
    public AQ f34596x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC4282zQ f34597y;

    /* renamed from: z, reason: collision with root package name */
    public long f34598z = com.anythink.basead.exoplayer.b.f6539b;

    public C4012uQ(BQ bq, InterfaceC3985u interfaceC3985u, long j9) {
        this.f34592n = bq;
        this.f34594v = interfaceC3985u;
        this.f34593u = j9;
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final long a(long j9, HO ho) {
        AQ aq = this.f34596x;
        String str = AbstractC3548lu.f32613a;
        return aq.a(j9, ho);
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final boolean b(C3633nO c3633nO) {
        AQ aq = this.f34596x;
        return aq != null && aq.b(c3633nO);
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final boolean c() {
        AQ aq = this.f34596x;
        return aq != null && aq.c();
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final long d() {
        AQ aq = this.f34596x;
        String str = AbstractC3548lu.f32613a;
        return aq.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282zQ
    public final /* bridge */ /* synthetic */ void e(WQ wq) {
        InterfaceC4282zQ interfaceC4282zQ = this.f34597y;
        String str = AbstractC3548lu.f32613a;
        interfaceC4282zQ.e(this);
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final void f(long j9) {
        AQ aq = this.f34596x;
        String str = AbstractC3548lu.f32613a;
        aq.f(j9);
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final void g(InterfaceC4282zQ interfaceC4282zQ, long j9) {
        this.f34597y = interfaceC4282zQ;
        AQ aq = this.f34596x;
        if (aq != null) {
            long j10 = this.f34598z;
            if (j10 == com.anythink.basead.exoplayer.b.f6539b) {
                j10 = this.f34593u;
            }
            aq.g(this, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final long h(long j9) {
        AQ aq = this.f34596x;
        String str = AbstractC3548lu.f32613a;
        return aq.h(j9);
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final long i() {
        AQ aq = this.f34596x;
        String str = AbstractC3548lu.f32613a;
        return aq.i();
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final long j(InterfaceC3716p[] interfaceC3716pArr, boolean[] zArr, VQ[] vqArr, boolean[] zArr2, long j9) {
        long j10 = this.f34598z;
        long j11 = (j10 == com.anythink.basead.exoplayer.b.f6539b || j9 != this.f34593u) ? j9 : j10;
        this.f34598z = com.anythink.basead.exoplayer.b.f6539b;
        AQ aq = this.f34596x;
        String str = AbstractC3548lu.f32613a;
        return aq.j(interfaceC3716pArr, zArr, vqArr, zArr2, j11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282zQ
    public final void k(AQ aq) {
        InterfaceC4282zQ interfaceC4282zQ = this.f34597y;
        String str = AbstractC3548lu.f32613a;
        interfaceC4282zQ.k(this);
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final void l(long j9) {
        AQ aq = this.f34596x;
        String str = AbstractC3548lu.f32613a;
        aq.l(j9);
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final void m() {
        AQ aq = this.f34596x;
        if (aq != null) {
            aq.m();
            return;
        }
        AbstractC3473kQ abstractC3473kQ = this.f34595w;
        if (abstractC3473kQ != null) {
            abstractC3473kQ.r();
        }
    }

    public final void n(BQ bq) {
        long j9 = this.f34598z;
        if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
            j9 = this.f34593u;
        }
        AbstractC3473kQ abstractC3473kQ = this.f34595w;
        abstractC3473kQ.getClass();
        AQ c4 = abstractC3473kQ.c(bq, this.f34594v, j9);
        this.f34596x = c4;
        if (this.f34597y != null) {
            c4.g(this, j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final C3041cR p() {
        AQ aq = this.f34596x;
        String str = AbstractC3548lu.f32613a;
        return aq.p();
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final long t() {
        AQ aq = this.f34596x;
        String str = AbstractC3548lu.f32613a;
        return aq.t();
    }
}
