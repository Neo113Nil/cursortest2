package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjv;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PopupMessage$VisualAsset$Animation extends zzjv {
    public final Animation value;

    public PopupMessage$VisualAsset$Animation(Animation animation) {
        animation.getClass();
        this.value = animation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PopupMessage$VisualAsset$Animation) && Intrinsics.areEqual(this.value, ((PopupMessage$VisualAsset$Animation) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Animation(value=" + this.value + ")";
    }
}
