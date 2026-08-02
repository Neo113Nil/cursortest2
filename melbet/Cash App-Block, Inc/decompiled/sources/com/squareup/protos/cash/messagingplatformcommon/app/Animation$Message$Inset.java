package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Animation$Message$Inset extends zzjm {
    public final AnimationInset value;

    public Animation$Message$Inset(AnimationInset animationInset) {
        animationInset.getClass();
        this.value = animationInset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Animation$Message$Inset) && Intrinsics.areEqual(this.value, ((Animation$Message$Inset) obj).value);
    }

    public final AnimationInset getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Inset(value=" + this.value + ")";
    }
}
