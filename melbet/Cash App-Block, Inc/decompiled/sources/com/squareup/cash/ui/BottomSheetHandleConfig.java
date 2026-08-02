package com.squareup.cash.ui;

import android.util.Size;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class BottomSheetHandleConfig {
    public final int bottomPadding;
    public final int color;
    public final float cornerRadius;
    public final Size size;
    public final int topPadding;

    public BottomSheetHandleConfig(int i, int i2, Size size, int i3, float f) {
        this.topPadding = i;
        this.bottomPadding = i2;
        this.size = size;
        this.color = i3;
        this.cornerRadius = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomSheetHandleConfig)) {
            return false;
        }
        BottomSheetHandleConfig bottomSheetHandleConfig = (BottomSheetHandleConfig) obj;
        return this.topPadding == bottomSheetHandleConfig.topPadding && this.bottomPadding == bottomSheetHandleConfig.bottomPadding && this.size.equals(bottomSheetHandleConfig.size) && this.color == bottomSheetHandleConfig.color && Float.compare(this.cornerRadius, bottomSheetHandleConfig.cornerRadius) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.cornerRadius) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.color, (this.size.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.bottomPadding, Integer.hashCode(this.topPadding) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.topPadding, this.bottomPadding, "BottomSheetHandleConfig(topPadding=", ", bottomPadding=", ", size=");
        m107m.append(this.size);
        m107m.append(", color=");
        m107m.append(this.color);
        m107m.append(", cornerRadius=");
        return Recorder$$ExternalSyntheticOutline1.m(this.cornerRadius, ")", m107m);
    }
}
