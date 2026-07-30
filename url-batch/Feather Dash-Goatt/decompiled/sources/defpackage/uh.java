package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class uh {
    public int a;
    public int b;
    public int c;
    public final Object d;

    public uh(th thVar) {
        this.c = 0;
        Charset charset = ia0.a;
        this.d = thVar;
        thVar.b = this;
    }

    public int a() {
        int i = this.c;
        if (i != 0) {
            this.a = i;
            this.c = 0;
        } else {
            this.a = ((th) this.d).u();
        }
        int i2 = this.a;
        if (i2 == 0 || i2 == this.b) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public int b(int i) {
        return ((bt0) this.d).c[this.b + i];
    }

    public Object c(int i) {
        return ((bt0) this.d).e[this.c + i];
    }

    public void d(Object obj, u61 u61Var, qw qwVar) {
        int i = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        try {
            u61Var.h(obj, this, qwVar);
            if (this.a == this.b) {
            } else {
                throw new sa0("Failed to parse the message.");
            }
        } finally {
            this.b = i;
        }
    }

    public void e(Object obj, u61 u61Var, qw qwVar) {
        th thVar = (th) this.d;
        int v = thVar.v();
        if (thVar.a >= 100) {
            throw new sa0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int e = thVar.e(v);
        thVar.a++;
        u61Var.h(obj, this, qwVar);
        thVar.a(0);
        thVar.a--;
        thVar.d(e);
    }

    public void f(ha0 ha0Var) {
        int u;
        th thVar = (th) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                ((j01) ha0Var).add(Boolean.valueOf(thVar.f()));
                if (thVar.c()) {
                    return;
                } else {
                    u = thVar.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw sa0.b();
        }
        int b = thVar.b() + thVar.v();
        do {
            ((j01) ha0Var).add(Boolean.valueOf(thVar.f()));
        } while (thVar.b() < b);
        x(b);
    }

    public ff g() {
        y(2);
        return ((th) this.d).g();
    }

    public void h(ha0 ha0Var) {
        int u;
        th thVar = (th) this.d;
        if ((this.a & 7) != 2) {
            throw sa0.b();
        }
        do {
            ((j01) ha0Var).add(g());
            if (thVar.c()) {
                return;
            } else {
                u = thVar.u();
            }
        } while (u == this.a);
        this.c = u;
    }

    public void i(ha0 ha0Var) {
        int u;
        th thVar = (th) this.d;
        int i = this.a & 7;
        if (i == 1) {
            do {
                ((j01) ha0Var).add(Double.valueOf(thVar.h()));
                if (thVar.c()) {
                    return;
                } else {
                    u = thVar.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw sa0.b();
        }
        int v = thVar.v();
        if ((v & 7) != 0) {
            throw new sa0("Failed to parse the message.");
        }
        int b = thVar.b() + v;
        do {
            ((j01) ha0Var).add(Double.valueOf(thVar.h()));
        } while (thVar.b() < b);
    }

    public void j(ha0 ha0Var) {
        int u;
        th thVar = (th) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                ((j01) ha0Var).add(Integer.valueOf(thVar.i()));
                if (thVar.c()) {
                    return;
                } else {
                    u = thVar.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw sa0.b();
        }
        int b = thVar.b() + thVar.v();
        do {
            ((j01) ha0Var).add(Integer.valueOf(thVar.i()));
        } while (thVar.b() < b);
        x(b);
    }

    public Object k(bq1 bq1Var, Class cls, qw qwVar) {
        th thVar = (th) this.d;
        switch (bq1Var.ordinal()) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                y(1);
                return Double.valueOf(thVar.h());
            case 1:
                y(5);
                return Float.valueOf(thVar.l());
            case 2:
                y(0);
                return Long.valueOf(thVar.n());
            case 3:
                y(0);
                return Long.valueOf(thVar.w());
            case 4:
                y(0);
                return Integer.valueOf(thVar.m());
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                y(1);
                return Long.valueOf(thVar.k());
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                y(5);
                return Integer.valueOf(thVar.j());
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                y(0);
                return Boolean.valueOf(thVar.f());
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                y(2);
                return thVar.t();
            case 9:
            default:
                dd0.e("unsupported field type.");
                return null;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                y(2);
                u61 a = i01.c.a(cls);
                m40 i = a.i();
                e(i, a, qwVar);
                a.c(i);
                return i;
            case RequestError.STOP_TRACKING /* 11 */:
                return g();
            case 12:
                y(0);
                return Integer.valueOf(thVar.v());
            case 13:
                y(0);
                return Integer.valueOf(thVar.i());
            case 14:
                y(5);
                return Integer.valueOf(thVar.o());
            case 15:
                y(1);
                return Long.valueOf(thVar.p());
            case 16:
                y(0);
                return Integer.valueOf(thVar.q());
            case 17:
                y(0);
                return Long.valueOf(thVar.r());
        }
    }

    public void l(ha0 ha0Var) {
        int u;
        th thVar = (th) this.d;
        int i = this.a & 7;
        if (i == 2) {
            int v = thVar.v();
            if ((v & 3) != 0) {
                throw new sa0("Failed to parse the message.");
            }
            int b = thVar.b() + v;
            do {
                ((j01) ha0Var).add(Integer.valueOf(thVar.j()));
            } while (thVar.b() < b);
            return;
        }
        if (i != 5) {
            throw sa0.b();
        }
        do {
            ((j01) ha0Var).add(Integer.valueOf(thVar.j()));
            if (thVar.c()) {
                return;
            } else {
                u = thVar.u();
            }
        } while (u == this.a);
        this.c = u;
    }

    public void m(ha0 ha0Var) {
        int u;
        th thVar = (th) this.d;
        int i = this.a & 7;
        if (i == 1) {
            do {
                ((j01) ha0Var).add(Long.valueOf(thVar.k()));
                if (thVar.c()) {
                    return;
                } else {
                    u = thVar.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw sa0.b();
        }
        int v = thVar.v();
        if ((v & 7) != 0) {
            throw new sa0("Failed to parse the message.");
        }
        int b = thVar.b() + v;
        do {
            ((j01) ha0Var).add(Long.valueOf(thVar.k()));
        } while (thVar.b() < b);
    }

    public void n(ha0 ha0Var) {
        int u;
        th thVar = (th) this.d;
        int i = this.a & 7;
        if (i == 2) {
            int v = thVar.v();
            if ((v & 3) != 0) {
                throw new sa0("Failed to parse the message.");
            }
            int b = thVar.b() + v;
            do {
                ((j01) ha0Var).add(Float.valueOf(thVar.l()));
            } while (thVar.b() < b);
            return;
        }
        if (i != 5) {
            throw sa0.b();
        }
        do {
            ((j01) ha0Var).add(Float.valueOf(thVar.l()));
            if (thVar.c()) {
                return;
            } else {
                u = thVar.u();
            }
        } while (u == this.a);
        this.c = u;
    }

    public void o(ha0 ha0Var) {
        int u;
        th thVar = (th) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                ((j01) ha0Var).add(Integer.valueOf(thVar.m()));
                if (thVar.c()) {
                    return;
                } else {
                    u = thVar.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw sa0.b();
        }
        int b = thVar.b() + thVar.v();
        do {
            ((j01) ha0Var).add(Integer.valueOf(thVar.m()));
        } while (thVar.b() < b);
        x(b);
    }

    public void p(ha0 ha0Var) {
        int u;
        th thVar = (th) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                ((j01) ha0Var).add(Long.valueOf(thVar.n()));
                if (thVar.c()) {
                    return;
                } else {
                    u = thVar.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw sa0.b();
        }
        int b = thVar.b() + thVar.v();
        do {
            ((j01) ha0Var).add(Long.valueOf(thVar.n()));
        } while (thVar.b() < b);
        x(b);
    }

    public void q(ha0 ha0Var) {
        int u;
        th thVar = (th) this.d;
        int i = this.a & 7;
        if (i == 2) {
            int v = thVar.v();
            if ((v & 3) != 0) {
                throw new sa0("Failed to parse the message.");
            }
            int b = thVar.b() + v;
            do {
                ((j01) ha0Var).add(Integer.valueOf(thVar.o()));
            } while (thVar.b() < b);
            return;
        }
        if (i != 5) {
            throw sa0.b();
        }
        do {
            ((j01) ha0Var).add(Integer.valueOf(thVar.o()));
            if (thVar.c()) {
                return;
            } else {
                u = thVar.u();
            }
        } while (u == this.a);
        this.c = u;
    }

    public void r(ha0 ha0Var) {
        int u;
        th thVar = (th) this.d;
        int i = this.a & 7;
        if (i == 1) {
            do {
                ((j01) ha0Var).add(Long.valueOf(thVar.p()));
                if (thVar.c()) {
                    return;
                } else {
                    u = thVar.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw sa0.b();
        }
        int v = thVar.v();
        if ((v & 7) != 0) {
            throw new sa0("Failed to parse the message.");
        }
        int b = thVar.b() + v;
        do {
            ((j01) ha0Var).add(Long.valueOf(thVar.p()));
        } while (thVar.b() < b);
    }

    public void s(ha0 ha0Var) {
        int u;
        th thVar = (th) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                ((j01) ha0Var).add(Integer.valueOf(thVar.q()));
                if (thVar.c()) {
                    return;
                } else {
                    u = thVar.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw sa0.b();
        }
        int b = thVar.b() + thVar.v();
        do {
            ((j01) ha0Var).add(Integer.valueOf(thVar.q()));
        } while (thVar.b() < b);
        x(b);
    }

    public void t(ha0 ha0Var) {
        int u;
        th thVar = (th) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                ((j01) ha0Var).add(Long.valueOf(thVar.r()));
                if (thVar.c()) {
                    return;
                } else {
                    u = thVar.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw sa0.b();
        }
        int b = thVar.b() + thVar.v();
        do {
            ((j01) ha0Var).add(Long.valueOf(thVar.r()));
        } while (thVar.b() < b);
        x(b);
    }

    public void u(ha0 ha0Var, boolean z) {
        String s;
        int u;
        th thVar = (th) this.d;
        if ((this.a & 7) != 2) {
            throw sa0.b();
        }
        do {
            if (z) {
                y(2);
                s = thVar.t();
            } else {
                y(2);
                s = thVar.s();
            }
            ((j01) ha0Var).add(s);
            if (thVar.c()) {
                return;
            } else {
                u = thVar.u();
            }
        } while (u == this.a);
        this.c = u;
    }

    public void v(ha0 ha0Var) {
        int u;
        th thVar = (th) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                ((j01) ha0Var).add(Integer.valueOf(thVar.v()));
                if (thVar.c()) {
                    return;
                } else {
                    u = thVar.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw sa0.b();
        }
        int b = thVar.b() + thVar.v();
        do {
            ((j01) ha0Var).add(Integer.valueOf(thVar.v()));
        } while (thVar.b() < b);
        x(b);
    }

    public void w(ha0 ha0Var) {
        int u;
        th thVar = (th) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                ((j01) ha0Var).add(Long.valueOf(thVar.w()));
                if (thVar.c()) {
                    return;
                } else {
                    u = thVar.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw sa0.b();
        }
        int b = thVar.b() + thVar.v();
        do {
            ((j01) ha0Var).add(Long.valueOf(thVar.w()));
        } while (thVar.b() < b);
        x(b);
    }

    public void x(int i) {
        if (((th) this.d).b() != i) {
            throw sa0.e();
        }
    }

    public void y(int i) {
        if ((this.a & 7) != i) {
            throw sa0.b();
        }
    }

    public boolean z() {
        int i;
        th thVar = (th) this.d;
        if (thVar.c() || (i = this.a) == this.b) {
            return false;
        }
        return thVar.x(i);
    }

    public uh(bt0 bt0Var) {
        this.d = bt0Var;
    }
}
