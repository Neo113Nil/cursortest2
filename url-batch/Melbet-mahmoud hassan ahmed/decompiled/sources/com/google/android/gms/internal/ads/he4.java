package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class he4 implements oc4 {

    /* renamed from: n, reason: collision with root package name */
    public static final vc4 f6202n = new vc4() { // from class: com.google.android.gms.internal.ads.ge4
        @Override // com.google.android.gms.internal.ads.vc4
        public final /* synthetic */ oc4[] a(Uri uri, Map map) {
            return uc4.a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.vc4
        public final oc4[] zza() {
            vc4 vc4Var = he4.f6202n;
            return new oc4[]{new he4(0)};
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private rc4 f6206d;

    /* renamed from: e, reason: collision with root package name */
    private td4 f6207e;

    /* renamed from: g, reason: collision with root package name */
    private c91 f6209g;

    /* renamed from: h, reason: collision with root package name */
    private dd4 f6210h;

    /* renamed from: i, reason: collision with root package name */
    private int f6211i;

    /* renamed from: j, reason: collision with root package name */
    private int f6212j;

    /* renamed from: k, reason: collision with root package name */
    private fe4 f6213k;

    /* renamed from: l, reason: collision with root package name */
    private int f6214l;

    /* renamed from: m, reason: collision with root package name */
    private long f6215m;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f6203a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    private final dr2 f6204b = new dr2(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    private final wc4 f6205c = new wc4();

    /* renamed from: f, reason: collision with root package name */
    private int f6208f = 0;

    public he4(int i7) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r5.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        return r4.f6205c.f13793a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long a(dr2 dr2Var, boolean z6) {
        boolean z7;
        Objects.requireNonNull(this.f6210h);
        int k7 = dr2Var.k();
        while (true) {
            if (k7 > dr2Var.l() - 16) {
                if (!z6) {
                    dr2Var.f(k7);
                    return -1L;
                }
                while (k7 <= dr2Var.l() - this.f6211i) {
                    dr2Var.f(k7);
                    try {
                        z7 = xc4.c(dr2Var, this.f6210h, this.f6212j, this.f6205c);
                    } catch (IndexOutOfBoundsException unused) {
                        z7 = false;
                    }
                    if (dr2Var.k() > dr2Var.l() || !z7) {
                        k7++;
                    }
                }
                dr2Var.f(dr2Var.l());
                return -1L;
            }
            dr2Var.f(k7);
            if (xc4.c(dr2Var, this.f6210h, this.f6212j, this.f6205c)) {
                break;
            }
            k7++;
        }
    }

    private final void b() {
        long j7 = this.f6215m;
        dd4 dd4Var = this.f6210h;
        int i7 = n13.f8865a;
        this.f6207e.a((j7 * 1000000) / dd4Var.f4175e, 1, this.f6214l, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final boolean c(pc4 pc4Var) {
        ad4.a(pc4Var, false);
        dr2 dr2Var = new dr2(4);
        ((jc4) pc4Var).n(dr2Var.h(), 0, 4, false);
        return dr2Var.A() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final int e(pc4 pc4Var, md4 md4Var) {
        boolean l7;
        dd4 e7;
        dd4 dd4Var;
        pd4 od4Var;
        boolean z6;
        int i7 = this.f6208f;
        if (i7 == 0) {
            pc4Var.i();
            long g7 = pc4Var.g();
            c91 a7 = ad4.a(pc4Var, true);
            ((jc4) pc4Var).p((int) (pc4Var.g() - g7), false);
            this.f6209g = a7;
            this.f6208f = 1;
            return 0;
        }
        if (i7 == 1) {
            ((jc4) pc4Var).n(this.f6203a, 0, 42, false);
            pc4Var.i();
            this.f6208f = 2;
            return 0;
        }
        if (i7 == 2) {
            dr2 dr2Var = new dr2(4);
            ((jc4) pc4Var).m(dr2Var.h(), 0, 4, false);
            if (dr2Var.A() != 1716281667) {
                throw dz.a("Failed to read FLAC stream marker.", null);
            }
            this.f6208f = 3;
            return 0;
        }
        if (i7 == 3) {
            yc4 yc4Var = new yc4(this.f6210h);
            do {
                pc4Var.i();
                cq2 cq2Var = new cq2(new byte[4], 4);
                jc4 jc4Var = (jc4) pc4Var;
                jc4Var.n(cq2Var.f3919a, 0, 4, false);
                l7 = cq2Var.l();
                int c7 = cq2Var.c(7);
                int c8 = cq2Var.c(24) + 4;
                if (c7 == 0) {
                    byte[] bArr = new byte[38];
                    jc4Var.m(bArr, 0, 38, false);
                    e7 = new dd4(bArr, 4);
                } else {
                    dd4 dd4Var2 = yc4Var.f14619a;
                    if (dd4Var2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (c7 == 3) {
                        dr2 dr2Var2 = new dr2(c8);
                        jc4Var.m(dr2Var2.h(), 0, c8, false);
                        e7 = dd4Var2.f(ad4.b(dr2Var2));
                    } else if (c7 == 4) {
                        dr2 dr2Var3 = new dr2(c8);
                        jc4Var.m(dr2Var3.h(), 0, c8, false);
                        dr2Var3.g(4);
                        e7 = dd4Var2.g(Arrays.asList(yd4.b(dr2Var3, false, false).f13306b));
                    } else if (c7 == 6) {
                        dr2 dr2Var4 = new dr2(c8);
                        jc4Var.m(dr2Var4.h(), 0, c8, false);
                        dr2Var4.g(4);
                        int m7 = dr2Var4.m();
                        String F = dr2Var4.F(dr2Var4.m(), c43.f3727a);
                        String F2 = dr2Var4.F(dr2Var4.m(), c43.f3729c);
                        int m8 = dr2Var4.m();
                        int m9 = dr2Var4.m();
                        int m10 = dr2Var4.m();
                        int m11 = dr2Var4.m();
                        int m12 = dr2Var4.m();
                        byte[] bArr2 = new byte[m12];
                        dr2Var4.b(bArr2, 0, m12);
                        e7 = dd4Var2.e(Collections.singletonList(new af4(m7, F, F2, m8, m9, m10, m11, bArr2)));
                    } else {
                        jc4Var.p(c8, false);
                        dd4Var = yc4Var.f14619a;
                        int i8 = n13.f8865a;
                        this.f6210h = dd4Var;
                    }
                }
                yc4Var.f14619a = e7;
                dd4Var = yc4Var.f14619a;
                int i82 = n13.f8865a;
                this.f6210h = dd4Var;
            } while (!l7);
            Objects.requireNonNull(dd4Var);
            this.f6211i = Math.max(dd4Var.f4173c, 6);
            this.f6207e.b(this.f6210h.c(this.f6203a, this.f6209g));
            this.f6208f = 4;
            return 0;
        }
        if (i7 == 4) {
            pc4Var.i();
            dr2 dr2Var5 = new dr2(2);
            ((jc4) pc4Var).n(dr2Var5.h(), 0, 2, false);
            int w6 = dr2Var5.w();
            int i9 = w6 >> 2;
            pc4Var.i();
            if (i9 != 16382) {
                throw dz.a("First frame does not start with sync code.", null);
            }
            this.f6212j = w6;
            rc4 rc4Var = this.f6206d;
            int i10 = n13.f8865a;
            long b7 = pc4Var.b();
            long c9 = pc4Var.c();
            dd4 dd4Var3 = this.f6210h;
            Objects.requireNonNull(dd4Var3);
            if (dd4Var3.f4181k != null) {
                od4Var = new bd4(dd4Var3, b7);
            } else if (c9 == -1 || dd4Var3.f4180j <= 0) {
                od4Var = new od4(dd4Var3.a(), 0L);
            } else {
                fe4 fe4Var = new fe4(dd4Var3, this.f6212j, b7, c9);
                this.f6213k = fe4Var;
                od4Var = fe4Var.b();
            }
            rc4Var.p(od4Var);
            this.f6208f = 5;
            return 0;
        }
        Objects.requireNonNull(this.f6207e);
        Objects.requireNonNull(this.f6210h);
        fe4 fe4Var2 = this.f6213k;
        if (fe4Var2 != null && fe4Var2.e()) {
            return this.f6213k.a(pc4Var, md4Var);
        }
        if (this.f6215m == -1) {
            this.f6215m = xc4.b(pc4Var, this.f6210h);
            return 0;
        }
        int l8 = this.f6204b.l();
        if (l8 < 32768) {
            int a8 = pc4Var.a(this.f6204b.h(), l8, 32768 - l8);
            z6 = a8 == -1;
            if (!z6) {
                this.f6204b.e(l8 + a8);
            } else if (this.f6204b.i() == 0) {
                b();
                return -1;
            }
        } else {
            z6 = false;
        }
        int k7 = this.f6204b.k();
        int i11 = this.f6214l;
        int i12 = this.f6211i;
        if (i11 < i12) {
            dr2 dr2Var6 = this.f6204b;
            dr2Var6.g(Math.min(i12 - i11, dr2Var6.i()));
        }
        long a9 = a(this.f6204b, z6);
        int k8 = this.f6204b.k() - k7;
        this.f6204b.f(k7);
        rd4.b(this.f6207e, this.f6204b, k8);
        this.f6214l += k8;
        if (a9 != -1) {
            b();
            this.f6214l = 0;
            this.f6215m = a9;
        }
        if (this.f6204b.i() >= 16) {
            return 0;
        }
        int i13 = this.f6204b.i();
        System.arraycopy(this.f6204b.h(), this.f6204b.k(), this.f6204b.h(), 0, i13);
        this.f6204b.f(0);
        this.f6204b.e(i13);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void g(rc4 rc4Var) {
        this.f6206d = rc4Var;
        this.f6207e = rc4Var.r(0, 1);
        rc4Var.H();
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void h(long j7, long j8) {
        if (j7 == 0) {
            this.f6208f = 0;
        } else {
            fe4 fe4Var = this.f6213k;
            if (fe4Var != null) {
                fe4Var.d(j8);
            }
        }
        this.f6215m = j8 != 0 ? -1L : 0L;
        this.f6214l = 0;
        this.f6204b.c(0);
    }
}
