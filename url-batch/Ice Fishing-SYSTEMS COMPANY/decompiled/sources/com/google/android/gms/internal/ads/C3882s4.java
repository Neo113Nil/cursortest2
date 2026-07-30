package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3882s4 implements InterfaceC3291h4 {

    /* renamed from: a, reason: collision with root package name */
    public final Lr f34185a;

    /* renamed from: b, reason: collision with root package name */
    public final C2906a1 f34186b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34187c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34188d;

    /* renamed from: e, reason: collision with root package name */
    public final String f34189e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC3448k1 f34190f;

    /* renamed from: g, reason: collision with root package name */
    public String f34191g;

    /* renamed from: h, reason: collision with root package name */
    public int f34192h = 0;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f34193j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f34194k;

    /* renamed from: l, reason: collision with root package name */
    public long f34195l;

    /* renamed from: m, reason: collision with root package name */
    public int f34196m;

    /* renamed from: n, reason: collision with root package name */
    public long f34197n;

    public C3882s4(String str, int i, String str2) {
        Lr lr = new Lr(4);
        this.f34185a = lr;
        lr.f26233a[0] = -1;
        this.f34186b = new C2906a1();
        this.f34197n = com.anythink.basead.exoplayer.b.f6539b;
        this.f34187c = str;
        this.f34188d = i;
        this.f34189e = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void a() {
        this.f34192h = 0;
        this.i = 0;
        this.f34194k = false;
        this.f34197n = com.anythink.basead.exoplayer.b.f6539b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void b(boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void c(Lr lr) {
        this.f34190f.getClass();
        while (lr.B() > 0) {
            int i = this.f34192h;
            Lr lr2 = this.f34185a;
            if (i == 0) {
                byte[] bArr = lr.f26233a;
                int i4 = lr.f26234b;
                int i9 = lr.f26235c;
                while (true) {
                    if (i4 >= i9) {
                        lr.E(i9);
                        break;
                    }
                    int i10 = i4 + 1;
                    byte b9 = bArr[i4];
                    boolean z8 = (b9 & 255) == 255;
                    boolean z9 = this.f34194k && (b9 & 224) == 224;
                    this.f34194k = z8;
                    if (z9) {
                        lr.E(i10);
                        this.f34194k = false;
                        lr2.f26233a[1] = bArr[i4];
                        this.i = 2;
                        this.f34192h = 1;
                        break;
                    }
                    i4 = i10;
                }
            } else if (i != 1) {
                int min = Math.min(lr.B(), this.f34196m - this.i);
                this.f34190f.a(min, lr);
                int i11 = this.i + min;
                this.i = i11;
                if (i11 >= this.f34196m) {
                    PA.T(this.f34197n != com.anythink.basead.exoplayer.b.f6539b);
                    this.f34190f.b(this.f34197n, 1, this.f34196m, 0, null);
                    this.f34197n += this.f34195l;
                    this.i = 0;
                    this.f34192h = 0;
                }
            } else {
                int min2 = Math.min(lr.B(), 4 - this.i);
                lr.H(lr2.f26233a, this.i, min2);
                int i12 = this.i + min2;
                this.i = i12;
                if (i12 >= 4) {
                    lr2.E(0);
                    int b10 = lr2.b();
                    C2906a1 c2906a1 = this.f34186b;
                    if (c2906a1.a(b10)) {
                        this.f34196m = c2906a1.f29154b;
                        if (!this.f34193j) {
                            this.f34195l = (c2906a1.f29158f * 1000000) / c2906a1.f29155c;
                            C4065vP c4065vP = new C4065vP();
                            c4065vP.f34773a = this.f34191g;
                            c4065vP.d(this.f34189e);
                            c4065vP.e((String) c2906a1.f29159g);
                            c4065vP.f34786o = 4096;
                            c4065vP.f34765F = c2906a1.f29156d;
                            c4065vP.f34767H = c2906a1.f29155c;
                            c4065vP.f34776d = this.f34187c;
                            c4065vP.f34778f = this.f34188d;
                            this.f34190f.e(new TP(c4065vP));
                            this.f34193j = true;
                        }
                        lr2.E(0);
                        this.f34190f.a(4, lr2);
                        this.f34192h = 2;
                    } else {
                        this.i = 0;
                        this.f34192h = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void d(int i, long j9) {
        this.f34197n = j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void e(Q0 q02, D4 d42) {
        d42.a();
        d42.b();
        this.f34191g = d42.f24338e;
        d42.b();
        this.f34190f = q02.x(d42.f24337d, 1);
    }
}
