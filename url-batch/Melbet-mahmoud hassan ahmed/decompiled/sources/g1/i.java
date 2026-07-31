package g1;

import g1.i0;
import java.util.Arrays;
import java.util.Collections;
import o2.m0;
import r0.s1;
import t0.a;

/* loaded from: classes.dex */
public final class i implements m {

    /* renamed from: v, reason: collision with root package name */
    private static final byte[] f16344v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16345a;

    /* renamed from: b, reason: collision with root package name */
    private final o2.z f16346b;

    /* renamed from: c, reason: collision with root package name */
    private final o2.a0 f16347c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16348d;

    /* renamed from: e, reason: collision with root package name */
    private String f16349e;

    /* renamed from: f, reason: collision with root package name */
    private w0.e0 f16350f;

    /* renamed from: g, reason: collision with root package name */
    private w0.e0 f16351g;

    /* renamed from: h, reason: collision with root package name */
    private int f16352h;

    /* renamed from: i, reason: collision with root package name */
    private int f16353i;

    /* renamed from: j, reason: collision with root package name */
    private int f16354j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16355k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16356l;

    /* renamed from: m, reason: collision with root package name */
    private int f16357m;

    /* renamed from: n, reason: collision with root package name */
    private int f16358n;

    /* renamed from: o, reason: collision with root package name */
    private int f16359o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f16360p;

    /* renamed from: q, reason: collision with root package name */
    private long f16361q;

    /* renamed from: r, reason: collision with root package name */
    private int f16362r;

    /* renamed from: s, reason: collision with root package name */
    private long f16363s;

    /* renamed from: t, reason: collision with root package name */
    private w0.e0 f16364t;

    /* renamed from: u, reason: collision with root package name */
    private long f16365u;

    public i(boolean z6) {
        this(z6, null);
    }

    public i(boolean z6, String str) {
        this.f16346b = new o2.z(new byte[7]);
        this.f16347c = new o2.a0(Arrays.copyOf(f16344v, 10));
        s();
        this.f16357m = -1;
        this.f16358n = -1;
        this.f16361q = -9223372036854775807L;
        this.f16363s = -9223372036854775807L;
        this.f16345a = z6;
        this.f16348d = str;
    }

    private void b() {
        o2.a.e(this.f16350f);
        m0.j(this.f16364t);
        m0.j(this.f16351g);
    }

    private void g(o2.a0 a0Var) {
        if (a0Var.a() == 0) {
            return;
        }
        this.f16346b.f19836a[0] = a0Var.d()[a0Var.e()];
        this.f16346b.p(2);
        int h7 = this.f16346b.h(4);
        int i7 = this.f16358n;
        if (i7 != -1 && h7 != i7) {
            q();
            return;
        }
        if (!this.f16356l) {
            this.f16356l = true;
            this.f16357m = this.f16359o;
            this.f16358n = h7;
        }
        t();
    }

    private boolean h(o2.a0 a0Var, int i7) {
        a0Var.O(i7 + 1);
        if (!w(a0Var, this.f16346b.f19836a, 1)) {
            return false;
        }
        this.f16346b.p(4);
        int h7 = this.f16346b.h(1);
        int i8 = this.f16357m;
        if (i8 != -1 && h7 != i8) {
            return false;
        }
        if (this.f16358n != -1) {
            if (!w(a0Var, this.f16346b.f19836a, 1)) {
                return true;
            }
            this.f16346b.p(2);
            if (this.f16346b.h(4) != this.f16358n) {
                return false;
            }
            a0Var.O(i7 + 2);
        }
        if (!w(a0Var, this.f16346b.f19836a, 4)) {
            return true;
        }
        this.f16346b.p(14);
        int h8 = this.f16346b.h(13);
        if (h8 < 7) {
            return false;
        }
        byte[] d7 = a0Var.d();
        int f7 = a0Var.f();
        int i9 = i7 + h8;
        if (i9 >= f7) {
            return true;
        }
        if (d7[i9] == -1) {
            int i10 = i9 + 1;
            if (i10 == f7) {
                return true;
            }
            return l((byte) -1, d7[i10]) && ((d7[i10] & 8) >> 3) == h7;
        }
        if (d7[i9] != 73) {
            return false;
        }
        int i11 = i9 + 1;
        if (i11 == f7) {
            return true;
        }
        if (d7[i11] != 68) {
            return false;
        }
        int i12 = i9 + 2;
        return i12 == f7 || d7[i12] == 51;
    }

    private boolean i(o2.a0 a0Var, byte[] bArr, int i7) {
        int min = Math.min(a0Var.a(), i7 - this.f16353i);
        a0Var.j(bArr, this.f16353i, min);
        int i8 = this.f16353i + min;
        this.f16353i = i8;
        return i8 == i7;
    }

