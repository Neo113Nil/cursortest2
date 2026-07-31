package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata
/* loaded from: classes3.dex */
public final class MatchGroup {

    /* renamed from: a, reason: collision with root package name */
    private final String f41253a;

    /* renamed from: b, reason: collision with root package name */
    private final IntRange f41254b;

    public MatchGroup(String value, IntRange range) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f41253a = value;
        this.f41254b = range;
    }

    public final String a() {
        return this.f41253a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.areEqual(this.f41253a, matchGroup.f41253a) && Intrinsics.areEqual(this.f41254b, matchGroup.f41254b);
    }

    public int hashCode() {
        return (this.f41253a.hashCode() * 31) + this.f41254b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f41253a + ", range=" + this.f41254b + ')';
    }
}
