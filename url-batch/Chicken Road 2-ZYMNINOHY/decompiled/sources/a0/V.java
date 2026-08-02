package a0;

import a.AbstractC0124a;
import android.util.Pair;
import java.util.ArrayList;
import q0.C1353B;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: c, reason: collision with root package name */
    public final b0.d f4014c;

    /* renamed from: d, reason: collision with root package name */
    public final W.F f4015d;

    /* renamed from: e, reason: collision with root package name */
    public final D0.a f4016e;

    /* renamed from: f, reason: collision with root package name */
    public long f4017f;

    /* renamed from: g, reason: collision with root package name */
    public int f4018g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4019h;

    /* renamed from: i, reason: collision with root package name */
    public T f4020i;

    /* renamed from: j, reason: collision with root package name */
    public T f4021j;

    /* renamed from: k, reason: collision with root package name */
    public T f4022k;

    /* renamed from: l, reason: collision with root package name */
    public T f4023l;

    /* renamed from: m, reason: collision with root package name */
    public T f4024m;
    public int n;
    public Object o;

    /* renamed from: p, reason: collision with root package name */
    public long f4025p;

    /* renamed from: a, reason: collision with root package name */
    public final T.Q f4012a = new T.Q();

    /* renamed from: b, reason: collision with root package name */
    public final T.S f4013b = new T.S();

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f4026q = new ArrayList();

    public V(b0.d dVar, W.F f4, D0.a aVar, C0150p c0150p) {
        this.f4014c = dVar;
        this.f4015d = f4;
        this.f4016e = aVar;
    }

    public static C1353B o(T.T t4, Object obj, long j4, long j5, T.S s4, T.Q q4) {
        t4.g(obj, q4);
        t4.n(q4.f2683c, s4);
        t4.b(obj);
        int i4 = q4.f2687g.f2769a;
        if (i4 != 0) {
            if (i4 == 1) {
                q4.f(0);
            }
            q4.f2687g.getClass();
            q4.g(0);
        }
        t4.g(obj, q4);
        int c4 = q4.c(j4);
        return c4 == -1 ? new C1353B(obj, j5, q4.b(j4)) : new C1353B(obj, c4, q4.e(c4), j5, -1);
    }

    public final T a() {
        T t4 = this.f4020i;
        if (t4 == null) {
            return null;
        }
        if (t4 == this.f4021j) {
            this.f4021j = t4.f4000m;
        }
        if (t4 == this.f4022k) {
            this.f4022k = t4.f4000m;
        }
        t4.i();
        int i4 = this.n - 1;
        this.n = i4;
        if (i4 == 0) {
            this.f4023l = null;
            T t5 = this.f4020i;
            this.o = t5.f3989b;
            this.f4025p = t5.f3994g.f4002a.f14815d;
        }
        this.f4020i = this.f4020i.f4000m;
        l();
        return this.f4020i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        T t4 = this.f4020i;
        t4.getClass();
        this.o = t4.f3989b;
        this.f4025p = t4.f3994g.f4002a.f14815d;
        while (t4 != null) {
            t4.i();
            t4 = t4.f4000m;
        }
        this.f4020i = null;
        this.f4023l = null;
        this.f4021j = null;
        this.f4022k = null;
        this.n = 0;
        l();
    }

    public final U c(T.T t4, T t5, long j4) {
        long j5;
        T.Q q4;
        T.T t6;
        Object obj;
        long j6;
        long j7;
        long j8;
        long q5;
        U u4 = t5.f3994g;
        long j9 = (t5.f4001p + u4.f4006e) - j4;
        if (!u4.f4009h) {
            C1353B c1353b = u4.f4002a;
            Object obj2 = c1353b.f14812a;
            int i4 = c1353b.f14816e;
            T.Q q6 = this.f4012a;
            t4.g(obj2, q6);
            boolean z = u4.f4008g;
            if (!c1353b.b()) {
                if (i4 != -1) {
                    q6.f(i4);
                }
                int e4 = q6.e(i4);
                q6.g(i4);
                if (e4 != q6.f2687g.a(i4).f2756a) {
                    return e(t4, c1353b.f14812a, c1353b.f14816e, e4, u4.f4006e, c1353b.f14815d, z);
                }
                t4.g(obj2, q6);
                q6.d(i4);
                q6.f2687g.a(i4).getClass();
                return f(t4, c1353b.f14812a, 0L, u4.f4006e, c1353b.f14815d, false);
            }
            int i5 = c1353b.f14813b;
            int i6 = q6.f2687g.a(i5).f2756a;
            if (i6 == -1) {
                return null;
            }
            int a3 = q6.f2687g.a(i5).a(c1353b.f14814c);
            if (a3 < i6) {
                return e(t4, c1353b.f14812a, i5, a3, u4.f4004c, c1353b.f14815d, z);
            }
            long j10 = u4.f4004c;
            if (j10 == -9223372036854775807L) {
                int i7 = q6.f2683c;
                long max = Math.max(0L, j9);
                j5 = 0;
                Pair j11 = t4.j(this.f4013b, q6, i7, -9223372036854775807L, max);
                q4 = q6;
                t6 = t4;
                if (j11 == null) {
                    return null;
                }
                j10 = ((Long) j11.second).longValue();
            } else {
                j5 = 0;
                q4 = q6;
                t6 = t4;
            }
            int i8 = c1353b.f14813b;
            t6.g(obj2, q4);
            q4.d(i8);
            q4.f2687g.a(i8).getClass();
            return f(t4, c1353b.f14812a, Math.max(j5, j10), u4.f4004c, c1353b.f14815d, z);
        }
        U u5 = t5.f3994g;
        C1353B c1353b2 = u5.f4002a;
        long j12 = u5.f4004c;
        int d4 = t4.d(t4.b(c1353b2.f14812a), this.f4012a, this.f4013b, this.f4018g, this.f4019h);
        if (d4 != -1) {
            T.Q q7 = this.f4012a;
            int i9 = t4.f(d4, q7, true).f2683c;
            Object obj3 = q7.f2682b;
            obj3.getClass();
            long j13 = c1353b2.f14815d;
            if (t4.m(i9, this.f4013b, 0L).n == d4) {
                Pair j14 = t4.j(this.f4013b, this.f4012a, i9, -9223372036854775807L, Math.max(0L, j9));
                if (j14 != null) {
                    Object obj4 = j14.first;
                    long longValue = ((Long) j14.second).longValue();
                    T t7 = t5.f4000m;
                    if (t7 == null || !t7.f3989b.equals(obj4)) {
                        q5 = q(obj4);
                        if (q5 == -1) {
                            q5 = this.f4017f;
                            this.f4017f = 1 + q5;
                        }
                    } else {
                        q5 = t7.f3994g.f4002a.f14815d;
                    }
                    obj = obj4;
                    j6 = longValue;
                    j8 = q5;
                    j7 = -9223372036854775807L;
                }
            } else {
                obj = obj3;
                j6 = 0;
                j7 = 0;
                j8 = j13;
            }
            C1353B o = o(t4, obj, j6, j8, this.f4013b, this.f4012a);
            if (j7 != -9223372036854775807L && j12 != -9223372036854775807L) {
                int i10 = t4.g(c1353b2.f14812a, q7).f2687g.f2769a;
                q7.f2687g.getClass();
                if (i10 > 0) {
                    q7.g(0);
                }
            }
            return d(t4, o, j7, j6);
        }
        return null;
    }

    public final U d(T.T t4, C1353B c1353b, long j4, long j5) {
        t4.g(c1353b.f14812a, this.f4012a);
        return c1353b.b() ? e(t4, c1353b.f14812a, c1353b.f14813b, c1353b.f14814c, j4, c1353b.f14815d, false) : f(t4, c1353b.f14812a, j5, j4, c1353b.f14815d, false);
    }

    public final U e(T.T t4, Object obj, int i4, int i5, long j4, long j5, boolean z) {
        C1353B c1353b = new C1353B(obj, i4, i5, j5, -1);
        T.Q q4 = this.f4012a;
        long a3 = t4.g(obj, q4).a(i4, i5);
        if (i5 == q4.e(i4)) {
            q4.f2687g.getClass();
        }
        q4.g(i4);
        long j6 = 0;
        if (a3 != -9223372036854775807L && 0 >= a3) {
            j6 = Math.max(0L, a3 - 1);
        }
        return new U(c1353b, j6, j4, -9223372036854775807L, a3, z, false, false, false, false);
    }

    public final U f(T.T t4, Object obj, long j4, long j5, long j6, boolean z) {
        long j7;
        T.Q q4 = this.f4012a;
        t4.g(obj, q4);
        int b4 = q4.b(j4);
        boolean z4 = false;
        if (b4 != -1) {
            q4.g(b4);
        } else if (q4.f2687g.f2769a > 0) {
            q4.g(0);
        }
        C1353B c1353b = new C1353B(obj, j6, b4);
        if (!c1353b.b() && b4 == -1) {
            z4 = true;
        }
        boolean j8 = j(t4, c1353b);
        boolean i4 = i(t4, c1353b, z4);
        if (b4 != -1) {
            q4.g(b4);
        }
        if (b4 != -1) {
            q4.f(b4);
        }
        if (b4 != -1) {
            q4.d(b4);
            j7 = 0;
        } else {
            j7 = -9223372036854775807L;
        }
        long j9 = (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? q4.f2684d : j7;
        return new U(c1353b, (j9 == -9223372036854775807L || j4 < j9) ? j4 : Math.max(0L, j9 - 1), j5, j7, j9, z, false, z4, j8, i4);
    }

    public final T g() {
        return this.f4022k;
    }

    public final U h(T.T t4, U u4) {
        long j4;
        C1353B c1353b = u4.f4002a;
        boolean b4 = c1353b.b();
        int i4 = c1353b.f14816e;
        boolean z = !b4 && i4 == -1;
        int i5 = c1353b.f14813b;
        boolean j5 = j(t4, c1353b);
        boolean i6 = i(t4, c1353b, z);
        Object obj = c1353b.f14812a;
        T.Q q4 = this.f4012a;
        t4.g(obj, q4);
        if (c1353b.b() || i4 == -1) {
            j4 = -9223372036854775807L;
        } else {
            q4.d(i4);
            j4 = 0;
        }
        long a3 = c1353b.b() ? q4.a(i5, c1353b.f14814c) : (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? q4.f2684d : j4;
        if (c1353b.b()) {
            q4.g(i5);
        } else if (i4 != -1) {
            q4.g(i4);
        }
        return new U(c1353b, u4.f4003b, u4.f4004c, j4, a3, u4.f4007f, false, z, j5, i6);
    }

    public final boolean i(T.T t4, C1353B c1353b, boolean z) {
        int b4 = t4.b(c1353b.f14812a);
        if (!t4.m(t4.f(b4, this.f4012a, false).f2683c, this.f4013b, 0L).f2698i) {
            if (t4.d(b4, this.f4012a, this.f4013b, this.f4018g, this.f4019h) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(T.T t4, C1353B c1353b) {
        boolean z = !c1353b.b() && c1353b.f14816e == -1;
        Object obj = c1353b.f14812a;
        if (z) {
            if (t4.m(t4.g(obj, this.f4012a).f2683c, this.f4013b, 0L).o == t4.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        T t4 = this.f4024m;
        if (t4 == null || t4.h()) {
            this.f4024m = null;
            for (int i4 = 0; i4 < this.f4026q.size(); i4++) {
                T t5 = (T) this.f4026q.get(i4);
                if (!t5.h()) {
                    this.f4024m = t5;
                    return;
                }
            }
        }
    }

    public final void l() {
        v2.F j4 = v2.I.j();
        for (T t4 = this.f4020i; t4 != null; t4 = t4.f4000m) {
            j4.b(t4.f3994g.f4002a);
        }
        T t5 = this.f4021j;
        this.f4015d.c(new Q1.a(this, j4, t5 == null ? null : t5.f3994g.f4002a, 2));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, q0.d0] */
    public final void m(long j4) {
        T t4 = this.f4023l;
        if (t4 != null) {
            AbstractC0124a.t(t4.f4000m == null);
            if (t4.f3992e) {
                t4.f3988a.w(j4 - t4.f4001p);
            }
        }
    }

    public final int n(T t4) {
        t4.getClass();
        int i4 = 0;
        if (t4.equals(this.f4023l)) {
            return 0;
        }
        this.f4023l = t4;
        while (true) {
            t4 = t4.f4000m;
            if (t4 == null) {
                break;
            }
            if (t4 == this.f4021j) {
                T t5 = this.f4020i;
                this.f4021j = t5;
                this.f4022k = t5;
                i4 = 3;
            }
            if (t4 == this.f4022k) {
                this.f4022k = this.f4021j;
                i4 |= 2;
            }
            t4.i();
            this.n--;
        }
        T t6 = this.f4023l;
        t6.getClass();
        if (t6.f4000m != null) {
            t6.b();
            t6.f4000m = null;
            t6.c();
        }
        l();
        return i4;
    }

    public final C1353B p(T.T t4, Object obj, long j4) {
        long q4;
        int b4;
        Object obj2 = obj;
        T.Q q5 = this.f4012a;
        int i4 = t4.g(obj2, q5).f2683c;
        Object obj3 = this.o;
        if (obj3 == null || (b4 = t4.b(obj3)) == -1 || t4.f(b4, q5, false).f2683c != i4) {
            T t5 = this.f4020i;
            while (true) {
                if (t5 == null) {
                    T t6 = this.f4020i;
                    while (true) {
                        if (t6 != null) {
                            int b5 = t4.b(t6.f3989b);
                            if (b5 != -1 && t4.f(b5, q5, false).f2683c == i4) {
                                q4 = t6.f3994g.f4002a.f14815d;
                                break;
                            }
                            t6 = t6.f4000m;
                        } else {
                            q4 = q(obj2);
                            if (q4 == -1) {
                                q4 = this.f4017f;
                                this.f4017f = 1 + q4;
                                if (this.f4020i == null) {
                                    this.o = obj2;
                                    this.f4025p = q4;
                                }
                            }
                        }
                    }
                } else {
                    if (t5.f3989b.equals(obj2)) {
                        q4 = t5.f3994g.f4002a.f14815d;
                        break;
                    }
                    t5 = t5.f4000m;
                }
            }
        } else {
            q4 = this.f4025p;
        }
        t4.g(obj2, q5);
        int i5 = q5.f2683c;
        T.S s4 = this.f4013b;
        t4.n(i5, s4);
        boolean z = false;
        for (int b6 = t4.b(obj); b6 >= s4.n; b6--) {
            t4.f(b6, q5, true);
            boolean z4 = q5.f2687g.f2769a > 0;
            z |= z4;
            if (q5.c(q5.f2684d) != -1) {
                obj2 = q5.f2682b;
                obj2.getClass();
            }
            if (z && (!z4 || q5.f2684d != 0)) {
                break;
            }
        }
        return o(t4, obj2, j4, q4, this.f4013b, this.f4012a);
    }

    public final long q(Object obj) {
        for (int i4 = 0; i4 < this.f4026q.size(); i4++) {
            T t4 = (T) this.f4026q.get(i4);
            if (t4.f3989b.equals(obj)) {
                return t4.f3994g.f4002a.f14815d;
            }
        }
        return -1L;
    }

    public final int r(T.T t4) {
        T.T t5;
        T t6;
        T t7 = this.f4020i;
        if (t7 == null) {
            return 0;
        }
        int b4 = t4.b(t7.f3989b);
        while (true) {
            t5 = t4;
            b4 = t5.d(b4, this.f4012a, this.f4013b, this.f4018g, this.f4019h);
            while (true) {
                t7.getClass();
                t6 = t7.f4000m;
                if (t6 == null || t7.f3994g.f4009h) {
                    break;
                }
                t7 = t6;
            }
            if (b4 == -1 || t6 == null || t5.b(t6.f3989b) != b4) {
                break;
            }
            t7 = t6;
            t4 = t5;
        }
        int n = n(t7);
        t7.f3994g = h(t5, t7.f3994g);
        return n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b4, code lost:
    
        return n(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int s(T.T t4, long j4, long j5, long j6) {
        U u4;
        boolean z;
        T t5 = this.f4020i;
        T t6 = null;
        while (true) {
            int i4 = 0;
            if (t5 == null) {
                return 0;
            }
            U u5 = t5.f3994g;
            if (t6 == null) {
                u4 = h(t4, u5);
            } else {
                U c4 = c(t4, t6, j4);
                if (c4 == null || u5.f4003b != c4.f4003b || !u5.f4002a.equals(c4.f4002a)) {
                    break;
                }
                u4 = c4;
            }
            long j7 = u4.f4006e;
            long j8 = u5.f4004c;
            long j9 = u5.f4006e;
            t5.f3994g = u4.a(j8);
            if (j9 != j7) {
                t5.k();
                long j10 = j7 == -9223372036854775807L ? Long.MAX_VALUE : j7 + t5.f4001p;
                boolean z4 = t5 == this.f4021j && !t5.f3994g.f4008g && (j5 == Long.MIN_VALUE || j5 >= j10);
                boolean z5 = t5 == this.f4022k && (j6 == Long.MIN_VALUE || j6 >= j10);
                int n = n(t5);
                if (n != 0) {
                    return n;
                }
                if (j9 == -9223372036854775807L && u5.f4005d == Long.MIN_VALUE) {
                    long j11 = u4.f4005d;
                    if (j11 != -9223372036854775807L && j11 != Long.MIN_VALUE) {
                        z = true;
                        if (z4 && (j9 != -9223372036854775807L || z)) {
                            i4 = 1;
                        }
                        return !z5 ? i4 | 2 : i4;
                    }
                }
                z = false;
                if (z4) {
                    i4 = 1;
                }
                if (!z5) {
                }
            } else {
                t6 = t5;
                t5 = t5.f4000m;
            }
        }
    }
}
