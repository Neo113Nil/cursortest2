package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EnterExitTransition.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BH\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u001c\u001a\u00020\u0019*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bR0\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b#\u0010\"R2\u0010'\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030&0$8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/animation/SlideModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "lazyAnimation", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/Slide;", "slideIn", "slideOut", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "targetState", "Landroidx/compose/ui/unit/IntSize;", "fullSize", "targetValueByState-oFUgxo0", "(Landroidx/compose/animation/EnterExitState;J)J", "targetValueByState", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getLazyAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/runtime/State;", "getSlideIn", "()Landroidx/compose/runtime/State;", "getSlideOut", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "transitionSpec", "Lkotlin/jvm/functions/Function1;", "getTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class SlideModifier extends LayoutModifierWithPassThroughIntrinsics {
    private final Transition.DeferredAnimation lazyAnimation;
    private final State slideIn;
    private final State slideOut;
    private final Function1 transitionSpec;

    /* compiled from: EnterExitTransition.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final Transition.DeferredAnimation getLazyAnimation() {
        return this.lazyAnimation;
    }

    public final State getSlideIn() {
        return this.slideIn;
    }

    public final State getSlideOut() {
        return this.slideOut;
    }

    public SlideModifier(Transition.DeferredAnimation lazyAnimation, State slideIn, State slideOut) {
        Intrinsics.checkNotNullParameter(lazyAnimation, "lazyAnimation");
        Intrinsics.checkNotNullParameter(slideIn, "slideIn");
        Intrinsics.checkNotNullParameter(slideOut, "slideOut");
        this.lazyAnimation = lazyAnimation;
        this.slideIn = slideIn;
        this.slideOut = slideOut;
        this.transitionSpec = new Function1() { // from class: androidx.compose.animation.SlideModifier$transitionSpec$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final FiniteAnimationSpec<IntOffset> invoke(@NotNull Transition.Segment<EnterExitState> segment) {
                SpringSpec springSpec;
                SpringSpec springSpec2;
                FiniteAnimationSpec<IntOffset> animationSpec;
                SpringSpec springSpec3;
                FiniteAnimationSpec<IntOffset> animationSpec2;
                Intrinsics.checkNotNullParameter(segment, "$this$null");
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                    Slide slide = (Slide) SlideModifier.this.getSlideIn().getValue();
                    if (slide != null && (animationSpec2 = slide.getAnimationSpec()) != null) {
                        return animationSpec2;
                    }
                    springSpec3 = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                    return springSpec3;
                }
                if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                    springSpec = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                    return springSpec;
                }
                Slide slide2 = (Slide) SlideModifier.this.getSlideOut().getValue();
                if (slide2 != null && (animationSpec = slide2.getAnimationSpec()) != null) {
                    return animationSpec;
                }
                springSpec2 = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                return springSpec2;
            }
        };
    }

    public final Function1 getTransitionSpec() {
        return this.transitionSpec;
    }

    /* renamed from: targetValueByState-oFUgxo0, reason: not valid java name */
    public final long m97targetValueByStateoFUgxo0(EnterExitState targetState, long fullSize) {
        Function1 slideOffset;
        Function1 slideOffset2;
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        Slide slide = (Slide) this.slideIn.getValue();
        long m2558getZeronOccac = (slide == null || (slideOffset2 = slide.getSlideOffset()) == null) ? IntOffset.INSTANCE.m2558getZeronOccac() : ((IntOffset) slideOffset2.invoke(IntSize.m2562boximpl(fullSize))).getPackedValue();
        Slide slide2 = (Slide) this.slideOut.getValue();
        long m2558getZeronOccac2 = (slide2 == null || (slideOffset = slide2.getSlideOffset()) == null) ? IntOffset.INSTANCE.m2558getZeronOccac() : ((IntOffset) slideOffset.invoke(IntSize.m2562boximpl(fullSize))).getPackedValue();
        int i = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i == 1) {
            return IntOffset.INSTANCE.m2558getZeronOccac();
        }
        if (i == 2) {
            return m2558getZeronOccac;
        }
        if (i == 3) {
            return m2558getZeronOccac2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo46measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(j);
        final long IntSize = IntSizeKt.IntSize(mo1944measureBRTryo0.getWidth(), mo1944measureBRTryo0.getHeight());
        return MeasureScope.layout$default(measure, mo1944measureBRTryo0.getWidth(), mo1944measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.animation.SlideModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Transition.DeferredAnimation lazyAnimation = SlideModifier.this.getLazyAnimation();
                Function1 transitionSpec = SlideModifier.this.getTransitionSpec();
                final SlideModifier slideModifier = SlideModifier.this;
                final long j2 = IntSize;
                Placeable.PlacementScope.m1964placeWithLayeraW9wM$default(layout, mo1944measureBRTryo0, ((IntOffset) lazyAnimation.animate(transitionSpec, new Function1() { // from class: androidx.compose.animation.SlideModifier$measure$1$slideOffset$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return IntOffset.m2545boximpl(m98invokeBjo55l4((EnterExitState) obj));
                    }

                    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m98invokeBjo55l4(@NotNull EnterExitState it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return SlideModifier.this.m97targetValueByStateoFUgxo0(it, j2);
                    }
                }).getValue()).getPackedValue(), 0.0f, null, 6, null);
            }
        }, 4, null);
    }
}
