package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y2 implements w2 {

    /* renamed from: q, reason: collision with root package name */
    private static final double[] f14494q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f14495a;

    /* renamed from: b, reason: collision with root package name */
    private td4 f14496b;

    /* renamed from: c, reason: collision with root package name */
    private final n4 f14497c;

    /* renamed from: d, reason: collision with root package name */
    private final dr2 f14498d;

    /* renamed from: e, reason: collision with root package name */
    private final m3 f14499e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f14500f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    private final x2 f14501g = new x2(128);

    /* renamed from: h, reason: collision with root package name */
    private long f14502h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14503i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14504j;

    /* renamed from: k, reason: collision with root package name */
    private long f14505k;

    /* renamed from: l, reason: collision with root package name */
    private long f14506l;

    /* renamed from: m, reason: collision with root package name */
    private long f14507m;

    /* renamed from: n, reason: collision with root package name */
    private long f14508n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f14509o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f14510p;

    y2(n4 n4Var) {
        dr2 dr2Var;
        this.f14497c = n4Var;
        if (n4Var != null) {
            this.f14499e = new m3(178, 128);
            dr2Var = new dr2();
        } else {
            dr2Var = null;
            this.f14499e = null;
        }
        this.f14498d = dr2Var;
        this.f14506l = -9223372036854775807L;
        this.f14508n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ce  */
    @Override // com.google.android.gms.internal.ads.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(dr2 dr2Var) {
        int i7;
        m3 m3Var;
        int i8;
        long j7;
        long j8;
        int i9;
        float f7;
        int i10;
        float f8;
        int i11;
        wu1.b(this.f14496b);
        int k7 = dr2Var.k();
        int l7 = dr2Var.l();
        byte[] h7 = dr2Var.h();
        this.f14502h += dr2Var.i();
        rd4.b(this.f14496b, dr2Var, dr2Var.i());
        while (true) {
            int a7 = th2.a(h7, k7, l7, this.f14500f);
            if (a7 == l7) {
                break;
            }
            int i12 = a7 + 3;
            int i13 = dr2Var.h()[i12] & 255;
            int i14 = a7 - k7;
            if (!this.f14504j) {
                if (i14 > 0) {
                    this.f14501g.a(h7, k7, a7);
                }
                if (this.f14501g.c(i13, i14 < 0 ? -i14 : 0)) {
                    x2 x2Var = this.f14501g;
                    String str = this.f14495a;
                    Objects.requireNonNull(str);
                    byte[] copyOf = Arrays.copyOf(x2Var.f14004d, x2Var.f14002b);
                    byte b7 = copyOf[4];
                    int i15 = copyOf[5] & 255;
                    int i16 = ((b7 & 255) << 4) | (i15 >> 4);
                    int i17 = ((i15 & 15) << 8) | (copyOf[6] & 255);
                    int i18 = (copyOf[7] & 240) >> 4;
                    if (i18 == 2) {
                        f7 = i17 * 4;
                        i10 = i16 * 3;
                    } else if (i18 == 3) {
                        f7 = i17 * 16;
                        i10 = i16 * 9;
                    } else if (i18 != 4) {
                        f8 = 1.0f;
                        bf4 bf4Var = new bf4();
                        bf4Var.h(str);
                        bf4Var.s("video/mpeg2");
                        bf4Var.x(i16);
                        bf4Var.f(i17);
                        bf4Var.p(f8);
                        bf4Var.i(Collections.singletonList(copyOf));
                        c0 y6 = bf4Var.y();
                        i11 = (copyOf[7] & 15) - 1;
                        long j9 = 0;
                        if (i11 >= 0 || i11 >= 8) {
                            i7 = i12;
                        } else {
                            double d7 = f14494q[i11];
                            byte b8 = copyOf[x2Var.f14003c + 9];
                            int i19 = (b8 & 96) >> 5;
                            int i20 = b8 & 31;
                            if (i19 != i20) {
                                double d8 = i19;
                                Double.isNaN(d8);
                                i7 = i12;
                                double d9 = i20 + 1;
                                Double.isNaN(d9);
                                d7 *= (d8 + 1.0d) / d9;
                            } else {
                                i7 = i12;
                            }
                            j9 = (long) (1000000.0d / d7);
                        }
                        Pair create = Pair.create(y6, Long.valueOf(j9));
                        this.f14496b.b((c0) create.first);
                        this.f14505k = ((Long) create.second).longValue();
                        this.f14504j = true;
                        m3Var = this.f14499e;
                        if (m3Var != null) {
                            if (i14 > 0) {
                                m3Var.a(h7, k7, a7);
                                i9 = 0;
                            } else {
                                i9 = -i14;
                            }
                            if (this.f14499e.d(i9)) {
                                m3 m3Var2 = this.f14499e;
                                int b9 = th2.b(m3Var2.f8389d, m3Var2.f8390e);
                                dr2 dr2Var2 = this.f14498d;
                                int i21 = n13.f8865a;
                                dr2Var2.d(this.f14499e.f8389d, b9);
                                this.f14497c.a(this.f14508n, this.f14498d);
                            }
                            if (i13 == 178) {
                                if (dr2Var.h()[a7 + 2] == 1) {
                                    this.f14499e.c(178);
                                }
                                i13 = 178;
                            }
                        }
                        if (i13 != 0 || i13 == 179) {
                            i8 = l7 - a7;
                            if (this.f14510p && this.f14504j) {
                                j8 = this.f14508n;
                                if (j8 != -9223372036854775807L) {
                                    this.f14496b.a(j8, this.f14509o ? 1 : 0, ((int) (this.f14502h - this.f14507m)) - i8, i8, null);
                                }
                            }
                            if (this.f14503i || this.f14510p) {
                                this.f14507m = this.f14502h - i8;
                                j7 = this.f14506l;
                                if (j7 == -9223372036854775807L) {
                                    long j10 = this.f14508n;
                                    j7 = j10 != -9223372036854775807L ? j10 + this.f14505k : -9223372036854775807L;
                                }
                                this.f14508n = j7;
                                this.f14509o = false;
                                this.f14506l = -9223372036854775807L;
                                this.f14503i = true;
                            }
                            this.f14510p = i13 == 0;
                        } else if (i13 == 184) {
                            this.f14509o = true;
                        }
                        k7 = i7;
                    } else {
                        f7 = i17 * 121;
                        i10 = i16 * 100;
                    }
                    f8 = f7 / i10;
                    bf4 bf4Var2 = new bf4();
                    bf4Var2.h(str);
                    bf4Var2.s("video/mpeg2");
                    bf4Var2.x(i16);
                    bf4Var2.f(i17);
                    bf4Var2.p(f8);
                    bf4Var2.i(Collections.singletonList(copyOf));
                    c0 y62 = bf4Var2.y();
                    i11 = (copyOf[7] & 15) - 1;
                    long j92 = 0;
                    if (i11 >= 0) {
                    }
                    i7 = i12;
                    Pair create2 = Pair.create(y62, Long.valueOf(j92));
                    this.f14496b.b((c0) create2.first);
                    this.f14505k = ((Long) create2.second).longValue();
                    this.f14504j = true;
                    m3Var = this.f14499e;
                    if (m3Var != null) {
                    }
                    if (i13 != 0) {
                    }
                    i8 = l7 - a7;
                    if (this.f14510p) {
                        j8 = this.f14508n;
                        if (j8 != -9223372036854775807L) {
                        }
                    }
                    if (this.f14503i) {
                    }
                    this.f14507m = this.f14502h - i8;
                    j7 = this.f14506l;
                    if (j7 == -9223372036854775807L) {
                    }
                    this.f14508n = j7;
                    this.f14509o = false;
                    this.f14506l = -9223372036854775807L;
                    this.f14503i = true;
                    this.f14510p = i13 == 0;
                    k7 = i7;
                }
            }
            i7 = i12;
            m3Var = this.f14499e;
            if (m3Var != null) {
            }
            if (i13 != 0) {
            }
            i8 = l7 - a7;
            if (this.f14510p) {
            }
            if (this.f14503i) {
            }
            this.f14507m = this.f14502h - i8;
            j7 = this.f14506l;
            if (j7 == -9223372036854775807L) {
            }
            this.f14508n = j7;
            this.f14509o = false;
            this.f14506l = -9223372036854775807L;
            this.f14503i = true;
            this.f14510p = i13 == 0;
            k7 = i7;
        }
        if (!this.f14504j) {
            this.f14501g.a(h7, k7, l7);
        }
        m3 m3Var3 = this.f14499e;
        if (m3Var3 != null) {
            m3Var3.a(h7, k7, l7);
        }
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void b() {
        th2.e(this.f14500f);
        this.f14501g.b();
        m3 m3Var = this.f14499e;
        if (m3Var != null) {
            m3Var.b();
        }
        this.f14502h = 0L;
        this.f14503i = false;
        this.f14506l = -9223372036854775807L;
        this.f14508n = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void d(rc4 rc4Var, k4 k4Var) {
        k4Var.c();
        this.f14495a = k4Var.b();
        this.f14496b = rc4Var.r(k4Var.a(), 2);
        n4 n4Var = this.f14497c;
        if (n4Var != null) {
            n4Var.b(rc4Var, k4Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void e(long j7, int i7) {
        this.f14506l = j7;
    }
}
