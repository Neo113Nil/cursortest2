package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.squareup.protos.cash.messagingplatformcommon.app.FullScreenMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InAppMessage$Message$FullScreenMessage extends zzjx {
    public final FullScreenMessage value;

    public InAppMessage$Message$FullScreenMessage(FullScreenMessage fullScreenMessage) {
        fullScreenMessage.getClass();
        this.value = fullScreenMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppMessage$Message$FullScreenMessage) && Intrinsics.areEqual(this.value, ((InAppMessage$Message$FullScreenMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "FullScreenMessage(value=" + this.value + ")";
    }
}
