package g1;

import g1.i0;
import o2.m0;
import r0.s1;
import t0.b;

/* loaded from: classes.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name */
    private final o2.z f16251a;

    /* renamed from: b, reason: collision with root package name */
    private final o2.a0 f16252b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16253c;

    /* renamed from: d, reason: collision with root package name */
    private String f16254d;

    /* renamed from: e, reason: collision with root package name */
    private w0.e0 f16255e;

    /* renamed from: f, reason: collision with root package name */
    private int f16256f;

    /* renamed from: g, reason: collision with root package name */
    private int f16257g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16258h;

    /* renamed from: i, reason: collision with root package name */
    private long f16259i;

    /* renamed from: j, reason: collision with root package name */
    private s1 f16260j;

    /* renamed from: k, reason: collision with root package name */
    private int f16261k;

    /* renamed from: l, reason: collision with root package name */
    private long f16262l;

    public c() {
        this(null);
    }

    public c(String str) {
        o2.z zVar = new o2.z(new byte[128]);
        this.f16251a = zVar;
        this.f16252b = new o2.a0(zVar.f19836a);
        this.f16256f = 0;
        this.f16262l = -9223372036854775807L;
        this.f16253c = str;
    }

    private boolean b(o2.a0 a0Var, byte[] bArr, int i7) {
        int min = Math.min(a0Var.a(), i7 - this.f16257g);
        a0Var.j(bArr, this.f16257g, min);
        int i8 = this.f16257g + min;
        this.f16257g = i8;
        return i8 == i7;
    }

    private void g() {
        this.f16251a.p(0);
        b.C0137b e7 = t0.b.e(this.f16251a);
        s1 s1Var = this.f16260j;
        if (s1Var == null || e7.f21691d != s1Var.D || e7.f21690c != s1Var.E || !m0.c(e7.f21688a, s1Var.f20956q)) {
            s1 E = new s1.b().S(this.f16254d).e0(e7.f21688a).H(e7.f21691d).f0(e7.f21690c).V(this.f16253c).E();
            this.f16260j = E;
            this.f16255e.e(E);
        }
        this.f16261k = e7.f21692e;
        this.f16259i = (e7.f21693f * 1000000) / this.f16260j.E;
    }

    private boolean h(o2.a0 a0Var) {
        while (true) {
            boolean z6 = false;
            if (a0Var.a() <= 0) {
                return false;
            }
            if (this.f16258h) {
                int C = a0Var.C();
                if (C == 119) {
                    this.f16258h = false;
                    return true;
                }
                if (C != 11) {
                    this.f16258h = z6;
                }
                z6 = true;
                this.f16258h = z6;
            } else {
                if (a0Var.C() != 11) {
                    this.f16258h = z6;
                }
                z6 = true;
                this.f16258h = z6;
            }
        }
    }

    @Override // g1.m
    public void a() {
        this.f16256f = 0;
        this.f16257g = 0;
        this.f16258h = false;
        this.f16262l = -9223372036854775807L;
    }

    @Override // g1.m
    public void c(o2.a0 a0Var) {
        o2.a.h(this.f16255e);
        while (a0Var.a() > 0) {
            int i7 = this.f16256f;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int min = Math.min(a0Var.a(), this.f16261k - this.f16257g);
                        this.f16255e.d(a0Var, min);
                        int i8 = this.f16257g + min;
                        this.f16257g = i8;
                        int i9 = this.f16261k;
                        if (i8 == i9) {
                            long j7 = this.f16262l;
                            if (j7 != -9223372036854775807L) {
                                this.f16255e.b(j7, 1, i9, 0, null);
                                this.f16262l += this.f16259i;
                            }
                            this.f16256f = 0;
                        }
                    }
                } else if (b(a0Var, this.f16252b.d(), 128)) {
                    g();
                    this.f16252b.O(0);
                    this.f16255e.d(this.f16252b, 128);
                    this.f16256f = 2;
                }
            } else if (h(a0Var)) {
                this.f16256f = 1;
                this.f16252b.d()[0] = 11;
                this.f16252b.d()[1] = 119;
                this.f16257g = 2;
            }
        }
    }

    @Override // g1.m
    public void d(w0.n nVar, i0.d dVar) {
        dVar.a();
        this.f16254d = dVar.b();
        this.f16255e = nVar.d(dVar.c(), 1);
    }

    @Override // g1.m
    public void e() {
    }

    @Override // g1.m
    public void f(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f16262l = j7;
        }
    }
}
