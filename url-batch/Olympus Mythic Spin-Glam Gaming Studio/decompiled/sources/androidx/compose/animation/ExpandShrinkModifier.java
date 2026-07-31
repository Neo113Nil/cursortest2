package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EnterExitTransition.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001Bv\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\nø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0015J)\u0010!\u001a\u00020\u001e*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 R0\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R0\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b%\u0010$R\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b)\u0010(R\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b*\u0010(R$\u0010+\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R2\u00104\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000602\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000303018\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Landroidx/compose/animation/ExpandShrinkModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "sizeAnimation", "Landroidx/compose/ui/unit/IntOffset;", "offsetAnimation", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/ChangeSize;", n.e, "shrink", "Landroidx/compose/ui/Alignment;", "alignment", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "targetState", "fullSize", "sizeByState-Uzc_VyU", "(Landroidx/compose/animation/EnterExitState;J)J", "sizeByState", "targetOffsetByState-oFUgxo0", "targetOffsetByState", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getOffsetAnimation", "Landroidx/compose/runtime/State;", "getExpand", "()Landroidx/compose/runtime/State;", "getShrink", "getAlignment", "currentAlignment", "Landroidx/compose/ui/Alignment;", "getCurrentAlignment", "()Landroidx/compose/ui/Alignment;", "setCurrentAlignment", "(Landroidx/compose/ui/Alignment;)V", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "sizeTransitionSpec", "Lkotlin/jvm/functions/Function1;", "getSizeTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ExpandShrinkModifier extends LayoutModifierWithPassThroughIntrinsics {
    private final State alignment;
    private Alignment currentAlignment;
    private final State expand;
    private final Transition.DeferredAnimation offsetAnimation;
    private final State shrink;
    private final Transition.DeferredAnimation sizeAnimation;
    private final Function1 sizeTransitionSpec;

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

    public final State getExpand() {
        return this.expand;
    }

    public final State getShrink() {
        return this.shrink;
    }

    public ExpandShrinkModifier(Transition.DeferredAnimation sizeAnimation, Transition.DeferredAnimation offsetAnimation, State expand, State shrink, State alignment) {
        Intrinsics.checkNotNullParameter(sizeAnimation, "sizeAnimation");
        Intrinsics.checkNotNullParameter(offsetAnimation, "offsetAnimation");
        Intrinsics.checkNotNullParameter(expand, "expand");
        Intrinsics.checkNotNullParameter(shrink, "shrink");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.sizeAnimation = sizeAnimation;
        this.offsetAnimation = offsetAnimation;
        this.expand = expand;
        this.shrink = shrink;
        this.alignment = alignment;
        this.sizeTransitionSpec = new Function1() { // from class: androidx.compose.animation.ExpandShrinkModifier$sizeTransitionSpec$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final FiniteAnimationSpec<IntSize> invoke(@NotNull Transition.Segment<EnterExitState> segment) {
                SpringSpec springSpec;
                Intrinsics.checkNotNullParameter(segment, "$this$null");
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                FiniteAnimationSpec finiteAnimationSpec = null;
                if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                    ChangeSize changeSize = (ChangeSize) ExpandShrinkModifier.this.getExpand().getValue();
                    if (changeSize != null) {
                        finiteAnimationSpec = changeSize.getAnimationSpec();
                    }
                } else if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                    finiteAnimationSpec = EnterExitTransitionKt.DefaultSizeAnimationSpec;
                } else {
                    ChangeSize changeSize2 = (ChangeSize) ExpandShrinkModifier.this.getShrink().getValue();
                    if (changeSize2 != null) {
                        finiteAnimationSpec = changeSize2.getAnimationSpec();
                    }
                }
                if (finiteAnimationSpec != null) {
                    return finiteAnimationSpec;
                }
                springSpec = EnterExitTransitionKt.DefaultSizeAnimationSpec;
                return springSpec;
            }
        };
    }

    public final Alignment getCurrentAlignment() {
        return this.currentAlignment;
    }

    public final void setCurrentAlignment(Alignment alignment) {
        this.currentAlignment = alignment;
    }

    /* renamed from: sizeByState-Uzc_VyU, reason: not valid java name */
    public final long m87sizeByStateUzc_VyU(EnterExitState targetState, long fullSize) {
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        ChangeSize changeSize = (ChangeSize) this.expand.getValue();
        long packedValue = changeSize != null ? ((IntSize) changeSize.getSize().invoke(IntSize.m2562boximpl(fullSize))).getPackedValue() : fullSize;
        ChangeSize changeSize2 = (ChangeSize) this.shrink.getValue();
        long packedValue2 = changeSize2 != null ? ((IntSize) changeSize2.getSize().invoke(IntSize.m2562boximpl(fullSize))).getPackedValue() : fullSize;
        int i = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i == 1) {
            return fullSize;
        }
        if (i == 2) {
            return packedValue;
        }
        if (i == 3) {
            return packedValue2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: targetOffsetByState-oFUgxo0, reason: not valid java name */
    public final long m88targetOffsetByStateoFUgxo0(EnterExitState targetState, long fullSize) {
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        if (this.currentAlignment != null && this.alignment.getValue() != null && !Intrinsics.areEqual(this.currentAlignment, this.alignment.getValue())) {
            int i = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
            if (i == 1) {
                return IntOffset.INSTANCE.m2558getZeronOccac();
            }
            if (i == 2) {
                return IntOffset.INSTANCE.m2558getZeronOccac();
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ChangeSize changeSize = (ChangeSize) this.shrink.getValue();
            if (changeSize != null) {
                long packedValue = ((IntSize) changeSize.getSize().invoke(IntSize.m2562boximpl(fullSize))).getPackedValue();
                Object value = this.alignment.getValue();
                Intrinsics.checkNotNull(value);
                Alignment alignment = (Alignment) value;
                LayoutDirection layoutDirection = LayoutDirection.Ltr;
                long mo1228alignKFBX0sM = alignment.mo1228alignKFBX0sM(fullSize, packedValue, layoutDirection);
                Alignment alignment2 = this.currentAlignment;
                Intrinsics.checkNotNull(alignment2);
                long mo1228alignKFBX0sM2 = alignment2.mo1228alignKFBX0sM(fullSize, packedValue, layoutDirection);
                return IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(mo1228alignKFBX0sM) - IntOffset.m2553getXimpl(mo1228alignKFBX0sM2), IntOffset.m2554getYimpl(mo1228alignKFBX0sM) - IntOffset.m2554getYimpl(mo1228alignKFBX0sM2));
            }
            return IntOffset.INSTANCE.m2558getZeronOccac();
        }
        return IntOffset.INSTANCE.m2558getZeronOccac();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo46measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(j);
        final long IntSize = IntSizeKt.IntSize(mo1944measureBRTryo0.getWidth(), mo1944measureBRTryo0.getHeight());
        long packedValue = ((IntSize) this.sizeAnimation.animate(this.sizeTransitionSpec, new Function1() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$currentSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m2562boximpl(m89invokeYEO4UFw((EnterExitState) obj));
            }

            /* renamed from: invoke-YEO4UFw, reason: not valid java name */
            public final long m89invokeYEO4UFw(@NotNull EnterExitState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ExpandShrinkModifier.this.m87sizeByStateUzc_VyU(it, IntSize);
            }
        }).getValue()).getPackedValue();
        final long packedValue2 = ((IntOffset) this.offsetAnimation.animate(new Function1() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$offsetDelta$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final FiniteAnimationSpec<IntOffset> invoke(@NotNull Transition.Segment<EnterExitState> animate) {
                SpringSpec springSpec;
                Intrinsics.checkNotNullParameter(animate, "$this$animate");
                springSpec = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                return springSpec;
            }
        }, new Function1() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$offsetDelta$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntOffset.m2545boximpl(m90invokeBjo55l4((EnterExitState) obj));
            }

            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
            public final long m90invokeBjo55l4(@NotNull EnterExitState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ExpandShrinkModifier.this.m88targetOffsetByStateoFUgxo0(it, IntSize);
            }
        }).getValue()).getPackedValue();
        Alignment alignment = this.currentAlignment;
        final long mo1228alignKFBX0sM = alignment != null ? alignment.mo1228alignKFBX0sM(IntSize, packedValue, LayoutDirection.Ltr) : IntOffset.INSTANCE.m2558getZeronOccac();
        return MeasureScope.layout$default(measure, IntSize.m2567getWidthimpl(packedValue), IntSize.m2566getHeightimpl(packedValue), null, new Function1() { // from class: androidx.compose.animation.ExpandShrinkModifier$measure$1
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
                Placeable.PlacementScope.place$default(layout, Placeable.this, IntOffset.m2553getXimpl(mo1228alignKFBX0sM) + IntOffset.m2553getXimpl(packedValue2), IntOffset.m2554getYimpl(mo1228alignKFBX0sM) + IntOffset.m2554getYimpl(packedValue2), 0.0f, 4, null);
            }
        }, 4, null);
    }
}
