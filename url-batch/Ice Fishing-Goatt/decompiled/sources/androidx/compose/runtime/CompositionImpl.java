package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.collection.MutableIntList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Composition.kt */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002¥\u0001B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010X\u001a\u00020\u001aH\u0016J\u0018\u0010Y\u001a\u00020\u001a2\u0006\u0010Z\u001a\u00020,2\u0006\u0010[\u001a\u00020\u0013H\u0002J\u001e\u0010Y\u001a\u00020\u001a2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010[\u001a\u00020\u0013H\u0002J\b\u0010]\u001a\u00020\u001aH\u0016J\u0010\u0010^\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010_\u001a\u00020\u001aH\u0016J\b\u0010`\u001a\u00020\u001aH\u0016J\b\u0010a\u001a\u00020\u001aH\u0002J \u0010b\u001a\u00020\u001a2\u0011\u0010c\u001a\r\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0002\b\u001bH\u0016¢\u0006\u0002\u0010\u001fJ \u0010d\u001a\u00020\u001a2\u0011\u0010c\u001a\r\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0002\b\u001bH\u0002¢\u0006\u0002\u0010\u001fJ\r\u0010e\u001a\u00020:H\u0000¢\u0006\u0002\bfJ\b\u0010g\u001a\u00020\u001aH\u0016J3\u0010h\u001a\u0002Hi\"\u0004\b\u0000\u0010i2\b\u0010j\u001a\u0004\u0018\u00010\u00012\u0006\u0010k\u001a\u00020:2\f\u0010l\u001a\b\u0012\u0004\u0012\u0002Hi0\u0019H\u0016¢\u0006\u0002\u0010mJ\b\u0010n\u001a\u00020\u001aH\u0016J\u0010\u0010o\u001a\u00020\u001a2\u0006\u0010p\u001a\u00020qH\u0016J\b\u0010r\u001a\u00020\u001aH\u0002J\b\u0010s\u001a\u00020\u001aH\u0002J#\u0010t\u001a\u0004\u0018\u0001Hu\"\u0004\b\u0000\u0010u2\f\u0010v\u001a\b\u0012\u0004\u0012\u0002Hu0wH\u0016¢\u0006\u0002\u0010xJ\"\u0010y\u001a\u0002Hu\"\u0004\b\u0000\u0010u2\f\u0010l\u001a\b\u0012\u0004\u0012\u0002Hu0\u0019H\u0082\b¢\u0006\u0002\u0010zJC\u0010{\u001a\u0002Hu\"\u0004\b\u0000\u0010u2-\u0010l\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020,00¢\u0006\f\b}\u0012\b\b~\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u0002Hu0|H\u0082\b¢\u0006\u0002\u0010\u007fJ)\u0010\u0080\u0001\u001a\u00020\u001a2\u001e\u0010\u0081\u0001\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0083\u00010\u0082\u00010$H\u0016J\u001e\u0010\u0084\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0086\u0001\u001a\u00020%2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010,H\u0016J\t\u0010\u0088\u0001\u001a\u00020\u001aH\u0016J(\u0010\u0089\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0086\u0001\u001a\u00020%2\b\u0010\u008a\u0001\u001a\u00030\u008b\u00012\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010,H\u0002J\u000f\u0010\u008c\u0001\u001a\u00020\u001a2\u0006\u0010v\u001a\u00020:J\u0011\u0010\u008d\u0001\u001a\u00020\u001a2\u0006\u0010Z\u001a\u00020,H\u0002J\u001a\u0010\u008e\u0001\u001a\u00030\u008f\u00012\b\u0010\u0090\u0001\u001a\u00030\u0091\u0001H\u0000¢\u0006\u0003\b\u0092\u0001J\f\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u0001H\u0002J\u0017\u0010\u0093\u0001\u001a\u00020\u00132\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020,0+H\u0016J\u0017\u0010\u0094\u0001\u001a\u00020\u001a2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\t\u0010\u0095\u0001\u001a\u00020\u0013H\u0016J\u0012\u0010\u0096\u0001\u001a\u00020\u001a2\u0007\u0010\u0086\u0001\u001a\u00020%H\u0016J\u0017\u0010\u0097\u0001\u001a\u00020\u001a2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020,0+H\u0016J\u0011\u0010\u0098\u0001\u001a\u00020\u001a2\u0006\u0010Z\u001a\u00020,H\u0016J\u0011\u0010\u0099\u0001\u001a\u00020\u001a2\u0006\u0010Z\u001a\u00020,H\u0016J\u001b\u0010\u009a\u0001\u001a\u00020\u001a2\n\u0010p\u001a\u0006\u0012\u0002\b\u000301H\u0000¢\u0006\u0003\b\u009b\u0001J!\u0010\u009c\u0001\u001a\u00020\u001a2\u0007\u0010\u0087\u0001\u001a\u00020,2\u0007\u0010\u0086\u0001\u001a\u00020%H\u0000¢\u0006\u0003\b\u009d\u0001J!\u0010\u009e\u0001\u001a\u00020\u001a2\u0011\u0010c\u001a\r\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0002\b\u001bH\u0016¢\u0006\u0002\u0010\u001fJ!\u0010\u009f\u0001\u001a\u00020\u001a2\u0011\u0010c\u001a\r\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0002\b\u001bH\u0016¢\u0006\u0002\u0010\u001fJ\u0015\u0010 \u0001\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020,00H\u0002J#\u0010¡\u0001\u001a\u0002Hu\"\u0004\b\u0000\u0010u2\f\u0010l\u001a\b\u0012\u0004\u0012\u0002Hu0\u0019H\u0082\b¢\u0006\u0002\u0010zJ\u001d\u0010¢\u0001\u001a\u00020\u00132\u0007\u0010\u0086\u0001\u001a\u00020%2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010,H\u0002J\u0011\u0010£\u0001\u001a\u00020\u001a2\u0006\u0010S\u001a\u00020TH\u0002J\t\u0010¤\u0001\u001a\u00020\u001aH\u0016R\u0010\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0002\b\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020%0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001e\u0010/\u001a\u0012\u0012\u0004\u0012\u00020,\u0012\b\u0012\u0006\u0012\u0002\b\u00030100X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0015R\u0014\u00105\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0015R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020%0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010;\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020,00X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0015R\u0014\u0010=\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0015R\u0011\u0010>\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0015R\u000e\u0010?\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010A\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020%00X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010B\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020%00X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020,0+8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010.R\u0014\u0010E\u001a\u00020FX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010I\u001a\u00020\u0013X\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bJ\u0010\u0011\u001a\u0004\bK\u0010\u0015\"\u0004\bL\u0010MR\"\u0010N\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010,0Oj\n\u0012\u0006\u0012\u0004\u0018\u00010,`PX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u001a\u0010S\u001a\u00020TX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bU\u0010\u0011\u001a\u0004\bV\u0010W¨\u0006¦\u0001"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/CompositionServices;", "parent", "Landroidx/compose/runtime/CompositionContext;", "applier", "Landroidx/compose/runtime/Applier;", "recomposeContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "_recomposeContext", "abandonSet", "", "Landroidx/compose/runtime/RememberObserver;", "getAbandonSet$annotations", "()V", "areChildrenComposing", "", "getAreChildrenComposing", "()Z", "changes", "Landroidx/compose/runtime/changelist/ChangeList;", "composable", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "conditionalScopes", "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getConditionalScopes$runtime_release", "()Ljava/util/List;", "conditionallyInvalidatedScopes", "Landroidx/collection/MutableScatterSet;", "derivedStateDependencies", "", "", "getDerivedStateDependencies$runtime_release", "()Ljava/util/Set;", "derivedStates", "Landroidx/compose/runtime/collection/ScopeMap;", "Landroidx/compose/runtime/DerivedState;", "disposed", "hasInvalidations", "getHasInvalidations", "hasPendingChanges", "getHasPendingChanges", "invalidatedScopes", "invalidationDelegate", "invalidationDelegateGroup", "", "invalidations", "isComposing", "isDisposed", "isRoot", "lateChanges", "lock", "observations", "observationsProcessed", "observedObjects", "getObservedObjects$runtime_release", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime_release", "()Landroidx/compose/runtime/CompositionObserverHolder;", "pendingInvalidScopes", "getPendingInvalidScopes$runtime_release$annotations", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release$annotations", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "abandonChanges", "addPendingInvalidationsLocked", "value", "forgetConditionalScopes", "values", "applyChanges", "applyChangesInLocked", "applyLateChanges", "changesApplied", "cleanUpDerivedStateObservations", "composeContent", "content", "composeInitial", "composerStacksSizes", "composerStacksSizes$runtime_release", "deactivate", "delegateInvalidations", "R", "to", "groupIndex", "block", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "dispose", "disposeUnusedMovableContent", "state", "Landroidx/compose/runtime/MovableContentState;", "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "getCompositionService", "T", "key", "Landroidx/compose/runtime/CompositionServiceKey;", "(Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "guardChanges", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "guardInvalidationsLocked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "insertMovableContent", "references", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "invalidate", "Landroidx/compose/runtime/InvalidationResult;", "scope", "instance", "invalidateAll", "invalidateChecked", "anchor", "Landroidx/compose/runtime/Anchor;", "invalidateGroupsWithKey", "invalidateScopeOfLocked", "observe", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserver;", "observe$runtime_release", "observesAnyOf", "prepareCompose", "recompose", "recomposeScopeReleased", "recordModificationsOf", "recordReadOf", "recordWriteOf", "removeDerivedStateObservation", "removeDerivedStateObservation$runtime_release", "removeObservation", "removeObservation$runtime_release", "setContent", "setContentWithReuse", "takeInvalidations", "trackAbandonedValues", "tryImminentInvalidation", "validateRecomposeScopeAnchors", "verifyConsistent", "RememberEventDispatcher", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices {
    public static final int $stable = 8;
    private final CoroutineContext _recomposeContext;
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final ChangeList changes;
    private Function2<? super Composer, ? super Integer, Unit> composable;
    private final ComposerImpl composer;
    private final MutableScatterSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;
    private final ScopeMap<Object, DerivedState<?>> derivedStates;
    private boolean disposed;
    private final MutableScatterSet<RecomposeScopeImpl> invalidatedScopes;
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;
    private ScopeMap<RecomposeScopeImpl, Object> invalidations;
    private final boolean isRoot;
    private final ChangeList lateChanges;
    private final Object lock;
    private final ScopeMap<Object, RecomposeScopeImpl> observations;
    private final ScopeMap<Object, RecomposeScopeImpl> observationsProcessed;
    private final CompositionObserverHolder observerHolder;
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;
    private final AtomicReference<Object> pendingModifications;
    private final SlotTable slotTable;

    private static /* synthetic */ void getAbandonSet$annotations() {
    }

    public static /* synthetic */ void getPendingInvalidScopes$runtime_release$annotations() {
    }

    public static /* synthetic */ void getSlotTable$runtime_release$annotations() {
    }

    public CompositionImpl(CompositionContext compositionContext, Applier<?> applier, CoroutineContext coroutineContext) {
        this.parent = compositionContext;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        Set<RememberObserver> asMutableSet = new MutableScatterSet(0, 1, null).asMutableSet();
        this.abandonSet = asMutableSet;
        SlotTable slotTable = new SlotTable();
        if (compositionContext.getCollectingCallByInformation$runtime_release()) {
            slotTable.collectCalledByInformation();
        }
        if (compositionContext.getCollectingSourceInformation()) {
            slotTable.collectSourceInformation();
        }
        this.slotTable = slotTable;
        this.observations = new ScopeMap<>();
        this.invalidatedScopes = new MutableScatterSet<>(0, 1, null);
        this.conditionallyInvalidatedScopes = new MutableScatterSet<>(0, 1, null);
        this.derivedStates = new ScopeMap<>();
        ChangeList changeList = new ChangeList();
        this.changes = changeList;
        ChangeList changeList2 = new ChangeList();
        this.lateChanges = changeList2;
        this.observationsProcessed = new ScopeMap<>();
        this.invalidations = new ScopeMap<>();
        this.observerHolder = new CompositionObserverHolder(null, false, 3, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, asMutableSet, changeList, changeList2, this);
        compositionContext.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = coroutineContext;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m3280getLambda1$runtime_release();
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i & 4) != 0 ? null : coroutineContext);
    }

    /* renamed from: getSlotTable$runtime_release, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    public final Set<Object> getObservedObjects$runtime_release() {
        return this.observations.getMap().asMap().keySet();
    }

    public final Set<Object> getDerivedStateDependencies$runtime_release() {
        return this.derivedStates.getMap().asMap().keySet();
    }

    public final List<RecomposeScopeImpl> getConditionalScopes$runtime_release() {
        return CollectionsKt.toList(this.conditionallyInvalidatedScopes.asSet());
    }

    /* renamed from: getPendingInvalidScopes$runtime_release, reason: from getter */
    public final boolean getPendingInvalidScopes() {
        return this.pendingInvalidScopes;
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z) {
        this.pendingInvalidScopes = z;
    }

    /* renamed from: getObserverHolder$runtime_release, reason: from getter */
    public final CompositionObserverHolder getObserverHolder() {
        return this.observerHolder;
    }

    public final CoroutineContext getRecomposeContext() {
        CoroutineContext coroutineContext = this._recomposeContext;
        return coroutineContext == null ? this.parent.getRecomposeCoroutineContext$runtime_release() : coroutineContext;
    }

    /* renamed from: isRoot, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    public final Function2<Composer, Integer, Unit> getComposable() {
        return this.composable;
    }

    public final void setComposable(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.composable = function2;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.Composition
    /* renamed from: isDisposed, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.lock) {
            hasPendingChanges$runtime_release = this.composer.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(Function2<? super Composer, ? super Integer, Unit> content) {
        composeInitial(content);
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void setContentWithReuse(Function2<? super Composer, ? super Integer, Unit> content) {
        this.composer.startReuseFromRoot();
        composeInitial(content);
        this.composer.endReuseFromRoot();
    }

    private final void composeInitial(Function2<? super Composer, ? super Integer, Unit> content) {
        if (this.disposed) {
            PreconditionsKt.throwIllegalStateException("The composition is disposed");
        }
        this.composable = content;
        this.parent.composeInitial$runtime_release(this, content);
    }

    public final CompositionObserverHandle observe$runtime_release(final CompositionObserver observer) {
        synchronized (this.lock) {
            this.observerHolder.setObserver(observer);
            this.observerHolder.setRoot(true);
            Unit unit = Unit.INSTANCE;
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.CompositionImpl$observe$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object obj;
                obj = CompositionImpl.this.lock;
                CompositionImpl compositionImpl = CompositionImpl.this;
                CompositionObserver compositionObserver = observer;
                synchronized (obj) {
                    if (Intrinsics.areEqual(compositionImpl.getObserverHolder().getObserver(), compositionObserver)) {
                        compositionImpl.getObserverHolder().setObserver(null);
                        compositionImpl.getObserverHolder().setRoot(false);
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        };
    }

    public final void invalidateGroupsWithKey(int key) {
        List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release;
        synchronized (this.lock) {
            invalidateGroupsWithKey$runtime_release = this.slotTable.invalidateGroupsWithKey$runtime_release(key);
        }
        if (invalidateGroupsWithKey$runtime_release != null) {
            int size = invalidateGroupsWithKey$runtime_release.size();
            for (int i = 0; i < size; i++) {
                if (invalidateGroupsWithKey$runtime_release.get(i).invalidateForResult(null) != InvalidationResult.IGNORED) {
                }
            }
            return;
        }
        if (this.composer.forceRecomposeScopes$runtime_release()) {
            this.parent.invalidate$runtime_release(this);
        }
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object obj;
        Object obj2;
        AtomicReference<Object> atomicReference = this.pendingModifications;
        obj = CompositionKt.PendingApplyNoModifications;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            obj2 = CompositionKt.PendingApplyNoModifications;
            if (Intrinsics.areEqual(andSet, obj2)) {
                ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set<? extends Object>) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, true);
            }
        }
    }

    private final void drainPendingModificationsLocked() {
        Object obj;
        Object andSet = this.pendingModifications.getAndSet(null);
        obj = CompositionKt.PendingApplyNoModifications;
        if (Intrinsics.areEqual(andSet, obj)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            if (andSet == null) {
                ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw new KotlinNothingValueException();
            }
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new KotlinNothingValueException();
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            addPendingInvalidationsLocked(set, false);
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(Function2<? super Composer, ? super Integer, Unit> content) {
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                ScopeMap<RecomposeScopeImpl, Object> takeInvalidations = takeInvalidations();
                try {
                    CompositionObserver observer = observer();
                    if (observer != null) {
                        Map<RecomposeScopeImpl, Set<Object>> asMap = takeInvalidations.asMap();
                        Intrinsics.checkNotNull(asMap, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                        observer.onBeginComposition(this, asMap);
                    }
                    this.composer.composeContent$runtime_release(takeInvalidations, content);
                    if (observer != null) {
                        observer.onEndComposition(this);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e) {
                    this.invalidations = takeInvalidations;
                    throw e;
                }
            }
        } finally {
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            if (this.composer.getIsComposing()) {
                PreconditionsKt.throwIllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
            }
            if (!this.disposed) {
                this.disposed = true;
                this.composable = ComposableSingletons$CompositionKt.INSTANCE.m3281getLambda2$runtime_release();
                ChangeList deferredChanges = this.composer.getDeferredChanges();
                if (deferredChanges != null) {
                    applyChangesInLocked(deferredChanges);
                }
                boolean z = this.slotTable.getGroupsSize() > 0;
                if (z || !this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                    if (z) {
                        this.applier.onBeginChanges();
                        SlotWriter openWriter = this.slotTable.openWriter();
                        try {
                            ComposerKt.removeCurrentGroup(openWriter, rememberEventDispatcher);
                            Unit unit = Unit.INSTANCE;
                            openWriter.close(true);
                            this.applier.clear();
                            this.applier.onEndChanges();
                            rememberEventDispatcher.dispatchRememberObservers();
                        } catch (Throwable th) {
                            openWriter.close(false);
                            throw th;
                        }
                    }
                    rememberEventDispatcher.dispatchAbandons();
                }
                this.composer.dispose$runtime_release();
            }
            Unit unit2 = Unit.INSTANCE;
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z;
        synchronized (this.lock) {
            z = this.invalidations.getSize() > 0;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(Set<? extends Object> values) {
        Object obj;
        Object obj2;
        boolean areEqual;
        Set<? extends Object> set;
        do {
            obj = this.pendingModifications.get();
            if (obj == null) {
                areEqual = true;
            } else {
                obj2 = CompositionKt.PendingApplyNoModifications;
                areEqual = Intrinsics.areEqual(obj, obj2);
            }
            if (areEqual) {
                set = values;
            } else if (obj instanceof Set) {
                set = new Set[]{obj, values};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                set = ArraysKt.plus((Set<? extends Object>[]) obj, values);
            }
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.pendingModifications, obj, set));
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(Function0<Unit> block) {
        this.composer.prepareCompose$runtime_release(block);
    }

    private final void addPendingInvalidationsLocked(Object value, boolean forgetConditionalScopes) {
        Object obj = this.observations.getMap().get(value);
        if (obj == null) {
            return;
        }
        if (obj instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i << 3) + i3];
                            if (!this.observationsProcessed.remove(value, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(value) != InvalidationResult.IGNORED) {
                                if (recomposeScopeImpl.isConditional() && !forgetConditionalScopes) {
                                    this.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                                } else {
                                    this.invalidatedScopes.add(recomposeScopeImpl);
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        } else {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj;
            if (this.observationsProcessed.remove(value, recomposeScopeImpl2) || recomposeScopeImpl2.invalidateForResult(value) == InvalidationResult.IGNORED) {
                return;
            }
            if (recomposeScopeImpl2.isConditional() && !forgetConditionalScopes) {
                this.conditionallyInvalidatedScopes.add(recomposeScopeImpl2);
            } else {
                this.invalidatedScopes.add(recomposeScopeImpl2);
            }
        }
    }

    private final void cleanUpDerivedStateObservations() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        char c2;
        long j5;
        int i2;
        boolean z;
        long[] jArr3;
        int i3;
        int i4;
        MutableScatterMap<Object, Object> map = this.derivedStates.getMap();
        long[] jArr4 = map.metadata;
        int length = jArr4.length - 2;
        long j6 = 255;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j8 = jArr4[i6];
                j3 = 128;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j8 & j6) < 128) {
                            j4 = j6;
                            int i9 = (i6 << 3) + i8;
                            Object obj = map.keys[i9];
                            Object obj2 = map.values[i9];
                            c2 = c3;
                            if (obj2 instanceof MutableScatterSet) {
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr = mutableScatterSet.elements;
                                j5 = j7;
                                long[] jArr5 = mutableScatterSet.metadata;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    int i10 = i5;
                                    int i11 = 0;
                                    while (true) {
                                        long j9 = jArr5[i11];
                                        Object[] objArr2 = objArr;
                                        long[] jArr6 = jArr5;
                                        if ((((~j9) << c2) & j9 & j5) != j5) {
                                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j9 & j4) < 128) {
                                                    jArr3 = jArr4;
                                                    int i14 = (i11 << 3) + i13;
                                                    i3 = i8;
                                                    i4 = i13;
                                                    if (!this.observations.contains((DerivedState) objArr2[i14])) {
                                                        mutableScatterSet.removeElementAt(i14);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i3 = i8;
                                                    i4 = i13;
                                                }
                                                j9 >>= i10;
                                                i13 = i4 + 1;
                                                jArr4 = jArr3;
                                                i8 = i3;
                                            }
                                            jArr2 = jArr4;
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i = i8;
                                        }
                                        int i15 = i11;
                                        if (i15 == length2) {
                                            break;
                                        }
                                        i11 = i15 + 1;
                                        objArr = objArr2;
                                        jArr5 = jArr6;
                                        jArr4 = jArr2;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    i = i8;
                                }
                                z = mutableScatterSet.isEmpty();
                            } else {
                                jArr2 = jArr4;
                                i = i8;
                                j5 = j7;
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                z = !this.observations.contains((DerivedState) obj2);
                            }
                            if (z) {
                                map.removeValueAt(i9);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr4;
                            i = i8;
                            j4 = j6;
                            c2 = c3;
                            j5 = j7;
                            i2 = i5;
                        }
                        j8 >>= i2;
                        i8 = i + 1;
                        i5 = i2;
                        c3 = c2;
                        j6 = j4;
                        j7 = j5;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    j = j6;
                    c = c3;
                    j2 = j7;
                    if (i7 != i5) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    j = j6;
                    c = c3;
                    j2 = j7;
                }
                if (i6 == length) {
                    break;
                }
                i6++;
                c3 = c;
                j6 = j;
                j7 = j2;
                jArr4 = jArr;
                i5 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        if (!this.conditionallyInvalidatedScopes.isNotEmpty()) {
            return;
        }
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet2 = this.conditionallyInvalidatedScopes;
        Object[] objArr3 = mutableScatterSet2.elements;
        long[] jArr7 = mutableScatterSet2.metadata;
        int length3 = jArr7.length - 2;
        if (length3 < 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            long j10 = jArr7[i16];
            if ((((~j10) << c) & j10 & j2) != j2) {
                int i17 = 8 - ((~(i16 - length3)) >>> 31);
                for (int i18 = 0; i18 < i17; i18++) {
                    if ((j10 & j) < j3) {
                        int i19 = (i16 << 3) + i18;
                        if (!((RecomposeScopeImpl) objArr3[i19]).isConditional()) {
                            mutableScatterSet2.removeElementAt(i19);
                        }
                    }
                    j10 >>= 8;
                }
                if (i17 != 8) {
                    return;
                }
            }
            if (i16 == length3) {
                return;
            } else {
                i16++;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public void recordReadOf(Object value) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        int i;
        int i2;
        int i3;
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) == null) {
            return;
        }
        int i4 = 1;
        currentRecomposeScope$runtime_release.setUsed(true);
        if (currentRecomposeScope$runtime_release.recordRead(value)) {
            return;
        }
        if (value instanceof StateObjectImpl) {
            ReaderKind.Companion companion = ReaderKind.INSTANCE;
            ((StateObjectImpl) value).m3427recordReadInh_f27i8$runtime_release(ReaderKind.m3414constructorimpl(1));
        }
        this.observations.add(value, currentRecomposeScope$runtime_release);
        if (value instanceof DerivedState) {
            DerivedState<?> derivedState = (DerivedState) value;
            DerivedState.Record<?> currentRecord = derivedState.getCurrentRecord();
            this.derivedStates.removeScope(value);
            ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
            Object[] objArr = dependencies.keys;
            long[] jArr = dependencies.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j = jArr[i5];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j & 255) < 128) {
                                i2 = i4;
                                StateObject stateObject = (StateObject) objArr[(i5 << 3) + i8];
                                if (stateObject instanceof StateObjectImpl) {
                                    ReaderKind.Companion companion2 = ReaderKind.INSTANCE;
                                    i3 = i6;
                                    ((StateObjectImpl) stateObject).m3427recordReadInh_f27i8$runtime_release(ReaderKind.m3414constructorimpl(i2));
                                } else {
                                    i3 = i6;
                                }
                                this.derivedStates.add(stateObject, value);
                            } else {
                                i2 = i4;
                                i3 = i6;
                            }
                            j >>= i3;
                            i8++;
                            i4 = i2;
                            i6 = i3;
                        }
                        i = i4;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        i = i4;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    i4 = i;
                }
            }
            currentRecomposeScope$runtime_release.recordDerivedStateValue(derivedState, currentRecord.getCurrentValue());
        }
    }

    private final void invalidateScopeOfLocked(Object value) {
        Object obj = this.observations.getMap().get(value);
        if (obj == null) {
            return;
        }
        if (obj instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i << 3) + i3];
                            if (recomposeScopeImpl.invalidateForResult(value) == InvalidationResult.IMMINENT) {
                                this.observationsProcessed.add(value, recomposeScopeImpl);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        } else {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj;
            if (recomposeScopeImpl2.invalidateForResult(value) == InvalidationResult.IMMINENT) {
                this.observationsProcessed.add(value, recomposeScopeImpl2);
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(Object value) {
        synchronized (this.lock) {
            invalidateScopeOfLocked(value);
            Object obj = this.derivedStates.getMap().get(value);
            if (obj != null) {
                if (!(obj instanceof MutableScatterSet)) {
                    invalidateScopeOfLocked((DerivedState) obj);
                } else {
                    MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
                    Object[] objArr = mutableScatterSet.elements;
                    long[] jArr = mutableScatterSet.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        invalidateScopeOfLocked((DerivedState) objArr[(i << 3) + i3]);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean recompose$runtime_release;
        synchronized (this.lock) {
            drainPendingModificationsForCompositionLocked();
            try {
                ScopeMap<RecomposeScopeImpl, Object> takeInvalidations = takeInvalidations();
                try {
                    CompositionObserver observer = observer();
                    if (observer != null) {
                        Map<RecomposeScopeImpl, Set<Object>> asMap = takeInvalidations.asMap();
                        Intrinsics.checkNotNull(asMap, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                        observer.onBeginComposition(this, asMap);
                    }
                    recompose$runtime_release = this.composer.recompose$runtime_release(takeInvalidations);
                    if (!recompose$runtime_release) {
                        drainPendingModificationsLocked();
                    }
                    if (observer != null) {
                        observer.onEndComposition(this);
                    }
                } catch (Exception e) {
                    this.invalidations = takeInvalidations;
                    throw e;
                }
            } finally {
            }
        }
        return recompose$runtime_release;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(MovableContentState state) {
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        SlotWriter openWriter = state.getSlotTable().openWriter();
        try {
            ComposerKt.removeCurrentGroup(openWriter, rememberEventDispatcher);
            Unit unit = Unit.INSTANCE;
            openWriter.close(true);
            rememberEventDispatcher.dispatchRememberObservers();
        } catch (Throwable th) {
            openWriter.close(false);
            throw th;
        }
    }

    private final void applyChangesInLocked(ChangeList changes) {
        RememberEventDispatcher rememberEventDispatcher;
        long[] jArr;
        int i;
        RememberEventDispatcher rememberEventDispatcher2;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i2;
        boolean z;
        RememberEventDispatcher rememberEventDispatcher3;
        RememberEventDispatcher rememberEventDispatcher4 = new RememberEventDispatcher(this.abandonSet);
        try {
            if (!changes.isEmpty()) {
                try {
                    Object beginSection = Trace.INSTANCE.beginSection("Compose:applyChanges");
                    try {
                        this.applier.onBeginChanges();
                        SlotWriter openWriter = this.slotTable.openWriter();
                        int i3 = 0;
                        try {
                            changes.executeAndFlushAllPendingChanges(this.applier, openWriter, rememberEventDispatcher4);
                            Unit unit = Unit.INSTANCE;
                            openWriter.close(true);
                            this.applier.onEndChanges();
                            Unit unit2 = Unit.INSTANCE;
                            Trace.INSTANCE.endSection(beginSection);
                            rememberEventDispatcher4.dispatchRememberObservers();
                            rememberEventDispatcher4.dispatchSideEffects();
                            if (this.pendingInvalidScopes) {
                                Object beginSection2 = Trace.INSTANCE.beginSection("Compose:unobserve");
                                try {
                                    this.pendingInvalidScopes = false;
                                    MutableScatterMap<Object, Object> map = this.observations.getMap();
                                    long[] jArr3 = map.metadata;
                                    int length = jArr3.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        while (true) {
                                            long j3 = jArr3[i4];
                                            char c2 = 7;
                                            long j4 = -9187201950435737472L;
                                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i5 = 8;
                                                int i6 = 8 - ((~(i4 - length)) >>> 31);
                                                int i7 = i3;
                                                while (i7 < i6) {
                                                    if ((j3 & 255) < 128) {
                                                        c = c2;
                                                        int i8 = (i4 << 3) + i7;
                                                        j2 = j4;
                                                        Object obj = map.keys[i8];
                                                        Object obj2 = map.values[i8];
                                                        if (obj2 instanceof MutableScatterSet) {
                                                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                                            Object[] objArr = mutableScatterSet.elements;
                                                            long[] jArr4 = mutableScatterSet.metadata;
                                                            int i9 = i5;
                                                            int length2 = jArr4.length - 2;
                                                            i = i7;
                                                            if (length2 >= 0) {
                                                                j = j3;
                                                                int i10 = 0;
                                                                while (true) {
                                                                    long j5 = jArr4[i10];
                                                                    long[] jArr5 = jArr4;
                                                                    jArr2 = jArr3;
                                                                    if ((((~j5) << c) & j5 & j2) != j2) {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        int i12 = 0;
                                                                        while (i12 < i11) {
                                                                            if ((j5 & 255) < 128) {
                                                                                rememberEventDispatcher3 = rememberEventDispatcher4;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                try {
                                                                                    if (!((RecomposeScopeImpl) objArr[i13]).getValid()) {
                                                                                        mutableScatterSet.removeElementAt(i13);
                                                                                    }
                                                                                } catch (Throwable th) {
                                                                                    th = th;
                                                                                    Trace.INSTANCE.endSection(beginSection2);
                                                                                    throw th;
                                                                                }
                                                                            } else {
                                                                                rememberEventDispatcher3 = rememberEventDispatcher4;
                                                                            }
                                                                            j5 >>= i9;
                                                                            i12++;
                                                                            rememberEventDispatcher4 = rememberEventDispatcher3;
                                                                        }
                                                                        rememberEventDispatcher2 = rememberEventDispatcher4;
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        rememberEventDispatcher2 = rememberEventDispatcher4;
                                                                    }
                                                                    if (i10 == length2) {
                                                                        break;
                                                                    }
                                                                    i10++;
                                                                    jArr3 = jArr2;
                                                                    jArr4 = jArr5;
                                                                    rememberEventDispatcher4 = rememberEventDispatcher2;
                                                                    i9 = 8;
                                                                }
                                                            } else {
                                                                rememberEventDispatcher2 = rememberEventDispatcher4;
                                                                jArr2 = jArr3;
                                                                j = j3;
                                                            }
                                                            z = mutableScatterSet.isEmpty();
                                                        } else {
                                                            i = i7;
                                                            rememberEventDispatcher2 = rememberEventDispatcher4;
                                                            jArr2 = jArr3;
                                                            j = j3;
                                                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                                            z = !((RecomposeScopeImpl) obj2).getValid();
                                                        }
                                                        if (z) {
                                                            map.removeValueAt(i8);
                                                        }
                                                        i2 = 8;
                                                    } else {
                                                        i = i7;
                                                        rememberEventDispatcher2 = rememberEventDispatcher4;
                                                        jArr2 = jArr3;
                                                        j = j3;
                                                        c = c2;
                                                        j2 = j4;
                                                        i2 = i5;
                                                    }
                                                    j3 = j >> i2;
                                                    i7 = i + 1;
                                                    i5 = i2;
                                                    c2 = c;
                                                    j4 = j2;
                                                    jArr3 = jArr2;
                                                    rememberEventDispatcher4 = rememberEventDispatcher2;
                                                }
                                                rememberEventDispatcher = rememberEventDispatcher4;
                                                jArr = jArr3;
                                                if (i6 != i5) {
                                                    break;
                                                }
                                            } else {
                                                rememberEventDispatcher = rememberEventDispatcher4;
                                                jArr = jArr3;
                                            }
                                            if (i4 == length) {
                                                break;
                                            }
                                            i4++;
                                            jArr3 = jArr;
                                            rememberEventDispatcher4 = rememberEventDispatcher;
                                            i3 = 0;
                                        }
                                    } else {
                                        rememberEventDispatcher = rememberEventDispatcher4;
                                    }
                                    cleanUpDerivedStateObservations();
                                    Unit unit3 = Unit.INSTANCE;
                                    Trace.INSTANCE.endSection(beginSection2);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } else {
                                rememberEventDispatcher = rememberEventDispatcher4;
                            }
                            if (this.lateChanges.isEmpty()) {
                                rememberEventDispatcher.dispatchAbandons();
                            }
                        } catch (Throwable th3) {
                            try {
                                openWriter.close(false);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                Trace.INSTANCE.endSection(beginSection);
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (this.lateChanges.isEmpty()) {
                        rememberEventDispatcher4.dispatchAbandons();
                    }
                    throw th;
                }
            } else if (this.lateChanges.isEmpty()) {
                rememberEventDispatcher4.dispatchAbandons();
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            } finally {
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.isNotEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            } finally {
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime_release();
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            } finally {
            }
        }
    }

    private final <T> T guardInvalidationsLocked(Function1<? super ScopeMap<RecomposeScopeImpl, Object>, ? extends T> block) {
        ScopeMap<RecomposeScopeImpl, Object> takeInvalidations = takeInvalidations();
        try {
            return block.invoke(takeInvalidations);
        } catch (Exception e) {
            this.invalidations = takeInvalidations;
            throw e;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        if (this.abandonSet.isEmpty()) {
            return;
        }
        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.lock) {
            for (Object obj : this.slotTable.getSlots()) {
                RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            if (!isComposing()) {
                this.composer.verifyConsistent$runtime_release();
                this.slotTable.verifyWellFormed();
                validateRecomposeScopeAnchors(this.slotTable);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(ControlledComposition to, int groupIndex, Function0<? extends R> block) {
        if (to != null && !Intrinsics.areEqual(to, this) && groupIndex >= 0) {
            this.invalidationDelegate = (CompositionImpl) to;
            this.invalidationDelegateGroup = groupIndex;
            try {
                return block.invoke();
            } finally {
                this.invalidationDelegate = null;
                this.invalidationDelegateGroup = 0;
            }
        }
        return block.invoke();
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public InvalidationResult invalidate(RecomposeScopeImpl scope, Object instance) {
        CompositionImpl compositionImpl;
        if (scope.getDefaultsInScope()) {
            scope.setDefaultsInvalid(true);
        }
        Anchor anchor = scope.getAnchor();
        if (anchor == null || !anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (!this.slotTable.ownsAnchor(anchor)) {
            synchronized (this.lock) {
                compositionImpl = this.invalidationDelegate;
            }
            if (compositionImpl != null && compositionImpl.tryImminentInvalidation(scope, instance)) {
                return InvalidationResult.IMMINENT;
            }
            return InvalidationResult.IGNORED;
        }
        if (!scope.getCanRecompose()) {
            return InvalidationResult.IGNORED;
        }
        return invalidateChecked(scope, anchor, instance);
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(RecomposeScopeImpl scope) {
        this.pendingInvalidScopes = true;
    }

    @Override // androidx.compose.runtime.CompositionServices
    public <T> T getCompositionService(CompositionServiceKey<T> key) {
        if (Intrinsics.areEqual(key, CompositionKt.getCompositionImplServiceKey())) {
            return (T) this;
        }
        return null;
    }

    private final boolean tryImminentInvalidation(RecomposeScopeImpl scope, Object instance) {
        return isComposing() && this.composer.tryImminentInvalidation$runtime_release(scope, instance);
    }

    private final InvalidationResult invalidateChecked(RecomposeScopeImpl scope, Anchor anchor, Object instance) {
        int i;
        synchronized (this.lock) {
            CompositionImpl compositionImpl = this.invalidationDelegate;
            CompositionImpl compositionImpl2 = null;
            if (compositionImpl != null) {
                if (!this.slotTable.groupContainsAnchor(this.invalidationDelegateGroup, anchor)) {
                    compositionImpl = null;
                }
                compositionImpl2 = compositionImpl;
            }
            if (compositionImpl2 == null) {
                if (tryImminentInvalidation(scope, instance)) {
                    return InvalidationResult.IMMINENT;
                }
                CompositionObserver observer = observer();
                if (instance == null) {
                    this.invalidations.set(scope, ScopeInvalidated.INSTANCE);
                } else if (observer == null && !(instance instanceof DerivedState)) {
                    this.invalidations.set(scope, ScopeInvalidated.INSTANCE);
                } else {
                    Object obj = this.invalidations.getMap().get(scope);
                    if (obj != null) {
                        if (obj instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
                            Object[] objArr = mutableScatterSet.elements;
                            long[] jArr = mutableScatterSet.metadata;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i2 = 0;
                                loop0: while (true) {
                                    long j = jArr[i2];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i3 = 8;
                                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                                        int i5 = 0;
                                        while (i5 < i4) {
                                            if ((j & 255) < 128) {
                                                i = i3;
                                                if (objArr[(i2 << 3) + i5] == ScopeInvalidated.INSTANCE) {
                                                    break loop0;
                                                }
                                            } else {
                                                i = i3;
                                            }
                                            j >>= i;
                                            i5++;
                                            i3 = i;
                                        }
                                        if (i4 != i3) {
                                            break;
                                        }
                                    }
                                    if (i2 == length) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else if (obj == ScopeInvalidated.INSTANCE) {
                        }
                    }
                    this.invalidations.add(scope, instance);
                }
            }
            if (compositionImpl2 != null) {
                return compositionImpl2.invalidateChecked(scope, anchor, instance);
            }
            this.parent.invalidate$runtime_release(this);
            return isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
        }
    }

    public final void removeObservation$runtime_release(Object instance, RecomposeScopeImpl scope) {
        this.observations.remove(instance, scope);
    }

    public final void removeDerivedStateObservation$runtime_release(DerivedState<?> state) {
        if (this.observations.contains(state)) {
            return;
        }
        this.derivedStates.removeScope(state);
    }

    private final ScopeMap<RecomposeScopeImpl, Object> takeInvalidations() {
        ScopeMap<RecomposeScopeImpl, Object> scopeMap = this.invalidations;
        this.invalidations = new ScopeMap<>();
        return scopeMap;
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable) {
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList2.get(i);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime_release(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                PreconditionsKt.throwIllegalStateException("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + ArraysKt.indexOf((RecomposeScopeImpl[]) slotTable.getSlots(), recomposeScopeImpl2));
            }
        }
    }

    private final <T> T trackAbandonedValues(Function0<? extends T> block) {
        try {
            return block.invoke();
        } catch (Throwable th) {
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            throw th;
        }
    }

    private final CompositionObserver observer() {
        CompositionObserverHolder compositionObserverHolder = this.observerHolder;
        if (compositionObserverHolder.getRoot()) {
            return compositionObserverHolder.getObserver();
        }
        CompositionObserverHolder observerHolder = this.parent.getObserverHolder();
        CompositionObserver observer = observerHolder != null ? observerHolder.getObserver() : null;
        if (!Intrinsics.areEqual(observer, compositionObserverHolder.getObserver())) {
            compositionObserverHolder.setObserver(observer);
        }
        return observer;
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void deactivate() {
        synchronized (this.lock) {
            boolean z = this.slotTable.getGroupsSize() > 0;
            if (z || !this.abandonSet.isEmpty()) {
                Object beginSection = Trace.INSTANCE.beginSection("Compose:deactivate");
                try {
                    RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                    if (z) {
                        this.applier.onBeginChanges();
                        SlotWriter openWriter = this.slotTable.openWriter();
                        try {
                            ComposerKt.deactivateCurrentGroup(openWriter, rememberEventDispatcher);
                            Unit unit = Unit.INSTANCE;
                            openWriter.close(true);
                            this.applier.onEndChanges();
                            rememberEventDispatcher.dispatchRememberObservers();
                        } catch (Throwable th) {
                            openWriter.close(false);
                            throw th;
                        }
                    }
                    rememberEventDispatcher.dispatchAbandons();
                    Unit unit2 = Unit.INSTANCE;
                } finally {
                    Trace.INSTANCE.endSection(beginSection);
                }
            }
            this.observations.clear();
            this.derivedStates.clear();
            this.invalidations.clear();
            this.changes.clear();
            this.lateChanges.clear();
            this.composer.deactivate$runtime_release();
            Unit unit3 = Unit.INSTANCE;
        }
    }

    public final int composerStacksSizes$runtime_release() {
        return this.composer.stacksSize$runtime_release();
    }

    /* compiled from: Composition.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J\u0006\u0010\u001a\u001a\u00020\u0013J\u0006\u0010\u001b\u001a\u00020\u0013J\u0006\u0010\u001c\u001a\u00020\u0013J(\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J(\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002J(\u0010\r\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J\u0010\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J\u0016\u0010 \u001a\u00020\u00132\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Landroidx/compose/runtime/CompositionImpl$RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "abandoning", "", "Landroidx/compose/runtime/RememberObserver;", "(Ljava/util/Set;)V", "afters", "Landroidx/collection/MutableIntList;", "leaving", "", "", "pending", "priorities", "releasing", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "remembering", "sideEffects", "Lkotlin/Function0;", "", "deactivating", "instance", "endRelativeOrder", "", "priority", "endRelativeAfter", "dispatchAbandons", "dispatchRememberObservers", "dispatchSideEffects", "forgetting", "processPendingLeaving", "recordLeaving", "sideEffect", "effect", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class RememberEventDispatcher implements RememberManager {
        private final Set<RememberObserver> abandoning;
        private MutableScatterSet<ComposeNodeLifecycleCallback> releasing;
        private final List<RememberObserver> remembering = new ArrayList();
        private final List<Object> leaving = new ArrayList();
        private final List<Function0<Unit>> sideEffects = new ArrayList();
        private final List<Object> pending = new ArrayList();
        private final MutableIntList priorities = new MutableIntList(0, 1, null);
        private final MutableIntList afters = new MutableIntList(0, 1, null);

        public RememberEventDispatcher(Set<RememberObserver> set) {
            this.abandoning = set;
        }

        @Override // androidx.compose.runtime.RememberManager
        public void remembering(RememberObserver instance) {
            this.remembering.add(instance);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void forgetting(RememberObserver instance, int endRelativeOrder, int priority, int endRelativeAfter) {
            recordLeaving(instance, endRelativeOrder, priority, endRelativeAfter);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void sideEffect(Function0<Unit> effect) {
            this.sideEffects.add(effect);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void deactivating(ComposeNodeLifecycleCallback instance, int endRelativeOrder, int priority, int endRelativeAfter) {
            recordLeaving(instance, endRelativeOrder, priority, endRelativeAfter);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void releasing(ComposeNodeLifecycleCallback instance, int endRelativeOrder, int priority, int endRelativeAfter) {
            MutableScatterSet<ComposeNodeLifecycleCallback> mutableScatterSet = this.releasing;
            if (mutableScatterSet == null) {
                mutableScatterSet = ScatterSetKt.mutableScatterSetOf();
                this.releasing = mutableScatterSet;
            }
            mutableScatterSet.plusAssign((MutableScatterSet<ComposeNodeLifecycleCallback>) instance);
            recordLeaving(instance, endRelativeOrder, priority, endRelativeAfter);
        }

        public final void dispatchRememberObservers() {
            Object beginSection;
            processPendingLeaving(Integer.MIN_VALUE);
            if (!this.leaving.isEmpty()) {
                beginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
                try {
                    ScatterSet scatterSet = this.releasing;
                    for (int size = this.leaving.size() - 1; -1 < size; size--) {
                        Object obj = this.leaving.get(size);
                        if (obj instanceof RememberObserver) {
                            this.abandoning.remove(obj);
                            ((RememberObserver) obj).onForgotten();
                        }
                        if (obj instanceof ComposeNodeLifecycleCallback) {
                            if (scatterSet != null && scatterSet.contains(obj)) {
                                ((ComposeNodeLifecycleCallback) obj).onRelease();
                            } else {
                                ((ComposeNodeLifecycleCallback) obj).onDeactivate();
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            }
            if (this.remembering.isEmpty()) {
                return;
            }
            beginSection = Trace.INSTANCE.beginSection("Compose:onRemembered");
            try {
                List<RememberObserver> list = this.remembering;
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    RememberObserver rememberObserver = list.get(i);
                    this.abandoning.remove(rememberObserver);
                    rememberObserver.onRemembered();
                }
                Unit unit2 = Unit.INSTANCE;
            } finally {
            }
        }

        public final void dispatchSideEffects() {
            if (this.sideEffects.isEmpty()) {
                return;
            }
            Object beginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
            try {
                List<Function0<Unit>> list = this.sideEffects;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invoke();
                }
                this.sideEffects.clear();
                Unit unit = Unit.INSTANCE;
            } finally {
                Trace.INSTANCE.endSection(beginSection);
            }
        }

        public final void dispatchAbandons() {
            if (this.abandoning.isEmpty()) {
                return;
            }
            Object beginSection = Trace.INSTANCE.beginSection("Compose:abandons");
            try {
                Iterator<RememberObserver> it = this.abandoning.iterator();
                while (it.hasNext()) {
                    RememberObserver next = it.next();
                    it.remove();
                    next.onAbandoned();
                }
                Unit unit = Unit.INSTANCE;
            } finally {
                Trace.INSTANCE.endSection(beginSection);
            }
        }

        private final void recordLeaving(Object instance, int endRelativeOrder, int priority, int endRelativeAfter) {
            processPendingLeaving(endRelativeOrder);
            if (endRelativeAfter >= 0 && endRelativeAfter < endRelativeOrder) {
                this.pending.add(instance);
                this.priorities.add(priority);
                this.afters.add(endRelativeAfter);
                return;
            }
            this.leaving.add(instance);
        }

        private final void processPendingLeaving(int endRelativeOrder) {
            if (this.pending.isEmpty()) {
                return;
            }
            int i = 0;
            int i2 = 0;
            List list = null;
            MutableIntList mutableIntList = null;
            MutableIntList mutableIntList2 = null;
            while (i2 < this.afters.getSize()) {
                if (endRelativeOrder <= this.afters.get(i2)) {
                    Object remove = this.pending.remove(i2);
                    int removeAt = this.afters.removeAt(i2);
                    int removeAt2 = this.priorities.removeAt(i2);
                    if (list == null) {
                        list = CollectionsKt.mutableListOf(remove);
                        mutableIntList2 = new MutableIntList(0, 1, null);
                        mutableIntList2.add(removeAt);
                        mutableIntList = new MutableIntList(0, 1, null);
                        mutableIntList.add(removeAt2);
                    } else {
                        Intrinsics.checkNotNull(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        Intrinsics.checkNotNull(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        list.add(remove);
                        mutableIntList2.add(removeAt);
                        mutableIntList.add(removeAt2);
                    }
                } else {
                    i2++;
                }
            }
            if (list != null) {
                Intrinsics.checkNotNull(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                Intrinsics.checkNotNull(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                int size = list.size() - 1;
                while (i < size) {
                    int i3 = i + 1;
                    int size2 = list.size();
                    for (int i4 = i3; i4 < size2; i4++) {
                        int i5 = mutableIntList2.get(i);
                        int i6 = mutableIntList2.get(i4);
                        if (i5 < i6 || (i6 == i5 && mutableIntList.get(i) < mutableIntList.get(i4))) {
                            CompositionKt.swap(list, i, i4);
                            CompositionKt.swap(mutableIntList, i, i4);
                            CompositionKt.swap(mutableIntList2, i, i4);
                        }
                    }
                    i = i3;
                }
                this.leaving.addAll(list);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return true;
     */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean observesAnyOf(Set<? extends Object> values) {
        if (values instanceof ScatterSetWrapper) {
            ScatterSet set$runtime_release = ((ScatterSetWrapper) values).getSet$runtime_release();
            Object[] objArr = set$runtime_release.elements;
            long[] jArr = set$runtime_release.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (this.observations.contains(obj) || this.derivedStates.contains(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            for (Object obj2 : values) {
                if (this.observations.contains(obj2) || this.derivedStates.contains(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void addPendingInvalidationsLocked(Set<? extends Object> values, boolean forgetConditionalScopes) {
        char c;
        long j;
        long j2;
        long j3;
        int i;
        long[] jArr;
        String str;
        long[] jArr2;
        String str2;
        int i2;
        long j4;
        boolean contains;
        String str3;
        int i3;
        long[] jArr3;
        int i4;
        long[] jArr4;
        int i5;
        int i6;
        long j5;
        boolean z;
        int i7;
        long j6;
        long j7;
        char c2;
        long j8;
        int i8;
        int i9;
        int i10;
        Object obj = null;
        char c3 = 7;
        long j9 = -9187201950435737472L;
        int i11 = 8;
        if (values instanceof ScatterSetWrapper) {
            ScatterSet set$runtime_release = ((ScatterSetWrapper) values).getSet$runtime_release();
            Object[] objArr = set$runtime_release.elements;
            long[] jArr5 = set$runtime_release.metadata;
            int length = jArr5.length - 2;
            if (length >= 0) {
                int i12 = 0;
                j2 = 128;
                while (true) {
                    long j10 = jArr5[i12];
                    j3 = 255;
                    if ((((~j10) << c3) & j10 & j9) != j9) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j10 & 255) < 128) {
                                c2 = c3;
                                Object obj2 = objArr[(i12 << 3) + i14];
                                j8 = j9;
                                if (obj2 instanceof RecomposeScopeImpl) {
                                    ((RecomposeScopeImpl) obj2).invalidateForResult(obj);
                                } else {
                                    addPendingInvalidationsLocked(obj2, forgetConditionalScopes);
                                    Object obj3 = this.derivedStates.getMap().get(obj2);
                                    if (obj3 != null) {
                                        if (obj3 instanceof MutableScatterSet) {
                                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj3;
                                            Object[] objArr2 = mutableScatterSet.elements;
                                            long[] jArr6 = mutableScatterSet.metadata;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                j7 = j10;
                                                int i15 = 0;
                                                while (true) {
                                                    long j11 = jArr6[i15];
                                                    int i16 = i11;
                                                    i8 = length;
                                                    if ((((~j11) << c2) & j11 & j8) != j8) {
                                                        int i17 = 8 - ((~(i15 - length2)) >>> 31);
                                                        int i18 = 0;
                                                        while (i18 < i17) {
                                                            if ((j11 & 255) < 128) {
                                                                i10 = i16;
                                                                addPendingInvalidationsLocked((DerivedState) objArr2[(i15 << 3) + i18], forgetConditionalScopes);
                                                            } else {
                                                                i10 = i16;
                                                            }
                                                            j11 >>= i10;
                                                            i18++;
                                                            i16 = i10;
                                                        }
                                                        if (i17 != i16) {
                                                            break;
                                                        }
                                                    }
                                                    if (i15 == length2) {
                                                        break;
                                                    }
                                                    i15++;
                                                    length = i8;
                                                    i11 = 8;
                                                }
                                            }
                                        } else {
                                            j7 = j10;
                                            i8 = length;
                                            addPendingInvalidationsLocked((DerivedState) obj3, forgetConditionalScopes);
                                        }
                                        i9 = 8;
                                    }
                                }
                                j7 = j10;
                                i8 = length;
                                i9 = 8;
                            } else {
                                j7 = j10;
                                c2 = c3;
                                j8 = j9;
                                i8 = length;
                                i9 = i11;
                            }
                            i14++;
                            length = i8;
                            i11 = i9;
                            c3 = c2;
                            j9 = j8;
                            j10 = j7 >> i9;
                            obj = null;
                        }
                        c = c3;
                        j = j9;
                        int i19 = length;
                        if (i13 != i11) {
                            break;
                        } else {
                            length = i19;
                        }
                    } else {
                        c = c3;
                        j = j9;
                    }
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                    c3 = c;
                    j9 = j;
                    obj = null;
                    i11 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
            for (Object obj4 : values) {
                if (obj4 instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj4).invalidateForResult(null);
                } else {
                    addPendingInvalidationsLocked(obj4, forgetConditionalScopes);
                    Object obj5 = this.derivedStates.getMap().get(obj4);
                    if (obj5 != null) {
                        if (obj5 instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet2 = (MutableScatterSet) obj5;
                            Object[] objArr3 = mutableScatterSet2.elements;
                            long[] jArr7 = mutableScatterSet2.metadata;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j12 = jArr7[i];
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i20 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i21 = 0; i21 < i20; i21++) {
                                            if ((j12 & 255) < 128) {
                                                addPendingInvalidationsLocked((DerivedState) objArr3[(i << 3) + i21], forgetConditionalScopes);
                                            }
                                            j12 >>= 8;
                                        }
                                        if (i20 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length3 ? i + 1 : 0;
                                }
                            }
                        } else {
                            addPendingInvalidationsLocked((DerivedState) obj5, forgetConditionalScopes);
                        }
                    }
                }
            }
        }
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet3 = this.conditionallyInvalidatedScopes;
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet4 = this.invalidatedScopes;
        String str4 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        if (forgetConditionalScopes && mutableScatterSet3.isNotEmpty()) {
            MutableScatterMap<Object, Object> map = this.observations.getMap();
            long[] jArr8 = map.metadata;
            int length4 = jArr8.length - 2;
            if (length4 >= 0) {
                int i22 = 0;
                while (true) {
                    long j13 = jArr8[i22];
                    if ((((~j13) << c) & j13 & j) != j) {
                        int i23 = 8 - ((~(i22 - length4)) >>> 31);
                        int i24 = 0;
                        while (i24 < i23) {
                            if ((j13 & j3) < j2) {
                                int i25 = (i22 << 3) + i24;
                                Object obj6 = map.keys[i25];
                                Object obj7 = map.values[i25];
                                if (obj7 instanceof MutableScatterSet) {
                                    Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                    MutableScatterSet mutableScatterSet5 = (MutableScatterSet) obj7;
                                    Object[] objArr4 = mutableScatterSet5.elements;
                                    long[] jArr9 = mutableScatterSet5.metadata;
                                    jArr4 = jArr8;
                                    int length5 = jArr9.length - 2;
                                    if (length5 >= 0) {
                                        j5 = j13;
                                        int i26 = 0;
                                        while (true) {
                                            long j14 = jArr9[i26];
                                            i5 = length4;
                                            i6 = i22;
                                            if ((((~j14) << c) & j14 & j) != j) {
                                                int i27 = 8 - ((~(i26 - length5)) >>> 31);
                                                int i28 = 0;
                                                while (i28 < i27) {
                                                    if ((j14 & j3) < j2) {
                                                        i7 = i28;
                                                        int i29 = (i26 << 3) + i7;
                                                        j6 = j14;
                                                        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr4[i29];
                                                        if (mutableScatterSet3.contains(recomposeScopeImpl) || mutableScatterSet4.contains(recomposeScopeImpl)) {
                                                            mutableScatterSet5.removeElementAt(i29);
                                                        }
                                                    } else {
                                                        i7 = i28;
                                                        j6 = j14;
                                                    }
                                                    j14 = j6 >> 8;
                                                    i28 = i7 + 1;
                                                }
                                                if (i27 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i26 == length5) {
                                                break;
                                            }
                                            i26++;
                                            length4 = i5;
                                            i22 = i6;
                                        }
                                    } else {
                                        i5 = length4;
                                        i6 = i22;
                                        j5 = j13;
                                    }
                                    z = mutableScatterSet5.isEmpty();
                                } else {
                                    jArr4 = jArr8;
                                    i5 = length4;
                                    i6 = i22;
                                    j5 = j13;
                                    Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                    RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj7;
                                    z = mutableScatterSet3.contains(recomposeScopeImpl2) || mutableScatterSet4.contains(recomposeScopeImpl2);
                                }
                                if (z) {
                                    map.removeValueAt(i25);
                                }
                            } else {
                                jArr4 = jArr8;
                                i5 = length4;
                                i6 = i22;
                                j5 = j13;
                            }
                            j13 = j5 >> 8;
                            i24++;
                            jArr8 = jArr4;
                            length4 = i5;
                            i22 = i6;
                        }
                        jArr3 = jArr8;
                        int i30 = length4;
                        int i31 = i22;
                        if (i23 != 8) {
                            break;
                        }
                        length4 = i30;
                        i4 = i31;
                    } else {
                        jArr3 = jArr8;
                        i4 = i22;
                    }
                    if (i4 == length4) {
                        break;
                    }
                    i22 = i4 + 1;
                    jArr8 = jArr3;
                }
            }
            mutableScatterSet3.clear();
            cleanUpDerivedStateObservations();
            return;
        }
        if (mutableScatterSet4.isNotEmpty()) {
            MutableScatterMap<Object, Object> map2 = this.observations.getMap();
            long[] jArr10 = map2.metadata;
            int length6 = jArr10.length - 2;
            if (length6 >= 0) {
                int i32 = 0;
                while (true) {
                    long j15 = jArr10[i32];
                    if ((((~j15) << c) & j15 & j) != j) {
                        int i33 = 8 - ((~(i32 - length6)) >>> 31);
                        int i34 = 0;
                        while (i34 < i33) {
                            if ((j15 & j3) < j2) {
                                int i35 = (i32 << 3) + i34;
                                Object obj8 = map2.keys[i35];
                                Object obj9 = map2.values[i35];
                                if (obj9 instanceof MutableScatterSet) {
                                    Intrinsics.checkNotNull(obj9, str4);
                                    MutableScatterSet mutableScatterSet6 = (MutableScatterSet) obj9;
                                    Object[] objArr5 = mutableScatterSet6.elements;
                                    long[] jArr11 = mutableScatterSet6.metadata;
                                    int length7 = jArr11.length - 2;
                                    jArr2 = jArr10;
                                    if (length7 >= 0) {
                                        j4 = j15;
                                        int i36 = 0;
                                        while (true) {
                                            long j16 = jArr11[i36];
                                            long[] jArr12 = jArr11;
                                            i2 = length6;
                                            if ((((~j16) << c) & j16 & j) != j) {
                                                int i37 = 8 - ((~(i36 - length7)) >>> 31);
                                                int i38 = 0;
                                                while (i38 < i37) {
                                                    if ((j16 & j3) < j2) {
                                                        str3 = str4;
                                                        int i39 = (i36 << 3) + i38;
                                                        i3 = i38;
                                                        if (mutableScatterSet4.contains((RecomposeScopeImpl) objArr5[i39])) {
                                                            mutableScatterSet6.removeElementAt(i39);
                                                        }
                                                    } else {
                                                        str3 = str4;
                                                        i3 = i38;
                                                    }
                                                    j16 >>= 8;
                                                    i38 = i3 + 1;
                                                    str4 = str3;
                                                }
                                                str2 = str4;
                                                if (i37 != 8) {
                                                    break;
                                                }
                                            } else {
                                                str2 = str4;
                                            }
                                            if (i36 == length7) {
                                                break;
                                            }
                                            i36++;
                                            length6 = i2;
                                            jArr11 = jArr12;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = str4;
                                        i2 = length6;
                                        j4 = j15;
                                    }
                                    contains = mutableScatterSet6.isEmpty();
                                } else {
                                    jArr2 = jArr10;
                                    str2 = str4;
                                    i2 = length6;
                                    j4 = j15;
                                    Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                    contains = mutableScatterSet4.contains((RecomposeScopeImpl) obj9);
                                }
                                if (contains) {
                                    map2.removeValueAt(i35);
                                }
                            } else {
                                jArr2 = jArr10;
                                str2 = str4;
                                i2 = length6;
                                j4 = j15;
                            }
                            j15 = j4 >> 8;
                            i34++;
                            jArr10 = jArr2;
                            length6 = i2;
                            str4 = str2;
                        }
                        jArr = jArr10;
                        str = str4;
                        int i40 = length6;
                        if (i33 != 8) {
                            break;
                        } else {
                            length6 = i40;
                        }
                    } else {
                        jArr = jArr10;
                        str = str4;
                    }
                    if (i32 == length6) {
                        break;
                    }
                    i32++;
                    jArr10 = jArr;
                    str4 = str;
                }
            }
            cleanUpDerivedStateObservations();
            mutableScatterSet4.clear();
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(List<Pair<MovableContentStateReference, MovableContentStateReference>> references) {
        int size = references.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!Intrinsics.areEqual(references.get(i).getFirst().getComposition(), this)) {
                break;
            } else {
                i++;
            }
        }
        ComposerKt.runtimeCheck(z);
        try {
            this.composer.insertMovableContentReferences(references);
            Unit unit = Unit.INSTANCE;
        } finally {
        }
    }

    private final <T> T guardChanges(Function0<? extends T> block) {
        try {
            return block.invoke();
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                throw th;
            } catch (Exception e) {
                this.abandonChanges();
                throw e;
            }
        }
    }
}
