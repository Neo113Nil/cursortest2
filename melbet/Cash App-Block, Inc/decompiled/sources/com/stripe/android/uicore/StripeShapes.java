package com.stripe.android.uicore;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes8.dex */
public final class StripeShapes {
    public final float borderStrokeWidth;
    public final float bottomSheetCornerRadius;
    public final float cornerRadius;

    public StripeShapes(float f, float f2, float f3) {
        this.cornerRadius = f;
        this.bottomSheetCornerRadius = f2;
        this.borderStrokeWidth = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StripeShapes)) {
            return false;
        }
        StripeShapes stripeShapes = (StripeShapes) obj;
        return Float.compare(this.cornerRadius, stripeShapes.cornerRadius) == 0 && Float.compare(this.bottomSheetCornerRadius, stripeShapes.bottomSheetCornerRadius) == 0 && Float.compare(this.borderStrokeWidth, stripeShapes.borderStrokeWidth) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.borderStrokeWidth) + CameraState$Type$EnumUnboxingLocalUtility.m(this.bottomSheetCornerRadius, Float.hashCode(this.cornerRadius) * 31, 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(this.borderStrokeWidth, ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StripeShapes(cornerRadius=", this.cornerRadius, ", bottomSheetCornerRadius=", this.bottomSheetCornerRadius, ", borderStrokeWidth="));
    }
}
