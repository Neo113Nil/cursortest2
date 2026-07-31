package R1;

/* loaded from: classes.dex */
public final class t implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final long f4166d;

    public /* synthetic */ t(long j3) {
        this.f4166d = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j3 = ((t) obj).f4166d;
        long j4 = this.f4166d ^ Long.MIN_VALUE;
        long j5 = j3 ^ Long.MIN_VALUE;
        if (j4 < j5) {
            return -1;
        }
        return j4 == j5 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f4166d == ((t) obj).f4166d;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4166d);
    }

    public final String toString() {
        long j3 = this.f4166d;
        if (j3 >= 0) {
            n.r.i(10);
            String l3 = Long.toString(j3, 10);
            f2.j.e(l3, "toString(...)");
            return l3;
        }
        long j4 = 10;
        long j5 = ((j3 >>> 1) / j4) << 1;
        long j6 = j3 - (j5 * j4);
        if (j6 >= j4) {
            j6 -= j4;
            j5++;
        }
        n.r.i(10);
        String l4 = Long.toString(j5, 10);
        f2.j.e(l4, "toString(...)");
        n.r.i(10);
        String l5 = Long.toString(j6, 10);
        f2.j.e(l5, "toString(...)");
        return l4.concat(l5);
    }
}
