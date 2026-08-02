package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppMessageFormat$Message$HalfSheetMessage extends zzjo {
    public final HalfSheetMessage value;

    public AppMessageFormat$Message$HalfSheetMessage(HalfSheetMessage halfSheetMessage) {
        halfSheetMessage.getClass();
        this.value = halfSheetMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppMessageFormat$Message$HalfSheetMessage) && Intrinsics.areEqual(this.value, ((AppMessageFormat$Message$HalfSheetMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "HalfSheetMessage(value=" + this.value + ")";
    }
}
