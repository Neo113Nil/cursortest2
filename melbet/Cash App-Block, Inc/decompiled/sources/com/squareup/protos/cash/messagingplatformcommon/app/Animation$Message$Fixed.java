package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Animation$Message$Fixed extends zzjm {
    public final AnimationFixed value;

    public Animation$Message$Fixed(AnimationFixed animationFixed) {
        animationFixed.getClass();
        this.value = animationFixed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Animation$Message$Fixed) && Intrinsics.areEqual(this.value, ((Animation$Message$Fixed) obj).value);
    }

    public final AnimationFixed getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Fixed(value=" + this.value + ")";
    }
}
