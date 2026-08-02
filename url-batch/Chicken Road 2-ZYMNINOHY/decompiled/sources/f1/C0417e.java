package f1;

import E.AbstractC0005f;
import E1.C0036l;
import T.C0096n;
import T.C0097o;
import W.AbstractC0108a;
import W.J;
import a.AbstractC0124a;
import java.util.Arrays;
import java.util.Collections;
import y0.AbstractC1569a;

/* renamed from: f1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417e implements h {

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f8560x = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8561a;

    /* renamed from: d, reason: collision with root package name */
    public final String f8564d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8565e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8566f;

    /* renamed from: g, reason: collision with root package name */
    public String f8567g;

    /* renamed from: h, reason: collision with root package name */
    public y0.F f8568h;

    /* renamed from: i, reason: collision with root package name */
    public y0.F f8569i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8573m;
    public boolean n;

    /* renamed from: q, reason: collision with root package name */
    public int f8575q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8576r;

    /* renamed from: t, reason: collision with root package name */
    public int f8578t;
    public y0.F v;

    /* renamed from: w, reason: collision with root package name */
    public long f8580w;

    /* renamed from: b, reason: collision with root package name */
    public final W.t f8562b = new W.t(7, new byte[7]);

    /* renamed from: c, reason: collision with root package name */
    public final W.u f8563c = new W.u(Arrays.copyOf(f8560x, 10));
    public int o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f8574p = -1;

    /* renamed from: s, reason: collision with root package name */
    public long f8577s = -9223372036854775807L;

    /* renamed from: u, reason: collision with root package name */
    public long f8579u = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public int f8570j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f8571k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f8572l = 256;

    public C0417e(int i4, String str, String str2, boolean z) {
        this.f8561a = z;
        this.f8564d = str;
        this.f8565e = i4;
        this.f8566f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    @Override // f1.h
    public final void a(W.u uVar) {
        int i4;
        int i5;
        byte b4;
        char c4;
        ?? r4;
        int i6;
        char c5;
        int i7;
        char c6;
        int i8;
        this.f8568h.getClass();
        String str = J.f3263a;
        while (uVar.a() > 0) {
            int i9 = this.f8570j;
            char c7 = 65535;
            W.u uVar2 = this.f8563c;
            int i10 = 3;
            W.t tVar = this.f8562b;
            int i11 = 0;
            int i12 = 4;
            int i13 = 1;
            if (i9 == 0) {
                byte[] bArr = uVar.f3351a;
                int i14 = uVar.f3352b;
                int i15 = uVar.f3353c;
                while (true) {
                    if (i14 >= i15) {
                        uVar.M(i14);
                        break;
                    }
                    i4 = i14 + 1;
                    i5 = i10;
                    b4 = bArr[i14];
                    int i16 = b4 & 255;
                    if (this.f8572l != 512 || (((65280 | ((((byte) i16) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) != 65520) {
                        c4 = c7;
                        r4 = i13;
                    } else {
                        if (this.n) {
                            break;
                        }
                        int i17 = i14 - 1;
                        uVar.M(i14);
                        byte[] bArr2 = tVar.f3345d;
                        if (uVar.a() >= i13) {
                            uVar.k(bArr2, i11, i13);
                            tVar.q(i12);
                            int i18 = tVar.i(i13);
                            int i19 = this.o;
                            if (i19 == -1 || i18 == i19) {
                                if (this.f8574p != -1) {
                                    byte[] bArr3 = tVar.f3345d;
                                    if (uVar.a() < i13) {
                                        break;
                                    }
                                    uVar.k(bArr3, i11, i13);
                                    tVar.q(2);
                                    i8 = 4;
                                    if (tVar.i(4) == this.f8574p) {
                                        uVar.M(i4);
                                    }
                                } else {
                                    i8 = 4;
                                }
                                byte[] bArr4 = tVar.f3345d;
                                if (uVar.a() >= i8) {
                                    uVar.k(bArr4, i11, i8);
                                    tVar.q(14);
                                    int i20 = tVar.i(13);
                                    if (i20 >= 7) {
                                        byte[] bArr5 = uVar.f3351a;
                                        int i21 = uVar.f3353c;
                                        int i22 = i17 + i20;
                                        if (i22 < i21) {
                                            byte b5 = bArr5[i22];
                                            c4 = 65535;
                                            if (b5 != -1) {
                                                if (b5 == 73) {
                                                    int i23 = i22 + 1;
                                                    if (i23 != i21) {
                                                        if (bArr5[i23] == 68) {
                                                            int i24 = i22 + 2;
                                                            if (i24 != i21) {
                                                                if (bArr5[i24] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                int i25 = i22 + 1;
                                                if (i25 != i21) {
                                                    byte b6 = bArr5[i25];
                                                    if ((((65280 | ((b6 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b6 & 8) >> 3) == i18) {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                c4 = 65535;
                            }
                            r4 = true;
                        }
                        c4 = 65535;
                        r4 = true;
                    }
                    int i26 = this.f8572l;
                    int i27 = i16 | i26;
                    if (i27 == 329) {
                        i6 = 3;
                        c5 = 256;
                        i7 = 0;
                        c6 = 2;
                        this.f8572l = 768;
                    } else if (i27 == 511) {
                        i6 = 3;
                        c5 = 256;
                        i7 = 0;
                        c6 = 2;
                        this.f8572l = 512;
                    } else if (i27 == 836) {
                        i6 = 3;
                        c5 = 256;
                        i7 = 0;
                        c6 = 2;
                        this.f8572l = 1024;
                    } else {
                        if (i27 == 1075) {
                            this.f8570j = 2;
                            this.f8571k = 3;
                            this.f8578t = 0;
                            uVar2.M(0);
                            uVar.M(i4);
                            break;
                        }
                        c5 = 256;
                        if (i26 != 256) {
                            this.f8572l = 256;
                            i6 = 3;
                            i7 = 0;
                            c6 = 2;
                            i13 = r4;
                            c7 = c4;
                            i12 = 4;
                            i11 = i7;
                            i10 = i6;
                        } else {
                            i6 = 3;
                            i7 = 0;
                            c6 = 2;
                        }
                    }
                    i14 = i4;
                    i13 = r4;
                    c7 = c4;
                    i12 = 4;
                    i11 = i7;
                    i10 = i6;
                }
                this.f8575q = (b4 & 8) >> 3;
                this.f8573m = (b4 & 1) == 0;
                if (this.n) {
                    this.f8570j = i5;
                    this.f8571k = 0;
                } else {
                    this.f8570j = 1;
                    this.f8571k = 0;
                }
                uVar.M(i4);
            } else if (i9 != 1) {
                if (i9 == 2) {
                    byte[] bArr6 = uVar2.f3351a;
                    int min = Math.min(uVar.a(), 10 - this.f8571k);
                    uVar.k(bArr6, this.f8571k, min);
                    int i28 = this.f8571k + min;
                    this.f8571k = i28;
                    if (i28 == 10) {
                        this.f8569i.a(10, uVar2);
                        uVar2.M(6);
                        y0.F f4 = this.f8569i;
                        int y4 = uVar2.y() + 10;
                        this.f8570j = 4;
                        this.f8571k = 10;
                        this.v = f4;
                        this.f8580w = 0L;
                        this.f8578t = y4;
                    }
                } else if (i9 == 3) {
                    int i29 = this.f8573m ? 7 : 5;
                    byte[] bArr7 = tVar.f3345d;
                    int min2 = Math.min(uVar.a(), i29 - this.f8571k);
                    uVar.k(bArr7, this.f8571k, min2);
                    int i30 = this.f8571k + min2;
                    this.f8571k = i30;
                    if (i30 == i29) {
                        tVar.q(0);
                        if (this.f8576r) {
                            tVar.t(10);
                        } else {
                            int i31 = tVar.i(2) + 1;
                            if (i31 != 2) {
                                AbstractC0108a.s("AdtsReader", "Detected audio object type: " + i31 + ", but assuming AAC LC.");
                                i31 = 2;
                            }
                            tVar.t(5);
                            byte[] b7 = AbstractC1569a.b(i31, this.f8574p, tVar.i(3));
                            C0036l s4 = AbstractC1569a.s(new W.t(2, b7), false);
                            C0096n c0096n = new C0096n();
                            c0096n.f2819a = this.f8567g;
                            c0096n.f2830l = T.F.n(this.f8566f);
                            c0096n.f2831m = T.F.n("audio/mp4a-latm");
                            c0096n.f2828j = s4.f632c;
                            c0096n.f2810E = s4.f631b;
                            c0096n.f2811F = s4.f630a;
                            c0096n.f2832p = Collections.singletonList(b7);
                            c0096n.f2822d = this.f8564d;
                            c0096n.f2824f = this.f8565e;
                            C0097o c0097o = new C0097o(c0096n);
                            this.f8577s = 1024000000 / c0097o.f2847G;
                            this.f8568h.d(c0097o);
                            this.f8576r = true;
                        }
                        tVar.t(4);
                        int i32 = tVar.i(13);
                        int i33 = i32 - 7;
                        if (this.f8573m) {
                            i33 = i32 - 9;
                        }
                        y0.F f5 = this.f8568h;
                        long j4 = this.f8577s;
                        this.f8570j = 4;
                        this.f8571k = 0;
                        this.v = f5;
                        this.f8580w = j4;
                        this.f8578t = i33;
                    }
                } else {
                    if (i9 != 4) {
                        throw new IllegalStateException();
                    }
                    int min3 = Math.min(uVar.a(), this.f8578t - this.f8571k);
                    this.v.a(min3, uVar);
                    int i34 = this.f8571k + min3;
                    this.f8571k = i34;
                    if (i34 == this.f8578t) {
                        AbstractC0124a.t(this.f8579u != -9223372036854775807L);
                        this.v.e(this.f8579u, 1, this.f8578t, 0, null);
                        this.f8579u += this.f8580w;
                        this.f8570j = 0;
                        this.f8571k = 0;
                        this.f8572l = 256;
                    }
                }
            } else if (uVar.a() != 0) {
                tVar.f3345d[0] = uVar.f3351a[uVar.f3352b];
                tVar.q(2);
                int i35 = tVar.i(4);
                int i36 = this.f8574p;
                if (i36 == -1 || i35 == i36) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.f8575q;
                        this.f8574p = i35;
                    }
                    this.f8570j = 3;
                    this.f8571k = 0;
                } else {
                    this.n = false;
                    this.f8570j = 0;
                    this.f8571k = 0;
                    this.f8572l = 256;
                }
            }
        }
    }

    @Override // f1.h
    public final void b() {
        this.f8579u = -9223372036854775807L;
        this.n = false;
        this.f8570j = 0;
        this.f8571k = 0;
        this.f8572l = 256;
    }

    @Override // f1.h
    public final void d(int i4, long j4) {
        this.f8579u = j4;
    }

    @Override // f1.h
    public final void e(y0.p pVar, E e4) {
        e4.a();
        e4.c();
        this.f8567g = (String) e4.f8531e;
        e4.c();
        y0.F z = pVar.z(e4.f8529c, 1);
        this.f8568h = z;
        this.v = z;
        if (!this.f8561a) {
            this.f8569i = new y0.m();
            return;
        }
        e4.a();
        e4.c();
        y0.F z4 = pVar.z(e4.f8529c, 5);
        this.f8569i = z4;
        C0096n c0096n = new C0096n();
        e4.c();
        c0096n.f2819a = (String) e4.f8531e;
        c0096n.f2830l = T.F.n(this.f8566f);
        c0096n.f2831m = T.F.n("application/id3");
        AbstractC0005f.w(c0096n, z4);
    }

    @Override // f1.h
    public final void c(boolean z) {
    }
}
