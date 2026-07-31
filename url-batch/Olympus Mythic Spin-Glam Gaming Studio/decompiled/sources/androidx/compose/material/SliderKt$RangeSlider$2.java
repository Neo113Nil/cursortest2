package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
final class SliderKt$RangeSlider$2 extends Lambda implements Function3 {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ Function0 $onValueChangeFinished;
    final /* synthetic */ State<Function1> $onValueChangeState;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    final /* synthetic */ int $steps;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ ClosedFloatingPointRange $valueRange;
    final /* synthetic */ ClosedFloatingPointRange $values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$RangeSlider$2(ClosedFloatingPointRange closedFloatingPointRange, ClosedFloatingPointRange closedFloatingPointRange2, int i, State<? extends Function1> state, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z, List<Float> list, int i2, SliderColors sliderColors, Function0 function0) {
        super(3);
        this.$valueRange = closedFloatingPointRange;
        this.$values = closedFloatingPointRange2;
        this.$$dirty = i;
        this.$onValueChangeState = state;
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$enabled = z;
        this.$tickFractions = list;
        this.$steps = i2;
        this.$colors = sliderColors;
        this.$onValueChangeFinished = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer, int i) {
        Modifier rangeSliderPressDragModifier;
        float calcFraction;
        float calcFraction2;
        Modifier sliderSemantics;
        Modifier sliderSemantics2;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((((i & 14) == 0 ? i | (composer.changed(BoxWithConstraints) ? 4 : 2) : i) & 91) != 18 || !composer.getSkipping()) {
            boolean z = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            float m2487getMaxWidthimpl = Constraints.m2487getMaxWidthimpl(BoxWithConstraints.getConstraints());
            final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            ref$FloatRef.element = m2487getMaxWidthimpl - density.mo271toPx0680j_4(SliderKt.getThumbRadius());
            ref$FloatRef2.element = density.mo271toPx0680j_4(SliderKt.getThumbRadius());
            Unit unit = Unit.INSTANCE;
            ClosedFloatingPointRange closedFloatingPointRange = this.$values;
            ClosedFloatingPointRange closedFloatingPointRange2 = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(closedFloatingPointRange2, ref$FloatRef2, ref$FloatRef, ((Number) closedFloatingPointRange.getStart()).floatValue())), null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) rememberedValue;
            ClosedFloatingPointRange closedFloatingPointRange3 = this.$values;
            ClosedFloatingPointRange closedFloatingPointRange4 = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(closedFloatingPointRange4, ref$FloatRef2, ref$FloatRef, ((Number) closedFloatingPointRange3.getEndInclusive()).floatValue())), null, 2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState2 = (MutableState) rememberedValue2;
            SliderKt.CorrectValueSideEffect(new AnonymousClass2(this.$valueRange, ref$FloatRef2, ref$FloatRef), this.$valueRange, RangesKt.rangeTo(ref$FloatRef2.element, ref$FloatRef.element), mutableState, ((Number) this.$values.getStart()).floatValue(), composer, ((this.$$dirty >> 9) & 112) | 3072);
            SliderKt.CorrectValueSideEffect(new AnonymousClass3(this.$valueRange, ref$FloatRef2, ref$FloatRef), this.$valueRange, RangesKt.rangeTo(ref$FloatRef2.element, ref$FloatRef.element), mutableState2, ((Number) this.$values.getEndInclusive()).floatValue(), composer, ((this.$$dirty >> 9) & 112) | 3072);
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue3 = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
            composer.endReplaceableGroup();
            final List<Float> list = this.$tickFractions;
            final Function0 function0 = this.$onValueChangeFinished;
            final State<Function1> state = this.$onValueChangeState;
            final ClosedFloatingPointRange closedFloatingPointRange5 = this.$valueRange;
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new Function1() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                    float snapValueToTick;
                    float floatValue = ((Number) (z2 ? mutableState : mutableState2).getValue()).floatValue();
                    snapValueToTick = SliderKt.snapValueToTick(floatValue, list, ref$FloatRef2.element, ref$FloatRef.element);
                    if (floatValue != snapValueToTick) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(floatValue, snapValueToTick, function0, z2, mutableState, mutableState2, state, ref$FloatRef2, ref$FloatRef, closedFloatingPointRange5, null), 3, null);
                        return;
                    }
                    Function0 function02 = function0;
                    if (function02 != null) {
                        function02.mo4828invoke();
                    }
                }

                /* compiled from: Slider.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1", f = "Slider.kt", l = {352}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                    final /* synthetic */ float $current;
                    final /* synthetic */ boolean $isStart;
                    final /* synthetic */ Ref$FloatRef $maxPx;
                    final /* synthetic */ Ref$FloatRef $minPx;
                    final /* synthetic */ Function0 $onValueChangeFinished;
                    final /* synthetic */ State<Function1> $onValueChangeState;
                    final /* synthetic */ MutableState<Float> $rawOffsetEnd;
                    final /* synthetic */ MutableState<Float> $rawOffsetStart;
                    final /* synthetic */ float $target;
                    final /* synthetic */ ClosedFloatingPointRange $valueRange;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(float f, float f2, Function0 function0, boolean z, MutableState<Float> mutableState, MutableState<Float> mutableState2, State<? extends Function1> state, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, ClosedFloatingPointRange closedFloatingPointRange, Continuation continuation) {
                        super(2, continuation);
                        this.$current = f;
                        this.$target = f2;
                        this.$onValueChangeFinished = function0;
                        this.$isStart = z;
                        this.$rawOffsetStart = mutableState;
                        this.$rawOffsetEnd = mutableState2;
                        this.$onValueChangeState = state;
                        this.$minPx = ref$FloatRef;
                        this.$maxPx = ref$FloatRef2;
                        this.$valueRange = closedFloatingPointRange;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        return new AnonymousClass1(this.$current, this.$target, this.$onValueChangeFinished, this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        TweenSpec tweenSpec;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Animatable Animatable$default = AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null);
                            Float boxFloat = Boxing.boxFloat(this.$target);
                            tweenSpec = SliderKt.SliderToTickAnimation;
                            Float boxFloat2 = Boxing.boxFloat(0.0f);
                            final boolean z = this.$isStart;
                            final MutableState<Float> mutableState = this.$rawOffsetStart;
                            final MutableState<Float> mutableState2 = this.$rawOffsetEnd;
                            final State<Function1> state = this.$onValueChangeState;
                            final Ref$FloatRef ref$FloatRef = this.$minPx;
                            final Ref$FloatRef ref$FloatRef2 = this.$maxPx;
                            final ClosedFloatingPointRange closedFloatingPointRange = this.$valueRange;
                            Function1 function1 = new Function1() { // from class: androidx.compose.material.SliderKt.RangeSlider.2.gestureEndAction.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    invoke((Animatable<Float, AnimationVector1D>) obj2);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull Animatable<Float, AnimationVector1D> animateTo) {
                                    ClosedFloatingPointRange invoke$scaleToUserValue;
                                    Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                                    (z ? mutableState : mutableState2).setValue(animateTo.getValue());
                                    Function1 function12 = (Function1) state.getValue();
                                    invoke$scaleToUserValue = SliderKt$RangeSlider$2.invoke$scaleToUserValue(ref$FloatRef, ref$FloatRef2, closedFloatingPointRange, RangesKt.rangeTo(((Number) mutableState.getValue()).floatValue(), ((Number) mutableState2.getValue()).floatValue()));
                                    function12.invoke(invoke$scaleToUserValue);
                                }
                            };
                            this.label = 1;
                            if (Animatable$default.animateTo(boxFloat, tweenSpec, boxFloat2, function1, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        Function0 function0 = this.$onValueChangeFinished;
                        if (function0 != null) {
                            function0.mo4828invoke();
                        }
                        return Unit.INSTANCE;
                    }
                }
            }, composer, 0);
            ClosedFloatingPointRange closedFloatingPointRange6 = this.$valueRange;
            Float valueOf = Float.valueOf(ref$FloatRef2.element);
            Float valueOf2 = Float.valueOf(ref$FloatRef.element);
            final ClosedFloatingPointRange closedFloatingPointRange7 = this.$values;
            final State<Function1> state2 = this.$onValueChangeState;
            Object[] objArr = {mutableState, mutableState2, closedFloatingPointRange6, valueOf, valueOf2, closedFloatingPointRange7, state2};
            final ClosedFloatingPointRange closedFloatingPointRange8 = this.$valueRange;
            composer.startReplaceableGroup(-568225417);
            boolean z2 = false;
            for (int i2 = 0; i2 < 7; i2++) {
                z2 |= composer.changed(objArr[i2]);
            }
            Object rememberedValue4 = composer.rememberedValue();
            if (z2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function2() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke(((Boolean) obj).booleanValue(), ((Number) obj2).floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z3, float f) {
                        ClosedFloatingPointRange rangeTo;
                        ClosedFloatingPointRange invoke$scaleToUserValue;
                        if (z3) {
                            MutableState<Float> mutableState3 = mutableState;
                            mutableState3.setValue(Float.valueOf(((Number) mutableState3.getValue()).floatValue() + f));
                            mutableState2.setValue(Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(closedFloatingPointRange8, ref$FloatRef2, ref$FloatRef, ((Number) closedFloatingPointRange7.getEndInclusive()).floatValue())));
                            float floatValue = ((Number) mutableState2.getValue()).floatValue();
                            rangeTo = RangesKt.rangeTo(RangesKt.coerceIn(((Number) mutableState.getValue()).floatValue(), ref$FloatRef2.element, floatValue), floatValue);
                        } else {
                            MutableState<Float> mutableState4 = mutableState2;
                            mutableState4.setValue(Float.valueOf(((Number) mutableState4.getValue()).floatValue() + f));
                            mutableState.setValue(Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(closedFloatingPointRange8, ref$FloatRef2, ref$FloatRef, ((Number) closedFloatingPointRange7.getStart()).floatValue())));
                            float floatValue2 = ((Number) mutableState.getValue()).floatValue();
                            rangeTo = RangesKt.rangeTo(floatValue2, RangesKt.coerceIn(((Number) mutableState2.getValue()).floatValue(), floatValue2, ref$FloatRef.element));
                        }
                        Function1 function1 = (Function1) state2.getValue();
                        invoke$scaleToUserValue = SliderKt$RangeSlider$2.invoke$scaleToUserValue(ref$FloatRef2, ref$FloatRef, closedFloatingPointRange8, rangeTo);
                        function1.invoke(invoke$scaleToUserValue);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(rememberedValue4, composer, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            rangeSliderPressDragModifier = SliderKt.rangeSliderPressDragModifier(companion2, this.$startInteractionSource, this.$endInteractionSource, mutableState, mutableState2, this.$enabled, z, m2487getMaxWidthimpl, this.$valueRange, rememberUpdatedState, rememberUpdatedState2);
            final float coerceIn = RangesKt.coerceIn(((Number) this.$values.getStart()).floatValue(), ((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$values.getEndInclusive()).floatValue());
            final float coerceIn2 = RangesKt.coerceIn(((Number) this.$values.getEndInclusive()).floatValue(), ((Number) this.$values.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue());
            calcFraction = SliderKt.calcFraction(((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue(), coerceIn);
            calcFraction2 = SliderKt.calcFraction(((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue(), coerceIn2);
            List<Float> list2 = this.$tickFractions;
            boolean z3 = this.$enabled;
            State<Function1> state3 = this.$onValueChangeState;
            Float valueOf3 = Float.valueOf(coerceIn2);
            final State<Function1> state4 = this.$onValueChangeState;
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(state3) | composer.changed(valueOf3);
            Object rememberedValue5 = composer.rememberedValue();
            if (changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function1() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$startThumbSemantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Number) obj).floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f) {
                        ((Function1) state4.getValue()).invoke(RangesKt.rangeTo(f, coerceIn2));
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceableGroup();
            sliderSemantics = SliderKt.sliderSemantics(companion2, coerceIn, list2, z3, (Function1) rememberedValue5, RangesKt.rangeTo(((Number) this.$valueRange.getStart()).floatValue(), coerceIn2), this.$steps);
            List<Float> list3 = this.$tickFractions;
            boolean z4 = this.$enabled;
            State<Function1> state5 = this.$onValueChangeState;
            Float valueOf4 = Float.valueOf(coerceIn);
            final State<Function1> state6 = this.$onValueChangeState;
            composer.startReplaceableGroup(511388516);
            boolean changed2 = composer.changed(state5) | composer.changed(valueOf4);
            Object rememberedValue6 = composer.rememberedValue();
            if (changed2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function1() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$endThumbSemantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Number) obj).floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f) {
                        ((Function1) state6.getValue()).invoke(RangesKt.rangeTo(coerceIn, f));
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            composer.endReplaceableGroup();
            sliderSemantics2 = SliderKt.sliderSemantics(companion2, coerceIn2, list3, z4, (Function1) rememberedValue6, RangesKt.rangeTo(coerceIn, ((Number) this.$valueRange.getEndInclusive()).floatValue()), this.$steps);
            boolean z5 = this.$enabled;
            List<Float> list4 = this.$tickFractions;
            SliderColors sliderColors = this.$colors;
            float f = ref$FloatRef.element - ref$FloatRef2.element;
            MutableInteractionSource mutableInteractionSource = this.$startInteractionSource;
            MutableInteractionSource mutableInteractionSource2 = this.$endInteractionSource;
            int i3 = this.$$dirty;
            SliderKt.RangeSliderImpl(z5, calcFraction, calcFraction2, list4, sliderColors, f, mutableInteractionSource, mutableInteractionSource2, rangeSliderPressDragModifier, sliderSemantics, sliderSemantics2, composer, ((i3 >> 9) & 14) | 14159872 | ((i3 >> 9) & 57344), 0);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClosedFloatingPointRange invoke$scaleToUserValue(Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, ClosedFloatingPointRange closedFloatingPointRange, ClosedFloatingPointRange closedFloatingPointRange2) {
        ClosedFloatingPointRange scale;
        scale = SliderKt.scale(ref$FloatRef.element, ref$FloatRef2.element, closedFloatingPointRange2, ((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue());
        return scale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToOffset(ClosedFloatingPointRange closedFloatingPointRange, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, float f) {
        float scale;
        scale = SliderKt.scale(((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue(), f, ref$FloatRef.element, ref$FloatRef2.element);
        return scale;
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1 {
        final /* synthetic */ Ref$FloatRef $maxPx;
        final /* synthetic */ Ref$FloatRef $minPx;
        final /* synthetic */ ClosedFloatingPointRange $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ClosedFloatingPointRange closedFloatingPointRange, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2) {
            super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
            this.$valueRange = closedFloatingPointRange;
            this.$minPx = ref$FloatRef;
            this.$maxPx = ref$FloatRef2;
        }

        @NotNull
        public final Float invoke(float f) {
            return Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1 {
        final /* synthetic */ Ref$FloatRef $maxPx;
        final /* synthetic */ Ref$FloatRef $minPx;
        final /* synthetic */ ClosedFloatingPointRange $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ClosedFloatingPointRange closedFloatingPointRange, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2) {
            super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
            this.$valueRange = closedFloatingPointRange;
            this.$minPx = ref$FloatRef;
            this.$maxPx = ref$FloatRef2;
        }

        @NotNull
        public final Float invoke(float f) {
            return Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }
    }
}
