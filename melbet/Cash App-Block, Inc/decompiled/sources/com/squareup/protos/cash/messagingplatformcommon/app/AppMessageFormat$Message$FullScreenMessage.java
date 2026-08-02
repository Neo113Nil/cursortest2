package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppMessageFormat$Message$FullScreenMessage extends zzjo {
    public final FullScreenMessage value;

    public AppMessageFormat$Message$FullScreenMessage(FullScreenMessage fullScreenMessage) {
        fullScreenMessage.getClass();
        this.value = fullScreenMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppMessageFormat$Message$FullScreenMessage) && Intrinsics.areEqual(this.value, ((AppMessageFormat$Message$FullScreenMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "FullScreenMessage(value=" + this.value + ")";
    }
}
