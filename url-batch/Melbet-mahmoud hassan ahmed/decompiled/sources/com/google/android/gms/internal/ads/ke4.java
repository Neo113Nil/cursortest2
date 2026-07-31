package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class ke4 implements oc4 {

    /* renamed from: q, reason: collision with root package name */
    public static final vc4 f7485q = new vc4() { // from class: com.google.android.gms.internal.ads.je4
        @Override // com.google.android.gms.internal.ads.vc4
        public final /* synthetic */ oc4[] a(Uri uri, Map map) {
            return uc4.a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.vc4
        public final oc4[] zza() {
            vc4 vc4Var = ke4.f7485q;
            return new oc4[]{new ke4()};
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private rc4 f7491f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7493h;

    /* renamed from: i, reason: collision with root package name */
    private long f7494i;

    /* renamed from: j, reason: collision with root package name */
    private int f7495j;

    /* renamed from: k, reason: collision with root package name */
    private int f7496k;

    /* renamed from: l, reason: collision with root package name */
    private int f7497l;

    /* renamed from: m, reason: collision with root package name */
    private long f7498m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f7499n;

    /* renamed from: o, reason: collision with root package name */
    private ie4 f7500o;

    /* renamed from: p, reason: collision with root package name */
    private oe4 f7501p;

    /* renamed from: a, reason: collision with root package name */
    private final dr2 f7486a = new dr2(4);

    /* renamed from: b, reason: collision with root package name */
    private final dr2 f7487b = new dr2(9);

    /* renamed from: c, reason: collision with root package name */
    private final dr2 f7488c = new dr2(11);

    /* renamed from: d, reason: collision with root package name */
    private final dr2 f7489d = new dr2();

    /* renamed from: e, reason: collision with root package name */
    private final le4 f7490e = new le4();

    /* renamed from: g, reason: collision with root package name */
    private int f7492g = 1;

    private final dr2 a(pc4 pc4Var) {
        if (this.f7497l > this.f7489d.j()) {
            dr2 dr2Var = this.f7489d;
            int j7 = dr2Var.j();
            dr2Var.d(new byte[Math.max(j7 + j7, this.f7497l)], 0);
        } else {
            this.f7489d.f(0);
        }
        this.f7489d.e(this.f7497l);
        ((jc4) pc4Var).m(this.f7489d.h(), 0, this.f7497l, false);
        return this.f7489d;
    }

    private final void b() {
        if (this.f7499n) {
            return;
        }
        this.f7491f.p(new od4(-9223372036854775807L, 0L));
        this.f7499n = true;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final boolean c(pc4 pc4Var) {
        jc4 jc4Var = (jc4) pc4Var;
        jc4Var.n(this.f7486a.h(), 0, 3, false);
        this.f7486a.f(0);
        if (this.f7486a.u() != 4607062) {
            return false;
        }
        jc4Var.n(this.f7486a.h(), 0, 2, false);
        this.f7486a.f(0);
        if ((this.f7486a.w() & 250) != 0) {
            return false;
        }
        jc4Var.n(this.f7486a.h(), 0, 4, false);
        this.f7486a.f(0);
        int m7 = this.f7486a.m();
        pc4Var.i();
        jc4 jc4Var2 = (jc4) pc4Var;
        jc4Var2.o(m7, false);
        jc4Var2.n(this.f7486a.h(), 0, 4, false);
        this.f7486a.f(0);
        return this.f7486a.m() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.oc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(pc4 pc4Var, md4 md4Var) {
        boolean c7;
        boolean z6;
        ne4 ne4Var;
        wu1.b(this.f7491f);
        while (true) {
            int i7 = this.f7492g;
            int i8 = 8;
            if (i7 != 1) {
                if (i7 == 2) {
                    ((jc4) pc4Var).p(this.f7495j, false);
                    this.f7495j = 0;
                    this.f7492g = 3;
                } else if (i7 != 3) {
                    if (i7 != 4) {
                        throw new IllegalStateException();
                    }
                    long j7 = this.f7493h ? this.f7494i + this.f7498m : this.f7490e.d() == -9223372036854775807L ? 0L : this.f7498m;
                    int i9 = this.f7496k;
                    if (i9 != 8) {
                        i8 = i9;
                    } else if (this.f7500o != null) {
                        b();
                        ne4Var = this.f7500o;
                        c7 = ne4Var.c(a(pc4Var), j7);
                        z6 = true;
                        if (!this.f7493h && c7) {
                            this.f7493h = true;
                            this.f7494i = this.f7490e.d() != -9223372036854775807L ? -this.f7498m : 0L;
                        }
                        this.f7495j = 4;
                        this.f7492g = 2;
                        if (!z6) {
                            return 0;
                        }
                    }
                    if (i8 == 9) {
                        if (this.f7501p != null) {
                            b();
                            ne4Var = this.f7501p;
                            c7 = ne4Var.c(a(pc4Var), j7);
                            z6 = true;
                            if (!this.f7493h) {
                                this.f7493h = true;
                                this.f7494i = this.f7490e.d() != -9223372036854775807L ? -this.f7498m : 0L;
                            }
                            this.f7495j = 4;
                            this.f7492g = 2;
                            if (!z6) {
                            }
                        }
                    } else if (i8 == 18 && !this.f7499n) {
                        c7 = this.f7490e.c(a(pc4Var), j7);
                        long d7 = this.f7490e.d();
                        if (d7 != -9223372036854775807L) {
                            this.f7491f.p(new id4(this.f7490e.e(), this.f7490e.f(), d7));
                            this.f7499n = true;
                        }
                        z6 = true;
                        if (!this.f7493h) {
                        }
                        this.f7495j = 4;
                        this.f7492g = 2;
                        if (!z6) {
                        }
                    }
                    ((jc4) pc4Var).p(this.f7497l, false);
                    c7 = false;
                    z6 = false;
                    if (!this.f7493h) {
                    }
                    this.f7495j = 4;
                    this.f7492g = 2;
                    if (!z6) {
                    }
                } else {
                    if (!pc4Var.m(this.f7488c.h(), 0, 11, true)) {
                        return -1;
                    }
                    this.f7488c.f(0);
                    this.f7496k = this.f7488c.s();
                    this.f7497l = this.f7488c.u();
                    this.f7498m = this.f7488c.u();
                    this.f7498m = ((this.f7488c.s() << 24) | this.f7498m) * 1000;
                    this.f7488c.g(3);
                    this.f7492g = 4;
                }
            } else {
                if (!pc4Var.m(this.f7487b.h(), 0, 9, true)) {
                    return -1;
                }
                this.f7487b.f(0);
                this.f7487b.g(4);
                int s7 = this.f7487b.s();
                int i10 = s7 & 1;
                if ((s7 & 4) != 0 && this.f7500o == null) {
                    this.f7500o = new ie4(this.f7491f.r(8, 1));
                }
                if (i10 != 0 && this.f7501p == null) {
                    this.f7501p = new oe4(this.f7491f.r(9, 2));
                }
                this.f7491f.H();
                this.f7495j = this.f7487b.m() - 5;
                this.f7492g = 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void g(rc4 rc4Var) {
        this.f7491f = rc4Var;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void h(long j7, long j8) {
        if (j7 == 0) {
            this.f7492g = 1;
            this.f7493h = false;
        } else {
            this.f7492g = 3;
        }
        this.f7495j = 0;
    }
}
