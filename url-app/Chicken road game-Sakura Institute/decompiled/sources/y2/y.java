package y2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@Metadata
/* loaded from: classes.dex */
public final class y implements Comparable<y> {

    /* renamed from: e, reason: collision with root package name */
    public static final a f11688e = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public final long f11689d;

    @Metadata
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(y yVar) {
        long j4 = yVar.f11689d;
        long j5 = this.f11689d ^ Long.MIN_VALUE;
        long j6 = j4 ^ Long.MIN_VALUE;
        if (j5 < j6) {
            return -1;
        }
        return j5 == j6 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return this.f11689d == ((y) obj).f11689d;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11689d);
    }

    public final String toString() {
        long j4 = this.f11689d;
        if (j4 >= 0) {
            String l4 = Long.toString(j4, CharsKt.checkRadix(10));
            Intrinsics.checkNotNullExpressionValue(l4, "toString(...)");
            return l4;
        }
        long j5 = 10;
        long j6 = ((j4 >>> 1) / j5) << 1;
        long j7 = j4 - (j6 * j5);
        if (j7 >= j5) {
            j7 -= j5;
            j6++;
        }
        StringBuilder sb = new StringBuilder();
        String l5 = Long.toString(j6, CharsKt.checkRadix(10));
        Intrinsics.checkNotNullExpressionValue(l5, "toString(...)");
        sb.append(l5);
        String l6 = Long.toString(j7, CharsKt.checkRadix(10));
        Intrinsics.checkNotNullExpressionValue(l6, "toString(...)");
        sb.append(l6);
        return sb.toString();
    }
}
