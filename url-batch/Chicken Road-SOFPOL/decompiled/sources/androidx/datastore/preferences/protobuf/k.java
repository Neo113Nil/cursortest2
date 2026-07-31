package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f711a;

    /* renamed from: b, reason: collision with root package name */
    public int f712b;

    /* renamed from: c, reason: collision with root package name */
    public int f713c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f714d;

    public k(j jVar) {
        this.f713c = 0;
        Charset charset = y.f794a;
        this.f714d = jVar;
        jVar.f707e = this;
    }

    public int a() {
        int i = this.f713c;
        if (i != 0) {
            this.f711a = i;
            this.f713c = 0;
        } else {
            this.f711a = ((j) this.f714d).z();
        }
        int i8 = this.f711a;
        if (i8 == 0 || i8 == this.f712b) {
            return Integer.MAX_VALUE;
        }
        return i8 >>> 3;
    }

    public int b(int i) {
        return ((n0.l0) this.f714d).f5281d[this.f712b + i];
    }

    public Object c(int i) {
        return ((n0.l0) this.f714d).f5283f[this.f713c + i];
    }

    public void d(Object obj, x0 x0Var, o oVar) {
        int i = this.f712b;
        this.f712b = ((this.f711a >>> 3) << 3) | 4;
        try {
            x0Var.g(obj, this, oVar);
            if (this.f711a == this.f712b) {
            } else {
                throw new a0("Failed to parse the message.");
            }
        } finally {
            this.f712b = i;
        }
    }

    public void e(Object obj, x0 x0Var, o oVar) {
        j jVar = (j) this.f714d;
        int A = jVar.A();
        if (jVar.f706d >= 100) {
            throw new a0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i = jVar.i(A);
        jVar.f706d++;
        x0Var.g(obj, this, oVar);
        jVar.a(0);
        jVar.f706d--;
        jVar.h(i);
    }

    public void f(x xVar) {
        int z3;
        j jVar = (j) this.f714d;
        int i = this.f711a & 7;
        if (i == 0) {
            do {
                ((v0) xVar).add(Boolean.valueOf(jVar.j()));
                if (jVar.c()) {
                    return;
                } else {
                    z3 = jVar.z();
                }
            } while (z3 == this.f711a);
            this.f713c = z3;
            return;
        }
        if (i != 2) {
            throw a0.b();
        }
        int b8 = jVar.b() + jVar.A();
        do {
            ((v0) xVar).add(Boolean.valueOf(jVar.j()));
        } while (jVar.b() < b8);
        x(b8);
    }

    public g g() {
        y(2);
        return ((j) this.f714d).l();
    }

    public void h(x xVar) {
        int z3;
        j jVar = (j) this.f714d;
        if ((this.f711a & 7) != 2) {
            throw a0.b();
        }
        do {
            ((v0) xVar).add(g());
            if (jVar.c()) {
                return;
            } else {
                z3 = jVar.z();
            }
        } while (z3 == this.f711a);
        this.f713c = z3;
    }

    public void i(x xVar) {
        int z3;
        j jVar = (j) this.f714d;
        int i = this.f711a & 7;
        if (i == 1) {
            do {
                ((v0) xVar).add(Double.valueOf(jVar.m()));
                if (jVar.c()) {
                    return;
                } else {
                    z3 = jVar.z();
                }
            } while (z3 == this.f711a);
            this.f713c = z3;
            return;
        }
        if (i != 2) {
            throw a0.b();
        }
        int A = jVar.A();
        if ((A & 7) != 0) {
            throw new a0("Failed to parse the message.");
        }
        int b8 = jVar.b() + A;
        do {
            ((v0) xVar).add(Double.valueOf(jVar.m()));
        } while (jVar.b() < b8);
    }

    public void j(x xVar) {
        int z3;
        j jVar = (j) this.f714d;
        int i = this.f711a & 7;
        if (i == 0) {
            do {
                ((v0) xVar).add(Integer.valueOf(jVar.n()));
                if (jVar.c()) {
                    return;
                } else {
                    z3 = jVar.z();
                }
            } while (z3 == this.f711a);
            this.f713c = z3;
            return;
        }
        if (i != 2) {
            throw a0.b();
        }
        int b8 = jVar.b() + jVar.A();
        do {
            ((v0) xVar).add(Integer.valueOf(jVar.n()));
        } while (jVar.b() < b8);
        x(b8);
    }

    public Object k(s1 s1Var, Class cls, o oVar) {
        j jVar = (j) this.f714d;
        switch (s1Var.ordinal()) {
            case 0:
                y(1);
                return Double.valueOf(jVar.m());
            case 1:
                y(5);
                return Float.valueOf(jVar.q());
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                y(0);
                return Long.valueOf(jVar.s());
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                y(0);
                return Long.valueOf(jVar.B());
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                y(0);
                return Integer.valueOf(jVar.r());
            case 5:
                y(1);
                return Long.valueOf(jVar.p());
            case 6:
                y(5);
                return Integer.valueOf(jVar.o());
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                y(0);
                return Boolean.valueOf(jVar.j());
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                y(2);
                return jVar.y();
            case x.v0.f8304b /* 9 */:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case x.v0.f8306d /* 10 */:
                y(2);
                x0 a8 = u0.f784c.a(cls);
                w i = a8.i();
                e(i, a8, oVar);
                a8.d(i);
                return i;
            case 11:
                return g();
            case 12:
                y(0);
                return Integer.valueOf(jVar.A());
            case 13:
                y(0);
                return Integer.valueOf(jVar.n());
            case 14:
                y(5);
                return Integer.valueOf(jVar.t());
            case x.v0.f8308f /* 15 */:
                y(1);
                return Long.valueOf(jVar.u());
            case 16:
                y(0);
                return Integer.valueOf(jVar.v());
            case 17:
                y(0);
                return Long.valueOf(jVar.w());
        }
    }

    public void l(x xVar) {
        int z3;
        j jVar = (j) this.f714d;
        int i = this.f711a & 7;
        if (i == 2) {
            int A = jVar.A();
            if ((A & 3) != 0) {
                throw new a0("Failed to parse the message.");
            }
            int b8 = jVar.b() + A;
            do {
                ((v0) xVar).add(Integer.valueOf(jVar.o()));
            } while (jVar.b() < b8);
            return;
        }
        if (i != 5) {
            throw a0.b();
        }
        do {
            ((v0) xVar).add(Integer.valueOf(jVar.o()));
            if (jVar.c()) {
                return;
            } else {
                z3 = jVar.z();
            }
        } while (z3 == this.f711a);
        this.f713c = z3;
    }

    public void m(x xVar) {
        int z3;
        j jVar = (j) this.f714d;
        int i = this.f711a & 7;
        if (i == 1) {
            do {
                ((v0) xVar).add(Long.valueOf(jVar.p()));
                if (jVar.c()) {
                    return;
                } else {
                    z3 = jVar.z();
                }
            } while (z3 == this.f711a);
            this.f713c = z3;
            return;
        }
        if (i != 2) {
            throw a0.b();
        }
        int A = jVar.A();
        if ((A & 7) != 0) {
            throw new a0("Failed to parse the message.");
        }
        int b8 = jVar.b() + A;
        do {
            ((v0) xVar).add(Long.valueOf(jVar.p()));
        } while (jVar.b() < b8);
    }

    public void n(x xVar) {
        int z3;
        j jVar = (j) this.f714d;
        int i = this.f711a & 7;
        if (i == 2) {
            int A = jVar.A();
            if ((A & 3) != 0) {
                throw new a0("Failed to parse the message.");
            }
            int b8 = jVar.b() + A;
            do {
                ((v0) xVar).add(Float.valueOf(jVar.q()));
            } while (jVar.b() < b8);
            return;
        }
        if (i != 5) {
            throw a0.b();
        }
        do {
            ((v0) xVar).add(Float.valueOf(jVar.q()));
            if (jVar.c()) {
                return;
            } else {
                z3 = jVar.z();
            }
        } while (z3 == this.f711a);
        this.f713c = z3;
    }

    public void o(x xVar) {
        int z3;
        j jVar = (j) this.f714d;
        int i = this.f711a & 7;
        if (i == 0) {
            do {
                ((v0) xVar).add(Integer.valueOf(jVar.r()));
                if (jVar.c()) {
                    return;
                } else {
                    z3 = jVar.z();
                }
            } while (z3 == this.f711a);
            this.f713c = z3;
            return;
        }
        if (i != 2) {
            throw a0.b();
        }
        int b8 = jVar.b() + jVar.A();
        do {
            ((v0) xVar).add(Integer.valueOf(jVar.r()));
        } while (jVar.b() < b8);
        x(b8);
    }

    public void p(x xVar) {
        int z3;
        j jVar = (j) this.f714d;
        int i = this.f711a & 7;
        if (i == 0) {
            do {
                ((v0) xVar).add(Long.valueOf(jVar.s()));
                if (jVar.c()) {
                    return;
                } else {
                    z3 = jVar.z();
                }
            } while (z3 == this.f711a);
            this.f713c = z3;
            return;
        }
        if (i != 2) {
            throw a0.b();
        }
        int b8 = jVar.b() + jVar.A();
        do {
            ((v0) xVar).add(Long.valueOf(jVar.s()));
        } while (jVar.b() < b8);
        x(b8);
    }

    public void q(x xVar) {
        int z3;
        j jVar = (j) this.f714d;
        int i = this.f711a & 7;
        if (i == 2) {
            int A = jVar.A();
            if ((A & 3) != 0) {
                throw new a0("Failed to parse the message.");
            }
            int b8 = jVar.b() + A;
            do {
                ((v0) xVar).add(Integer.valueOf(jVar.t()));
            } while (jVar.b() < b8);
            return;
        }
        if (i != 5) {
            throw a0.b();
        }
        do {
            ((v0) xVar).add(Integer.valueOf(jVar.t()));
            if (jVar.c()) {
                return;
            } else {
                z3 = jVar.z();
            }
        } while (z3 == this.f711a);
        this.f713c = z3;
    }

    public void r(x xVar) {
        int z3;
        j jVar = (j) this.f714d;
        int i = this.f711a & 7;
        if (i == 1) {
            do {
                ((v0) xVar).add(Long.valueOf(jVar.u()));
                if (jVar.c()) {
                    return;
                } else {
                    z3 = jVar.z();
                }
            } while (z3 == this.f711a);
            this.f713c = z3;
            return;
        }
        if (i != 2) {
            throw a0.b();
        }
        int A = jVar.A();
        if ((A & 7) != 0) {
            throw new a0("Failed to parse the message.");
        }
        int b8 = jVar.b() + A;
        do {
            ((v0) xVar).add(Long.valueOf(jVar.u()));
        } while (jVar.b() < b8);
    }

    public void s(x xVar) {
        int z3;
        j jVar = (j) this.f714d;
        int i = this.f711a & 7;
        if (i == 0) {
            do {
                ((v0) xVar).add(Integer.valueOf(jVar.v()));
                if (jVar.c()) {
                    return;
                } else {
                    z3 = jVar.z();
                }
            } while (z3 == this.f711a);
            this.f713c = z3;
            return;
        }
        if (i != 2) {
            throw a0.b();
        }
        int b8 = jVar.b() + jVar.A();
        do {
            ((v0) xVar).add(Integer.valueOf(jVar.v()));
        } while (jVar.b() < b8);
        x(b8);
    }

    public void t(x xVar) {
        int z3;
        j jVar = (j) this.f714d;
        int i = this.f711a & 7;
        if (i == 0) {
            do {
                ((v0) xVar).add(Long.valueOf(jVar.w()));
                if (jVar.c()) {
                    return;
                } else {
                    z3 = jVar.z();
                }
            } while (z3 == this.f711a);
            this.f713c = z3;
            return;
        }
        if (i != 2) {
            throw a0.b();
        }
        int b8 = jVar.b() + jVar.A();
        do {
            ((v0) xVar).add(Long.valueOf(jVar.w()));
        } while (jVar.b() < b8);
        x(b8);
    }

    public void u(x xVar, boolean z3) {
        String x7;
        int z7;
        j jVar = (j) this.f714d;
        if ((this.f711a & 7) != 2) {
            throw a0.b();
        }
        do {
            if (z3) {
                y(2);
                x7 = jVar.y();
            } else {
                y(2);
                x7 = jVar.x();
            }
            ((v0) xVar).add(x7);
            if (jVar.c()) {
                return;
            } else {
                z7 = jVar.z();
            }
        } while (z7 == this.f711a);
        this.f713c = z7;
    }

    public void v(x xVar) {
        int z3;
        j jVar = (j) this.f714d;
        int i = this.f711a & 7;
        if (i == 0) {
            do {
                ((v0) xVar).add(Integer.valueOf(jVar.A()));
                if (jVar.c()) {
                    return;
                } else {
                    z3 = jVar.z();
                }
            } while (z3 == this.f711a);
            this.f713c = z3;
            return;
        }
        if (i != 2) {
            throw a0.b();
        }
        int b8 = jVar.b() + jVar.A();
        do {
            ((v0) xVar).add(Integer.valueOf(jVar.A()));
        } while (jVar.b() < b8);
        x(b8);
    }

    public void w(x xVar) {
        int z3;
        j jVar = (j) this.f714d;
        int i = this.f711a & 7;
        if (i == 0) {
            do {
                ((v0) xVar).add(Long.valueOf(jVar.B()));
                if (jVar.c()) {
                    return;
                } else {
                    z3 = jVar.z();
                }
            } while (z3 == this.f711a);
            this.f713c = z3;
            return;
        }
        if (i != 2) {
            throw a0.b();
        }
        int b8 = jVar.b() + jVar.A();
        do {
            ((v0) xVar).add(Long.valueOf(jVar.B()));
        } while (jVar.b() < b8);
        x(b8);
    }

    public void x(int i) {
        if (((j) this.f714d).b() != i) {
            throw a0.e();
        }
    }

    public void y(int i) {
        if ((this.f711a & 7) != i) {
            throw a0.b();
        }
    }

    public boolean z() {
        int i;
        j jVar = (j) this.f714d;
        if (jVar.c() || (i = this.f711a) == this.f712b) {
            return false;
        }
        return jVar.C(i);
    }

    public k(n0.l0 l0Var) {
        this.f714d = l0Var;
    }

    public k(int i, Class cls, int i8, int i9) {
        this.f711a = i;
        this.f714d = cls;
        this.f713c = i8;
        this.f712b = i9;
    }
}
