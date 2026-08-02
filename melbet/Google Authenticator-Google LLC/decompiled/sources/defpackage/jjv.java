package defpackage;

import android.view.View;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjv {
    public int a;
    public int b;
    public int c;
    public final Object d;

    private jjv(jju jjuVar) {
        this.c = 0;
        this.d = jjuVar;
        jjuVar.e = this;
    }

    private final void S(Object obj, jlz jlzVar, jkd jkdVar) {
        jju jjuVar = (jju) this.d;
        jjuVar.M();
        int i = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        jjuVar.b++;
        try {
            jlzVar.i(obj, this, jkdVar);
            if (this.a == this.b) {
            } else {
                throw new jld("Failed to parse the message.");
            }
        } finally {
            jju jjuVar2 = (jju) this.d;
            jjuVar2.b--;
            this.b = i;
        }
    }

    private final void T(Object obj, jlz jlzVar, jkd jkdVar) {
        jju jjuVar = (jju) this.d;
        int r = jjuVar.r();
        jjuVar.M();
        int f = jjuVar.f(r);
        jjuVar.a++;
        jlzVar.i(obj, this, jkdVar);
        jjuVar.D(0);
        jjuVar.a--;
        jjuVar.E(f);
    }

    private final void U(int i) {
        if (((jju) this.d).e() != i) {
            throw new jld("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void V(int i) {
        if ((i & 3) != 0) {
            throw new jld("Failed to parse the message.");
        }
    }

    private static final void W(int i) {
        if ((i & 7) != 0) {
            throw new jld("Failed to parse the message.");
        }
    }

    public static jjv p(jju jjuVar) {
        Object obj = jjuVar.e;
        return obj != null ? (jjv) obj : new jjv(jjuVar);
    }

    public final void A(List list) {
        int q;
        int i;
        if (list instanceof jkq) {
            jkq jkqVar = (jkq) list;
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new jlc();
                }
                jju jjuVar = (jju) this.d;
                int e = jjuVar.e() + jjuVar.r();
                do {
                    jkqVar.g(jjuVar.g());
                } while (jjuVar.e() < e);
                U(e);
                return;
            }
            do {
                jju jjuVar2 = (jju) this.d;
                jkqVar.g(jjuVar2.g());
                if (jjuVar2.G()) {
                    return;
                } else {
                    i = jjuVar2.q();
                }
            } while (i == this.a);
        } else {
            int i3 = this.a & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new jlc();
                }
                jju jjuVar3 = (jju) this.d;
                int e2 = jjuVar3.e() + jjuVar3.r();
                do {
                    list.add(Integer.valueOf(jjuVar3.g()));
                } while (jjuVar3.e() < e2);
                U(e2);
                return;
            }
            do {
                jju jjuVar4 = (jju) this.d;
                list.add(Integer.valueOf(jjuVar4.g()));
                if (jjuVar4.G()) {
                    return;
                } else {
                    q = jjuVar4.q();
                }
            } while (q == this.a);
            i = q;
        }
        this.c = i;
    }

    public final void B(List list) {
        int q;
        int i;
        if (list instanceof jkq) {
            jkq jkqVar = (jkq) list;
            int i2 = this.a & 7;
            if (i2 == 2) {
                jju jjuVar = (jju) this.d;
                int r = jjuVar.r();
                V(r);
                int e = jjuVar.e() + r;
                do {
                    jkqVar.g(jjuVar.h());
                } while (jjuVar.e() < e);
                return;
            }
            if (i2 != 5) {
                throw new jlc();
            }
            do {
                jju jjuVar2 = (jju) this.d;
                jkqVar.g(jjuVar2.h());
                if (jjuVar2.G()) {
                    return;
                } else {
                    i = jjuVar2.q();
                }
            } while (i == this.a);
        } else {
            int i3 = this.a & 7;
            if (i3 == 2) {
                jju jjuVar3 = (jju) this.d;
                int r2 = jjuVar3.r();
                V(r2);
                int e2 = jjuVar3.e() + r2;
                do {
                    list.add(Integer.valueOf(jjuVar3.h()));
                } while (jjuVar3.e() < e2);
                return;
            }
            if (i3 != 5) {
                throw new jlc();
            }
            do {
                jju jjuVar4 = (jju) this.d;
                list.add(Integer.valueOf(jjuVar4.h()));
                if (jjuVar4.G()) {
                    return;
                } else {
                    q = jjuVar4.q();
                }
            } while (q == this.a);
            i = q;
        }
        this.c = i;
    }

    public final void C(List list) {
        int q;
        int i;
        if (list instanceof jlh) {
            jlh jlhVar = (jlh) list;
            int i2 = this.a & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new jlc();
                }
                jju jjuVar = (jju) this.d;
                int r = jjuVar.r();
                W(r);
                int e = jjuVar.e() + r;
                do {
                    jlhVar.e(jjuVar.t());
                } while (jjuVar.e() < e);
                return;
            }
            do {
                jju jjuVar2 = (jju) this.d;
                jlhVar.e(jjuVar2.t());
                if (jjuVar2.G()) {
                    return;
                } else {
                    i = jjuVar2.q();
                }
            } while (i == this.a);
        } else {
            int i3 = this.a & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new jlc();
                }
                jju jjuVar3 = (jju) this.d;
                int r2 = jjuVar3.r();
                W(r2);
                int e2 = jjuVar3.e() + r2;
                do {
                    list.add(Long.valueOf(jjuVar3.t()));
                } while (jjuVar3.e() < e2);
                return;
            }
            do {
                jju jjuVar4 = (jju) this.d;
                list.add(Long.valueOf(jjuVar4.t()));
                if (jjuVar4.G()) {
                    return;
                } else {
                    q = jjuVar4.q();
                }
            } while (q == this.a);
            i = q;
        }
        this.c = i;
    }

    public final void D(List list) {
        int q;
        int i;
        if (list instanceof jkh) {
            jkh jkhVar = (jkh) list;
            int i2 = this.a & 7;
            if (i2 == 2) {
                jju jjuVar = (jju) this.d;
                int r = jjuVar.r();
                V(r);
                int e = jjuVar.e() + r;
                do {
                    jkhVar.f(jjuVar.c());
                } while (jjuVar.e() < e);
                return;
            }
            if (i2 != 5) {
                throw new jlc();
            }
            do {
                jju jjuVar2 = (jju) this.d;
                jkhVar.f(jjuVar2.c());
                if (jjuVar2.G()) {
                    return;
                } else {
                    i = jjuVar2.q();
                }
            } while (i == this.a);
        } else {
            int i3 = this.a & 7;
            if (i3 == 2) {
                jju jjuVar3 = (jju) this.d;
                int r2 = jjuVar3.r();
                V(r2);
                int e2 = jjuVar3.e() + r2;
                do {
                    list.add(Float.valueOf(jjuVar3.c()));
                } while (jjuVar3.e() < e2);
                return;
            }
            if (i3 != 5) {
                throw new jlc();
            }
            do {
                jju jjuVar4 = (jju) this.d;
                list.add(Float.valueOf(jjuVar4.c()));
                if (jjuVar4.G()) {
                    return;
                } else {
                    q = jjuVar4.q();
                }
            } while (q == this.a);
            i = q;
        }
        this.c = i;
    }

    public final void E(List list) {
        int q;
        int i;
        if (list instanceof jkq) {
            jkq jkqVar = (jkq) list;
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new jlc();
                }
                jju jjuVar = (jju) this.d;
                int e = jjuVar.e() + jjuVar.r();
                do {
                    jkqVar.g(jjuVar.i());
                } while (jjuVar.e() < e);
                U(e);
                return;
            }
            do {
                jju jjuVar2 = (jju) this.d;
                jkqVar.g(jjuVar2.i());
                if (jjuVar2.G()) {
                    return;
                } else {
                    i = jjuVar2.q();
                }
            } while (i == this.a);
        } else {
            int i3 = this.a & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new jlc();
                }
                jju jjuVar3 = (jju) this.d;
                int e2 = jjuVar3.e() + jjuVar3.r();
                do {
                    list.add(Integer.valueOf(jjuVar3.i()));
                } while (jjuVar3.e() < e2);
                U(e2);
                return;
            }
            do {
                jju jjuVar4 = (jju) this.d;
                list.add(Integer.valueOf(jjuVar4.i()));
                if (jjuVar4.G()) {
                    return;
                } else {
                    q = jjuVar4.q();
                }
            } while (q == this.a);
            i = q;
        }
        this.c = i;
    }

    public final void F(List list) {
        int q;
        int i;
        if (list instanceof jlh) {
            jlh jlhVar = (jlh) list;
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new jlc();
                }
                jju jjuVar = (jju) this.d;
                int e = jjuVar.e() + jjuVar.r();
                do {
                    jlhVar.e(jjuVar.u());
                } while (jjuVar.e() < e);
                U(e);
                return;
            }
            do {
                jju jjuVar2 = (jju) this.d;
                jlhVar.e(jjuVar2.u());
                if (jjuVar2.G()) {
                    return;
                } else {
                    i = jjuVar2.q();
                }
            } while (i == this.a);
        } else {
            int i3 = this.a & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new jlc();
                }
                jju jjuVar3 = (jju) this.d;
                int e2 = jjuVar3.e() + jjuVar3.r();
                do {
                    list.add(Long.valueOf(jjuVar3.u()));
                } while (jjuVar3.e() < e2);
                U(e2);
                return;
            }
            do {
                jju jjuVar4 = (jju) this.d;
                list.add(Long.valueOf(jjuVar4.u()));
                if (jjuVar4.G()) {
                    return;
                } else {
                    q = jjuVar4.q();
                }
            } while (q == this.a);
            i = q;
        }
        this.c = i;
    }

    public final void G(List list) {
        int q;
        int i;
        if (list instanceof jkq) {
            jkq jkqVar = (jkq) list;
            int i2 = this.a & 7;
            if (i2 == 2) {
                jju jjuVar = (jju) this.d;
                int r = jjuVar.r();
                V(r);
                int e = jjuVar.e() + r;
                do {
                    jkqVar.g(jjuVar.o());
                } while (jjuVar.e() < e);
                return;
            }
            if (i2 != 5) {
                throw new jlc();
            }
            do {
                jju jjuVar2 = (jju) this.d;
                jkqVar.g(jjuVar2.o());
                if (jjuVar2.G()) {
                    return;
                } else {
                    i = jjuVar2.q();
                }
            } while (i == this.a);
        } else {
            int i3 = this.a & 7;
            if (i3 == 2) {
                jju jjuVar3 = (jju) this.d;
                int r2 = jjuVar3.r();
                V(r2);
                int e2 = jjuVar3.e() + r2;
                do {
                    list.add(Integer.valueOf(jjuVar3.o()));
                } while (jjuVar3.e() < e2);
                return;
            }
            if (i3 != 5) {
                throw new jlc();
            }
            do {
                jju jjuVar4 = (jju) this.d;
                list.add(Integer.valueOf(jjuVar4.o()));
                if (jjuVar4.G()) {
                    return;
                } else {
                    q = jjuVar4.q();
                }
            } while (q == this.a);
            i = q;
        }
        this.c = i;
    }

    public final void H(List list) {
        int q;
        int i;
        if (list instanceof jlh) {
            jlh jlhVar = (jlh) list;
            int i2 = this.a & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new jlc();
                }
                jju jjuVar = (jju) this.d;
                int r = jjuVar.r();
                W(r);
                int e = jjuVar.e() + r;
                do {
                    jlhVar.e(jjuVar.x());
                } while (jjuVar.e() < e);
                return;
            }
            do {
                jju jjuVar2 = (jju) this.d;
                jlhVar.e(jjuVar2.x());
                if (jjuVar2.G()) {
                    return;
                } else {
                    i = jjuVar2.q();
                }
            } while (i == this.a);
        } else {
            int i3 = this.a & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new jlc();
                }
                jju jjuVar3 = (jju) this.d;
                int r2 = jjuVar3.r();
                W(r2);
                int e2 = jjuVar3.e() + r2;
                do {
                    list.add(Long.valueOf(jjuVar3.x()));
                } while (jjuVar3.e() < e2);
                return;
            }
            do {
                jju jjuVar4 = (jju) this.d;
                list.add(Long.valueOf(jjuVar4.x()));
                if (jjuVar4.G()) {
                    return;
                } else {
                    q = jjuVar4.q();
                }
            } while (q == this.a);
            i = q;
        }
        this.c = i;
    }

    public final void I(List list) {
        int q;
        int i;
        if (list instanceof jkq) {
            jkq jkqVar = (jkq) list;
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new jlc();
                }
                jju jjuVar = (jju) this.d;
                int e = jjuVar.e() + jjuVar.r();
                do {
                    jkqVar.g(jjuVar.p());
                } while (jjuVar.e() < e);
                U(e);
                return;
            }
            do {
                jju jjuVar2 = (jju) this.d;
                jkqVar.g(jjuVar2.p());
                if (jjuVar2.G()) {
                    return;
                } else {
                    i = jjuVar2.q();
                }
            } while (i == this.a);
        } else {
            int i3 = this.a & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new jlc();
                }
                jju jjuVar3 = (jju) this.d;
                int e2 = jjuVar3.e() + jjuVar3.r();
                do {
                    list.add(Integer.valueOf(jjuVar3.p()));
                } while (jjuVar3.e() < e2);
                U(e2);
                return;
            }
            do {
                jju jjuVar4 = (jju) this.d;
                list.add(Integer.valueOf(jjuVar4.p()));
                if (jjuVar4.G()) {
                    return;
                } else {
                    q = jjuVar4.q();
                }
            } while (q == this.a);
            i = q;
        }
        this.c = i;
    }

    public final void J(List list) {
        int q;
        int i;
        if (list instanceof jlh) {
            jlh jlhVar = (jlh) list;
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new jlc();
                }
                jju jjuVar = (jju) this.d;
                int e = jjuVar.e() + jjuVar.r();
                do {
                    jlhVar.e(jjuVar.y());
                } while (jjuVar.e() < e);
                U(e);
                return;
            }
            do {
                jju jjuVar2 = (jju) this.d;
                jlhVar.e(jjuVar2.y());
                if (jjuVar2.G()) {
                    return;
                } else {
                    i = jjuVar2.q();
                }
            } while (i == this.a);
        } else {
            int i3 = this.a & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new jlc();
                }
                jju jjuVar3 = (jju) this.d;
                int e2 = jjuVar3.e() + jjuVar3.r();
                do {
                    list.add(Long.valueOf(jjuVar3.y()));
                } while (jjuVar3.e() < e2);
                U(e2);
                return;
            }
            do {
                jju jjuVar4 = (jju) this.d;
                list.add(Long.valueOf(jjuVar4.y()));
                if (jjuVar4.G()) {
                    return;
                } else {
                    q = jjuVar4.q();
                }
            } while (q == this.a);
            i = q;
        }
        this.c = i;
    }

    public final void K(List list, boolean z) {
        int q;
        int i;
        if ((this.a & 7) != 2) {
            throw new jlc();
        }
        if ((list instanceof jlg) && !z) {
            jlg jlgVar = (jlg) list;
            do {
                o();
                jlgVar.b();
                jju jjuVar = (jju) this.d;
                if (jjuVar.G()) {
                    return;
                } else {
                    i = jjuVar.q();
                }
            } while (i == this.a);
        } else {
            do {
                list.add(z ? v() : u());
                jju jjuVar2 = (jju) this.d;
                if (jjuVar2.G()) {
                    return;
                } else {
                    q = jjuVar2.q();
                }
            } while (q == this.a);
            i = q;
        }
        this.c = i;
    }

    public final void L(List list) {
        int q;
        int i;
        if (list instanceof jkq) {
            jkq jkqVar = (jkq) list;
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new jlc();
                }
                jju jjuVar = (jju) this.d;
                int e = jjuVar.e() + jjuVar.r();
                do {
                    jkqVar.g(jjuVar.r());
                } while (jjuVar.e() < e);
                U(e);
                return;
            }
            do {
                jju jjuVar2 = (jju) this.d;
                jkqVar.g(jjuVar2.r());
                if (jjuVar2.G()) {
                    return;
                } else {
                    i = jjuVar2.q();
                }
            } while (i == this.a);
        } else {
            int i3 = this.a & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new jlc();
                }
                jju jjuVar3 = (jju) this.d;
                int e2 = jjuVar3.e() + jjuVar3.r();
                do {
                    list.add(Integer.valueOf(jjuVar3.r()));
                } while (jjuVar3.e() < e2);
                U(e2);
                return;
            }
            do {
                jju jjuVar4 = (jju) this.d;
                list.add(Integer.valueOf(jjuVar4.r()));
                if (jjuVar4.G()) {
                    return;
                } else {
                    q = jjuVar4.q();
                }
            } while (q == this.a);
            i = q;
        }
        this.c = i;
    }

    public final void M(List list) {
        int q;
        int i;
        if (list instanceof jlh) {
            jlh jlhVar = (jlh) list;
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new jlc();
                }
                jju jjuVar = (jju) this.d;
                int e = jjuVar.e() + jjuVar.r();
                do {
                    jlhVar.e(jjuVar.z());
                } while (jjuVar.e() < e);
                U(e);
                return;
            }
            do {
                jju jjuVar2 = (jju) this.d;
                jlhVar.e(jjuVar2.z());
                if (jjuVar2.G()) {
                    return;
                } else {
                    i = jjuVar2.q();
                }
            } while (i == this.a);
        } else {
            int i3 = this.a & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new jlc();
                }
                jju jjuVar3 = (jju) this.d;
                int e2 = jjuVar3.e() + jjuVar3.r();
                do {
                    list.add(Long.valueOf(jjuVar3.z()));
                } while (jjuVar3.e() < e2);
                U(e2);
                return;
            }
            do {
                jju jjuVar4 = (jju) this.d;
                list.add(Long.valueOf(jjuVar4.z()));
                if (jjuVar4.G()) {
                    return;
                } else {
                    q = jjuVar4.q();
                }
            } while (q == this.a);
            i = q;
        }
        this.c = i;
    }

    public final void N(int i) {
        if ((this.a & 7) != i) {
            throw new jlc();
        }
    }

    public final boolean O() {
        N(0);
        return ((jju) this.d).H();
    }

    public final boolean P() {
        int i;
        jju jjuVar = (jju) this.d;
        if (jjuVar.G() || (i = this.a) == this.b) {
            return false;
        }
        return jjuVar.I(i);
    }

    public final void Q() {
        View view = (View) this.d;
        int top = this.a - (view.getTop() - this.c);
        int i = yq.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(-(view.getLeft() - this.b));
    }

    public final boolean R(int i) {
        if (this.a == i) {
            return false;
        }
        this.a = i;
        Q();
        return true;
    }

    public final double a() {
        N(1);
        return ((jju) this.d).b();
    }

    public final float b() {
        N(5);
        return ((jju) this.d).c();
    }

    public final int c() {
        int i = this.c;
        if (i != 0) {
            this.a = i;
            this.c = 0;
        } else {
            i = ((jju) this.d).q();
            this.a = i;
        }
        if (i == 0 || i == this.b) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    public final int d() {
        N(0);
        return ((jju) this.d).g();
    }

    public final int e() {
        N(5);
        return ((jju) this.d).h();
    }

    public final int f() {
        N(0);
        return ((jju) this.d).i();
    }

    public final int g() {
        N(5);
        return ((jju) this.d).o();
    }

    public final int h() {
        N(0);
        return ((jju) this.d).p();
    }

    public final int i() {
        N(0);
        return ((jju) this.d).r();
    }

    public final long j() {
        N(1);
        return ((jju) this.d).t();
    }

    public final long k() {
        N(0);
        return ((jju) this.d).u();
    }

    public final long l() {
        N(1);
        return ((jju) this.d).x();
    }

    public final long m() {
        N(0);
        return ((jju) this.d).y();
    }

    public final long n() {
        N(0);
        return ((jju) this.d).z();
    }

    public final jjq o() {
        N(2);
        return ((jju) this.d).A();
    }

    public final Object q(jmr jmrVar, Class cls, jkd jkdVar) {
        jmr jmrVar2 = jmr.DOUBLE;
        switch (jmrVar.ordinal()) {
            case 0:
                return Double.valueOf(a());
            case 1:
                return Float.valueOf(b());
            case 2:
                return Long.valueOf(k());
            case 3:
                return Long.valueOf(n());
            case 4:
                return Integer.valueOf(f());
            case 5:
                return Long.valueOf(j());
            case 6:
                return Integer.valueOf(e());
            case 7:
                return Boolean.valueOf(O());
            case 8:
                return v();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                return t(cls, jkdVar);
            case 11:
                return o();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return Integer.valueOf(i());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return Integer.valueOf(d());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Integer.valueOf(g());
            case 15:
                return Long.valueOf(l());
            case 16:
                return Integer.valueOf(h());
            case 17:
                return Long.valueOf(m());
        }
    }

    public final Object r(jlz jlzVar, jkd jkdVar) {
        Object e = jlzVar.e();
        S(e, jlzVar, jkdVar);
        jlzVar.g(e);
        return e;
    }

    public final Object s(jlz jlzVar, jkd jkdVar) {
        Object e = jlzVar.e();
        T(e, jlzVar, jkdVar);
        jlzVar.g(e);
        return e;
    }

    public final Object t(Class cls, jkd jkdVar) {
        N(2);
        return s(jlt.a.b(cls), jkdVar);
    }

    public final String u() {
        N(2);
        return ((jju) this.d).B();
    }

    public final String v() {
        N(2);
        return ((jju) this.d).C();
    }

    public final void w(Object obj, jlz jlzVar, jkd jkdVar) {
        N(3);
        S(obj, jlzVar, jkdVar);
    }

    public final void x(Object obj, jlz jlzVar, jkd jkdVar) {
        N(2);
        T(obj, jlzVar, jkdVar);
    }

    public final void y(List list) {
        int q;
        int i;
        if (list instanceof jjh) {
            jjh jjhVar = (jjh) list;
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new jlc();
                }
                jju jjuVar = (jju) this.d;
                int e = jjuVar.e() + jjuVar.r();
                do {
                    jjhVar.e(jjuVar.H());
                } while (jjuVar.e() < e);
                U(e);
                return;
            }
            do {
                jju jjuVar2 = (jju) this.d;
                jjhVar.e(jjuVar2.H());
                if (jjuVar2.G()) {
                    return;
                } else {
                    i = jjuVar2.q();
                }
            } while (i == this.a);
        } else {
            int i3 = this.a & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new jlc();
                }
                jju jjuVar3 = (jju) this.d;
                int e2 = jjuVar3.e() + jjuVar3.r();
                do {
                    list.add(Boolean.valueOf(jjuVar3.H()));
                } while (jjuVar3.e() < e2);
                U(e2);
                return;
            }
            do {
                jju jjuVar4 = (jju) this.d;
                list.add(Boolean.valueOf(jjuVar4.H()));
                if (jjuVar4.G()) {
                    return;
                } else {
                    q = jjuVar4.q();
                }
            } while (q == this.a);
            i = q;
        }
        this.c = i;
    }

    public final void z(List list) {
        int q;
        int i;
        if (list instanceof jka) {
            jka jkaVar = (jka) list;
            int i2 = this.a & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new jlc();
                }
                jju jjuVar = (jju) this.d;
                int r = jjuVar.r();
                W(r);
                int e = jjuVar.e() + r;
                do {
                    jkaVar.f(jjuVar.b());
                } while (jjuVar.e() < e);
                return;
            }
            do {
                jju jjuVar2 = (jju) this.d;
                jkaVar.f(jjuVar2.b());
                if (jjuVar2.G()) {
                    return;
                } else {
                    i = jjuVar2.q();
                }
            } while (i == this.a);
        } else {
            int i3 = this.a & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new jlc();
                }
                jju jjuVar3 = (jju) this.d;
                int r2 = jjuVar3.r();
                W(r2);
                int e2 = jjuVar3.e() + r2;
                do {
                    list.add(Double.valueOf(jjuVar3.b()));
                } while (jjuVar3.e() < e2);
                return;
            }
            do {
                jju jjuVar4 = (jju) this.d;
                list.add(Double.valueOf(jjuVar4.b()));
                if (jjuVar4.G()) {
                    return;
                } else {
                    q = jjuVar4.q();
                }
            } while (q == this.a);
            i = q;
        }
        this.c = i;
    }

    public jjv(View view) {
        this.d = view;
    }
}
