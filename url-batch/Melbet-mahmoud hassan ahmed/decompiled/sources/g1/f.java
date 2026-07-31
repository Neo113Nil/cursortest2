package g1;

import g1.i0;
import r0.s1;
import t0.c;

/* loaded from: classes.dex */
public final class f implements m {

    /* renamed from: a, reason: collision with root package name */
    private final o2.z f16280a;

    /* renamed from: b, reason: collision with root package name */
    private final o2.a0 f16281b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16282c;

    /* renamed from: d, reason: collision with root package name */
    private String f16283d;

    /* renamed from: e, reason: collision with root package name */
    private w0.e0 f16284e;

    /* renamed from: f, reason: collision with root package name */
    private int f16285f;

    /* renamed from: g, reason: collision with root package name */
    private int f16286g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16287h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16288i;

    /* renamed from: j, reason: collision with root package name */
    private long f16289j;

    /* renamed from: k, reason: collision with root package name */
    private s1 f16290k;

    /* renamed from: l, reason: collision with root package name */
    private int f16291l;

    /* renamed from: m, reason: collision with root package name */
    private long f16292m;

    public f() {
        this(null);
    }

    public f(String str) {
        o2.z zVar = new o2.z(new byte[16]);
        this.f16280a = zVar;
        this.f16281b = new o2.a0(zVar.f19836a);
        this.f16285f = 0;
        this.f16286g = 0;
        this.f16287h = false;
        this.f16288i = false;
        this.f16292m = -9223372036854775807L;
        this.f16282c = str;
    }

    private boolean b(o2.a0 a0Var, byte[] bArr, int i7) {
        int min = Math.min(a0Var.a(), i7 - this.f16286g);
        a0Var.j(bArr, this.f16286g, min);
        int i8 = this.f16286g + min;
        this.f16286g = i8;
        return i8 == i7;
    }

    private void g() {
        this.f16280a.p(0);
        c.b d7 = t0.c.d(this.f16280a);
        s1 s1Var = this.f16290k;
        if (s1Var == null || d7.f21700c != s1Var.D || d7.f21699b != s1Var.E || !"audio/ac4".equals(s1Var.f20956q)) {
            s1 E = new s1.b().S(this.f16283d).e0("audio/ac4").H(d7.f21700c).f0(d7.f21699b).V(this.f16282c).E();
            this.f16290k = E;
            this.f16284e.e(E);
        }
        this.f16291l = d7.f21701d;
        this.f16289j = (d7.f21702e * 1000000) / this.f16290k.E;
    }

    private boolean h(o2.a0 a0Var) {
        int C;
        while (true) {
            if (a0Var.a() <= 0) {
                return false;
            }
            if (this.f16287h) {
                C = a0Var.C();
                this.f16287h = C == 172;
                if (C == 64 || C == 65) {
                    break;
                }
            } else {
                this.f16287h = a0Var.C() == 172;
            }
        }
        this.f16288i = C == 65;
        return true;
    }

    @Override // g1.m
    public void a() {
        this.f16285f = 0;
        this.f16286g = 0;
        this.f16287h = false;
        this.f16288i = false;
        this.f16292m = -9223372036854775807L;
    }

    @Override // g1.m
    public void c(o2.a0 a0Var) {
        o2.a.h(this.f16284e);
        while (a0Var.a() > 0) {
            int i7 = this.f16285f;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int min = Math.min(a0Var.a(), this.f16291l - this.f16286g);
                        this.f16284e.d(a0Var, min);
                        int i8 = this.f16286g + min;
                        this.f16286g = i8;
                        int i9 = this.f16291l;
                        if (i8 == i9) {
                            long j7 = this.f16292m;
                            if (j7 != -9223372036854775807L) {
                                this.f16284e.b(j7, 1, i9, 0, null);
                                this.f16292m += this.f16289j;
                            }
                            this.f16285f = 0;
                        }
                    }
                } else if (b(a0Var, this.f16281b.d(), 16)) {
                    g();
                    this.f16281b.O(0);
                    this.f16284e.d(this.f16281b, 16);
                    this.f16285f = 2;
                }
            } else if (h(a0Var)) {
                this.f16285f = 1;
                this.f16281b.d()[0] = -84;
                this.f16281b.d()[1] = (byte) (this.f16288i ? 65 : 64);
                this.f16286g = 2;
            }
        }
    }

    @Override // g1.m
    public void d(w0.n nVar, i0.d dVar) {
        dVar.a();
        this.f16283d = dVar.b();
        this.f16284e = nVar.d(dVar.c(), 1);
    }

    @Override // g1.m
    public void e() {
    }

    @Override // g1.m
    public void f(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f16292m = j7;
        }
    }
}
