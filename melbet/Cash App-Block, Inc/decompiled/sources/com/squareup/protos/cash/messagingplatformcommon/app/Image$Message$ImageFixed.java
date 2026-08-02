package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjs;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Image$Message$ImageFixed extends zzjs {
    public final ImageFixed value;

    public Image$Message$ImageFixed(ImageFixed imageFixed) {
        imageFixed.getClass();
        this.value = imageFixed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Image$Message$ImageFixed) && Intrinsics.areEqual(this.value, ((Image$Message$ImageFixed) obj).value);
    }

    public final ImageFixed getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ImageFixed(value=" + this.value + ")";
    }
}
