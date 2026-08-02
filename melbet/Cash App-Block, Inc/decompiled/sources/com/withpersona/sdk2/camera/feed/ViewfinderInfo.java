package com.withpersona.sdk2.camera.feed;

import android.graphics.Rect;

/* loaded from: classes5.dex */
public final class ViewfinderInfo {
    public final Rect region;
    public final Rect viewport;

    public ViewfinderInfo(Rect rect, Rect rect2) {
        this.region = rect;
        this.viewport = rect2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewfinderInfo)) {
            return false;
        }
        ViewfinderInfo viewfinderInfo = (ViewfinderInfo) obj;
        return this.region.equals(viewfinderInfo.region) && this.viewport.equals(viewfinderInfo.viewport);
    }

    public final int hashCode() {
        return this.viewport.hashCode() + (this.region.hashCode() * 31);
    }

    public final String toString() {
        return "ViewfinderInfo(region=" + this.region + ", viewport=" + this.viewport + ")";
    }
}
