package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class pe4 implements oc4 {

    /* renamed from: b, reason: collision with root package name */
    private rc4 f10204b;

    /* renamed from: c, reason: collision with root package name */
    private int f10205c;

    /* renamed from: d, reason: collision with root package name */
    private int f10206d;

    /* renamed from: e, reason: collision with root package name */
    private int f10207e;

    /* renamed from: g, reason: collision with root package name */
    private m f10209g;

    /* renamed from: h, reason: collision with root package name */
    private pc4 f10210h;

    /* renamed from: i, reason: collision with root package name */
    private se4 f10211i;

    /* renamed from: j, reason: collision with root package name */
    private j1 f10212j;

    /* renamed from: a, reason: collision with root package name */
    private final dr2 f10203a = new dr2(6);

    /* renamed from: f, reason: collision with root package name */
    private long f10208f = -1;

    private final int a(pc4 pc4Var) {
        this.f10203a.c(2);
        ((jc4) pc4Var).n(this.f10203a.h(), 0, 2, false);
        return this.f10203a.w();
    }

    private final void b() {
        d(new b81[0]);
        rc4 rc4Var = this.f10204b;
        Objects.requireNonNull(rc4Var);
        rc4Var.H();
        this.f10204b.p(new od4(-9223372036854775807L, 0L));
        this.f10205c = 6;
    }

    private final void d(b81... b81VarArr) {
        rc4 rc4Var = this.f10204b;
        Objects.requireNonNull(rc4Var);
        td4 r7 = rc4Var.r(1024, 4);
        bf4 bf4Var = new bf4();
        bf4Var.h0("image/jpeg");
        bf4Var.m(new c91(b81VarArr));
        r7.b(bf4Var.y());
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final boolean c(pc4 pc4Var) {
        if (a(pc4Var) != 65496) {
            return false;
        }
        int a7 = a(pc4Var);
        this.f10206d = a7;
        if (a7 == 65504) {
            this.f10203a.c(2);
            jc4 jc4Var = (jc4) pc4Var;
            jc4Var.n(this.f10203a.h(), 0, 2, false);
            jc4Var.o(this.f10203a.w() - 2, false);
            a7 = a(pc4Var);
            this.f10206d = a7;
        }
        if (a7 == 65505) {
            jc4 jc4Var2 = (jc4) pc4Var;
            jc4Var2.o(2, false);
            this.f10203a.c(6);
            jc4Var2.n(this.f10203a.h(), 0, 6, false);
            if (this.f10203a.A() == 1165519206 && this.f10203a.w() == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x015a  */
    @Override // com.google.android.gms.internal.ads.oc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(pc4 pc4Var, md4 md4Var) {
        int i7;
        String D;
        re4 a7;
        m mVar;
        long j7;
        int i8 = this.f10205c;
        if (i8 == 0) {
            this.f10203a.c(2);
            ((jc4) pc4Var).m(this.f10203a.h(), 0, 2, false);
            int w6 = this.f10203a.w();
            this.f10206d = w6;
            if (w6 == 65498) {
                if (this.f10208f != -1) {
                    this.f10205c = 4;
                    return 0;
                }
                b();
                return 0;
            }
            if ((w6 >= 65488 && w6 <= 65497) || w6 == 65281) {
                return 0;
            }
            this.f10205c = 1;
            return 0;
        }
        if (i8 == 1) {
            this.f10203a.c(2);
            ((jc4) pc4Var).m(this.f10203a.h(), 0, 2, false);
            this.f10207e = this.f10203a.w() - 2;
            this.f10205c = 2;
            return 0;
        }
        if (i8 != 2) {
            if (i8 != 4) {
                if (i8 != 5) {
                    if (i8 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f10211i == null || pc4Var != this.f10210h) {
                    this.f10210h = pc4Var;
                    this.f10211i = new se4(pc4Var, this.f10208f);
                }
                j1 j1Var = this.f10212j;
                Objects.requireNonNull(j1Var);
                int e7 = j1Var.e(this.f10211i, md4Var);
                if (e7 == 1) {
                    md4Var.f8503a += this.f10208f;
                }
                return e7;
            }
            long b7 = pc4Var.b();
            long j8 = this.f10208f;
            if (b7 != j8) {
                md4Var.f8503a = j8;
                return 1;
            }
            if (pc4Var.n(this.f10203a.h(), 0, 1, true)) {
                pc4Var.i();
                if (this.f10212j == null) {
                    this.f10212j = new j1(0);
                }
                se4 se4Var = new se4(pc4Var, this.f10208f);
                this.f10211i = se4Var;
                if (this.f10212j.c(se4Var)) {
                    j1 j1Var2 = this.f10212j;
                    long j9 = this.f10208f;
                    rc4 rc4Var = this.f10204b;
                    Objects.requireNonNull(rc4Var);
                    j1Var2.g(new ue4(j9, rc4Var));
                    m mVar2 = this.f10209g;
                    Objects.requireNonNull(mVar2);
                    d(mVar2);
                    this.f10205c = 5;
                    return 0;
                }
            }
            b();
            return 0;
        }
        if (this.f10206d == 65505) {
            dr2 dr2Var = new dr2(this.f10207e);
            ((jc4) pc4Var).m(dr2Var.h(), 0, this.f10207e, false);
            if (this.f10209g == null && "http://ns.adobe.com/xap/1.0/".equals(dr2Var.D((char) 0)) && (D = dr2Var.D((char) 0)) != null) {
                long c7 = pc4Var.c();
                if (c7 != -1 && (a7 = ve4.a(D)) != null && a7.f11136b.size() >= 2) {
                    long j10 = -1;
                    long j11 = -1;
                    long j12 = -1;
                    long j13 = -1;
                    boolean z6 = false;
                    for (int size = a7.f11136b.size() - 1; size >= 0; size--) {
                        qe4 qe4Var = a7.f11136b.get(size);
                        boolean equals = "video/mp4".equals(qe4Var.f10665a) | z6;
                        if (size == 0) {
                            c7 -= qe4Var.f10668d;
                            j7 = 0;
                        } else {
                            j7 = c7 - qe4Var.f10667c;
                        }
                        long j14 = c7;
                        c7 = j7;
                        if (!equals || c7 == j14) {
                            z6 = equals;
                        } else {
                            j13 = j14 - c7;
                            j12 = c7;
                            z6 = false;
                        }
                        if (size == 0) {
                            j11 = j14;
                        }
                        if (size == 0) {
                            j10 = c7;
                        }
                    }
                    if (j12 != -1 && j13 != -1 && j10 != -1 && j11 != -1) {
                        mVar = new m(j10, j11, a7.f11135a, j12, j13);
                        this.f10209g = mVar;
                        if (mVar != null) {
                            this.f10208f = mVar.f8137i;
                        }
                    }
                }
                mVar = null;
                this.f10209g = mVar;
                if (mVar != null) {
                }
            }
            i7 = 0;
        } else {
            i7 = 0;
            ((jc4) pc4Var).p(this.f10207e, false);
        }
        this.f10205c = i7;
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void g(rc4 rc4Var) {
        this.f10204b = rc4Var;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void h(long j7, long j8) {
        if (j7 == 0) {
            this.f10205c = 0;
            this.f10212j = null;
        } else if (this.f10205c == 5) {
            j1 j1Var = this.f10212j;
            Objects.requireNonNull(j1Var);
            j1Var.h(j7, j8);
        }
    }
}
