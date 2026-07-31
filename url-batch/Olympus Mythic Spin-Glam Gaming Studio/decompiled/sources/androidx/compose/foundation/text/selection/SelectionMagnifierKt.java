package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SelectionMagnifier.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00000\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Offset;", "magnifierCenter", "Lkotlin/Function1;", "platformMagnifier", "animatedSelectionMagnifier", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "targetCalculation", "Landroidx/compose/runtime/State;", "rememberAnimatedMagnifierPosition", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/AnimationVector2D;", "UnspecifiedAnimationVector2D", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/TwoWayConverter;", "UnspecifiedSafeOffsetVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "OffsetDisplacementThreshold", "J", "Landroidx/compose/animation/core/SpringSpec;", "MagnifierSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SelectionMagnifierKt {
    private static final SpringSpec MagnifierSpringSpec;
    private static final long OffsetDisplacementThreshold;
    private static final AnimationVector2D UnspecifiedAnimationVector2D = new AnimationVector2D(Float.NaN, Float.NaN);
    private static final TwoWayConverter UnspecifiedSafeOffsetVectorConverter = VectorConvertersKt.TwoWayConverter(new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m632invokek4lQ0M(((Offset) obj).getPackedValue());
        }

        @NotNull
        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final AnimationVector2D m632invokek4lQ0M(long j) {
            AnimationVector2D animationVector2D;
            if (!OffsetKt.m1310isSpecifiedk4lQ0M(j)) {
                animationVector2D = SelectionMagnifierKt.UnspecifiedAnimationVector2D;
                return animationVector2D;
            }
            return new AnimationVector2D(Offset.m1297getXimpl(j), Offset.m1298getYimpl(j));
        }
    }, new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Offset.m1288boximpl(m633invoketuRUvjQ((AnimationVector2D) obj));
        }

        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m633invoketuRUvjQ(@NotNull AnimationVector2D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return OffsetKt.Offset(it.getV1(), it.getV2());
        }
    });

    static {
        long Offset = OffsetKt.Offset(0.01f, 0.01f);
        OffsetDisplacementThreshold = Offset;
        MagnifierSpringSpec = new SpringSpec(0.0f, 0.0f, Offset.m1288boximpl(Offset), 3, null);
    }

    public static final Modifier animatedSelectionMagnifier(Modifier modifier, final Function0 magnifierCenter, final Function1 platformMagnifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        Intrinsics.checkNotNullParameter(platformMagnifier, "platformMagnifier");
        return ComposedModifierKt.composed$default(modifier, null, new Function3() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1
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
                final State rememberAnimatedMagnifierPosition;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(759876635);
                rememberAnimatedMagnifierPosition = SelectionMagnifierKt.rememberAnimatedMagnifierPosition(Function0.this, composer, 0);
                Modifier modifier2 = (Modifier) platformMagnifier.invoke(new Function0() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        return Offset.m1288boximpl(m636invokeF1C5BW0());
                    }

                    /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m636invokeF1C5BW0() {
                        return SelectionMagnifierKt$animatedSelectionMagnifier$1.m635invoke$lambda0(rememberAnimatedMagnifierPosition);
                    }
                });
                composer.endReplaceableGroup();
                return modifier2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: invoke$lambda-0, reason: not valid java name */
            public static final long m635invoke$lambda0(State state) {
                return ((Offset) state.getValue()).getPackedValue();
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State rememberAnimatedMagnifierPosition(Function0 function0, Composer composer, int i) {
        composer.startReplaceableGroup(-1589795249);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(function0);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        State state = (State) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new Animatable(Offset.m1288boximpl(m631rememberAnimatedMagnifierPosition$lambda1(state)), UnspecifiedSafeOffsetVectorConverter, Offset.m1288boximpl(OffsetDisplacementThreshold));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue2;
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(state, animatable, null), composer, 0);
        State asState = animatable.asState();
        composer.endReplaceableGroup();
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rememberAnimatedMagnifierPosition$lambda-1, reason: not valid java name */
    public static final long m631rememberAnimatedMagnifierPosition$lambda1(State state) {
        return ((Offset) state.getValue()).getPackedValue();
    }
}
