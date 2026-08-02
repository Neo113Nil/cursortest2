package dev.chrisbanes.haze;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class RenderEffectParams {
    public final float blurRadius;
    public final int blurTileMode;
    public final long contentOffset;
    public final long contentSize;
    public final Brush mask;
    public final float noiseFactor;
    public final float scale;
    public final float tintAlphaModulate;
    public final List tints;

    public RenderEffectParams(float f, float f2, float f3, long j, long j2, List list, float f4, Brush brush, int i) {
        this.blurRadius = f;
        this.noiseFactor = f2;
        this.scale = f3;
        this.contentSize = j;
        this.contentOffset = j2;
        this.tints = list;
        this.tintAlphaModulate = f4;
        this.mask = brush;
        this.blurTileMode = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RenderEffectParams)) {
            return false;
        }
        RenderEffectParams renderEffectParams = (RenderEffectParams) obj;
        return Dp.m1037equalsimpl0(this.blurRadius, renderEffectParams.blurRadius) && Float.compare(this.noiseFactor, renderEffectParams.noiseFactor) == 0 && Float.compare(this.scale, renderEffectParams.scale) == 0 && Size.m639equalsimpl0(this.contentSize, renderEffectParams.contentSize) && Offset.m622equalsimpl0(this.contentOffset, renderEffectParams.contentOffset) && this.tints.equals(renderEffectParams.tints) && Float.compare(this.tintAlphaModulate, renderEffectParams.tintAlphaModulate) == 0 && Intrinsics.areEqual(this.mask, renderEffectParams.mask) && this.blurTileMode == renderEffectParams.blurTileMode;
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.tintAlphaModulate, Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.scale, CameraState$Type$EnumUnboxingLocalUtility.m(this.noiseFactor, Float.hashCode(this.blurRadius) * 31, 31), 31), 31, this.contentSize), 31, this.contentOffset), 31, this.tints), 31);
        Brush brush = this.mask;
        return Integer.hashCode(this.blurTileMode) + ((m + (brush == null ? 0 : brush.hashCode())) * 961);
    }

    public final String toString() {
        String m1038toStringimpl = Dp.m1038toStringimpl(this.blurRadius);
        String m646toStringimpl = Size.m646toStringimpl(this.contentSize);
        String m628toStringimpl = Offset.m628toStringimpl(this.contentOffset);
        String m713toStringimpl = TileMode.m713toStringimpl(this.blurTileMode);
        StringBuilder sb = new StringBuilder("RenderEffectParams(blurRadius=");
        sb.append(m1038toStringimpl);
        sb.append(", noiseFactor=");
        sb.append(this.noiseFactor);
        sb.append(", scale=");
        sb.append(this.scale);
        sb.append(", contentSize=");
        sb.append(m646toStringimpl);
        sb.append(", contentOffset=");
        NavAction$$ExternalSyntheticOutline0.m(m628toStringimpl, ", tints=", ", tintAlphaModulate=", sb, this.tints);
        sb.append(this.tintAlphaModulate);
        sb.append(", mask=");
        sb.append(this.mask);
        sb.append(", progressive=null, blurTileMode=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m713toStringimpl, ")");
    }
}
