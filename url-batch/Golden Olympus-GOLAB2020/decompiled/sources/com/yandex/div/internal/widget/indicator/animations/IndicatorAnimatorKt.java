package com.yandex.div.internal.widget.indicator.animations;

import W1.m;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Animation;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class IndicatorAnimatorKt {

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndicatorParams$Animation.values().length];
            try {
                iArr[IndicatorParams$Animation.SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndicatorParams$Animation.WORM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndicatorParams$Animation.SLIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final IndicatorAnimator getIndicatorAnimator(@NotNull IndicatorParams$Style style) {
        Intrinsics.checkNotNullParameter(style, "style");
        int i4 = WhenMappings.$EnumSwitchMapping$0[style.getAnimation().ordinal()];
        if (i4 == 1) {
            return new ScaleIndicatorAnimator(style);
        }
        if (i4 == 2) {
            return new WormIndicatorAnimator(style);
        }
        if (i4 == 3) {
            return new SliderIndicatorAnimator(style);
        }
        throw new m();
    }
}
