package com.squareup.protos.cash.messagingplatformcommon.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class FullScreenMessage$VisualAsset$Video {
    public final Video value;

    public FullScreenMessage$VisualAsset$Video(Video video) {
        video.getClass();
        this.value = video;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FullScreenMessage$VisualAsset$Video) && Intrinsics.areEqual(this.value, ((FullScreenMessage$VisualAsset$Video) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Video(value=" + this.value + ")";
    }
}
