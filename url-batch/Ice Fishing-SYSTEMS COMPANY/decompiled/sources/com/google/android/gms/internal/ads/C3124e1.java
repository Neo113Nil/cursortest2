package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3124e1 implements O0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f30270a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30271b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30272c;

    /* renamed from: d, reason: collision with root package name */
    public int f30273d;

    /* renamed from: e, reason: collision with root package name */
    public int f30274e;

    /* renamed from: f, reason: collision with root package name */
    public PQ f30275f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC3448k1 f30276g;

    public C3124e1(int i, int i4, String str) {
        this.f30270a = i;
        this.f30271b = i4;
        this.f30272c = str;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        PQ pq = (PQ) q02;
        this.f30275f = pq;
        InterfaceC3448k1 x3 = pq.x(1024, 4);
        this.f30276g = x3;
        C4065vP c4065vP = new C4065vP();
        String str = this.f30272c;
        c4065vP.d(str);
        c4065vP.e(str);
        x3.e(new TP(c4065vP));
        this.f30275f.v();
        this.f30275f.w(new C3179f1());
        this.f30274e = 1;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final boolean b(P0 p02) {
        int i = this.f30271b;
        int i4 = this.f30270a;
        PA.T((i4 == -1 || i == -1) ? false : true);
        Lr lr = new Lr(i);
        ((J0) p02).I(lr.f26233a, 0, i, false);
        return lr.L() == i4;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        if (j9 == 0 || this.f30274e == 1) {
            this.f30274e = 1;
            this.f30273d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final int e(P0 p02, S0 s02) {
        int i = this.f30274e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        InterfaceC3448k1 interfaceC3448k1 = this.f30276g;
        interfaceC3448k1.getClass();
        int d2 = interfaceC3448k1.d(p02, 1024, true);
        if (d2 != -1) {
            this.f30273d += d2;
            return 0;
        }
        this.f30274e = 2;
        this.f30276g.b(0L, 1, this.f30273d, 0, null);
        this.f30273d = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
    }
}
