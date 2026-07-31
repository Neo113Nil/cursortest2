package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableKt$draggable$1;
import androidx.compose.foundation.gestures.DraggableKt$draggable$2;
import androidx.compose.foundation.gestures.Orientation;
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
final class SliderKt$Slider$3 extends Lambda implements Function3 {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Function0 $onValueChangeFinished;
    final /* synthetic */ State<Function1> $onValueChangeState;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ float $value;
    final /* synthetic */ ClosedFloatingPointRange $valueRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$Slider$3(ClosedFloatingPointRange closedFloatingPointRange, int i, float f, MutableInteractionSource mutableInteractionSource, boolean z, List<Float> list, SliderColors sliderColors, State<? extends Function1> state, Function0 function0) {
        super(3);
        this.$valueRange = closedFloatingPointRange;
        this.$$dirty = i;
        this.$value = f;
        this.$interactionSource = mutableInteractionSource;
        this.$enabled = z;
        this.$tickFractions = list;
        this.$colors = sliderColors;
        this.$onValueChangeState = state;
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
        int i2;
        Modifier sliderTapModifier;
        Modifier draggable;
        float calcFraction;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 14) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            boolean z = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            float m2487getMaxWidthimpl = Constraints.m2487getMaxWidthimpl(BoxWithConstraints.getConstraints());
            final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            ref$FloatRef.element = Math.max(m2487getMaxWidthimpl - density.mo271toPx0680j_4(SliderKt.getThumbRadius()), 0.0f);
            ref$FloatRef2.element = Math.min(density.mo271toPx0680j_4(SliderKt.getThumbRadius()), ref$FloatRef.element);
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            float f = this.$value;
            ClosedFloatingPointRange closedFloatingPointRange = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(closedFloatingPointRange, ref$FloatRef2, ref$FloatRef, f)), null, 2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) rememberedValue2;
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState2 = (MutableState) rememberedValue3;
            Object valueOf = Float.valueOf(ref$FloatRef2.element);
            Object valueOf2 = Float.valueOf(ref$FloatRef.element);
            final ClosedFloatingPointRange closedFloatingPointRange2 = this.$valueRange;
            final State<Function1> state = this.$onValueChangeState;
            composer.startReplaceableGroup(1618982084);
            boolean changed = composer.changed(valueOf) | composer.changed(valueOf2) | composer.changed(closedFloatingPointRange2);
            Object rememberedValue4 = composer.rememberedValue();
            if (changed || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new SliderDraggableState(new Function1() { // from class: androidx.compose.material.SliderKt$Slider$3$draggableState$1$1
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

                    public final void invoke(float f2) {
                        float invoke$scaleToUserValue;
                        MutableState<Float> mutableState3 = mutableState;
                        mutableState3.setValue(Float.valueOf(((Number) mutableState3.getValue()).floatValue() + f2 + ((Number) mutableState2.getValue()).floatValue()));
                        mutableState2.setValue(Float.valueOf(0.0f));
                        float coerceIn = RangesKt.coerceIn(((Number) mutableState.getValue()).floatValue(), ref$FloatRef2.element, ref$FloatRef.element);
                        Function1 function1 = (Function1) state.getValue();
                        invoke$scaleToUserValue = SliderKt$Slider$3.invoke$scaleToUserValue(ref$FloatRef2, ref$FloatRef, closedFloatingPointRange2, coerceIn);
                        function1.invoke(Float.valueOf(invoke$scaleToUserValue));
                    }
                });
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            final SliderDraggableState sliderDraggableState = (SliderDraggableState) rememberedValue4;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$valueRange, ref$FloatRef2, ref$FloatRef);
            ClosedFloatingPointRange closedFloatingPointRange3 = this.$valueRange;
            ClosedFloatingPointRange rangeTo = RangesKt.rangeTo(ref$FloatRef2.element, ref$FloatRef.element);
            float f2 = this.$value;
            int i3 = this.$$dirty;
            SliderKt.CorrectValueSideEffect(anonymousClass2, closedFloatingPointRange3, rangeTo, mutableState, f2, composer, ((i3 >> 9) & 112) | 3072 | ((i3 << 12) & 57344));
            final List<Float> list = this.$tickFractions;
            final Function0 function0 = this.$onValueChangeFinished;
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new Function1() { // from class: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f3) {
                    float snapValueToTick;
                    Function0 function02;
                    float floatValue = ((Number) mutableState.getValue()).floatValue();
                    snapValueToTick = SliderKt.snapValueToTick(floatValue, list, ref$FloatRef2.element, ref$FloatRef.element);
                    if (floatValue != snapValueToTick) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sliderDraggableState, floatValue, snapValueToTick, f3, function0, null), 3, null);
                    } else {
                        if (sliderDraggableState.isDragging() || (function02 = function0) == null) {
                            return;
                        }
                        function02.mo4828invoke();
                    }
                }

                /* compiled from: Slider.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1", f = "Slider.kt", l = {204}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                    final /* synthetic */ float $current;
                    final /* synthetic */ SliderDraggableState $draggableState;
                    final /* synthetic */ Function0 $onValueChangeFinished;
                    final /* synthetic */ float $target;
                    final /* synthetic */ float $velocity;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(SliderDraggableState sliderDraggableState, float f, float f2, float f3, Function0 function0, Continuation continuation) {
                        super(2, continuation);
                        this.$draggableState = sliderDraggableState;
                        this.$current = f;
                        this.$target = f2;
                        this.$velocity = f3;
                        this.$onValueChangeFinished = function0;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        return new AnonymousClass1(this.$draggableState, this.$current, this.$target, this.$velocity, this.$onValueChangeFinished, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object animateToTarget;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            SliderDraggableState sliderDraggableState = this.$draggableState;
                            float f = this.$current;
                            float f2 = this.$target;
                            float f3 = this.$velocity;
                            this.label = 1;
                            animateToTarget = SliderKt.animateToTarget(sliderDraggableState, f, f2, f3, this);
                            if (animateToTarget == coroutine_suspended) {
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
            Modifier.Companion companion2 = Modifier.INSTANCE;
            sliderTapModifier = SliderKt.sliderTapModifier(companion2, sliderDraggableState, this.$interactionSource, m2487getMaxWidthimpl, z, mutableState, rememberUpdatedState, mutableState2, this.$enabled);
            Orientation orientation = Orientation.Horizontal;
            boolean isDragging = sliderDraggableState.isDragging();
            boolean z2 = this.$enabled;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            composer.startReplaceableGroup(1157296644);
            boolean changed2 = composer.changed(rememberUpdatedState);
            Object rememberedValue5 = composer.rememberedValue();
            if (changed2 || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new SliderKt$Slider$3$drag$1$1(rememberUpdatedState, null);
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceableGroup();
            draggable = DraggableKt.draggable(companion2, sliderDraggableState, orientation, (r20 & 4) != 0 ? true : z2, (r20 & 8) != 0 ? null : mutableInteractionSource, (r20 & 16) != 0 ? false : isDragging, (r20 & 32) != 0 ? new DraggableKt$draggable$1(null) : null, (r20 & 64) != 0 ? new DraggableKt$draggable$2(null) : (Function3) rememberedValue5, (r20 & 128) != 0 ? false : z);
            calcFraction = SliderKt.calcFraction(((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue(), RangesKt.coerceIn(this.$value, ((Number) this.$valueRange.getStart()).floatValue(), ((Number) this.$valueRange.getEndInclusive()).floatValue()));
            boolean z3 = this.$enabled;
            List<Float> list2 = this.$tickFractions;
            SliderColors sliderColors = this.$colors;
            float f3 = ref$FloatRef.element - ref$FloatRef2.element;
            MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
            Modifier then = sliderTapModifier.then(draggable);
            int i4 = this.$$dirty;
            SliderKt.SliderImpl(z3, calcFraction, list2, sliderColors, f3, mutableInteractionSource2, then, composer, ((i4 >> 9) & 14) | 512 | ((i4 >> 15) & 7168) | ((i4 >> 6) & 458752));
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToUserValue(Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, ClosedFloatingPointRange closedFloatingPointRange, float f) {
        float scale;
        scale = SliderKt.scale(ref$FloatRef.element, ref$FloatRef2.element, f, ((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue());
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
    /* renamed from: androidx.compose.material.SliderKt$Slider$3$2, reason: invalid class name */
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
            return Float.valueOf(SliderKt$Slider$3.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).floatValue());
        }
    }
}
