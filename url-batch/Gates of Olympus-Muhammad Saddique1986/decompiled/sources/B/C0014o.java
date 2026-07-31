package B;

import a.AbstractC0235a;
import androidx.datastore.preferences.protobuf.A0;
import androidx.datastore.preferences.protobuf.AbstractC0256j;
import androidx.datastore.preferences.protobuf.AbstractC0267v;
import androidx.datastore.preferences.protobuf.AbstractC0269x;
import androidx.datastore.preferences.protobuf.C0253g;
import androidx.datastore.preferences.protobuf.C0260n;
import androidx.datastore.preferences.protobuf.C0271z;
import java.nio.charset.Charset;
import java.util.List;
import r.AbstractC0856c;

/* renamed from: B.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f427a;

    /* renamed from: b, reason: collision with root package name */
    public int f428b;

    /* renamed from: c, reason: collision with root package name */
    public int f429c;

    /* renamed from: d, reason: collision with root package name */
    public int f430d;

    /* renamed from: e, reason: collision with root package name */
    public Object f431e;

    public /* synthetic */ C0014o() {
        this.f427a = 1;
    }

    public void A(int i3) {
        if ((this.f428b & 7) != i3) {
            throw C0271z.b();
        }
    }

    public boolean B() {
        int i3;
        AbstractC0256j abstractC0256j = (AbstractC0256j) this.f431e;
        if (abstractC0256j.c() || (i3 = this.f428b) == this.f429c) {
            return false;
        }
        return abstractC0256j.x(i3);
    }

    public C0015p a(int i3) {
        return new C0015p(AbstractC0235a.C((C0.H) this.f431e, i3), i3, 1L);
    }

    public int b() {
        return this.f430d - this.f429c;
    }

    public int c() {
        int i3 = this.f430d;
        if (i3 != 0) {
            this.f428b = i3;
            this.f430d = 0;
        } else {
            this.f428b = ((AbstractC0256j) this.f431e).u();
        }
        int i4 = this.f428b;
        if (i4 == 0 || i4 == this.f429c) {
            return Integer.MAX_VALUE;
        }
        return i4 >>> 3;
    }

    public int d(int i3) {
        return ((J.D) this.f431e).f3106d[this.f429c + i3];
    }

    public Object e(int i3) {
        return ((J.D) this.f431e).f3108f[this.f430d + i3];
    }

    public void f(Object obj, androidx.datastore.preferences.protobuf.Z z3, C0260n c0260n) {
        int i3 = this.f429c;
        this.f429c = ((this.f428b >>> 3) << 3) | 4;
        try {
            z3.b(obj, this, c0260n);
            if (this.f428b == this.f429c) {
            } else {
                throw new C0271z("Failed to parse the message.");
            }
        } finally {
            this.f429c = i3;
        }
    }

    public void g(Object obj, androidx.datastore.preferences.protobuf.Z z3, C0260n c0260n) {
        AbstractC0256j abstractC0256j = (AbstractC0256j) this.f431e;
        int v3 = abstractC0256j.v();
        if (abstractC0256j.f5089a >= 100) {
            throw new C0271z("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int e3 = abstractC0256j.e(v3);
        abstractC0256j.f5089a++;
        z3.b(obj, this, c0260n);
        abstractC0256j.a(0);
        abstractC0256j.f5089a--;
        abstractC0256j.d(e3);
    }

    public void h(List list) {
        int u3;
        int i3 = this.f428b & 7;
        AbstractC0256j abstractC0256j = (AbstractC0256j) this.f431e;
        if (i3 == 0) {
            do {
                list.add(Boolean.valueOf(abstractC0256j.f()));
                if (abstractC0256j.c()) {
                    return;
                } else {
                    u3 = abstractC0256j.u();
                }
            } while (u3 == this.f428b);
            this.f430d = u3;
            return;
        }
        if (i3 != 2) {
            throw C0271z.b();
        }
        int b3 = abstractC0256j.b() + abstractC0256j.v();
        do {
            list.add(Boolean.valueOf(abstractC0256j.f()));
        } while (abstractC0256j.b() < b3);
        z(b3);
    }

    public C0253g i() {
        A(2);
        return ((AbstractC0256j) this.f431e).g();
    }

    public void j(List list) {
        int u3;
        if ((this.f428b & 7) != 2) {
            throw C0271z.b();
        }
        do {
            list.add(i());
            AbstractC0256j abstractC0256j = (AbstractC0256j) this.f431e;
            if (abstractC0256j.c()) {
                return;
            } else {
                u3 = abstractC0256j.u();
            }
        } while (u3 == this.f428b);
        this.f430d = u3;
    }

    public void k(List list) {
        int u3;
        int i3 = this.f428b & 7;
        AbstractC0256j abstractC0256j = (AbstractC0256j) this.f431e;
        if (i3 == 1) {
            do {
                list.add(Double.valueOf(abstractC0256j.h()));
                if (abstractC0256j.c()) {
                    return;
                } else {
                    u3 = abstractC0256j.u();
                }
            } while (u3 == this.f428b);
            this.f430d = u3;
            return;
        }
        if (i3 != 2) {
            throw C0271z.b();
        }
        int v3 = abstractC0256j.v();
        if ((v3 & 7) != 0) {
            throw new C0271z("Failed to parse the message.");
        }
        int b3 = abstractC0256j.b() + v3;
        do {
            list.add(Double.valueOf(abstractC0256j.h()));
        } while (abstractC0256j.b() < b3);
    }

    public void l(List list) {
        int u3;
        int i3 = this.f428b & 7;
        AbstractC0256j abstractC0256j = (AbstractC0256j) this.f431e;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(abstractC0256j.i()));
                if (abstractC0256j.c()) {
                    return;
                } else {
                    u3 = abstractC0256j.u();
                }
            } while (u3 == this.f428b);
            this.f430d = u3;
            return;
        }
        if (i3 != 2) {
            throw C0271z.b();
        }
        int b3 = abstractC0256j.b() + abstractC0256j.v();
        do {
            list.add(Integer.valueOf(abstractC0256j.i()));
        } while (abstractC0256j.b() < b3);
        z(b3);
    }

    public Object m(A0 a02, Class cls, C0260n c0260n) {
        int ordinal = a02.ordinal();
        AbstractC0256j abstractC0256j = (AbstractC0256j) this.f431e;
        switch (ordinal) {
            case 0:
                A(1);
                return Double.valueOf(abstractC0256j.h());
            case 1:
                A(5);
                return Float.valueOf(abstractC0256j.l());
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                A(0);
                return Long.valueOf(abstractC0256j.n());
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                A(0);
                return Long.valueOf(abstractC0256j.w());
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                A(0);
                return Integer.valueOf(abstractC0256j.m());
            case 5:
                A(1);
                return Long.valueOf(abstractC0256j.k());
            case 6:
                A(5);
                return Integer.valueOf(abstractC0256j.j());
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                A(0);
                return Boolean.valueOf(abstractC0256j.f());
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                A(2);
                return abstractC0256j.t();
            case AbstractC0856c.f8037c /* 9 */:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case AbstractC0856c.f8039e /* 10 */:
                A(2);
                androidx.datastore.preferences.protobuf.Z a3 = androidx.datastore.preferences.protobuf.W.f5029c.a(cls);
                AbstractC0267v g3 = a3.g();
                g(g3, a3, c0260n);
                a3.h(g3);
                return g3;
            case 11:
                return i();
            case 12:
                A(0);
                return Integer.valueOf(abstractC0256j.v());
            case 13:
                A(0);
                return Integer.valueOf(abstractC0256j.i());
            case 14:
                A(5);
                return Integer.valueOf(abstractC0256j.o());
            case AbstractC0856c.f8041g /* 15 */:
                A(1);
                return Long.valueOf(abstractC0256j.p());
            case 16:
                A(0);
                return Integer.valueOf(abstractC0256j.q());
            case 17:
                A(0);
                return Long.valueOf(abstractC0256j.r());
        }
    }

    public void n(List list) {
        int u3;
        int i3 = this.f428b & 7;
        AbstractC0256j abstractC0256j = (AbstractC0256j) this.f431e;
        if (i3 == 2) {
            int v3 = abstractC0256j.v();
            if ((v3 & 3) != 0) {
                throw new C0271z("Failed to parse the message.");
            }
            int b3 = abstractC0256j.b() + v3;
            do {
                list.add(Integer.valueOf(abstractC0256j.j()));
            } while (abstractC0256j.b() < b3);
            return;
        }
        if (i3 != 5) {
            throw C0271z.b();
        }
        do {
            list.add(Integer.valueOf(abstractC0256j.j()));
            if (abstractC0256j.c()) {
                return;
            } else {
                u3 = abstractC0256j.u();
            }
        } while (u3 == this.f428b);
        this.f430d = u3;
    }

    public void o(List list) {
        int u3;
        int i3 = this.f428b & 7;
        AbstractC0256j abstractC0256j = (AbstractC0256j) this.f431e;
        if (i3 == 1) {
            do {
                list.add(Long.valueOf(abstractC0256j.k()));
                if (abstractC0256j.c()) {
                    return;
                } else {
                    u3 = abstractC0256j.u();
                }
            } while (u3 == this.f428b);
            this.f430d = u3;
            return;
        }
        if (i3 != 2) {
            throw C0271z.b();
        }
        int v3 = abstractC0256j.v();
        if ((v3 & 7) != 0) {
            throw new C0271z("Failed to parse the message.");
        }
        int b3 = abstractC0256j.b() + v3;
        do {
            list.add(Long.valueOf(abstractC0256j.k()));
        } while (abstractC0256j.b() < b3);
    }

    public void p(List list) {
        int u3;
        int i3 = this.f428b & 7;
        AbstractC0256j abstractC0256j = (AbstractC0256j) this.f431e;
        if (i3 == 2) {
            int v3 = abstractC0256j.v();
            if ((v3 & 3) != 0) {
                throw new C0271z("Failed to parse the message.");
            }
            int b3 = abstractC0256j.b() + v3;
            do {
                list.add(Float.valueOf(abstractC0256j.l()));
            } while (abstractC0256j.b() < b3);
            return;
        }
        if (i3 != 5) {
            throw C0271z.b();
        }
        do {
            list.add(Float.valueOf(abstractC0256j.l()));
            if (abstractC0256j.c()) {
                return;
            } else {
                u3 = abstractC0256j.u();
            }
        } while (u3 == this.f428b);
        this.f430d = u3;
    }

    public void q(List list) {
        int u3;
        int i3 = this.f428b & 7;
        AbstractC0256j abstractC0256j = (AbstractC0256j) this.f431e;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(abstractC0256j.m()));
                if (abstractC0256j.c()) {
                    return;
                } else {
                    u3 = abstractC0256j.u();
                }
            } while (u3 == this.f428b);
            this.f430d = u3;
            return;
        }
        if (i3 != 2) {
            throw C0271z.b();
        }
        int b3 = abstractC0256j.b() + abstractC0256j.v();
        do {
            list.add(Integer.valueOf(abstractC0256j.m()));
        } while (abstractC0256j.b() < b3);
        z(b3);
    }

    public void r(List list) {
        int u3;
        int i3 = this.f428b & 7;
        AbstractC0256j abstractC0256j = (AbstractC0256j) this.f431e;
        if (i3 == 0) {
            do {
                list.add(Long.valueOf(abstractC0256j.n()));
                if (abstractC0256j.c()) {
                    return;
                } else {
                    u3 = abstractC0256j.u();
                }
            } while (u3 == this.f428b);
            this.f430d = u3;
            return;
        }
        if (i3 != 2) {
            throw C0271z.b();
        }
        int b3 = abstractC0256j.b() + abstractC0256j.v();
        do {
            list.add(Long.valueOf(abstractC0256j.n()));
        } while (abstractC0256j.b() < b3);
        z(b3);
    }

    public void s(List list) {
        int u3;
        int i3 = this.f428b & 7;
        AbstractC0256j abstractC0256j = (AbstractC0256j) this.f431e;
        if (i3 == 2) {
            int v3 = abstractC0256j.v();
            if ((v3 & 3) != 0) {
                throw new C0271z("Failed to parse the message.");
            }
            int b3 = abstractC0256j.b() + v3;
            do {
                list.add(Integer.valueOf(abstractC0256j.o()));
            } while (abstractC0256j.b() < b3);
            return;
        }
        if (i3 != 5) {
            throw C0271z.b();
        }
        do {
            list.add(Integer.valueOf(abstractC0256j.o()));
            if (abstractC0256j.c()) {
                return;
            } else {
                u3 = abstractC0256j.u();
            }
        } while (u3 == this.f428b);
        this.f430d = u3;
    }

    public void t(List list) {
        int u3;
        int i3 = this.f428b & 7;
        AbstractC0256j abstractC0256j = (AbstractC0256j) this.f431e;
        if (i3 == 1) {
            do {
                list.add(Long.valueOf(abstractC0256j.p()));
                if (abstractC0256j.c()) {
                    return;
                } else {
                    u3 = abstractC0256j.u();
                }
            } while (u3 == this.f428b);
            this.f430d = u3;
            return;
        }
        if (i3 != 2) {
            throw C0271z.b();
        }
        int v3 = abstractC0256j.v();
        if ((v3 & 7) != 0) {
            throw new C0271z("Failed to parse the message.");
        }
        int b3 = abstractC0256j.b() + v3;
        do {
            list.add(Long.valueOf(abstractC0256j.p()));
        } while (abstractC0256j.b() < b3);
    }

    public String toString() {
        switch (this.f427a) {
            case 0:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i3 = this.f428b;
                sb.append(i3);
                sb.append('-');
                C0.H h3 = (C0.H) this.f431e;
                sb.append(AbstractC0235a.C(h3, i3));
                sb.append(',');
                int i4 = this.f429c;
                sb.append(i4);
                sb.append('-');
                sb.append(AbstractC0235a.C(h3, i4));
                sb.append("), prevOffset=");
                return A.k.j(sb, this.f430d, ')');
            case 1:
                return "";
            default:
                return super.toString();
        }
    }

    public void u(List list) {
        int u3;
        int i3 = this.f428b & 7;
        AbstractC0256j abstractC0256j = (AbstractC0256j) this.f431e;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(abstractC0256j.q()));
                if (abstractC0256j.c()) {
                    return;
                } else {
                    u3 = abstractC0256j.u();
                }
            } while (u3 == this.f428b);
            this.f430d = u3;
            return;
        }
        if (i3 != 2) {
            throw C0271z.b();
        }
        int b3 = abstractC0256j.b() + abstractC0256j.v();
        do {
            list.add(Integer.valueOf(abstractC0256j.q()));
        } while (abstractC0256j.b() < b3);
        z(b3);
    }

    public void v(List list) {
        int u3;
        int i3 = this.f428b & 7;
        AbstractC0256j abstractC0256j = (AbstractC0256j) this.f431e;
        if (i3 == 0) {
            do {
                list.add(Long.valueOf(abstractC0256j.r()));
                if (abstractC0256j.c()) {
                    return;
                } else {
                    u3 = abstractC0256j.u();
                }
            } while (u3 == this.f428b);
            this.f430d = u3;
            return;
        }
        if (i3 != 2) {
            throw C0271z.b();
        }
        int b3 = abstractC0256j.b() + abstractC0256j.v();
        do {
            list.add(Long.valueOf(abstractC0256j.r()));
        } while (abstractC0256j.b() < b3);
        z(b3);
    }

    public void w(List list, boolean z3) {
        String s3;
        int u3;
        int u4;
        if ((this.f428b & 7) != 2) {
            throw C0271z.b();
        }
        boolean z4 = list instanceof androidx.datastore.preferences.protobuf.C;
        AbstractC0256j abstractC0256j = (AbstractC0256j) this.f431e;
        if (z4 && !z3) {
            androidx.datastore.preferences.protobuf.C c2 = (androidx.datastore.preferences.protobuf.C) list;
            do {
                c2.h(i());
                if (abstractC0256j.c()) {
                    return;
                } else {
                    u4 = abstractC0256j.u();
                }
            } while (u4 == this.f428b);
            this.f430d = u4;
            return;
        }
        do {
            if (z3) {
                A(2);
                s3 = abstractC0256j.t();
            } else {
                A(2);
                s3 = abstractC0256j.s();
            }
            list.add(s3);
            if (abstractC0256j.c()) {
                return;
            } else {
                u3 = abstractC0256j.u();
            }
        } while (u3 == this.f428b);
        this.f430d = u3;
    }

    public void x(List list) {
        int u3;
        int i3 = this.f428b & 7;
        AbstractC0256j abstractC0256j = (AbstractC0256j) this.f431e;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(abstractC0256j.v()));
                if (abstractC0256j.c()) {
                    return;
                } else {
                    u3 = abstractC0256j.u();
                }
            } while (u3 == this.f428b);
            this.f430d = u3;
            return;
        }
        if (i3 != 2) {
            throw C0271z.b();
        }
        int b3 = abstractC0256j.b() + abstractC0256j.v();
        do {
            list.add(Integer.valueOf(abstractC0256j.v()));
        } while (abstractC0256j.b() < b3);
        z(b3);
    }

    public void y(List list) {
        int u3;
        int i3 = this.f428b & 7;
        AbstractC0256j abstractC0256j = (AbstractC0256j) this.f431e;
        if (i3 == 0) {
            do {
                list.add(Long.valueOf(abstractC0256j.w()));
                if (abstractC0256j.c()) {
                    return;
                } else {
                    u3 = abstractC0256j.u();
                }
            } while (u3 == this.f428b);
            this.f430d = u3;
            return;
        }
        if (i3 != 2) {
            throw C0271z.b();
        }
        int b3 = abstractC0256j.b() + abstractC0256j.v();
        do {
            list.add(Long.valueOf(abstractC0256j.w()));
        } while (abstractC0256j.b() < b3);
        z(b3);
    }

    public void z(int i3) {
        if (((AbstractC0256j) this.f431e).b() != i3) {
            throw C0271z.e();
        }
    }

    public C0014o(AbstractC0256j abstractC0256j) {
        this.f427a = 3;
        this.f430d = 0;
        Charset charset = AbstractC0269x.f5135a;
        this.f431e = abstractC0256j;
        abstractC0256j.f5090b = this;
    }

    public C0014o(J.D d3) {
        this.f427a = 2;
        this.f431e = d3;
    }

    public C0014o(int i3, int i4, int i5, C0.H h3) {
        this.f427a = 0;
        this.f428b = i3;
        this.f429c = i4;
        this.f430d = i5;
        this.f431e = h3;
    }
}
