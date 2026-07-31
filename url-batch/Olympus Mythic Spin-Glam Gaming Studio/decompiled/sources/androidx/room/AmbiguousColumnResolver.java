package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: AmbiguousColumnResolver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/room/AmbiguousColumnResolver;", "", "<init>", "()V", "Match", "ResultColumn", "Solution", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
/* loaded from: classes15.dex */
public final class AmbiguousColumnResolver {
    public static final AmbiguousColumnResolver INSTANCE = new AmbiguousColumnResolver();

    private AmbiguousColumnResolver() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AmbiguousColumnResolver.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$ResultColumn;", "", "", "component1", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "name", "Ljava/lang/String;", "getName", "index", "I", "getIndex", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final /* data */ class ResultColumn {
        private final int index;
        private final String name;

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResultColumn)) {
                return false;
            }
            ResultColumn resultColumn = (ResultColumn) other;
            return Intrinsics.areEqual(this.name, resultColumn.name) && this.index == resultColumn.index;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Integer.hashCode(this.index);
        }

        public String toString() {
            return "ResultColumn(name=" + this.name + ", index=" + this.index + ')';
        }

        public final int getIndex() {
            return this.index;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AmbiguousColumnResolver.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Match;", "", "resultRange", "Lkotlin/ranges/IntRange;", "resultIndices", "", "", "(Lkotlin/ranges/IntRange;Ljava/util/List;)V", "getResultIndices", "()Ljava/util/List;", "getResultRange", "()Lkotlin/ranges/IntRange;", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final class Match {
        private final List resultIndices;
        private final IntRange resultRange;

        public Match(IntRange resultRange, List resultIndices) {
            Intrinsics.checkNotNullParameter(resultRange, "resultRange");
            Intrinsics.checkNotNullParameter(resultIndices, "resultIndices");
            this.resultRange = resultRange;
            this.resultIndices = resultIndices;
        }

        public final IntRange getResultRange() {
            return this.resultRange;
        }

        public final List getResultIndices() {
            return this.resultIndices;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AmbiguousColumnResolver.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution;", "", "", "Landroidx/room/AmbiguousColumnResolver$Match;", "matches", "", "coverageOffset", "overlaps", "<init>", "(Ljava/util/List;II)V", "other", "compareTo", "(Landroidx/room/AmbiguousColumnResolver$Solution;)I", "Ljava/util/List;", "getMatches", "()Ljava/util/List;", "I", "getCoverageOffset", "()I", "getOverlaps", "Companion", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final class Solution implements Comparable<Solution> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Solution NO_SOLUTION = new Solution(CollectionsKt.emptyList(), Integer.MAX_VALUE, Integer.MAX_VALUE);
        private final int coverageOffset;
        private final List matches;
        private final int overlaps;

        public Solution(List matches, int i, int i2) {
            Intrinsics.checkNotNullParameter(matches, "matches");
            this.matches = matches;
            this.coverageOffset = i;
            this.overlaps = i2;
        }

        @Override // java.lang.Comparable
        public int compareTo(Solution other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int compare = Intrinsics.compare(this.overlaps, other.overlaps);
            return compare != 0 ? compare : Intrinsics.compare(this.coverageOffset, other.coverageOffset);
        }

        /* compiled from: AmbiguousColumnResolver.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution$Companion;", "", "<init>", "()V", "", "Landroidx/room/AmbiguousColumnResolver$Match;", "matches", "Landroidx/room/AmbiguousColumnResolver$Solution;", "build", "(Ljava/util/List;)Landroidx/room/AmbiguousColumnResolver$Solution;", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Solution build(List matches) {
                Intrinsics.checkNotNullParameter(matches, "matches");
                List<Match> list = matches;
                int i = 0;
                int i2 = 0;
                for (Match match : list) {
                    i2 += ((match.getResultRange().getLast() - match.getResultRange().getFirst()) + 1) - match.getResultIndices().size();
                }
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int first = ((Match) it.next()).getResultRange().getFirst();
                while (it.hasNext()) {
                    int first2 = ((Match) it.next()).getResultRange().getFirst();
                    if (first > first2) {
                        first = first2;
                    }
                }
                Iterator it2 = list.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int last = ((Match) it2.next()).getResultRange().getLast();
                while (it2.hasNext()) {
                    int last2 = ((Match) it2.next()).getResultRange().getLast();
                    if (last < last2) {
                        last = last2;
                    }
                }
                Iterable intRange = new IntRange(first, last);
                if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                    Iterator it3 = intRange.iterator();
                    int i3 = 0;
                    while (it3.hasNext()) {
                        int nextInt = ((IntIterator) it3).nextInt();
                        Iterator it4 = list.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (((Match) it4.next()).getResultRange().contains(nextInt)) {
                                i4++;
                            }
                            if (i4 > 1) {
                                i3++;
                                if (i3 < 0) {
                                    CollectionsKt.throwCountOverflow();
                                }
                            }
                        }
                    }
                    i = i3;
                }
                return new Solution(matches, i2, i);
            }
        }
    }
}
