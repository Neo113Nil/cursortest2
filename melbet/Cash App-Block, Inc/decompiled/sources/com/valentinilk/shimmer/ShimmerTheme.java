package com.valentinilk.shimmer;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.unit.Dp;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ShimmerTheme {
    public final InfiniteRepeatableSpec animationSpec;
    public final int blendMode;
    public final float rotation;
    public final List shaderColorStops;
    public final List shaderColors;

    public ShimmerTheme(InfiniteRepeatableSpec infiniteRepeatableSpec, int i, float f, List list, List list2) {
        list.getClass();
        this.animationSpec = infiniteRepeatableSpec;
        this.blendMode = i;
        this.rotation = f;
        this.shaderColors = list;
        this.shaderColorStops = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShimmerTheme)) {
            return false;
        }
        ShimmerTheme shimmerTheme = (ShimmerTheme) obj;
        return this.animationSpec.equals(shimmerTheme.animationSpec) && this.blendMode == shimmerTheme.blendMode && Float.compare(this.rotation, shimmerTheme.rotation) == 0 && Intrinsics.areEqual(this.shaderColors, shimmerTheme.shaderColors) && Intrinsics.areEqual(this.shaderColorStops, shimmerTheme.shaderColorStops) && Dp.m1037equalsimpl0(400.0f, 400.0f);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.rotation, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blendMode, this.animationSpec.hashCode() * 31, 31), 31), 31, this.shaderColors);
        List list = this.shaderColorStops;
        return Float.hashCode(400.0f) + ((m + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        return "ShimmerTheme(animationSpec=" + this.animationSpec + ", blendMode=" + ((Object) BlendMode.m669toStringimpl(this.blendMode)) + ", rotation=" + this.rotation + ", shaderColors=" + this.shaderColors + ", shaderColorStops=" + this.shaderColorStops + ", shimmerWidth=" + ((Object) Dp.m1038toStringimpl(400.0f)) + ')';
    }
}
