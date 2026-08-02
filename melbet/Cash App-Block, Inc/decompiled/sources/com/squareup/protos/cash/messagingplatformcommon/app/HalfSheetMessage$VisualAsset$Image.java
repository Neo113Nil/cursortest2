package com.squareup.protos.cash.messagingplatformcommon.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class HalfSheetMessage$VisualAsset$Image {
    public final Image value;

    public HalfSheetMessage$VisualAsset$Image(Image image) {
        image.getClass();
        this.value = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HalfSheetMessage$VisualAsset$Image) && Intrinsics.areEqual(this.value, ((HalfSheetMessage$VisualAsset$Image) obj).value);
    }

    public final Image getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Image(value=" + this.value + ")";
    }
}
