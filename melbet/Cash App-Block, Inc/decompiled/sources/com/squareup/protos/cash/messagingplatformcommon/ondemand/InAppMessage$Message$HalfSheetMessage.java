package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InAppMessage$Message$HalfSheetMessage extends zzjx {
    public final HalfSheetMessage value;

    public InAppMessage$Message$HalfSheetMessage(HalfSheetMessage halfSheetMessage) {
        halfSheetMessage.getClass();
        this.value = halfSheetMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppMessage$Message$HalfSheetMessage) && Intrinsics.areEqual(this.value, ((InAppMessage$Message$HalfSheetMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "HalfSheetMessage(value=" + this.value + ")";
    }
}
