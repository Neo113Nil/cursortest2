package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.v4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4044v4 implements E4 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3291h4 f34701a;

    /* renamed from: b, reason: collision with root package name */
    public final Er f34702b = new Er(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    public int f34703c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f34704d;

    /* renamed from: e, reason: collision with root package name */
    public It f34705e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f34706f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f34707g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f34708h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f34709j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f34710k;

    public C4044v4(InterfaceC3291h4 interfaceC3291h4) {
        this.f34701a = interfaceC3291h4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.Er] */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    /* JADX WARN: Type inference failed for: r5v26 */
    @Override // com.google.android.gms.internal.ads.E4
    public final void a(int i, Lr lr) {
        int i4;
        int i9;
        int i10;
        int i11;
        long j9;
        long j10;
        this.f34705e.getClass();
        int i12 = i & 1;
        InterfaceC3291h4 interfaceC3291h4 = this.f34701a;
        int i13 = 1;
        boolean z8 = false;
        int i14 = -1;
        int i15 = 2;
        if (i12 != 0) {
            int i16 = this.f34703c;
            if (i16 != 0 && i16 != 1) {
                if (i16 != 2) {
                    int i17 = this.f34709j;
                    if (i17 != -1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i17).length() + 48);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i17);
                        sb.append(" more bytes");
                        AbstractC3217fl.I("PesReader", sb.toString());
                    }
                    interfaceC3291h4.b(lr.f26235c == 0);
                } else {
                    AbstractC3217fl.I("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f34703c = 1;
            this.f34704d = 0;
        }
        int i18 = i;
        while (lr.B() > 0) {
            int i19 = this.f34703c;
            if (i19 != 0) {
                ?? r10 = this.f34702b;
                if (i19 != i13) {
                    if (i19 != i15) {
                        int B8 = lr.B();
                        int i20 = this.f34709j;
                        int i21 = i20 == i14 ? z8 ? 1 : 0 : B8 - i20;
                        if (i21 > 0) {
                            B8 -= i21;
                            lr.C(lr.f26234b + B8);
                        }
                        interfaceC3291h4.c(lr);
                        int i22 = this.f34709j;
                        if (i22 != i14) {
                            int i23 = i22 - B8;
                            this.f34709j = i23;
                            if (i23 == 0) {
                                interfaceC3291h4.b(z8);
                                this.f34703c = i13;
                                this.f34704d = z8 ? 1 : 0;
                            }
                        }
                    } else {
                        if (b(lr, r10.f24829a, Math.min(10, this.i)) && b(lr, null, this.i)) {
                            r10.d(z8 ? 1 : 0);
                            if (this.f34706f) {
                                r10.f(4);
                                long h9 = r10.h(3);
                                r10.f(i13);
                                int h10 = r10.h(15) << 15;
                                r10.f(i13);
                                long h11 = r10.h(15);
                                r10.f(i13);
                                if (this.f34708h || !this.f34707g) {
                                    j10 = h9;
                                } else {
                                    r10.f(4);
                                    j10 = h9;
                                    r10.f(i13);
                                    int h12 = r10.h(15) << 15;
                                    r10.f(i13);
                                    long h13 = r10.h(15);
                                    r10.f(i13);
                                    this.f34705e.c((r10.h(3) << 30) | h12 | h13);
                                    this.f34708h = true;
                                }
                                j9 = this.f34705e.c((j10 << 30) | h10 | h11);
                            } else {
                                j9 = com.anythink.basead.exoplayer.b.f6539b;
                            }
                            i18 |= true != this.f34710k ? 0 : 4;
                            interfaceC3291h4.d(i18, j9);
                            this.f34703c = 3;
                            this.f34704d = 0;
                            z8 = false;
                            i13 = 1;
                            i14 = -1;
                            i15 = 2;
                        }
                    }
                    i4 = i13;
                    i9 = i14;
                    i10 = i15;
                } else {
                    ?? r42 = z8 ? 1 : 0;
                    if (b(lr, r10.f24829a, 9)) {
                        r10.d(r42);
                        int h14 = r10.h(24);
                        i4 = 1;
                        if (h14 != 1) {
                            com.anythink.basead.b.c.i.s(h14, "Unexpected start code prefix: ", "PesReader", new StringBuilder(String.valueOf(h14).length() + 30));
                            i9 = -1;
                            this.f34709j = -1;
                            i11 = 0;
                            i10 = 2;
                        } else {
                            r10.f(8);
                            int h15 = r10.h(16);
                            r10.f(5);
                            this.f34710k = r10.g();
                            i10 = 2;
                            r10.f(2);
                            this.f34706f = r10.g();
                            this.f34707g = r10.g();
                            r10.f(6);
                            int h16 = r10.h(8);
                            this.i = h16;
                            if (h15 == 0) {
                                this.f34709j = -1;
                                i11 = 2;
                                i9 = -1;
                            } else {
                                int i24 = (h15 - 3) - h16;
                                this.f34709j = i24;
                                if (i24 < 0) {
                                    com.anythink.basead.b.c.i.s(i24, "Found negative packet payload size: ", "PesReader", new StringBuilder(String.valueOf(i24).length() + 36));
                                    i9 = -1;
                                    this.f34709j = -1;
                                } else {
                                    i9 = -1;
                                }
                                i11 = 2;
                            }
                        }
                        this.f34703c = i11;
                        z8 = false;
                        this.f34704d = 0;
                    } else {
                        z8 = r42;
                        i9 = -1;
                        i10 = 2;
                        i4 = 1;
                    }
                }
            } else {
                i4 = i13;
                i9 = i14;
                i10 = i15;
                lr.G(lr.B());
            }
            i15 = i10;
            i14 = i9;
            i13 = i4;
        }
    }

    public final boolean b(Lr lr, byte[] bArr, int i) {
        int min = Math.min(lr.B(), i - this.f34704d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            lr.G(min);
        } else {
            lr.H(bArr, this.f34704d, min);
        }
        int i4 = this.f34704d + min;
        this.f34704d = i4;
        return i4 == i;
    }

    @Override // com.google.android.gms.internal.ads.E4
    public final void c(It it, Q0 q02, D4 d42) {
        this.f34705e = it;
        this.f34701a.e(q02, d42);
    }

    @Override // com.google.android.gms.internal.ads.E4
    public final void d() {
        this.f34703c = 0;
        this.f34704d = 0;
        this.f34708h = false;
        this.f34701a.a();
    }
}
