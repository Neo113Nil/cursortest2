package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.squareup.protos.cash.messagingplatformcommon.app.TooltipMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InAppMessage$Message$TooltipMessage extends zzjx {
    public final TooltipMessage value;

    public InAppMessage$Message$TooltipMessage(TooltipMessage tooltipMessage) {
        tooltipMessage.getClass();
        this.value = tooltipMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppMessage$Message$TooltipMessage) && Intrinsics.areEqual(this.value, ((InAppMessage$Message$TooltipMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TooltipMessage(value=" + this.value + ")";
    }
}
