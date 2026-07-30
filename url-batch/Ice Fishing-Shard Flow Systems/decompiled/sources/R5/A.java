package R5;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* loaded from: classes.dex */
public final class A implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final z f2400e = new z(null);

    /* renamed from: d, reason: collision with root package name */
    public final long f2401d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.e(this.f2401d ^ Long.MIN_VALUE, ((A) obj).f2401d ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            return this.f2401d == ((A) obj).f2401d;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2401d);
    }

    public final String toString() {
        long j = this.f2401d;
        if (j >= 0) {
            String l7 = Long.toString(j, CharsKt.checkRadix(10));
            Intrinsics.checkNotNullExpressionValue(l7, "toString(...)");
            return l7;
        }
        long j7 = 10;
        long j8 = ((j >>> 1) / j7) << 1;
        long j9 = j - (j8 * j7);
        if (j9 >= j7) {
            j9 -= j7;
            j8++;
        }
        StringBuilder sb = new StringBuilder();
        String l8 = Long.toString(j8, CharsKt.checkRadix(10));
        Intrinsics.checkNotNullExpressionValue(l8, "toString(...)");
        sb.append(l8);
        String l9 = Long.toString(j9, CharsKt.checkRadix(10));
        Intrinsics.checkNotNullExpressionValue(l9, "toString(...)");
        sb.append(l9);
        return sb.toString();
    }
}
