package T;

import a.AbstractC0124a;
import android.util.Pair;

/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    public static final P f2704a = new P();

    static {
        W.J.G(0);
        W.J.G(1);
        W.J.G(2);
    }

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i4, Q q4, S s4, int i5, boolean z) {
        int i6 = f(i4, q4, false).f2683c;
        if (m(i6, s4, 0L).o != i4) {
            return i4 + 1;
        }
        int e4 = e(i6, z, i5);
        if (e4 == -1) {
            return -1;
        }
        return m(e4, s4, 0L).n;
    }

    public int e(int i4, boolean z, int i5) {
        if (i5 == 0) {
            if (i4 == c(z)) {
                return -1;
            }
            return i4 + 1;
        }
        if (i5 == 1) {
            return i4;
        }
        if (i5 == 2) {
            return i4 == c(z) ? a(z) : i4 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int c4;
        if (this != obj) {
            if (obj instanceof T) {
                T t4 = (T) obj;
                if (t4.o() == o() && t4.h() == h()) {
                    S s4 = new S();
                    Q q4 = new Q();
                    S s5 = new S();
                    Q q5 = new Q();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= o()) {
                            int i5 = 0;
                            while (true) {
                                if (i5 >= h()) {
                                    int a3 = a(true);
                                    if (a3 == t4.a(true) && (c4 = c(true)) == t4.c(true)) {
                                        while (a3 != c4) {
                                            int e4 = e(a3, true, 0);
                                            if (e4 == t4.e(a3, true, 0)) {
                                                a3 = e4;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i5, q4, true).equals(t4.f(i5, q5, true))) {
                                        break;
                                    }
                                    i5++;
                                }
                            }
                        } else {
                            if (!m(i4, s4, 0L).equals(t4.m(i4, s5, 0L))) {
                                break;
                            }
                            i4++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract Q f(int i4, Q q4, boolean z);

    public Q g(Object obj, Q q4) {
        return f(b(obj), q4, true);
    }

    public abstract int h();

    public int hashCode() {
        S s4 = new S();
        Q q4 = new Q();
        int o = o() + 217;
        for (int i4 = 0; i4 < o(); i4++) {
            o = (o * 31) + m(i4, s4, 0L).hashCode();
        }
        int h2 = h() + (o * 31);
        for (int i5 = 0; i5 < h(); i5++) {
            h2 = (h2 * 31) + f(i5, q4, true).hashCode();
        }
        int a3 = a(true);
        while (a3 != -1) {
            h2 = (h2 * 31) + a3;
            a3 = e(a3, true, 0);
        }
        return h2;
    }

    public final Pair i(S s4, Q q4, int i4, long j4) {
        Pair j5 = j(s4, q4, i4, j4, 0L);
        j5.getClass();
        return j5;
    }

    public final Pair j(S s4, Q q4, int i4, long j4, long j5) {
        AbstractC0124a.m(i4, o());
        m(i4, s4, j5);
        if (j4 == -9223372036854775807L) {
            j4 = s4.f2701l;
            if (j4 == -9223372036854775807L) {
                return null;
            }
        }
        int i5 = s4.n;
        f(i5, q4, false);
        while (i5 < s4.o && q4.f2685e != j4) {
            int i6 = i5 + 1;
            if (f(i6, q4, false).f2685e > j4) {
                break;
            }
            i5 = i6;
        }
        f(i5, q4, true);
        long j6 = j4 - q4.f2685e;
        long j7 = q4.f2684d;
        if (j7 != -9223372036854775807L) {
            j6 = Math.min(j6, j7 - 1);
        }
        long max = Math.max(0L, j6);
        Object obj = q4.f2682b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i4, int i5) {
        if (i5 == 0) {
            if (i4 == a(false)) {
                return -1;
            }
            return i4 - 1;
        }
        if (i5 == 1) {
            return i4;
        }
        if (i5 == 2) {
            return i4 == a(false) ? c(false) : i4 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i4);

    public abstract S m(int i4, S s4, long j4);

    public final void n(int i4, S s4) {
        m(i4, s4, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
