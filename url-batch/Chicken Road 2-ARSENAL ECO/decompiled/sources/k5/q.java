package k5;

import m1.AbstractC0521b;

/* loaded from: classes.dex */
public final class q implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public final long f5214f;

    public /* synthetic */ q(long j4) {
        this.f5214f = j4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.i.h(this.f5214f ^ Long.MIN_VALUE, ((q) obj).f5214f ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f5214f == ((q) obj).f5214f;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5214f);
    }

    public final String toString() {
        long j4 = this.f5214f;
        if (j4 >= 0) {
            AbstractC0521b.g(10);
            String l7 = Long.toString(j4, 10);
            kotlin.jvm.internal.i.d(l7, "toString(...)");
            return l7;
        }
        long j7 = 10;
        long j8 = ((j4 >>> 1) / j7) << 1;
        long j9 = j4 - (j8 * j7);
        if (j9 >= j7) {
            j9 -= j7;
            j8++;
        }
        AbstractC0521b.g(10);
        String l8 = Long.toString(j8, 10);
        kotlin.jvm.internal.i.d(l8, "toString(...)");
        AbstractC0521b.g(10);
        String l9 = Long.toString(j9, 10);
        kotlin.jvm.internal.i.d(l9, "toString(...)");
        return l8.concat(l9);
    }
}
