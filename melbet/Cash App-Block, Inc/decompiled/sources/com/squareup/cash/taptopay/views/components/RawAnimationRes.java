package com.squareup.cash.taptopay.views.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;

/* loaded from: classes7.dex */
public final class RawAnimationRes {
    public final int side;
    public final int topAndBottom;

    public RawAnimationRes(int i, int i2) {
        this.topAndBottom = i;
        this.side = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawAnimationRes)) {
            return false;
        }
        RawAnimationRes rawAnimationRes = (RawAnimationRes) obj;
        return this.topAndBottom == rawAnimationRes.topAndBottom && this.side == rawAnimationRes.side;
    }

    public final int hashCode() {
        return Integer.hashCode(this.side) + (Integer.hashCode(this.topAndBottom) * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline2.m(this.topAndBottom, this.side, "RawAnimationRes(topAndBottom=", ", side=", ")");
    }
}
