package androidx.compose.runtime;

import androidx.compose.runtime.tooling.ObservableComposition;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: Composition.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\"&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0018\u001a\u00020\u0013*\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Composition;", "Composition", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;)Landroidx/compose/runtime/Composition;", "", "PendingApplyNoModifications", "Ljava/lang/Object;", "Landroidx/compose/runtime/CompositionServiceKey;", "Landroidx/compose/runtime/tooling/ObservableComposition;", "ObservableCompositionServiceKey", "Landroidx/compose/runtime/CompositionServiceKey;", "getObservableCompositionServiceKey", "()Landroidx/compose/runtime/CompositionServiceKey;", "getObservableCompositionServiceKey$annotations", "()V", "Landroidx/compose/runtime/ControlledComposition;", "Lkotlin/coroutines/CoroutineContext;", "getRecomposeCoroutineContext", "(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/coroutines/CoroutineContext;", "getRecomposeCoroutineContext$annotations", "(Landroidx/compose/runtime/ControlledComposition;)V", "recomposeCoroutineContext", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CompositionKt {
    private static final Object PendingApplyNoModifications = new Object();
    private static final CompositionServiceKey ObservableCompositionServiceKey = new CompositionServiceKey<ObservableComposition>() { // from class: androidx.compose.runtime.CompositionKt$ObservableCompositionServiceKey$1
    };

    public static final CoroutineContext getRecomposeCoroutineContext(ControlledComposition controlledComposition) {
        CoroutineContext recomposeContext;
        CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
        return (compositionImpl == null || (recomposeContext = compositionImpl.getRecomposeContext()) == null) ? EmptyCoroutineContext.INSTANCE : recomposeContext;
    }

    public static final Composition Composition(Applier applier, CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }
}
