package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EnterExitTransition.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\u0010\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aL\u0010\u0018\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00110\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aL\u0010\u001c\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00110\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aL\u0010!\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00110\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u001e2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aL\u0010%\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00110\u00002\b\b\u0002\u0010\u0013\u001a\u00020#2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aL\u0010(\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00110\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u001e2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001aL\u0010+\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00110\u00002\b\b\u0002\u0010\u001a\u001a\u00020#2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u0013\u0010-\u001a\u00020\u0012*\u00020\u001eH\u0002¢\u0006\u0004\b-\u0010.\u001a\u0013\u0010-\u001a\u00020\u0012*\u00020#H\u0002¢\u0006\u0004\b-\u0010/\u001a1\u00107\u001a\u000206*\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108\u001aI\u0010?\u001a\u000206*\u0002062\f\u00109\u001a\b\u0012\u0004\u0012\u000201002\u000e\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:2\u000e\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:2\u0006\u0010>\u001a\u000204H\u0002¢\u0006\u0004\b?\u0010@\u001aI\u0010D\u001a\u000206*\u0002062\f\u00109\u001a\b\u0012\u0004\u0012\u000201002\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0:2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0:2\u0006\u0010>\u001a\u000204H\u0002¢\u0006\u0004\bD\u0010@\"#\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020F0E8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bG\u0010H\"\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00010I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K\"\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00010L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N\"\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020O0L8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bP\u0010N\"\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00110L8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bQ\u0010N\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006R"}, d2 = {"Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "animationSpec", "initialAlpha", "Landroidx/compose/animation/EnterTransition;", "fadeIn", "(Landroidx/compose/animation/core/FiniteAnimationSpec;F)Landroidx/compose/animation/EnterTransition;", "targetAlpha", "Landroidx/compose/animation/ExitTransition;", "fadeOut", "(Landroidx/compose/animation/core/FiniteAnimationSpec;F)Landroidx/compose/animation/ExitTransition;", "initialScale", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "scaleIn-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/EnterTransition;", "scaleIn", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/Alignment;", "expandFrom", "", "clip", "Lkotlin/Function1;", "initialSize", "expandIn", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "shrinkTowards", "targetSize", "shrinkOut", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/ui/Alignment$Horizontal;", "", "initialWidth", "expandHorizontally", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Horizontal;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/ui/Alignment$Vertical;", "initialHeight", "expandVertically", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "targetWidth", "shrinkHorizontally", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Horizontal;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "targetHeight", "shrinkVertically", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "toAlignment", "(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Alignment;", "(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Alignment;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", "exit", "", "label", "Landroidx/compose/ui/Modifier;", "createModifier", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "transition", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/Slide;", "slideIn", "slideOut", "labelPrefix", "slideInOut", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/Transition;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/ChangeSize;", n.e, "shrink", "shrinkExpand", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/animation/core/AnimationVector2D;", "TransformOriginVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/runtime/MutableState;", "DefaultAlpha", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/animation/core/SpringSpec;", "DefaultAlphaAndScaleSpring", "Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/ui/unit/IntOffset;", "DefaultOffsetAnimationSpec", "DefaultSizeAnimationSpec", "animation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EnterExitTransitionKt {
    private static final TwoWayConverter TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m71invoke__ExYCQ(((TransformOrigin) obj).getPackedValue());
        }

        @NotNull
        /* renamed from: invoke-__ExYCQ, reason: not valid java name */
        public final AnimationVector2D m71invoke__ExYCQ(long j) {
            return new AnimationVector2D(TransformOrigin.m1622getPivotFractionXimpl(j), TransformOrigin.m1623getPivotFractionYimpl(j));
        }
    }, new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return TransformOrigin.m1618boximpl(m72invokeLIALnN8((AnimationVector2D) obj));
        }

        /* renamed from: invoke-LIALnN8, reason: not valid java name */
        public final long m72invokeLIALnN8(@NotNull AnimationVector2D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return TransformOriginKt.TransformOrigin(it.getV1(), it.getV2());
        }
    });
    private static final MutableState DefaultAlpha = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
    private static final SpringSpec DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    private static final SpringSpec DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m2545boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
    private static final SpringSpec DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m2562boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);

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

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f);
    }

    public static final EnterTransition fadeIn(FiniteAnimationSpec animationSpec, float f) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(new Fade(f, animationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f);
    }

    public static final ExitTransition fadeOut(FiniteAnimationSpec animationSpec, float f) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new ExitTransitionImpl(new TransitionData(new Fade(f, animationSpec), null, null, null, 14, null));
    }

    /* renamed from: scaleIn-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ EnterTransition m70scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = TransformOrigin.INSTANCE.m1627getCenterSzJe1aQ();
        }
        return m69scaleInL8ZKhE(finiteAnimationSpec, f, j);
    }

    /* renamed from: scaleIn-L8ZKh-E, reason: not valid java name */
    public static final EnterTransition m69scaleInL8ZKhE(FiniteAnimationSpec animationSpec, float f, long j) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f, j, animationSpec, null), 7, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m2562boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandIn$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return IntSize.m2562boximpl(m74invokemzRDjE0(((IntSize) obj2).getPackedValue()));
                }

                /* renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m74invokemzRDjE0(long j) {
                    return IntSizeKt.IntSize(0, 0);
                }
            };
        }
        return expandIn(finiteAnimationSpec, alignment, z, function1);
    }

    public static final EnterTransition expandIn(FiniteAnimationSpec animationSpec, Alignment expandFrom, boolean z, Function1 initialSize) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialSize, "initialSize");
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(expandFrom, initialSize, animationSpec, z), null, 11, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m2562boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkOut$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return IntSize.m2562boximpl(m79invokemzRDjE0(((IntSize) obj2).getPackedValue()));
                }

                /* renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m79invokemzRDjE0(long j) {
                    return IntSizeKt.IntSize(0, 0);
                }
            };
        }
        return shrinkOut(finiteAnimationSpec, alignment, z, function1);
    }

    public static final ExitTransition shrinkOut(FiniteAnimationSpec animationSpec, Alignment shrinkTowards, boolean z, Function1 targetSize) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetSize, "targetSize");
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(shrinkTowards, targetSize, animationSpec, z), null, 11, null));
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m2562boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            horizontal = Alignment.INSTANCE.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$1
                @NotNull
                public final Integer invoke(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z, function1);
    }

    public static final EnterTransition expandHorizontally(FiniteAnimationSpec animationSpec, Alignment.Horizontal expandFrom, boolean z, final Function1 initialWidth) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialWidth, "initialWidth");
        return expandIn(animationSpec, toAlignment(expandFrom), z, new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m2562boximpl(m73invokemzRDjE0(((IntSize) obj).getPackedValue()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m73invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(((Number) Function1.this.invoke(Integer.valueOf(IntSize.m2567getWidthimpl(j)))).intValue(), IntSize.m2566getHeightimpl(j));
            }
        });
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m2562boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            vertical = Alignment.INSTANCE.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$1
                @NotNull
                public final Integer invoke(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return expandVertically(finiteAnimationSpec, vertical, z, function1);
    }

    public static final EnterTransition expandVertically(FiniteAnimationSpec animationSpec, Alignment.Vertical expandFrom, boolean z, final Function1 initialHeight) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialHeight, "initialHeight");
        return expandIn(animationSpec, toAlignment(expandFrom), z, new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m2562boximpl(m75invokemzRDjE0(((IntSize) obj).getPackedValue()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m75invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(IntSize.m2567getWidthimpl(j), ((Number) Function1.this.invoke(Integer.valueOf(IntSize.m2566getHeightimpl(j)))).intValue());
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m2562boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            horizontal = Alignment.INSTANCE.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$1
                @NotNull
                public final Integer invoke(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z, function1);
    }

    public static final ExitTransition shrinkHorizontally(FiniteAnimationSpec animationSpec, Alignment.Horizontal shrinkTowards, boolean z, final Function1 targetWidth) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetWidth, "targetWidth");
        return shrinkOut(animationSpec, toAlignment(shrinkTowards), z, new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m2562boximpl(m78invokemzRDjE0(((IntSize) obj).getPackedValue()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m78invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(((Number) Function1.this.invoke(Integer.valueOf(IntSize.m2567getWidthimpl(j)))).intValue(), IntSize.m2566getHeightimpl(j));
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m2562boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            vertical = Alignment.INSTANCE.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$1
                @NotNull
                public final Integer invoke(int i2) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z, function1);
    }

    public static final ExitTransition shrinkVertically(FiniteAnimationSpec animationSpec, Alignment.Vertical shrinkTowards, boolean z, final Function1 targetHeight) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetHeight, "targetHeight");
        return shrinkOut(animationSpec, toAlignment(shrinkTowards), z, new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m2562boximpl(m80invokemzRDjE0(((IntSize) obj).getPackedValue()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m80invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(IntSize.m2567getWidthimpl(j), ((Number) Function1.this.invoke(Integer.valueOf(IntSize.m2566getHeightimpl(j)))).intValue());
            }
        });
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return Intrinsics.areEqual(horizontal, companion.getStart()) ? companion.getCenterStart() : Intrinsics.areEqual(horizontal, companion.getEnd()) ? companion.getCenterEnd() : companion.getCenter();
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return Intrinsics.areEqual(vertical, companion.getTop()) ? companion.getTopCenter() : Intrinsics.areEqual(vertical, companion.getBottom()) ? companion.getBottomCenter() : companion.getCenter();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Modifier createModifier(Transition transition, final EnterTransition enter, final ExitTransition exit, String label, Composer composer, int i) {
        int i2;
        MutableState mutableState;
        MutableState mutableState2;
        TransformOrigin transformOrigin;
        State state;
        int i3;
        float f;
        int i4;
        TransformOrigin m1618boximpl;
        int i5;
        TransformOrigin transformOrigin2;
        int i6;
        float f2;
        int i7;
        float f3;
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(enter, "enter");
        Intrinsics.checkNotNullParameter(exit, "exit");
        Intrinsics.checkNotNullParameter(label, "label");
        composer.startReplaceableGroup(914000546);
        Modifier shrinkExpand = shrinkExpand(slideInOut(Modifier.INSTANCE, transition, SnapshotStateKt.rememberUpdatedState(enter.getData().getSlide(), composer, 0), SnapshotStateKt.rememberUpdatedState(exit.getData().getSlide(), composer, 0), label), transition, SnapshotStateKt.rememberUpdatedState(enter.getData().getChangeSize(), composer, 0), SnapshotStateKt.rememberUpdatedState(exit.getData().getChangeSize(), composer, 0), label);
        int i8 = i & 14;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) rememberedValue;
        composer.startReplaceableGroup(1157296644);
        boolean changed2 = composer.changed(transition);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState4 = (MutableState) rememberedValue2;
        if (transition.getCurrentState() != transition.getTargetState() || transition.isSeeking()) {
            if (enter.getData().getFade() != null || exit.getData().getFade() != null) {
                m65createModifier$lambda2(mutableState3, true);
            }
            if (enter.getData().getScale() != null || exit.getData().getScale() != null) {
                m67createModifier$lambda5(mutableState4, true);
            }
        } else {
            m65createModifier$lambda2(mutableState3, false);
            m67createModifier$lambda5(mutableState4, false);
        }
        composer.startReplaceableGroup(1657240548);
        float f4 = 1.0f;
        if (m62createModifier$lambda1(mutableState3)) {
            Function3 function3 = new Function3() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$alpha$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment<EnterExitState>) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<EnterExitState> animateFloat, @Nullable Composer composer2, int i9) {
                    FiniteAnimationSpec finiteAnimationSpec;
                    Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                    composer2.startReplaceableGroup(-57153604);
                    EnterExitState enterExitState = EnterExitState.PreEnter;
                    EnterExitState enterExitState2 = EnterExitState.Visible;
                    if (animateFloat.isTransitioningTo(enterExitState, enterExitState2)) {
                        Fade fade = EnterTransition.this.getData().getFade();
                        if (fade == null || (finiteAnimationSpec = fade.getAnimationSpec()) == null) {
                            finiteAnimationSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                        }
                    } else if (!animateFloat.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                        finiteAnimationSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                    } else {
                        Fade fade2 = exit.getData().getFade();
                        if (fade2 == null || (finiteAnimationSpec = fade2.getAnimationSpec()) == null) {
                            finiteAnimationSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                        }
                    }
                    composer2.endReplaceableGroup();
                    return finiteAnimationSpec;
                }
            };
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = label + " alpha";
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            String str = (String) rememberedValue3;
            composer.startReplaceableGroup(-1338768149);
            TwoWayConverter vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            int i9 = ((i8 | 384) & 14) | 3072;
            composer.startReplaceableGroup(-142660079);
            EnterExitState enterExitState = (EnterExitState) transition.getCurrentState();
            composer.startReplaceableGroup(755689166);
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i10 = iArr[enterExitState.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    Fade fade = enter.getData().getFade();
                    if (fade != null) {
                        f2 = fade.getAlpha();
                        composer.endReplaceableGroup();
                        Float valueOf = Float.valueOf(f2);
                        EnterExitState enterExitState2 = (EnterExitState) transition.getTargetState();
                        composer.startReplaceableGroup(755689166);
                        i7 = iArr[enterExitState2.ordinal()];
                        if (i7 != 1) {
                        }
                        f3 = 1.0f;
                        composer.endReplaceableGroup();
                        i2 = -492369756;
                        mutableState = mutableState4;
                        mutableState2 = mutableState3;
                        transformOrigin = null;
                        state = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, valueOf, Float.valueOf(f3), (FiniteAnimationSpec) function3.invoke(transition.getSegment(), composer, 0), vectorConverter, str, composer, (i9 & 14) | 196608);
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                    }
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Fade fade2 = exit.getData().getFade();
                    if (fade2 != null) {
                        f2 = fade2.getAlpha();
                        composer.endReplaceableGroup();
                        Float valueOf2 = Float.valueOf(f2);
                        EnterExitState enterExitState22 = (EnterExitState) transition.getTargetState();
                        composer.startReplaceableGroup(755689166);
                        i7 = iArr[enterExitState22.ordinal()];
                        if (i7 != 1) {
                            if (i7 == 2) {
                                Fade fade3 = enter.getData().getFade();
                                if (fade3 != null) {
                                    f3 = fade3.getAlpha();
                                    composer.endReplaceableGroup();
                                    i2 = -492369756;
                                    mutableState = mutableState4;
                                    mutableState2 = mutableState3;
                                    transformOrigin = null;
                                    state = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, valueOf2, Float.valueOf(f3), (FiniteAnimationSpec) function3.invoke(transition.getSegment(), composer, 0), vectorConverter, str, composer, (i9 & 14) | 196608);
                                    composer.endReplaceableGroup();
                                    composer.endReplaceableGroup();
                                }
                            } else {
                                if (i7 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Fade fade4 = exit.getData().getFade();
                                if (fade4 != null) {
                                    f3 = fade4.getAlpha();
                                    composer.endReplaceableGroup();
                                    i2 = -492369756;
                                    mutableState = mutableState4;
                                    mutableState2 = mutableState3;
                                    transformOrigin = null;
                                    state = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, valueOf2, Float.valueOf(f3), (FiniteAnimationSpec) function3.invoke(transition.getSegment(), composer, 0), vectorConverter, str, composer, (i9 & 14) | 196608);
                                    composer.endReplaceableGroup();
                                    composer.endReplaceableGroup();
                                }
                            }
                        }
                        f3 = 1.0f;
                        composer.endReplaceableGroup();
                        i2 = -492369756;
                        mutableState = mutableState4;
                        mutableState2 = mutableState3;
                        transformOrigin = null;
                        state = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, valueOf2, Float.valueOf(f3), (FiniteAnimationSpec) function3.invoke(transition.getSegment(), composer, 0), vectorConverter, str, composer, (i9 & 14) | 196608);
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                    }
                }
            }
            f2 = 1.0f;
            composer.endReplaceableGroup();
            Float valueOf22 = Float.valueOf(f2);
            EnterExitState enterExitState222 = (EnterExitState) transition.getTargetState();
            composer.startReplaceableGroup(755689166);
            i7 = iArr[enterExitState222.ordinal()];
            if (i7 != 1) {
            }
            f3 = 1.0f;
            composer.endReplaceableGroup();
            i2 = -492369756;
            mutableState = mutableState4;
            mutableState2 = mutableState3;
            transformOrigin = null;
            state = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, valueOf22, Float.valueOf(f3), (FiniteAnimationSpec) function3.invoke(transition.getSegment(), composer, 0), vectorConverter, str, composer, (i9 & 14) | 196608);
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        } else {
            i2 = -492369756;
            mutableState = mutableState4;
            mutableState2 = mutableState3;
            transformOrigin = null;
            state = DefaultAlpha;
        }
        final State state2 = state;
        composer.endReplaceableGroup();
        if (m66createModifier$lambda4(mutableState)) {
            Function3 function32 = new Function3() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$scale$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment<EnterExitState>) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<EnterExitState> animateFloat, @Nullable Composer composer2, int i11) {
                    FiniteAnimationSpec finiteAnimationSpec;
                    Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                    composer2.startReplaceableGroup(-53984035);
                    EnterExitState enterExitState3 = EnterExitState.PreEnter;
                    EnterExitState enterExitState4 = EnterExitState.Visible;
                    if (animateFloat.isTransitioningTo(enterExitState3, enterExitState4)) {
                        Scale scale = EnterTransition.this.getData().getScale();
                        if (scale == null || (finiteAnimationSpec = scale.getAnimationSpec()) == null) {
                            finiteAnimationSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                        }
                    } else if (!animateFloat.isTransitioningTo(enterExitState4, EnterExitState.PostExit)) {
                        finiteAnimationSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                    } else {
                        Scale scale2 = exit.getData().getScale();
                        if (scale2 == null || (finiteAnimationSpec = scale2.getAnimationSpec()) == null) {
                            finiteAnimationSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                        }
                    }
                    composer2.endReplaceableGroup();
                    return finiteAnimationSpec;
                }
            };
            composer.startReplaceableGroup(i2);
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = label + " scale";
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            String str2 = (String) rememberedValue4;
            composer.startReplaceableGroup(-1338768149);
            TwoWayConverter vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            int i11 = ((i8 | 384) & 14) | 3072;
            composer.startReplaceableGroup(-142660079);
            EnterExitState enterExitState3 = (EnterExitState) transition.getCurrentState();
            composer.startReplaceableGroup(-596129937);
            int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
            int i12 = iArr2[enterExitState3.ordinal()];
            if (i12 == 1) {
                i3 = 3;
            } else if (i12 != 2) {
                i3 = 3;
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Scale scale = exit.getData().getScale();
                if (scale != null) {
                    f = scale.getScale();
                    composer.endReplaceableGroup();
                    Float valueOf3 = Float.valueOf(f);
                    EnterExitState enterExitState4 = (EnterExitState) transition.getTargetState();
                    composer.startReplaceableGroup(-596129937);
                    i4 = iArr2[enterExitState4.ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Scale scale2 = enter.getData().getScale();
                            if (scale2 != null) {
                                f4 = scale2.getScale();
                            }
                        } else {
                            if (i4 != i3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Scale scale3 = exit.getData().getScale();
                            if (scale3 != null) {
                                f4 = scale3.getScale();
                            }
                        }
                    }
                    composer.endReplaceableGroup();
                    final State createTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, valueOf3, Float.valueOf(f4), (FiniteAnimationSpec) function32.invoke(transition.getSegment(), composer, 0), vectorConverter2, str2, composer, (i11 & 14) | 196608);
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    if (transition.getCurrentState() == EnterExitState.PreEnter) {
                        Scale scale4 = enter.getData().getScale();
                        if (scale4 != null || (scale4 = exit.getData().getScale()) != null) {
                            m1618boximpl = TransformOrigin.m1618boximpl(scale4.getTransformOrigin());
                            TwoWayConverter twoWayConverter = TransformOriginVectorConverter;
                            int i13 = i8 | 3136;
                            composer.startReplaceableGroup(-142660079);
                            EnterExitTransitionKt$createModifier$$inlined$animateValue$1 enterExitTransitionKt$createModifier$$inlined$animateValue$1 = new Function3() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$$inlined$animateValue$1
                                @Composable
                                @NotNull
                                public final SpringSpec<TransformOrigin> invoke(@NotNull Transition.Segment<EnterExitState> segment, @Nullable Composer composer2, int i14) {
                                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                                    composer2.startReplaceableGroup(-895531546);
                                    SpringSpec<TransformOrigin> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                                    composer2.endReplaceableGroup();
                                    return spring$default;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    return invoke((Transition.Segment<EnterExitState>) obj, (Composer) obj2, ((Number) obj3).intValue());
                                }
                            };
                            EnterExitState enterExitState5 = (EnterExitState) transition.getCurrentState();
                            composer.startReplaceableGroup(-288165413);
                            i5 = iArr2[enterExitState5.ordinal()];
                            if (i5 != 1) {
                                transformOrigin2 = m1618boximpl;
                            } else if (i5 == 2) {
                                Scale scale5 = enter.getData().getScale();
                                if (scale5 != null || (scale5 = exit.getData().getScale()) != null) {
                                    transformOrigin2 = TransformOrigin.m1618boximpl(scale5.getTransformOrigin());
                                }
                                transformOrigin2 = transformOrigin;
                            } else {
                                if (i5 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Scale scale6 = exit.getData().getScale();
                                if (scale6 != null || (scale6 = enter.getData().getScale()) != null) {
                                    transformOrigin2 = TransformOrigin.m1618boximpl(scale6.getTransformOrigin());
                                }
                                transformOrigin2 = transformOrigin;
                            }
                            long packedValue = transformOrigin2 == null ? transformOrigin2.getPackedValue() : TransformOrigin.INSTANCE.m1627getCenterSzJe1aQ();
                            composer.endReplaceableGroup();
                            TransformOrigin m1618boximpl2 = TransformOrigin.m1618boximpl(packedValue);
                            EnterExitState enterExitState6 = (EnterExitState) transition.getTargetState();
                            composer.startReplaceableGroup(-288165413);
                            i6 = iArr2[enterExitState6.ordinal()];
                            if (i6 != 1) {
                                if (i6 == 2) {
                                    Scale scale7 = enter.getData().getScale();
                                    if (scale7 != null || (scale7 = exit.getData().getScale()) != null) {
                                        m1618boximpl = TransformOrigin.m1618boximpl(scale7.getTransformOrigin());
                                    }
                                    m1618boximpl = transformOrigin;
                                } else {
                                    if (i6 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Scale scale8 = exit.getData().getScale();
                                    if (scale8 != null || (scale8 = enter.getData().getScale()) != null) {
                                        m1618boximpl = TransformOrigin.m1618boximpl(scale8.getTransformOrigin());
                                    }
                                    m1618boximpl = transformOrigin;
                                }
                            }
                            long packedValue2 = m1618boximpl == null ? m1618boximpl.getPackedValue() : TransformOrigin.INSTANCE.m1627getCenterSzJe1aQ();
                            composer.endReplaceableGroup();
                            final State createTransitionAnimation2 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, m1618boximpl2, TransformOrigin.m1618boximpl(packedValue2), (FiniteAnimationSpec) enterExitTransitionKt$createModifier$$inlined$animateValue$1.invoke((Object) transition.getSegment(), (Object) composer, (Object) 0), twoWayConverter, "TransformOriginInterruptionHandling", composer, (i13 & 14) | 229376);
                            composer.endReplaceableGroup();
                            shrinkExpand = GraphicsLayerModifierKt.graphicsLayer(shrinkExpand, new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((GraphicsLayerScope) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GraphicsLayerScope graphicsLayer) {
                                    float m68createModifier$lambda8;
                                    float m63createModifier$lambda11;
                                    float m63createModifier$lambda112;
                                    long m64createModifier$lambda13;
                                    Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                                    m68createModifier$lambda8 = EnterExitTransitionKt.m68createModifier$lambda8(state2);
                                    graphicsLayer.setAlpha(m68createModifier$lambda8);
                                    m63createModifier$lambda11 = EnterExitTransitionKt.m63createModifier$lambda11(createTransitionAnimation);
                                    graphicsLayer.setScaleX(m63createModifier$lambda11);
                                    m63createModifier$lambda112 = EnterExitTransitionKt.m63createModifier$lambda11(createTransitionAnimation);
                                    graphicsLayer.setScaleY(m63createModifier$lambda112);
                                    m64createModifier$lambda13 = EnterExitTransitionKt.m64createModifier$lambda13(createTransitionAnimation2);
                                    graphicsLayer.mo1498setTransformOrigin__ExYCQ(m64createModifier$lambda13);
                                }
                            });
                        }
                        m1618boximpl = transformOrigin;
                        TwoWayConverter twoWayConverter2 = TransformOriginVectorConverter;
                        int i132 = i8 | 3136;
                        composer.startReplaceableGroup(-142660079);
                        EnterExitTransitionKt$createModifier$$inlined$animateValue$1 enterExitTransitionKt$createModifier$$inlined$animateValue$12 = new Function3() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$$inlined$animateValue$1
                            @Composable
                            @NotNull
                            public final SpringSpec<TransformOrigin> invoke(@NotNull Transition.Segment<EnterExitState> segment, @Nullable Composer composer2, int i14) {
                                Intrinsics.checkNotNullParameter(segment, "$this$null");
                                composer2.startReplaceableGroup(-895531546);
                                SpringSpec<TransformOrigin> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                                composer2.endReplaceableGroup();
                                return spring$default;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                return invoke((Transition.Segment<EnterExitState>) obj, (Composer) obj2, ((Number) obj3).intValue());
                            }
                        };
                        EnterExitState enterExitState52 = (EnterExitState) transition.getCurrentState();
                        composer.startReplaceableGroup(-288165413);
                        i5 = iArr2[enterExitState52.ordinal()];
                        if (i5 != 1) {
                        }
                        if (transformOrigin2 == null) {
                        }
                        composer.endReplaceableGroup();
                        TransformOrigin m1618boximpl22 = TransformOrigin.m1618boximpl(packedValue);
                        EnterExitState enterExitState62 = (EnterExitState) transition.getTargetState();
                        composer.startReplaceableGroup(-288165413);
                        i6 = iArr2[enterExitState62.ordinal()];
                        if (i6 != 1) {
                        }
                        if (m1618boximpl == null) {
                        }
                        composer.endReplaceableGroup();
                        final State<TransformOrigin> createTransitionAnimation22 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, m1618boximpl22, TransformOrigin.m1618boximpl(packedValue2), (FiniteAnimationSpec) enterExitTransitionKt$createModifier$$inlined$animateValue$12.invoke((Object) transition.getSegment(), (Object) composer, (Object) 0), twoWayConverter2, "TransformOriginInterruptionHandling", composer, (i132 & 14) | 229376);
                        composer.endReplaceableGroup();
                        shrinkExpand = GraphicsLayerModifierKt.graphicsLayer(shrinkExpand, new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((GraphicsLayerScope) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GraphicsLayerScope graphicsLayer) {
                                float m68createModifier$lambda8;
                                float m63createModifier$lambda11;
                                float m63createModifier$lambda112;
                                long m64createModifier$lambda13;
                                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                                m68createModifier$lambda8 = EnterExitTransitionKt.m68createModifier$lambda8(state2);
                                graphicsLayer.setAlpha(m68createModifier$lambda8);
                                m63createModifier$lambda11 = EnterExitTransitionKt.m63createModifier$lambda11(createTransitionAnimation);
                                graphicsLayer.setScaleX(m63createModifier$lambda11);
                                m63createModifier$lambda112 = EnterExitTransitionKt.m63createModifier$lambda11(createTransitionAnimation);
                                graphicsLayer.setScaleY(m63createModifier$lambda112);
                                m64createModifier$lambda13 = EnterExitTransitionKt.m64createModifier$lambda13(createTransitionAnimation22);
                                graphicsLayer.mo1498setTransformOrigin__ExYCQ(m64createModifier$lambda13);
                            }
                        });
                    } else {
                        Scale scale9 = exit.getData().getScale();
                        if (scale9 != null || (scale9 = enter.getData().getScale()) != null) {
                            m1618boximpl = TransformOrigin.m1618boximpl(scale9.getTransformOrigin());
                            TwoWayConverter twoWayConverter22 = TransformOriginVectorConverter;
                            int i1322 = i8 | 3136;
                            composer.startReplaceableGroup(-142660079);
                            EnterExitTransitionKt$createModifier$$inlined$animateValue$1 enterExitTransitionKt$createModifier$$inlined$animateValue$122 = new Function3() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$$inlined$animateValue$1
                                @Composable
                                @NotNull
                                public final SpringSpec<TransformOrigin> invoke(@NotNull Transition.Segment<EnterExitState> segment, @Nullable Composer composer2, int i14) {
                                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                                    composer2.startReplaceableGroup(-895531546);
                                    SpringSpec<TransformOrigin> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                                    composer2.endReplaceableGroup();
                                    return spring$default;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    return invoke((Transition.Segment<EnterExitState>) obj, (Composer) obj2, ((Number) obj3).intValue());
                                }
                            };
                            EnterExitState enterExitState522 = (EnterExitState) transition.getCurrentState();
                            composer.startReplaceableGroup(-288165413);
                            i5 = iArr2[enterExitState522.ordinal()];
                            if (i5 != 1) {
                            }
                            if (transformOrigin2 == null) {
                            }
                            composer.endReplaceableGroup();
                            TransformOrigin m1618boximpl222 = TransformOrigin.m1618boximpl(packedValue);
                            EnterExitState enterExitState622 = (EnterExitState) transition.getTargetState();
                            composer.startReplaceableGroup(-288165413);
                            i6 = iArr2[enterExitState622.ordinal()];
                            if (i6 != 1) {
                            }
                            if (m1618boximpl == null) {
                            }
                            composer.endReplaceableGroup();
                            final State<TransformOrigin> createTransitionAnimation222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, m1618boximpl222, TransformOrigin.m1618boximpl(packedValue2), (FiniteAnimationSpec) enterExitTransitionKt$createModifier$$inlined$animateValue$122.invoke((Object) transition.getSegment(), (Object) composer, (Object) 0), twoWayConverter22, "TransformOriginInterruptionHandling", composer, (i1322 & 14) | 229376);
                            composer.endReplaceableGroup();
                            shrinkExpand = GraphicsLayerModifierKt.graphicsLayer(shrinkExpand, new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((GraphicsLayerScope) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GraphicsLayerScope graphicsLayer) {
                                    float m68createModifier$lambda8;
                                    float m63createModifier$lambda11;
                                    float m63createModifier$lambda112;
                                    long m64createModifier$lambda13;
                                    Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                                    m68createModifier$lambda8 = EnterExitTransitionKt.m68createModifier$lambda8(state2);
                                    graphicsLayer.setAlpha(m68createModifier$lambda8);
                                    m63createModifier$lambda11 = EnterExitTransitionKt.m63createModifier$lambda11(createTransitionAnimation);
                                    graphicsLayer.setScaleX(m63createModifier$lambda11);
                                    m63createModifier$lambda112 = EnterExitTransitionKt.m63createModifier$lambda11(createTransitionAnimation);
                                    graphicsLayer.setScaleY(m63createModifier$lambda112);
                                    m64createModifier$lambda13 = EnterExitTransitionKt.m64createModifier$lambda13(createTransitionAnimation222);
                                    graphicsLayer.mo1498setTransformOrigin__ExYCQ(m64createModifier$lambda13);
                                }
                            });
                        }
                        m1618boximpl = transformOrigin;
                        TwoWayConverter twoWayConverter222 = TransformOriginVectorConverter;
                        int i13222 = i8 | 3136;
                        composer.startReplaceableGroup(-142660079);
                        EnterExitTransitionKt$createModifier$$inlined$animateValue$1 enterExitTransitionKt$createModifier$$inlined$animateValue$1222 = new Function3() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$$inlined$animateValue$1
                            @Composable
                            @NotNull
                            public final SpringSpec<TransformOrigin> invoke(@NotNull Transition.Segment<EnterExitState> segment, @Nullable Composer composer2, int i14) {
                                Intrinsics.checkNotNullParameter(segment, "$this$null");
                                composer2.startReplaceableGroup(-895531546);
                                SpringSpec<TransformOrigin> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                                composer2.endReplaceableGroup();
                                return spring$default;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                return invoke((Transition.Segment<EnterExitState>) obj, (Composer) obj2, ((Number) obj3).intValue());
                            }
                        };
                        EnterExitState enterExitState5222 = (EnterExitState) transition.getCurrentState();
                        composer.startReplaceableGroup(-288165413);
                        i5 = iArr2[enterExitState5222.ordinal()];
                        if (i5 != 1) {
                        }
                        if (transformOrigin2 == null) {
                        }
                        composer.endReplaceableGroup();
                        TransformOrigin m1618boximpl2222 = TransformOrigin.m1618boximpl(packedValue);
                        EnterExitState enterExitState6222 = (EnterExitState) transition.getTargetState();
                        composer.startReplaceableGroup(-288165413);
                        i6 = iArr2[enterExitState6222.ordinal()];
                        if (i6 != 1) {
                        }
                        if (m1618boximpl == null) {
                        }
                        composer.endReplaceableGroup();
                        final State<TransformOrigin> createTransitionAnimation2222 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, m1618boximpl2222, TransformOrigin.m1618boximpl(packedValue2), (FiniteAnimationSpec) enterExitTransitionKt$createModifier$$inlined$animateValue$1222.invoke((Object) transition.getSegment(), (Object) composer, (Object) 0), twoWayConverter222, "TransformOriginInterruptionHandling", composer, (i13222 & 14) | 229376);
                        composer.endReplaceableGroup();
                        shrinkExpand = GraphicsLayerModifierKt.graphicsLayer(shrinkExpand, new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((GraphicsLayerScope) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GraphicsLayerScope graphicsLayer) {
                                float m68createModifier$lambda8;
                                float m63createModifier$lambda11;
                                float m63createModifier$lambda112;
                                long m64createModifier$lambda13;
                                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                                m68createModifier$lambda8 = EnterExitTransitionKt.m68createModifier$lambda8(state2);
                                graphicsLayer.setAlpha(m68createModifier$lambda8);
                                m63createModifier$lambda11 = EnterExitTransitionKt.m63createModifier$lambda11(createTransitionAnimation);
                                graphicsLayer.setScaleX(m63createModifier$lambda11);
                                m63createModifier$lambda112 = EnterExitTransitionKt.m63createModifier$lambda11(createTransitionAnimation);
                                graphicsLayer.setScaleY(m63createModifier$lambda112);
                                m64createModifier$lambda13 = EnterExitTransitionKt.m64createModifier$lambda13(createTransitionAnimation2222);
                                graphicsLayer.mo1498setTransformOrigin__ExYCQ(m64createModifier$lambda13);
                            }
                        });
                    }
                }
            } else {
                i3 = 3;
                Scale scale10 = enter.getData().getScale();
                if (scale10 != null) {
                    f = scale10.getScale();
                    composer.endReplaceableGroup();
                    Float valueOf32 = Float.valueOf(f);
                    EnterExitState enterExitState42 = (EnterExitState) transition.getTargetState();
                    composer.startReplaceableGroup(-596129937);
                    i4 = iArr2[enterExitState42.ordinal()];
                    if (i4 != 1) {
                    }
                    composer.endReplaceableGroup();
                    final State<Float> createTransitionAnimation3 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, valueOf32, Float.valueOf(f4), (FiniteAnimationSpec) function32.invoke(transition.getSegment(), composer, 0), vectorConverter2, str2, composer, (i11 & 14) | 196608);
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    if (transition.getCurrentState() == EnterExitState.PreEnter) {
                    }
                }
            }
            f = 1.0f;
            composer.endReplaceableGroup();
            Float valueOf322 = Float.valueOf(f);
            EnterExitState enterExitState422 = (EnterExitState) transition.getTargetState();
            composer.startReplaceableGroup(-596129937);
            i4 = iArr2[enterExitState422.ordinal()];
            if (i4 != 1) {
            }
            composer.endReplaceableGroup();
            final State<Float> createTransitionAnimation32 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, valueOf322, Float.valueOf(f4), (FiniteAnimationSpec) function32.invoke(transition.getSegment(), composer, 0), vectorConverter2, str2, composer, (i11 & 14) | 196608);
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (transition.getCurrentState() == EnterExitState.PreEnter) {
            }
        } else if (m62createModifier$lambda1(mutableState2)) {
            shrinkExpand = GraphicsLayerModifierKt.graphicsLayer(shrinkExpand, new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((GraphicsLayerScope) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GraphicsLayerScope graphicsLayer) {
                    float m68createModifier$lambda8;
                    Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                    m68createModifier$lambda8 = EnterExitTransitionKt.m68createModifier$lambda8(state2);
                    graphicsLayer.setAlpha(m68createModifier$lambda8);
                }
            });
        }
        composer.endReplaceableGroup();
        return shrinkExpand;
    }

    /* renamed from: createModifier$lambda-2, reason: not valid java name */
    private static final void m65createModifier$lambda2(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: createModifier$lambda-5, reason: not valid java name */
    private static final void m67createModifier$lambda5(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final Modifier slideInOut(Modifier modifier, final Transition transition, final State state, final State state2, final String str) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInOut$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            /* renamed from: invoke$lambda-2, reason: not valid java name */
            private static final void m83invoke$lambda2(MutableState mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(158379472);
                Transition<EnterExitState> transition2 = transition;
                composer.startReplaceableGroup(1157296644);
                boolean changed = composer.changed(transition2);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) rememberedValue;
                if (transition.getCurrentState() == transition.getTargetState() && !transition.isSeeking()) {
                    m83invoke$lambda2(mutableState, false);
                } else if (state.getValue() != null || state2.getValue() != null) {
                    m83invoke$lambda2(mutableState, true);
                }
                if (m82invoke$lambda1(mutableState)) {
                    Transition<EnterExitState> transition3 = transition;
                    TwoWayConverter vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE);
                    String str2 = str;
                    composer.startReplaceableGroup(-492369756);
                    Object rememberedValue2 = composer.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = str2 + " slide";
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    Transition.DeferredAnimation createDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition3, vectorConverter, (String) rememberedValue2, composer, 448, 0);
                    Transition<EnterExitState> transition4 = transition;
                    State<Slide> state3 = state;
                    State<Slide> state4 = state2;
                    composer.startReplaceableGroup(1157296644);
                    boolean changed2 = composer.changed(transition4);
                    Object rememberedValue3 = composer.rememberedValue();
                    if (changed2 || rememberedValue3 == companion.getEmpty()) {
                        rememberedValue3 = new SlideModifier(createDeferredAnimation, state3, state4);
                        composer.updateRememberedValue(rememberedValue3);
                    }
                    composer.endReplaceableGroup();
                    composed = composed.then((SlideModifier) rememberedValue3);
                }
                composer.endReplaceableGroup();
                return composed;
            }

            /* renamed from: invoke$lambda-1, reason: not valid java name */
            private static final boolean m82invoke$lambda1(MutableState mutableState) {
                return ((Boolean) mutableState.getValue()).booleanValue();
            }
        }, 1, null);
    }

    private static final Modifier shrinkExpand(Modifier modifier, final Transition transition, final State state, final State state2, final String str) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkExpand$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            /* renamed from: invoke$lambda-2, reason: not valid java name */
            private static final void m77invoke$lambda2(MutableState mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x010d  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x012f  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0192  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0196  */
            @Composable
            @NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                Alignment alignment;
                State rememberUpdatedState;
                Object rememberedValue;
                Composer.Companion companion;
                Object rememberedValue2;
                boolean changed;
                Object rememberedValue3;
                ChangeSize changeSize;
                Modifier composed = modifier2;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-140634085);
                Transition<EnterExitState> transition2 = transition;
                composer.startReplaceableGroup(1157296644);
                boolean changed2 = composer.changed(transition2);
                Object rememberedValue4 = composer.rememberedValue();
                if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer.updateRememberedValue(rememberedValue4);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) rememberedValue4;
                if (transition.getCurrentState() == transition.getTargetState() && !transition.isSeeking()) {
                    m77invoke$lambda2(mutableState, false);
                } else if (state.getValue() != null || state2.getValue() != null) {
                    m77invoke$lambda2(mutableState, true);
                }
                if (m76invoke$lambda1(mutableState)) {
                    boolean isTransitioningTo = transition.getSegment().isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible);
                    State<ChangeSize> state3 = state;
                    State<ChangeSize> state4 = state2;
                    if (isTransitioningTo) {
                        ChangeSize changeSize2 = (ChangeSize) state3.getValue();
                        if (changeSize2 == null || (alignment = changeSize2.getAlignment()) == null) {
                            ChangeSize changeSize3 = (ChangeSize) state4.getValue();
                            if (changeSize3 != null) {
                                alignment = changeSize3.getAlignment();
                            }
                            alignment = null;
                        }
                        rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(alignment, composer, 0);
                        Transition<EnterExitState> transition3 = transition;
                        TwoWayConverter vectorConverter = VectorConvertersKt.getVectorConverter(IntSize.INSTANCE);
                        String str2 = str;
                        composer.startReplaceableGroup(-492369756);
                        rememberedValue = composer.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (rememberedValue == companion.getEmpty()) {
                            rememberedValue = str2 + " shrink/expand";
                            composer.updateRememberedValue(rememberedValue);
                        }
                        composer.endReplaceableGroup();
                        Transition.DeferredAnimation createDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition3, vectorConverter, (String) rememberedValue, composer, 448, 0);
                        composer.startMovableGroup(-1553214637, Boolean.valueOf(transition.getCurrentState() == transition.getTargetState()));
                        Transition<EnterExitState> transition4 = transition;
                        TwoWayConverter vectorConverter2 = VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE);
                        String str3 = str;
                        composer.startReplaceableGroup(-492369756);
                        rememberedValue2 = composer.rememberedValue();
                        if (rememberedValue2 == companion.getEmpty()) {
                            rememberedValue2 = str3 + " InterruptionHandlingOffset";
                            composer.updateRememberedValue(rememberedValue2);
                        }
                        composer.endReplaceableGroup();
                        Transition.DeferredAnimation createDeferredAnimation2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition4, vectorConverter2, (String) rememberedValue2, composer, 448, 0);
                        composer.endMovableGroup();
                        Transition<EnterExitState> transition5 = transition;
                        State<ChangeSize> state5 = state;
                        State<ChangeSize> state6 = state2;
                        composer.startReplaceableGroup(1157296644);
                        changed = composer.changed(transition5);
                        rememberedValue3 = composer.rememberedValue();
                        if (!changed || rememberedValue3 == companion.getEmpty()) {
                            rememberedValue3 = new ExpandShrinkModifier(createDeferredAnimation, createDeferredAnimation2, state5, state6, rememberUpdatedState);
                            composer.updateRememberedValue(rememberedValue3);
                        }
                        composer.endReplaceableGroup();
                        ExpandShrinkModifier expandShrinkModifier = (ExpandShrinkModifier) rememberedValue3;
                        if (transition.getCurrentState() != transition.getTargetState()) {
                            expandShrinkModifier.setCurrentAlignment(null);
                        } else if (expandShrinkModifier.getCurrentAlignment() == null) {
                            Alignment alignment2 = (Alignment) rememberUpdatedState.getValue();
                            if (alignment2 == null) {
                                alignment2 = Alignment.INSTANCE.getTopStart();
                            }
                            expandShrinkModifier.setCurrentAlignment(alignment2);
                        }
                        ChangeSize changeSize4 = (ChangeSize) state.getValue();
                        composed = composed.then(((changeSize4 != null || changeSize4.getClip()) && ((changeSize = (ChangeSize) state2.getValue()) == null || changeSize.getClip())) ? ClipKt.clipToBounds(Modifier.INSTANCE) : Modifier.INSTANCE).then(expandShrinkModifier);
                    } else {
                        ChangeSize changeSize5 = (ChangeSize) state4.getValue();
                        if (changeSize5 == null || (alignment = changeSize5.getAlignment()) == null) {
                            ChangeSize changeSize6 = (ChangeSize) state3.getValue();
                            if (changeSize6 != null) {
                                alignment = changeSize6.getAlignment();
                            }
                            alignment = null;
                        }
                        rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(alignment, composer, 0);
                        Transition<EnterExitState> transition32 = transition;
                        TwoWayConverter vectorConverter3 = VectorConvertersKt.getVectorConverter(IntSize.INSTANCE);
                        String str22 = str;
                        composer.startReplaceableGroup(-492369756);
                        rememberedValue = composer.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (rememberedValue == companion.getEmpty()) {
                        }
                        composer.endReplaceableGroup();
                        Transition.DeferredAnimation createDeferredAnimation3 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition32, vectorConverter3, (String) rememberedValue, composer, 448, 0);
                        composer.startMovableGroup(-1553214637, Boolean.valueOf(transition.getCurrentState() == transition.getTargetState()));
                        Transition<EnterExitState> transition42 = transition;
                        TwoWayConverter vectorConverter22 = VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE);
                        String str32 = str;
                        composer.startReplaceableGroup(-492369756);
                        rememberedValue2 = composer.rememberedValue();
                        if (rememberedValue2 == companion.getEmpty()) {
                        }
                        composer.endReplaceableGroup();
                        Transition.DeferredAnimation createDeferredAnimation22 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition42, vectorConverter22, (String) rememberedValue2, composer, 448, 0);
                        composer.endMovableGroup();
                        Transition<EnterExitState> transition52 = transition;
                        State<ChangeSize> state52 = state;
                        State<ChangeSize> state62 = state2;
                        composer.startReplaceableGroup(1157296644);
                        changed = composer.changed(transition52);
                        rememberedValue3 = composer.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue3 = new ExpandShrinkModifier(createDeferredAnimation3, createDeferredAnimation22, state52, state62, rememberUpdatedState);
                        composer.updateRememberedValue(rememberedValue3);
                        composer.endReplaceableGroup();
                        ExpandShrinkModifier expandShrinkModifier2 = (ExpandShrinkModifier) rememberedValue3;
                        if (transition.getCurrentState() != transition.getTargetState()) {
                        }
                        ChangeSize changeSize42 = (ChangeSize) state.getValue();
                        composed = composed.then(((changeSize42 != null || changeSize42.getClip()) && ((changeSize = (ChangeSize) state2.getValue()) == null || changeSize.getClip())) ? ClipKt.clipToBounds(Modifier.INSTANCE) : Modifier.INSTANCE).then(expandShrinkModifier2);
                    }
                }
                composer.endReplaceableGroup();
                return composed;
            }

            /* renamed from: invoke$lambda-1, reason: not valid java name */
            private static final boolean m76invoke$lambda1(MutableState mutableState) {
                return ((Boolean) mutableState.getValue()).booleanValue();
            }
        }, 1, null);
    }

    /* renamed from: createModifier$lambda-1, reason: not valid java name */
    private static final boolean m62createModifier$lambda1(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: createModifier$lambda-4, reason: not valid java name */
    private static final boolean m66createModifier$lambda4(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createModifier$lambda-8, reason: not valid java name */
    public static final float m68createModifier$lambda8(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createModifier$lambda-11, reason: not valid java name */
    public static final float m63createModifier$lambda11(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createModifier$lambda-13, reason: not valid java name */
    public static final long m64createModifier$lambda13(State state) {
        return ((TransformOrigin) state.getValue()).getPackedValue();
    }
}
