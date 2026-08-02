package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class UByte implements Comparable {
    public static final Companion Companion = new Companion(null);
    public final byte data;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(this.data & 255, ((UByte) obj).data & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UByte) {
            return this.data == ((UByte) obj).data;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.data);
    }

    public final String toString() {
        return String.valueOf(this.data & 255);
    }
}
