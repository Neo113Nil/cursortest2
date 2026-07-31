package J;

import androidx.datastore.preferences.protobuf.A0;
import androidx.datastore.preferences.protobuf.AbstractC0200j;
import androidx.datastore.preferences.protobuf.AbstractC0211v;
import androidx.datastore.preferences.protobuf.AbstractC0213x;
import androidx.datastore.preferences.protobuf.C0197g;
import androidx.datastore.preferences.protobuf.C0204n;
import androidx.datastore.preferences.protobuf.C0215z;
import androidx.datastore.preferences.protobuf.W;
import androidx.datastore.preferences.protobuf.Z;
import f.AbstractC0382a;
import h1.C0438i;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public int f2525a;

    /* renamed from: b, reason: collision with root package name */
    public int f2526b;

    /* renamed from: c, reason: collision with root package name */
    public int f2527c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2528d;

    public D(AbstractC0200j abstractC0200j) {
        this.f2527c = 0;
        Charset charset = AbstractC0213x.f3934a;
        this.f2528d = abstractC0200j;
        abstractC0200j.f3889b = this;
    }

    public int a() {
        int i3 = this.f2527c;
        if (i3 != 0) {
            this.f2525a = i3;
            this.f2527c = 0;
        } else {
            this.f2525a = ((AbstractC0200j) this.f2528d).u();
        }
        int i4 = this.f2525a;
        if (i4 == 0 || i4 == this.f2526b) {
            return Integer.MAX_VALUE;
        }
        return i4 >>> 3;
    }

    public int b(int i3) {
        return ((E) this.f2528d).f2531h[this.f2526b + i3];
    }

    public Object c(int i3) {
        return ((E) this.f2528d).f2533j[this.f2527c + i3];
    }

    public void d(Object obj, Z z3, C0204n c0204n) {
        int i3 = this.f2526b;
        this.f2526b = ((this.f2525a >>> 3) << 3) | 4;
        try {
            z3.e(obj, this, c0204n);
            if (this.f2525a == this.f2526b) {
            } else {
                throw new C0215z("Failed to parse the message.");
            }
        } finally {
            this.f2526b = i3;
        }
    }

    public void e(Object obj, Z z3, C0204n c0204n) {
        AbstractC0200j abstractC0200j = (AbstractC0200j) this.f2528d;
        int v3 = abstractC0200j.v();
        if (abstractC0200j.f3888a >= 100) {
            throw new C0215z("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int e3 = abstractC0200j.e(v3);
        abstractC0200j.f3888a++;
        z3.e(obj, this, c0204n);
        abstractC0200j.a(0);
        abstractC0200j.f3888a--;
        abstractC0200j.d(e3);
    }

    public void f(List list) {
        int u3;
        int i3 = this.f2525a & 7;
        AbstractC0200j abstractC0200j = (AbstractC0200j) this.f2528d;
        if (i3 == 0) {
            do {
                list.add(Boolean.valueOf(abstractC0200j.f()));
                if (abstractC0200j.c()) {
                    return;
                } else {
                    u3 = abstractC0200j.u();
                }
            } while (u3 == this.f2525a);
            this.f2527c = u3;
            return;
        }
        if (i3 != 2) {
            throw C0215z.b();
        }
        int b2 = abstractC0200j.b() + abstractC0200j.v();
        do {
            list.add(Boolean.valueOf(abstractC0200j.f()));
        } while (abstractC0200j.b() < b2);
        x(b2);
    }

    public C0197g g() {
        y(2);
        return ((AbstractC0200j) this.f2528d).g();
    }

    public void h(List list) {
        int u3;
        if ((this.f2525a & 7) != 2) {
            throw C0215z.b();
        }
        do {
            list.add(g());
            AbstractC0200j abstractC0200j = (AbstractC0200j) this.f2528d;
            if (abstractC0200j.c()) {
                return;
            } else {
                u3 = abstractC0200j.u();
            }
        } while (u3 == this.f2525a);
        this.f2527c = u3;
    }

    public void i(List list) {
        int u3;
        int i3 = this.f2525a & 7;
        AbstractC0200j abstractC0200j = (AbstractC0200j) this.f2528d;
        if (i3 == 1) {
            do {
                list.add(Double.valueOf(abstractC0200j.h()));
                if (abstractC0200j.c()) {
                    return;
                } else {
                    u3 = abstractC0200j.u();
                }
            } while (u3 == this.f2525a);
            this.f2527c = u3;
            return;
        }
        if (i3 != 2) {
            throw C0215z.b();
        }
        int v3 = abstractC0200j.v();
        if ((v3 & 7) != 0) {
            throw new C0215z("Failed to parse the message.");
        }
        int b2 = abstractC0200j.b() + v3;
        do {
            list.add(Double.valueOf(abstractC0200j.h()));
        } while (abstractC0200j.b() < b2);
    }

    public void j(List list) {
        int u3;
        int i3 = this.f2525a & 7;
        AbstractC0200j abstractC0200j = (AbstractC0200j) this.f2528d;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(abstractC0200j.i()));
                if (abstractC0200j.c()) {
                    return;
                } else {
                    u3 = abstractC0200j.u();
                }
            } while (u3 == this.f2525a);
            this.f2527c = u3;
            return;
        }
        if (i3 != 2) {
            throw C0215z.b();
        }
        int b2 = abstractC0200j.b() + abstractC0200j.v();
        do {
            list.add(Integer.valueOf(abstractC0200j.i()));
        } while (abstractC0200j.b() < b2);
        x(b2);
    }

    public Object k(A0 a02, Class cls, C0204n c0204n) {
        int ordinal = a02.ordinal();
        AbstractC0200j abstractC0200j = (AbstractC0200j) this.f2528d;
        switch (ordinal) {
            case 0:
                y(1);
                return Double.valueOf(abstractC0200j.h());
            case 1:
                y(5);
                return Float.valueOf(abstractC0200j.l());
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                y(0);
                return Long.valueOf(abstractC0200j.n());
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                y(0);
                return Long.valueOf(abstractC0200j.w());
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                y(0);
                return Integer.valueOf(abstractC0200j.m());
            case 5:
                y(1);
                return Long.valueOf(abstractC0200j.k());
            case 6:
                y(5);
                return Integer.valueOf(abstractC0200j.j());
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                y(0);
                return Boolean.valueOf(abstractC0200j.f());
            case 8:
                y(2);
                return abstractC0200j.t();
            case AbstractC0382a.f4777a /* 9 */:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case AbstractC0382a.f4779c /* 10 */:
                y(2);
                Z a3 = W.f3828c.a(cls);
                AbstractC0211v g3 = a3.g();
                e(g3, a3, c0204n);
                a3.h(g3);
                return g3;
            case 11:
                return g();
            case 12:
                y(0);
                return Integer.valueOf(abstractC0200j.v());
            case 13:
                y(0);
                return Integer.valueOf(abstractC0200j.i());
            case 14:
                y(5);
                return Integer.valueOf(abstractC0200j.o());
            case AbstractC0382a.f4781e /* 15 */:
                y(1);
                return Long.valueOf(abstractC0200j.p());
            case 16:
                y(0);
                return Integer.valueOf(abstractC0200j.q());
            case 17:
                y(0);
                return Long.valueOf(abstractC0200j.r());
        }
    }

    public void l(List list) {
        int u3;
        int i3 = this.f2525a & 7;
        AbstractC0200j abstractC0200j = (AbstractC0200j) this.f2528d;
        if (i3 == 2) {
            int v3 = abstractC0200j.v();
            if ((v3 & 3) != 0) {
                throw new C0215z("Failed to parse the message.");
            }
            int b2 = abstractC0200j.b() + v3;
            do {
                list.add(Integer.valueOf(abstractC0200j.j()));
            } while (abstractC0200j.b() < b2);
            return;
        }
        if (i3 != 5) {
            throw C0215z.b();
        }
        do {
            list.add(Integer.valueOf(abstractC0200j.j()));
            if (abstractC0200j.c()) {
                return;
            } else {
                u3 = abstractC0200j.u();
            }
        } while (u3 == this.f2525a);
        this.f2527c = u3;
    }

    public void m(List list) {
        int u3;
        int i3 = this.f2525a & 7;
        AbstractC0200j abstractC0200j = (AbstractC0200j) this.f2528d;
        if (i3 == 1) {
            do {
                list.add(Long.valueOf(abstractC0200j.k()));
                if (abstractC0200j.c()) {
                    return;
                } else {
                    u3 = abstractC0200j.u();
                }
            } while (u3 == this.f2525a);
            this.f2527c = u3;
            return;
        }
        if (i3 != 2) {
            throw C0215z.b();
        }
        int v3 = abstractC0200j.v();
        if ((v3 & 7) != 0) {
            throw new C0215z("Failed to parse the message.");
        }
        int b2 = abstractC0200j.b() + v3;
        do {
            list.add(Long.valueOf(abstractC0200j.k()));
        } while (abstractC0200j.b() < b2);
    }

    public void n(List list) {
        int u3;
        int i3 = this.f2525a & 7;
        AbstractC0200j abstractC0200j = (AbstractC0200j) this.f2528d;
        if (i3 == 2) {
            int v3 = abstractC0200j.v();
            if ((v3 & 3) != 0) {
                throw new C0215z("Failed to parse the message.");
            }
            int b2 = abstractC0200j.b() + v3;
            do {
                list.add(Float.valueOf(abstractC0200j.l()));
            } while (abstractC0200j.b() < b2);
            return;
        }
        if (i3 != 5) {
            throw C0215z.b();
        }
        do {
            list.add(Float.valueOf(abstractC0200j.l()));
            if (abstractC0200j.c()) {
                return;
            } else {
                u3 = abstractC0200j.u();
            }
        } while (u3 == this.f2525a);
        this.f2527c = u3;
    }

    public void o(List list) {
        int u3;
        int i3 = this.f2525a & 7;
        AbstractC0200j abstractC0200j = (AbstractC0200j) this.f2528d;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(abstractC0200j.m()));
                if (abstractC0200j.c()) {
                    return;
                } else {
                    u3 = abstractC0200j.u();
                }
            } while (u3 == this.f2525a);
            this.f2527c = u3;
            return;
        }
        if (i3 != 2) {
            throw C0215z.b();
        }
        int b2 = abstractC0200j.b() + abstractC0200j.v();
        do {
            list.add(Integer.valueOf(abstractC0200j.m()));
        } while (abstractC0200j.b() < b2);
        x(b2);
    }

    public void p(List list) {
        int u3;
        int i3 = this.f2525a & 7;
        AbstractC0200j abstractC0200j = (AbstractC0200j) this.f2528d;
        if (i3 == 0) {
            do {
                list.add(Long.valueOf(abstractC0200j.n()));
                if (abstractC0200j.c()) {
                    return;
                } else {
                    u3 = abstractC0200j.u();
                }
            } while (u3 == this.f2525a);
            this.f2527c = u3;
            return;
        }
        if (i3 != 2) {
            throw C0215z.b();
        }
        int b2 = abstractC0200j.b() + abstractC0200j.v();
        do {
            list.add(Long.valueOf(abstractC0200j.n()));
        } while (abstractC0200j.b() < b2);
        x(b2);
    }

    public void q(List list) {
        int u3;
        int i3 = this.f2525a & 7;
        AbstractC0200j abstractC0200j = (AbstractC0200j) this.f2528d;
        if (i3 == 2) {
            int v3 = abstractC0200j.v();
            if ((v3 & 3) != 0) {
                throw new C0215z("Failed to parse the message.");
            }
            int b2 = abstractC0200j.b() + v3;
            do {
                list.add(Integer.valueOf(abstractC0200j.o()));
            } while (abstractC0200j.b() < b2);
            return;
        }
        if (i3 != 5) {
            throw C0215z.b();
        }
        do {
            list.add(Integer.valueOf(abstractC0200j.o()));
            if (abstractC0200j.c()) {
                return;
            } else {
                u3 = abstractC0200j.u();
            }
        } while (u3 == this.f2525a);
        this.f2527c = u3;
    }

    public void r(List list) {
        int u3;
        int i3 = this.f2525a & 7;
        AbstractC0200j abstractC0200j = (AbstractC0200j) this.f2528d;
        if (i3 == 1) {
            do {
                list.add(Long.valueOf(abstractC0200j.p()));
                if (abstractC0200j.c()) {
                    return;
                } else {
                    u3 = abstractC0200j.u();
                }
            } while (u3 == this.f2525a);
            this.f2527c = u3;
            return;
        }
        if (i3 != 2) {
            throw C0215z.b();
        }
        int v3 = abstractC0200j.v();
        if ((v3 & 7) != 0) {
            throw new C0215z("Failed to parse the message.");
        }
        int b2 = abstractC0200j.b() + v3;
        do {
            list.add(Long.valueOf(abstractC0200j.p()));
        } while (abstractC0200j.b() < b2);
    }

    public void s(List list) {
        int u3;
        int i3 = this.f2525a & 7;
        AbstractC0200j abstractC0200j = (AbstractC0200j) this.f2528d;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(abstractC0200j.q()));
                if (abstractC0200j.c()) {
                    return;
                } else {
                    u3 = abstractC0200j.u();
                }
            } while (u3 == this.f2525a);
            this.f2527c = u3;
            return;
        }
        if (i3 != 2) {
            throw C0215z.b();
        }
        int b2 = abstractC0200j.b() + abstractC0200j.v();
        do {
            list.add(Integer.valueOf(abstractC0200j.q()));
        } while (abstractC0200j.b() < b2);
        x(b2);
    }

    public void t(List list) {
        int u3;
        int i3 = this.f2525a & 7;
        AbstractC0200j abstractC0200j = (AbstractC0200j) this.f2528d;
        if (i3 == 0) {
            do {
                list.add(Long.valueOf(abstractC0200j.r()));
                if (abstractC0200j.c()) {
                    return;
                } else {
                    u3 = abstractC0200j.u();
                }
            } while (u3 == this.f2525a);
            this.f2527c = u3;
            return;
        }
        if (i3 != 2) {
            throw C0215z.b();
        }
        int b2 = abstractC0200j.b() + abstractC0200j.v();
        do {
            list.add(Long.valueOf(abstractC0200j.r()));
        } while (abstractC0200j.b() < b2);
        x(b2);
    }

    public void u(List list, boolean z3) {
        String s3;
        int u3;
        int u4;
        if ((this.f2525a & 7) != 2) {
            throw C0215z.b();
        }
        boolean z4 = list instanceof androidx.datastore.preferences.protobuf.C;
        AbstractC0200j abstractC0200j = (AbstractC0200j) this.f2528d;
        if (z4 && !z3) {
            androidx.datastore.preferences.protobuf.C c3 = (androidx.datastore.preferences.protobuf.C) list;
            do {
                c3.h(g());
                if (abstractC0200j.c()) {
                    return;
                } else {
                    u4 = abstractC0200j.u();
                }
            } while (u4 == this.f2525a);
            this.f2527c = u4;
            return;
        }
        do {
            if (z3) {
                y(2);
                s3 = abstractC0200j.t();
            } else {
                y(2);
                s3 = abstractC0200j.s();
            }
            list.add(s3);
            if (abstractC0200j.c()) {
                return;
            } else {
                u3 = abstractC0200j.u();
            }
        } while (u3 == this.f2525a);
        this.f2527c = u3;
    }

    public void v(List list) {
        int u3;
        int i3 = this.f2525a & 7;
        AbstractC0200j abstractC0200j = (AbstractC0200j) this.f2528d;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(abstractC0200j.v()));
                if (abstractC0200j.c()) {
                    return;
                } else {
                    u3 = abstractC0200j.u();
                }
            } while (u3 == this.f2525a);
            this.f2527c = u3;
            return;
        }
        if (i3 != 2) {
            throw C0215z.b();
        }
        int b2 = abstractC0200j.b() + abstractC0200j.v();
        do {
            list.add(Integer.valueOf(abstractC0200j.v()));
        } while (abstractC0200j.b() < b2);
        x(b2);
    }

    public void w(List list) {
        int u3;
        int i3 = this.f2525a & 7;
        AbstractC0200j abstractC0200j = (AbstractC0200j) this.f2528d;
        if (i3 == 0) {
            do {
                list.add(Long.valueOf(abstractC0200j.w()));
                if (abstractC0200j.c()) {
                    return;
                } else {
                    u3 = abstractC0200j.u();
                }
            } while (u3 == this.f2525a);
            this.f2527c = u3;
            return;
        }
        if (i3 != 2) {
            throw C0215z.b();
        }
        int b2 = abstractC0200j.b() + abstractC0200j.v();
        do {
            list.add(Long.valueOf(abstractC0200j.w()));
        } while (abstractC0200j.b() < b2);
        x(b2);
    }

    public void x(int i3) {
        if (((AbstractC0200j) this.f2528d).b() != i3) {
            throw C0215z.e();
        }
    }

    public void y(int i3) {
        if ((this.f2525a & 7) != i3) {
            throw C0215z.b();
        }
    }

    public boolean z() {
        int i3;
        AbstractC0200j abstractC0200j = (AbstractC0200j) this.f2528d;
        if (abstractC0200j.c() || (i3 = this.f2525a) == this.f2526b) {
            return false;
        }
        return abstractC0200j.x(i3);
    }

    public D(E e3) {
        this.f2528d = e3;
    }
}
