package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class ei0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ei0 f4614a = new vd0();

    /* renamed from: b, reason: collision with root package name */
    public static final my3<ei0> f4615b = new my3() { // from class: com.google.android.gms.internal.ads.vc0
    };

    protected ei0() {
    }

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract pf0 d(int i7, pf0 pf0Var, boolean z6);

    public abstract hh0 e(int i7, hh0 hh0Var, long j7);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei0)) {
            return false;
        }
        ei0 ei0Var = (ei0) obj;
        if (ei0Var.c() != c() || ei0Var.b() != b()) {
            return false;
        }
        hh0 hh0Var = new hh0();
        pf0 pf0Var = new pf0();
        hh0 hh0Var2 = new hh0();
        pf0 pf0Var2 = new pf0();
        for (int i7 = 0; i7 < c(); i7++) {
            if (!e(i7, hh0Var, 0L).equals(ei0Var.e(i7, hh0Var2, 0L))) {
                return false;
            }
        }
        for (int i8 = 0; i8 < b(); i8++) {
            if (!d(i8, pf0Var, true).equals(ei0Var.d(i8, pf0Var2, true))) {
                return false;
            }
        }
        return true;
    }

    public abstract Object f(int i7);

    public int g(boolean z6) {
        return o() ? -1 : 0;
    }

    public int h(boolean z6) {
        if (o()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i7;
        hh0 hh0Var = new hh0();
        pf0 pf0Var = new pf0();
        int c7 = c() + 217;
        int i8 = 0;
        while (true) {
            i7 = c7 * 31;
            if (i8 >= c()) {
                break;
            }
            c7 = i7 + e(i8, hh0Var, 0L).hashCode();
            i8++;
        }
        int b7 = i7 + b();
        for (int i9 = 0; i9 < b(); i9++) {
            b7 = (b7 * 31) + d(i9, pf0Var, true).hashCode();
        }
        return b7;
    }

    public final int i(int i7, pf0 pf0Var, hh0 hh0Var, int i8, boolean z6) {
        int i9 = d(i7, pf0Var, false).f10218c;
        if (e(i9, hh0Var, 0L).f6261n != i7) {
            return i7 + 1;
        }
        int j7 = j(i9, i8, z6);
        if (j7 == -1) {
            return -1;
        }
        return e(j7, hh0Var, 0L).f6260m;
    }

    public int j(int i7, int i8, boolean z6) {
        if (i8 == 0) {
            if (i7 == h(z6)) {
                return -1;
            }
            return i7 + 1;
        }
        if (i8 == 1) {
            return i7;
        }
        if (i8 == 2) {
            return i7 == h(z6) ? g(z6) : i7 + 1;
        }
        throw new IllegalStateException();
    }

    public int k(int i7, int i8, boolean z6) {
        if (i7 == g(false)) {
            return -1;
        }
        return i7 - 1;
    }

    public final Pair<Object, Long> l(hh0 hh0Var, pf0 pf0Var, int i7, long j7) {
        Pair<Object, Long> m7 = m(hh0Var, pf0Var, i7, j7, 0L);
        Objects.requireNonNull(m7);
        return m7;
    }

    public final Pair<Object, Long> m(hh0 hh0Var, pf0 pf0Var, int i7, long j7, long j8) {
        wu1.a(i7, 0, c());
        e(i7, hh0Var, j8);
        if (j7 == -9223372036854775807L) {
            long j9 = hh0Var.f6258k;
            j7 = 0;
        }
        int i8 = hh0Var.f6260m;
        d(i8, pf0Var, false);
        while (i8 < hh0Var.f6261n) {
            long j10 = pf0Var.f10220e;
            if (j7 == 0) {
                break;
            }
            int i9 = i8 + 1;
            long j11 = d(i9, pf0Var, false).f10220e;
            if (j7 < 0) {
                break;
            }
            i8 = i9;
        }
        d(i8, pf0Var, true);
        long j12 = pf0Var.f10220e;
        long j13 = pf0Var.f10219d;
        if (j13 != -9223372036854775807L) {
            j7 = Math.min(j7, j13 - 1);
        }
        long max = Math.max(0L, j7);
        Object obj = pf0Var.f10217b;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    public pf0 n(Object obj, pf0 pf0Var) {
        return d(a(obj), pf0Var, true);
    }

    public final boolean o() {
        return c() == 0;
    }
}
