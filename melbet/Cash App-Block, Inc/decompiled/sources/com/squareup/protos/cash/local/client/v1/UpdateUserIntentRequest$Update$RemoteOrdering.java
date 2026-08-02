package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzjh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class UpdateUserIntentRequest$Update$RemoteOrdering extends zzjh {
    public final LocalRemoteOrderingIntent value;

    public UpdateUserIntentRequest$Update$RemoteOrdering(LocalRemoteOrderingIntent localRemoteOrderingIntent) {
        localRemoteOrderingIntent.getClass();
        this.value = localRemoteOrderingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateUserIntentRequest$Update$RemoteOrdering) && Intrinsics.areEqual(this.value, ((UpdateUserIntentRequest$Update$RemoteOrdering) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RemoteOrdering(value=" + this.value + ")";
    }
}
