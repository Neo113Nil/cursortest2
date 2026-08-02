package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.squareup.protos.cash.messagingplatformcommon.app.CardMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InAppMessage$Message$CardMessage extends zzjx {
    public final CardMessage value;

    public InAppMessage$Message$CardMessage(CardMessage cardMessage) {
        cardMessage.getClass();
        this.value = cardMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppMessage$Message$CardMessage) && Intrinsics.areEqual(this.value, ((InAppMessage$Message$CardMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CardMessage(value=" + this.value + ")";
    }
}
