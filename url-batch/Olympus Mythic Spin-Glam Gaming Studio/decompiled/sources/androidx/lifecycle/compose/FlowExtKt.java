package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: FlowExt.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001aI\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/Lifecycle$State;", "minActiveState", "Lkotlin/coroutines/CoroutineContext;", "context", "Landroidx/compose/runtime/State;", "collectAsStateWithLifecycle", "(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlinx/coroutines/flow/Flow;", "initialValue", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "lifecycle-runtime-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlowExtKt {
    public static final State collectAsStateWithLifecycle(StateFlow stateFlow, LifecycleOwner lifecycleOwner, Lifecycle.State state, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if ((i2 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i2 & 4) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(743249048, i, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:62)");
        }
        int i3 = i << 3;
        State collectAsStateWithLifecycle = collectAsStateWithLifecycle(stateFlow, stateFlow.getValue(), lifecycleOwner.getLifecycle(), state2, coroutineContext2, composer, (i & 14) | (i3 & 7168) | (i3 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return collectAsStateWithLifecycle;
    }

    public static final State collectAsStateWithLifecycle(Flow flow, Object obj, Lifecycle lifecycle, Lifecycle.State state, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        if ((i2 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i2 & 8) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1977777920, i, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:174)");
        }
        Object[] objArr = {flow, lifecycle, state2, coroutineContext2};
        boolean changedInstance = composer.changedInstance(lifecycle) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(state2.ordinal())) || (i & 3072) == 2048) | composer.changedInstance(coroutineContext2) | composer.changedInstance(flow);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new FlowExtKt$collectAsStateWithLifecycle$1$1(lifecycle, state2, coroutineContext2, flow, null);
            composer.updateRememberedValue(rememberedValue);
        }
        State produceState = SnapshotStateKt.produceState(obj, objArr, (Function2) rememberedValue, composer, (i >> 3) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return produceState;
    }
}
