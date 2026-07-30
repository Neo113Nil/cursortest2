package d6;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public final long f2634f;

    public /* synthetic */ u(long j8) {
        this.f2634f = j8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j8 = ((u) obj).f2634f;
        long j9 = this.f2634f ^ Long.MIN_VALUE;
        long j10 = j8 ^ Long.MIN_VALUE;
        if (j9 < j10) {
            return -1;
        }
        return j9 == j10 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f2634f == ((u) obj).f2634f;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2634f);
    }

    public final String toString() {
        long j8 = this.f2634f;
        if (j8 >= 0) {
            v1.g.b(10);
            String l8 = Long.toString(j8, 10);
            r6.k.e(l8, "toString(...)");
            return l8;
        }
        long j9 = 10;
        long j10 = ((j8 >>> 1) / j9) << 1;
        long j11 = j8 - (j10 * j9);
        if (j11 >= j9) {
            j11 -= j9;
            j10++;
        }
        v1.g.b(10);
        String l9 = Long.toString(j10, 10);
        r6.k.e(l9, "toString(...)");
        v1.g.b(10);
        String l10 = Long.toString(j11, 10);
        r6.k.e(l10, "toString(...)");
        return l9.concat(l10);
    }
}
