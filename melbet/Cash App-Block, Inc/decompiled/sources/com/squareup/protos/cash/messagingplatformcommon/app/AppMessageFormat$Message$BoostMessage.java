package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppMessageFormat$Message$BoostMessage extends zzjo {
    public final BoostMessage value;

    public AppMessageFormat$Message$BoostMessage(BoostMessage boostMessage) {
        boostMessage.getClass();
        this.value = boostMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppMessageFormat$Message$BoostMessage) && Intrinsics.areEqual(this.value, ((AppMessageFormat$Message$BoostMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BoostMessage(value=" + this.value + ")";
    }
}
