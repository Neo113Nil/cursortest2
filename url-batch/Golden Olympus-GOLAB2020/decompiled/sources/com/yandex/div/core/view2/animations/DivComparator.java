package com.yandex.div.core.view2.animations;

import O1.C1039s4;
import O1.C1165z4;
import O1.InterfaceC0752c3;
import O1.R3;
import O1.Z;
import W1.m;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivComparator {

    @NotNull
    public static final DivComparator INSTANCE = new DivComparator();

    private DivComparator() {
    }

    public static /* synthetic */ boolean areChildrenReplaceable$default(DivComparator divComparator, List list, List list2, DivComparatorReporter divComparatorReporter, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            divComparatorReporter = null;
        }
        return divComparator.areChildrenReplaceable(list, list2, divComparatorReporter);
    }

    public static /* synthetic */ boolean areDivsReplaceable$default(DivComparator divComparator, Z z4, Z z5, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2, DivComparatorReporter divComparatorReporter, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            divComparatorReporter = null;
        }
        return divComparator.areDivsReplaceable(z4, z5, expressionResolver, expressionResolver2, divComparatorReporter);
    }

    public static /* synthetic */ boolean areValuesReplaceable$default(DivComparator divComparator, InterfaceC0752c3 interfaceC0752c3, InterfaceC0752c3 interfaceC0752c32, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2, DivComparatorReporter divComparatorReporter, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            divComparatorReporter = null;
        }
        return divComparator.areValuesReplaceable(interfaceC0752c3, interfaceC0752c32, expressionResolver, expressionResolver2, divComparatorReporter);
    }

    private final List<DivItemBuilderResult> extractChildren(Z z4, ExpressionResolver expressionResolver) {
        if (z4 instanceof Z.c) {
            return DivCollectionExtensionsKt.buildItems(((Z.c) z4).c(), (DivViewFacade) null, expressionResolver);
        }
        if (z4 instanceof Z.g) {
            return DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((Z.g) z4).c(), expressionResolver);
        }
        if (z4 instanceof Z.h) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.f) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.r) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.m) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.e) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.k) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.q) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.o) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.d) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.j) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.l) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.i) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.n) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.s) {
            return CollectionsKt.emptyList();
        }
        if (z4 instanceof Z.p) {
            return CollectionsKt.emptyList();
        }
        throw new m();
    }

    private final boolean hasTransitions(InterfaceC0752c3 interfaceC0752c3) {
        return (interfaceC0752c3.t() == null && interfaceC0752c3.y() == null && interfaceC0752c3.z() == null) ? false : true;
    }

    private final boolean isOverlap(R3 r32, ExpressionResolver expressionResolver) {
        return r32.f4516G.evaluate(expressionResolver) == R3.d.OVERLAP;
    }

    public final boolean areChildrenReplaceable(@NotNull List<DivItemBuilderResult> oldChildren, @NotNull List<DivItemBuilderResult> newChildren, @Nullable DivComparatorReporter divComparatorReporter) {
        Intrinsics.checkNotNullParameter(oldChildren, "oldChildren");
        Intrinsics.checkNotNullParameter(newChildren, "newChildren");
        if (oldChildren.size() != newChildren.size()) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonDifferentChildCount();
            }
            return false;
        }
        List<Pair> zip = CollectionsKt.zip(oldChildren, newChildren);
        if ((zip instanceof Collection) && zip.isEmpty()) {
            return true;
        }
        for (Pair pair : zip) {
            DivComparatorReporter divComparatorReporter2 = divComparatorReporter;
            if (!INSTANCE.areDivsReplaceable(((DivItemBuilderResult) pair.getFirst()).getDiv(), ((DivItemBuilderResult) pair.getSecond()).getDiv(), ((DivItemBuilderResult) pair.getFirst()).getExpressionResolver(), ((DivItemBuilderResult) pair.getSecond()).getExpressionResolver(), divComparatorReporter2)) {
                return false;
            }
            divComparatorReporter = divComparatorReporter2;
        }
        return true;
    }

    public final boolean areDivsReplaceable(@Nullable Z z4, @Nullable Z z5, @NotNull ExpressionResolver oldResolver, @NotNull ExpressionResolver newResolver, @Nullable DivComparatorReporter divComparatorReporter) {
        Intrinsics.checkNotNullParameter(oldResolver, "oldResolver");
        Intrinsics.checkNotNullParameter(newResolver, "newResolver");
        if (!Intrinsics.areEqual(z4 != null ? z4.getClass() : null, z5 != null ? z5.getClass() : null)) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonDifferentClasses();
            }
            return false;
        }
        if (z4 == null || z5 == null || z4 == z5) {
            return true;
        }
        return areValuesReplaceable(z4.b(), z5.b(), oldResolver, newResolver, divComparatorReporter) && areChildrenReplaceable(extractChildren(z4, oldResolver), extractChildren(z5, newResolver), divComparatorReporter);
    }

    public final boolean areValuesReplaceable(@NotNull InterfaceC0752c3 old, @NotNull InterfaceC0752c3 interfaceC0752c3, @NotNull ExpressionResolver oldResolver, @NotNull ExpressionResolver newResolver, @Nullable DivComparatorReporter divComparatorReporter) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(interfaceC0752c3, "new");
        Intrinsics.checkNotNullParameter(oldResolver, "oldResolver");
        Intrinsics.checkNotNullParameter(newResolver, "newResolver");
        if (old.getId() != null && interfaceC0752c3.getId() != null && !Intrinsics.areEqual(old.getId(), interfaceC0752c3.getId()) && (hasTransitions(old) || hasTransitions(interfaceC0752c3))) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonDifferentIdsWithTransition();
            }
            return false;
        }
        if ((old instanceof C1039s4) && (interfaceC0752c3 instanceof C1039s4) && !Intrinsics.areEqual(((C1039s4) old).f7834j, ((C1039s4) interfaceC0752c3).f7834j)) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonDifferentCustomTypes();
            }
            return false;
        }
        if (!(old instanceof R3) || !(interfaceC0752c3 instanceof R3)) {
            return true;
        }
        R3 r32 = (R3) old;
        R3 r33 = (R3) interfaceC0752c3;
        if (isOverlap(r32, oldResolver) != isOverlap(r33, newResolver)) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonDifferentOverlap();
            }
            return false;
        }
        if (BaseDivViewExtensionsKt.isWrapContainer(r32, oldResolver) == BaseDivViewExtensionsKt.isWrapContainer(r33, newResolver)) {
            return true;
        }
        if (divComparatorReporter != null) {
            divComparatorReporter.onComparisonDifferentWrap();
        }
        return false;
    }

    public final boolean isDivDataReplaceable(@Nullable C1165z4 c1165z4, @NotNull C1165z4 c1165z42, long j4, @NotNull ExpressionResolver oldResolver, @NotNull ExpressionResolver newResolver, @Nullable DivComparatorReporter divComparatorReporter) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(c1165z42, "new");
        Intrinsics.checkNotNullParameter(oldResolver, "oldResolver");
        Intrinsics.checkNotNullParameter(newResolver, "newResolver");
        if (c1165z4 == null) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonNoOldData();
            }
            return false;
        }
        Iterator it = c1165z4.f8711c.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((C1165z4.c) obj2).f8722b == j4) {
                break;
            }
        }
        C1165z4.c cVar = (C1165z4.c) obj2;
        Iterator it2 = c1165z42.f8711c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((C1165z4.c) next).f8722b == j4) {
                obj = next;
                break;
            }
        }
        C1165z4.c cVar2 = (C1165z4.c) obj;
        if (cVar == null || cVar2 == null) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonNoState();
            }
            return false;
        }
        boolean areDivsReplaceable = areDivsReplaceable(cVar.f8721a, cVar2.f8721a, oldResolver, newResolver, divComparatorReporter);
        if (areDivsReplaceable && divComparatorReporter != null) {
            divComparatorReporter.onComparisonSuccess();
        }
        return areDivsReplaceable;
    }
}
