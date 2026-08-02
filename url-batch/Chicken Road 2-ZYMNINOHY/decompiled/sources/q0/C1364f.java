package q0;

import T.C0085c;

/* renamed from: q0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1364f extends r {

    /* renamed from: c, reason: collision with root package name */
    public final long f14999c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15000d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15001e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15002f;

    public C1364f(T.T t4, long j4, long j5) {
        super(t4);
        if (j5 != Long.MIN_VALUE && j5 < j4) {
            throw new C1365g(2, j4, j5);
        }
        boolean z = false;
        if (t4.h() != 1) {
            throw new C1365g(0);
        }
        T.S m4 = t4.m(0, new T.S(), 0L);
        long max = Math.max(0L, j4);
        if (!m4.f2700k && max != 0 && !m4.f2697h) {
            throw new C1365g(1);
        }
        long max2 = j5 == Long.MIN_VALUE ? m4.f2702m : Math.max(0L, j5);
        long j6 = m4.f2702m;
        if (j6 != -9223372036854775807L) {
            max2 = max2 > j6 ? j6 : max2;
            if (max > max2) {
                max = max2;
            }
        }
        this.f14999c = max;
        this.f15000d = max2;
        this.f15001e = max2 != -9223372036854775807L ? max2 - max : -9223372036854775807L;
        if (m4.f2698i && (max2 == -9223372036854775807L || (j6 != -9223372036854775807L && max2 == j6))) {
            z = true;
        }
        this.f15002f = z;
    }

    @Override // q0.r, T.T
    public final T.Q f(int i4, T.Q q4, boolean z) {
        this.f15061b.f(0, q4, z);
        long j4 = q4.f2685e - this.f14999c;
        long j5 = this.f15001e;
        q4.h(q4.f2681a, q4.f2682b, 0, j5 != -9223372036854775807L ? j5 - j4 : -9223372036854775807L, j4, C0085c.f2767c, false);
        return q4;
    }

    @Override // q0.r, T.T
    public final T.S m(int i4, T.S s4, long j4) {
        this.f15061b.m(0, s4, 0L);
        long j5 = s4.f2703p;
        long j6 = this.f14999c;
        s4.f2703p = j5 + j6;
        s4.f2702m = this.f15001e;
        s4.f2698i = this.f15002f;
        long j7 = s4.f2701l;
        if (j7 != -9223372036854775807L) {
            long max = Math.max(j7, j6);
            s4.f2701l = max;
            long j8 = this.f15000d;
            if (j8 != -9223372036854775807L) {
                max = Math.min(max, j8);
            }
            s4.f2701l = max - j6;
        }
        long Z3 = W.J.Z(j6);
        long j9 = s4.f2694e;
        if (j9 != -9223372036854775807L) {
            s4.f2694e = j9 + Z3;
        }
        long j10 = s4.f2695f;
        if (j10 != -9223372036854775807L) {
            s4.f2695f = j10 + Z3;
        }
        return s4;
    }
}
