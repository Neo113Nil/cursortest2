package f4;

import a.AbstractC0169a;

/* renamed from: f4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0440q implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f5684a;

    public /* synthetic */ C0440q(long j2) {
        this.f5684a = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.i.h(this.f5684a ^ Long.MIN_VALUE, ((C0440q) obj).f5684a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0440q) {
            return this.f5684a == ((C0440q) obj).f5684a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5684a);
    }

    public final String toString() {
        long j2 = this.f5684a;
        if (j2 >= 0) {
            AbstractC0169a.b(10);
            String l2 = Long.toString(j2, 10);
            kotlin.jvm.internal.i.d(l2, "toString(...)");
            return l2;
        }
        long j6 = 10;
        long j7 = ((j2 >>> 1) / j6) << 1;
        long j8 = j2 - (j7 * j6);
        if (j8 >= j6) {
            j8 -= j6;
            j7++;
        }
        AbstractC0169a.b(10);
        String l6 = Long.toString(j7, 10);
        kotlin.jvm.internal.i.d(l6, "toString(...)");
        AbstractC0169a.b(10);
        String l7 = Long.toString(j8, 10);
        kotlin.jvm.internal.i.d(l7, "toString(...)");
        return l6.concat(l7);
    }
}
