package A;

import androidx.datastore.preferences.protobuf.A0;
import androidx.datastore.preferences.protobuf.AbstractC0445j;
import androidx.datastore.preferences.protobuf.AbstractC0456v;
import androidx.datastore.preferences.protobuf.AbstractC0458x;
import androidx.datastore.preferences.protobuf.C0442g;
import androidx.datastore.preferences.protobuf.C0449n;
import androidx.datastore.preferences.protobuf.C0460z;
import com.appsflyer.attribution.RequestError;
import java.nio.charset.Charset;
import java.util.List;
import q.AbstractC1024c;

/* renamed from: A.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0020p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171a;

    /* renamed from: b, reason: collision with root package name */
    public int f172b;

    /* renamed from: c, reason: collision with root package name */
    public int f173c;

    /* renamed from: d, reason: collision with root package name */
    public int f174d;

    /* renamed from: e, reason: collision with root package name */
    public Object f175e;

    public /* synthetic */ C0020p() {
        this.f171a = 1;
    }

    public void A(int i2) {
        if ((this.f172b & 7) != i2) {
            throw C0460z.b();
        }
    }

    public boolean B() {
        int i2;
        AbstractC0445j abstractC0445j = (AbstractC0445j) this.f175e;
        if (abstractC0445j.c() || (i2 = this.f172b) == this.f173c) {
            return false;
        }
        return abstractC0445j.x(i2);
    }

    public C0021q a(int i2) {
        return new C0021q(u3.l.l0((A0.I) this.f175e, i2), i2, 1L);
    }

    public int b() {
        return this.f174d - this.f173c;
    }

    public int c() {
        int i2 = this.f174d;
        if (i2 != 0) {
            this.f172b = i2;
            this.f174d = 0;
        } else {
            this.f172b = ((AbstractC0445j) this.f175e).u();
        }
        int i4 = this.f172b;
        if (i4 == 0 || i4 == this.f173c) {
            return Integer.MAX_VALUE;
        }
        return i4 >>> 3;
    }

    public int d(int i2) {
        return ((H.D) this.f175e).f3176j[this.f173c + i2];
    }

    public Object e(int i2) {
        return ((H.D) this.f175e).f3178l[this.f174d + i2];
    }

    public void f(Object obj, androidx.datastore.preferences.protobuf.Z z4, C0449n c0449n) {
        int i2 = this.f173c;
        this.f173c = ((this.f172b >>> 3) << 3) | 4;
        try {
            z4.e(obj, this, c0449n);
            if (this.f172b == this.f173c) {
            } else {
                throw new C0460z("Failed to parse the message.");
            }
        } finally {
            this.f173c = i2;
        }
    }

    public void g(Object obj, androidx.datastore.preferences.protobuf.Z z4, C0449n c0449n) {
        AbstractC0445j abstractC0445j = (AbstractC0445j) this.f175e;
        int v4 = abstractC0445j.v();
        if (abstractC0445j.f5363a >= 100) {
            throw new C0460z("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int e4 = abstractC0445j.e(v4);
        abstractC0445j.f5363a++;
        z4.e(obj, this, c0449n);
        abstractC0445j.a(0);
        abstractC0445j.f5363a--;
        abstractC0445j.d(e4);
    }

    public void h(List list) {
        int u4;
        int i2 = this.f172b & 7;
        AbstractC0445j abstractC0445j = (AbstractC0445j) this.f175e;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(abstractC0445j.f()));
                if (abstractC0445j.c()) {
                    return;
                } else {
                    u4 = abstractC0445j.u();
                }
            } while (u4 == this.f172b);
            this.f174d = u4;
            return;
        }
        if (i2 != 2) {
            throw C0460z.b();
        }
        int b4 = abstractC0445j.b() + abstractC0445j.v();
        do {
            list.add(Boolean.valueOf(abstractC0445j.f()));
        } while (abstractC0445j.b() < b4);
        z(b4);
    }

    public C0442g i() {
        A(2);
        return ((AbstractC0445j) this.f175e).g();
    }

    public void j(List list) {
        int u4;
        if ((this.f172b & 7) != 2) {
            throw C0460z.b();
        }
        do {
            list.add(i());
            AbstractC0445j abstractC0445j = (AbstractC0445j) this.f175e;
            if (abstractC0445j.c()) {
                return;
            } else {
                u4 = abstractC0445j.u();
            }
        } while (u4 == this.f172b);
        this.f174d = u4;
    }

    public void k(List list) {
        int u4;
        int i2 = this.f172b & 7;
        AbstractC0445j abstractC0445j = (AbstractC0445j) this.f175e;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(abstractC0445j.h()));
                if (abstractC0445j.c()) {
                    return;
                } else {
                    u4 = abstractC0445j.u();
                }
            } while (u4 == this.f172b);
            this.f174d = u4;
            return;
        }
        if (i2 != 2) {
            throw C0460z.b();
        }
        int v4 = abstractC0445j.v();
        if ((v4 & 7) != 0) {
            throw new C0460z("Failed to parse the message.");
        }
        int b4 = abstractC0445j.b() + v4;
        do {
            list.add(Double.valueOf(abstractC0445j.h()));
        } while (abstractC0445j.b() < b4);
    }

    public void l(List list) {
        int u4;
        int i2 = this.f172b & 7;
        AbstractC0445j abstractC0445j = (AbstractC0445j) this.f175e;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC0445j.i()));
                if (abstractC0445j.c()) {
                    return;
                } else {
                    u4 = abstractC0445j.u();
                }
            } while (u4 == this.f172b);
            this.f174d = u4;
            return;
        }
        if (i2 != 2) {
            throw C0460z.b();
        }
        int b4 = abstractC0445j.b() + abstractC0445j.v();
        do {
            list.add(Integer.valueOf(abstractC0445j.i()));
        } while (abstractC0445j.b() < b4);
        z(b4);
    }

    public Object m(A0 a02, Class cls, C0449n c0449n) {
        int ordinal = a02.ordinal();
        AbstractC0445j abstractC0445j = (AbstractC0445j) this.f175e;
        switch (ordinal) {
            case 0:
                A(1);
                return Double.valueOf(abstractC0445j.h());
            case 1:
                A(5);
                return Float.valueOf(abstractC0445j.l());
            case 2:
                A(0);
                return Long.valueOf(abstractC0445j.n());
            case 3:
                A(0);
                return Long.valueOf(abstractC0445j.w());
            case 4:
                A(0);
                return Integer.valueOf(abstractC0445j.m());
            case 5:
                A(1);
                return Long.valueOf(abstractC0445j.k());
            case 6:
                A(5);
                return Integer.valueOf(abstractC0445j.j());
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                A(0);
                return Boolean.valueOf(abstractC0445j.f());
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                A(2);
                return abstractC0445j.t();
            case AbstractC1024c.f9242c /* 9 */:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                A(2);
                androidx.datastore.preferences.protobuf.Z a4 = androidx.datastore.preferences.protobuf.W.f5303c.a(cls);
                AbstractC0456v g4 = a4.g();
                g(g4, a4, c0449n);
                a4.h(g4);
                return g4;
            case RequestError.STOP_TRACKING /* 11 */:
                return i();
            case 12:
                A(0);
                return Integer.valueOf(abstractC0445j.v());
            case 13:
                A(0);
                return Integer.valueOf(abstractC0445j.i());
            case 14:
                A(5);
                return Integer.valueOf(abstractC0445j.o());
            case AbstractC1024c.f9246g /* 15 */:
                A(1);
                return Long.valueOf(abstractC0445j.p());
            case 16:
                A(0);
                return Integer.valueOf(abstractC0445j.q());
            case 17:
                A(0);
                return Long.valueOf(abstractC0445j.r());
        }
    }

    public void n(List list) {
        int u4;
        int i2 = this.f172b & 7;
        AbstractC0445j abstractC0445j = (AbstractC0445j) this.f175e;
        if (i2 == 2) {
            int v4 = abstractC0445j.v();
            if ((v4 & 3) != 0) {
                throw new C0460z("Failed to parse the message.");
            }
            int b4 = abstractC0445j.b() + v4;
            do {
                list.add(Integer.valueOf(abstractC0445j.j()));
            } while (abstractC0445j.b() < b4);
            return;
        }
        if (i2 != 5) {
            throw C0460z.b();
        }
        do {
            list.add(Integer.valueOf(abstractC0445j.j()));
            if (abstractC0445j.c()) {
                return;
            } else {
                u4 = abstractC0445j.u();
            }
        } while (u4 == this.f172b);
        this.f174d = u4;
    }

    public void o(List list) {
        int u4;
        int i2 = this.f172b & 7;
        AbstractC0445j abstractC0445j = (AbstractC0445j) this.f175e;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(abstractC0445j.k()));
                if (abstractC0445j.c()) {
                    return;
                } else {
                    u4 = abstractC0445j.u();
                }
            } while (u4 == this.f172b);
            this.f174d = u4;
            return;
        }
        if (i2 != 2) {
            throw C0460z.b();
        }
        int v4 = abstractC0445j.v();
        if ((v4 & 7) != 0) {
            throw new C0460z("Failed to parse the message.");
        }
        int b4 = abstractC0445j.b() + v4;
        do {
            list.add(Long.valueOf(abstractC0445j.k()));
        } while (abstractC0445j.b() < b4);
    }

    public void p(List list) {
        int u4;
        int i2 = this.f172b & 7;
        AbstractC0445j abstractC0445j = (AbstractC0445j) this.f175e;
        if (i2 == 2) {
            int v4 = abstractC0445j.v();
            if ((v4 & 3) != 0) {
                throw new C0460z("Failed to parse the message.");
            }
            int b4 = abstractC0445j.b() + v4;
            do {
                list.add(Float.valueOf(abstractC0445j.l()));
            } while (abstractC0445j.b() < b4);
            return;
        }
        if (i2 != 5) {
            throw C0460z.b();
        }
        do {
            list.add(Float.valueOf(abstractC0445j.l()));
            if (abstractC0445j.c()) {
                return;
            } else {
                u4 = abstractC0445j.u();
            }
        } while (u4 == this.f172b);
        this.f174d = u4;
    }

    public void q(List list) {
        int u4;
        int i2 = this.f172b & 7;
        AbstractC0445j abstractC0445j = (AbstractC0445j) this.f175e;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC0445j.m()));
                if (abstractC0445j.c()) {
                    return;
                } else {
                    u4 = abstractC0445j.u();
                }
            } while (u4 == this.f172b);
            this.f174d = u4;
            return;
        }
        if (i2 != 2) {
            throw C0460z.b();
        }
        int b4 = abstractC0445j.b() + abstractC0445j.v();
        do {
            list.add(Integer.valueOf(abstractC0445j.m()));
        } while (abstractC0445j.b() < b4);
        z(b4);
    }

    public void r(List list) {
        int u4;
        int i2 = this.f172b & 7;
        AbstractC0445j abstractC0445j = (AbstractC0445j) this.f175e;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(abstractC0445j.n()));
                if (abstractC0445j.c()) {
                    return;
                } else {
                    u4 = abstractC0445j.u();
                }
            } while (u4 == this.f172b);
            this.f174d = u4;
            return;
        }
        if (i2 != 2) {
            throw C0460z.b();
        }
        int b4 = abstractC0445j.b() + abstractC0445j.v();
        do {
            list.add(Long.valueOf(abstractC0445j.n()));
        } while (abstractC0445j.b() < b4);
        z(b4);
    }

    public void s(List list) {
        int u4;
        int i2 = this.f172b & 7;
        AbstractC0445j abstractC0445j = (AbstractC0445j) this.f175e;
        if (i2 == 2) {
            int v4 = abstractC0445j.v();
            if ((v4 & 3) != 0) {
                throw new C0460z("Failed to parse the message.");
            }
            int b4 = abstractC0445j.b() + v4;
            do {
                list.add(Integer.valueOf(abstractC0445j.o()));
            } while (abstractC0445j.b() < b4);
            return;
        }
        if (i2 != 5) {
            throw C0460z.b();
        }
        do {
            list.add(Integer.valueOf(abstractC0445j.o()));
            if (abstractC0445j.c()) {
                return;
            } else {
                u4 = abstractC0445j.u();
            }
        } while (u4 == this.f172b);
        this.f174d = u4;
    }

    public void t(List list) {
        int u4;
        int i2 = this.f172b & 7;
        AbstractC0445j abstractC0445j = (AbstractC0445j) this.f175e;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(abstractC0445j.p()));
                if (abstractC0445j.c()) {
                    return;
                } else {
                    u4 = abstractC0445j.u();
                }
            } while (u4 == this.f172b);
            this.f174d = u4;
            return;
        }
        if (i2 != 2) {
            throw C0460z.b();
        }
        int v4 = abstractC0445j.v();
        if ((v4 & 7) != 0) {
            throw new C0460z("Failed to parse the message.");
        }
        int b4 = abstractC0445j.b() + v4;
        do {
            list.add(Long.valueOf(abstractC0445j.p()));
        } while (abstractC0445j.b() < b4);
    }

    public String toString() {
        switch (this.f171a) {
            case 0:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i2 = this.f172b;
                sb.append(i2);
                sb.append('-');
                A0.I i4 = (A0.I) this.f175e;
                sb.append(u3.l.l0(i4, i2));
                sb.append(',');
                int i5 = this.f173c;
                sb.append(i5);
                sb.append('-');
                sb.append(u3.l.l0(i4, i5));
                sb.append("), prevOffset=");
                return AbstractC0017m.l(sb, this.f174d, ')');
            case 1:
                return "";
            default:
                return super.toString();
        }
    }

    public void u(List list) {
        int u4;
        int i2 = this.f172b & 7;
        AbstractC0445j abstractC0445j = (AbstractC0445j) this.f175e;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC0445j.q()));
                if (abstractC0445j.c()) {
                    return;
                } else {
                    u4 = abstractC0445j.u();
                }
            } while (u4 == this.f172b);
            this.f174d = u4;
            return;
        }
        if (i2 != 2) {
            throw C0460z.b();
        }
        int b4 = abstractC0445j.b() + abstractC0445j.v();
        do {
            list.add(Integer.valueOf(abstractC0445j.q()));
        } while (abstractC0445j.b() < b4);
        z(b4);
    }

    public void v(List list) {
        int u4;
        int i2 = this.f172b & 7;
        AbstractC0445j abstractC0445j = (AbstractC0445j) this.f175e;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(abstractC0445j.r()));
                if (abstractC0445j.c()) {
                    return;
                } else {
                    u4 = abstractC0445j.u();
                }
            } while (u4 == this.f172b);
            this.f174d = u4;
            return;
        }
        if (i2 != 2) {
            throw C0460z.b();
        }
        int b4 = abstractC0445j.b() + abstractC0445j.v();
        do {
            list.add(Long.valueOf(abstractC0445j.r()));
        } while (abstractC0445j.b() < b4);
        z(b4);
    }

    public void w(List list, boolean z4) {
        String s4;
        int u4;
        int u5;
        if ((this.f172b & 7) != 2) {
            throw C0460z.b();
        }
        boolean z5 = list instanceof androidx.datastore.preferences.protobuf.C;
        AbstractC0445j abstractC0445j = (AbstractC0445j) this.f175e;
        if (z5 && !z4) {
            androidx.datastore.preferences.protobuf.C c4 = (androidx.datastore.preferences.protobuf.C) list;
            do {
                c4.v(i());
                if (abstractC0445j.c()) {
                    return;
                } else {
                    u5 = abstractC0445j.u();
                }
            } while (u5 == this.f172b);
            this.f174d = u5;
            return;
        }
        do {
            if (z4) {
                A(2);
                s4 = abstractC0445j.t();
            } else {
                A(2);
                s4 = abstractC0445j.s();
            }
            list.add(s4);
            if (abstractC0445j.c()) {
                return;
            } else {
                u4 = abstractC0445j.u();
            }
        } while (u4 == this.f172b);
        this.f174d = u4;
    }

    public void x(List list) {
        int u4;
        int i2 = this.f172b & 7;
        AbstractC0445j abstractC0445j = (AbstractC0445j) this.f175e;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(abstractC0445j.v()));
                if (abstractC0445j.c()) {
                    return;
                } else {
                    u4 = abstractC0445j.u();
                }
            } while (u4 == this.f172b);
            this.f174d = u4;
            return;
        }
        if (i2 != 2) {
            throw C0460z.b();
        }
        int b4 = abstractC0445j.b() + abstractC0445j.v();
        do {
            list.add(Integer.valueOf(abstractC0445j.v()));
        } while (abstractC0445j.b() < b4);
        z(b4);
    }

    public void y(List list) {
        int u4;
        int i2 = this.f172b & 7;
        AbstractC0445j abstractC0445j = (AbstractC0445j) this.f175e;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(abstractC0445j.w()));
                if (abstractC0445j.c()) {
                    return;
                } else {
                    u4 = abstractC0445j.u();
                }
            } while (u4 == this.f172b);
            this.f174d = u4;
            return;
        }
        if (i2 != 2) {
            throw C0460z.b();
        }
        int b4 = abstractC0445j.b() + abstractC0445j.v();
        do {
            list.add(Long.valueOf(abstractC0445j.w()));
        } while (abstractC0445j.b() < b4);
        z(b4);
    }

    public void z(int i2) {
        if (((AbstractC0445j) this.f175e).b() != i2) {
            throw C0460z.e();
        }
    }

    public C0020p(AbstractC0445j abstractC0445j) {
        this.f171a = 3;
        this.f174d = 0;
        Charset charset = AbstractC0458x.f5409a;
        this.f175e = abstractC0445j;
        abstractC0445j.f5364b = this;
    }

    public C0020p(H.D d4) {
        this.f171a = 2;
        this.f175e = d4;
    }

    public C0020p(int i2, int i4, int i5, A0.I i6) {
        this.f171a = 0;
        this.f172b = i2;
        this.f173c = i4;
        this.f174d = i5;
        this.f175e = i6;
    }
}
