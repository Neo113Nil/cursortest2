package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppMessageFormat$Message$StatusResultMessage extends zzjo {
    public final StatusResultMessage value;

    public AppMessageFormat$Message$StatusResultMessage(StatusResultMessage statusResultMessage) {
        statusResultMessage.getClass();
        this.value = statusResultMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppMessageFormat$Message$StatusResultMessage) && Intrinsics.areEqual(this.value, ((AppMessageFormat$Message$StatusResultMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "StatusResultMessage(value=" + this.value + ")";
    }
}
