package a0;

import a.AbstractC0124a;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: c, reason: collision with root package name */
    public static final p0 f4228c;

    /* renamed from: d, reason: collision with root package name */
    public static final p0 f4229d;

    /* renamed from: a, reason: collision with root package name */
    public final long f4230a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4231b;

    static {
        p0 p0Var = new p0(0L, 0L);
        new p0(Long.MAX_VALUE, Long.MAX_VALUE);
        f4228c = new p0(Long.MAX_VALUE, 0L);
        new p0(0L, Long.MAX_VALUE);
        f4229d = p0Var;
    }

    public p0(long j4, long j5) {
        AbstractC0124a.h(j4 >= 0);
        AbstractC0124a.h(j5 >= 0);
        this.f4230a = j4;
        this.f4231b = j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j4, long j5, long j6) {
        long j7 = this.f4230a;
        long j8 = this.f4231b;
        if (j7 == 0 && j8 == 0) {
            return j4;
        }
        String str = W.J.f3263a;
        long j9 = j4 - j7;
        long j10 = (((j7 ^ j4) > 0L ? 1 : ((j7 ^ j4) == 0L ? 0 : -1)) >= 0) | (((j4 ^ j9) > 0L ? 1 : ((j4 ^ j9) == 0L ? 0 : -1)) >= 0) ? j9 : ((j9 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j10 == Long.MIN_VALUE && j9 != Long.MIN_VALUE) || (j10 == Long.MAX_VALUE && j9 != Long.MAX_VALUE)) {
            j10 = Long.MIN_VALUE;
        }
        long a3 = W.J.a(j4, j8);
        boolean z = j10 <= j5 && j5 <= a3;
        boolean z4 = j10 <= j6 && j6 <= a3;
        if (!z || !z4) {
            if (!z) {
                return z4 ? j6 : j10;
            }
            return j5;
        }
        if (Math.abs(j5 - j4) <= Math.abs(j6 - j4)) {
            return j5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p0.class == obj.getClass()) {
            p0 p0Var = (p0) obj;
            if (this.f4230a == p0Var.f4230a && this.f4231b == p0Var.f4231b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4230a) * 31) + ((int) this.f4231b);
    }
}
