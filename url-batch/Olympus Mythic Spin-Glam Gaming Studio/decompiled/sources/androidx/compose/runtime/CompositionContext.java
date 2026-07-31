package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.B5;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: CompositionContext.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH ¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH ¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u001a\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0010¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\"\u0010\u0013J\u000f\u0010'\u001a\u00020$H\u0010¢\u0006\u0004\b%\u0010&J\u000f\u0010)\u001a\u00020\u0007H\u0010¢\u0006\u0004\b(\u0010\u0003J\u000f\u0010+\u001a\u00020\u0007H\u0010¢\u0006\u0004\b*\u0010\u0003J\u0017\u00100\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,H ¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,H ¢\u0006\u0004\b1\u0010/J+\u00109\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,2\u0006\u00104\u001a\u0002032\n\u00106\u001a\u0006\u0012\u0002\b\u000305H ¢\u0006\u0004\b7\u00108J\u0019\u0010<\u001a\u0004\u0018\u0001032\u0006\u0010-\u001a\u00020,H\u0010¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b=\u0010\u0013R\u0018\u0010C\u001a\u00060?j\u0002`@8 X \u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8 X \u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020D8 X \u0004¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0014\u0010K\u001a\u00020D8 X \u0004¢\u0006\u0006\u001a\u0004\bJ\u0010FR\u0016\u0010O\u001a\u0004\u0018\u00010L8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020P8 X \u0004¢\u0006\u0006\u001a\u0004\bT\u0010RR\u0016\u0010\u0005\u001a\u0004\u0018\u00010V8 X \u0004¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006Y"}, d2 = {"Landroidx/compose/runtime/CompositionContext;", "", "<init>", "()V", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composeInitial", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "reportPausedScope$runtime", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "reportPausedScope", "invalidate$runtime", "(Landroidx/compose/runtime/ControlledComposition;)V", "invalidate", "", "Landroidx/compose/runtime/tooling/CompositionData;", B5.R, "recordInspectionTable$runtime", "(Ljava/util/Set;)V", "recordInspectionTable", "Landroidx/compose/runtime/Composer;", "composer", "registerComposer$runtime", "(Landroidx/compose/runtime/Composer;)V", "registerComposer", "unregisterComposer$runtime", "unregisterComposer", "unregisterComposition$runtime", "unregisterComposition", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope$runtime", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope", "startComposing$runtime", "startComposing", "doneComposing$runtime", "doneComposing", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "insertMovableContent$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "data", "Landroidx/compose/runtime/Applier;", "applier", "movableContentStateReleased$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/Applier;)V", "movableContentStateReleased", "movableContentStateResolve$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "reportRemovedComposition$runtime", "reportRemovedComposition", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "getCompositeKeyHashCode$runtime", "()J", "compositeKeyHashCode", "", "getCollectingParameterInformation$runtime", "()Z", "collectingParameterInformation", "getCollectingSourceInformation$runtime", "collectingSourceInformation", "getCollectingCallByInformation$runtime", "collectingCallByInformation", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime", "()Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "getRecomposeCoroutineContext$runtime", "recomposeCoroutineContext", "Landroidx/compose/runtime/Composition;", "getComposition$runtime", "()Landroidx/compose/runtime/Composition;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CompositionContext {
    public abstract void composeInitial$runtime(ControlledComposition composition, Function2 content);

    public abstract void deletedMovableContent$runtime(MovableContentStateReference reference);

    public void doneComposing$runtime() {
    }

    public abstract boolean getCollectingCallByInformation$runtime();

    public abstract boolean getCollectingParameterInformation$runtime();

    public abstract boolean getCollectingSourceInformation$runtime();

    public abstract long getCompositeKeyHashCode$runtime();

    public abstract Composition getComposition$runtime();

    public abstract CoroutineContext getEffectCoroutineContext();

    public CompositionObserverHolder getObserverHolder$runtime() {
        return null;
    }

    public abstract CoroutineContext getRecomposeCoroutineContext$runtime();

    public abstract void insertMovableContent$runtime(MovableContentStateReference reference);

    public abstract void invalidate$runtime(ControlledComposition composition);

    public abstract void movableContentStateReleased$runtime(MovableContentStateReference reference, MovableContentState data, Applier applier);

    public MovableContentState movableContentStateResolve$runtime(MovableContentStateReference reference) {
        return null;
    }

    public void recordInspectionTable$runtime(Set table) {
    }

    public void registerComposer$runtime(Composer composer) {
    }

    public abstract void reportPausedScope$runtime(RecomposeScopeImpl scope);

    public abstract void reportRemovedComposition$runtime(ControlledComposition composition);

    public void startComposing$runtime() {
    }

    public void unregisterComposer$runtime(Composer composer) {
    }

    public abstract void unregisterComposition$runtime(ControlledComposition composition);

    public PersistentCompositionLocalMap getCompositionLocalScope$runtime() {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        persistentCompositionLocalMap = CompositionContextKt.EmptyPersistentCompositionLocalMap;
        return persistentCompositionLocalMap;
    }
}
