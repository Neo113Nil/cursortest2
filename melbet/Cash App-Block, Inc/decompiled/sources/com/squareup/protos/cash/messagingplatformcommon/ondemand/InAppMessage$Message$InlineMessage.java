package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InAppMessage$Message$InlineMessage extends zzjx {
    public final InlineMessage value;

    public InAppMessage$Message$InlineMessage(InlineMessage inlineMessage) {
        inlineMessage.getClass();
        this.value = inlineMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppMessage$Message$InlineMessage) && Intrinsics.areEqual(this.value, ((InAppMessage$Message$InlineMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "InlineMessage(value=" + this.value + ")";
    }
}
