package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppMessageFormat$Message$CardMessage extends zzjo {
    public final CardMessage value;

    public AppMessageFormat$Message$CardMessage(CardMessage cardMessage) {
        cardMessage.getClass();
        this.value = cardMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppMessageFormat$Message$CardMessage) && Intrinsics.areEqual(this.value, ((AppMessageFormat$Message$CardMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CardMessage(value=" + this.value + ")";
    }
}
