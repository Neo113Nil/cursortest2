package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Velocity;
import com.ironsource.X3;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a©\u0001\u0010\u0018\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2*\b\u0002\u0010\u0015\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00102*\b\u0002\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aÎ\u0001\u0010\u0018\u001a\u00020\u0007*\u00020\u00072\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001c2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a2*\b\u0002\u0010\u0015\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00102*\b\u0002\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u000bH\u0000ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010 \u001ac\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0001\u0018\u00010%*\u00020!2\u0018\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u00000\"2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001a0\"2\u0006\u0010$\u001a\u00020#2\u0006\u0010\n\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001aQ\u0010,\u001a\u00020\u000b*\u00020!2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010%2\u0006\u0010$\u001a\u00020#2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a\u001e\u0010.\u001a\u00020\u0012*\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a!\u00102\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u001a!\u00102\u001a\u00020\u0001*\u0002032\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00101\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Lkotlin/Function1;", "", "", "onDelta", "Landroidx/compose/foundation/gestures/DraggableState;", "DraggableState", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/Orientation;", X3.i.n, "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/coroutines/Continuation;", "", "onDragStarted", "onDragStopped", "reverseDirection", "draggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "Landroidx/compose/foundation/gestures/PointerAwareDraggableState;", "Landroidx/compose/runtime/Composable;", "stateFactory", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "canDrag", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "velocityTracker", "Lkotlin/Pair;", "awaitDownAndSlop", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dragStart", "Lkotlinx/coroutines/channels/SendChannel;", "Landroidx/compose/foundation/gestures/DragEvent;", "channel", "awaitDrag", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/Pair;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlinx/coroutines/channels/SendChannel;ZLandroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toOffset", "(FLandroidx/compose/foundation/gestures/Orientation;)J", "toFloat-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "toFloat", "Landroidx/compose/ui/unit/Velocity;", "toFloat-sF-c-tU", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DraggableKt {
    public static final DraggableState DraggableState(Function1 onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        return new DefaultDraggableState(onDelta);
    }

    public static final Modifier draggable(Modifier modifier, final Function2 stateFactory, final Function1 canDrag, final Orientation orientation, final boolean z, final MutableInteractionSource mutableInteractionSource, final Function0 startDragImmediately, final Function3 onDragStarted, final Function3 onDragStopped, final boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(stateFactory, "stateFactory");
        Intrinsics.checkNotNullParameter(canDrag, "canDrag");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(startDragImmediately, "startDragImmediately");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("draggable");
                inspectorInfo.getProperties().set("canDrag", Function1.this);
                inspectorInfo.getProperties().set(X3.i.n, orientation);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("startDragImmediately", startDragImmediately);
                inspectorInfo.getProperties().set("onDragStarted", onDragStarted);
                inspectorInfo.getProperties().set("onDragStopped", onDragStopped);
                inspectorInfo.getProperties().set("stateFactory", stateFactory);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-1487259950);
                PointerAwareDraggableState pointerAwareDraggableState = (PointerAwareDraggableState) Function2.this.invoke(composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (rememberedValue == companion.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState = (MutableState) rememberedValue;
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                EffectsKt.DisposableEffect(mutableInteractionSource2, new Function1() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final MutableState<DragInteraction.Start> mutableState2 = mutableState;
                        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                DragInteraction.Start start = (DragInteraction.Start) MutableState.this.getValue();
                                if (start != null) {
                                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                    if (mutableInteractionSource4 != null) {
                                        mutableInteractionSource4.tryEmit(new DragInteraction.Cancel(start));
                                    }
                                    MutableState.this.setValue(null);
                                }
                            }
                        };
                    }
                }, composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                Channel channel = (Channel) rememberedValue2;
                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(startDragImmediately, composer, 0);
                State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(canDrag, composer, 0);
                EffectsKt.LaunchedEffect(pointerAwareDraggableState, new AnonymousClass2(channel, pointerAwareDraggableState, SnapshotStateKt.rememberUpdatedState(new DragLogic(onDragStarted, onDragStopped, mutableState, mutableInteractionSource), composer, 0), null), composer, 0);
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) Modifier.INSTANCE, new Object[]{orientation, Boolean.valueOf(z), Boolean.valueOf(z2)}, (Function2) new AnonymousClass3(z, rememberUpdatedState2, rememberUpdatedState, orientation, channel, z2, null));
                composer.endReplaceableGroup();
                return pointerInput;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: invoke$lambda-2, reason: not valid java name */
            public static final DragLogic m262invoke$lambda2(State state) {
                return (DragLogic) state.getValue();
            }

            /* compiled from: Draggable.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", f = "Draggable.kt", l = {263}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3, reason: invalid class name */
            static final class AnonymousClass3 extends SuspendLambda implements Function2 {
                final /* synthetic */ State<Function1> $canDragState;
                final /* synthetic */ Channel $channel;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ Orientation $orientation;
                final /* synthetic */ boolean $reverseDirection;
                final /* synthetic */ State<Function0> $startImmediatelyState;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(boolean z, State<? extends Function1> state, State<? extends Function0> state2, Orientation orientation, Channel channel, boolean z2, Continuation continuation) {
                    super(2, continuation);
                    this.$enabled = z;
                    this.$canDragState = state;
                    this.$startImmediatelyState = state2;
                    this.$orientation = orientation;
                    this.$channel = channel;
                    this.$reverseDirection = z2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$enabled, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass3) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: Draggable.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1", f = "Draggable.kt", l = {265}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                    final /* synthetic */ PointerInputScope $$this$pointerInput;
                    final /* synthetic */ State<Function1> $canDragState;
                    final /* synthetic */ Channel $channel;
                    final /* synthetic */ Orientation $orientation;
                    final /* synthetic */ boolean $reverseDirection;
                    final /* synthetic */ State<Function0> $startImmediatelyState;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(PointerInputScope pointerInputScope, State<? extends Function1> state, State<? extends Function0> state2, Orientation orientation, Channel channel, boolean z, Continuation continuation) {
                        super(2, continuation);
                        this.$$this$pointerInput = pointerInputScope;
                        this.$canDragState = state;
                        this.$startImmediatelyState = state2;
                        this.$orientation = orientation;
                        this.$channel = channel;
                        this.$reverseDirection = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* compiled from: Draggable.kt */
                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1", f = "Draggable.kt", l = {268, 276}, m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C00101 extends RestrictedSuspendLambda implements Function2 {
                        final /* synthetic */ CoroutineScope $$this$coroutineScope;
                        final /* synthetic */ State<Function1> $canDragState;
                        final /* synthetic */ Channel $channel;
                        final /* synthetic */ Orientation $orientation;
                        final /* synthetic */ boolean $reverseDirection;
                        final /* synthetic */ State<Function0> $startImmediatelyState;
                        int I$0;
                        private /* synthetic */ Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        Object L$4;
                        boolean Z$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C00101(CoroutineScope coroutineScope, State<? extends Function1> state, State<? extends Function0> state2, Orientation orientation, Channel channel, boolean z, Continuation continuation) {
                            super(2, continuation);
                            this.$$this$coroutineScope = coroutineScope;
                            this.$canDragState = state;
                            this.$startImmediatelyState = state2;
                            this.$orientation = orientation;
                            this.$channel = channel;
                            this.$reverseDirection = z;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                            C00101 c00101 = new C00101(this.$$this$coroutineScope, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, continuation);
                            c00101.L$0 = obj;
                            return c00101;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                            return ((C00101) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: Can't wrap try/catch for region: R(7:26|27|28|29|30|31|(1:33)(7:34|9|(0)(0)|15|16|17|(2:61|62)(0))) */
                        /* JADX WARN: Code restructure failed: missing block: B:36:0x00f6, code lost:
                        
                            r0 = e;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:37:0x00f7, code lost:
                        
                            r7 = r14;
                            r6 = r15;
                            r3 = r16;
                            r4 = r17;
                            r2 = r18;
                            r5 = r19;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:53:0x00ed, code lost:
                        
                            r0 = th;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:54:0x00ee, code lost:
                        
                            r6 = r15;
                            r4 = r17;
                            r2 = r18;
                            r5 = r19;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:11:0x00d0  */
                        /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
                        /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
                        /* JADX WARN: Removed duplicated region for block: B:41:0x011a  */
                        /* JADX WARN: Removed duplicated region for block: B:42:0x0120 A[Catch: all -> 0x0121, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0121, blocks: (B:39:0x0114, B:42:0x0120), top: B:38:0x0114 }] */
                        /* JADX WARN: Removed duplicated region for block: B:46:0x0124  */
                        /* JADX WARN: Removed duplicated region for block: B:52:0x0138  */
                        /* JADX WARN: Removed duplicated region for block: B:60:0x013e  */
                        /* JADX WARN: Removed duplicated region for block: B:61:0x0141  */
                        /* JADX WARN: Removed duplicated region for block: B:64:0x00e5  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00bd -> B:9:0x00c8). Please report as a decompilation issue!!! */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x011a -> B:16:0x00ea). Please report as a decompilation issue!!! */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x013e -> B:17:0x005c). Please report as a decompilation issue!!! */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invokeSuspend(@NotNull Object obj) {
                            AwaitPointerEventScope awaitPointerEventScope;
                            Object obj2;
                            float m258toFloatsFctU;
                            VelocityTracker velocityTracker;
                            AwaitPointerEventScope awaitPointerEventScope2;
                            Object obj3;
                            Pair pair;
                            Orientation orientation;
                            boolean z;
                            Channel channel;
                            CoroutineScope coroutineScope;
                            Object awaitDrag;
                            Object obj4;
                            float m258toFloatsFctU2;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            int i2 = 0;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                if (CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                                }
                            } else if (i == 1) {
                                VelocityTracker velocityTracker2 = (VelocityTracker) this.L$1;
                                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                velocityTracker = velocityTracker2;
                                awaitPointerEventScope2 = awaitPointerEventScope3;
                                obj3 = obj;
                                pair = (Pair) obj3;
                                if (pair != null) {
                                }
                            } else if (i == 2) {
                                int i3 = this.I$0;
                                boolean z2 = this.Z$0;
                                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$4;
                                Orientation orientation2 = (Orientation) this.L$3;
                                Channel channel2 = (Channel) this.L$2;
                                VelocityTracker velocityTracker3 = (VelocityTracker) this.L$1;
                                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    awaitDrag = obj;
                                } catch (CancellationException e) {
                                    e = e;
                                    try {
                                        if (CoroutineScopeKt.isActive(coroutineScope2)) {
                                            throw e;
                                        }
                                        channel2.mo8216trySendJP2dKIU(DragEvent.DragCancelled.INSTANCE);
                                        awaitPointerEventScope = awaitPointerEventScope4;
                                        if (CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        if (i2 != 0) {
                                            m258toFloatsFctU = DraggableKt.m258toFloatsFctU(velocityTracker3.m1921calculateVelocity9UxMQ8M(), orientation2);
                                            obj2 = new DragEvent.DragStopped(m258toFloatsFctU * (z2 ? -1 : 1));
                                        } else {
                                            obj2 = DragEvent.DragCancelled.INSTANCE;
                                        }
                                        channel2.mo8216trySendJP2dKIU(obj2);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    i2 = i3;
                                    if (i2 != 0) {
                                    }
                                    channel2.mo8216trySendJP2dKIU(obj2);
                                    throw th;
                                }
                                if (!((Boolean) awaitDrag).booleanValue()) {
                                    m258toFloatsFctU2 = DraggableKt.m258toFloatsFctU(velocityTracker3.m1921calculateVelocity9UxMQ8M(), orientation2);
                                    obj4 = new DragEvent.DragStopped(m258toFloatsFctU2 * (z2 ? -1 : 1));
                                } else {
                                    obj4 = DragEvent.DragCancelled.INSTANCE;
                                }
                                channel2.mo8216trySendJP2dKIU(obj4);
                                awaitPointerEventScope = awaitPointerEventScope4;
                                if (CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                                    VelocityTracker velocityTracker4 = new VelocityTracker();
                                    State<Function1> state = this.$canDragState;
                                    State<Function0> state2 = this.$startImmediatelyState;
                                    Orientation orientation3 = this.$orientation;
                                    this.L$0 = awaitPointerEventScope;
                                    this.L$1 = velocityTracker4;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.label = 1;
                                    obj3 = DraggableKt.awaitDownAndSlop(awaitPointerEventScope, state, state2, velocityTracker4, orientation3, this);
                                    if (obj3 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    awaitPointerEventScope2 = awaitPointerEventScope;
                                    velocityTracker = velocityTracker4;
                                    pair = (Pair) obj3;
                                    if (pair != null) {
                                        awaitPointerEventScope = awaitPointerEventScope2;
                                        if (CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                                        }
                                    } else {
                                        Channel channel3 = this.$channel;
                                        boolean z3 = this.$reverseDirection;
                                        Orientation orientation4 = this.$orientation;
                                        CoroutineScope coroutineScope3 = this.$$this$coroutineScope;
                                        try {
                                        } catch (CancellationException e2) {
                                            e = e2;
                                            coroutineScope = coroutineScope3;
                                            orientation = orientation4;
                                            z = z3;
                                            channel = channel3;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            orientation = orientation4;
                                            z = z3;
                                            channel = channel3;
                                        }
                                        this.L$0 = awaitPointerEventScope2;
                                        this.L$1 = velocityTracker;
                                        this.L$2 = channel3;
                                        this.L$3 = orientation4;
                                        this.L$4 = coroutineScope3;
                                        this.Z$0 = z3;
                                        this.I$0 = 0;
                                        this.label = 2;
                                        coroutineScope = coroutineScope3;
                                        orientation = orientation4;
                                        z = z3;
                                        channel = channel3;
                                        awaitDrag = DraggableKt.awaitDrag(awaitPointerEventScope2, pair, velocityTracker, channel3, z3, orientation, this);
                                        if (awaitDrag == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        i3 = 0;
                                        awaitPointerEventScope4 = awaitPointerEventScope2;
                                        velocityTracker3 = velocityTracker;
                                        coroutineScope2 = coroutineScope;
                                        orientation2 = orientation;
                                        z2 = z;
                                        channel2 = channel;
                                        if (!((Boolean) awaitDrag).booleanValue()) {
                                        }
                                        channel2.mo8216trySendJP2dKIU(obj4);
                                        awaitPointerEventScope = awaitPointerEventScope4;
                                        if (CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(@NotNull Object obj) {
                        CoroutineScope coroutineScope;
                        CancellationException e;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                            try {
                                PointerInputScope pointerInputScope = this.$$this$pointerInput;
                                C00101 c00101 = new C00101(coroutineScope2, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, null);
                                this.L$0 = coroutineScope2;
                                this.label = 1;
                                if (pointerInputScope.awaitPointerEventScope(c00101, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } catch (CancellationException e2) {
                                coroutineScope = coroutineScope2;
                                e = e2;
                                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                                    throw e;
                                }
                                return Unit.INSTANCE;
                            }
                        } else if (i == 1) {
                            coroutineScope = (CoroutineScope) this.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                            } catch (CancellationException e3) {
                                e = e3;
                                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                                }
                                return Unit.INSTANCE;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        if (!this.$enabled) {
                            return Unit.INSTANCE;
                        }
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(pointerInputScope, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, null);
                        this.label = 1;
                        if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: Draggable.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", f = "Draggable.kt", l = {237, 239, 241, 251, 253, 257}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2, reason: invalid class name */
            static final class AnonymousClass2 extends SuspendLambda implements Function2 {
                final /* synthetic */ Channel $channel;
                final /* synthetic */ State<DragLogic> $dragLogic$delegate;
                final /* synthetic */ PointerAwareDraggableState $state;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(Channel channel, PointerAwareDraggableState pointerAwareDraggableState, State<DragLogic> state, Continuation continuation) {
                    super(2, continuation);
                    this.$channel = channel;
                    this.$state = pointerAwareDraggableState;
                    this.$dragLogic$delegate = state;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$channel, this.$state, this.$dragLogic$delegate, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: Draggable.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", f = "Draggable.kt", l = {246}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2, reason: invalid class name and collision with other inner class name */
                static final class C00092 extends SuspendLambda implements Function2 {
                    final /* synthetic */ Channel $channel;
                    final /* synthetic */ Ref$ObjectRef<DragEvent> $event;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00092(Ref$ObjectRef<DragEvent> ref$ObjectRef, Channel channel, Continuation continuation) {
                        super(2, continuation);
                        this.$event = ref$ObjectRef;
                        this.$channel = channel;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        C00092 c00092 = new C00092(this.$event, this.$channel, continuation);
                        c00092.L$0 = obj;
                        return c00092;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull PointerAwareDragScope pointerAwareDragScope, @Nullable Continuation continuation) {
                        return ((C00092) create(pointerAwareDragScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0056 -> B:5:0x0059). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(@NotNull Object obj) {
                        PointerAwareDragScope pointerAwareDragScope;
                        DragEvent dragEvent;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            pointerAwareDragScope = (PointerAwareDragScope) this.L$0;
                            dragEvent = this.$event.element;
                            if (dragEvent instanceof DragEvent.DragStopped) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (i == 1) {
                            Ref$ObjectRef<DragEvent> ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                            pointerAwareDragScope = (PointerAwareDragScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            T t = obj;
                            ref$ObjectRef.element = t;
                            dragEvent = this.$event.element;
                            if ((dragEvent instanceof DragEvent.DragStopped) && !(dragEvent instanceof DragEvent.DragCancelled)) {
                                DragEvent.DragDelta dragDelta = dragEvent instanceof DragEvent.DragDelta ? (DragEvent.DragDelta) dragEvent : null;
                                if (dragDelta != null) {
                                    pointerAwareDragScope.mo263dragByUv8p0NA(dragDelta.getDelta(), dragDelta.getPointerPosition());
                                }
                                ref$ObjectRef = this.$event;
                                Channel channel = this.$channel;
                                this.L$0 = pointerAwareDragScope;
                                this.L$1 = ref$ObjectRef;
                                this.label = 1;
                                Object receive = channel.receive(this);
                                t = receive;
                                if (receive == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ref$ObjectRef.element = t;
                                dragEvent = this.$event.element;
                                if (dragEvent instanceof DragEvent.DragStopped) {
                                }
                                return Unit.INSTANCE;
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:34:0x00d6, code lost:
                
                    r1 = r3;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00b8 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00c5 A[Catch: CancellationException -> 0x0036, TryCatch #1 {CancellationException -> 0x0036, blocks: (B:20:0x00a0, B:23:0x00b9, B:25:0x00c5, B:29:0x00d8, B:31:0x00dc, B:52:0x0031), top: B:51:0x0031 }] */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00d8 A[Catch: CancellationException -> 0x0036, TryCatch #1 {CancellationException -> 0x0036, blocks: (B:20:0x00a0, B:23:0x00b9, B:25:0x00c5, B:29:0x00d8, B:31:0x00dc, B:52:0x0031), top: B:51:0x0031 }] */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0100 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ea -> B:8:0x005c). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00fe -> B:7:0x00d6). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0101 -> B:8:0x005c). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(@NotNull Object obj) {
                    CoroutineScope coroutineScope;
                    Ref$ObjectRef ref$ObjectRef;
                    Ref$ObjectRef ref$ObjectRef2;
                    CoroutineScope coroutineScope2;
                    Ref$ObjectRef ref$ObjectRef3;
                    CoroutineScope coroutineScope3;
                    CoroutineScope coroutineScope4;
                    DragLogic m262invoke$lambda2;
                    T t;
                    PointerAwareDraggableState pointerAwareDraggableState;
                    MutatePriority mutatePriority;
                    C00092 c00092;
                    T t2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (this.label) {
                        case 0:
                            ResultKt.throwOnFailure(obj);
                            coroutineScope = (CoroutineScope) this.L$0;
                            if (CoroutineScopeKt.isActive(coroutineScope)) {
                                ref$ObjectRef = new Ref$ObjectRef();
                                Channel channel = this.$channel;
                                this.L$0 = coroutineScope;
                                this.L$1 = ref$ObjectRef;
                                this.L$2 = ref$ObjectRef;
                                this.label = 1;
                                Object receive = channel.receive(this);
                                if (receive == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                coroutineScope2 = coroutineScope;
                                t2 = receive;
                                ref$ObjectRef2 = ref$ObjectRef;
                                ref$ObjectRef.element = t2;
                                if (!(ref$ObjectRef2.element instanceof DragEvent.DragStarted)) {
                                    DragLogic m262invoke$lambda22 = DraggableKt$draggable$9.m262invoke$lambda2(this.$dragLogic$delegate);
                                    DragEvent.DragStarted dragStarted = (DragEvent.DragStarted) ref$ObjectRef2.element;
                                    this.L$0 = coroutineScope2;
                                    this.L$1 = ref$ObjectRef2;
                                    this.L$2 = null;
                                    this.label = 2;
                                    if (m262invoke$lambda22.processDragStart(coroutineScope2, dragStarted, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    ref$ObjectRef3 = ref$ObjectRef2;
                                    coroutineScope3 = coroutineScope2;
                                    pointerAwareDraggableState = this.$state;
                                    mutatePriority = MutatePriority.UserInput;
                                    c00092 = new C00092(ref$ObjectRef3, this.$channel, null);
                                    this.L$0 = coroutineScope3;
                                    this.L$1 = ref$ObjectRef3;
                                    this.label = 3;
                                    if (pointerAwareDraggableState.drag(mutatePriority, c00092, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    DragLogic m262invoke$lambda23 = DraggableKt$draggable$9.m262invoke$lambda2(this.$dragLogic$delegate);
                                    t = ref$ObjectRef3.element;
                                    if (t instanceof DragEvent.DragStopped) {
                                        this.L$0 = coroutineScope3;
                                        this.L$1 = null;
                                        this.label = 4;
                                        if (m262invoke$lambda23.processDragStop(coroutineScope3, (DragEvent.DragStopped) t, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        coroutineScope4 = coroutineScope3;
                                    } else if (!(t instanceof DragEvent.DragCancelled)) {
                                        coroutineScope = coroutineScope3;
                                        if (CoroutineScopeKt.isActive(coroutineScope)) {
                                            return Unit.INSTANCE;
                                        }
                                    } else {
                                        this.L$0 = coroutineScope3;
                                        this.L$1 = null;
                                        this.label = 5;
                                        if (m262invoke$lambda23.processDragCancel(coroutineScope3, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        coroutineScope4 = coroutineScope3;
                                    }
                                    coroutineScope = coroutineScope4;
                                    if (CoroutineScopeKt.isActive(coroutineScope)) {
                                    }
                                } else {
                                    coroutineScope = coroutineScope2;
                                    if (CoroutineScopeKt.isActive(coroutineScope)) {
                                    }
                                }
                            }
                            break;
                        case 1:
                            ref$ObjectRef = (Ref$ObjectRef) this.L$2;
                            ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
                            coroutineScope2 = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            t2 = obj;
                            ref$ObjectRef.element = t2;
                            if (!(ref$ObjectRef2.element instanceof DragEvent.DragStarted)) {
                            }
                            break;
                        case 2:
                            ref$ObjectRef3 = (Ref$ObjectRef) this.L$1;
                            coroutineScope3 = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            pointerAwareDraggableState = this.$state;
                            mutatePriority = MutatePriority.UserInput;
                            c00092 = new C00092(ref$ObjectRef3, this.$channel, null);
                            this.L$0 = coroutineScope3;
                            this.L$1 = ref$ObjectRef3;
                            this.label = 3;
                            if (pointerAwareDraggableState.drag(mutatePriority, c00092, this) == coroutine_suspended) {
                            }
                            DragLogic m262invoke$lambda232 = DraggableKt$draggable$9.m262invoke$lambda2(this.$dragLogic$delegate);
                            t = ref$ObjectRef3.element;
                            if (t instanceof DragEvent.DragStopped) {
                            }
                            coroutineScope = coroutineScope4;
                            if (CoroutineScopeKt.isActive(coroutineScope)) {
                            }
                            break;
                        case 3:
                            ref$ObjectRef3 = (Ref$ObjectRef) this.L$1;
                            coroutineScope3 = (CoroutineScope) this.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                            } catch (CancellationException unused) {
                                coroutineScope4 = coroutineScope3;
                                m262invoke$lambda2 = DraggableKt$draggable$9.m262invoke$lambda2(this.$dragLogic$delegate);
                                this.L$0 = coroutineScope4;
                                this.L$1 = null;
                                this.label = 6;
                                if (m262invoke$lambda2.processDragCancel(coroutineScope4, this) == coroutine_suspended) {
                                }
                                coroutineScope = coroutineScope4;
                                if (CoroutineScopeKt.isActive(coroutineScope)) {
                                }
                            }
                            DragLogic m262invoke$lambda2322 = DraggableKt$draggable$9.m262invoke$lambda2(this.$dragLogic$delegate);
                            t = ref$ObjectRef3.element;
                            if (t instanceof DragEvent.DragStopped) {
                            }
                            coroutineScope = coroutineScope4;
                            if (CoroutineScopeKt.isActive(coroutineScope)) {
                            }
                            break;
                        case 4:
                            coroutineScope4 = (CoroutineScope) this.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                            } catch (CancellationException unused2) {
                                m262invoke$lambda2 = DraggableKt$draggable$9.m262invoke$lambda2(this.$dragLogic$delegate);
                                this.L$0 = coroutineScope4;
                                this.L$1 = null;
                                this.label = 6;
                                if (m262invoke$lambda2.processDragCancel(coroutineScope4, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                coroutineScope = coroutineScope4;
                                if (CoroutineScopeKt.isActive(coroutineScope)) {
                                }
                            }
                            coroutineScope = coroutineScope4;
                            if (CoroutineScopeKt.isActive(coroutineScope)) {
                            }
                            break;
                        case 5:
                            coroutineScope4 = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            coroutineScope = coroutineScope4;
                            if (CoroutineScopeKt.isActive(coroutineScope)) {
                            }
                            break;
                        case 6:
                            coroutineScope4 = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            coroutineScope = coroutineScope4;
                            if (CoroutineScopeKt.isActive(coroutineScope)) {
                            }
                            break;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
        });
    }

    public static final Modifier draggable(Modifier modifier, final DraggableState state, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, final boolean z2, Function3 onDragStarted, Function3 onDragStopped, boolean z3) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        return draggable(modifier, new Function2() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$3
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((Composer) obj, ((Number) obj2).intValue());
            }

            @Composable
            @NotNull
            public final PointerAwareDraggableState invoke(@Nullable Composer composer, int i) {
                composer.startReplaceableGroup(830271906);
                DraggableState draggableState = DraggableState.this;
                composer.startReplaceableGroup(1157296644);
                boolean changed = composer.changed(draggableState);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new IgnorePointerDraggableState(draggableState);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                IgnorePointerDraggableState ignorePointerDraggableState = (IgnorePointerDraggableState) rememberedValue;
                composer.endReplaceableGroup();
                return ignorePointerDraggableState;
            }
        }, new Function1() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$4
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull PointerInputChange it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.TRUE;
            }
        }, orientation, z, mutableInteractionSource, new Function0() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final Boolean mo4828invoke() {
                return Boolean.valueOf(z2);
            }
        }, onDragStarted, onDragStopped, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitDownAndSlop(AwaitPointerEventScope awaitPointerEventScope, State state, State state2, VelocityTracker velocityTracker, Orientation orientation, Continuation continuation) {
        DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$1;
        int i;
        PointerInputChange pointerInputChange;
        AwaitPointerEventScope awaitPointerEventScope2;
        final VelocityTracker velocityTracker2;
        Orientation orientation2;
        Ref$FloatRef ref$FloatRef;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DraggableKt$awaitDownAndSlop$1) {
            draggableKt$awaitDownAndSlop$1 = (DraggableKt$awaitDownAndSlop$1) continuation;
            int i2 = draggableKt$awaitDownAndSlop$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                draggableKt$awaitDownAndSlop$1.label = i2 - Integer.MIN_VALUE;
                DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$12 = draggableKt$awaitDownAndSlop$1;
                Object obj = draggableKt$awaitDownAndSlop$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = draggableKt$awaitDownAndSlop$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerEventPass pointerEventPass = PointerEventPass.Initial;
                    draggableKt$awaitDownAndSlop$12.L$0 = awaitPointerEventScope;
                    draggableKt$awaitDownAndSlop$12.L$1 = state;
                    draggableKt$awaitDownAndSlop$12.L$2 = state2;
                    draggableKt$awaitDownAndSlop$12.L$3 = velocityTracker;
                    draggableKt$awaitDownAndSlop$12.L$4 = orientation;
                    draggableKt$awaitDownAndSlop$12.label = 1;
                    obj = TapGestureDetectorKt.awaitFirstDownOnPass(awaitPointerEventScope, pointerEventPass, false, draggableKt$awaitDownAndSlop$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    orientation = (Orientation) draggableKt$awaitDownAndSlop$12.L$4;
                    velocityTracker = (VelocityTracker) draggableKt$awaitDownAndSlop$12.L$3;
                    state2 = (State) draggableKt$awaitDownAndSlop$12.L$2;
                    state = (State) draggableKt$awaitDownAndSlop$12.L$1;
                    awaitPointerEventScope = (AwaitPointerEventScope) draggableKt$awaitDownAndSlop$12.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    orientation2 = (Orientation) draggableKt$awaitDownAndSlop$12.L$2;
                    velocityTracker2 = (VelocityTracker) draggableKt$awaitDownAndSlop$12.L$1;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) draggableKt$awaitDownAndSlop$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                    VelocityTrackerKt.addPointerInputChange(velocityTracker2, pointerInputChange3);
                    final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    Function2 function2 = new Function2() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((PointerInputChange) obj2, ((Number) obj3).floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull PointerInputChange event, float f) {
                            Intrinsics.checkNotNullParameter(event, "event");
                            VelocityTrackerKt.addPointerInputChange(VelocityTracker.this, event);
                            event.consume();
                            ref$FloatRef2.element = f;
                        }
                    };
                    if (orientation2 != Orientation.Vertical) {
                        long id = pointerInputChange3.getId();
                        int type = pointerInputChange3.getType();
                        draggableKt$awaitDownAndSlop$12.L$0 = ref$FloatRef2;
                        draggableKt$awaitDownAndSlop$12.L$1 = null;
                        draggableKt$awaitDownAndSlop$12.L$2 = null;
                        draggableKt$awaitDownAndSlop$12.label = 3;
                        obj = DragGestureDetectorKt.m235awaitVerticalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope2, id, type, function2, draggableKt$awaitDownAndSlop$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ref$FloatRef = ref$FloatRef2;
                        pointerInputChange2 = (PointerInputChange) obj;
                        if (pointerInputChange2 == null) {
                        }
                    } else {
                        long id2 = pointerInputChange3.getId();
                        int type2 = pointerInputChange3.getType();
                        draggableKt$awaitDownAndSlop$12.L$0 = ref$FloatRef2;
                        draggableKt$awaitDownAndSlop$12.L$1 = null;
                        draggableKt$awaitDownAndSlop$12.L$2 = null;
                        draggableKt$awaitDownAndSlop$12.label = 4;
                        obj = DragGestureDetectorKt.m231awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope2, id2, type2, function2, draggableKt$awaitDownAndSlop$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ref$FloatRef = ref$FloatRef2;
                        pointerInputChange2 = (PointerInputChange) obj;
                        if (pointerInputChange2 == null) {
                        }
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ref$FloatRef = (Ref$FloatRef) draggableKt$awaitDownAndSlop$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        pointerInputChange2 = (PointerInputChange) obj;
                        if (pointerInputChange2 == null) {
                            return TuplesKt.to(pointerInputChange2, Boxing.boxFloat(ref$FloatRef.element));
                        }
                        return null;
                    }
                    ref$FloatRef = (Ref$FloatRef) draggableKt$awaitDownAndSlop$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    pointerInputChange2 = (PointerInputChange) obj;
                    if (pointerInputChange2 == null) {
                    }
                }
                pointerInputChange = (PointerInputChange) obj;
                if (((Boolean) ((Function1) state.getValue()).invoke(pointerInputChange)).booleanValue()) {
                    return null;
                }
                if (((Boolean) ((Function0) state2.getValue()).mo4828invoke()).booleanValue()) {
                    pointerInputChange.consume();
                    VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
                    return TuplesKt.to(pointerInputChange, Boxing.boxFloat(0.0f));
                }
                draggableKt$awaitDownAndSlop$12.L$0 = awaitPointerEventScope;
                draggableKt$awaitDownAndSlop$12.L$1 = velocityTracker;
                draggableKt$awaitDownAndSlop$12.L$2 = orientation;
                draggableKt$awaitDownAndSlop$12.L$3 = null;
                draggableKt$awaitDownAndSlop$12.L$4 = null;
                draggableKt$awaitDownAndSlop$12.label = 2;
                obj = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, draggableKt$awaitDownAndSlop$12);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                awaitPointerEventScope2 = awaitPointerEventScope;
                velocityTracker2 = velocityTracker;
                orientation2 = orientation;
                PointerInputChange pointerInputChange32 = (PointerInputChange) obj;
                VelocityTrackerKt.addPointerInputChange(velocityTracker2, pointerInputChange32);
                final Ref$FloatRef ref$FloatRef22 = new Ref$FloatRef();
                Function2 function22 = new Function2() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((PointerInputChange) obj2, ((Number) obj3).floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull PointerInputChange event, float f) {
                        Intrinsics.checkNotNullParameter(event, "event");
                        VelocityTrackerKt.addPointerInputChange(VelocityTracker.this, event);
                        event.consume();
                        ref$FloatRef22.element = f;
                    }
                };
                if (orientation2 != Orientation.Vertical) {
                }
            }
        }
        draggableKt$awaitDownAndSlop$1 = new DraggableKt$awaitDownAndSlop$1(continuation);
        DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$122 = draggableKt$awaitDownAndSlop$1;
        Object obj2 = draggableKt$awaitDownAndSlop$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = draggableKt$awaitDownAndSlop$122.label;
        if (i != 0) {
        }
        pointerInputChange = (PointerInputChange) obj2;
        if (((Boolean) ((Function1) state.getValue()).invoke(pointerInputChange)).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitDrag(AwaitPointerEventScope awaitPointerEventScope, Pair pair, final VelocityTracker velocityTracker, final SendChannel sendChannel, final boolean z, final Orientation orientation, Continuation continuation) {
        float floatValue = ((Number) pair.getSecond()).floatValue();
        PointerInputChange pointerInputChange = (PointerInputChange) pair.getFirst();
        long m1301minusMKHz9U = Offset.m1301minusMKHz9U(pointerInputChange.getPosition(), Offset.m1303timestuRUvjQ(toOffset(floatValue, orientation), Math.signum(m257toFloat3MmeM6k(pointerInputChange.getPosition(), orientation))));
        sendChannel.mo8216trySendJP2dKIU(new DragEvent.DragStarted(m1301minusMKHz9U, null));
        if (z) {
            floatValue *= -1;
        }
        sendChannel.mo8216trySendJP2dKIU(new DragEvent.DragDelta(floatValue, m1301minusMKHz9U, null));
        Function1 function1 = new Function1() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDrag$dragTick$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PointerInputChange) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PointerInputChange event) {
                float m257toFloat3MmeM6k;
                Intrinsics.checkNotNullParameter(event, "event");
                VelocityTrackerKt.addPointerInputChange(VelocityTracker.this, event);
                m257toFloat3MmeM6k = DraggableKt.m257toFloat3MmeM6k(PointerEventKt.positionChange(event), orientation);
                event.consume();
                SendChannel sendChannel2 = sendChannel;
                if (z) {
                    m257toFloat3MmeM6k *= -1;
                }
                sendChannel2.mo8216trySendJP2dKIU(new DragEvent.DragDelta(m257toFloat3MmeM6k, event.getPosition(), null));
            }
        };
        if (orientation == Orientation.Vertical) {
            return DragGestureDetectorKt.m241verticalDragjO51t88(awaitPointerEventScope, pointerInputChange.getId(), function1, continuation);
        }
        return DragGestureDetectorKt.m238horizontalDragjO51t88(awaitPointerEventScope, pointerInputChange.getId(), function1, continuation);
    }

    private static final long toOffset(float f, Orientation orientation) {
        return orientation == Orientation.Vertical ? OffsetKt.Offset(0.0f, f) : OffsetKt.Offset(f, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-3MmeM6k, reason: not valid java name */
    public static final float m257toFloat3MmeM6k(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Offset.m1298getYimpl(j) : Offset.m1297getXimpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-sF-c-tU, reason: not valid java name */
    public static final float m258toFloatsFctU(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m2606getYimpl(j) : Velocity.m2605getXimpl(j);
    }
}
