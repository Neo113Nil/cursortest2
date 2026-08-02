package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppMessageFormat$Message$PopupMessage extends zzjo {
    public final PopupMessage value;

    public AppMessageFormat$Message$PopupMessage(PopupMessage popupMessage) {
        popupMessage.getClass();
        this.value = popupMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppMessageFormat$Message$PopupMessage) && Intrinsics.areEqual(this.value, ((AppMessageFormat$Message$PopupMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PopupMessage(value=" + this.value + ")";
    }
}
