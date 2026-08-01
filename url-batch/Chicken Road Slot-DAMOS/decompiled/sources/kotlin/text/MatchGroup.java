package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\bF\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\f\u001a\u00020\u0003HÆ\u0083\u0004J\n\u0010\r\u001a\u00020\u0005HÆ\u0083\u0004J\u001e\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0081\u0004J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u00020\u0003X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u00020\u0005X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lkotlin/text/MatchGroup;", "", "value", "", "range", "Lkotlin/ranges/IntRange;", "<init>", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "getValue", "()Ljava/lang/String;", "getRange", "()Lkotlin/ranges/IntRange;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-stdlib"}, k = 1, mv = {2, a4.j.LONG_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MatchGroup {

    /* renamed from: a, reason: collision with root package name */
    public final String f5604a;

    /* renamed from: b, reason: collision with root package name */
    public final IntRange f5605b;

    public MatchGroup(String str, IntRange intRange) {
        str.getClass();
        this.f5604a = str;
        this.f5605b = intRange;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) other;
        return Intrinsics.a(this.f5604a, matchGroup.f5604a) && this.f5605b.equals(matchGroup.f5605b);
    }

    public final int hashCode() {
        return this.f5605b.hashCode() + (this.f5604a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f5604a + ", range=" + this.f5605b + ')';
    }
}
