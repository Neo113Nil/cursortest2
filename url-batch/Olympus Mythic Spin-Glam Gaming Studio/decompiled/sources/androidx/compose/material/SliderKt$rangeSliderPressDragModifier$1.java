package androidx.compose.material;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", l = {955}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class SliderKt$rangeSliderPressDragModifier$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ State<Function1> $gestureEndAction;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ float $maxPx;
    final /* synthetic */ State<Function2> $onDrag;
    final /* synthetic */ State<Float> $rawOffsetEnd;
    final /* synthetic */ State<Float> $rawOffsetStart;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$rangeSliderPressDragModifier$1(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, State<? extends Function2> state3, boolean z, float f, State<? extends Function1> state4, Continuation continuation) {
        super(2, continuation);
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$rawOffsetStart = state;
        this.$rawOffsetEnd = state2;
        this.$onDrag = state3;
        this.$isRtl = z;
        this.$maxPx = f;
        this.$gestureEndAction = state4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        SliderKt$rangeSliderPressDragModifier$1 sliderKt$rangeSliderPressDragModifier$1 = new SliderKt$rangeSliderPressDragModifier$1(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag, this.$isRtl, this.$maxPx, this.$gestureEndAction, continuation);
        sliderKt$rangeSliderPressDragModifier$1.L$0 = obj;
        return sliderKt$rangeSliderPressDragModifier$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
        return ((SliderKt$rangeSliderPressDragModifier$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$isRtl, this.$maxPx, new RangeSliderLogic(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag), this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
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

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", l = {956}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        final /* synthetic */ PointerInputScope $$this$pointerInput;
        final /* synthetic */ State<Function1> $gestureEndAction;
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ float $maxPx;
        final /* synthetic */ State<Function2> $onDrag;
        final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
        final /* synthetic */ State<Float> $rawOffsetEnd;
        final /* synthetic */ State<Float> $rawOffsetStart;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PointerInputScope pointerInputScope, boolean z, float f, RangeSliderLogic rangeSliderLogic, State<Float> state, State<? extends Function1> state2, State<Float> state3, State<? extends Function2> state4, Continuation continuation) {
            super(2, continuation);
            this.$$this$pointerInput = pointerInputScope;
            this.$isRtl = z;
            this.$maxPx = f;
            this.$rangeSliderLogic = rangeSliderLogic;
            this.$rawOffsetStart = state;
            this.$gestureEndAction = state2;
            this.$rawOffsetEnd = state3;
            this.$onDrag = state4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: Slider.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", l = {957}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00421 extends SuspendLambda implements Function2 {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ State<Function1> $gestureEndAction;
            final /* synthetic */ boolean $isRtl;
            final /* synthetic */ float $maxPx;
            final /* synthetic */ State<Function2> $onDrag;
            final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            final /* synthetic */ State<Float> $rawOffsetEnd;
            final /* synthetic */ State<Float> $rawOffsetStart;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00421(boolean z, float f, RangeSliderLogic rangeSliderLogic, State<Float> state, CoroutineScope coroutineScope, State<? extends Function1> state2, State<Float> state3, State<? extends Function2> state4, Continuation continuation) {
                super(2, continuation);
                this.$isRtl = z;
                this.$maxPx = f;
                this.$rangeSliderLogic = rangeSliderLogic;
                this.$rawOffsetStart = state;
                this.$$this$coroutineScope = coroutineScope;
                this.$gestureEndAction = state2;
                this.$rawOffsetEnd = state3;
                this.$onDrag = state4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                C00421 c00421 = new C00421(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                c00421.L$0 = obj;
                return c00421;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
                return ((C00421) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: Slider.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1", f = "Slider.kt", l = {958, 968, 987}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C00431 extends RestrictedSuspendLambda implements Function2 {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ State<Function1> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ float $maxPx;
                final /* synthetic */ State<Function2> $onDrag;
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                final /* synthetic */ State<Float> $rawOffsetEnd;
                final /* synthetic */ State<Float> $rawOffsetStart;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00431(boolean z, float f, RangeSliderLogic rangeSliderLogic, State<Float> state, CoroutineScope coroutineScope, State<? extends Function1> state2, State<Float> state3, State<? extends Function2> state4, Continuation continuation) {
                    super(2, continuation);
                    this.$isRtl = z;
                    this.$maxPx = f;
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$rawOffsetStart = state;
                    this.$$this$coroutineScope = coroutineScope;
                    this.$gestureEndAction = state2;
                    this.$rawOffsetEnd = state3;
                    this.$onDrag = state4;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    C00431 c00431 = new C00431(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                    c00431.L$0 = obj;
                    return c00431;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                    return ((C00431) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x017a A[Catch: CancellationException -> 0x0188, TryCatch #0 {CancellationException -> 0x0188, blocks: (B:8:0x001d, B:10:0x0172, B:12:0x017a, B:16:0x0180), top: B:7:0x001d }] */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0180 A[Catch: CancellationException -> 0x0188, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0188, blocks: (B:8:0x001d, B:10:0x0172, B:12:0x017a, B:16:0x0180), top: B:7:0x001d }] */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x016f A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0170  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(@NotNull Object obj) {
                    AwaitPointerEventScope awaitPointerEventScope;
                    Object awaitFirstDown;
                    Object m964awaitSlop8vUncbI;
                    AwaitPointerEventScope awaitPointerEventScope2;
                    PointerInputChange pointerInputChange;
                    Ref$FloatRef ref$FloatRef;
                    DragInteraction.Start start;
                    final Ref$BooleanRef ref$BooleanRef;
                    Pair pair;
                    Ref$BooleanRef ref$BooleanRef2;
                    DragInteraction.Start start2;
                    Object m238horizontalDragjO51t88;
                    DragInteraction cancel;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        this.L$0 = awaitPointerEventScope;
                        this.label = 1;
                        awaitFirstDown = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, this);
                        if (awaitFirstDown == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    ref$BooleanRef2 = (Ref$BooleanRef) this.L$1;
                                    start2 = (DragInteraction.Start) this.L$0;
                                    try {
                                        ResultKt.throwOnFailure(obj);
                                        m238horizontalDragjO51t88 = obj;
                                        if (!((Boolean) m238horizontalDragjO51t88).booleanValue()) {
                                            cancel = new DragInteraction.Stop(start2);
                                        } else {
                                            cancel = new DragInteraction.Cancel(start2);
                                        }
                                    } catch (CancellationException unused) {
                                        cancel = new DragInteraction.Cancel(start2);
                                        ((Function1) this.$gestureEndAction.getValue()).invoke(Boxing.boxBoolean(ref$BooleanRef2.element));
                                        BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, ref$BooleanRef2, cancel, null), 3, null);
                                        return Unit.INSTANCE;
                                    }
                                    ((Function1) this.$gestureEndAction.getValue()).invoke(Boxing.boxBoolean(ref$BooleanRef2.element));
                                    BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, ref$BooleanRef2, cancel, null), 3, null);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ref$BooleanRef = (Ref$BooleanRef) this.L$4;
                            Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) this.L$3;
                            start = (DragInteraction.Start) this.L$2;
                            PointerInputChange pointerInputChange2 = (PointerInputChange) this.L$1;
                            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            awaitPointerEventScope2 = awaitPointerEventScope3;
                            pointerInputChange = pointerInputChange2;
                            ref$FloatRef = ref$FloatRef2;
                            m964awaitSlop8vUncbI = obj;
                            pair = (Pair) m964awaitSlop8vUncbI;
                            if (pair != null) {
                                State<Float> state = this.$rawOffsetEnd;
                                State<Float> state2 = this.$rawOffsetStart;
                                boolean z = this.$isRtl;
                                float m839pointerSlopE8SPZFQ = DragGestureDetectorCopyKt.m839pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), pointerInputChange.getType());
                                if (Math.abs(((Number) state.getValue()).floatValue() - ref$FloatRef.element) < m839pointerSlopE8SPZFQ && Math.abs(((Number) state2.getValue()).floatValue() - ref$FloatRef.element) < m839pointerSlopE8SPZFQ) {
                                    float floatValue = ((Number) pair.getSecond()).floatValue();
                                    ref$BooleanRef.element = !z ? floatValue >= 0.0f : floatValue < 0.0f;
                                    ref$FloatRef.element += Offset.m1297getXimpl(PointerEventKt.positionChange((PointerInputChange) pair.getFirst()));
                                }
                            }
                            this.$rangeSliderLogic.captureThumb(ref$BooleanRef.element, ref$FloatRef.element, start, this.$$this$coroutineScope);
                            try {
                                long id = pointerInputChange.getId();
                                final State<Function2> state3 = this.$onDrag;
                                final boolean z2 = this.$isRtl;
                                Function1 function1 = new Function1() { // from class: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        invoke((PointerInputChange) obj2);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull PointerInputChange it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        float m1297getXimpl = Offset.m1297getXimpl(PointerEventKt.positionChange(it));
                                        Function2 function2 = (Function2) state3.getValue();
                                        Boolean valueOf = Boolean.valueOf(ref$BooleanRef.element);
                                        if (z2) {
                                            m1297getXimpl = -m1297getXimpl;
                                        }
                                        function2.invoke(valueOf, Float.valueOf(m1297getXimpl));
                                    }
                                };
                                this.L$0 = start;
                                this.L$1 = ref$BooleanRef;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.label = 3;
                                m238horizontalDragjO51t88 = DragGestureDetectorKt.m238horizontalDragjO51t88(awaitPointerEventScope2, id, function1, this);
                            } catch (CancellationException unused2) {
                                ref$BooleanRef2 = ref$BooleanRef;
                                start2 = start;
                                cancel = new DragInteraction.Cancel(start2);
                                ((Function1) this.$gestureEndAction.getValue()).invoke(Boxing.boxBoolean(ref$BooleanRef2.element));
                                BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, ref$BooleanRef2, cancel, null), 3, null);
                                return Unit.INSTANCE;
                            }
                            if (m238horizontalDragjO51t88 != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ref$BooleanRef2 = ref$BooleanRef;
                            start2 = start;
                            if (!((Boolean) m238horizontalDragjO51t88).booleanValue()) {
                            }
                            ((Function1) this.$gestureEndAction.getValue()).invoke(Boxing.boxBoolean(ref$BooleanRef2.element));
                            BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, ref$BooleanRef2, cancel, null), 3, null);
                            return Unit.INSTANCE;
                        }
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        awaitFirstDown = obj;
                    }
                    AwaitPointerEventScope awaitPointerEventScope4 = awaitPointerEventScope;
                    PointerInputChange pointerInputChange3 = (PointerInputChange) awaitFirstDown;
                    DragInteraction.Start start3 = new DragInteraction.Start();
                    Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                    float m1297getXimpl = this.$isRtl ? this.$maxPx - Offset.m1297getXimpl(pointerInputChange3.getPosition()) : Offset.m1297getXimpl(pointerInputChange3.getPosition());
                    ref$FloatRef3.element = m1297getXimpl;
                    int compareOffsets = this.$rangeSliderLogic.compareOffsets(m1297getXimpl);
                    Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
                    ref$BooleanRef3.element = compareOffsets == 0 ? ((Number) this.$rawOffsetStart.getValue()).floatValue() > ref$FloatRef3.element : compareOffsets < 0;
                    long id2 = pointerInputChange3.getId();
                    int type = pointerInputChange3.getType();
                    this.L$0 = awaitPointerEventScope4;
                    this.L$1 = pointerInputChange3;
                    this.L$2 = start3;
                    this.L$3 = ref$FloatRef3;
                    this.L$4 = ref$BooleanRef3;
                    this.label = 2;
                    m964awaitSlop8vUncbI = SliderKt.m964awaitSlop8vUncbI(awaitPointerEventScope4, id2, type, this);
                    if (m964awaitSlop8vUncbI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    pointerInputChange = pointerInputChange3;
                    ref$FloatRef = ref$FloatRef3;
                    start = start3;
                    ref$BooleanRef = ref$BooleanRef3;
                    pair = (Pair) m964awaitSlop8vUncbI;
                    if (pair != null) {
                    }
                    this.$rangeSliderLogic.captureThumb(ref$BooleanRef.element, ref$FloatRef.element, start, this.$$this$coroutineScope);
                    long id3 = pointerInputChange.getId();
                    final State<? extends Function2> state32 = this.$onDrag;
                    final boolean z22 = this.$isRtl;
                    Function1 function12 = new Function1() { // from class: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((PointerInputChange) obj2);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull PointerInputChange it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            float m1297getXimpl2 = Offset.m1297getXimpl(PointerEventKt.positionChange(it));
                            Function2 function2 = (Function2) state32.getValue();
                            Boolean valueOf = Boolean.valueOf(ref$BooleanRef.element);
                            if (z22) {
                                m1297getXimpl2 = -m1297getXimpl2;
                            }
                            function2.invoke(valueOf, Float.valueOf(m1297getXimpl2));
                        }
                    };
                    this.L$0 = start;
                    this.L$1 = ref$BooleanRef;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    m238horizontalDragjO51t88 = DragGestureDetectorKt.m238horizontalDragjO51t88(awaitPointerEventScope2, id3, function12, this);
                    if (m238horizontalDragjO51t88 != coroutine_suspended) {
                    }
                }

                /* compiled from: Slider.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$2", f = "Slider.kt", l = {1004}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends SuspendLambda implements Function2 {
                    final /* synthetic */ Ref$BooleanRef $draggingStart;
                    final /* synthetic */ DragInteraction $finishInteraction;
                    final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref$BooleanRef ref$BooleanRef, DragInteraction dragInteraction, Continuation continuation) {
                        super(2, continuation);
                        this.$rangeSliderLogic = rangeSliderLogic;
                        this.$draggingStart = ref$BooleanRef;
                        this.$finishInteraction = dragInteraction;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                        return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            MutableInteractionSource activeInteraction = this.$rangeSliderLogic.activeInteraction(this.$draggingStart.element);
                            DragInteraction dragInteraction = this.$finishInteraction;
                            this.label = 1;
                            if (activeInteraction.emit(dragInteraction, this) == coroutine_suspended) {
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
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                    C00431 c00431 = new C00431(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                    this.label = 1;
                    if (pointerInputScope.awaitPointerEventScope(c00431, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                PointerInputScope pointerInputScope = this.$$this$pointerInput;
                C00421 c00421 = new C00421(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                this.label = 1;
                if (ForEachGestureKt.forEachGesture(pointerInputScope, c00421, this) == coroutine_suspended) {
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
}
