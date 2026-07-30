package kotlin.ranges;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class IntRange extends c {
    public static final a q = new a(null);
    public static final IntRange r = new IntRange(1, 0, 1);

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // kotlin.ranges.c
    public final boolean equals(Object obj) {
        if (!(obj instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) obj).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) obj;
        return this.m == intRange.m && this.n == intRange.n;
    }

    @Override // kotlin.ranges.c
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.m * 31) + this.n;
    }

    @Override // kotlin.ranges.c
    public final boolean isEmpty() {
        return this.m > this.n;
    }

    @Override // kotlin.ranges.c
    public final String toString() {
        return this.m + ".." + this.n;
    }
}
