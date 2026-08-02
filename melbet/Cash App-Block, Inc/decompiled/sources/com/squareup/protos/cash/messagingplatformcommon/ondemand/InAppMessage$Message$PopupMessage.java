package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.squareup.protos.cash.messagingplatformcommon.app.PopupMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InAppMessage$Message$PopupMessage extends zzjx {
    public final PopupMessage value;

    public InAppMessage$Message$PopupMessage(PopupMessage popupMessage) {
        popupMessage.getClass();
        this.value = popupMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppMessage$Message$PopupMessage) && Intrinsics.areEqual(this.value, ((InAppMessage$Message$PopupMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PopupMessage(value=" + this.value + ")";
    }
}
