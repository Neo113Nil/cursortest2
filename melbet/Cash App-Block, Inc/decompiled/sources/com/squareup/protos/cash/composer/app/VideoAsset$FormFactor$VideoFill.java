package com.squareup.protos.cash.composer.app;

import com.squareup.protos.cash.composer.app.VideoAsset;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class VideoAsset$FormFactor$VideoFill {
    public final VideoAsset.VideoFill value;

    public VideoAsset$FormFactor$VideoFill(VideoAsset.VideoFill videoFill) {
        videoFill.getClass();
        this.value = videoFill;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoAsset$FormFactor$VideoFill) && Intrinsics.areEqual(this.value, ((VideoAsset$FormFactor$VideoFill) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "VideoFill(value=" + this.value + ")";
    }
}
