package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
/* loaded from: classes.dex */
public final class IntRange extends kotlin.ranges.a {

    /* renamed from: k, reason: collision with root package name */
    public static final a f7502k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final IntRange f7503l = new IntRange(1, 0, 1);

    @Metadata
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // kotlin.ranges.a
    public final boolean equals(Object obj) {
        if (obj instanceof IntRange) {
            if (!isEmpty() || !((IntRange) obj).isEmpty()) {
                IntRange intRange = (IntRange) obj;
                if (this.f7505d == intRange.f7505d) {
                    if (this.f7506e == intRange.f7506e) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f7505d * 31) + this.f7506e;
    }

    @Override // kotlin.ranges.a
    public final boolean isEmpty() {
        return this.f7505d > this.f7506e;
    }

    @Override // kotlin.ranges.a
    public final String toString() {
        return this.f7505d + ".." + this.f7506e;
    }
}
