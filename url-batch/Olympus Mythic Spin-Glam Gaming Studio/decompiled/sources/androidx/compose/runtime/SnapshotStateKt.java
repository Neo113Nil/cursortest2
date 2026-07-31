package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"androidx/compose/runtime/SnapshotStateKt__DerivedStateKt", "androidx/compose/runtime/SnapshotStateKt__ProduceStateKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotMutationPolicyKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotStateKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnapshotStateKt {
    public static final State collectAsState(Flow flow, Object obj, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(flow, obj, coroutineContext, composer, i, i2);
    }

    public static final State collectAsState(StateFlow stateFlow, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(stateFlow, coroutineContext, composer, i, i2);
    }

    public static final MutableVector derivedStateObservers() {
        return SnapshotStateKt__DerivedStateKt.derivedStateObservers();
    }

    public static final State derivedStateOf(Function0 function0) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(function0);
    }

    public static final SnapshotStateList mutableStateListOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf();
    }

    public static final SnapshotStateList mutableStateListOf(Object... objArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf(objArr);
    }

    public static final SnapshotStateMap mutableStateMapOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf();
    }

    public static final MutableState mutableStateOf(Object obj, SnapshotMutationPolicy snapshotMutationPolicy) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf(obj, snapshotMutationPolicy);
    }

    public static final SnapshotMutationPolicy neverEqualPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy();
    }

    public static final State produceState(Object obj, Object obj2, Object obj3, Function2 function2, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(obj, obj2, obj3, function2, composer, i);
    }

    public static final State produceState(Object obj, Object[] objArr, Function2 function2, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(obj, objArr, function2, composer, i);
    }

    public static final SnapshotMutationPolicy referentialEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy();
    }

    public static final State rememberUpdatedState(Object obj, Composer composer, int i) {
        return SnapshotStateKt__SnapshotStateKt.rememberUpdatedState(obj, composer, i);
    }

    public static final Flow snapshotFlow(Function0 function0) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(function0);
    }

    public static final SnapshotMutationPolicy structuralEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy();
    }
}
