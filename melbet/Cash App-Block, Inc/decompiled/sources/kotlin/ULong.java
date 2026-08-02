package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ULong implements Comparable {
    public static final Companion Companion = new Companion(null);
    public final long data;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.compare(this.data ^ Long.MIN_VALUE, ((ULong) obj).data ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ULong) {
            return this.data == ((ULong) obj).data;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.data);
    }

    public final String toString() {
        return UnsignedKt.ulongToString(10, this.data);
    }
}
