package g1;

import g1.i0;
import java.util.Collections;
import r0.n2;
import r0.s1;
import t0.a;

/* loaded from: classes.dex */
public final class s implements m {

    /* renamed from: a, reason: collision with root package name */
    private final String f16529a;

    /* renamed from: b, reason: collision with root package name */
    private final o2.a0 f16530b;

    /* renamed from: c, reason: collision with root package name */
    private final o2.z f16531c;

    /* renamed from: d, reason: collision with root package name */
    private w0.e0 f16532d;

    /* renamed from: e, reason: collision with root package name */
    private String f16533e;

    /* renamed from: f, reason: collision with root package name */
    private s1 f16534f;

    /* renamed from: g, reason: collision with root package name */
    private int f16535g;

    /* renamed from: h, reason: collision with root package name */
    private int f16536h;

    /* renamed from: i, reason: collision with root package name */
    private int f16537i;

    /* renamed from: j, reason: collision with root package name */
    private int f16538j;

    /* renamed from: k, reason: collision with root package name */
    private long f16539k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16540l;

    /* renamed from: m, reason: collision with root package name */
    private int f16541m;

    /* renamed from: n, reason: collision with root package name */
    private int f16542n;

    /* renamed from: o, reason: collision with root package name */
    private int f16543o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f16544p;

    /* renamed from: q, reason: collision with root package name */
    private long f16545q;

    /* renamed from: r, reason: collision with root package name */
    private int f16546r;

    /* renamed from: s, reason: collision with root package name */
    private long f16547s;

    /* renamed from: t, reason: collision with root package name */
    private int f16548t;

    /* renamed from: u, reason: collision with root package name */
    private String f16549u;

    public s(String str) {
        this.f16529a = str;
        o2.a0 a0Var = new o2.a0(1024);
        this.f16530b = a0Var;
        this.f16531c = new o2.z(a0Var.d());
        this.f16539k = -9223372036854775807L;
    }

    private static long b(o2.z zVar) {
        return zVar.h((zVar.h(2) + 1) * 8);
    }

    private void g(o2.z zVar) {
        if (!zVar.g()) {
            this.f16540l = true;
            l(zVar);
        } else if (!this.f16540l) {
            return;
        }
        if (this.f16541m != 0) {
            throw n2.a(null, null);
        }
        if (this.f16542n != 0) {
            throw n2.a(null, null);
        }
        k(zVar, j(zVar));
        if (this.f16544p) {
            zVar.r((int) this.f16545q);
        }
    }

    private int h(o2.z zVar) {
        int b7 = zVar.b();
        a.b e7 = t0.a.e(zVar, true);
        this.f16549u = e7.f21669c;
        this.f16546r = e7.f21667a;
        this.f16548t = e7.f21668b;
        return b7 - zVar.b();
    }

    private void i(o2.z zVar) {
        int i7;
        int h7 = zVar.h(3);
        this.f16543o = h7;
        if (h7 == 0) {
            i7 = 8;
        } else {
            if (h7 != 1) {
                if (h7 == 3 || h7 == 4 || h7 == 5) {
                    zVar.r(6);
                    return;
                } else {
                    if (h7 != 6 && h7 != 7) {
                        throw new IllegalStateException();
                    }
                    zVar.r(1);
                    return;
                }
            }
            i7 = 9;
        }
        zVar.r(i7);
    }

    private int j(o2.z zVar) {
        int h7;
        if (this.f16543o != 0) {
            throw n2.a(null, null);
        }
        int i7 = 0;
        do {
            h7 = zVar.h(8);
            i7 += h7;
        } while (h7 == 255);
        return i7;
    }

    private void k(o2.z zVar, int i7) {
        int e7 = zVar.e();
        if ((e7 & 7) == 0) {
            this.f16530b.O(e7 >> 3);
        } else {
            zVar.i(this.f16530b.d(), 0, i7 * 8);
            this.f16530b.O(0);
        }
        this.f16532d.d(this.f16530b, i7);
        long j7 = this.f16539k;
        if (j7 != -9223372036854775807L) {
            this.f16532d.b(j7, 1, i7, 0, null);
            this.f16539k += this.f16547s;
        }
    }

