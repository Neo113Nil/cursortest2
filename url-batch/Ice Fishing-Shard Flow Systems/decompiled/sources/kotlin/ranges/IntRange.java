package kotlin.ranges;

import j6.C0586c;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public final class IntRange extends a {

    /* renamed from: m, reason: collision with root package name */
    public static final C0586c f6170m = new C0586c(null);

    /* renamed from: n, reason: collision with root package name */
    public static final IntRange f6171n = new IntRange(1, 0, 1);

    @Override // kotlin.ranges.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) obj).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) obj;
        return this.f6173d == intRange.f6173d && this.f6174e == intRange.f6174e;
    }

    @Override // kotlin.ranges.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f6173d * 31) + this.f6174e;
    }

    @Override // kotlin.ranges.a
    public final boolean isEmpty() {
        return this.f6173d > this.f6174e;
    }

    @Override // kotlin.ranges.a
    public final String toString() {
        return this.f6173d + ".." + this.f6174e;
    }
}
