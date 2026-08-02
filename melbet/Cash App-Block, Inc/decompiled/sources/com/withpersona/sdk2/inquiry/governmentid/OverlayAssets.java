package com.withpersona.sdk2.inquiry.governmentid;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;

/* loaded from: classes9.dex */
public final class OverlayAssets {
    public final int guideDrawable;
    public final int hintAnimation;

    public OverlayAssets(int i, int i2) {
        this.hintAnimation = i;
        this.guideDrawable = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverlayAssets)) {
            return false;
        }
        OverlayAssets overlayAssets = (OverlayAssets) obj;
        return this.hintAnimation == overlayAssets.hintAnimation && this.guideDrawable == overlayAssets.guideDrawable;
    }

    public final int hashCode() {
        return Integer.hashCode(this.guideDrawable) + (Integer.hashCode(this.hintAnimation) * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline2.m(this.hintAnimation, this.guideDrawable, "OverlayAssets(hintAnimation=", ", guideDrawable=", ")");
    }
}