    private void l(o2.z zVar) {
        boolean g7;
        int h7 = zVar.h(1);
        int h8 = h7 == 1 ? zVar.h(1) : 0;
        this.f16541m = h8;
        if (h8 != 0) {
            throw n2.a(null, null);
        }
        if (h7 == 1) {
            b(zVar);
        }
        if (!zVar.g()) {
            throw n2.a(null, null);
        }
        this.f16542n = zVar.h(6);
        int h9 = zVar.h(4);
        int h10 = zVar.h(3);
        if (h9 != 0 || h10 != 0) {
            throw n2.a(null, null);
        }
        if (h7 == 0) {
            int e7 = zVar.e();
            int h11 = h(zVar);
            zVar.p(e7);
            byte[] bArr = new byte[(h11 + 7) / 8];
            zVar.i(bArr, 0, h11);
            s1 E = new s1.b().S(this.f16533e).e0("audio/mp4a-latm").I(this.f16549u).H(this.f16548t).f0(this.f16546r).T(Collections.singletonList(bArr)).V(this.f16529a).E();
            if (!E.equals(this.f16534f)) {
                this.f16534f = E;
                this.f16547s = 1024000000 / E.E;
                this.f16532d.e(E);
            }
        } else {
            zVar.r(((int) b(zVar)) - h(zVar));
        }
        i(zVar);
        boolean g8 = zVar.g();
        this.f16544p = g8;
        this.f16545q = 0L;
        if (g8) {
            if (h7 == 1) {
                this.f16545q = b(zVar);
            } else {
                do {
                    g7 = zVar.g();
                    this.f16545q = (this.f16545q << 8) + zVar.h(8);
                } while (g7);
            }
        }
        if (zVar.g()) {
            zVar.r(8);
        }
    }

    private void m(int i7) {
        this.f16530b.K(i7);
        this.f16531c.n(this.f16530b.d());
    }

    @Override // g1.m
    public void a() {
        this.f16535g = 0;
        this.f16539k = -9223372036854775807L;
        this.f16540l = false;
    }

    @Override // g1.m
    public void c(o2.a0 a0Var) {
        o2.a.h(this.f16532d);
        while (a0Var.a() > 0) {
            int i7 = this.f16535g;
            if (i7 != 0) {
                if (i7 == 1) {
                    int C = a0Var.C();
                    if ((C & 224) == 224) {
                        this.f16538j = C;
                        this.f16535g = 2;
                    } else if (C != 86) {
                        this.f16535g = 0;
                    }
                } else if (i7 == 2) {
                    int C2 = ((this.f16538j & (-225)) << 8) | a0Var.C();
                    this.f16537i = C2;
                    if (C2 > this.f16530b.d().length) {
                        m(this.f16537i);
                    }
                    this.f16536h = 0;
                    this.f16535g = 3;
                } else {
                    if (i7 != 3) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(a0Var.a(), this.f16537i - this.f16536h);
                    a0Var.j(this.f16531c.f19836a, this.f16536h, min);
                    int i8 = this.f16536h + min;
                    this.f16536h = i8;
                    if (i8 == this.f16537i) {
                        this.f16531c.p(0);
                        g(this.f16531c);
                        this.f16535g = 0;
                    }
                }
            } else if (a0Var.C() == 86) {
                this.f16535g = 1;
            }
        }
    }

    @Override // g1.m
    public void d(w0.n nVar, i0.d dVar) {
        dVar.a();
        this.f16532d = nVar.d(dVar.c(), 1);
        this.f16533e = dVar.b();
    }

    @Override // g1.m
    public void e() {
    }

    @Override // g1.m
    public void f(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f16539k = j7;
        }
    }
}
