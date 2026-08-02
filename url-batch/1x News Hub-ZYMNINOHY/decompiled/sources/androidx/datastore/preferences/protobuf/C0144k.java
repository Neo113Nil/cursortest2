package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144k {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0143j f2321a;

    /* renamed from: b, reason: collision with root package name */
    public int f2322b;

    /* renamed from: c, reason: collision with root package name */
    public int f2323c;

    /* renamed from: d, reason: collision with root package name */
    public int f2324d = 0;

    public C0144k(AbstractC0143j abstractC0143j) {
        Charset charset = AbstractC0157y.f2364a;
        this.f2321a = abstractC0143j;
        abstractC0143j.f2314b = this;
    }

    public final int a() {
        int i3 = this.f2324d;
        if (i3 != 0) {
            this.f2322b = i3;
            this.f2324d = 0;
        } else {
            this.f2322b = this.f2321a.u();
        }
        int i4 = this.f2322b;
        if (i4 == 0 || i4 == this.f2323c) {
            return Integer.MAX_VALUE;
        }
        return i4 >>> 3;
    }

    public final void b(Object obj, W w3, C0148o c0148o) {
        int i3 = this.f2323c;
        this.f2323c = ((this.f2322b >>> 3) << 3) | 4;
        try {
            w3.g(obj, this, c0148o);
            if (this.f2322b == this.f2323c) {
            } else {
                throw new A("Failed to parse the message.");
            }
        } finally {
            this.f2323c = i3;
        }
    }

    public final void c(Object obj, W w3, C0148o c0148o) {
        AbstractC0143j abstractC0143j = this.f2321a;
        int v = abstractC0143j.v();
        if (abstractC0143j.f2313a >= 100) {
            throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int e3 = abstractC0143j.e(v);
        abstractC0143j.f2313a++;
        w3.g(obj, this, c0148o);
        abstractC0143j.a(0);
        abstractC0143j.f2313a--;
        abstractC0143j.d(e3);
    }

    public final void d(InterfaceC0156x interfaceC0156x) {
        int u3;
        int i3 = this.f2322b & 7;
        AbstractC0143j abstractC0143j = this.f2321a;
        if (i3 == 0) {
            do {
                ((U) interfaceC0156x).add(Boolean.valueOf(abstractC0143j.f()));
                if (abstractC0143j.c()) {
                    return;
                } else {
                    u3 = abstractC0143j.u();
                }
            } while (u3 == this.f2322b);
            this.f2324d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int b3 = abstractC0143j.b() + abstractC0143j.v();
        do {
            ((U) interfaceC0156x).add(Boolean.valueOf(abstractC0143j.f()));
        } while (abstractC0143j.b() < b3);
        v(b3);
    }

    public final C0140g e() {
        w(2);
        return this.f2321a.g();
    }

    public final void f(InterfaceC0156x interfaceC0156x) {
        int u3;
        if ((this.f2322b & 7) != 2) {
            throw A.b();
        }
        do {
            ((U) interfaceC0156x).add(e());
            AbstractC0143j abstractC0143j = this.f2321a;
            if (abstractC0143j.c()) {
                return;
            } else {
                u3 = abstractC0143j.u();
            }
        } while (u3 == this.f2322b);
        this.f2324d = u3;
    }

    public final void g(InterfaceC0156x interfaceC0156x) {
        int u3;
        int i3 = this.f2322b & 7;
        AbstractC0143j abstractC0143j = this.f2321a;
        if (i3 == 1) {
            do {
                ((U) interfaceC0156x).add(Double.valueOf(abstractC0143j.h()));
                if (abstractC0143j.c()) {
                    return;
                } else {
                    u3 = abstractC0143j.u();
                }
            } while (u3 == this.f2322b);
            this.f2324d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int v = abstractC0143j.v();
        if ((v & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b3 = abstractC0143j.b() + v;
        do {
            ((U) interfaceC0156x).add(Double.valueOf(abstractC0143j.h()));
        } while (abstractC0143j.b() < b3);
    }

    public final void h(InterfaceC0156x interfaceC0156x) {
        int u3;
        int i3 = this.f2322b & 7;
        AbstractC0143j abstractC0143j = this.f2321a;
        if (i3 == 0) {
            do {
                ((U) interfaceC0156x).add(Integer.valueOf(abstractC0143j.i()));
                if (abstractC0143j.c()) {
                    return;
                } else {
                    u3 = abstractC0143j.u();
                }
            } while (u3 == this.f2322b);
            this.f2324d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int b3 = abstractC0143j.b() + abstractC0143j.v();
        do {
            ((U) interfaceC0156x).add(Integer.valueOf(abstractC0143j.i()));
        } while (abstractC0143j.b() < b3);
        v(b3);
    }

    public final Object i(r0 r0Var, Class cls, C0148o c0148o) {
        int ordinal = r0Var.ordinal();
        AbstractC0143j abstractC0143j = this.f2321a;
        switch (ordinal) {
            case 0:
                w(1);
                return Double.valueOf(abstractC0143j.h());
            case 1:
                w(5);
                return Float.valueOf(abstractC0143j.l());
            case 2:
                w(0);
                return Long.valueOf(abstractC0143j.n());
            case 3:
                w(0);
                return Long.valueOf(abstractC0143j.w());
            case 4:
                w(0);
                return Integer.valueOf(abstractC0143j.m());
            case 5:
                w(1);
                return Long.valueOf(abstractC0143j.k());
            case 6:
                w(5);
                return Integer.valueOf(abstractC0143j.j());
            case 7:
                w(0);
                return Boolean.valueOf(abstractC0143j.f());
            case 8:
                w(2);
                return abstractC0143j.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                W a3 = T.f2253c.a(cls);
                AbstractC0155w newInstance = a3.newInstance();
                c(newInstance, a3, c0148o);
                a3.d(newInstance);
                return newInstance;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(abstractC0143j.v());
            case 13:
                w(0);
                return Integer.valueOf(abstractC0143j.i());
            case 14:
                w(5);
                return Integer.valueOf(abstractC0143j.o());
            case 15:
                w(1);
                return Long.valueOf(abstractC0143j.p());
            case 16:
                w(0);
                return Integer.valueOf(abstractC0143j.q());
            case 17:
                w(0);
                return Long.valueOf(abstractC0143j.r());
        }
    }

    public final void j(InterfaceC0156x interfaceC0156x) {
        int u3;
        int i3 = this.f2322b & 7;
        AbstractC0143j abstractC0143j = this.f2321a;
        if (i3 == 2) {
            int v = abstractC0143j.v();
            if ((v & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b3 = abstractC0143j.b() + v;
            do {
                ((U) interfaceC0156x).add(Integer.valueOf(abstractC0143j.j()));
            } while (abstractC0143j.b() < b3);
            return;
        }
        if (i3 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0156x).add(Integer.valueOf(abstractC0143j.j()));
            if (abstractC0143j.c()) {
                return;
            } else {
                u3 = abstractC0143j.u();
            }
        } while (u3 == this.f2322b);
        this.f2324d = u3;
    }

    public final void k(InterfaceC0156x interfaceC0156x) {
        int u3;
        int i3 = this.f2322b & 7;
        AbstractC0143j abstractC0143j = this.f2321a;
        if (i3 == 1) {
            do {
                ((U) interfaceC0156x).add(Long.valueOf(abstractC0143j.k()));
                if (abstractC0143j.c()) {
                    return;
                } else {
                    u3 = abstractC0143j.u();
                }
            } while (u3 == this.f2322b);
            this.f2324d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int v = abstractC0143j.v();
        if ((v & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b3 = abstractC0143j.b() + v;
        do {
            ((U) interfaceC0156x).add(Long.valueOf(abstractC0143j.k()));
        } while (abstractC0143j.b() < b3);
    }

    public final void l(InterfaceC0156x interfaceC0156x) {
        int u3;
        int i3 = this.f2322b & 7;
        AbstractC0143j abstractC0143j = this.f2321a;
        if (i3 == 2) {
            int v = abstractC0143j.v();
            if ((v & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b3 = abstractC0143j.b() + v;
            do {
                ((U) interfaceC0156x).add(Float.valueOf(abstractC0143j.l()));
            } while (abstractC0143j.b() < b3);
            return;
        }
        if (i3 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0156x).add(Float.valueOf(abstractC0143j.l()));
            if (abstractC0143j.c()) {
                return;
            } else {
                u3 = abstractC0143j.u();
            }
        } while (u3 == this.f2322b);
        this.f2324d = u3;
    }

    public final void m(InterfaceC0156x interfaceC0156x) {
        int u3;
        int i3 = this.f2322b & 7;
        AbstractC0143j abstractC0143j = this.f2321a;
        if (i3 == 0) {
            do {
                ((U) interfaceC0156x).add(Integer.valueOf(abstractC0143j.m()));
                if (abstractC0143j.c()) {
                    return;
                } else {
                    u3 = abstractC0143j.u();
                }
            } while (u3 == this.f2322b);
            this.f2324d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int b3 = abstractC0143j.b() + abstractC0143j.v();
        do {
            ((U) interfaceC0156x).add(Integer.valueOf(abstractC0143j.m()));
        } while (abstractC0143j.b() < b3);
        v(b3);
    }

    public final void n(InterfaceC0156x interfaceC0156x) {
        int u3;
        int i3 = this.f2322b & 7;
        AbstractC0143j abstractC0143j = this.f2321a;
        if (i3 == 0) {
            do {
                ((U) interfaceC0156x).add(Long.valueOf(abstractC0143j.n()));
                if (abstractC0143j.c()) {
                    return;
                } else {
                    u3 = abstractC0143j.u();
                }
            } while (u3 == this.f2322b);
            this.f2324d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int b3 = abstractC0143j.b() + abstractC0143j.v();
        do {
            ((U) interfaceC0156x).add(Long.valueOf(abstractC0143j.n()));
        } while (abstractC0143j.b() < b3);
        v(b3);
    }

    public final void o(InterfaceC0156x interfaceC0156x) {
        int u3;
        int i3 = this.f2322b & 7;
        AbstractC0143j abstractC0143j = this.f2321a;
        if (i3 == 2) {
            int v = abstractC0143j.v();
            if ((v & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b3 = abstractC0143j.b() + v;
            do {
                ((U) interfaceC0156x).add(Integer.valueOf(abstractC0143j.o()));
            } while (abstractC0143j.b() < b3);
            return;
        }
        if (i3 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0156x).add(Integer.valueOf(abstractC0143j.o()));
            if (abstractC0143j.c()) {
                return;
            } else {
                u3 = abstractC0143j.u();
            }
        } while (u3 == this.f2322b);
        this.f2324d = u3;
    }

    public final void p(InterfaceC0156x interfaceC0156x) {
        int u3;
        int i3 = this.f2322b & 7;
        AbstractC0143j abstractC0143j = this.f2321a;
        if (i3 == 1) {
            do {
                ((U) interfaceC0156x).add(Long.valueOf(abstractC0143j.p()));
                if (abstractC0143j.c()) {
                    return;
                } else {
                    u3 = abstractC0143j.u();
                }
            } while (u3 == this.f2322b);
            this.f2324d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int v = abstractC0143j.v();
        if ((v & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b3 = abstractC0143j.b() + v;
        do {
            ((U) interfaceC0156x).add(Long.valueOf(abstractC0143j.p()));
        } while (abstractC0143j.b() < b3);
    }

    public final void q(InterfaceC0156x interfaceC0156x) {
        int u3;
        int i3 = this.f2322b & 7;
        AbstractC0143j abstractC0143j = this.f2321a;
        if (i3 == 0) {
            do {
                ((U) interfaceC0156x).add(Integer.valueOf(abstractC0143j.q()));
                if (abstractC0143j.c()) {
                    return;
                } else {
                    u3 = abstractC0143j.u();
                }
            } while (u3 == this.f2322b);
            this.f2324d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int b3 = abstractC0143j.b() + abstractC0143j.v();
        do {
            ((U) interfaceC0156x).add(Integer.valueOf(abstractC0143j.q()));
        } while (abstractC0143j.b() < b3);
        v(b3);
    }

    public final void r(InterfaceC0156x interfaceC0156x) {
        int u3;
        int i3 = this.f2322b & 7;
        AbstractC0143j abstractC0143j = this.f2321a;
        if (i3 == 0) {
            do {
                ((U) interfaceC0156x).add(Long.valueOf(abstractC0143j.r()));
                if (abstractC0143j.c()) {
                    return;
                } else {
                    u3 = abstractC0143j.u();
                }
            } while (u3 == this.f2322b);
            this.f2324d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int b3 = abstractC0143j.b() + abstractC0143j.v();
        do {
            ((U) interfaceC0156x).add(Long.valueOf(abstractC0143j.r()));
        } while (abstractC0143j.b() < b3);
        v(b3);
    }

    public final void s(InterfaceC0156x interfaceC0156x, boolean z) {
        String s3;
        int u3;
        if ((this.f2322b & 7) != 2) {
            throw A.b();
        }
        do {
            AbstractC0143j abstractC0143j = this.f2321a;
            if (z) {
                w(2);
                s3 = abstractC0143j.t();
            } else {
                w(2);
                s3 = abstractC0143j.s();
            }
            ((U) interfaceC0156x).add(s3);
            if (abstractC0143j.c()) {
                return;
            } else {
                u3 = abstractC0143j.u();
            }
        } while (u3 == this.f2322b);
        this.f2324d = u3;
    }

    public final void t(InterfaceC0156x interfaceC0156x) {
        int u3;
        int i3 = this.f2322b & 7;
        AbstractC0143j abstractC0143j = this.f2321a;
        if (i3 == 0) {
            do {
                ((U) interfaceC0156x).add(Integer.valueOf(abstractC0143j.v()));
                if (abstractC0143j.c()) {
                    return;
                } else {
                    u3 = abstractC0143j.u();
                }
            } while (u3 == this.f2322b);
            this.f2324d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int b3 = abstractC0143j.b() + abstractC0143j.v();
        do {
            ((U) interfaceC0156x).add(Integer.valueOf(abstractC0143j.v()));
        } while (abstractC0143j.b() < b3);
        v(b3);
    }

    public final void u(InterfaceC0156x interfaceC0156x) {
        int u3;
        int i3 = this.f2322b & 7;
        AbstractC0143j abstractC0143j = this.f2321a;
        if (i3 == 0) {
            do {
                ((U) interfaceC0156x).add(Long.valueOf(abstractC0143j.w()));
                if (abstractC0143j.c()) {
                    return;
                } else {
                    u3 = abstractC0143j.u();
                }
            } while (u3 == this.f2322b);
            this.f2324d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int b3 = abstractC0143j.b() + abstractC0143j.v();
        do {
            ((U) interfaceC0156x).add(Long.valueOf(abstractC0143j.w()));
        } while (abstractC0143j.b() < b3);
        v(b3);
    }

    public final void v(int i3) {
        if (this.f2321a.b() != i3) {
            throw A.e();
        }
    }

    public final void w(int i3) {
        if ((this.f2322b & 7) != i3) {
            throw A.b();
        }
    }

    public final boolean x() {
        int i3;
        AbstractC0143j abstractC0143j = this.f2321a;
        if (abstractC0143j.c() || (i3 = this.f2322b) == this.f2323c) {
            return false;
        }
        return abstractC0143j.x(i3);
    }
}
