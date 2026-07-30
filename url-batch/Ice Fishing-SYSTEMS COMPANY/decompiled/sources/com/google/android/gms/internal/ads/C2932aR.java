package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2932aR implements AQ, InterfaceC4282zQ {

    /* renamed from: n, reason: collision with root package name */
    public final AQ f29207n;

    /* renamed from: u, reason: collision with root package name */
    public final long f29208u;

    /* renamed from: v, reason: collision with root package name */
    public Object f29209v;

    public C2932aR(AQ aq, long j9) {
        this.f29207n = aq;
        this.f29208u = j9;
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final long a(long j9, HO ho) {
        AQ aq = this.f29207n;
        long j10 = this.f29208u;
        return aq.a(j9 - j10, ho) + j10;
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final boolean b(C3633nO c3633nO) {
        C3579mO c3579mO = new C3579mO();
        c3579mO.f32692b = c3633nO.f32860b;
        c3579mO.f32693c = c3633nO.f32861c;
        c3579mO.f32691a = c3633nO.f32859a - this.f29208u;
        return this.f29207n.b(new C3633nO(c3579mO));
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final boolean c() {
        return this.f29207n.c();
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final long d() {
        long d2 = this.f29207n.d();
        if (d2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d2 + this.f29208u;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.zQ, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.InterfaceC4282zQ
    public final /* bridge */ /* synthetic */ void e(WQ wq) {
        ?? r12 = this.f29209v;
        r12.getClass();
        r12.e(this);
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final void f(long j9) {
        this.f29207n.f(j9 - this.f29208u);
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final void g(InterfaceC4282zQ interfaceC4282zQ, long j9) {
        this.f29209v = interfaceC4282zQ;
        this.f29207n.g(this, j9 - this.f29208u);
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final long h(long j9) {
        AQ aq = this.f29207n;
        long j10 = this.f29208u;
        return aq.h(j9 - j10) + j10;
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final long i() {
        long i = this.f29207n.i();
        if (i == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return i + this.f29208u;
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final long j(InterfaceC3716p[] interfaceC3716pArr, boolean[] zArr, VQ[] vqArr, boolean[] zArr2, long j9) {
        VQ[] vqArr2 = new VQ[vqArr.length];
        int i = 0;
        while (true) {
            VQ vq = null;
            if (i >= vqArr.length) {
                break;
            }
            ZQ zq = (ZQ) vqArr[i];
            if (zq != null) {
                vq = zq.f28987a;
            }
            vqArr2[i] = vq;
            i++;
        }
        long j10 = this.f29208u;
        long j11 = this.f29207n.j(interfaceC3716pArr, zArr, vqArr2, zArr2, j9 - j10);
        for (int i4 = 0; i4 < vqArr.length; i4++) {
            VQ vq2 = vqArr2[i4];
            if (vq2 == null) {
                vqArr[i4] = null;
            } else {
                VQ vq3 = vqArr[i4];
                if (vq3 == null || ((ZQ) vq3).f28987a != vq2) {
                    vqArr[i4] = new ZQ(vq2, j10);
                }
            }
        }
        return j11 + j10;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zQ, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.InterfaceC4282zQ
    public final void k(AQ aq) {
        ?? r12 = this.f29209v;
        r12.getClass();
        r12.k(this);
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final void l(long j9) {
        this.f29207n.l(j9 - this.f29208u);
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final void m() {
        this.f29207n.m();
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final C3041cR p() {
        return this.f29207n.p();
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final long t() {
        long t9 = this.f29207n.t();
        return t9 == com.anythink.basead.exoplayer.b.f6539b ? com.anythink.basead.exoplayer.b.f6539b : t9 + this.f29208u;
    }
}
