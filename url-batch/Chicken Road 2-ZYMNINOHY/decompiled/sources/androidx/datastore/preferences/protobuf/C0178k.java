package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178k {

    /* renamed from: a, reason: collision with root package name */
    public int f4665a;

    /* renamed from: b, reason: collision with root package name */
    public int f4666b;

    /* renamed from: c, reason: collision with root package name */
    public int f4667c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4668d;

    public C0178k() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f4667c = highestOneBit - 1;
        this.f4668d = new int[highestOneBit];
    }

    public void a(int i4) {
        int[] iArr = (int[]) this.f4668d;
        int i5 = this.f4666b;
        iArr[i5] = i4;
        int i6 = this.f4667c & (i5 + 1);
        this.f4666b = i6;
        int i7 = this.f4665a;
        if (i6 == i7) {
            int length = iArr.length;
            int i8 = length - i7;
            int i9 = length << 1;
            if (i9 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i9];
            d3.g.P(0, i7, length, iArr, iArr2);
            d3.g.P(i8, 0, this.f4665a, (int[]) this.f4668d, iArr2);
            this.f4668d = iArr2;
            this.f4665a = 0;
            this.f4666b = length;
            this.f4667c = i9 - 1;
        }
    }

    public int b() {
        int i4 = this.f4667c;
        if (i4 != 0) {
            this.f4665a = i4;
            this.f4667c = 0;
        } else {
            this.f4665a = ((AbstractC0177j) this.f4668d).u();
        }
        int i5 = this.f4665a;
        if (i5 == 0 || i5 == this.f4666b) {
            return Integer.MAX_VALUE;
        }
        return i5 >>> 3;
    }

    public void c(Object obj, W w4, C0182o c0182o) {
        int i4 = this.f4666b;
        this.f4666b = ((this.f4665a >>> 3) << 3) | 4;
        try {
            w4.h(obj, this, c0182o);
            if (this.f4665a == this.f4666b) {
            } else {
                throw new A("Failed to parse the message.");
            }
        } finally {
            this.f4666b = i4;
        }
    }

    public void d(Object obj, W w4, C0182o c0182o) {
        AbstractC0177j abstractC0177j = (AbstractC0177j) this.f4668d;
        int v = abstractC0177j.v();
        if (abstractC0177j.f4656a >= 100) {
            throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int e4 = abstractC0177j.e(v);
        abstractC0177j.f4656a++;
        w4.h(obj, this, c0182o);
        abstractC0177j.a(0);
        abstractC0177j.f4656a--;
        abstractC0177j.d(e4);
    }

    public void e(InterfaceC0190x interfaceC0190x) {
        int u4;
        AbstractC0177j abstractC0177j = (AbstractC0177j) this.f4668d;
        int i4 = this.f4665a & 7;
        if (i4 == 0) {
            do {
                ((U) interfaceC0190x).add(Boolean.valueOf(abstractC0177j.f()));
                if (abstractC0177j.c()) {
                    return;
                } else {
                    u4 = abstractC0177j.u();
                }
            } while (u4 == this.f4665a);
            this.f4667c = u4;
            return;
        }
        if (i4 != 2) {
            throw A.b();
        }
        int b4 = abstractC0177j.b() + abstractC0177j.v();
        do {
            ((U) interfaceC0190x).add(Boolean.valueOf(abstractC0177j.f()));
        } while (abstractC0177j.b() < b4);
        w(b4);
    }

    public C0174g f() {
        x(2);
        return ((AbstractC0177j) this.f4668d).g();
    }

    public void g(InterfaceC0190x interfaceC0190x) {
        int u4;
        AbstractC0177j abstractC0177j = (AbstractC0177j) this.f4668d;
        if ((this.f4665a & 7) != 2) {
            throw A.b();
        }
        do {
            ((U) interfaceC0190x).add(f());
            if (abstractC0177j.c()) {
                return;
            } else {
                u4 = abstractC0177j.u();
            }
        } while (u4 == this.f4665a);
        this.f4667c = u4;
    }

    public void h(InterfaceC0190x interfaceC0190x) {
        int u4;
        AbstractC0177j abstractC0177j = (AbstractC0177j) this.f4668d;
        int i4 = this.f4665a & 7;
        if (i4 == 1) {
            do {
                ((U) interfaceC0190x).add(Double.valueOf(abstractC0177j.h()));
                if (abstractC0177j.c()) {
                    return;
                } else {
                    u4 = abstractC0177j.u();
                }
            } while (u4 == this.f4665a);
            this.f4667c = u4;
            return;
        }
        if (i4 != 2) {
            throw A.b();
        }
        int v = abstractC0177j.v();
        if ((v & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b4 = abstractC0177j.b() + v;
        do {
            ((U) interfaceC0190x).add(Double.valueOf(abstractC0177j.h()));
        } while (abstractC0177j.b() < b4);
    }

    public void i(InterfaceC0190x interfaceC0190x) {
        int u4;
        AbstractC0177j abstractC0177j = (AbstractC0177j) this.f4668d;
        int i4 = this.f4665a & 7;
        if (i4 == 0) {
            do {
                ((U) interfaceC0190x).add(Integer.valueOf(abstractC0177j.i()));
                if (abstractC0177j.c()) {
                    return;
                } else {
                    u4 = abstractC0177j.u();
                }
            } while (u4 == this.f4665a);
            this.f4667c = u4;
            return;
        }
        if (i4 != 2) {
            throw A.b();
        }
        int b4 = abstractC0177j.b() + abstractC0177j.v();
        do {
            ((U) interfaceC0190x).add(Integer.valueOf(abstractC0177j.i()));
        } while (abstractC0177j.b() < b4);
        w(b4);
    }

    public Object j(r0 r0Var, Class cls, C0182o c0182o) {
        AbstractC0177j abstractC0177j = (AbstractC0177j) this.f4668d;
        switch (r0Var.ordinal()) {
            case 0:
                x(1);
                return Double.valueOf(abstractC0177j.h());
            case 1:
                x(5);
                return Float.valueOf(abstractC0177j.l());
            case 2:
                x(0);
                return Long.valueOf(abstractC0177j.n());
            case 3:
                x(0);
                return Long.valueOf(abstractC0177j.w());
            case 4:
                x(0);
                return Integer.valueOf(abstractC0177j.m());
            case 5:
                x(1);
                return Long.valueOf(abstractC0177j.k());
            case 6:
                x(5);
                return Integer.valueOf(abstractC0177j.j());
            case 7:
                x(0);
                return Boolean.valueOf(abstractC0177j.f());
            case 8:
                x(2);
                return abstractC0177j.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                x(2);
                W a3 = T.f4591c.a(cls);
                AbstractC0189w newInstance = a3.newInstance();
                d(newInstance, a3, c0182o);
                a3.c(newInstance);
                return newInstance;
            case 11:
                return f();
            case 12:
                x(0);
                return Integer.valueOf(abstractC0177j.v());
            case 13:
                x(0);
                return Integer.valueOf(abstractC0177j.i());
            case 14:
                x(5);
                return Integer.valueOf(abstractC0177j.o());
            case 15:
                x(1);
                return Long.valueOf(abstractC0177j.p());
            case 16:
                x(0);
                return Integer.valueOf(abstractC0177j.q());
            case 17:
                x(0);
                return Long.valueOf(abstractC0177j.r());
        }
    }

    public void k(InterfaceC0190x interfaceC0190x) {
        int u4;
        AbstractC0177j abstractC0177j = (AbstractC0177j) this.f4668d;
        int i4 = this.f4665a & 7;
        if (i4 == 2) {
            int v = abstractC0177j.v();
            if ((v & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b4 = abstractC0177j.b() + v;
            do {
                ((U) interfaceC0190x).add(Integer.valueOf(abstractC0177j.j()));
            } while (abstractC0177j.b() < b4);
            return;
        }
        if (i4 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0190x).add(Integer.valueOf(abstractC0177j.j()));
            if (abstractC0177j.c()) {
                return;
            } else {
                u4 = abstractC0177j.u();
            }
        } while (u4 == this.f4665a);
        this.f4667c = u4;
    }

    public void l(InterfaceC0190x interfaceC0190x) {
        int u4;
        AbstractC0177j abstractC0177j = (AbstractC0177j) this.f4668d;
        int i4 = this.f4665a & 7;
        if (i4 == 1) {
            do {
                ((U) interfaceC0190x).add(Long.valueOf(abstractC0177j.k()));
                if (abstractC0177j.c()) {
                    return;
                } else {
                    u4 = abstractC0177j.u();
                }
            } while (u4 == this.f4665a);
            this.f4667c = u4;
            return;
        }
        if (i4 != 2) {
            throw A.b();
        }
        int v = abstractC0177j.v();
        if ((v & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b4 = abstractC0177j.b() + v;
        do {
            ((U) interfaceC0190x).add(Long.valueOf(abstractC0177j.k()));
        } while (abstractC0177j.b() < b4);
    }

    public void m(InterfaceC0190x interfaceC0190x) {
        int u4;
        AbstractC0177j abstractC0177j = (AbstractC0177j) this.f4668d;
        int i4 = this.f4665a & 7;
        if (i4 == 2) {
            int v = abstractC0177j.v();
            if ((v & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b4 = abstractC0177j.b() + v;
            do {
                ((U) interfaceC0190x).add(Float.valueOf(abstractC0177j.l()));
            } while (abstractC0177j.b() < b4);
            return;
        }
        if (i4 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0190x).add(Float.valueOf(abstractC0177j.l()));
            if (abstractC0177j.c()) {
                return;
            } else {
                u4 = abstractC0177j.u();
            }
        } while (u4 == this.f4665a);
        this.f4667c = u4;
    }

    public void n(InterfaceC0190x interfaceC0190x) {
        int u4;
        AbstractC0177j abstractC0177j = (AbstractC0177j) this.f4668d;
        int i4 = this.f4665a & 7;
        if (i4 == 0) {
            do {
                ((U) interfaceC0190x).add(Integer.valueOf(abstractC0177j.m()));
                if (abstractC0177j.c()) {
                    return;
                } else {
                    u4 = abstractC0177j.u();
                }
            } while (u4 == this.f4665a);
            this.f4667c = u4;
            return;
        }
        if (i4 != 2) {
            throw A.b();
        }
        int b4 = abstractC0177j.b() + abstractC0177j.v();
        do {
            ((U) interfaceC0190x).add(Integer.valueOf(abstractC0177j.m()));
        } while (abstractC0177j.b() < b4);
        w(b4);
    }

    public void o(InterfaceC0190x interfaceC0190x) {
        int u4;
        AbstractC0177j abstractC0177j = (AbstractC0177j) this.f4668d;
        int i4 = this.f4665a & 7;
        if (i4 == 0) {
            do {
                ((U) interfaceC0190x).add(Long.valueOf(abstractC0177j.n()));
                if (abstractC0177j.c()) {
                    return;
                } else {
                    u4 = abstractC0177j.u();
                }
            } while (u4 == this.f4665a);
            this.f4667c = u4;
            return;
        }
        if (i4 != 2) {
            throw A.b();
        }
        int b4 = abstractC0177j.b() + abstractC0177j.v();
        do {
            ((U) interfaceC0190x).add(Long.valueOf(abstractC0177j.n()));
        } while (abstractC0177j.b() < b4);
        w(b4);
    }

    public void p(InterfaceC0190x interfaceC0190x) {
        int u4;
        AbstractC0177j abstractC0177j = (AbstractC0177j) this.f4668d;
        int i4 = this.f4665a & 7;
        if (i4 == 2) {
            int v = abstractC0177j.v();
            if ((v & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b4 = abstractC0177j.b() + v;
            do {
                ((U) interfaceC0190x).add(Integer.valueOf(abstractC0177j.o()));
            } while (abstractC0177j.b() < b4);
            return;
        }
        if (i4 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0190x).add(Integer.valueOf(abstractC0177j.o()));
            if (abstractC0177j.c()) {
                return;
            } else {
                u4 = abstractC0177j.u();
            }
        } while (u4 == this.f4665a);
        this.f4667c = u4;
    }

    public void q(InterfaceC0190x interfaceC0190x) {
        int u4;
        AbstractC0177j abstractC0177j = (AbstractC0177j) this.f4668d;
        int i4 = this.f4665a & 7;
        if (i4 == 1) {
            do {
                ((U) interfaceC0190x).add(Long.valueOf(abstractC0177j.p()));
                if (abstractC0177j.c()) {
                    return;
                } else {
                    u4 = abstractC0177j.u();
                }
            } while (u4 == this.f4665a);
            this.f4667c = u4;
            return;
        }
        if (i4 != 2) {
            throw A.b();
        }
        int v = abstractC0177j.v();
        if ((v & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b4 = abstractC0177j.b() + v;
        do {
            ((U) interfaceC0190x).add(Long.valueOf(abstractC0177j.p()));
        } while (abstractC0177j.b() < b4);
    }

    public void r(InterfaceC0190x interfaceC0190x) {
        int u4;
        AbstractC0177j abstractC0177j = (AbstractC0177j) this.f4668d;
        int i4 = this.f4665a & 7;
        if (i4 == 0) {
            do {
                ((U) interfaceC0190x).add(Integer.valueOf(abstractC0177j.q()));
                if (abstractC0177j.c()) {
                    return;
                } else {
                    u4 = abstractC0177j.u();
                }
            } while (u4 == this.f4665a);
            this.f4667c = u4;
            return;
        }
        if (i4 != 2) {
            throw A.b();
        }
        int b4 = abstractC0177j.b() + abstractC0177j.v();
        do {
            ((U) interfaceC0190x).add(Integer.valueOf(abstractC0177j.q()));
        } while (abstractC0177j.b() < b4);
        w(b4);
    }

    public void s(InterfaceC0190x interfaceC0190x) {
        int u4;
        AbstractC0177j abstractC0177j = (AbstractC0177j) this.f4668d;
        int i4 = this.f4665a & 7;
        if (i4 == 0) {
            do {
                ((U) interfaceC0190x).add(Long.valueOf(abstractC0177j.r()));
                if (abstractC0177j.c()) {
                    return;
                } else {
                    u4 = abstractC0177j.u();
                }
            } while (u4 == this.f4665a);
            this.f4667c = u4;
            return;
        }
        if (i4 != 2) {
            throw A.b();
        }
        int b4 = abstractC0177j.b() + abstractC0177j.v();
        do {
            ((U) interfaceC0190x).add(Long.valueOf(abstractC0177j.r()));
        } while (abstractC0177j.b() < b4);
        w(b4);
    }

    public void t(InterfaceC0190x interfaceC0190x, boolean z) {
        String s4;
        int u4;
        AbstractC0177j abstractC0177j = (AbstractC0177j) this.f4668d;
        if ((this.f4665a & 7) != 2) {
            throw A.b();
        }
        do {
            if (z) {
                x(2);
                s4 = abstractC0177j.t();
            } else {
                x(2);
                s4 = abstractC0177j.s();
            }
            ((U) interfaceC0190x).add(s4);
            if (abstractC0177j.c()) {
                return;
            } else {
                u4 = abstractC0177j.u();
            }
        } while (u4 == this.f4665a);
        this.f4667c = u4;
    }

    public void u(InterfaceC0190x interfaceC0190x) {
        int u4;
        AbstractC0177j abstractC0177j = (AbstractC0177j) this.f4668d;
        int i4 = this.f4665a & 7;
        if (i4 == 0) {
            do {
                ((U) interfaceC0190x).add(Integer.valueOf(abstractC0177j.v()));
                if (abstractC0177j.c()) {
                    return;
                } else {
                    u4 = abstractC0177j.u();
                }
            } while (u4 == this.f4665a);
            this.f4667c = u4;
            return;
        }
        if (i4 != 2) {
            throw A.b();
        }
        int b4 = abstractC0177j.b() + abstractC0177j.v();
        do {
            ((U) interfaceC0190x).add(Integer.valueOf(abstractC0177j.v()));
        } while (abstractC0177j.b() < b4);
        w(b4);
    }

    public void v(InterfaceC0190x interfaceC0190x) {
        int u4;
        AbstractC0177j abstractC0177j = (AbstractC0177j) this.f4668d;
        int i4 = this.f4665a & 7;
        if (i4 == 0) {
            do {
                ((U) interfaceC0190x).add(Long.valueOf(abstractC0177j.w()));
                if (abstractC0177j.c()) {
                    return;
                } else {
                    u4 = abstractC0177j.u();
                }
            } while (u4 == this.f4665a);
            this.f4667c = u4;
            return;
        }
        if (i4 != 2) {
            throw A.b();
        }
        int b4 = abstractC0177j.b() + abstractC0177j.v();
        do {
            ((U) interfaceC0190x).add(Long.valueOf(abstractC0177j.w()));
        } while (abstractC0177j.b() < b4);
        w(b4);
    }

    public void w(int i4) {
        if (((AbstractC0177j) this.f4668d).b() != i4) {
            throw A.e();
        }
    }

    public void x(int i4) {
        if ((this.f4665a & 7) != i4) {
            throw A.b();
        }
    }

    public boolean y() {
        int i4;
        AbstractC0177j abstractC0177j = (AbstractC0177j) this.f4668d;
        if (abstractC0177j.c() || (i4 = this.f4665a) == this.f4666b) {
            return false;
        }
        return abstractC0177j.x(i4);
    }

    public C0178k(AbstractC0177j abstractC0177j) {
        this.f4667c = 0;
        Charset charset = AbstractC0191y.f4712a;
        this.f4668d = abstractC0177j;
        abstractC0177j.f4657b = this;
    }
}
