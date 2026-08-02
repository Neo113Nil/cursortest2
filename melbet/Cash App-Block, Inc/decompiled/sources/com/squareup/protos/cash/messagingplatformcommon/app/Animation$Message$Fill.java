package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Animation$Message$Fill extends zzjm {
    public final AnimationFill value;

    public Animation$Message$Fill(AnimationFill animationFill) {
        animationFill.getClass();
        this.value = animationFill;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Animation$Message$Fill) && Intrinsics.areEqual(this.value, ((Animation$Message$Fill) obj).value);
    }

    public final AnimationFill getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Fill(value=" + this.value + ")";
    }
}
