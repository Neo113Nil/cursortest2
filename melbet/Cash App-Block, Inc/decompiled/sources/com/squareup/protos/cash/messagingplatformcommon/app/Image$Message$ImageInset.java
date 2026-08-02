package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjs;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Image$Message$ImageInset extends zzjs {
    public final ImageInset value;

    public Image$Message$ImageInset(ImageInset imageInset) {
        imageInset.getClass();
        this.value = imageInset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Image$Message$ImageInset) && Intrinsics.areEqual(this.value, ((Image$Message$ImageInset) obj).value);
    }

    public final ImageInset getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ImageInset(value=" + this.value + ")";
    }
}
