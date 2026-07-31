package L1;

import e2.AbstractC0381e;

/* loaded from: classes.dex */
public final class u implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final long f2724d;

    public /* synthetic */ u(long j3) {
        this.f2724d = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j3 = ((u) obj).f2724d;
        long j4 = this.f2724d ^ Long.MIN_VALUE;
        long j5 = j3 ^ Long.MIN_VALUE;
        if (j4 < j5) {
            return -1;
        }
        return j4 == j5 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f2724d == ((u) obj).f2724d;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2724d);
    }

    public final String toString() {
        long j3 = this.f2724d;
        if (j3 >= 0) {
            AbstractC0381e.m(10);
            String l3 = Long.toString(j3, 10);
            Z1.i.e(l3, "toString(...)");
            return l3;
        }
        long j4 = 10;
        long j5 = ((j3 >>> 1) / j4) << 1;
        long j6 = j3 - (j5 * j4);
        if (j6 >= j4) {
            j6 -= j4;
            j5++;
        }
        AbstractC0381e.m(10);
        String l4 = Long.toString(j5, 10);
        Z1.i.e(l4, "toString(...)");
        AbstractC0381e.m(10);
        String l5 = Long.toString(j6, 10);
        Z1.i.e(l5, "toString(...)");
        return l4.concat(l5);
    }
}
