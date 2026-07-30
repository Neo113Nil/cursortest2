package q7;

/* renamed from: q7.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4948q implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final long f40178n;

    public /* synthetic */ C4948q(long j9) {
        this.f40178n = j9;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.h.g(this.f40178n ^ Long.MIN_VALUE, ((C4948q) obj).f40178n ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4948q) {
            return this.f40178n == ((C4948q) obj).f40178n;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40178n);
    }

    public final String toString() {
        long j9 = this.f40178n;
        if (j9 >= 0) {
            p8.g.e(10);
            String l9 = Long.toString(j9, 10);
            kotlin.jvm.internal.h.d(l9, "toString(...)");
            return l9;
        }
        long j10 = 10;
        long j11 = ((j9 >>> 1) / j10) << 1;
        long j12 = j9 - (j11 * j10);
        if (j12 >= j10) {
            j12 -= j10;
            j11++;
        }
        p8.g.e(10);
        String l10 = Long.toString(j11, 10);
        kotlin.jvm.internal.h.d(l10, "toString(...)");
        p8.g.e(10);
        String l11 = Long.toString(j12, 10);
        kotlin.jvm.internal.h.d(l11, "toString(...)");
        return l10.concat(l11);
    }
}
