package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/MatchGroup;", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MatchGroup {
    public final IntRange range;
    public final String value;

    public MatchGroup(String str, IntRange intRange) {
        str.getClass();
        this.value = str;
        this.range = intRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.areEqual(this.value, matchGroup.value) && this.range.equals(matchGroup.range);
    }

    public final int hashCode() {
        return this.range.hashCode() + (this.value.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.value + ", range=" + this.range + ')';
    }
}
