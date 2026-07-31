package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Swipeable.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 l*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001lB5\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u001b\u001a\u00020\r2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0013H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00028\u00002\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010\u000fJ\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R+\u00102\u001a\u00028\u00002\u0006\u0010+\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R+\u00104\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0005088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010-R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0005088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010-R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0005088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010-R\u001c\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010-RC\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00132\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00138@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010-\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u0016R&\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00130B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010E\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010K\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010F\u001a\u0004\bL\u0010H\"\u0004\bM\u0010JRO\u0010T\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050N2\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050N8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010-\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR+\u0010X\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010-\u001a\u0004\bV\u0010H\"\u0004\bW\u0010JR/\u0010_\u001a\u0004\u0018\u00010Y2\b\u0010+\u001a\u0004\u0018\u00010Y8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010-\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001a\u0010a\u001a\u00020`8\u0000X\u0080\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00050e8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u001a\u0010\u001c\u001a\u00028\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bj\u0010k\u001a\u0004\bi\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006m"}, d2 = {"Landroidx/compose/material/SwipeableState;", "T", "", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "target", "", "snapInternalToOffset", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "spec", "animateInternalToOffset", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "newAnchors", "ensureInit$material_release", "(Ljava/util/Map;)V", "ensureInit", "oldAnchors", "processNewAnchors$material_release", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processNewAnchors", "targetValue", "anim", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "velocity", "performFling", "delta", "performDrag", "(F)F", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec$material_release", "()Landroidx/compose/animation/core/AnimationSpec;", "Lkotlin/jvm/functions/Function1;", "getConfirmStateChange$material_release", "()Lkotlin/jvm/functions/Function1;", "<set-?>", "currentValue$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue", "isAnimationRunning$delegate", "isAnimationRunning", "()Z", "setAnimationRunning", "(Z)V", "Landroidx/compose/runtime/MutableState;", "offsetState", "overflowState", "absoluteOffset", "animationTarget", "anchors$delegate", "getAnchors$material_release", "()Ljava/util/Map;", "setAnchors$material_release", "anchors", "Lkotlinx/coroutines/flow/Flow;", "latestNonEmptyAnchorsFlow", "Lkotlinx/coroutines/flow/Flow;", "minBound", "F", "getMinBound$material_release", "()F", "setMinBound$material_release", "(F)V", "maxBound", "getMaxBound$material_release", "setMaxBound$material_release", "Lkotlin/Function2;", "thresholds$delegate", "getThresholds$material_release", "()Lkotlin/jvm/functions/Function2;", "setThresholds$material_release", "(Lkotlin/jvm/functions/Function2;)V", "thresholds", "velocityThreshold$delegate", "getVelocityThreshold$material_release", "setVelocityThreshold$material_release", "velocityThreshold", "Landroidx/compose/material/ResistanceConfig;", "resistance$delegate", "getResistance$material_release", "()Landroidx/compose/material/ResistanceConfig;", "setResistance$material_release", "(Landroidx/compose/material/ResistanceConfig;)V", "resistance", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", "offset", "getTargetValue", "getTargetValue$annotations", "()V", "Companion", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@Stable
@ExperimentalMaterialApi
/* loaded from: classes10.dex */
public class SwipeableState<T> {
    private final MutableState absoluteOffset;

    /* renamed from: anchors$delegate, reason: from kotlin metadata */
    private final MutableState anchors;
    private final AnimationSpec animationSpec;
    private final MutableState animationTarget;
    private final Function1 confirmStateChange;

    /* renamed from: currentValue$delegate, reason: from kotlin metadata */
    private final MutableState currentValue;
    private final DraggableState draggableState;

    /* renamed from: isAnimationRunning$delegate, reason: from kotlin metadata */
    private final MutableState isAnimationRunning;
    private final Flow latestNonEmptyAnchorsFlow;
    private float maxBound;
    private float minBound;
    private final MutableState offsetState;
    private final MutableState overflowState;

    /* renamed from: resistance$delegate, reason: from kotlin metadata */
    private final MutableState resistance;

    /* renamed from: thresholds$delegate, reason: from kotlin metadata */
    private final MutableState thresholds;

    /* renamed from: velocityThreshold$delegate, reason: from kotlin metadata */
    private final MutableState velocityThreshold;

    public SwipeableState(Object obj, AnimationSpec animationSpec, Function1 confirmStateChange) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.animationSpec = animationSpec;
        this.confirmStateChange = confirmStateChange;
        this.currentValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
        this.isAnimationRunning = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        Float valueOf = Float.valueOf(0.0f);
        this.offsetState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.overflowState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.absoluteOffset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.animationTarget = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
        final Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0(this) { // from class: androidx.compose.material.SwipeableState$latestNonEmptyAnchorsFlow$1
            final /* synthetic */ SwipeableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final Map<Float, T> mo4828invoke() {
                return this.this$0.getAnchors$material_release();
            }
        });
        this.latestNonEmptyAnchorsFlow = FlowKt.take(new Flow() { // from class: androidx.compose.material.SwipeableState$special$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", l = {224}, m = "emit")
                /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (!((Map) obj).isEmpty()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }, 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        this.thresholds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Function2() { // from class: androidx.compose.material.SwipeableState$thresholds$2
            @NotNull
            public final Float invoke(float f, float f2) {
                return Float.valueOf(0.0f);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                return invoke(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
            }
        }, null, 2, null);
        this.velocityThreshold = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.resistance = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggableState = DraggableKt.DraggableState(new Function1(this) { // from class: androidx.compose.material.SwipeableState$draggableState$1
            final /* synthetic */ SwipeableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke(((Number) obj2).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f) {
                MutableState mutableState;
                MutableState mutableState2;
                MutableState mutableState3;
                MutableState mutableState4;
                mutableState = ((SwipeableState) this.this$0).absoluteOffset;
                float floatValue = ((Number) mutableState.getValue()).floatValue() + f;
                float coerceIn = RangesKt.coerceIn(floatValue, this.this$0.getMinBound(), this.this$0.getMaxBound());
                float f2 = floatValue - coerceIn;
                ResistanceConfig resistance$material_release = this.this$0.getResistance$material_release();
                float computeResistance = resistance$material_release != null ? resistance$material_release.computeResistance(f2) : 0.0f;
                mutableState2 = ((SwipeableState) this.this$0).offsetState;
                mutableState2.setValue(Float.valueOf(coerceIn + computeResistance));
                mutableState3 = ((SwipeableState) this.this$0).overflowState;
                mutableState3.setValue(Float.valueOf(f2));
                mutableState4 = ((SwipeableState) this.this$0).absoluteOffset;
                mutableState4.setValue(Float.valueOf(floatValue));
            }
        });
    }

    public /* synthetic */ SwipeableState(Object obj, AnimationSpec animationSpec, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i & 4) != 0 ? new Function1() { // from class: androidx.compose.material.SwipeableState.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(T t) {
                return Boolean.TRUE;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke((AnonymousClass1) obj2);
            }
        } : function1);
    }

    /* renamed from: getAnimationSpec$material_release, reason: from getter */
    public final AnimationSpec getAnimationSpec() {
        return this.animationSpec;
    }

    /* renamed from: getConfirmStateChange$material_release, reason: from getter */
    public final Function1 getConfirmStateChange() {
        return this.confirmStateChange;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(Object obj) {
        this.currentValue.setValue(obj);
    }

    public final Object getCurrentValue() {
        return this.currentValue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationRunning(boolean z) {
        this.isAnimationRunning.setValue(Boolean.valueOf(z));
    }

    public final boolean isAnimationRunning() {
        return ((Boolean) this.isAnimationRunning.getValue()).booleanValue();
    }

    public final State getOffset() {
        return this.offsetState;
    }

    public final Map getAnchors$material_release() {
        return (Map) this.anchors.getValue();
    }

    public final void setAnchors$material_release(Map map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.anchors.setValue(map);
    }

    /* renamed from: getMinBound$material_release, reason: from getter */
    public final float getMinBound() {
        return this.minBound;
    }

    /* renamed from: getMaxBound$material_release, reason: from getter */
    public final float getMaxBound() {
        return this.maxBound;
    }

    public final void ensureInit$material_release(Map newAnchors) {
        Float offset;
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        if (getAnchors$material_release().isEmpty()) {
            offset = SwipeableKt.getOffset(newAnchors, getCurrentValue());
            if (offset == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.");
            }
            this.offsetState.setValue(offset);
            this.absoluteOffset.setValue(offset);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v21, types: [float] */
    /* JADX WARN: Type inference failed for: r10v76, types: [float] */
    /* JADX WARN: Type inference failed for: r10v78, types: [float] */
    /* JADX WARN: Type inference failed for: r10v83 */
    /* JADX WARN: Type inference failed for: r10v84 */
    /* JADX WARN: Type inference failed for: r10v85 */
    /* JADX WARN: Type inference failed for: r10v86 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processNewAnchors$material_release(Map map, Map map2, Continuation continuation) {
        SwipeableState$processNewAnchors$1 swipeableState$processNewAnchors$1;
        ?? r2;
        SwipeableState<T> swipeableState;
        Float offset;
        SwipeableState<T> swipeableState2;
        Float offset2;
        Float offset3;
        float f;
        float f2;
        try {
            if (continuation instanceof SwipeableState$processNewAnchors$1) {
                swipeableState$processNewAnchors$1 = (SwipeableState$processNewAnchors$1) continuation;
                int i = swipeableState$processNewAnchors$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    swipeableState$processNewAnchors$1.label = i - Integer.MIN_VALUE;
                    Object obj = swipeableState$processNewAnchors$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = swipeableState$processNewAnchors$1.label;
                    if (r2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (map.isEmpty()) {
                            Float minOrNull = CollectionsKt.minOrNull((Iterable) map2.keySet());
                            Intrinsics.checkNotNull(minOrNull);
                            this.minBound = minOrNull.floatValue();
                            Float maxOrNull = CollectionsKt.maxOrNull((Iterable) map2.keySet());
                            Intrinsics.checkNotNull(maxOrNull);
                            this.maxBound = maxOrNull.floatValue();
                            offset3 = SwipeableKt.getOffset(map2, getCurrentValue());
                            if (offset3 == null) {
                                throw new IllegalArgumentException("The initial value must have an associated anchor.");
                            }
                            float floatValue = offset3.floatValue();
                            swipeableState$processNewAnchors$1.label = 1;
                            if (snapInternalToOffset(floatValue, swipeableState$processNewAnchors$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        if (!Intrinsics.areEqual(map2, map)) {
                            this.minBound = Float.NEGATIVE_INFINITY;
                            this.maxBound = Float.POSITIVE_INFINITY;
                            Float f3 = (Float) this.animationTarget.getValue();
                            Object obj2 = null;
                            if (f3 != null) {
                                offset2 = SwipeableKt.getOffset(map2, map.get(f3));
                                if (offset2 != null) {
                                    map = offset2.floatValue();
                                } else {
                                    Iterator<T> it = map2.keySet().iterator();
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (it.hasNext()) {
                                            float abs = Math.abs(((Number) obj2).floatValue() - f3.floatValue());
                                            do {
                                                Object next = it.next();
                                                float abs2 = Math.abs(((Number) next).floatValue() - f3.floatValue());
                                                if (Float.compare(abs, abs2) > 0) {
                                                    obj2 = next;
                                                    abs = abs2;
                                                }
                                            } while (it.hasNext());
                                        }
                                    }
                                    Intrinsics.checkNotNull(obj2);
                                    map = ((Number) obj2).floatValue();
                                }
                            } else {
                                Object obj3 = map.get(getOffset().getValue());
                                if (Intrinsics.areEqual(obj3, getCurrentValue())) {
                                    obj3 = getCurrentValue();
                                }
                                offset = SwipeableKt.getOffset(map2, obj3);
                                if (offset != null) {
                                    map = offset.floatValue();
                                } else {
                                    Iterator<T> it2 = map2.keySet().iterator();
                                    if (it2.hasNext()) {
                                        obj2 = it2.next();
                                        if (it2.hasNext()) {
                                            float abs3 = Math.abs(((Number) obj2).floatValue() - ((Number) getOffset().getValue()).floatValue());
                                            do {
                                                Object next2 = it2.next();
                                                float abs4 = Math.abs(((Number) next2).floatValue() - ((Number) getOffset().getValue()).floatValue());
                                                if (Float.compare(abs3, abs4) > 0) {
                                                    obj2 = next2;
                                                    abs3 = abs4;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    }
                                    Intrinsics.checkNotNull(obj2);
                                    map = ((Number) obj2).floatValue();
                                }
                            }
                            try {
                                AnimationSpec animationSpec = this.animationSpec;
                                swipeableState$processNewAnchors$1.L$0 = this;
                                swipeableState$processNewAnchors$1.L$1 = map2;
                                swipeableState$processNewAnchors$1.F$0 = map;
                                swipeableState$processNewAnchors$1.label = 2;
                                if (animateInternalToOffset(map, animationSpec, swipeableState$processNewAnchors$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                swipeableState2 = this;
                                f = map;
                                swipeableState2.setCurrentValue(MapsKt.getValue(map2, Boxing.boxFloat(f)));
                                Float minOrNull2 = CollectionsKt.minOrNull((Iterable) map2.keySet());
                                Intrinsics.checkNotNull(minOrNull2);
                                swipeableState2.minBound = minOrNull2.floatValue();
                                Float maxOrNull2 = CollectionsKt.maxOrNull((Iterable) map2.keySet());
                                Intrinsics.checkNotNull(maxOrNull2);
                                swipeableState2.maxBound = maxOrNull2.floatValue();
                            } catch (CancellationException unused) {
                                swipeableState2 = this;
                                swipeableState$processNewAnchors$1.L$0 = swipeableState2;
                                swipeableState$processNewAnchors$1.L$1 = map2;
                                swipeableState$processNewAnchors$1.F$0 = map;
                                swipeableState$processNewAnchors$1.label = 3;
                                if (swipeableState2.snapInternalToOffset(map, swipeableState$processNewAnchors$1) != coroutine_suspended) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                swipeableState = this;
                                swipeableState.setCurrentValue(MapsKt.getValue(map2, Boxing.boxFloat(map)));
                                Float minOrNull3 = CollectionsKt.minOrNull((Iterable) map2.keySet());
                                Intrinsics.checkNotNull(minOrNull3);
                                swipeableState.minBound = minOrNull3.floatValue();
                                Float maxOrNull3 = CollectionsKt.maxOrNull((Iterable) map2.keySet());
                                Intrinsics.checkNotNull(maxOrNull3);
                                swipeableState.maxBound = maxOrNull3.floatValue();
                                throw th;
                            }
                        }
                    } else {
                        if (r2 == 1) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (r2 == 2) {
                            map = swipeableState$processNewAnchors$1.F$0;
                            map2 = (Map) swipeableState$processNewAnchors$1.L$1;
                            swipeableState2 = (SwipeableState) swipeableState$processNewAnchors$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                f = map;
                                swipeableState2.setCurrentValue(MapsKt.getValue(map2, Boxing.boxFloat(f)));
                                Float minOrNull22 = CollectionsKt.minOrNull((Iterable) map2.keySet());
                                Intrinsics.checkNotNull(minOrNull22);
                                swipeableState2.minBound = minOrNull22.floatValue();
                                Float maxOrNull22 = CollectionsKt.maxOrNull((Iterable) map2.keySet());
                                Intrinsics.checkNotNull(maxOrNull22);
                                swipeableState2.maxBound = maxOrNull22.floatValue();
                            } catch (CancellationException unused2) {
                                swipeableState$processNewAnchors$1.L$0 = swipeableState2;
                                swipeableState$processNewAnchors$1.L$1 = map2;
                                swipeableState$processNewAnchors$1.F$0 = map;
                                swipeableState$processNewAnchors$1.label = 3;
                                if (swipeableState2.snapInternalToOffset(map, swipeableState$processNewAnchors$1) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                swipeableState = swipeableState2;
                                f2 = map;
                                swipeableState.setCurrentValue(MapsKt.getValue(map2, Boxing.boxFloat(f2)));
                                Float minOrNull4 = CollectionsKt.minOrNull((Iterable) map2.keySet());
                                Intrinsics.checkNotNull(minOrNull4);
                                swipeableState.minBound = minOrNull4.floatValue();
                                Float maxOrNull4 = CollectionsKt.maxOrNull((Iterable) map2.keySet());
                                Intrinsics.checkNotNull(maxOrNull4);
                                swipeableState.maxBound = maxOrNull4.floatValue();
                                return Unit.INSTANCE;
                            }
                        } else if (r2 == 3) {
                            map = swipeableState$processNewAnchors$1.F$0;
                            map2 = (Map) swipeableState$processNewAnchors$1.L$1;
                            swipeableState = (SwipeableState) swipeableState$processNewAnchors$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                f2 = map;
                                swipeableState.setCurrentValue(MapsKt.getValue(map2, Boxing.boxFloat(f2)));
                                Float minOrNull42 = CollectionsKt.minOrNull((Iterable) map2.keySet());
                                Intrinsics.checkNotNull(minOrNull42);
                                swipeableState.minBound = minOrNull42.floatValue();
                                Float maxOrNull42 = CollectionsKt.maxOrNull((Iterable) map2.keySet());
                                Intrinsics.checkNotNull(maxOrNull42);
                                swipeableState.maxBound = maxOrNull42.floatValue();
                            } catch (Throwable th2) {
                                th = th2;
                                swipeableState.setCurrentValue(MapsKt.getValue(map2, Boxing.boxFloat(map)));
                                Float minOrNull32 = CollectionsKt.minOrNull((Iterable) map2.keySet());
                                Intrinsics.checkNotNull(minOrNull32);
                                swipeableState.minBound = minOrNull32.floatValue();
                                Float maxOrNull32 = CollectionsKt.maxOrNull((Iterable) map2.keySet());
                                Intrinsics.checkNotNull(maxOrNull32);
                                swipeableState.maxBound = maxOrNull32.floatValue();
                                throw th;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            if (r2 != 0) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            swipeableState = r2;
        }
        swipeableState$processNewAnchors$1 = new SwipeableState$processNewAnchors$1(this, continuation);
        Object obj4 = swipeableState$processNewAnchors$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = swipeableState$processNewAnchors$1.label;
    }

    public final Function2 getThresholds$material_release() {
        return (Function2) this.thresholds.getValue();
    }

    public final void setThresholds$material_release(Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.thresholds.setValue(function2);
    }

    public final float getVelocityThreshold$material_release() {
        return ((Number) this.velocityThreshold.getValue()).floatValue();
    }

    public final void setVelocityThreshold$material_release(float f) {
        this.velocityThreshold.setValue(Float.valueOf(f));
    }

    public final ResistanceConfig getResistance$material_release() {
        return (ResistanceConfig) this.resistance.getValue();
    }

    public final void setResistance$material_release(ResistanceConfig resistanceConfig) {
        this.resistance.setValue(resistanceConfig);
    }

    /* renamed from: getDraggableState$material_release, reason: from getter */
    public final DraggableState getDraggableState() {
        return this.draggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object snapInternalToOffset(float f, Continuation continuation) {
        Object drag$default = DraggableState.drag$default(this.draggableState, null, new SwipeableState$snapInternalToOffset$2(f, this, null), continuation, 1, null);
        return drag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateInternalToOffset(float f, AnimationSpec animationSpec, Continuation continuation) {
        Object drag$default = DraggableState.drag$default(this.draggableState, null, new SwipeableState$animateInternalToOffset$2(this, f, animationSpec, null), continuation, 1, null);
        return drag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : Unit.INSTANCE;
    }

    public final Object getTargetValue() {
        Float offset;
        float computeTarget;
        Float f = (Float) this.animationTarget.getValue();
        if (f != null) {
            computeTarget = f.floatValue();
        } else {
            float floatValue = ((Number) getOffset().getValue()).floatValue();
            offset = SwipeableKt.getOffset(getAnchors$material_release(), getCurrentValue());
            computeTarget = SwipeableKt.computeTarget(floatValue, offset != null ? offset.floatValue() : ((Number) getOffset().getValue()).floatValue(), getAnchors$material_release().keySet(), getThresholds$material_release(), 0.0f, Float.POSITIVE_INFINITY);
        }
        Object obj = getAnchors$material_release().get(Float.valueOf(computeTarget));
        return obj == null ? getCurrentValue() : obj;
    }

    public static /* synthetic */ Object animateTo$default(SwipeableState swipeableState, Object obj, AnimationSpec animationSpec, Continuation continuation, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i & 2) != 0) {
            animationSpec = swipeableState.animationSpec;
        }
        return swipeableState.animateTo(obj, animationSpec, continuation);
    }

    public final Object animateTo(Object obj, AnimationSpec animationSpec, Continuation continuation) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new SwipeableState$animateTo$2(obj, this, animationSpec), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public final Object performFling(final float f, Continuation continuation) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new FlowCollector() { // from class: androidx.compose.material.SwipeableState$performFling$2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Map map, Continuation continuation2) {
                Float offset;
                float computeTarget;
                Object animateInternalToOffset;
                offset = SwipeableKt.getOffset(map, SwipeableState.this.getCurrentValue());
                Intrinsics.checkNotNull(offset);
                float floatValue = offset.floatValue();
                computeTarget = SwipeableKt.computeTarget(((Number) SwipeableState.this.getOffset().getValue()).floatValue(), floatValue, map.keySet(), SwipeableState.this.getThresholds$material_release(), f, SwipeableState.this.getVelocityThreshold$material_release());
                Object obj = map.get(Boxing.boxFloat(computeTarget));
                if (obj != null && ((Boolean) SwipeableState.this.getConfirmStateChange().invoke(obj)).booleanValue()) {
                    Object animateTo$default = SwipeableState.animateTo$default(SwipeableState.this, obj, null, continuation2, 2, null);
                    return animateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : Unit.INSTANCE;
                }
                SwipeableState swipeableState = SwipeableState.this;
                animateInternalToOffset = swipeableState.animateInternalToOffset(floatValue, swipeableState.getAnimationSpec(), continuation2);
                return animateInternalToOffset == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateInternalToOffset : Unit.INSTANCE;
            }
        }, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public final float performDrag(float delta) {
        float coerceIn = RangesKt.coerceIn(((Number) this.absoluteOffset.getValue()).floatValue() + delta, this.minBound, this.maxBound) - ((Number) this.absoluteOffset.getValue()).floatValue();
        if (Math.abs(coerceIn) > 0.0f) {
            this.draggableState.dispatchRawDelta(coerceIn);
        }
        return coerceIn;
    }
}
