package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* loaded from: classes.dex */
public final class j0 implements oc4 {

    /* renamed from: q, reason: collision with root package name */
    public static final vc4 f6876q = new vc4() { // from class: com.google.android.gms.internal.ads.h0
        @Override // com.google.android.gms.internal.ads.vc4
        public final /* synthetic */ oc4[] a(Uri uri, Map map) {
            return uc4.a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.vc4
        public final oc4[] zza() {
            vc4 vc4Var = j0.f6876q;
            return new oc4[]{new j0(0)};
        }
    };

    /* renamed from: r, reason: collision with root package name */
    private static final tf4 f6877r = new tf4() { // from class: com.google.android.gms.internal.ads.i0
    };

    /* renamed from: a, reason: collision with root package name */
    private final dr2 f6878a;

    /* renamed from: b, reason: collision with root package name */
    private final jd4 f6879b;

    /* renamed from: c, reason: collision with root package name */
    private final fd4 f6880c;

    /* renamed from: d, reason: collision with root package name */
    private final hd4 f6881d;

    /* renamed from: e, reason: collision with root package name */
    private final td4 f6882e;

    /* renamed from: f, reason: collision with root package name */
    private rc4 f6883f;

    /* renamed from: g, reason: collision with root package name */
    private td4 f6884g;

    /* renamed from: h, reason: collision with root package name */
    private td4 f6885h;

    /* renamed from: i, reason: collision with root package name */
    private int f6886i;

    /* renamed from: j, reason: collision with root package name */
    private c91 f6887j;

    /* renamed from: k, reason: collision with root package name */
    private long f6888k;

    /* renamed from: l, reason: collision with root package name */
    private long f6889l;

    /* renamed from: m, reason: collision with root package name */
    private long f6890m;

    /* renamed from: n, reason: collision with root package name */
    private int f6891n;

    /* renamed from: o, reason: collision with root package name */
    private l0 f6892o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f6893p;

    public j0() {
        this(0);
    }

    public j0(int i7) {
        this.f6878a = new dr2(10);
        this.f6879b = new jd4();
        this.f6880c = new fd4();
        this.f6888k = -9223372036854775807L;
        this.f6881d = new hd4();
        nc4 nc4Var = new nc4();
        this.f6882e = nc4Var;
        this.f6885h = nc4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int b(pc4 pc4Var) {
        int i7;
        int i8;
        n0 c7;
        l0 f7;
        int i9;
        int i10;
        c91 c91Var;
        g0 g0Var;
        long j7;
        if (this.f6886i == 0) {
            try {
                k(pc4Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f6892o == null) {
            dr2 dr2Var = new dr2(this.f6879b.f7097c);
            ((jc4) pc4Var).n(dr2Var.h(), 0, this.f6879b.f7097c, false);
            jd4 jd4Var = this.f6879b;
            int i11 = jd4Var.f7095a & 1;
            int i12 = jd4Var.f7099e;
            if (i11 != 0) {
                if (i12 != 1) {
                    i7 = 36;
                    if (dr2Var.l() >= i7 + 4) {
                        dr2Var.f(i7);
                        int m7 = dr2Var.m();
                        if (m7 == 1483304551) {
                            i8 = m7;
                        } else if (m7 == 1231971951) {
                            i8 = 1231971951;
                        }
                        if (i8 != 1483304551 || i8 == 1231971951) {
                            int i13 = i8;
                            c7 = n0.c(pc4Var.c(), pc4Var.b(), this.f6879b, dr2Var);
                            if (c7 != null && !this.f6880c.a()) {
                                pc4Var.i();
                                jc4 jc4Var = (jc4) pc4Var;
                                jc4Var.o(i7 + 141, false);
                                jc4Var.n(this.f6878a.h(), 0, 3, false);
                                this.f6878a.f(0);
                                fd4 fd4Var = this.f6880c;
                                int u6 = this.f6878a.u();
                                i9 = u6 >> 12;
                                i10 = u6 & 4095;
                                if (i9 <= 0 || i10 > 0) {
                                    fd4Var.f5092a = i9;
                                    fd4Var.f5093b = i10;
                                }
                            }
                            ((jc4) pc4Var).p(this.f6879b.f7097c, false);
                            f7 = (c7 == null && !c7.f() && i13 == 1231971951) ? f(pc4Var, false) : c7;
                        } else if (i8 == 1447187017) {
                            f7 = m0.c(pc4Var.c(), pc4Var.b(), this.f6879b, dr2Var);
                            ((jc4) pc4Var).p(this.f6879b.f7097c, false);
                        } else {
                            pc4Var.i();
                            f7 = null;
                        }
                        c91Var = this.f6887j;
                        long b7 = pc4Var.b();
                        if (c91Var != null) {
                            int a7 = c91Var.a();
                            for (int i14 = 0; i14 < a7; i14++) {
                                b81 c8 = c91Var.c(i14);
                                if (c8 instanceof ag4) {
                                    ag4 ag4Var = (ag4) c8;
                                    int a8 = c91Var.a();
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 >= a8) {
                                            j7 = -9223372036854775807L;
                                            break;
                                        }
                                        b81 c9 = c91Var.c(i15);
                                        if (c9 instanceof e) {
                                            e eVar = (e) c9;
                                            if (eVar.f13818f.equals("TLEN")) {
                                                j7 = nz3.c(Long.parseLong(eVar.f4408h));
                                                break;
                                            }
                                        }
                                        i15++;
                                    }
                                    g0Var = g0.c(b7, ag4Var, j7);
                                    if (this.f6893p) {
                                        f7 = new k0();
                                    } else {
                                        if (g0Var != null) {
                                            f7 = g0Var;
                                        } else if (f7 == null) {
                                            f7 = null;
                                        }
                                        if (f7 != null) {
                                            f7.f();
                                        } else {
                                            f7 = f(pc4Var, false);
                                        }
                                    }
                                    this.f6892o = f7;
                                    this.f6883f.p(f7);
                                    td4 td4Var = this.f6885h;
                                    bf4 bf4Var = new bf4();
                                    bf4Var.s(this.f6879b.f7096b);
                                    bf4Var.l(4096);
                                    bf4Var.e0(this.f6879b.f7099e);
                                    bf4Var.t(this.f6879b.f7098d);
                                    bf4Var.c(this.f6880c.f5092a);
                                    bf4Var.d(this.f6880c.f5093b);
                                    bf4Var.m(this.f6887j);
                                    td4Var.b(bf4Var.y());
                                    this.f6890m = pc4Var.b();
                                }
                            }
                        }
                        g0Var = null;
                        if (this.f6893p) {
                        }
                        this.f6892o = f7;
                        this.f6883f.p(f7);
                        td4 td4Var2 = this.f6885h;
                        bf4 bf4Var2 = new bf4();
                        bf4Var2.s(this.f6879b.f7096b);
                        bf4Var2.l(4096);
                        bf4Var2.e0(this.f6879b.f7099e);
                        bf4Var2.t(this.f6879b.f7098d);
                        bf4Var2.c(this.f6880c.f5092a);
                        bf4Var2.d(this.f6880c.f5093b);
                        bf4Var2.m(this.f6887j);
                        td4Var2.b(bf4Var2.y());
                        this.f6890m = pc4Var.b();
                    }
                    if (dr2Var.l() >= 40) {
                        dr2Var.f(36);
                        if (dr2Var.m() == 1447187017) {
                            i8 = 1447187017;
                            if (i8 != 1483304551) {
                            }
                            int i132 = i8;
                            c7 = n0.c(pc4Var.c(), pc4Var.b(), this.f6879b, dr2Var);
                            if (c7 != null) {
                                pc4Var.i();
                                jc4 jc4Var2 = (jc4) pc4Var;
                                jc4Var2.o(i7 + 141, false);
                                jc4Var2.n(this.f6878a.h(), 0, 3, false);
                                this.f6878a.f(0);
                                fd4 fd4Var2 = this.f6880c;
                                int u62 = this.f6878a.u();
                                i9 = u62 >> 12;
                                i10 = u62 & 4095;
                                if (i9 <= 0) {
                                }
                                fd4Var2.f5092a = i9;
                                fd4Var2.f5093b = i10;
                            }
                            ((jc4) pc4Var).p(this.f6879b.f7097c, false);
                            if (c7 == null) {
                            }
                            c91Var = this.f6887j;
                            long b72 = pc4Var.b();
                            if (c91Var != null) {
                            }
                            g0Var = null;
                            if (this.f6893p) {
                            }
                            this.f6892o = f7;
                            this.f6883f.p(f7);
                            td4 td4Var22 = this.f6885h;
                            bf4 bf4Var22 = new bf4();
                            bf4Var22.s(this.f6879b.f7096b);
                            bf4Var22.l(4096);
                            bf4Var22.e0(this.f6879b.f7099e);
                            bf4Var22.t(this.f6879b.f7098d);
                            bf4Var22.c(this.f6880c.f5092a);
                            bf4Var22.d(this.f6880c.f5093b);
                            bf4Var22.m(this.f6887j);
                            td4Var22.b(bf4Var22.y());
                            this.f6890m = pc4Var.b();
                        }
                    }
                    i8 = 0;
                    if (i8 != 1483304551) {
                    }
                    int i1322 = i8;
                    c7 = n0.c(pc4Var.c(), pc4Var.b(), this.f6879b, dr2Var);
                    if (c7 != null) {
                    }
                    ((jc4) pc4Var).p(this.f6879b.f7097c, false);
                    if (c7 == null) {
                    }
                    c91Var = this.f6887j;
                    long b722 = pc4Var.b();
                    if (c91Var != null) {
                    }
                    g0Var = null;
                    if (this.f6893p) {
                    }
                    this.f6892o = f7;
                    this.f6883f.p(f7);
                    td4 td4Var222 = this.f6885h;
                    bf4 bf4Var222 = new bf4();
                    bf4Var222.s(this.f6879b.f7096b);
                    bf4Var222.l(4096);
                    bf4Var222.e0(this.f6879b.f7099e);
                    bf4Var222.t(this.f6879b.f7098d);
                    bf4Var222.c(this.f6880c.f5092a);
                    bf4Var222.d(this.f6880c.f5093b);
                    bf4Var222.m(this.f6887j);
                    td4Var222.b(bf4Var222.y());
                    this.f6890m = pc4Var.b();
                }
                i7 = 21;
                if (dr2Var.l() >= i7 + 4) {
                }
                if (dr2Var.l() >= 40) {
                }
                i8 = 0;
                if (i8 != 1483304551) {
                }
                int i13222 = i8;
                c7 = n0.c(pc4Var.c(), pc4Var.b(), this.f6879b, dr2Var);
                if (c7 != null) {
                }
                ((jc4) pc4Var).p(this.f6879b.f7097c, false);
                if (c7 == null) {
                }
                c91Var = this.f6887j;
                long b7222 = pc4Var.b();
                if (c91Var != null) {
                }
                g0Var = null;
                if (this.f6893p) {
                }
                this.f6892o = f7;
                this.f6883f.p(f7);
                td4 td4Var2222 = this.f6885h;
                bf4 bf4Var2222 = new bf4();
                bf4Var2222.s(this.f6879b.f7096b);
                bf4Var2222.l(4096);
                bf4Var2222.e0(this.f6879b.f7099e);
                bf4Var2222.t(this.f6879b.f7098d);
                bf4Var2222.c(this.f6880c.f5092a);
                bf4Var2222.d(this.f6880c.f5093b);
                bf4Var2222.m(this.f6887j);
                td4Var2222.b(bf4Var2222.y());
                this.f6890m = pc4Var.b();
            } else {
                if (i12 == 1) {
                    i7 = 13;
                    if (dr2Var.l() >= i7 + 4) {
                    }
                    if (dr2Var.l() >= 40) {
                    }
                    i8 = 0;
                    if (i8 != 1483304551) {
                    }
                    int i132222 = i8;
                    c7 = n0.c(pc4Var.c(), pc4Var.b(), this.f6879b, dr2Var);
                    if (c7 != null) {
                    }
                    ((jc4) pc4Var).p(this.f6879b.f7097c, false);
                    if (c7 == null) {
                    }
                    c91Var = this.f6887j;
                    long b72222 = pc4Var.b();
                    if (c91Var != null) {
                    }
                    g0Var = null;
                    if (this.f6893p) {
                    }
                    this.f6892o = f7;
                    this.f6883f.p(f7);
                    td4 td4Var22222 = this.f6885h;
                    bf4 bf4Var22222 = new bf4();
                    bf4Var22222.s(this.f6879b.f7096b);
                    bf4Var22222.l(4096);
                    bf4Var22222.e0(this.f6879b.f7099e);
                    bf4Var22222.t(this.f6879b.f7098d);
                    bf4Var22222.c(this.f6880c.f5092a);
                    bf4Var22222.d(this.f6880c.f5093b);
                    bf4Var22222.m(this.f6887j);
                    td4Var22222.b(bf4Var22222.y());
                    this.f6890m = pc4Var.b();
                }
                i7 = 21;
                if (dr2Var.l() >= i7 + 4) {
                }
                if (dr2Var.l() >= 40) {
                }
                i8 = 0;
                if (i8 != 1483304551) {
                }
                int i1322222 = i8;
                c7 = n0.c(pc4Var.c(), pc4Var.b(), this.f6879b, dr2Var);
                if (c7 != null) {
                }
                ((jc4) pc4Var).p(this.f6879b.f7097c, false);
                if (c7 == null) {
                }
                c91Var = this.f6887j;
                long b722222 = pc4Var.b();
                if (c91Var != null) {
                }
                g0Var = null;
                if (this.f6893p) {
                }
                this.f6892o = f7;
                this.f6883f.p(f7);
                td4 td4Var222222 = this.f6885h;
                bf4 bf4Var222222 = new bf4();
                bf4Var222222.s(this.f6879b.f7096b);
                bf4Var222222.l(4096);
                bf4Var222222.e0(this.f6879b.f7099e);
                bf4Var222222.t(this.f6879b.f7098d);
                bf4Var222222.c(this.f6880c.f5092a);
                bf4Var222222.d(this.f6880c.f5093b);
                bf4Var222222.m(this.f6887j);
                td4Var222222.b(bf4Var222222.y());
                this.f6890m = pc4Var.b();
            }
        } else if (this.f6890m != 0) {
            long b8 = pc4Var.b();
            long j8 = this.f6890m;
            if (b8 < j8) {
                ((jc4) pc4Var).p((int) (j8 - b8), false);
            }
        }
        int i16 = this.f6891n;
        if (i16 == 0) {
            pc4Var.i();
            if (j(pc4Var)) {
                return -1;
            }
            this.f6878a.f(0);
            int m8 = this.f6878a.m();
            if (!i(m8, this.f6886i) || kd4.b(m8) == -1) {
                ((jc4) pc4Var).p(1, false);
                this.f6886i = 0;
                return 0;
            }
            this.f6879b.a(m8);
            if (this.f6888k == -9223372036854775807L) {
                this.f6888k = this.f6892o.i(pc4Var.b());
            }
            int i17 = this.f6879b.f7097c;
            this.f6891n = i17;
            l0 l0Var = this.f6892o;
            if (l0Var instanceof f0) {
                d(this.f6889l + r2.f7101g);
                throw null;
            }
            i16 = i17;
        }
        int c10 = this.f6885h.c(pc4Var, i16, true);
        if (c10 == -1) {
            return -1;
        }
        int i18 = this.f6891n - c10;
        this.f6891n = i18;
        if (i18 <= 0) {
            this.f6885h.a(d(this.f6889l), 1, this.f6879b.f7097c, 0, null);
            this.f6889l += this.f6879b.f7101g;
            this.f6891n = 0;
            return 0;
        }
        return 0;
    }

    private final long d(long j7) {
        return this.f6888k + ((j7 * 1000000) / this.f6879b.f7098d);
    }

    private final l0 f(pc4 pc4Var, boolean z6) {
        ((jc4) pc4Var).n(this.f6878a.h(), 0, 4, false);
        this.f6878a.f(0);
        this.f6879b.a(this.f6878a.m());
        return new e0(pc4Var.c(), pc4Var.b(), this.f6879b, false);
    }

    private static boolean i(int i7, long j7) {
        return ((long) (i7 & (-128000))) == (j7 & (-128000));
    }

    private final boolean j(pc4 pc4Var) {
        l0 l0Var = this.f6892o;
        if (l0Var != null) {
            long a7 = l0Var.a();
            if (a7 != -1 && pc4Var.g() > a7 - 4) {
                return true;
            }
        }
        try {
            return !pc4Var.n(this.f6878a.h(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean k(pc4 pc4Var, boolean z6) {
        int i7;
        int i8;
        int b7;
        int i9 = true != z6 ? 131072 : 32768;
        pc4Var.i();
        if (pc4Var.b() == 0) {
            c91 a7 = this.f6881d.a(pc4Var, null);
            this.f6887j = a7;
            if (a7 != null) {
                this.f6880c.b(a7);
            }
            i8 = (int) pc4Var.g();
            if (!z6) {
                ((jc4) pc4Var).p(i8, false);
            }
            i7 = 0;
        } else {
            i7 = 0;
            i8 = 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (!j(pc4Var)) {
                this.f6878a.f(0);
                int m7 = this.f6878a.m();
                if ((i7 == 0 || i(m7, i7)) && (b7 = kd4.b(m7)) != -1) {
                    i10++;
                    if (i10 != 1) {
                        if (i10 == 4) {
                            break;
                        }
                    } else {
                        this.f6879b.a(m7);
                        i7 = m7;
                    }
                    ((jc4) pc4Var).o(b7 - 4, false);
                } else {
                    int i12 = i11 + 1;
                    if (i11 == i9) {
                        if (z6) {
                            return false;
                        }
                        throw dz.a("Searched too many bytes.", null);
                    }
                    if (z6) {
                        pc4Var.i();
                        ((jc4) pc4Var).o(i8 + i12, false);
                    } else {
                        ((jc4) pc4Var).p(1, false);
                    }
                    i11 = i12;
                    i7 = 0;
                    i10 = 0;
                }
            } else if (i10 <= 0) {
                throw new EOFException();
            }
        }
        if (z6) {
            ((jc4) pc4Var).p(i8 + i11, false);
        } else {
            pc4Var.i();
        }
        this.f6886i = i7;
        return true;
    }

    public final void a() {
        this.f6893p = true;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final boolean c(pc4 pc4Var) {
        return k(pc4Var, true);
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final int e(pc4 pc4Var, md4 md4Var) {
        wu1.b(this.f6884g);
        int i7 = n13.f8865a;
        int b7 = b(pc4Var);
        if (b7 == -1 && (this.f6892o instanceof f0)) {
            if (this.f6892o.b() != d(this.f6889l)) {
                throw null;
            }
        }
        return b7;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void g(rc4 rc4Var) {
        this.f6883f = rc4Var;
        td4 r7 = rc4Var.r(0, 1);
        this.f6884g = r7;
        this.f6885h = r7;
        this.f6883f.H();
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void h(long j7, long j8) {
        this.f6886i = 0;
        this.f6888k = -9223372036854775807L;
        this.f6889l = 0L;
        this.f6891n = 0;
        l0 l0Var = this.f6892o;
        if (l0Var instanceof f0) {
            throw null;
        }
    }
}
