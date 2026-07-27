package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata
/* loaded from: classes.dex */
public final class MatchGroup {

    /* renamed from: a, reason: collision with root package name */
    public final String f7512a;

    /* renamed from: b, reason: collision with root package name */
    public final IntRange f7513b;

    public MatchGroup(String value, IntRange range) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f7512a = value;
        this.f7513b = range;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.a(this.f7512a, matchGroup.f7512a) && Intrinsics.a(this.f7513b, matchGroup.f7513b);
    }

    public final int hashCode() {
        return this.f7513b.hashCode() + (this.f7512a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f7512a + ", range=" + this.f7513b + ')';
    }
}
