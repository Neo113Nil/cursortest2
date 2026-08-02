package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppMessageFormat$Message$TooltipMessage extends zzjo {
    public final TooltipMessage value;

    public AppMessageFormat$Message$TooltipMessage(TooltipMessage tooltipMessage) {
        tooltipMessage.getClass();
        this.value = tooltipMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppMessageFormat$Message$TooltipMessage) && Intrinsics.areEqual(this.value, ((AppMessageFormat$Message$TooltipMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TooltipMessage(value=" + this.value + ")";
    }
}
