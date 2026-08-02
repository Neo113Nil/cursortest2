package com.squareup.cash.ui.widget.amount;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class RawDigitLayout {
    public final float left;
    public final float opacity;
    public final float width;

    public RawDigitLayout(float f, float f2, float f3) {
        this.left = f;
        this.width = f2;
        this.opacity = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawDigitLayout)) {
            return false;
        }
        RawDigitLayout rawDigitLayout = (RawDigitLayout) obj;
        return Float.compare(this.left, rawDigitLayout.left) == 0 && Float.compare(this.width, rawDigitLayout.width) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.opacity, rawDigitLayout.opacity) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.opacity) + CameraState$Type$EnumUnboxingLocalUtility.m(1.0f, CameraState$Type$EnumUnboxingLocalUtility.m(this.width, Float.hashCode(this.left) * 31, 31), 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(this.opacity, ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RawDigitLayout(left=", this.left, ", width=", this.width, ", scale=1.0, opacity="));
    }
}
