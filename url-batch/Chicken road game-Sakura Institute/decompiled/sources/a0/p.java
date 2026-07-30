package a0;

import androidx.datastore.preferences.protobuf.z1;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117a;

    /* renamed from: b, reason: collision with root package name */
    public int f118b;

    /* renamed from: c, reason: collision with root package name */
    public int f119c;

    /* renamed from: d, reason: collision with root package name */
    public int f120d;

    /* renamed from: e, reason: collision with root package name */
    public Object f121e;

    public /* synthetic */ p() {
        this.f117a = 2;
    }

    public void A(int i7) {
        if ((this.f118b & 7) != i7) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
    }

    public boolean B() {
        int i7;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f121e;
        if (jVar.c() || (i7 = this.f118b) == this.f119c) {
            return false;
        }
        return jVar.x(i7);
    }

    public q a(int i7) {
        return new q(r4.a.J((a2.h0) this.f121e, i7), i7, 1L);
    }

    public int b() {
        return this.f120d - this.f119c;
    }

    public int c() {
        int i7 = this.f120d;
        if (i7 != 0) {
            this.f118b = i7;
            this.f120d = 0;
        } else {
            this.f118b = ((androidx.datastore.preferences.protobuf.j) this.f121e).u();
        }
        int i8 = this.f118b;
        if (i8 == 0 || i8 == this.f119c) {
            return Integer.MAX_VALUE;
        }
        return i8 >>> 3;
    }

    public int d(int i7) {
        return ((h0.d0) this.f121e).f4609i[this.f119c + i7];
    }

    public Object e(int i7) {
        return ((h0.d0) this.f121e).f4611k[this.f120d + i7];
    }

    public void f(Object obj, androidx.datastore.preferences.protobuf.y0 y0Var, androidx.datastore.preferences.protobuf.n nVar) {
        int i7 = this.f119c;
        this.f119c = ((this.f118b >>> 3) << 3) | 4;
        try {
            y0Var.a(obj, this, nVar);
            if (this.f118b == this.f119c) {
            } else {
                throw new androidx.datastore.preferences.protobuf.z("Failed to parse the message.");
            }
        } finally {
            this.f119c = i7;
        }
    }

    public void g(Object obj, androidx.datastore.preferences.protobuf.y0 y0Var, androidx.datastore.preferences.protobuf.n nVar) {
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f121e;
        int v5 = jVar.v();
        if (jVar.f849a >= 100) {
            throw new androidx.datastore.preferences.protobuf.z("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int e9 = jVar.e(v5);
        jVar.f849a++;
        y0Var.a(obj, this, nVar);
        jVar.a(0);
        jVar.f849a--;
        jVar.d(e9);
    }

    public void h(List list) {
        int u8;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f121e;
        int i7 = this.f118b & 7;
        if (i7 == 0) {
            do {
                list.add(Boolean.valueOf(jVar.f()));
                if (jVar.c()) {
                    return;
                } else {
                    u8 = jVar.u();
                }
            } while (u8 == this.f118b);
            this.f120d = u8;
            return;
        }
        if (i7 != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        int b9 = jVar.b() + jVar.v();
        do {
            list.add(Boolean.valueOf(jVar.f()));
        } while (jVar.b() < b9);
        z(b9);
    }

    public androidx.datastore.preferences.protobuf.g i() {
        A(2);
        return ((androidx.datastore.preferences.protobuf.j) this.f121e).g();
    }

    public void j(List list) {
        int u8;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f121e;
        if ((this.f118b & 7) != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        do {
            list.add(i());
            if (jVar.c()) {
                return;
            } else {
                u8 = jVar.u();
            }
        } while (u8 == this.f118b);
        this.f120d = u8;
    }

    public void k(List list) {
        int u8;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f121e;
        int i7 = this.f118b & 7;
        if (i7 == 1) {
            do {
                list.add(Double.valueOf(jVar.h()));
                if (jVar.c()) {
                    return;
                } else {
                    u8 = jVar.u();
                }
            } while (u8 == this.f118b);
            this.f120d = u8;
            return;
        }
        if (i7 != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        int v5 = jVar.v();
        if ((v5 & 7) != 0) {
            throw new androidx.datastore.preferences.protobuf.z("Failed to parse the message.");
        }
        int b9 = jVar.b() + v5;
        do {
            list.add(Double.valueOf(jVar.h()));
        } while (jVar.b() < b9);
    }

    public void l(List list) {
        int u8;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f121e;
        int i7 = this.f118b & 7;
        if (i7 == 0) {
            do {
                list.add(Integer.valueOf(jVar.i()));
                if (jVar.c()) {
                    return;
                } else {
                    u8 = jVar.u();
                }
            } while (u8 == this.f118b);
            this.f120d = u8;
            return;
        }
        if (i7 != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        int b9 = jVar.b() + jVar.v();
        do {
            list.add(Integer.valueOf(jVar.i()));
        } while (jVar.b() < b9);
        z(b9);
    }

    public Object m(z1 z1Var, Class cls, androidx.datastore.preferences.protobuf.n nVar) {
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f121e;
        switch (z1Var.ordinal()) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                A(1);
                return Double.valueOf(jVar.h());
            case 1:
                A(5);
                return Float.valueOf(jVar.l());
            case 2:
                A(0);
                return Long.valueOf(jVar.n());
            case 3:
                A(0);
                return Long.valueOf(jVar.w());
            case 4:
                A(0);
                return Integer.valueOf(jVar.m());
            case 5:
                A(1);
                return Long.valueOf(jVar.k());
            case 6:
                A(5);
                return Integer.valueOf(jVar.j());
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                A(0);
                return Boolean.valueOf(jVar.f());
            case 8:
                A(2);
                return jVar.t();
            case q.c.f7259c /* 9 */:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case q.c.f7261e /* 10 */:
                A(2);
                androidx.datastore.preferences.protobuf.y0 a3 = androidx.datastore.preferences.protobuf.v0.f916c.a(cls);
                androidx.datastore.preferences.protobuf.v i7 = a3.i();
                g(i7, a3, nVar);
                a3.e(i7);
                return i7;
            case 11:
                return i();
            case 12:
                A(0);
                return Integer.valueOf(jVar.v());
            case 13:
                A(0);
                return Integer.valueOf(jVar.i());
            case 14:
                A(5);
                return Integer.valueOf(jVar.o());
            case q.c.f7263g /* 15 */:
                A(1);
                return Long.valueOf(jVar.p());
            case 16:
                A(0);
                return Integer.valueOf(jVar.q());
            case 17:
                A(0);
                return Long.valueOf(jVar.r());
        }
    }

    public void n(List list) {
        int u8;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f121e;
        int i7 = this.f118b & 7;
        if (i7 == 2) {
            int v5 = jVar.v();
            if ((v5 & 3) != 0) {
                throw new androidx.datastore.preferences.protobuf.z("Failed to parse the message.");
            }
            int b9 = jVar.b() + v5;
            do {
                list.add(Integer.valueOf(jVar.j()));
            } while (jVar.b() < b9);
            return;
        }
        if (i7 != 5) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        do {
            list.add(Integer.valueOf(jVar.j()));
            if (jVar.c()) {
                return;
            } else {
                u8 = jVar.u();
            }
        } while (u8 == this.f118b);
        this.f120d = u8;
    }

    public void o(List list) {
        int u8;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f121e;
        int i7 = this.f118b & 7;
        if (i7 == 1) {
            do {
                list.add(Long.valueOf(jVar.k()));
                if (jVar.c()) {
                    return;
                } else {
                    u8 = jVar.u();
                }
            } while (u8 == this.f118b);
            this.f120d = u8;
            return;
        }
        if (i7 != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        int v5 = jVar.v();
        if ((v5 & 7) != 0) {
            throw new androidx.datastore.preferences.protobuf.z("Failed to parse the message.");
        }
        int b9 = jVar.b() + v5;
        do {
            list.add(Long.valueOf(jVar.k()));
        } while (jVar.b() < b9);
    }

    public void p(List list) {
        int u8;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f121e;
        int i7 = this.f118b & 7;
        if (i7 == 2) {
            int v5 = jVar.v();
            if ((v5 & 3) != 0) {
                throw new androidx.datastore.preferences.protobuf.z("Failed to parse the message.");
            }
            int b9 = jVar.b() + v5;
            do {
                list.add(Float.valueOf(jVar.l()));
            } while (jVar.b() < b9);
            return;
        }
        if (i7 != 5) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        do {
            list.add(Float.valueOf(jVar.l()));
            if (jVar.c()) {
                return;
            } else {
                u8 = jVar.u();
            }
        } while (u8 == this.f118b);
        this.f120d = u8;
    }

    public void q(List list) {
        int u8;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f121e;
        int i7 = this.f118b & 7;
        if (i7 == 0) {
            do {
                list.add(Integer.valueOf(jVar.m()));
                if (jVar.c()) {
                    return;
                } else {
                    u8 = jVar.u();
                }
            } while (u8 == this.f118b);
            this.f120d = u8;
            return;
        }
        if (i7 != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        int b9 = jVar.b() + jVar.v();
        do {
            list.add(Integer.valueOf(jVar.m()));
        } while (jVar.b() < b9);
        z(b9);
    }

    public void r(List list) {
        int u8;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f121e;
        int i7 = this.f118b & 7;
        if (i7 == 0) {
            do {
                list.add(Long.valueOf(jVar.n()));
                if (jVar.c()) {
                    return;
                } else {
                    u8 = jVar.u();
                }
            } while (u8 == this.f118b);
            this.f120d = u8;
            return;
        }
        if (i7 != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        int b9 = jVar.b() + jVar.v();
        do {
            list.add(Long.valueOf(jVar.n()));
        } while (jVar.b() < b9);
        z(b9);
    }

    public void s(List list) {
        int u8;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f121e;
        int i7 = this.f118b & 7;
        if (i7 == 2) {
            int v5 = jVar.v();
            if ((v5 & 3) != 0) {
                throw new androidx.datastore.preferences.protobuf.z("Failed to parse the message.");
            }
            int b9 = jVar.b() + v5;
            do {
                list.add(Integer.valueOf(jVar.o()));
            } while (jVar.b() < b9);
            return;
        }
        if (i7 != 5) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        do {
            list.add(Integer.valueOf(jVar.o()));
            if (jVar.c()) {
                return;
            } else {
                u8 = jVar.u();
            }
        } while (u8 == this.f118b);
        this.f120d = u8;
    }

    public void t(List list) {
        int u8;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f121e;
        int i7 = this.f118b & 7;
        if (i7 == 1) {
            do {
                list.add(Long.valueOf(jVar.p()));
                if (jVar.c()) {
                    return;
                } else {
                    u8 = jVar.u();
                }
            } while (u8 == this.f118b);
            this.f120d = u8;
            return;
        }
        if (i7 != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        int v5 = jVar.v();
        if ((v5 & 7) != 0) {
            throw new androidx.datastore.preferences.protobuf.z("Failed to parse the message.");
        }
        int b9 = jVar.b() + v5;
        do {
            list.add(Long.valueOf(jVar.p()));
        } while (jVar.b() < b9);
    }

    public String toString() {
        switch (this.f117a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i7 = this.f118b;
                sb.append(i7);
                sb.append('-');
                a2.h0 h0Var = (a2.h0) this.f121e;
                sb.append(r4.a.J(h0Var, i7));
                sb.append(',');
                int i8 = this.f119c;
                sb.append(i8);
                sb.append('-');
                sb.append(r4.a.J(h0Var, i8));
                sb.append("), prevOffset=");
                return m.l(sb, this.f120d, ')');
            case 1:
            default:
                return super.toString();
            case 2:
                return "";
        }
    }

    public void u(List list) {
        int u8;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f121e;
        int i7 = this.f118b & 7;
        if (i7 == 0) {
            do {
                list.add(Integer.valueOf(jVar.q()));
                if (jVar.c()) {
                    return;
                } else {
                    u8 = jVar.u();
                }
            } while (u8 == this.f118b);
            this.f120d = u8;
            return;
        }
        if (i7 != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        int b9 = jVar.b() + jVar.v();
        do {
            list.add(Integer.valueOf(jVar.q()));
        } while (jVar.b() < b9);
        z(b9);
    }

    public void v(List list) {
        int u8;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f121e;
        int i7 = this.f118b & 7;
        if (i7 == 0) {
            do {
                list.add(Long.valueOf(jVar.r()));
                if (jVar.c()) {
                    return;
                } else {
                    u8 = jVar.u();
                }
            } while (u8 == this.f118b);
            this.f120d = u8;
            return;
        }
        if (i7 != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        int b9 = jVar.b() + jVar.v();
        do {
            list.add(Long.valueOf(jVar.r()));
        } while (jVar.b() < b9);
        z(b9);
    }

    public void w(List list, boolean z8) {
        String s5;
        int u8;
        int u9;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f121e;
        if ((this.f118b & 7) != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        if ((list instanceof androidx.datastore.preferences.protobuf.c0) && !z8) {
            androidx.datastore.preferences.protobuf.c0 c0Var = (androidx.datastore.preferences.protobuf.c0) list;
            do {
                c0Var.h(i());
                if (jVar.c()) {
                    return;
                } else {
                    u9 = jVar.u();
                }
            } while (u9 == this.f118b);
            this.f120d = u9;
            return;
        }
        do {
            if (z8) {
                A(2);
                s5 = jVar.t();
            } else {
                A(2);
                s5 = jVar.s();
            }
            list.add(s5);
            if (jVar.c()) {
                return;
            } else {
                u8 = jVar.u();
            }
        } while (u8 == this.f118b);
        this.f120d = u8;
    }

    public void x(List list) {
        int u8;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f121e;
        int i7 = this.f118b & 7;
        if (i7 == 0) {
            do {
                list.add(Integer.valueOf(jVar.v()));
                if (jVar.c()) {
                    return;
                } else {
                    u8 = jVar.u();
                }
            } while (u8 == this.f118b);
            this.f120d = u8;
            return;
        }
        if (i7 != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        int b9 = jVar.b() + jVar.v();
        do {
            list.add(Integer.valueOf(jVar.v()));
        } while (jVar.b() < b9);
        z(b9);
    }

    public void y(List list) {
        int u8;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f121e;
        int i7 = this.f118b & 7;
        if (i7 == 0) {
            do {
                list.add(Long.valueOf(jVar.w()));
                if (jVar.c()) {
                    return;
                } else {
                    u8 = jVar.u();
                }
            } while (u8 == this.f118b);
            this.f120d = u8;
            return;
        }
        if (i7 != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        int b9 = jVar.b() + jVar.v();
        do {
            list.add(Long.valueOf(jVar.w()));
        } while (jVar.b() < b9);
        z(b9);
    }

    public void z(int i7) {
        if (((androidx.datastore.preferences.protobuf.j) this.f121e).b() != i7) {
            throw androidx.datastore.preferences.protobuf.z.e();
        }
    }

    public p(androidx.datastore.preferences.protobuf.j jVar) {
        this.f117a = 1;
        this.f120d = 0;
        Charset charset = androidx.datastore.preferences.protobuf.x.f922a;
        this.f121e = jVar;
        jVar.f850b = this;
    }

    public p(h0.d0 d0Var) {
        this.f117a = 3;
        this.f121e = d0Var;
    }

    public p(int i7, int i8, int i9, a2.h0 h0Var) {
        this.f117a = 0;
        this.f118b = i7;
        this.f119c = i8;
        this.f120d = i9;
        this.f121e = h0Var;
    }
}
