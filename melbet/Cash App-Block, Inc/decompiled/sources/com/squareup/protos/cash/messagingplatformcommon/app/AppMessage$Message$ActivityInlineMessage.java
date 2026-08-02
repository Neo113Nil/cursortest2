package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjn;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppMessage$Message$ActivityInlineMessage extends zzjn {
    public final ActivityInlineMessage value;

    public AppMessage$Message$ActivityInlineMessage(ActivityInlineMessage activityInlineMessage) {
        activityInlineMessage.getClass();
        this.value = activityInlineMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppMessage$Message$ActivityInlineMessage) && Intrinsics.areEqual(this.value, ((AppMessage$Message$ActivityInlineMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ActivityInlineMessage(value=" + this.value + ")";
    }
}
