package com.yandex.div.internal.drawable;

import com.yandex.div.internal.drawable.RadialGradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class RadialGradientDrawable$Companion$createRadialGradient$distancesToCorners$2 extends s implements Function0<Float[]> {
    final /* synthetic */ float $absoluteCenterX;
    final /* synthetic */ float $absoluteCenterY;
    final /* synthetic */ float $bottomCord;
    final /* synthetic */ float $leftCord;
    final /* synthetic */ float $rightCord;
    final /* synthetic */ float $topCord;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RadialGradientDrawable$Companion$createRadialGradient$distancesToCorners$2(float f4, float f5, float f6, float f7, float f8, float f9) {
        super(0);
        this.$leftCord = f4;
        this.$topCord = f5;
        this.$rightCord = f6;
        this.$bottomCord = f7;
        this.$absoluteCenterX = f8;
        this.$absoluteCenterY = f9;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Float[] invoke() {
        float createRadialGradient$distTo;
        float createRadialGradient$distTo2;
        float createRadialGradient$distTo3;
        float createRadialGradient$distTo4;
        createRadialGradient$distTo = RadialGradientDrawable.Companion.createRadialGradient$distTo(this.$absoluteCenterX, this.$absoluteCenterY, this.$leftCord, this.$topCord);
        Float valueOf = Float.valueOf(createRadialGradient$distTo);
        createRadialGradient$distTo2 = RadialGradientDrawable.Companion.createRadialGradient$distTo(this.$absoluteCenterX, this.$absoluteCenterY, this.$rightCord, this.$topCord);
        Float valueOf2 = Float.valueOf(createRadialGradient$distTo2);
        createRadialGradient$distTo3 = RadialGradientDrawable.Companion.createRadialGradient$distTo(this.$absoluteCenterX, this.$absoluteCenterY, this.$rightCord, this.$bottomCord);
        Float valueOf3 = Float.valueOf(createRadialGradient$distTo3);
        createRadialGradient$distTo4 = RadialGradientDrawable.Companion.createRadialGradient$distTo(this.$absoluteCenterX, this.$absoluteCenterY, this.$leftCord, this.$bottomCord);
        return new Float[]{valueOf, valueOf2, valueOf3, Float.valueOf(createRadialGradient$distTo4)};
    }
}