    private void j(o2.a0 a0Var) {
        int i7;
        byte[] d7 = a0Var.d();
        int e7 = a0Var.e();
        int f7 = a0Var.f();
        while (e7 < f7) {
            int i8 = e7 + 1;
            int i9 = d7[e7] & 255;
            if (this.f16354j == 512 && l((byte) -1, (byte) i9) && (this.f16356l || h(a0Var, i8 - 2))) {
                this.f16359o = (i9 & 8) >> 3;
                this.f16355k = (i9 & 1) == 0;
                if (this.f16356l) {
                    t();
                } else {
                    r();
                }
                a0Var.O(i8);
                return;
            }
            int i10 = this.f16354j;
            int i11 = i9 | i10;
            if (i11 != 329) {
                if (i11 == 511) {
                    this.f16354j = 512;
                } else if (i11 == 836) {
                    i7 = 1024;
                } else if (i11 == 1075) {
                    u();
                    a0Var.O(i8);
                    return;
                } else if (i10 != 256) {
                    this.f16354j = 256;
                    i8--;
                }
                e7 = i8;
            } else {
                i7 = 768;
            }
            this.f16354j = i7;
            e7 = i8;
        }
        a0Var.O(e7);
    }

    private boolean l(byte b7, byte b8) {
        return m(((b7 & 255) << 8) | (b8 & 255));
    }

    public static boolean m(int i7) {
        return (i7 & 65526) == 65520;
    }

    private void n() {
        this.f16346b.p(0);
        if (this.f16360p) {
            this.f16346b.r(10);
        } else {
            int h7 = this.f16346b.h(2) + 1;
            if (h7 != 2) {
                o2.r.i("AdtsReader", "Detected audio object type: " + h7 + ", but assuming AAC LC.");
                h7 = 2;
            }
            this.f16346b.r(5);
            byte[] b7 = t0.a.b(h7, this.f16358n, this.f16346b.h(3));
            a.b f7 = t0.a.f(b7);
            s1 E = new s1.b().S(this.f16349e).e0("audio/mp4a-latm").I(f7.f21669c).H(f7.f21668b).f0(f7.f21667a).T(Collections.singletonList(b7)).V(this.f16348d).E();
            this.f16361q = 1024000000 / E.E;
            this.f16350f.e(E);
            this.f16360p = true;
        }
        this.f16346b.r(4);
        int h8 = (this.f16346b.h(13) - 2) - 5;
        if (this.f16355k) {
            h8 -= 2;
        }
        v(this.f16350f, this.f16361q, 0, h8);
    }

    private void o() {
        this.f16351g.d(this.f16347c, 10);
        this.f16347c.O(6);
        v(this.f16351g, 0L, 10, this.f16347c.B() + 10);
    }

    private void p(o2.a0 a0Var) {
        int min = Math.min(a0Var.a(), this.f16362r - this.f16353i);
        this.f16364t.d(a0Var, min);
        int i7 = this.f16353i + min;
        this.f16353i = i7;
        int i8 = this.f16362r;
        if (i7 == i8) {
            long j7 = this.f16363s;
            if (j7 != -9223372036854775807L) {
                this.f16364t.b(j7, 1, i8, 0, null);
                this.f16363s += this.f16365u;
            }
            s();
        }
    }

    private void q() {
        this.f16356l = false;
        s();
    }

    private void r() {
        this.f16352h = 1;
        this.f16353i = 0;
    }

    private void s() {
        this.f16352h = 0;
        this.f16353i = 0;
        this.f16354j = 256;
    }

    private void t() {
        this.f16352h = 3;
        this.f16353i = 0;
    }

    private void u() {
        this.f16352h = 2;
        this.f16353i = f16344v.length;
        this.f16362r = 0;
        this.f16347c.O(0);
    }

    private void v(w0.e0 e0Var, long j7, int i7, int i8) {
        this.f16352h = 4;
        this.f16353i = i7;
        this.f16364t = e0Var;
        this.f16365u = j7;
        this.f16362r = i8;
    }

    private boolean w(o2.a0 a0Var, byte[] bArr, int i7) {
        if (a0Var.a() < i7) {
            return false;
        }
        a0Var.j(bArr, 0, i7);
        return true;
    }

    @Override // g1.m
    public void a() {
        this.f16363s = -9223372036854775807L;
        q();
    }

    @Override // g1.m
    public void c(o2.a0 a0Var) {
        b();
        while (a0Var.a() > 0) {
            int i7 = this.f16352h;
            if (i7 == 0) {
                j(a0Var);
            } else if (i7 == 1) {
                g(a0Var);
            } else if (i7 != 2) {
                if (i7 == 3) {
                    if (i(a0Var, this.f16346b.f19836a, this.f16355k ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i7 != 4) {
                        throw new IllegalStateException();
                    }
                    p(a0Var);
                }
            } else if (i(a0Var, this.f16347c.d(), 10)) {
                o();
            }
        }
    }

    @Override // g1.m
    public void d(w0.n nVar, i0.d dVar) {
        dVar.a();
        this.f16349e = dVar.b();
        w0.e0 d7 = nVar.d(dVar.c(), 1);
        this.f16350f = d7;
        this.f16364t = d7;
        if (!this.f16345a) {
            this.f16351g = new w0.k();
            return;
        }
        dVar.a();
        w0.e0 d8 = nVar.d(dVar.c(), 5);
        this.f16351g = d8;
        d8.e(new s1.b().S(dVar.b()).e0("application/id3").E());
    }

    @Override // g1.m
    public void e() {
    }

    @Override // g1.m
    public void f(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f16363s = j7;
        }
    }

    public long k() {
        return this.f16361q;
    }
}
