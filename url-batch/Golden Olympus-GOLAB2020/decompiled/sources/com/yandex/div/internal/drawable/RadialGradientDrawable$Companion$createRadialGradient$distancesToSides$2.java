package com.yandex.div.internal.drawable;

import com.yandex.div.internal.drawable.RadialGradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class RadialGradientDrawable$Companion$createRadialGradient$distancesToSides$2 extends s implements Function0<Float[]> {
    final /* synthetic */ float $absoluteCenterX;
    final /* synthetic */ float $absoluteCenterY;
    final /* synthetic */ float $bottomCord;
    final /* synthetic */ float $leftCord;
    final /* synthetic */ float $rightCord;
    final /* synthetic */ float $topCord;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RadialGradientDrawable$Companion$createRadialGradient$distancesToSides$2(float f4, float f5, float f6, float f7, float f8, float f9) {
        super(0);
        this.$leftCord = f4;
        this.$rightCord = f5;
        this.$bottomCord = f6;
        this.$topCord = f7;
        this.$absoluteCenterX = f8;
        this.$absoluteCenterY = f9;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Float[] invoke() {
        float createRadialGradient$distToVerticalSide;
        float createRadialGradient$distToVerticalSide2;
        float createRadialGradient$distToHorizontalSide;
        float createRadialGradient$distToHorizontalSide2;
        createRadialGradient$distToVerticalSide = RadialGradientDrawable.Companion.createRadialGradient$distToVerticalSide(this.$absoluteCenterX, this.$leftCord);
        Float valueOf = Float.valueOf(createRadialGradient$distToVerticalSide);
        createRadialGradient$distToVerticalSide2 = RadialGradientDrawable.Companion.createRadialGradient$distToVerticalSide(this.$absoluteCenterX, this.$rightCord);
        Float valueOf2 = Float.valueOf(createRadialGradient$distToVerticalSide2);
        createRadialGradient$distToHorizontalSide = RadialGradientDrawable.Companion.createRadialGradient$distToHorizontalSide(this.$absoluteCenterY, this.$bottomCord);
        Float valueOf3 = Float.valueOf(createRadialGradient$distToHorizontalSide);
        createRadialGradient$distToHorizontalSide2 = RadialGradientDrawable.Companion.createRadialGradient$distToHorizontalSide(this.$absoluteCenterY, this.$topCord);
        return new Float[]{valueOf, valueOf2, valueOf3, Float.valueOf(createRadialGradient$distToHorizontalSide2)};
    }
}
