package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppMessageFormat$Message$InAppNotificationMessage extends zzjo {
    public final InAppNotificationMessage value;

    public AppMessageFormat$Message$InAppNotificationMessage(InAppNotificationMessage inAppNotificationMessage) {
        inAppNotificationMessage.getClass();
        this.value = inAppNotificationMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppMessageFormat$Message$InAppNotificationMessage) && Intrinsics.areEqual(this.value, ((AppMessageFormat$Message$InAppNotificationMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "InAppNotificationMessage(value=" + this.value + ")";
    }
}
