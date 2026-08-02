package com.squareup.protos.cash.messagingplatformcommon.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjn;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppMessage$Message$HomeScreenMessage extends zzjn {
    public final HomeScreenMessage value;

    public AppMessage$Message$HomeScreenMessage(HomeScreenMessage homeScreenMessage) {
        homeScreenMessage.getClass();
        this.value = homeScreenMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppMessage$Message$HomeScreenMessage) && Intrinsics.areEqual(this.value, ((AppMessage$Message$HomeScreenMessage) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "HomeScreenMessage(value=" + this.value + ")";
    }
}
