package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148k {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0147j f1715a;

    /* renamed from: b, reason: collision with root package name */
    public int f1716b;

    /* renamed from: c, reason: collision with root package name */
    public int f1717c;

    /* renamed from: d, reason: collision with root package name */
    public int f1718d = 0;

    public C0148k(AbstractC0147j abstractC0147j) {
        Charset charset = AbstractC0161y.f1761a;
        this.f1715a = abstractC0147j;
        abstractC0147j.f1707b = this;
    }

    public final int a() {
        int i2 = this.f1718d;
        if (i2 != 0) {
            this.f1716b = i2;
            this.f1718d = 0;
        } else {
            this.f1716b = this.f1715a.u();
        }
        int i3 = this.f1716b;
        if (i3 == 0 || i3 == this.f1717c) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    public final void b(Object obj, W w2, C0152o c0152o) {
        int i2 = this.f1717c;
        this.f1717c = ((this.f1716b >>> 3) << 3) | 4;
        try {
            w2.b(obj, this, c0152o);
            if (this.f1716b == this.f1717c) {
            } else {
                throw new A("Failed to parse the message.");
            }
        } finally {
            this.f1717c = i2;
        }
    }

    public final void c(Object obj, W w2, C0152o c0152o) {
        AbstractC0147j abstractC0147j = this.f1715a;
        int v = abstractC0147j.v();
        if (abstractC0147j.f1706a >= 100) {
            throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int e2 = abstractC0147j.e(v);
        abstractC0147j.f1706a++;
        w2.b(obj, this, c0152o);
        abstractC0147j.a(0);
        abstractC0147j.f1706a--;
        abstractC0147j.d(e2);
    }

    public final void d(InterfaceC0160x interfaceC0160x) {
        int u2;
        int i2 = this.f1716b & 7;
        AbstractC0147j abstractC0147j = this.f1715a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0160x).add(Boolean.valueOf(abstractC0147j.f()));
                if (abstractC0147j.c()) {
                    return;
                } else {
                    u2 = abstractC0147j.u();
                }
            } while (u2 == this.f1716b);
            this.f1718d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0147j.b() + abstractC0147j.v();
        do {
            ((U) interfaceC0160x).add(Boolean.valueOf(abstractC0147j.f()));
        } while (abstractC0147j.b() < b2);
        v(b2);
    }

    public final C0144g e() {
        w(2);
        return this.f1715a.g();
    }

    public final void f(InterfaceC0160x interfaceC0160x) {
        int u2;
        if ((this.f1716b & 7) != 2) {
            throw A.b();
        }
        do {
            ((U) interfaceC0160x).add(e());
            AbstractC0147j abstractC0147j = this.f1715a;
            if (abstractC0147j.c()) {
                return;
            } else {
                u2 = abstractC0147j.u();
            }
        } while (u2 == this.f1716b);
        this.f1718d = u2;
    }

    public final void g(InterfaceC0160x interfaceC0160x) {
        int u2;
        int i2 = this.f1716b & 7;
        AbstractC0147j abstractC0147j = this.f1715a;
        if (i2 == 1) {
            do {
                ((U) interfaceC0160x).add(Double.valueOf(abstractC0147j.h()));
                if (abstractC0147j.c()) {
                    return;
                } else {
                    u2 = abstractC0147j.u();
                }
            } while (u2 == this.f1716b);
            this.f1718d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int v = abstractC0147j.v();
        if ((v & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b2 = abstractC0147j.b() + v;
        do {
            ((U) interfaceC0160x).add(Double.valueOf(abstractC0147j.h()));
        } while (abstractC0147j.b() < b2);
    }

    public final void h(InterfaceC0160x interfaceC0160x) {
        int u2;
        int i2 = this.f1716b & 7;
        AbstractC0147j abstractC0147j = this.f1715a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0160x).add(Integer.valueOf(abstractC0147j.i()));
                if (abstractC0147j.c()) {
                    return;
                } else {
                    u2 = abstractC0147j.u();
                }
            } while (u2 == this.f1716b);
            this.f1718d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0147j.b() + abstractC0147j.v();
        do {
            ((U) interfaceC0160x).add(Integer.valueOf(abstractC0147j.i()));
        } while (abstractC0147j.b() < b2);
        v(b2);
    }

    public final Object i(r0 r0Var, Class cls, C0152o c0152o) {
        int ordinal = r0Var.ordinal();
        AbstractC0147j abstractC0147j = this.f1715a;
        switch (ordinal) {
            case 0:
                w(1);
                return Double.valueOf(abstractC0147j.h());
            case 1:
                w(5);
                return Float.valueOf(abstractC0147j.l());
            case 2:
                w(0);
                return Long.valueOf(abstractC0147j.n());
            case 3:
                w(0);
                return Long.valueOf(abstractC0147j.w());
            case K.k.LONG_FIELD_NUMBER /* 4 */:
                w(0);
                return Integer.valueOf(abstractC0147j.m());
            case K.k.STRING_FIELD_NUMBER /* 5 */:
                w(1);
                return Long.valueOf(abstractC0147j.k());
            case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                w(5);
                return Integer.valueOf(abstractC0147j.j());
            case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                w(0);
                return Boolean.valueOf(abstractC0147j.f());
            case K.k.BYTES_FIELD_NUMBER /* 8 */:
                w(2);
                return abstractC0147j.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                W a2 = T.f1643c.a(cls);
                AbstractC0159w g2 = a2.g();
                c(g2, a2, c0152o);
                a2.h(g2);
                return g2;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(abstractC0147j.v());
            case 13:
                w(0);
                return Integer.valueOf(abstractC0147j.i());
            case 14:
                w(5);
                return Integer.valueOf(abstractC0147j.o());
            case 15:
                w(1);
                return Long.valueOf(abstractC0147j.p());
            case 16:
                w(0);
                return Integer.valueOf(abstractC0147j.q());
            case 17:
                w(0);
                return Long.valueOf(abstractC0147j.r());
        }
    }

    public final void j(InterfaceC0160x interfaceC0160x) {
        int u2;
        int i2 = this.f1716b & 7;
        AbstractC0147j abstractC0147j = this.f1715a;
        if (i2 == 2) {
            int v = abstractC0147j.v();
            if ((v & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b2 = abstractC0147j.b() + v;
            do {
                ((U) interfaceC0160x).add(Integer.valueOf(abstractC0147j.j()));
            } while (abstractC0147j.b() < b2);
            return;
        }
        if (i2 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0160x).add(Integer.valueOf(abstractC0147j.j()));
            if (abstractC0147j.c()) {
                return;
            } else {
                u2 = abstractC0147j.u();
            }
        } while (u2 == this.f1716b);
        this.f1718d = u2;
    }

    public final void k(InterfaceC0160x interfaceC0160x) {
        int u2;
        int i2 = this.f1716b & 7;
        AbstractC0147j abstractC0147j = this.f1715a;
        if (i2 == 1) {
            do {
                ((U) interfaceC0160x).add(Long.valueOf(abstractC0147j.k()));
                if (abstractC0147j.c()) {
                    return;
                } else {
                    u2 = abstractC0147j.u();
                }
            } while (u2 == this.f1716b);
            this.f1718d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int v = abstractC0147j.v();
        if ((v & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b2 = abstractC0147j.b() + v;
        do {
            ((U) interfaceC0160x).add(Long.valueOf(abstractC0147j.k()));
        } while (abstractC0147j.b() < b2);
    }

    public final void l(InterfaceC0160x interfaceC0160x) {
        int u2;
        int i2 = this.f1716b & 7;
        AbstractC0147j abstractC0147j = this.f1715a;
        if (i2 == 2) {
            int v = abstractC0147j.v();
            if ((v & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b2 = abstractC0147j.b() + v;
            do {
                ((U) interfaceC0160x).add(Float.valueOf(abstractC0147j.l()));
            } while (abstractC0147j.b() < b2);
            return;
        }
        if (i2 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0160x).add(Float.valueOf(abstractC0147j.l()));
            if (abstractC0147j.c()) {
                return;
            } else {
                u2 = abstractC0147j.u();
            }
        } while (u2 == this.f1716b);
        this.f1718d = u2;
    }

    public final void m(InterfaceC0160x interfaceC0160x) {
        int u2;
        int i2 = this.f1716b & 7;
        AbstractC0147j abstractC0147j = this.f1715a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0160x).add(Integer.valueOf(abstractC0147j.m()));
                if (abstractC0147j.c()) {
                    return;
                } else {
                    u2 = abstractC0147j.u();
                }
            } while (u2 == this.f1716b);
            this.f1718d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0147j.b() + abstractC0147j.v();
        do {
            ((U) interfaceC0160x).add(Integer.valueOf(abstractC0147j.m()));
        } while (abstractC0147j.b() < b2);
        v(b2);
    }

    public final void n(InterfaceC0160x interfaceC0160x) {
        int u2;
        int i2 = this.f1716b & 7;
        AbstractC0147j abstractC0147j = this.f1715a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0160x).add(Long.valueOf(abstractC0147j.n()));
                if (abstractC0147j.c()) {
                    return;
                } else {
                    u2 = abstractC0147j.u();
                }
            } while (u2 == this.f1716b);
            this.f1718d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0147j.b() + abstractC0147j.v();
        do {
            ((U) interfaceC0160x).add(Long.valueOf(abstractC0147j.n()));
        } while (abstractC0147j.b() < b2);
        v(b2);
    }

    public final void o(InterfaceC0160x interfaceC0160x) {
        int u2;
        int i2 = this.f1716b & 7;
        AbstractC0147j abstractC0147j = this.f1715a;
        if (i2 == 2) {
            int v = abstractC0147j.v();
            if ((v & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b2 = abstractC0147j.b() + v;
            do {
                ((U) interfaceC0160x).add(Integer.valueOf(abstractC0147j.o()));
            } while (abstractC0147j.b() < b2);
            return;
        }
        if (i2 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0160x).add(Integer.valueOf(abstractC0147j.o()));
            if (abstractC0147j.c()) {
                return;
            } else {
                u2 = abstractC0147j.u();
            }
        } while (u2 == this.f1716b);
        this.f1718d = u2;
    }

    public final void p(InterfaceC0160x interfaceC0160x) {
        int u2;
        int i2 = this.f1716b & 7;
        AbstractC0147j abstractC0147j = this.f1715a;
        if (i2 == 1) {
            do {
                ((U) interfaceC0160x).add(Long.valueOf(abstractC0147j.p()));
                if (abstractC0147j.c()) {
                    return;
                } else {
                    u2 = abstractC0147j.u();
                }
            } while (u2 == this.f1716b);
            this.f1718d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int v = abstractC0147j.v();
        if ((v & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b2 = abstractC0147j.b() + v;
        do {
            ((U) interfaceC0160x).add(Long.valueOf(abstractC0147j.p()));
        } while (abstractC0147j.b() < b2);
    }

    public final void q(InterfaceC0160x interfaceC0160x) {
        int u2;
        int i2 = this.f1716b & 7;
        AbstractC0147j abstractC0147j = this.f1715a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0160x).add(Integer.valueOf(abstractC0147j.q()));
                if (abstractC0147j.c()) {
                    return;
                } else {
                    u2 = abstractC0147j.u();
                }
            } while (u2 == this.f1716b);
            this.f1718d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0147j.b() + abstractC0147j.v();
        do {
            ((U) interfaceC0160x).add(Integer.valueOf(abstractC0147j.q()));
        } while (abstractC0147j.b() < b2);
        v(b2);
    }

    public final void r(InterfaceC0160x interfaceC0160x) {
        int u2;
        int i2 = this.f1716b & 7;
        AbstractC0147j abstractC0147j = this.f1715a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0160x).add(Long.valueOf(abstractC0147j.r()));
                if (abstractC0147j.c()) {
                    return;
                } else {
                    u2 = abstractC0147j.u();
                }
            } while (u2 == this.f1716b);
            this.f1718d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0147j.b() + abstractC0147j.v();
        do {
            ((U) interfaceC0160x).add(Long.valueOf(abstractC0147j.r()));
        } while (abstractC0147j.b() < b2);
        v(b2);
    }

    public final void s(InterfaceC0160x interfaceC0160x, boolean z2) {
        String s2;
        int u2;
        if ((this.f1716b & 7) != 2) {
            throw A.b();
        }
        do {
            AbstractC0147j abstractC0147j = this.f1715a;
            if (z2) {
                w(2);
                s2 = abstractC0147j.t();
            } else {
                w(2);
                s2 = abstractC0147j.s();
            }
            ((U) interfaceC0160x).add(s2);
            if (abstractC0147j.c()) {
                return;
            } else {
                u2 = abstractC0147j.u();
            }
        } while (u2 == this.f1716b);
        this.f1718d = u2;
    }

    public final void t(InterfaceC0160x interfaceC0160x) {
        int u2;
        int i2 = this.f1716b & 7;
        AbstractC0147j abstractC0147j = this.f1715a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0160x).add(Integer.valueOf(abstractC0147j.v()));
                if (abstractC0147j.c()) {
                    return;
                } else {
                    u2 = abstractC0147j.u();
                }
            } while (u2 == this.f1716b);
            this.f1718d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0147j.b() + abstractC0147j.v();
        do {
            ((U) interfaceC0160x).add(Integer.valueOf(abstractC0147j.v()));
        } while (abstractC0147j.b() < b2);
        v(b2);
    }

    public final void u(InterfaceC0160x interfaceC0160x) {
        int u2;
        int i2 = this.f1716b & 7;
        AbstractC0147j abstractC0147j = this.f1715a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0160x).add(Long.valueOf(abstractC0147j.w()));
                if (abstractC0147j.c()) {
                    return;
                } else {
                    u2 = abstractC0147j.u();
                }
            } while (u2 == this.f1716b);
            this.f1718d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0147j.b() + abstractC0147j.v();
        do {
            ((U) interfaceC0160x).add(Long.valueOf(abstractC0147j.w()));
        } while (abstractC0147j.b() < b2);
        v(b2);
    }

    public final void v(int i2) {
        if (this.f1715a.b() != i2) {
            throw A.e();
        }
    }

    public final void w(int i2) {
        if ((this.f1716b & 7) != i2) {
            throw A.b();
        }
    }

    public final boolean x() {
        int i2;
        AbstractC0147j abstractC0147j = this.f1715a;
        if (abstractC0147j.c() || (i2 = this.f1716b) == this.f1717c) {
            return false;
        }
        return abstractC0147j.x(i2);
    }
}
