package com.valentinilk.shimmer;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes8.dex */
public final class ShimmerEffect {
    public final Animatable animatedState;
    public final InfiniteRepeatableSpec animationSpec;
    public final int blendMode;
    public final AndroidPaint emptyPaint;
    public final long gradientFrom;
    public final long gradientTo;
    public final AndroidPaint paint;
    public final float rotation;
    public final List shaderColorStops;
    public final List shaderColors;
    public final float shimmerWidth;
    public final float[] transformationMatrix;

    public ShimmerEffect(InfiniteRepeatableSpec infiniteRepeatableSpec, int i, float f, List list, List list2, float f2) {
        list.getClass();
        this.animationSpec = infiniteRepeatableSpec;
        this.blendMode = i;
        this.rotation = f;
        this.shaderColors = list;
        this.shaderColorStops = list2;
        this.shimmerWidth = f2;
        this.animatedState = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
        this.transformationMatrix = Matrix.m699constructorimpl$default();
        long floatToRawIntBits = (Float.floatToRawIntBits((-f2) / 2.0f) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE));
        this.gradientFrom = floatToRawIntBits;
        this.gradientTo = floatToRawIntBits ^ (-9223372034707292160L);
        AndroidPaint Paint = ColorKt.Paint();
        Paint.setAntiAlias();
        Paint.m663setStylek9PVt8s(0);
        Paint.m658setBlendModes9anfk8(i);
        this.paint = Paint;
        this.emptyPaint = ColorKt.Paint();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ShimmerEffect.class != obj.getClass()) {
            return false;
        }
        ShimmerEffect shimmerEffect = (ShimmerEffect) obj;
        return this.animationSpec.equals(shimmerEffect.animationSpec) && this.blendMode == shimmerEffect.blendMode && this.rotation == shimmerEffect.rotation && Intrinsics.areEqual(this.shaderColors, shimmerEffect.shaderColors) && Intrinsics.areEqual(this.shaderColorStops, shimmerEffect.shaderColorStops) && this.shimmerWidth == shimmerEffect.shimmerWidth;
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.rotation, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blendMode, this.animationSpec.hashCode() * 31, 31), 31), 31, this.shaderColors);
        List list = this.shaderColorStops;
        return Float.hashCode(this.shimmerWidth) + ((m + (list != null ? list.hashCode() : 0)) * 31);
    }
}
