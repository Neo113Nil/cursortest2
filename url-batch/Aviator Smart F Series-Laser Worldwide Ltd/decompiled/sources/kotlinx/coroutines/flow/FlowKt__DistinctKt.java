package kotlinx.coroutines.flow;

import kotlin.jvm.internal.x;

/* loaded from: classes5.dex */
abstract /* synthetic */ class FlowKt__DistinctKt {
    private static final f6.l defaultKeySelector = new f6.l() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultKeySelector$1
        @Override // f6.l
        public final Object invoke(Object obj) {
            return obj;
        }
    };
    private static final f6.p defaultAreEquivalent = new f6.p() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultAreEquivalent$1
        @Override // f6.p
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(kotlin.jvm.internal.s.areEqual(obj, obj2));
        }
    };

    public static final <T> e distinctUntilChanged(e eVar) {
        return eVar instanceof t ? eVar : distinctUntilChangedBy$FlowKt__DistinctKt(eVar, defaultKeySelector, defaultAreEquivalent);
    }

    public static final <T, K> e distinctUntilChangedBy(e eVar, f6.l lVar) {
        return distinctUntilChangedBy$FlowKt__DistinctKt(eVar, lVar, defaultAreEquivalent);
    }

    private static final <T> e distinctUntilChangedBy$FlowKt__DistinctKt(e eVar, f6.l lVar, f6.p pVar) {
        if (eVar instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) eVar;
            if (distinctFlowImpl.keySelector == lVar && distinctFlowImpl.areEquivalent == pVar) {
                return eVar;
            }
        }
        return new DistinctFlowImpl(eVar, lVar, pVar);
    }

    public static final <T> e distinctUntilChanged(e eVar, f6.p pVar) {
        f6.l lVar = defaultKeySelector;
        kotlin.jvm.internal.s.checkNotNull(pVar, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return distinctUntilChangedBy$FlowKt__DistinctKt(eVar, lVar, (f6.p) x.beforeCheckcastToFunctionOfArity(pVar, 2));
    }
}
