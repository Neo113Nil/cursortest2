package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppMessageFormat$Message$InlineMessage extends zzjo {
    public final InlineMessage value;

    public AppMessageFormat$Message$InlineMessage(InlineMessage inlineMessage) {
        inlineMessage.getClass();
        this.value = inlineMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppMessageFormat$Message$InlineMessage) && Intrinsics.areEqual(this.value, ((AppMessageFormat$Message$InlineMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "InlineMessage(value=" + this.value + ")";
    }
}
