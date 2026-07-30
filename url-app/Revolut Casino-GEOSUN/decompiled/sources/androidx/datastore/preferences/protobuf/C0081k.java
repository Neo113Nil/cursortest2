package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081k {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0080j f1466a;

    /* renamed from: b, reason: collision with root package name */
    public int f1467b;

    /* renamed from: c, reason: collision with root package name */
    public int f1468c;

    /* renamed from: d, reason: collision with root package name */
    public int f1469d = 0;

    public C0081k(AbstractC0080j abstractC0080j) {
        Charset charset = AbstractC0094y.f1512a;
        this.f1466a = abstractC0080j;
        abstractC0080j.f1459b = this;
    }

    public final int a() {
        int i2 = this.f1469d;
        if (i2 != 0) {
            this.f1467b = i2;
            this.f1469d = 0;
        } else {
            this.f1467b = this.f1466a.u();
        }
        int i3 = this.f1467b;
        if (i3 == 0 || i3 == this.f1468c) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    public final void b(Object obj, W w2, C0085o c0085o) {
        int i2 = this.f1468c;
        this.f1468c = ((this.f1467b >>> 3) << 3) | 4;
        try {
            w2.b(obj, this, c0085o);
            if (this.f1467b == this.f1468c) {
            } else {
                throw new A("Failed to parse the message.");
            }
        } finally {
            this.f1468c = i2;
        }
    }

    public final void c(Object obj, W w2, C0085o c0085o) {
        AbstractC0080j abstractC0080j = this.f1466a;
        int v2 = abstractC0080j.v();
        if (abstractC0080j.f1458a >= 100) {
            throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int e2 = abstractC0080j.e(v2);
        abstractC0080j.f1458a++;
        w2.b(obj, this, c0085o);
        abstractC0080j.a(0);
        abstractC0080j.f1458a--;
        abstractC0080j.d(e2);
    }

    public final void d(InterfaceC0093x interfaceC0093x) {
        int u2;
        int i2 = this.f1467b & 7;
        AbstractC0080j abstractC0080j = this.f1466a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0093x).add(Boolean.valueOf(abstractC0080j.f()));
                if (abstractC0080j.c()) {
                    return;
                } else {
                    u2 = abstractC0080j.u();
                }
            } while (u2 == this.f1467b);
            this.f1469d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0080j.b() + abstractC0080j.v();
        do {
            ((U) interfaceC0093x).add(Boolean.valueOf(abstractC0080j.f()));
        } while (abstractC0080j.b() < b2);
        v(b2);
    }

    public final C0077g e() {
        w(2);
        return this.f1466a.g();
    }

    public final void f(InterfaceC0093x interfaceC0093x) {
        int u2;
        if ((this.f1467b & 7) != 2) {
            throw A.b();
        }
        do {
            ((U) interfaceC0093x).add(e());
            AbstractC0080j abstractC0080j = this.f1466a;
            if (abstractC0080j.c()) {
                return;
            } else {
                u2 = abstractC0080j.u();
            }
        } while (u2 == this.f1467b);
        this.f1469d = u2;
    }

    public final void g(InterfaceC0093x interfaceC0093x) {
        int u2;
        int i2 = this.f1467b & 7;
        AbstractC0080j abstractC0080j = this.f1466a;
        if (i2 == 1) {
            do {
                ((U) interfaceC0093x).add(Double.valueOf(abstractC0080j.h()));
                if (abstractC0080j.c()) {
                    return;
                } else {
                    u2 = abstractC0080j.u();
                }
            } while (u2 == this.f1467b);
            this.f1469d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int v2 = abstractC0080j.v();
        if ((v2 & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b2 = abstractC0080j.b() + v2;
        do {
            ((U) interfaceC0093x).add(Double.valueOf(abstractC0080j.h()));
        } while (abstractC0080j.b() < b2);
    }

    public final void h(InterfaceC0093x interfaceC0093x) {
        int u2;
        int i2 = this.f1467b & 7;
        AbstractC0080j abstractC0080j = this.f1466a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0093x).add(Integer.valueOf(abstractC0080j.i()));
                if (abstractC0080j.c()) {
                    return;
                } else {
                    u2 = abstractC0080j.u();
                }
            } while (u2 == this.f1467b);
            this.f1469d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0080j.b() + abstractC0080j.v();
        do {
            ((U) interfaceC0093x).add(Integer.valueOf(abstractC0080j.i()));
        } while (abstractC0080j.b() < b2);
        v(b2);
    }

    public final Object i(r0 r0Var, Class cls, C0085o c0085o) {
        int ordinal = r0Var.ordinal();
        AbstractC0080j abstractC0080j = this.f1466a;
        switch (ordinal) {
            case 0:
                w(1);
                return Double.valueOf(abstractC0080j.h());
            case 1:
                w(5);
                return Float.valueOf(abstractC0080j.l());
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                w(0);
                return Long.valueOf(abstractC0080j.n());
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                w(0);
                return Long.valueOf(abstractC0080j.w());
            case F.k.LONG_FIELD_NUMBER /* 4 */:
                w(0);
                return Integer.valueOf(abstractC0080j.m());
            case F.k.STRING_FIELD_NUMBER /* 5 */:
                w(1);
                return Long.valueOf(abstractC0080j.k());
            case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                w(5);
                return Integer.valueOf(abstractC0080j.j());
            case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                w(0);
                return Boolean.valueOf(abstractC0080j.f());
            case F.k.BYTES_FIELD_NUMBER /* 8 */:
                w(2);
                return abstractC0080j.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                W a2 = T.f1395c.a(cls);
                AbstractC0092w d2 = a2.d();
                c(d2, a2, c0085o);
                a2.g(d2);
                return d2;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(abstractC0080j.v());
            case 13:
                w(0);
                return Integer.valueOf(abstractC0080j.i());
            case 14:
                w(5);
                return Integer.valueOf(abstractC0080j.o());
            case 15:
                w(1);
                return Long.valueOf(abstractC0080j.p());
            case 16:
                w(0);
                return Integer.valueOf(abstractC0080j.q());
            case 17:
                w(0);
                return Long.valueOf(abstractC0080j.r());
        }
    }

    public final void j(InterfaceC0093x interfaceC0093x) {
        int u2;
        int i2 = this.f1467b & 7;
        AbstractC0080j abstractC0080j = this.f1466a;
        if (i2 == 2) {
            int v2 = abstractC0080j.v();
            if ((v2 & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b2 = abstractC0080j.b() + v2;
            do {
                ((U) interfaceC0093x).add(Integer.valueOf(abstractC0080j.j()));
            } while (abstractC0080j.b() < b2);
            return;
        }
        if (i2 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0093x).add(Integer.valueOf(abstractC0080j.j()));
            if (abstractC0080j.c()) {
                return;
            } else {
                u2 = abstractC0080j.u();
            }
        } while (u2 == this.f1467b);
        this.f1469d = u2;
    }

    public final void k(InterfaceC0093x interfaceC0093x) {
        int u2;
        int i2 = this.f1467b & 7;
        AbstractC0080j abstractC0080j = this.f1466a;
        if (i2 == 1) {
            do {
                ((U) interfaceC0093x).add(Long.valueOf(abstractC0080j.k()));
                if (abstractC0080j.c()) {
                    return;
                } else {
                    u2 = abstractC0080j.u();
                }
            } while (u2 == this.f1467b);
            this.f1469d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int v2 = abstractC0080j.v();
        if ((v2 & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b2 = abstractC0080j.b() + v2;
        do {
            ((U) interfaceC0093x).add(Long.valueOf(abstractC0080j.k()));
        } while (abstractC0080j.b() < b2);
    }

    public final void l(InterfaceC0093x interfaceC0093x) {
        int u2;
        int i2 = this.f1467b & 7;
        AbstractC0080j abstractC0080j = this.f1466a;
        if (i2 == 2) {
            int v2 = abstractC0080j.v();
            if ((v2 & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b2 = abstractC0080j.b() + v2;
            do {
                ((U) interfaceC0093x).add(Float.valueOf(abstractC0080j.l()));
            } while (abstractC0080j.b() < b2);
            return;
        }
        if (i2 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0093x).add(Float.valueOf(abstractC0080j.l()));
            if (abstractC0080j.c()) {
                return;
            } else {
                u2 = abstractC0080j.u();
            }
        } while (u2 == this.f1467b);
        this.f1469d = u2;
    }

    public final void m(InterfaceC0093x interfaceC0093x) {
        int u2;
        int i2 = this.f1467b & 7;
        AbstractC0080j abstractC0080j = this.f1466a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0093x).add(Integer.valueOf(abstractC0080j.m()));
                if (abstractC0080j.c()) {
                    return;
                } else {
                    u2 = abstractC0080j.u();
                }
            } while (u2 == this.f1467b);
            this.f1469d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0080j.b() + abstractC0080j.v();
        do {
            ((U) interfaceC0093x).add(Integer.valueOf(abstractC0080j.m()));
        } while (abstractC0080j.b() < b2);
        v(b2);
    }

    public final void n(InterfaceC0093x interfaceC0093x) {
        int u2;
        int i2 = this.f1467b & 7;
        AbstractC0080j abstractC0080j = this.f1466a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0093x).add(Long.valueOf(abstractC0080j.n()));
                if (abstractC0080j.c()) {
                    return;
                } else {
                    u2 = abstractC0080j.u();
                }
            } while (u2 == this.f1467b);
            this.f1469d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0080j.b() + abstractC0080j.v();
        do {
            ((U) interfaceC0093x).add(Long.valueOf(abstractC0080j.n()));
        } while (abstractC0080j.b() < b2);
        v(b2);
    }

    public final void o(InterfaceC0093x interfaceC0093x) {
        int u2;
        int i2 = this.f1467b & 7;
        AbstractC0080j abstractC0080j = this.f1466a;
        if (i2 == 2) {
            int v2 = abstractC0080j.v();
            if ((v2 & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b2 = abstractC0080j.b() + v2;
            do {
                ((U) interfaceC0093x).add(Integer.valueOf(abstractC0080j.o()));
            } while (abstractC0080j.b() < b2);
            return;
        }
        if (i2 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0093x).add(Integer.valueOf(abstractC0080j.o()));
            if (abstractC0080j.c()) {
                return;
            } else {
                u2 = abstractC0080j.u();
            }
        } while (u2 == this.f1467b);
        this.f1469d = u2;
    }

    public final void p(InterfaceC0093x interfaceC0093x) {
        int u2;
        int i2 = this.f1467b & 7;
        AbstractC0080j abstractC0080j = this.f1466a;
        if (i2 == 1) {
            do {
                ((U) interfaceC0093x).add(Long.valueOf(abstractC0080j.p()));
                if (abstractC0080j.c()) {
                    return;
                } else {
                    u2 = abstractC0080j.u();
                }
            } while (u2 == this.f1467b);
            this.f1469d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int v2 = abstractC0080j.v();
        if ((v2 & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b2 = abstractC0080j.b() + v2;
        do {
            ((U) interfaceC0093x).add(Long.valueOf(abstractC0080j.p()));
        } while (abstractC0080j.b() < b2);
    }

    public final void q(InterfaceC0093x interfaceC0093x) {
        int u2;
        int i2 = this.f1467b & 7;
        AbstractC0080j abstractC0080j = this.f1466a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0093x).add(Integer.valueOf(abstractC0080j.q()));
                if (abstractC0080j.c()) {
                    return;
                } else {
                    u2 = abstractC0080j.u();
                }
            } while (u2 == this.f1467b);
            this.f1469d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0080j.b() + abstractC0080j.v();
        do {
            ((U) interfaceC0093x).add(Integer.valueOf(abstractC0080j.q()));
        } while (abstractC0080j.b() < b2);
        v(b2);
    }

    public final void r(InterfaceC0093x interfaceC0093x) {
        int u2;
        int i2 = this.f1467b & 7;
        AbstractC0080j abstractC0080j = this.f1466a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0093x).add(Long.valueOf(abstractC0080j.r()));
                if (abstractC0080j.c()) {
                    return;
                } else {
                    u2 = abstractC0080j.u();
                }
            } while (u2 == this.f1467b);
            this.f1469d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0080j.b() + abstractC0080j.v();
        do {
            ((U) interfaceC0093x).add(Long.valueOf(abstractC0080j.r()));
        } while (abstractC0080j.b() < b2);
        v(b2);
    }

    public final void s(InterfaceC0093x interfaceC0093x, boolean z2) {
        String s2;
        int u2;
        if ((this.f1467b & 7) != 2) {
            throw A.b();
        }
        do {
            AbstractC0080j abstractC0080j = this.f1466a;
            if (z2) {
                w(2);
                s2 = abstractC0080j.t();
            } else {
                w(2);
                s2 = abstractC0080j.s();
            }
            ((U) interfaceC0093x).add(s2);
            if (abstractC0080j.c()) {
                return;
            } else {
                u2 = abstractC0080j.u();
            }
        } while (u2 == this.f1467b);
        this.f1469d = u2;
    }

    public final void t(InterfaceC0093x interfaceC0093x) {
        int u2;
        int i2 = this.f1467b & 7;
        AbstractC0080j abstractC0080j = this.f1466a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0093x).add(Integer.valueOf(abstractC0080j.v()));
                if (abstractC0080j.c()) {
                    return;
                } else {
                    u2 = abstractC0080j.u();
                }
            } while (u2 == this.f1467b);
            this.f1469d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0080j.b() + abstractC0080j.v();
        do {
            ((U) interfaceC0093x).add(Integer.valueOf(abstractC0080j.v()));
        } while (abstractC0080j.b() < b2);
        v(b2);
    }

    public final void u(InterfaceC0093x interfaceC0093x) {
        int u2;
        int i2 = this.f1467b & 7;
        AbstractC0080j abstractC0080j = this.f1466a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0093x).add(Long.valueOf(abstractC0080j.w()));
                if (abstractC0080j.c()) {
                    return;
                } else {
                    u2 = abstractC0080j.u();
                }
            } while (u2 == this.f1467b);
            this.f1469d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0080j.b() + abstractC0080j.v();
        do {
            ((U) interfaceC0093x).add(Long.valueOf(abstractC0080j.w()));
        } while (abstractC0080j.b() < b2);
        v(b2);
    }

    public final void v(int i2) {
        if (this.f1466a.b() != i2) {
            throw A.e();
        }
    }

    public final void w(int i2) {
        if ((this.f1467b & 7) != i2) {
            throw A.b();
        }
    }

    public final boolean x() {
        int i2;
        AbstractC0080j abstractC0080j = this.f1466a;
        if (abstractC0080j.c() || (i2 = this.f1467b) == this.f1468c) {
            return false;
        }
        return abstractC0080j.x(i2);
    }
}
