package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.squareup.protos.cash.messagingplatformcommon.app.InAppNotificationMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InAppMessage$Message$InAppNotificationMessage extends zzjx {
    public final InAppNotificationMessage value;

    public InAppMessage$Message$InAppNotificationMessage(InAppNotificationMessage inAppNotificationMessage) {
        inAppNotificationMessage.getClass();
        this.value = inAppNotificationMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppMessage$Message$InAppNotificationMessage) && Intrinsics.areEqual(this.value, ((InAppMessage$Message$InAppNotificationMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "InAppNotificationMessage(value=" + this.value + ")";
    }
}
