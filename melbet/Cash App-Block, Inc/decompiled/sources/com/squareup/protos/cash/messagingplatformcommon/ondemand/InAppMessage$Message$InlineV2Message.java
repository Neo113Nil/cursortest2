package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineV2Message;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InAppMessage$Message$InlineV2Message extends zzjx {
    public final InlineV2Message value;

    public InAppMessage$Message$InlineV2Message(InlineV2Message inlineV2Message) {
        inlineV2Message.getClass();
        this.value = inlineV2Message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppMessage$Message$InlineV2Message) && Intrinsics.areEqual(this.value, ((InAppMessage$Message$InlineV2Message) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "InlineV2Message(value=" + this.value + ")";
    }
}
