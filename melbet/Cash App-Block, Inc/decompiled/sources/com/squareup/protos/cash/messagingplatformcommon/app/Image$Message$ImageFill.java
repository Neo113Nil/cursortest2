package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjs;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Image$Message$ImageFill extends zzjs {
    public final ImageFill value;

    public Image$Message$ImageFill(ImageFill imageFill) {
        imageFill.getClass();
        this.value = imageFill;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Image$Message$ImageFill) && Intrinsics.areEqual(this.value, ((Image$Message$ImageFill) obj).value);
    }

    public final ImageFill getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ImageFill(value=" + this.value + ")";
    }
}
