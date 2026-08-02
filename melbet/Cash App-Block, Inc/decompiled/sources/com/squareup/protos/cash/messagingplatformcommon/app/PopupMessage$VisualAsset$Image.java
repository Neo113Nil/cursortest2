package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjv;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PopupMessage$VisualAsset$Image extends zzjv {
    public final Image value;

    public PopupMessage$VisualAsset$Image(Image image) {
        image.getClass();
        this.value = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PopupMessage$VisualAsset$Image) && Intrinsics.areEqual(this.value, ((PopupMessage$VisualAsset$Image) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Image(value=" + this.value + ")";
    }
}
