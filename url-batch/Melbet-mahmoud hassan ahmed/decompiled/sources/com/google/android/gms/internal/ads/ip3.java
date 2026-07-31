package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class ip3 {

    /* renamed from: a, reason: collision with root package name */
    private final hp3 f6739a;

    private ip3(hp3 hp3Var) {
        kq3.f(hp3Var, "output");
        this.f6739a = hp3Var;
        hp3Var.f6378a = this;
    }

    public static ip3 l(hp3 hp3Var) {
        ip3 ip3Var = hp3Var.f6378a;
        return ip3Var != null ? ip3Var : new ip3(hp3Var);
    }

    public final void A(int i7, List<Float> list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f6739a.k(i7, Float.floatToRawIntBits(list.get(i8).floatValue()));
                i8++;
            }
            return;
        }
        this.f6739a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.get(i10).floatValue();
            i9 += 4;
        }
        this.f6739a.u(i9);
        while (i8 < list.size()) {
            this.f6739a.l(Float.floatToRawIntBits(list.get(i8).floatValue()));
            i8++;
        }
    }

    public final void B(int i7, Object obj, es3 es3Var) {
        hp3 hp3Var = this.f6739a;
        hp3Var.s(i7, 3);
        es3Var.g((kr3) obj, hp3Var.f6378a);
        hp3Var.s(i7, 4);
    }

    public final void C(int i7, int i8) {
        this.f6739a.o(i7, i8);
    }

    public final void D(int i7, List<Integer> list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f6739a.o(i7, list.get(i8).intValue());
                i8++;
            }
            return;
        }
        this.f6739a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += hp3.z(list.get(i10).intValue());
        }
        this.f6739a.u(i9);
        while (i8 < list.size()) {
            this.f6739a.p(list.get(i8).intValue());
            i8++;
        }
    }

    public final void E(int i7, long j7) {
        this.f6739a.v(i7, j7);
    }

    public final void F(int i7, List<Long> list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f6739a.v(i7, list.get(i8).longValue());
                i8++;
            }
            return;
        }
        this.f6739a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += hp3.b(list.get(i10).longValue());
        }
        this.f6739a.u(i9);
        while (i8 < list.size()) {
            this.f6739a.w(list.get(i8).longValue());
            i8++;
        }
    }

    public final void G(int i7, Object obj, es3 es3Var) {
        kr3 kr3Var = (kr3) obj;
        ep3 ep3Var = (ep3) this.f6739a;
        ep3Var.u((i7 << 3) | 2);
        bo3 bo3Var = (bo3) kr3Var;
        int j7 = bo3Var.j();
        if (j7 == -1) {
            j7 = es3Var.c(bo3Var);
            bo3Var.l(j7);
        }
        ep3Var.u(j7);
        es3Var.g(kr3Var, ep3Var.f6378a);
    }

    public final void H(int i7, int i8) {
        this.f6739a.k(i7, i8);
    }

    public final void I(int i7, List<Integer> list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f6739a.k(i7, list.get(i8).intValue());
                i8++;
            }
            return;
        }
        this.f6739a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.get(i10).intValue();
            i9 += 4;
        }
        this.f6739a.u(i9);
        while (i8 < list.size()) {
            this.f6739a.l(list.get(i8).intValue());
            i8++;
        }
    }

    public final void J(int i7, long j7) {
        this.f6739a.m(i7, j7);
    }

    public final void K(int i7, List<Long> list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f6739a.m(i7, list.get(i8).longValue());
                i8++;
            }
            return;
        }
        this.f6739a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.get(i10).longValue();
            i9 += 8;
        }
        this.f6739a.u(i9);
        while (i8 < list.size()) {
            this.f6739a.n(list.get(i8).longValue());
            i8++;
        }
    }

    public final void a(int i7, int i8) {
        this.f6739a.t(i7, (i8 >> 31) ^ (i8 + i8));
    }

    public final void b(int i7, List<Integer> list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                hp3 hp3Var = this.f6739a;
                int intValue = list.get(i8).intValue();
                hp3Var.t(i7, (intValue >> 31) ^ (intValue + intValue));
                i8++;
            }
            return;
        }
        this.f6739a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int intValue2 = list.get(i10).intValue();
            i9 += hp3.a((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.f6739a.u(i9);
        while (i8 < list.size()) {
            hp3 hp3Var2 = this.f6739a;
            int intValue3 = list.get(i8).intValue();
            hp3Var2.u((intValue3 >> 31) ^ (intValue3 + intValue3));
            i8++;
        }
    }

    public final void c(int i7, long j7) {
        this.f6739a.v(i7, (j7 >> 63) ^ (j7 + j7));
    }

    public final void d(int i7, List<Long> list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                hp3 hp3Var = this.f6739a;
                long longValue = list.get(i8).longValue();
                hp3Var.v(i7, (longValue >> 63) ^ (longValue + longValue));
                i8++;
            }
            return;
        }
        this.f6739a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            long longValue2 = list.get(i10).longValue();
            i9 += hp3.b((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.f6739a.u(i9);
        while (i8 < list.size()) {
            hp3 hp3Var2 = this.f6739a;
            long longValue3 = list.get(i8).longValue();
            hp3Var2.w((longValue3 >> 63) ^ (longValue3 + longValue3));
            i8++;
        }
    }

    public final void e(int i7) {
        this.f6739a.s(i7, 3);
    }

    public final void f(int i7, String str) {
        this.f6739a.r(i7, str);
    }

    public final void g(int i7, List<String> list) {
        int i8 = 0;
        if (!(list instanceof sq3)) {
            while (i8 < list.size()) {
                this.f6739a.r(i7, list.get(i8));
                i8++;
            }
            return;
        }
        sq3 sq3Var = (sq3) list;
        while (i8 < list.size()) {
            Object E = sq3Var.E(i8);
            if (E instanceof String) {
                this.f6739a.r(i7, (String) E);
            } else {
                this.f6739a.j(i7, (uo3) E);
            }
            i8++;
        }
    }

    public final void h(int i7, int i8) {
        this.f6739a.t(i7, i8);
    }

    public final void i(int i7, List<Integer> list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f6739a.t(i7, list.get(i8).intValue());
                i8++;
            }
            return;
        }
        this.f6739a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += hp3.a(list.get(i10).intValue());
        }
        this.f6739a.u(i9);
        while (i8 < list.size()) {
            this.f6739a.u(list.get(i8).intValue());
            i8++;
        }
    }

    public final void j(int i7, long j7) {
        this.f6739a.v(i7, j7);
    }

    public final void k(int i7, List<Long> list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f6739a.v(i7, list.get(i8).longValue());
                i8++;
            }
            return;
        }
        this.f6739a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += hp3.b(list.get(i10).longValue());
        }
        this.f6739a.u(i9);
        while (i8 < list.size()) {
            this.f6739a.w(list.get(i8).longValue());
            i8++;
        }
    }

    public final void m(int i7, boolean z6) {
        this.f6739a.i(i7, z6);
    }

    public final void n(int i7, List<Boolean> list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f6739a.i(i7, list.get(i8).booleanValue());
                i8++;
            }
            return;
        }
        this.f6739a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.get(i10).booleanValue();
            i9++;
        }
        this.f6739a.u(i9);
        while (i8 < list.size()) {
            this.f6739a.h(list.get(i8).booleanValue() ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    public final void o(int i7, uo3 uo3Var) {
        this.f6739a.j(i7, uo3Var);
    }

    public final void p(int i7, List<uo3> list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f6739a.j(i7, list.get(i8));
        }
    }

    public final void q(int i7, double d7) {
        this.f6739a.m(i7, Double.doubleToRawLongBits(d7));
    }

    public final void r(int i7, List<Double> list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f6739a.m(i7, Double.doubleToRawLongBits(list.get(i8).doubleValue()));
                i8++;
            }
            return;
        }
        this.f6739a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.get(i10).doubleValue();
            i9 += 8;
        }
        this.f6739a.u(i9);
        while (i8 < list.size()) {
            this.f6739a.n(Double.doubleToRawLongBits(list.get(i8).doubleValue()));
            i8++;
        }
    }

    public final void s(int i7) {
        this.f6739a.s(i7, 4);
    }

    public final void t(int i7, int i8) {
        this.f6739a.o(i7, i8);
    }

    public final void u(int i7, List<Integer> list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f6739a.o(i7, list.get(i8).intValue());
                i8++;
            }
            return;
        }
        this.f6739a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += hp3.z(list.get(i10).intValue());
        }
        this.f6739a.u(i9);
        while (i8 < list.size()) {
            this.f6739a.p(list.get(i8).intValue());
            i8++;
        }
    }

    public final void v(int i7, int i8) {
        this.f6739a.k(i7, i8);
    }

    public final void w(int i7, List<Integer> list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f6739a.k(i7, list.get(i8).intValue());
                i8++;
            }
            return;
        }
        this.f6739a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.get(i10).intValue();
            i9 += 4;
        }
        this.f6739a.u(i9);
        while (i8 < list.size()) {
            this.f6739a.l(list.get(i8).intValue());
            i8++;
        }
    }

    public final void x(int i7, long j7) {
        this.f6739a.m(i7, j7);
    }

    public final void y(int i7, List<Long> list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f6739a.m(i7, list.get(i8).longValue());
                i8++;
            }
            return;
        }
        this.f6739a.s(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.get(i10).longValue();
            i9 += 8;
        }
        this.f6739a.u(i9);
        while (i8 < list.size()) {
            this.f6739a.n(list.get(i8).longValue());
            i8++;
        }
    }

    public final void z(int i7, float f7) {
        this.f6739a.k(i7, Float.floatToRawIntBits(f7));
    }
}
