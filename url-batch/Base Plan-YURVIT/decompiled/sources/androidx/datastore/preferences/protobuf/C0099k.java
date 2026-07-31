package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099k {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0098j f1555a;

    /* renamed from: b, reason: collision with root package name */
    public int f1556b;

    /* renamed from: c, reason: collision with root package name */
    public int f1557c;

    /* renamed from: d, reason: collision with root package name */
    public int f1558d = 0;

    public C0099k(AbstractC0098j abstractC0098j) {
        Charset charset = AbstractC0112y.f1602a;
        this.f1555a = abstractC0098j;
        abstractC0098j.f1547b = this;
    }

    public final int a() {
        int i2 = this.f1558d;
        if (i2 != 0) {
            this.f1556b = i2;
            this.f1558d = 0;
        } else {
            this.f1556b = this.f1555a.u();
        }
        int i3 = this.f1556b;
        if (i3 == 0 || i3 == this.f1557c) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    public final void b(Object obj, W w2, C0103o c0103o) {
        int i2 = this.f1557c;
        this.f1557c = ((this.f1556b >>> 3) << 3) | 4;
        try {
            w2.g(obj, this, c0103o);
            if (this.f1556b == this.f1557c) {
            } else {
                throw new A("Failed to parse the message.");
            }
        } finally {
            this.f1557c = i2;
        }
    }

    public final void c(Object obj, W w2, C0103o c0103o) {
        AbstractC0098j abstractC0098j = this.f1555a;
        int v2 = abstractC0098j.v();
        if (abstractC0098j.f1546a >= 100) {
            throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int e2 = abstractC0098j.e(v2);
        abstractC0098j.f1546a++;
        w2.g(obj, this, c0103o);
        abstractC0098j.a(0);
        abstractC0098j.f1546a--;
        abstractC0098j.d(e2);
    }

    public final void d(InterfaceC0111x interfaceC0111x) {
        int u2;
        int i2 = this.f1556b & 7;
        AbstractC0098j abstractC0098j = this.f1555a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0111x).add(Boolean.valueOf(abstractC0098j.f()));
                if (abstractC0098j.c()) {
                    return;
                } else {
                    u2 = abstractC0098j.u();
                }
            } while (u2 == this.f1556b);
            this.f1558d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0098j.b() + abstractC0098j.v();
        do {
            ((U) interfaceC0111x).add(Boolean.valueOf(abstractC0098j.f()));
        } while (abstractC0098j.b() < b2);
        v(b2);
    }

    public final C0095g e() {
        w(2);
        return this.f1555a.g();
    }

    public final void f(InterfaceC0111x interfaceC0111x) {
        int u2;
        if ((this.f1556b & 7) != 2) {
            throw A.b();
        }
        do {
            ((U) interfaceC0111x).add(e());
            AbstractC0098j abstractC0098j = this.f1555a;
            if (abstractC0098j.c()) {
                return;
            } else {
                u2 = abstractC0098j.u();
            }
        } while (u2 == this.f1556b);
        this.f1558d = u2;
    }

    public final void g(InterfaceC0111x interfaceC0111x) {
        int u2;
        int i2 = this.f1556b & 7;
        AbstractC0098j abstractC0098j = this.f1555a;
        if (i2 == 1) {
            do {
                ((U) interfaceC0111x).add(Double.valueOf(abstractC0098j.h()));
                if (abstractC0098j.c()) {
                    return;
                } else {
                    u2 = abstractC0098j.u();
                }
            } while (u2 == this.f1556b);
            this.f1558d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int v2 = abstractC0098j.v();
        if ((v2 & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b2 = abstractC0098j.b() + v2;
        do {
            ((U) interfaceC0111x).add(Double.valueOf(abstractC0098j.h()));
        } while (abstractC0098j.b() < b2);
    }

    public final void h(InterfaceC0111x interfaceC0111x) {
        int u2;
        int i2 = this.f1556b & 7;
        AbstractC0098j abstractC0098j = this.f1555a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0111x).add(Integer.valueOf(abstractC0098j.i()));
                if (abstractC0098j.c()) {
                    return;
                } else {
                    u2 = abstractC0098j.u();
                }
            } while (u2 == this.f1556b);
            this.f1558d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0098j.b() + abstractC0098j.v();
        do {
            ((U) interfaceC0111x).add(Integer.valueOf(abstractC0098j.i()));
        } while (abstractC0098j.b() < b2);
        v(b2);
    }

    public final Object i(s0 s0Var, Class cls, C0103o c0103o) {
        int ordinal = s0Var.ordinal();
        AbstractC0098j abstractC0098j = this.f1555a;
        switch (ordinal) {
            case 0:
                w(1);
                return Double.valueOf(abstractC0098j.h());
            case 1:
                w(5);
                return Float.valueOf(abstractC0098j.l());
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                w(0);
                return Long.valueOf(abstractC0098j.n());
            case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                w(0);
                return Long.valueOf(abstractC0098j.w());
            case H.k.LONG_FIELD_NUMBER /* 4 */:
                w(0);
                return Integer.valueOf(abstractC0098j.m());
            case H.k.STRING_FIELD_NUMBER /* 5 */:
                w(1);
                return Long.valueOf(abstractC0098j.k());
            case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                w(5);
                return Integer.valueOf(abstractC0098j.j());
            case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                w(0);
                return Boolean.valueOf(abstractC0098j.f());
            case H.k.BYTES_FIELD_NUMBER /* 8 */:
                w(2);
                return abstractC0098j.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                W a2 = T.f1483c.a(cls);
                AbstractC0110w i2 = a2.i();
                c(i2, a2, c0103o);
                a2.d(i2);
                return i2;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(abstractC0098j.v());
            case 13:
                w(0);
                return Integer.valueOf(abstractC0098j.i());
            case 14:
                w(5);
                return Integer.valueOf(abstractC0098j.o());
            case 15:
                w(1);
                return Long.valueOf(abstractC0098j.p());
            case 16:
                w(0);
                return Integer.valueOf(abstractC0098j.q());
            case 17:
                w(0);
                return Long.valueOf(abstractC0098j.r());
        }
    }

    public final void j(InterfaceC0111x interfaceC0111x) {
        int u2;
        int i2 = this.f1556b & 7;
        AbstractC0098j abstractC0098j = this.f1555a;
        if (i2 == 2) {
            int v2 = abstractC0098j.v();
            if ((v2 & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b2 = abstractC0098j.b() + v2;
            do {
                ((U) interfaceC0111x).add(Integer.valueOf(abstractC0098j.j()));
            } while (abstractC0098j.b() < b2);
            return;
        }
        if (i2 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0111x).add(Integer.valueOf(abstractC0098j.j()));
            if (abstractC0098j.c()) {
                return;
            } else {
                u2 = abstractC0098j.u();
            }
        } while (u2 == this.f1556b);
        this.f1558d = u2;
    }

    public final void k(InterfaceC0111x interfaceC0111x) {
        int u2;
        int i2 = this.f1556b & 7;
        AbstractC0098j abstractC0098j = this.f1555a;
        if (i2 == 1) {
            do {
                ((U) interfaceC0111x).add(Long.valueOf(abstractC0098j.k()));
                if (abstractC0098j.c()) {
                    return;
                } else {
                    u2 = abstractC0098j.u();
                }
            } while (u2 == this.f1556b);
            this.f1558d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int v2 = abstractC0098j.v();
        if ((v2 & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b2 = abstractC0098j.b() + v2;
        do {
            ((U) interfaceC0111x).add(Long.valueOf(abstractC0098j.k()));
        } while (abstractC0098j.b() < b2);
    }

    public final void l(InterfaceC0111x interfaceC0111x) {
        int u2;
        int i2 = this.f1556b & 7;
        AbstractC0098j abstractC0098j = this.f1555a;
        if (i2 == 2) {
            int v2 = abstractC0098j.v();
            if ((v2 & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b2 = abstractC0098j.b() + v2;
            do {
                ((U) interfaceC0111x).add(Float.valueOf(abstractC0098j.l()));
            } while (abstractC0098j.b() < b2);
            return;
        }
        if (i2 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0111x).add(Float.valueOf(abstractC0098j.l()));
            if (abstractC0098j.c()) {
                return;
            } else {
                u2 = abstractC0098j.u();
            }
        } while (u2 == this.f1556b);
        this.f1558d = u2;
    }

    public final void m(InterfaceC0111x interfaceC0111x) {
        int u2;
        int i2 = this.f1556b & 7;
        AbstractC0098j abstractC0098j = this.f1555a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0111x).add(Integer.valueOf(abstractC0098j.m()));
                if (abstractC0098j.c()) {
                    return;
                } else {
                    u2 = abstractC0098j.u();
                }
            } while (u2 == this.f1556b);
            this.f1558d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0098j.b() + abstractC0098j.v();
        do {
            ((U) interfaceC0111x).add(Integer.valueOf(abstractC0098j.m()));
        } while (abstractC0098j.b() < b2);
        v(b2);
    }

    public final void n(InterfaceC0111x interfaceC0111x) {
        int u2;
        int i2 = this.f1556b & 7;
        AbstractC0098j abstractC0098j = this.f1555a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0111x).add(Long.valueOf(abstractC0098j.n()));
                if (abstractC0098j.c()) {
                    return;
                } else {
                    u2 = abstractC0098j.u();
                }
            } while (u2 == this.f1556b);
            this.f1558d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0098j.b() + abstractC0098j.v();
        do {
            ((U) interfaceC0111x).add(Long.valueOf(abstractC0098j.n()));
        } while (abstractC0098j.b() < b2);
        v(b2);
    }

    public final void o(InterfaceC0111x interfaceC0111x) {
        int u2;
        int i2 = this.f1556b & 7;
        AbstractC0098j abstractC0098j = this.f1555a;
        if (i2 == 2) {
            int v2 = abstractC0098j.v();
            if ((v2 & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b2 = abstractC0098j.b() + v2;
            do {
                ((U) interfaceC0111x).add(Integer.valueOf(abstractC0098j.o()));
            } while (abstractC0098j.b() < b2);
            return;
        }
        if (i2 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0111x).add(Integer.valueOf(abstractC0098j.o()));
            if (abstractC0098j.c()) {
                return;
            } else {
                u2 = abstractC0098j.u();
            }
        } while (u2 == this.f1556b);
        this.f1558d = u2;
    }

    public final void p(InterfaceC0111x interfaceC0111x) {
        int u2;
        int i2 = this.f1556b & 7;
        AbstractC0098j abstractC0098j = this.f1555a;
        if (i2 == 1) {
            do {
                ((U) interfaceC0111x).add(Long.valueOf(abstractC0098j.p()));
                if (abstractC0098j.c()) {
                    return;
                } else {
                    u2 = abstractC0098j.u();
                }
            } while (u2 == this.f1556b);
            this.f1558d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int v2 = abstractC0098j.v();
        if ((v2 & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b2 = abstractC0098j.b() + v2;
        do {
            ((U) interfaceC0111x).add(Long.valueOf(abstractC0098j.p()));
        } while (abstractC0098j.b() < b2);
    }

    public final void q(InterfaceC0111x interfaceC0111x) {
        int u2;
        int i2 = this.f1556b & 7;
        AbstractC0098j abstractC0098j = this.f1555a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0111x).add(Integer.valueOf(abstractC0098j.q()));
                if (abstractC0098j.c()) {
                    return;
                } else {
                    u2 = abstractC0098j.u();
                }
            } while (u2 == this.f1556b);
            this.f1558d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0098j.b() + abstractC0098j.v();
        do {
            ((U) interfaceC0111x).add(Integer.valueOf(abstractC0098j.q()));
        } while (abstractC0098j.b() < b2);
        v(b2);
    }

    public final void r(InterfaceC0111x interfaceC0111x) {
        int u2;
        int i2 = this.f1556b & 7;
        AbstractC0098j abstractC0098j = this.f1555a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0111x).add(Long.valueOf(abstractC0098j.r()));
                if (abstractC0098j.c()) {
                    return;
                } else {
                    u2 = abstractC0098j.u();
                }
            } while (u2 == this.f1556b);
            this.f1558d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0098j.b() + abstractC0098j.v();
        do {
            ((U) interfaceC0111x).add(Long.valueOf(abstractC0098j.r()));
        } while (abstractC0098j.b() < b2);
        v(b2);
    }

    public final void s(InterfaceC0111x interfaceC0111x, boolean z2) {
        String s2;
        int u2;
        if ((this.f1556b & 7) != 2) {
            throw A.b();
        }
        do {
            AbstractC0098j abstractC0098j = this.f1555a;
            if (z2) {
                w(2);
                s2 = abstractC0098j.t();
            } else {
                w(2);
                s2 = abstractC0098j.s();
            }
            ((U) interfaceC0111x).add(s2);
            if (abstractC0098j.c()) {
                return;
            } else {
                u2 = abstractC0098j.u();
            }
        } while (u2 == this.f1556b);
        this.f1558d = u2;
    }

    public final void t(InterfaceC0111x interfaceC0111x) {
        int u2;
        int i2 = this.f1556b & 7;
        AbstractC0098j abstractC0098j = this.f1555a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0111x).add(Integer.valueOf(abstractC0098j.v()));
                if (abstractC0098j.c()) {
                    return;
                } else {
                    u2 = abstractC0098j.u();
                }
            } while (u2 == this.f1556b);
            this.f1558d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0098j.b() + abstractC0098j.v();
        do {
            ((U) interfaceC0111x).add(Integer.valueOf(abstractC0098j.v()));
        } while (abstractC0098j.b() < b2);
        v(b2);
    }

    public final void u(InterfaceC0111x interfaceC0111x) {
        int u2;
        int i2 = this.f1556b & 7;
        AbstractC0098j abstractC0098j = this.f1555a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0111x).add(Long.valueOf(abstractC0098j.w()));
                if (abstractC0098j.c()) {
                    return;
                } else {
                    u2 = abstractC0098j.u();
                }
            } while (u2 == this.f1556b);
            this.f1558d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0098j.b() + abstractC0098j.v();
        do {
            ((U) interfaceC0111x).add(Long.valueOf(abstractC0098j.w()));
        } while (abstractC0098j.b() < b2);
        v(b2);
    }

    public final void v(int i2) {
        if (this.f1555a.b() != i2) {
            throw A.e();
        }
    }

    public final void w(int i2) {
        if ((this.f1556b & 7) != i2) {
            throw A.b();
        }
    }

    public final boolean x() {
        int i2;
        AbstractC0098j abstractC0098j = this.f1555a;
        if (abstractC0098j.c() || (i2 = this.f1556b) == this.f1557c) {
            return false;
        }
        return abstractC0098j.x(i2);
    }
}
