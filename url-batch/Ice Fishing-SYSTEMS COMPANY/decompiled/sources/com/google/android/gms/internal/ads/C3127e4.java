package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.e4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3127e4 implements InterfaceC3291h4 {

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f30282x = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30283a;

    /* renamed from: d, reason: collision with root package name */
    public final String f30286d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30287e;

    /* renamed from: f, reason: collision with root package name */
    public final String f30288f;

    /* renamed from: g, reason: collision with root package name */
    public String f30289g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC3448k1 f30290h;
    public InterfaceC3448k1 i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f30294m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f30295n;

    /* renamed from: q, reason: collision with root package name */
    public int f30298q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f30299r;

    /* renamed from: t, reason: collision with root package name */
    public int f30301t;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC3448k1 f30303v;

    /* renamed from: w, reason: collision with root package name */
    public long f30304w;

    /* renamed from: b, reason: collision with root package name */
    public final Er f30284b = new Er(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    public final Lr f30285c = new Lr(Arrays.copyOf(f30282x, 10));

    /* renamed from: o, reason: collision with root package name */
    public int f30296o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f30297p = -1;

    /* renamed from: s, reason: collision with root package name */
    public long f30300s = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: u, reason: collision with root package name */
    public long f30302u = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: j, reason: collision with root package name */
    public int f30291j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f30292k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f30293l = 256;

    public C3127e4(String str, int i, String str2, boolean z8) {
        this.f30283a = z8;
        this.f30286d = str;
        this.f30287e = i;
        this.f30288f = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void a() {
        this.f30302u = com.anythink.basead.exoplayer.b.f6539b;
        this.f30295n = false;
        this.f30291j = 0;
        this.f30292k = 0;
        this.f30293l = 256;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void b(boolean z8) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0229, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0314, code lost:
    
        r4 = r3;
        r3 = r2;
        r2 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.google.android.gms.internal.ads.Lr] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Lr lr) {
        boolean z8;
        int i;
        int i4;
        int i9;
        byte b9;
        int i10;
        int i11;
        int i12;
        char c4;
        int i13;
        boolean z9;
        int i14;
        int i15;
        int i16;
        ?? r22 = 0;
        int i17 = -1;
        int i18 = 2;
        ?? r52 = 1;
        this.f30290h.getClass();
        String str = AbstractC3548lu.f32613a;
        while (lr.B() > 0) {
            int i19 = this.f30291j;
            Er er = this.f30284b;
            int i20 = 3;
            int i21 = 4;
            Lr lr2 = this.f30285c;
            if (i19 == 0) {
                int i22 = 7;
                byte[] bArr = lr.f26233a;
                int i23 = lr.f26234b;
                int i24 = lr.f26235c;
                while (true) {
                    if (i23 >= i24) {
                        z8 = r22;
                        i = i17;
                        i4 = i18;
                        boolean z10 = r52 == true ? 1 : 0;
                        lr.E(i23);
                        r52 = r52;
                        break;
                    }
                    i9 = i23 + 1;
                    b9 = bArr[i23];
                    i10 = i20;
                    int i25 = b9 & 255;
                    if (this.f30293l != 512 || (((((byte) i25) & 255) | 65280) & 65526) != 65520) {
                        i = i17;
                        i11 = r52 == true ? 1 : 0;
                    } else {
                        if (this.f30295n) {
                            i = i17;
                            i15 = r52 == true ? 1 : 0;
                            break;
                        }
                        int i26 = i23 - 1;
                        lr.E(i23);
                        byte[] bArr2 = er.f24829a;
                        if (lr.B() < r52) {
                            i11 = r52 == true ? 1 : 0;
                        } else {
                            lr.H(bArr2, r22, r52 == true ? 1 : 0);
                            er.d(i21);
                            int h9 = er.h(r52 == true ? 1 : 0);
                            int i27 = this.f30296o;
                            if (i27 == -1 || h9 == i27) {
                                if (this.f30297p != -1) {
                                    byte[] bArr3 = er.f24829a;
                                    if (lr.B() < r52) {
                                        i15 = r52 == true ? 1 : 0;
                                        break;
                                    }
                                    lr.H(bArr3, r22, r52 == true ? 1 : 0);
                                    er.d(2);
                                    i16 = 4;
                                    int h10 = er.h(4);
                                    i15 = r52 == true ? 1 : 0;
                                    if (h10 == this.f30297p) {
                                        lr.E(i9);
                                    } else {
                                        i11 = i15;
                                    }
                                } else {
                                    i15 = r52 == true ? 1 : 0;
                                    i16 = 4;
                                }
                                byte[] bArr4 = er.f24829a;
                                if (lr.B() < i16) {
                                    break;
                                }
                                lr.H(bArr4, r22, i16);
                                er.d(14);
                                int h11 = er.h(13);
                                if (h11 >= i22) {
                                    byte[] bArr5 = lr.f26233a;
                                    int i28 = lr.f26235c;
                                    int i29 = i26 + h11;
                                    if (i29 >= i28) {
                                        break;
                                    }
                                    byte b10 = bArr5[i29];
                                    i = -1;
                                    if (b10 != -1) {
                                        if (b10 == 73) {
                                            int i30 = i29 + 1;
                                            if (i30 == i28) {
                                                break;
                                            }
                                            if (bArr5[i30] == 68) {
                                                int i31 = i29 + 2;
                                                if (i31 == i28) {
                                                    break;
                                                } else if (bArr5[i31] == 51) {
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        int i32 = i29 + 1;
                                        if (i32 == i28) {
                                            break;
                                        }
                                        byte b11 = bArr5[i32];
                                        if ((((b11 & 255) | 65280) & 65526) == 65520 && ((b11 & 8) >> 3) == h9) {
                                            break;
                                        }
                                    }
                                } else {
                                    i = -1;
                                }
                                i11 = i15;
                            } else {
                                i11 = r52 == true ? 1 : 0;
                                i = -1;
                            }
                        }
                        i = -1;
                    }
                    int i33 = this.f30293l;
                    int i34 = i33 | i25;
                    if (i34 == 329) {
                        i12 = 2;
                        c4 = 256;
                        i13 = 3;
                        z9 = false;
                        i14 = 768;
                    } else if (i34 == 511) {
                        i12 = 2;
                        c4 = 256;
                        i13 = 3;
                        z9 = false;
                        i14 = 512;
                    } else if (i34 == 836) {
                        i12 = 2;
                        c4 = 256;
                        i13 = 3;
                        z9 = false;
                        i14 = 1024;
                    } else {
                        if (i34 == 1075) {
                            i4 = 2;
                            this.f30291j = 2;
                            this.f30292k = 3;
                            z8 = false;
                            this.f30301t = 0;
                            lr2.E(0);
                            lr.E(i9);
                            r52 = i11;
                            break;
                        }
                        c4 = 256;
                        if (i33 != 256) {
                            this.f30293l = 256;
                            i17 = i;
                            r22 = 0;
                            i20 = 3;
                            i21 = 4;
                            i22 = 7;
                            r52 = i11;
                            i18 = 2;
                        } else {
                            i12 = 2;
                            i13 = 3;
                            z9 = false;
                            int i35 = i12;
                            i17 = i;
                            r22 = z9;
                            i20 = i13;
                            r52 = i11;
                            i18 = i35;
                            i23 = i9;
                            i21 = 4;
                            i22 = 7;
                        }
                    }
                    this.f30293l = i14;
                    int i352 = i12;
                    i17 = i;
                    r22 = z9;
                    i20 = i13;
                    r52 = i11;
                    i18 = i352;
                    i23 = i9;
                    i21 = 4;
                    i22 = 7;
                }
                this.f30298q = (b9 & 8) >> 3;
                int i36 = i15;
                this.f30294m = i36 != ((b9 & 1) ^ 1) ? 0 : i36;
                if (this.f30295n) {
                    this.f30291j = i10;
                    this.f30292k = 0;
                } else {
                    this.f30291j = i36;
                    this.f30292k = 0;
                }
                lr.E(i9);
                i17 = i;
                r52 = i36;
                r22 = 0;
                i18 = 2;
            } else if (i19 != r52) {
                if (i19 == i18) {
                    byte[] bArr6 = lr2.f26233a;
                    int min = Math.min(lr.B(), 10 - this.f30292k);
                    lr.H(bArr6, this.f30292k, min);
                    int i37 = this.f30292k + min;
                    this.f30292k = i37;
                    if (i37 == 10) {
                        this.i.a(10, lr2);
                        lr2.E(6);
                        InterfaceC3448k1 interfaceC3448k1 = this.i;
                        int g9 = lr2.g() + 10;
                        this.f30291j = 4;
                        this.f30292k = 10;
                        this.f30303v = interfaceC3448k1;
                        this.f30304w = 0L;
                        this.f30301t = g9;
                    }
                } else if (i19 != 3) {
                    int min2 = Math.min(lr.B(), this.f30301t - this.f30292k);
                    this.f30303v.a(min2, lr);
                    int i38 = this.f30292k + min2;
                    this.f30292k = i38;
                    if (i38 == this.f30301t) {
                        PA.T(this.f30302u != com.anythink.basead.exoplayer.b.f6539b ? r52 == true ? 1 : 0 : r22 == true ? 1 : 0);
                        this.f30303v.b(this.f30302u, 1, this.f30301t, 0, null);
                        this.f30302u += this.f30304w;
                        this.f30291j = r22 == true ? 1 : 0;
                        this.f30292k = r22 == true ? 1 : 0;
                        this.f30293l = 256;
                    }
                } else {
                    int i39 = r52 != this.f30294m ? 5 : 7;
                    byte[] bArr7 = er.f24829a;
                    int min3 = Math.min(lr.B(), i39 - this.f30292k);
                    lr.H(bArr7, this.f30292k, min3);
                    int i40 = this.f30292k + min3;
                    this.f30292k = i40;
                    if (i40 == i39) {
                        er.d(r22 == true ? 1 : 0);
                        if (this.f30299r) {
                            er.f(10);
                        } else {
                            int h12 = er.h(i18) + (r52 == true ? 1 : 0);
                            if (h12 != i18) {
                                StringBuilder sb = new StringBuilder(String.valueOf(h12).length() + 50);
                                sb.append("Detected audio object type: ");
                                sb.append(h12);
                                sb.append(", but assuming AAC LC.");
                                AbstractC3217fl.I("AdtsReader", sb.toString());
                            }
                            er.f(5);
                            int h13 = er.h(3);
                            int i41 = this.f30297p;
                            byte b12 = (byte) (((i41 >> 1) & 7) | 16);
                            byte b13 = (byte) (((h13 << 3) & 120) | ((i41 << 7) & 128));
                            byte[] bArr8 = new byte[i18];
                            bArr8[r22 == true ? 1 : 0] = b12;
                            bArr8[r52 == true ? 1 : 0] = b13;
                            C4202y0 m8 = AbstractC2720Pd.m(new Er(bArr8, i18), r22);
                            C4065vP c4065vP = new C4065vP();
                            c4065vP.f34773a = this.f30289g;
                            c4065vP.d(this.f30288f);
                            c4065vP.e(com.anythink.basead.exoplayer.k.o.f8617r);
                            c4065vP.f34781j = m8.f35296a;
                            c4065vP.f34765F = m8.f35298c;
                            c4065vP.f34767H = m8.f35297b;
                            c4065vP.f34788q = Collections.singletonList(bArr8);
                            c4065vP.f34776d = this.f30286d;
                            c4065vP.f34778f = this.f30287e;
                            TP tp = new TP(c4065vP);
                            this.f30300s = 1024000000 / tp.f27756I;
                            this.f30290h.e(tp);
                            this.f30299r = r52;
                        }
                        er.f(4);
                        int h14 = er.h(13);
                        int i42 = h14 - 7;
                        if (this.f30294m) {
                            i42 = h14 - 9;
                        }
                        InterfaceC3448k1 interfaceC3448k12 = this.f30290h;
                        long j9 = this.f30300s;
                        this.f30291j = 4;
                        this.f30292k = r22 == true ? 1 : 0;
                        this.f30303v = interfaceC3448k12;
                        this.f30304w = j9;
                        this.f30301t = i42;
                    }
                }
            } else if (lr.B() != 0) {
                er.f24829a[r22 == true ? 1 : 0] = lr.f26233a[lr.f26234b];
                er.d(i18);
                int h15 = er.h(4);
                int i43 = this.f30297p;
                if (i43 == i17 || h15 == i43) {
                    if (!this.f30295n) {
                        this.f30295n = r52;
                        this.f30296o = this.f30298q;
                        this.f30297p = h15;
                    }
                    this.f30291j = 3;
                    this.f30292k = r22 == true ? 1 : 0;
                } else {
                    this.f30295n = r22;
                    this.f30291j = r22 == true ? 1 : 0;
                    this.f30292k = r22 == true ? 1 : 0;
                    this.f30293l = 256;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void d(int i, long j9) {
        this.f30302u = j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void e(Q0 q02, D4 d42) {
        d42.a();
        d42.b();
        this.f30289g = d42.f24338e;
        d42.b();
        InterfaceC3448k1 x3 = q02.x(d42.f24337d, 1);
        this.f30290h = x3;
        this.f30303v = x3;
        if (!this.f30283a) {
            this.i = new M0();
            return;
        }
        d42.a();
        d42.b();
        InterfaceC3448k1 x9 = q02.x(d42.f24337d, 5);
        this.i = x9;
        C4065vP c4065vP = new C4065vP();
        d42.b();
        c4065vP.f34773a = d42.f24338e;
        c4065vP.d(this.f30288f);
        c4065vP.e(com.anythink.basead.exoplayer.k.o.f8597V);
        x9.e(new TP(c4065vP));
    }
}
