package androidx.compose.animation;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: SingleValueAnimation.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\"\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function1;", "", "finishedListener", "Landroidx/compose/runtime/State;", "animateColorAsState-KTwxG1Y", "(JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateColorAsState", "Landroidx/compose/animation/core/SpringSpec;", "colorDefaultSpring", "Landroidx/compose/animation/core/SpringSpec;", "animation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SingleValueAnimationKt {
    private static final SpringSpec colorDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    /* renamed from: animateColorAsState-KTwxG1Y, reason: not valid java name */
    public static final State m92animateColorAsStateKTwxG1Y(long j, AnimationSpec animationSpec, Function1 function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1942442407);
        if ((i2 & 2) != 0) {
            animationSpec = colorDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        ColorSpace m1450getColorSpaceimpl = Color.m1450getColorSpaceimpl(j);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(m1450getColorSpaceimpl);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(Color.m1450getColorSpaceimpl(j));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        State animateValueAsState = AnimateAsStateKt.animateValueAsState(Color.m1441boximpl(j), (TwoWayConverter) rememberedValue, animationSpec2, null, function12, composer, (i & 14) | 576 | ((i << 6) & 57344), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }
}
