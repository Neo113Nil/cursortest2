package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.ObservableComposition;
import com.ironsource.C4834q2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Composition.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B'\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0013\u001a\u00020\u00102\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0015\u001a\u00020\u00102\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u0017J\u000f\u0010\u001d\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u0017J\u001f\u0010!\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"J%\u0010!\u001a\u00020\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0#2\u0006\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010%J\u000f\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010\u0017J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J!\u00100\u001a\u00020\u00182\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b0\u00101J)\u00105\u001a\u0002042\u0006\u0010.\u001a\u00020-2\u0006\u00103\u001a\u0002022\b\u0010/\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b5\u00106J\u001b\u0010:\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u001e07H\u0002¢\u0006\u0004\b8\u00109J\u0011\u0010<\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\b<\u0010=J\"\u0010>\u001a\u00020\u00102\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0016¢\u0006\u0004\b>\u0010\u0014J\"\u0010?\u001a\u00020\u00102\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0016¢\u0006\u0004\b?\u0010\u0014J\u000f\u0010A\u001a\u00020\u0010H\u0000¢\u0006\u0004\b@\u0010\u0017J\u000f\u0010B\u001a\u00020\u0010H\u0016¢\u0006\u0004\bB\u0010\u0017J\u001d\u0010C\u001a\u00020\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0#H\u0016¢\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\u00020\u00182\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0#H\u0016¢\u0006\u0004\bE\u0010FJ\u001d\u0010H\u001a\u00020\u00102\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\bH\u0010IJ)\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u001e0K0J2\u0006\u00103\u001a\u000202H\u0000¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\bO\u0010(J\u0017\u0010P\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\bP\u0010(J\u000f\u0010Q\u001a\u00020\u0018H\u0016¢\u0006\u0004\bQ\u0010\u001aJ+\u0010T\u001a\u00020\u00102\u001a\u0010S\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020R\u0012\u0006\u0012\u0004\u0018\u00010R0K0JH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010X\u001a\u00020\u00102\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u0010H\u0016¢\u0006\u0004\bZ\u0010\u0017J\u000f\u0010[\u001a\u00020\u0010H\u0016¢\u0006\u0004\b[\u0010\u0017J\u000f\u0010\\\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\\\u0010\u0017J\u000f\u0010]\u001a\u00020\u0010H\u0016¢\u0006\u0004\b]\u0010\u0017J\u000f\u0010^\u001a\u00020\u0010H\u0016¢\u0006\u0004\b^\u0010\u0017J5\u0010c\u001a\u00028\u0000\"\u0004\b\u0000\u0010_2\b\u0010`\u001a\u0004\u0018\u00010\u00012\u0006\u0010b\u001a\u00020a2\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\bc\u0010dJ!\u0010e\u001a\u0002042\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\be\u0010fJ\u0017\u0010g\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\bg\u0010hJ\u001f\u0010k\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\bi\u0010jJ\u001b\u0010o\u001a\u00020\u00102\n\u0010W\u001a\u0006\u0012\u0002\b\u00030lH\u0000¢\u0006\u0004\bm\u0010nR\u0017\u0010\b\u001a\u00020\u00078G¢\u0006\f\n\u0004\b\b\u0010p\u001a\u0004\bq\u0010rR\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010sR(\u0010v\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001e0tj\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e`u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010y\u001a\u00060\u001ej\u0002`x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR \u0010}\u001a\b\u0012\u0004\u0012\u00020|0{8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b}\u0010~\u0012\u0004\b\u007f\u0010\u0017R'\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0000X\u0080\u0004¢\u0006\u0017\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u0012\u0005\b\u0085\u0001\u0010\u0017\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R#\u0010\u0086\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020-078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020-0\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001e\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00020-0\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008a\u0001R'\u0010\u008c\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030l078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0087\u0001R\u0015\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b*\u0010\u008d\u0001R\u0017\u0010\u008e\u0001\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008d\u0001R#\u0010\u008f\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020-078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0087\u0001R%\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u001e078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0087\u0001R/\u0010\u0091\u0001\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u001e\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u0012\u0005\b\u0096\u0001\u0010\u0017\u001a\u0005\b\u0093\u0001\u0010\u001a\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001c\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001b\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0019\u0010\u009f\u0001\u001a\u00020a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R \u0010¢\u0001\u001a\u00030¡\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010§\u0001\u001a\u00030¦\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R \u0010ª\u0001\u001a\u00030©\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0019\u0010®\u0001\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001b\u0010°\u0001\u001a\u00020\u00188\u0006¢\u0006\u000f\n\u0006\b°\u0001\u0010\u0092\u0001\u001a\u0005\b°\u0001\u0010\u001aR\u0017\u0010W\u001a\u00020a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bW\u0010 \u0001R3\u0010±\u0001\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0005\bµ\u0001\u0010\u0014R\u0016\u0010·\u0001\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010\u001aR\u0013\u0010\f\u001a\u00020\u000b8F¢\u0006\b\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0016\u0010º\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010\u001aR\u0016\u0010»\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b»\u0001\u0010\u001aR\u0016\u0010½\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010\u001a¨\u0006¾\u0001"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/CompositionServices;", "Landroidx/compose/runtime/PausableComposition;", "Landroidx/compose/runtime/tooling/ObservableComposition;", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Applier;", "applier", "Lkotlin/coroutines/CoroutineContext;", "recomposeContext", "<init>", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "composeInitial", "(Lkotlin/jvm/functions/Function2;)V", "composeInitialWithReuse", "ensureRunning", "()V", "", "clearDeactivated", "()Z", "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "drainPendingModificationsOutOfBandLocked", "", "value", "forgetConditionalScopes", "addPendingInvalidationsLocked", "(Ljava/lang/Object;Z)V", "", "values", "(Ljava/util/Set;Z)V", "cleanUpDerivedStateObservations", "invalidateScopeOfLocked", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/changelist/ChangeList;", "changes", "applyChangesInLocked", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", C4834q2.p, "tryImminentInvalidation", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "Landroidx/compose/runtime/Anchor;", "anchor", "Landroidx/compose/runtime/InvalidationResult;", "invalidateChecked", "(Landroidx/compose/runtime/RecomposeScopeImpl;Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "Landroidx/compose/runtime/collection/ScopeMap;", "takeInvalidations-afanTW4", "()Landroidx/collection/MutableScatterMap;", "takeInvalidations", "Landroidx/compose/runtime/tooling/CompositionObserver;", "observer", "()Landroidx/compose/runtime/tooling/CompositionObserver;", "setContent", "composeContent", "updateMovingInvalidations$runtime", "updateMovingInvalidations", "dispose", "recordModificationsOf", "(Ljava/util/Set;)V", "observesAnyOf", "(Ljava/util/Set;)Z", "block", "prepareCompose", "(Lkotlin/jvm/functions/Function0;)V", "", "Lkotlin/Pair;", "extractInvalidationsOf$runtime", "(Landroidx/compose/runtime/Anchor;)Ljava/util/List;", "extractInvalidationsOf", "recordReadOf", "recordWriteOf", "recompose", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContent", "(Ljava/util/List;)V", "Landroidx/compose/runtime/MovableContentState;", "state", "disposeUnusedMovableContent", "(Landroidx/compose/runtime/MovableContentState;)V", "applyChanges", "applyLateChanges", "changesApplied", "abandonChanges", "invalidateAll", "R", "to", "", "groupIndex", "delegateInvalidations", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "invalidate", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "recomposeScopeReleased", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "removeObservation$runtime", "(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V", "removeObservation", "Landroidx/compose/runtime/DerivedState;", "removeDerivedStateObservation$runtime", "(Landroidx/compose/runtime/DerivedState;)V", "removeDerivedStateObservation", "Landroidx/compose/runtime/CompositionContext;", "getParent", "()Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Applier;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/platform/SynchronizedObject;", "lock", "Ljava/lang/Object;", "", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "Ljava/util/Set;", "getAbandonSet$annotations", "Landroidx/compose/runtime/SlotTable;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime$annotations", "observations", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableScatterSet;", "invalidatedScopes", "Landroidx/collection/MutableScatterSet;", "conditionallyInvalidatedScopes", "derivedStates", "Landroidx/compose/runtime/changelist/ChangeList;", "lateChanges", "observationsProcessed", "invalidations", "pendingInvalidScopes", "Z", "getPendingInvalidScopes$runtime", "setPendingInvalidScopes$runtime", "(Z)V", "getPendingInvalidScopes$runtime$annotations", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "Landroidx/compose/runtime/ShouldPauseCallback;", "Landroidx/compose/runtime/PausedCompositionImpl;", "pendingPausedComposition", "Landroidx/compose/runtime/PausedCompositionImpl;", "invalidationDelegate", "Landroidx/compose/runtime/CompositionImpl;", "invalidationDelegateGroup", "I", "Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime", "()Landroidx/compose/runtime/CompositionObserverHolder;", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "rememberManager", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "Landroidx/compose/runtime/ComposerImpl;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "getComposer$runtime", "()Landroidx/compose/runtime/ComposerImpl;", "_recomposeContext", "Lkotlin/coroutines/CoroutineContext;", "isRoot", "composable", "Lkotlin/jvm/functions/Function2;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "getAreChildrenComposing", "areChildrenComposing", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "isComposing", "isDisposed", "getHasInvalidations", "hasInvalidations", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices, PausableComposition, ObservableComposition {
    private final CoroutineContext _recomposeContext;
    private final Set abandonSet;
    private final Applier applier;
    private final ChangeList changes;
    private Function2 composable;
    private final ComposerImpl composer;
    private final MutableScatterSet conditionallyInvalidatedScopes;
    private final MutableScatterMap derivedStates;
    private final MutableScatterSet invalidatedScopes;
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;
    private MutableScatterMap invalidations;
    private final boolean isRoot;
    private final ChangeList lateChanges;
    private final Object lock;
    private final MutableScatterMap observations;
    private final MutableScatterMap observationsProcessed;
    private final CompositionObserverHolder observerHolder;
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;
    private final AtomicReference pendingModifications;
    private PausedCompositionImpl pendingPausedComposition;
    private final RememberEventDispatcher rememberManager;
    private ShouldPauseCallback shouldPause;
    private final SlotTable slotTable;
    private int state;

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(List references) {
        boolean z = true;
        int size = references.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (!Intrinsics.areEqual(((MovableContentStateReference) ((Pair) references.get(i)).getFirst()).getComposition(), this)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        try {
            this.composer.insertMovableContentReferences(references);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } catch (Throwable th2) {
                        rememberEventDispatcher.clear();
                        throw th2;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                abandonChanges();
                throw th3;
            }
        }
    }

    private final void addPendingInvalidationsLocked(Set values, boolean forgetConditionalScopes) {
        int i;
        String str;
        long[] jArr;
        int i2;
        String str2;
        long[] jArr2;
        int i3;
        int i4;
        int i5;
        boolean contains;
        Object[] objArr;
        int i6;
        String str3;
        Object[] objArr2;
        String str4;
        long[] jArr3;
        int i7;
        String str5;
        long[] jArr4;
        int i8;
        int i9;
        long j;
        boolean z;
        long[] jArr5;
        Object[] objArr3;
        int i10;
        long[] jArr6;
        Object[] objArr4;
        int i11;
        int i12;
        int i13;
        int i14;
        long j2 = 255;
        char c = 7;
        long j3 = -9187201950435737472L;
        int i15 = 8;
        if (values instanceof ScatterSetWrapper) {
            ScatterSet set = ((ScatterSetWrapper) values).getSet();
            Object[] objArr5 = set.elements;
            long[] jArr7 = set.metadata;
            int length = jArr7.length - 2;
            if (length >= 0) {
                int i16 = 0;
                while (true) {
                    long j4 = jArr7[i16];
                    if ((((~j4) << c) & j4 & j3) != j3) {
                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j4 & j2) < 128) {
                                Object obj = objArr5[(i16 << 3) + i18];
                                if (obj instanceof RecomposeScopeImpl) {
                                    ((RecomposeScopeImpl) obj).invalidateForResult(null);
                                    i12 = i17;
                                    i13 = i18;
                                } else {
                                    addPendingInvalidationsLocked(obj, forgetConditionalScopes);
                                    Object obj2 = this.derivedStates.get(obj);
                                    if (obj2 != null) {
                                        if (obj2 instanceof MutableScatterSet) {
                                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                            Object[] objArr6 = mutableScatterSet.elements;
                                            long[] jArr8 = mutableScatterSet.metadata;
                                            int length2 = jArr8.length - 2;
                                            if (length2 >= 0) {
                                                int i19 = 0;
                                                while (true) {
                                                    long j5 = jArr8[i19];
                                                    i12 = i17;
                                                    i13 = i18;
                                                    if ((((~j5) << c) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                                        for (int i21 = 0; i21 < i20; i21++) {
                                                            if ((j5 & 255) < 128) {
                                                                addPendingInvalidationsLocked((DerivedState) objArr6[(i19 << 3) + i21], forgetConditionalScopes);
                                                            }
                                                            j5 >>= 8;
                                                        }
                                                        if (i20 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i19 == length2) {
                                                        break;
                                                    }
                                                    i19++;
                                                    i17 = i12;
                                                    i18 = i13;
                                                    c = 7;
                                                }
                                            }
                                        } else {
                                            i12 = i17;
                                            i13 = i18;
                                            addPendingInvalidationsLocked((DerivedState) obj2, forgetConditionalScopes);
                                        }
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    i12 = i17;
                                    i13 = i18;
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                i14 = 8;
                            } else {
                                i12 = i17;
                                i13 = i18;
                                i14 = i15;
                            }
                            j4 >>= i14;
                            i15 = i14;
                            i18 = i13 + 1;
                            i17 = i12;
                            j2 = 255;
                            c = 7;
                        }
                        i11 = 1;
                        if (i17 != i15) {
                            break;
                        }
                    } else {
                        i11 = 1;
                    }
                    if (i16 == length) {
                        break;
                    }
                    i16 += i11;
                    j2 = 255;
                    c = 7;
                    j3 = -9187201950435737472L;
                    i15 = 8;
                }
            }
        } else {
            for (Object obj3 : values) {
                if (obj3 instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj3).invalidateForResult(null);
                } else {
                    addPendingInvalidationsLocked(obj3, forgetConditionalScopes);
                    Object obj4 = this.derivedStates.get(obj3);
                    if (obj4 != null) {
                        if (obj4 instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet2 = (MutableScatterSet) obj4;
                            Object[] objArr7 = mutableScatterSet2.elements;
                            long[] jArr9 = mutableScatterSet2.metadata;
                            int length3 = jArr9.length - 2;
                            if (length3 >= 0) {
                                int i22 = 0;
                                while (true) {
                                    long j6 = jArr9[i22];
                                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i23 = 8 - ((~(i22 - length3)) >>> 31);
                                        for (int i24 = 0; i24 < i23; i24++) {
                                            if ((j6 & 255) < 128) {
                                                addPendingInvalidationsLocked((DerivedState) objArr7[(i22 << 3) + i24], forgetConditionalScopes);
                                            }
                                            j6 >>= 8;
                                        }
                                        i = 1;
                                        if (i23 != 8) {
                                            break;
                                        }
                                    } else {
                                        i = 1;
                                    }
                                    if (i22 == length3) {
                                        break;
                                    } else {
                                        i22 += i;
                                    }
                                }
                            }
                        } else {
                            addPendingInvalidationsLocked((DerivedState) obj4, forgetConditionalScopes);
                        }
                    }
                    Unit unit3 = Unit.INSTANCE;
                }
            }
        }
        MutableScatterSet mutableScatterSet3 = this.conditionallyInvalidatedScopes;
        MutableScatterSet mutableScatterSet4 = this.invalidatedScopes;
        String str6 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        if (forgetConditionalScopes && mutableScatterSet3.isNotEmpty()) {
            MutableScatterMap mutableScatterMap = this.observations;
            long[] jArr10 = mutableScatterMap.metadata;
            int length4 = jArr10.length - 2;
            if (length4 >= 0) {
                int i25 = 0;
                while (true) {
                    long j7 = jArr10[i25];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i26 = 8 - ((~(i25 - length4)) >>> 31);
                        int i27 = 0;
                        while (i27 < i26) {
                            if ((j7 & 255) < 128) {
                                int i28 = (i25 << 3) + i27;
                                Object obj5 = mutableScatterMap.keys[i28];
                                Object obj6 = mutableScatterMap.values[i28];
                                if (obj6 instanceof MutableScatterSet) {
                                    Intrinsics.checkNotNull(obj6, str6);
                                    MutableScatterSet mutableScatterSet5 = (MutableScatterSet) obj6;
                                    Object[] objArr8 = mutableScatterSet5.elements;
                                    jArr4 = jArr10;
                                    long[] jArr11 = mutableScatterSet5.metadata;
                                    str5 = str6;
                                    int length5 = jArr11.length - 2;
                                    i8 = length4;
                                    i9 = i25;
                                    if (length5 >= 0) {
                                        int i29 = 0;
                                        while (true) {
                                            long j8 = jArr11[i29];
                                            j = j7;
                                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i30 = 8 - ((~(i29 - length5)) >>> 31);
                                                int i31 = 0;
                                                while (i31 < i30) {
                                                    if ((j8 & 255) < 128) {
                                                        jArr6 = jArr11;
                                                        int i32 = (i29 << 3) + i31;
                                                        objArr4 = objArr8;
                                                        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr8[i32];
                                                        if (mutableScatterSet3.contains(recomposeScopeImpl) || mutableScatterSet4.contains(recomposeScopeImpl)) {
                                                            mutableScatterSet5.removeElementAt(i32);
                                                        }
                                                    } else {
                                                        jArr6 = jArr11;
                                                        objArr4 = objArr8;
                                                    }
                                                    j8 >>= 8;
                                                    i31++;
                                                    jArr11 = jArr6;
                                                    objArr8 = objArr4;
                                                }
                                                jArr5 = jArr11;
                                                objArr3 = objArr8;
                                                i10 = 1;
                                                if (i30 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr5 = jArr11;
                                                objArr3 = objArr8;
                                                i10 = 1;
                                            }
                                            if (i29 == length5) {
                                                break;
                                            }
                                            i29 += i10;
                                            j7 = j;
                                            jArr11 = jArr5;
                                            objArr8 = objArr3;
                                        }
                                    } else {
                                        j = j7;
                                    }
                                    z = mutableScatterSet5.isEmpty();
                                } else {
                                    str5 = str6;
                                    jArr4 = jArr10;
                                    i8 = length4;
                                    i9 = i25;
                                    j = j7;
                                    Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj6;
                                    z = mutableScatterSet3.contains(recomposeScopeImpl2) || mutableScatterSet4.contains(recomposeScopeImpl2);
                                }
                                if (z) {
                                    mutableScatterMap.removeValueAt(i28);
                                }
                            } else {
                                str5 = str6;
                                jArr4 = jArr10;
                                i8 = length4;
                                i9 = i25;
                                j = j7;
                            }
                            j7 = j >> 8;
                            i27++;
                            str6 = str5;
                            length4 = i8;
                            jArr10 = jArr4;
                            i25 = i9;
                        }
                        str4 = str6;
                        jArr3 = jArr10;
                        int i33 = length4;
                        int i34 = i25;
                        if (i26 != 8) {
                            break;
                        }
                        length4 = i33;
                        i7 = i34;
                    } else {
                        str4 = str6;
                        jArr3 = jArr10;
                        i7 = i25;
                    }
                    if (i7 == length4) {
                        break;
                    }
                    i25 = i7 + 1;
                    str6 = str4;
                    jArr10 = jArr3;
                }
            }
            mutableScatterSet3.clear();
            cleanUpDerivedStateObservations();
            return;
        }
        String str7 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        if (mutableScatterSet4.isNotEmpty()) {
            MutableScatterMap mutableScatterMap2 = this.observations;
            long[] jArr12 = mutableScatterMap2.metadata;
            int length6 = jArr12.length - 2;
            if (length6 >= 0) {
                int i35 = 0;
                while (true) {
                    long j9 = jArr12[i35];
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i36 = 8 - ((~(i35 - length6)) >>> 31);
                        int i37 = 0;
                        while (i37 < i36) {
                            if ((j9 & 255) < 128) {
                                int i38 = (i35 << 3) + i37;
                                Object obj7 = mutableScatterMap2.keys[i38];
                                Object obj8 = mutableScatterMap2.values[i38];
                                if (obj8 instanceof MutableScatterSet) {
                                    String str8 = str7;
                                    Intrinsics.checkNotNull(obj8, str8);
                                    MutableScatterSet mutableScatterSet6 = (MutableScatterSet) obj8;
                                    Object[] objArr9 = mutableScatterSet6.elements;
                                    long[] jArr13 = mutableScatterSet6.metadata;
                                    int length7 = jArr13.length - 2;
                                    jArr2 = jArr12;
                                    i3 = length6;
                                    i4 = i35;
                                    if (length7 >= 0) {
                                        int i39 = 0;
                                        while (true) {
                                            long j10 = jArr13[i39];
                                            i5 = i36;
                                            long[] jArr14 = jArr13;
                                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i40 = 8 - ((~(i39 - length7)) >>> 31);
                                                int i41 = 0;
                                                while (i41 < i40) {
                                                    if ((j10 & 255) < 128) {
                                                        str3 = str8;
                                                        int i42 = (i39 << 3) + i41;
                                                        objArr2 = objArr9;
                                                        if (mutableScatterSet4.contains((RecomposeScopeImpl) objArr9[i42])) {
                                                            mutableScatterSet6.removeElementAt(i42);
                                                        }
                                                    } else {
                                                        str3 = str8;
                                                        objArr2 = objArr9;
                                                    }
                                                    j10 >>= 8;
                                                    i41++;
                                                    str8 = str3;
                                                    objArr9 = objArr2;
                                                }
                                                str2 = str8;
                                                objArr = objArr9;
                                                i6 = 1;
                                                if (i40 != 8) {
                                                    break;
                                                }
                                            } else {
                                                str2 = str8;
                                                objArr = objArr9;
                                                i6 = 1;
                                            }
                                            if (i39 == length7) {
                                                break;
                                            }
                                            i39 += i6;
                                            i36 = i5;
                                            jArr13 = jArr14;
                                            str8 = str2;
                                            objArr9 = objArr;
                                        }
                                    } else {
                                        str2 = str8;
                                        i5 = i36;
                                    }
                                    contains = mutableScatterSet6.isEmpty();
                                } else {
                                    str2 = str7;
                                    jArr2 = jArr12;
                                    i3 = length6;
                                    i4 = i35;
                                    i5 = i36;
                                    Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    contains = mutableScatterSet4.contains((RecomposeScopeImpl) obj8);
                                }
                                if (contains) {
                                    mutableScatterMap2.removeValueAt(i38);
                                }
                            } else {
                                str2 = str7;
                                jArr2 = jArr12;
                                i3 = length6;
                                i4 = i35;
                                i5 = i36;
                            }
                            j9 >>= 8;
                            i37++;
                            length6 = i3;
                            i35 = i4;
                            jArr12 = jArr2;
                            i36 = i5;
                            str7 = str2;
                        }
                        str = str7;
                        jArr = jArr12;
                        int i43 = length6;
                        int i44 = i35;
                        i2 = 1;
                        if (i36 != 8) {
                            break;
                        }
                        length6 = i43;
                        i35 = i44;
                    } else {
                        str = str7;
                        jArr = jArr12;
                        i2 = 1;
                    }
                    if (i35 == length6) {
                        break;
                    }
                    i35 += i2;
                    jArr12 = jArr;
                    str7 = str;
                }
            }
            cleanUpDerivedStateObservations();
            mutableScatterSet4.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return true;
     */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean observesAnyOf(Set values) {
        if (values instanceof ScatterSetWrapper) {
            ScatterSet set = ((ScatterSetWrapper) values).getSet();
            Object[] objArr = set.elements;
            long[] jArr = set.metadata;
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
                                if (ScopeMap.m1192containsimpl(this.observations, obj) || ScopeMap.m1192containsimpl(this.derivedStates, obj)) {
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
                if (ScopeMap.m1192containsimpl(this.observations, obj2) || ScopeMap.m1192containsimpl(this.derivedStates, obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext) {
        this.parent = compositionContext;
        this.applier = applier;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.pendingModifications = new AtomicReference(null);
        this.lock = new Object();
        int i = 0;
        int i2 = 1;
        Set asMutableSet = new MutableScatterSet(i, i2, defaultConstructorMarker).asMutableSet();
        this.abandonSet = asMutableSet;
        SlotTable slotTable = new SlotTable();
        if (compositionContext.getCollectingCallByInformation$runtime()) {
            slotTable.collectCalledByInformation();
        }
        if (compositionContext.getCollectingSourceInformation()) {
            slotTable.collectSourceInformation();
        }
        this.slotTable = slotTable;
        this.observations = ScopeMap.m1191constructorimpl$default(null, 1, null);
        this.invalidatedScopes = new MutableScatterSet(i, i2, defaultConstructorMarker);
        this.conditionallyInvalidatedScopes = new MutableScatterSet(i, i2, defaultConstructorMarker);
        this.derivedStates = ScopeMap.m1191constructorimpl$default(null, 1, null);
        ChangeList changeList = new ChangeList();
        this.changes = changeList;
        ChangeList changeList2 = new ChangeList();
        this.lateChanges = changeList2;
        this.observationsProcessed = ScopeMap.m1191constructorimpl$default(null, 1, null);
        this.invalidations = ScopeMap.m1191constructorimpl$default(null, 1, null);
        CompositionObserverHolder compositionObserverHolder = new CompositionObserverHolder(null, false, compositionContext, 3, null);
        this.observerHolder = compositionObserverHolder;
        this.rememberManager = new RememberEventDispatcher();
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, asMutableSet, changeList, changeList2, compositionObserverHolder, this);
        compositionContext.registerComposer$runtime(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = coroutineContext;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.getLambda$954879418$runtime();
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i & 4) != 0 ? null : coroutineContext);
    }

    /* renamed from: getSlotTable$runtime, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    /* renamed from: getObserverHolder$runtime, reason: from getter */
    public final CompositionObserverHolder getObserverHolder() {
        return this.observerHolder;
    }

    public final CoroutineContext getRecomposeContext() {
        CoroutineContext coroutineContext = this._recomposeContext;
        return coroutineContext == null ? this.parent.getRecomposeCoroutineContext$runtime() : coroutineContext;
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.state == 3;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(Function2 content) {
        boolean clearDeactivated = clearDeactivated();
        ensureRunning();
        if (clearDeactivated) {
            composeInitialWithReuse(content);
        } else {
            composeInitial(content);
        }
    }

    private final void composeInitial(Function2 content) {
        this.composable = content;
        this.parent.composeInitial$runtime(this, content);
    }

    private final void composeInitialWithReuse(Function2 content) {
        this.composer.startReuseFromRoot();
        composeInitial(content);
        this.composer.endReuseFromRoot();
    }

    private final void ensureRunning() {
        String str;
        int i = this.state;
        if (!(i == 0)) {
            if (i == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i == 2) {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            } else if (i == 3) {
                str = "The composition is disposed";
            } else {
                str = "";
            }
            PreconditionsKt.throwIllegalStateException(str);
        }
        if (this.pendingPausedComposition == null) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
    }

    private final boolean clearDeactivated() {
        boolean z;
        synchronized (this.lock) {
            z = true;
            if (this.state != 1) {
                z = false;
            }
            if (z) {
                this.state = 0;
            }
        }
        return z;
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object obj;
        Object obj2;
        AtomicReference atomicReference = this.pendingModifications;
        obj = CompositionKt.PendingApplyNoModifications;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            obj2 = CompositionKt.PendingApplyNoModifications;
            if (Intrinsics.areEqual(andSet, obj2)) {
                ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set) andSet, true);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    addPendingInvalidationsLocked(set, true);
                }
                return;
            }
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new KotlinNothingValueException();
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
            addPendingInvalidationsLocked((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        if (andSet == null) {
            ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new KotlinNothingValueException();
    }

    private final void drainPendingModificationsOutOfBandLocked() {
        Object obj;
        Object andSet = this.pendingModifications.getAndSet(SetsKt.emptySet());
        obj = CompositionKt.PendingApplyNoModifications;
        if (Intrinsics.areEqual(andSet, obj) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(Function2 content) {
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                try {
                    this.composer.m1093composeContentZbOJvo$runtime(m1098takeInvalidationsafanTW4(), content, this.shouldPause);
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } catch (Throwable th2) {
                        rememberEventDispatcher.clear();
                        throw th2;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                abandonChanges();
                throw th3;
            }
        }
    }

    public final void updateMovingInvalidations$runtime() {
        synchronized (this.lock) {
            drainPendingModificationsOutOfBandLocked();
            MutableScatterMap m1098takeInvalidationsafanTW4 = m1098takeInvalidationsafanTW4();
            try {
                this.composer.m1095updateComposerInvalidationsRY85e9Y(m1098takeInvalidationsafanTW4);
                Unit unit = Unit.INSTANCE;
            } finally {
            }
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            try {
                if (this.composer.getIsComposing()) {
                    PreconditionsKt.throwIllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.state != 3) {
                    this.state = 3;
                    this.composable = ComposableSingletons$CompositionKt.INSTANCE.getLambda$1918065384$runtime();
                    ChangeList deferredChanges = this.composer.getDeferredChanges();
                    if (deferredChanges != null) {
                        applyChangesInLocked(deferredChanges);
                    }
                    boolean z = this.slotTable.getGroupsSize() > 0;
                    if (z || !this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            if (z) {
                                this.applier.onBeginChanges();
                                SlotWriter openWriter = this.slotTable.openWriter();
                                try {
                                    ComposerKt.removeCurrentGroup(openWriter, this.rememberManager);
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
                            rememberEventDispatcher.clear();
                        } catch (Throwable th2) {
                            rememberEventDispatcher.clear();
                            throw th2;
                        }
                    }
                    this.composer.dispose$runtime();
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.parent.unregisterComposition$runtime(this);
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z;
        synchronized (this.lock) {
            z = ScopeMap.m1194getSizeimpl(this.invalidations) > 0;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.Set[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(Set values) {
        Object obj;
        Set set;
        Object obj2;
        do {
            obj = this.pendingModifications.get();
            if (obj != null) {
                obj2 = CompositionKt.PendingApplyNoModifications;
                if (!Intrinsics.areEqual(obj, obj2)) {
                    if (obj instanceof Set) {
                        set = new Set[]{obj, values};
                    } else {
                        if (!(obj instanceof Object[])) {
                            throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                        }
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                        set = ArraysKt.plus((Object[]) obj, (Object) values);
                    }
                }
            }
            set = values;
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.pendingModifications, obj, set));
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(Function0 block) {
        this.composer.prepareCompose$runtime(block);
    }

    public final List extractInvalidationsOf$runtime(Anchor anchor) {
        MutableScatterMap mutableScatterMap;
        long[] jArr;
        int i;
        MutableScatterMap mutableScatterMap2;
        long[] jArr2;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        char c;
        long j2;
        int i6;
        MutableScatterMap mutableScatterMap3;
        boolean z;
        long[] jArr3;
        Object[] objArr;
        long[] jArr4;
        MutableScatterMap mutableScatterMap4;
        int i7;
        Object[] objArr2;
        if (ScopeMap.m1194getSizeimpl(this.invalidations) > 0) {
            ArrayList arrayList = new ArrayList();
            SlotTable slotTable = this.slotTable;
            MutableScatterMap mutableScatterMap5 = this.invalidations;
            long[] jArr5 = mutableScatterMap5.metadata;
            int length = jArr5.length - 2;
            if (length < 0) {
                return arrayList;
            }
            int i8 = 0;
            while (true) {
                long j3 = jArr5[i8];
                char c2 = 7;
                long j4 = -9187201950435737472L;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8;
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j3 & 255) < 128) {
                            int i12 = (i8 << 3) + i11;
                            Object obj = mutableScatterMap5.keys[i12];
                            Object obj2 = mutableScatterMap5.values[i12];
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                            if (obj2 instanceof MutableScatterSet) {
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr3 = mutableScatterSet.elements;
                                long[] jArr6 = mutableScatterSet.metadata;
                                jArr2 = jArr5;
                                int length2 = jArr6.length - 2;
                                if (length2 >= 0) {
                                    i2 = length;
                                    i3 = i11;
                                    i4 = i8;
                                    int i13 = 0;
                                    while (true) {
                                        long j5 = jArr6[i13];
                                        j = j3;
                                        c = 7;
                                        j2 = -9187201950435737472L;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                            int i15 = 0;
                                            while (i15 < i14) {
                                                if ((j5 & 255) < 128) {
                                                    jArr4 = jArr6;
                                                    int i16 = (i13 << 3) + i15;
                                                    i7 = i10;
                                                    Object obj3 = objArr3[i16];
                                                    objArr2 = objArr3;
                                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                                                    mutableScatterMap4 = mutableScatterMap5;
                                                    Anchor anchor2 = recomposeScopeImpl.getAnchor();
                                                    if (anchor2 != null && slotTable.inGroup(anchor, anchor2)) {
                                                        arrayList.add(TuplesKt.to(recomposeScopeImpl, obj3));
                                                        mutableScatterSet.removeElementAt(i16);
                                                    }
                                                } else {
                                                    jArr4 = jArr6;
                                                    mutableScatterMap4 = mutableScatterMap5;
                                                    i7 = i10;
                                                    objArr2 = objArr3;
                                                }
                                                j5 >>= 8;
                                                i15++;
                                                i10 = i7;
                                                jArr6 = jArr4;
                                                objArr3 = objArr2;
                                                mutableScatterMap5 = mutableScatterMap4;
                                            }
                                            jArr3 = jArr6;
                                            mutableScatterMap3 = mutableScatterMap5;
                                            i5 = i10;
                                            objArr = objArr3;
                                            if (i14 != 8) {
                                                break;
                                            }
                                        } else {
                                            jArr3 = jArr6;
                                            mutableScatterMap3 = mutableScatterMap5;
                                            i5 = i10;
                                            objArr = objArr3;
                                        }
                                        if (i13 == length2) {
                                            break;
                                        }
                                        i13++;
                                        j3 = j;
                                        i10 = i5;
                                        jArr6 = jArr3;
                                        objArr3 = objArr;
                                        mutableScatterMap5 = mutableScatterMap3;
                                    }
                                } else {
                                    mutableScatterMap3 = mutableScatterMap5;
                                    i2 = length;
                                    i3 = i11;
                                    i4 = i8;
                                    j = j3;
                                    i5 = i10;
                                    c = 7;
                                    j2 = -9187201950435737472L;
                                }
                                z = mutableScatterSet.isEmpty();
                            } else {
                                mutableScatterMap3 = mutableScatterMap5;
                                jArr2 = jArr5;
                                i2 = length;
                                i3 = i11;
                                i4 = i8;
                                j = j3;
                                i5 = i10;
                                c = 7;
                                j2 = -9187201950435737472L;
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj;
                                Anchor anchor3 = recomposeScopeImpl2.getAnchor();
                                if (anchor3 == null || !slotTable.inGroup(anchor, anchor3)) {
                                    z = false;
                                } else {
                                    arrayList.add(TuplesKt.to(recomposeScopeImpl2, obj2));
                                    z = true;
                                }
                            }
                            if (z) {
                                mutableScatterMap2 = mutableScatterMap3;
                                mutableScatterMap2.removeValueAt(i12);
                            } else {
                                mutableScatterMap2 = mutableScatterMap3;
                            }
                            i6 = 8;
                        } else {
                            mutableScatterMap2 = mutableScatterMap5;
                            jArr2 = jArr5;
                            i2 = length;
                            i3 = i11;
                            i4 = i8;
                            j = j3;
                            i5 = i10;
                            c = c2;
                            j2 = j4;
                            i6 = i9;
                        }
                        j3 = j >> i6;
                        i11 = i3 + 1;
                        i9 = i6;
                        c2 = c;
                        j4 = j2;
                        jArr5 = jArr2;
                        length = i2;
                        i8 = i4;
                        i10 = i5;
                        mutableScatterMap5 = mutableScatterMap2;
                    }
                    mutableScatterMap = mutableScatterMap5;
                    jArr = jArr5;
                    int i17 = length;
                    int i18 = i8;
                    if (i10 != i9) {
                        return arrayList;
                    }
                    length = i17;
                    i = i18;
                } else {
                    mutableScatterMap = mutableScatterMap5;
                    jArr = jArr5;
                    i = i8;
                }
                if (i == length) {
                    return arrayList;
                }
                i8 = i + 1;
                mutableScatterMap5 = mutableScatterMap;
                jArr5 = jArr;
            }
        } else {
            return CollectionsKt.emptyList();
        }
    }

    private final void addPendingInvalidationsLocked(Object value, boolean forgetConditionalScopes) {
        Object obj = this.observations.get(value);
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
                            if (!ScopeMap.m1196removeimpl(this.observationsProcessed, value, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(value) != InvalidationResult.IGNORED) {
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
            if (ScopeMap.m1196removeimpl(this.observationsProcessed, value, recomposeScopeImpl2) || recomposeScopeImpl2.invalidateForResult(value) == InvalidationResult.IGNORED) {
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
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        int i4;
        boolean z;
        Object[] objArr;
        long[] jArr3;
        long[] jArr4;
        MutableScatterMap mutableScatterMap = this.derivedStates;
        long[] jArr5 = mutableScatterMap.metadata;
        int length = jArr5.length - 2;
        char c = 7;
        long j = -9187201950435737472L;
        int i5 = 8;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j2 = jArr5[i6];
                if ((((~j2) << c) & j2 & j) != j) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j2 & 255) < 128) {
                            int i9 = (i6 << 3) + i8;
                            Object obj = mutableScatterMap.keys[i9];
                            Object obj2 = mutableScatterMap.values[i9];
                            if (obj2 instanceof MutableScatterSet) {
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr2 = mutableScatterSet.elements;
                                long[] jArr6 = mutableScatterSet.metadata;
                                int length2 = jArr6.length - 2;
                                jArr2 = jArr5;
                                i2 = length;
                                if (length2 >= 0) {
                                    int i10 = 0;
                                    while (true) {
                                        long j3 = jArr6[i10];
                                        i3 = i6;
                                        Object[] objArr3 = objArr2;
                                        if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                int i13 = i12;
                                                Object[] objArr4 = objArr3;
                                                if ((j3 & 255) < 128) {
                                                    int i14 = (i10 << 3) + i13;
                                                    jArr4 = jArr6;
                                                    if (!ScopeMap.m1192containsimpl(this.observations, (DerivedState) objArr4[i14])) {
                                                        mutableScatterSet.removeElementAt(i14);
                                                    }
                                                } else {
                                                    jArr4 = jArr6;
                                                }
                                                j3 >>= 8;
                                                i12 = i13 + 1;
                                                jArr6 = jArr4;
                                                objArr3 = objArr4;
                                            }
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                            if (i11 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        jArr6 = jArr3;
                                        objArr2 = objArr;
                                        i6 = i3;
                                        c = 7;
                                    }
                                } else {
                                    i3 = i6;
                                }
                                z = mutableScatterSet.isEmpty();
                            } else {
                                jArr2 = jArr5;
                                i2 = length;
                                i3 = i6;
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                z = !ScopeMap.m1192containsimpl(this.observations, (DerivedState) obj2);
                            }
                            if (z) {
                                mutableScatterMap.removeValueAt(i9);
                            }
                            i4 = 8;
                        } else {
                            jArr2 = jArr5;
                            i2 = length;
                            i3 = i6;
                            i4 = i5;
                        }
                        j2 >>= i4;
                        i8++;
                        i5 = i4;
                        jArr5 = jArr2;
                        length = i2;
                        i6 = i3;
                        c = 7;
                    }
                    jArr = jArr5;
                    int i15 = length;
                    int i16 = i6;
                    if (i7 != i5) {
                        break;
                    }
                    length = i15;
                    i = i16;
                } else {
                    jArr = jArr5;
                    i = i6;
                }
                if (i == length) {
                    break;
                }
                i6 = i + 1;
                jArr5 = jArr;
                c = 7;
                j = -9187201950435737472L;
                i5 = 8;
            }
        }
        if (!this.conditionallyInvalidatedScopes.isNotEmpty()) {
            return;
        }
        MutableScatterSet mutableScatterSet2 = this.conditionallyInvalidatedScopes;
        Object[] objArr5 = mutableScatterSet2.elements;
        long[] jArr7 = mutableScatterSet2.metadata;
        int length3 = jArr7.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j4 = jArr7[i17];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j4 & 255) < 128) {
                        int i20 = (i17 << 3) + i19;
                        if (!((RecomposeScopeImpl) objArr5[i20]).isConditional()) {
                            mutableScatterSet2.removeElementAt(i20);
                        }
                    }
                    j4 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public void recordReadOf(Object value) {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        long[] jArr;
        long[] jArr2;
        int i;
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime = this.composer.getCurrentRecomposeScope$runtime()) == null) {
            return;
        }
        currentRecomposeScope$runtime.setUsed(true);
        boolean recordRead = currentRecomposeScope$runtime.recordRead(value);
        CompositionObserver observer = observer();
        if (observer != null) {
            observer.onReadInScope(currentRecomposeScope$runtime, value);
        }
        if (recordRead) {
            return;
        }
        if (value instanceof StateObjectImpl) {
            ((StateObjectImpl) value).m1226recordReadInh_f27i8$runtime(ReaderKind.m1215constructorimpl(1));
        }
        ScopeMap.m1188addimpl(this.observations, value, currentRecomposeScope$runtime);
        if (value instanceof DerivedState) {
            DerivedState derivedState = (DerivedState) value;
            DerivedState.Record currentRecord = derivedState.getCurrentRecord();
            ScopeMap.m1197removeScopeimpl(this.derivedStates, value);
            ObjectIntMap dependencies = currentRecord.getDependencies();
            Object[] objArr = dependencies.keys;
            long[] jArr3 = dependencies.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr3[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((j & 255) < 128) {
                                StateObject stateObject = (StateObject) objArr[(i2 << 3) + i5];
                                if (stateObject instanceof StateObjectImpl) {
                                    jArr2 = jArr3;
                                    ((StateObjectImpl) stateObject).m1226recordReadInh_f27i8$runtime(ReaderKind.m1215constructorimpl(1));
                                } else {
                                    jArr2 = jArr3;
                                }
                                ScopeMap.m1188addimpl(this.derivedStates, stateObject, value);
                                i = 8;
                            } else {
                                jArr2 = jArr3;
                                i = i3;
                            }
                            j >>= i;
                            i5++;
                            i3 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i4 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    jArr3 = jArr;
                }
            }
            currentRecomposeScope$runtime.recordDerivedStateValue(derivedState, currentRecord.getResult());
        }
    }

    private final void invalidateScopeOfLocked(Object value) {
        Object obj = this.observations.get(value);
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
                                ScopeMap.m1188addimpl(this.observationsProcessed, value, recomposeScopeImpl);
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
                ScopeMap.m1188addimpl(this.observationsProcessed, value, recomposeScopeImpl2);
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(Object value) {
        synchronized (this.lock) {
            try {
                invalidateScopeOfLocked(value);
                Object obj = this.derivedStates.get(value);
                if (obj != null) {
                    if (obj instanceof MutableScatterSet) {
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
                    } else {
                        invalidateScopeOfLocked((DerivedState) obj);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        synchronized (this.lock) {
            PausedCompositionImpl pausedCompositionImpl = this.pendingPausedComposition;
            if (pausedCompositionImpl != null && !pausedCompositionImpl.isRecomposing$runtime()) {
                pausedCompositionImpl.markIncomplete$runtime();
                return false;
            }
            drainPendingModificationsForCompositionLocked();
            try {
                MutableScatterMap m1098takeInvalidationsafanTW4 = m1098takeInvalidationsafanTW4();
                try {
                    boolean m1094recomposeaFTiNEg$runtime = this.composer.m1094recomposeaFTiNEg$runtime(m1098takeInvalidationsafanTW4, this.shouldPause);
                    if (!m1094recomposeaFTiNEg$runtime) {
                        drainPendingModificationsLocked();
                    }
                    return m1094recomposeaFTiNEg$runtime;
                } catch (Throwable th) {
                    this.invalidations = m1098takeInvalidationsafanTW4;
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (Throwable th3) {
                            rememberEventDispatcher.clear();
                            throw th3;
                        }
                    }
                    throw th2;
                } catch (Throwable th4) {
                    abandonChanges();
                    throw th4;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(MovableContentState state) {
        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
        try {
            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
            SlotWriter openWriter = state.getSlotTable().openWriter();
            try {
                ComposerKt.removeCurrentGroup(openWriter, this.rememberManager);
                Unit unit = Unit.INSTANCE;
                openWriter.close(true);
                rememberEventDispatcher.dispatchRememberObservers();
            } catch (Throwable th) {
                openWriter.close(false);
                throw th;
            }
        } finally {
            rememberEventDispatcher.clear();
        }
    }

    /* JADX WARN: Finally extract failed */
    private final void applyChangesInLocked(ChangeList changes) {
        Applier applier;
        RememberEventDispatcher rememberEventDispatcher;
        Object obj;
        Object obj2;
        int i;
        long[] jArr;
        long[] jArr2;
        int i2;
        char c;
        long j;
        int i3;
        boolean z;
        long[] jArr3;
        long[] jArr4;
        CompositionImpl compositionImpl = this;
        int i4 = 1;
        compositionImpl.rememberManager.prepare(compositionImpl.abandonSet, compositionImpl.composer.getErrorContext$runtime());
        try {
            if (!changes.isEmpty()) {
                Trace trace = Trace.INSTANCE;
                Object beginSection = trace.beginSection("Compose:applyChanges");
                try {
                    PausedCompositionImpl pausedCompositionImpl = compositionImpl.pendingPausedComposition;
                    if (pausedCompositionImpl == null || (applier = pausedCompositionImpl.getPausableApplier()) == null) {
                        applier = compositionImpl.applier;
                    }
                    PausedCompositionImpl pausedCompositionImpl2 = compositionImpl.pendingPausedComposition;
                    if (pausedCompositionImpl2 == null || (rememberEventDispatcher = pausedCompositionImpl2.getRememberManager()) == null) {
                        rememberEventDispatcher = compositionImpl.rememberManager;
                    }
                    applier.onBeginChanges();
                    SlotWriter openWriter = compositionImpl.slotTable.openWriter();
                    int i5 = 0;
                    try {
                        changes.executeAndFlushAllPendingChanges(applier, openWriter, rememberEventDispatcher, compositionImpl.composer.getErrorContext$runtime());
                        Unit unit = Unit.INSTANCE;
                        openWriter.close(true);
                        applier.onEndChanges();
                        trace.endSection(beginSection);
                        compositionImpl.rememberManager.dispatchRememberObservers();
                        compositionImpl.rememberManager.dispatchSideEffects();
                        if (compositionImpl.pendingInvalidScopes) {
                            try {
                                Object beginSection2 = trace.beginSection("Compose:unobserve");
                                try {
                                    compositionImpl.pendingInvalidScopes = false;
                                    MutableScatterMap mutableScatterMap = compositionImpl.observations;
                                    long[] jArr5 = mutableScatterMap.metadata;
                                    int length = jArr5.length - 2;
                                    if (length >= 0) {
                                        int i6 = 0;
                                        while (true) {
                                            try {
                                                long j2 = jArr5[i6];
                                                char c2 = 7;
                                                long j3 = -9187201950435737472L;
                                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i7 = 8;
                                                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                                                    int i9 = i5;
                                                    while (i9 < i8) {
                                                        if ((j2 & 255) < 128) {
                                                            int i10 = (i6 << 3) + i9;
                                                            Object obj3 = mutableScatterMap.keys[i10];
                                                            Object obj4 = mutableScatterMap.values[i10];
                                                            if (obj4 instanceof MutableScatterSet) {
                                                                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj4;
                                                                Object[] objArr = mutableScatterSet.elements;
                                                                long[] jArr6 = mutableScatterSet.metadata;
                                                                int length2 = jArr6.length - 2;
                                                                obj2 = beginSection2;
                                                                if (length2 >= 0) {
                                                                    int i11 = 0;
                                                                    while (true) {
                                                                        try {
                                                                            long j4 = jArr6[i11];
                                                                            jArr2 = jArr5;
                                                                            i2 = length;
                                                                            c = 7;
                                                                            j = -9187201950435737472L;
                                                                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                                                                int i13 = 0;
                                                                                while (i13 < i12) {
                                                                                    if ((j4 & 255) < 128) {
                                                                                        jArr4 = jArr6;
                                                                                        int i14 = (i11 << 3) + i13;
                                                                                        if (!((RecomposeScopeImpl) objArr[i14]).getValid()) {
                                                                                            mutableScatterSet.removeElementAt(i14);
                                                                                        }
                                                                                    } else {
                                                                                        jArr4 = jArr6;
                                                                                    }
                                                                                    j4 >>= 8;
                                                                                    i13++;
                                                                                    jArr6 = jArr4;
                                                                                }
                                                                                jArr3 = jArr6;
                                                                                if (i12 != 8) {
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                jArr3 = jArr6;
                                                                            }
                                                                            if (i11 == length2) {
                                                                                break;
                                                                            }
                                                                            i11++;
                                                                            jArr5 = jArr2;
                                                                            length = i2;
                                                                            jArr6 = jArr3;
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            obj = obj2;
                                                                            Trace.INSTANCE.endSection(obj);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } else {
                                                                    jArr2 = jArr5;
                                                                    i2 = length;
                                                                    c = c2;
                                                                    j = -9187201950435737472L;
                                                                }
                                                                z = mutableScatterSet.isEmpty();
                                                            } else {
                                                                obj2 = beginSection2;
                                                                jArr2 = jArr5;
                                                                i2 = length;
                                                                c = c2;
                                                                j = j3;
                                                                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                                z = !((RecomposeScopeImpl) obj4).getValid();
                                                            }
                                                            if (z) {
                                                                mutableScatterMap.removeValueAt(i10);
                                                            }
                                                            i3 = 8;
                                                        } else {
                                                            obj2 = beginSection2;
                                                            jArr2 = jArr5;
                                                            i2 = length;
                                                            c = c2;
                                                            j = j3;
                                                            i3 = i7;
                                                        }
                                                        j2 >>= i3;
                                                        i9++;
                                                        i7 = i3;
                                                        i4 = 1;
                                                        j3 = j;
                                                        c2 = c;
                                                        beginSection2 = obj2;
                                                        jArr5 = jArr2;
                                                        length = i2;
                                                    }
                                                    i = i4;
                                                    obj2 = beginSection2;
                                                    jArr = jArr5;
                                                    int i15 = length;
                                                    if (i8 != i7) {
                                                        break;
                                                    } else {
                                                        length = i15;
                                                    }
                                                } else {
                                                    i = i4;
                                                    obj2 = beginSection2;
                                                    jArr = jArr5;
                                                }
                                                if (i6 == length) {
                                                    break;
                                                }
                                                i6 += i;
                                                i4 = i;
                                                beginSection2 = obj2;
                                                jArr5 = jArr;
                                                i5 = 0;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                obj2 = beginSection2;
                                                obj = obj2;
                                                Trace.INSTANCE.endSection(obj);
                                                throw th;
                                            }
                                        }
                                    } else {
                                        obj2 = beginSection2;
                                    }
                                    cleanUpDerivedStateObservations();
                                    Unit unit2 = Unit.INSTANCE;
                                    Trace.INSTANCE.endSection(obj2);
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj = beginSection2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                compositionImpl = this;
                                try {
                                    if (compositionImpl.lateChanges.isEmpty() && compositionImpl.pendingPausedComposition == null) {
                                        compositionImpl.rememberManager.dispatchAbandons();
                                    }
                                    throw th;
                                } finally {
                                }
                            }
                        }
                        try {
                            if (this.lateChanges.isEmpty() && this.pendingPausedComposition == null) {
                                this.rememberManager.dispatchAbandons();
                            }
                            return;
                        } finally {
                            this.rememberManager.clear();
                        }
                    } catch (Throwable th5) {
                        openWriter.close(false);
                        throw th5;
                    }
                } finally {
                    Trace.INSTANCE.endSection(beginSection);
                }
            }
            try {
                if (compositionImpl.lateChanges.isEmpty() && compositionImpl.pendingPausedComposition == null) {
                    compositionImpl.rememberManager.dispatchAbandons();
                }
            } finally {
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (Throwable th2) {
                            rememberEventDispatcher.clear();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    abandonChanges();
                    throw th3;
                }
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
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (Throwable th2) {
                            rememberEventDispatcher.clear();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    abandonChanges();
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        RememberEventDispatcher rememberEventDispatcher;
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime();
                if (!this.abandonSet.isEmpty()) {
                    rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } finally {
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    abandonChanges();
                    throw th2;
                }
            }
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
        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
        try {
            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
            rememberEventDispatcher.dispatchAbandons();
        } finally {
            rememberEventDispatcher.clear();
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.lock) {
            try {
                for (Object obj : this.slotTable.getSlots()) {
                    RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.invalidate();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public Object delegateInvalidations(ControlledComposition to, int groupIndex, Function0 block) {
        if (to != null && !Intrinsics.areEqual(to, this) && groupIndex >= 0) {
            this.invalidationDelegate = (CompositionImpl) to;
            this.invalidationDelegateGroup = groupIndex;
            try {
                return block.mo4828invoke();
            } finally {
                this.invalidationDelegate = null;
                this.invalidationDelegateGroup = 0;
            }
        }
        return block.mo4828invoke();
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public InvalidationResult invalidate(RecomposeScopeImpl scope, Object instance) {
        CompositionObserver observer;
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
        InvalidationResult invalidateChecked = invalidateChecked(scope, anchor, instance);
        if (invalidateChecked != InvalidationResult.IGNORED && (observer = observer()) != null) {
            observer.onScopeInvalidated(scope, instance);
        }
        return invalidateChecked;
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(RecomposeScopeImpl scope) {
        this.pendingInvalidScopes = true;
        CompositionObserver observer = observer();
        if (observer != null) {
            observer.onScopeDisposed(scope);
        }
    }

    private final boolean tryImminentInvalidation(RecomposeScopeImpl scope, Object instance) {
        return isComposing() && this.composer.tryImminentInvalidation$runtime(scope, instance);
    }

    private final InvalidationResult invalidateChecked(RecomposeScopeImpl scope, Anchor anchor, Object instance) {
        int i;
        synchronized (this.lock) {
            try {
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
                    if (instance == null) {
                        ScopeMap.m1198setimpl(this.invalidations, scope, ScopeInvalidated.INSTANCE);
                    } else if (instance instanceof DerivedState) {
                        Object obj = this.invalidations.get(scope);
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
                                                if ((j & 255) >= 128) {
                                                    i = i3;
                                                } else {
                                                    if (objArr[(i2 << 3) + i5] == ScopeInvalidated.INSTANCE) {
                                                        break loop0;
                                                    }
                                                    i = 8;
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
                        ScopeMap.m1188addimpl(this.invalidations, scope, instance);
                    } else {
                        ScopeMap.m1198setimpl(this.invalidations, scope, ScopeInvalidated.INSTANCE);
                    }
                }
                if (compositionImpl2 != null) {
                    return compositionImpl2.invalidateChecked(scope, anchor, instance);
                }
                this.parent.invalidate$runtime(this);
                return isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void removeObservation$runtime(Object instance, RecomposeScopeImpl scope) {
        ScopeMap.m1196removeimpl(this.observations, instance, scope);
    }

    public final void removeDerivedStateObservation$runtime(DerivedState state) {
        if (ScopeMap.m1192containsimpl(this.observations, state)) {
            return;
        }
        ScopeMap.m1197removeScopeimpl(this.derivedStates, state);
    }

    /* renamed from: takeInvalidations-afanTW4, reason: not valid java name */
    private final MutableScatterMap m1098takeInvalidationsafanTW4() {
        MutableScatterMap mutableScatterMap = this.invalidations;
        this.invalidations = ScopeMap.m1191constructorimpl$default(null, 1, null);
        return mutableScatterMap;
    }

    private final CompositionObserver observer() {
        return this.observerHolder.current();
    }
}
