package com.yandex.div.core.state;

import O1.C1165z4;
import O1.Z;
import W1.h;
import W1.i;
import com.yandex.div.core.state.DivStatePath;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.ranges.g;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivStatePath {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final h fullPath$delegate;

    @NotNull
    private final List<String> path;

    @NotNull
    private final List<Pair<String, String>> states;

    @NotNull
    private final h statesString$delegate;
    private final long topLevelStateId;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int alphabeticalComparator$lambda$2(DivStatePath lhs, DivStatePath rhs) {
            String divId;
            String divId2;
            String stateId;
            String stateId2;
            if (lhs.getTopLevelStateId() != rhs.getTopLevelStateId()) {
                return (int) (lhs.getTopLevelStateId() - rhs.getTopLevelStateId());
            }
            Intrinsics.checkNotNullExpressionValue(lhs, "lhs");
            int size = lhs.states.size();
            Intrinsics.checkNotNullExpressionValue(rhs, "rhs");
            int min = Math.min(size, rhs.states.size());
            for (int i4 = 0; i4 < min; i4++) {
                Pair pair = (Pair) lhs.states.get(i4);
                Pair pair2 = (Pair) rhs.states.get(i4);
                divId = DivStatePathKt.getDivId(pair);
                divId2 = DivStatePathKt.getDivId(pair2);
                int compareTo = divId.compareTo(divId2);
                if (compareTo != 0) {
                    return compareTo;
                }
                stateId = DivStatePathKt.getStateId(pair);
                stateId2 = DivStatePathKt.getStateId(pair2);
                int compareTo2 = stateId.compareTo(stateId2);
                if (compareTo2 != 0) {
                    return compareTo2;
                }
            }
            return lhs.states.size() - rhs.states.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<String> extractStates(List<String> list, List<Pair<String, String>> list2, boolean z4) {
            Iterator<T> it = list2.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                i4 = DivStatePath.Companion.findState(list, (Pair) it.next(), i4);
            }
            if (z4) {
                i4++;
            }
            return list.subList(0, i4);
        }

        private final List<Pair<String, String>> findSharedPairs(DivStatePath divStatePath, DivStatePath divStatePath2) {
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            for (Object obj : divStatePath.states) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) CollectionsKt.getOrNull(divStatePath2.states, i4);
                if (pair2 == null || !Intrinsics.areEqual(pair, pair2)) {
                    break;
                }
                arrayList.add(pair);
                i4 = i5;
            }
            return arrayList;
        }

        private final int findState(List<String> list, Pair<String, String> pair, int i4) {
            String divId;
            String stateId;
            int size = list.size() - 1;
            while (i4 < size) {
                String str = list.get(i4);
                divId = DivStatePathKt.getDivId(pair);
                if (Intrinsics.areEqual(str, divId)) {
                    int i5 = i4 + 1;
                    String str2 = list.get(i5);
                    stateId = DivStatePathKt.getStateId(pair);
                    if (Intrinsics.areEqual(str2, stateId)) {
                        return i5;
                    }
                }
                i4++;
            }
            return list.size();
        }

        @NotNull
        public final Comparator<DivStatePath> alphabeticalComparator$div_release() {
            return new Comparator() { // from class: t1.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int alphabeticalComparator$lambda$2;
                    alphabeticalComparator$lambda$2 = DivStatePath.Companion.alphabeticalComparator$lambda$2((DivStatePath) obj, (DivStatePath) obj2);
                    return alphabeticalComparator$lambda$2;
                }
            };
        }

        @NotNull
        public final DivStatePath fromRootDiv$div_release(long j4, @NotNull Z div) {
            Intrinsics.checkNotNullParameter(div, "div");
            List mutableListOf = CollectionsKt.mutableListOf(String.valueOf(j4));
            if (div instanceof Z.o) {
                mutableListOf.add(DivPathUtils.getId$div_release$default(DivPathUtils.INSTANCE, ((Z.o) div).c(), null, 1, null));
            }
            return new DivStatePath(j4, CollectionsKt.emptyList(), mutableListOf);
        }

        @NotNull
        public final DivStatePath fromState(long j4) {
            return new DivStatePath(j4, new ArrayList(), null, 4, null);
        }

        @NotNull
        public final DivStatePath fromState$div_release(@NotNull C1165z4.c state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return fromRootDiv$div_release(state.f8722b, state.f8721a);
        }

        @Nullable
        public final DivStatePath lowestCommonAncestor$div_release(@NotNull DivStatePath somePath, @NotNull DivStatePath otherPath) {
            Intrinsics.checkNotNullParameter(somePath, "somePath");
            Intrinsics.checkNotNullParameter(otherPath, "otherPath");
            if (somePath.getTopLevelStateId() != otherPath.getTopLevelStateId()) {
                return null;
            }
            List<Pair<String, String>> findSharedPairs = findSharedPairs(somePath, otherPath);
            return new DivStatePath(somePath.getTopLevelStateId(), findSharedPairs, extractStates(somePath.getPath$div_release(), findSharedPairs, true));
        }

        @NotNull
        public final DivStatePath parse(@NotNull String path) {
            Intrinsics.checkNotNullParameter(path, "path");
            ArrayList arrayList = new ArrayList();
            List split$default = StringsKt.split$default(path, new String[]{"/"}, false, 0, 6, null);
            try {
                long parseLong = Long.parseLong((String) split$default.get(0));
                if (split$default.size() % 2 != 1) {
                    throw new PathFormatException("Must be even number of states in path: " + path, null, 2, null);
                }
                d o4 = g.o(g.p(1, split$default.size()), 2);
                int b4 = o4.b();
                int d4 = o4.d();
                int e4 = o4.e();
                if ((e4 > 0 && b4 <= d4) || (e4 < 0 && d4 <= b4)) {
                    while (true) {
                        arrayList.add(TuplesKt.to(split$default.get(b4), split$default.get(b4 + 1)));
                        if (b4 == d4) {
                            break;
                        }
                        b4 += e4;
                    }
                }
                return new DivStatePath(parseLong, arrayList, split$default);
            } catch (NumberFormatException e5) {
                throw new PathFormatException("Top level id must be number: " + path, e5);
            }
        }

        private Companion() {
        }
    }

    public DivStatePath(long j4, @NotNull List<Pair<String, String>> states, @NotNull List<String> path) {
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(path, "path");
        this.topLevelStateId = j4;
        this.states = states;
        this.path = path;
        this.fullPath$delegate = i.b(new DivStatePath$fullPath$2(this));
        this.statesString$delegate = i.b(new DivStatePath$statesString$2(this));
    }

    private final List<String> createFullPath(String str) {
        ArrayList arrayList = new ArrayList(this.path.size() + 1);
        arrayList.addAll(this.path);
        arrayList.add(str);
        return arrayList;
    }

    @NotNull
    public static final DivStatePath parse(@NotNull String str) {
        return Companion.parse(str);
    }

    @NotNull
    public final DivStatePath append(@NotNull String divId, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(divId, "divId");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        ArrayList arrayList = new ArrayList(this.states.size() + 1);
        arrayList.addAll(this.states);
        arrayList.add(TuplesKt.to(divId, stateId));
        return new DivStatePath(this.topLevelStateId, arrayList, createFullPath(stateId));
    }

    @NotNull
    public final DivStatePath appendDiv(@NotNull String divId) {
        Intrinsics.checkNotNullParameter(divId, "divId");
        return new DivStatePath(this.topLevelStateId, this.states, createFullPath(divId));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivStatePath)) {
            return false;
        }
        DivStatePath divStatePath = (DivStatePath) obj;
        return this.topLevelStateId == divStatePath.topLevelStateId && Intrinsics.areEqual(this.states, divStatePath.states) && Intrinsics.areEqual(this.path, divStatePath.path);
    }

    @NotNull
    public final String getFullPath$div_release() {
        return (String) this.fullPath$delegate.getValue();
    }

    @Nullable
    public final String getLastStateId() {
        String stateId;
        if (this.states.isEmpty()) {
            return null;
        }
        stateId = DivStatePathKt.getStateId((Pair) CollectionsKt.last((List) this.states));
        return stateId;
    }

    @NotNull
    public final List<String> getPath$div_release() {
        return this.path;
    }

    @Nullable
    public final String getPathToLastState() {
        String divId;
        if (this.states.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(new DivStatePath(this.topLevelStateId, this.states.subList(0, r4.size() - 1), null, 4, null).getStatesString$div_release());
        sb.append('/');
        divId = DivStatePathKt.getDivId((Pair) CollectionsKt.last((List) this.states));
        sb.append(divId);
        return sb.toString();
    }

    @NotNull
    public final List<Pair<String, String>> getStates() {
        return this.states;
    }

    @NotNull
    public final String getStatesString$div_release() {
        return (String) this.statesString$delegate.getValue();
    }

    public final long getTopLevelStateId() {
        return this.topLevelStateId;
    }

    public int hashCode() {
        return (((Long.hashCode(this.topLevelStateId) * 31) + this.states.hashCode()) * 31) + this.path.hashCode();
    }

    public final boolean isAncestorOf(@NotNull DivStatePath other) {
        String divId;
        String divId2;
        String stateId;
        String stateId2;
        Intrinsics.checkNotNullParameter(other, "other");
        if (this.topLevelStateId != other.topLevelStateId || this.states.size() >= other.states.size()) {
            return false;
        }
        int i4 = 0;
        for (Object obj : this.states) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair) obj;
            Pair<String, String> pair2 = other.states.get(i4);
            divId = DivStatePathKt.getDivId(pair);
            divId2 = DivStatePathKt.getDivId(pair2);
            if (Intrinsics.areEqual(divId, divId2)) {
                stateId = DivStatePathKt.getStateId(pair);
                stateId2 = DivStatePathKt.getStateId(pair2);
                if (Intrinsics.areEqual(stateId, stateId2)) {
                    i4 = i5;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean isRootPath() {
        return this.states.isEmpty();
    }

    @NotNull
    public final DivStatePath parentState() {
        if (isRootPath()) {
            return this;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) this.states);
        mutableList.remove(CollectionsKt.getLastIndex(mutableList));
        return new DivStatePath(this.topLevelStateId, mutableList, Companion.extractStates(this.path, this.states, false));
    }

    @NotNull
    public String toString() {
        return getFullPath$div_release();
    }

    public /* synthetic */ DivStatePath(long j4, List list, List list2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j4, (i4 & 2) != 0 ? CollectionsKt.emptyList() : list, (i4 & 4) != 0 ? CollectionsKt.listOf(String.valueOf(j4)) : list2);
    }
}
