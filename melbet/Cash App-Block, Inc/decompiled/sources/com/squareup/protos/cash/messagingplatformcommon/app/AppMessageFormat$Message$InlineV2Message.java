package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppMessageFormat$Message$InlineV2Message extends zzjo {
    public final InlineV2Message value;

    public AppMessageFormat$Message$InlineV2Message(InlineV2Message inlineV2Message) {
        inlineV2Message.getClass();
        this.value = inlineV2Message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppMessageFormat$Message$InlineV2Message) && Intrinsics.areEqual(this.value, ((AppMessageFormat$Message$InlineV2Message) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "InlineV2Message(value=" + this.value + ")";
    }
}
