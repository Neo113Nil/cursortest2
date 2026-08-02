package com.squareup.util.android.drawable;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;

/* loaded from: classes.dex */
public final class ViewShadowInfo {
    public final float alpha;
    public final float elevation;
    public final int yOffset;

    public ViewShadowInfo(Resources resources, int i, int i2, int i3) {
        resources.getClass();
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        TypedValue typedValue = new TypedValue();
        resources.getValue(i2, typedValue, true);
        float f = typedValue.getFloat();
        float dimension = resources.getDimension(i3);
        this.yOffset = dimensionPixelSize;
        this.elevation = dimension;
        this.alpha = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewShadowInfo)) {
            return false;
        }
        ViewShadowInfo viewShadowInfo = (ViewShadowInfo) obj;
        return this.yOffset == viewShadowInfo.yOffset && Float.compare(this.elevation, viewShadowInfo.elevation) == 0 && Float.compare(this.alpha, viewShadowInfo.alpha) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.alpha) + CameraState$Type$EnumUnboxingLocalUtility.m(this.elevation, Integer.hashCode(this.yOffset) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewShadowInfo(yOffset=");
        sb.append(this.yOffset);
        sb.append(", elevation=");
        sb.append(this.elevation);
        sb.append(", alpha=");
        return Recorder$$ExternalSyntheticOutline1.m(this.alpha, ")", sb);
    }
}
