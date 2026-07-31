package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class ws3<T, B> {
    ws3() {
    }

    abstract int a(T t6);

    abstract int b(T t6);

    abstract B c(Object obj);

    abstract T d(Object obj);

    abstract T e(T t6, T t7);

    abstract B f();

    abstract T g(B b7);

    abstract void h(B b7, int i7, int i8);

    abstract void i(B b7, int i7, long j7);

    abstract void j(B b7, int i7, T t6);

    abstract void k(B b7, int i7, uo3 uo3Var);

    abstract void l(B b7, int i7, long j7);

    abstract void m(Object obj);

    abstract void n(Object obj, B b7);

    abstract void o(Object obj, T t6);

    final boolean p(B b7, wr3 wr3Var) {
        int g7 = wr3Var.g();
        int i7 = g7 >>> 3;
        int i8 = g7 & 7;
        if (i8 == 0) {
            l(b7, i7, wr3Var.k());
            return true;
        }
        if (i8 == 1) {
            i(b7, i7, wr3Var.j());
            return true;
        }
        if (i8 == 2) {
            k(b7, i7, wr3Var.l());
            return true;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                return false;
            }
            if (i8 != 5) {
                throw mq3.a();
            }
            h(b7, i7, wr3Var.d());
            return true;
        }
        B f7 = f();
        int i9 = 4 | (i7 << 3);
        while (wr3Var.c() != Integer.MAX_VALUE && p(f7, wr3Var)) {
        }
        if (i9 != wr3Var.g()) {
            throw mq3.b();
        }
        g(f7);
        j(b7, i7, f7);
        return true;
    }

    abstract boolean q(wr3 wr3Var);

    abstract void r(T t6, ip3 ip3Var);
}
