package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata
/* loaded from: classes.dex */
public final class MatchGroup {

    /* renamed from: a, reason: collision with root package name */
    public final String f6178a;

    /* renamed from: b, reason: collision with root package name */
    public final IntRange f6179b;

    public MatchGroup(String value, IntRange range) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f6178a = value;
        this.f6179b = range;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.a(this.f6178a, matchGroup.f6178a) && Intrinsics.a(this.f6179b, matchGroup.f6179b);
    }

    public final int hashCode() {
        return this.f6179b.hashCode() + (this.f6178a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f6178a + ", range=" + this.f6179b + ')';
    }
}
