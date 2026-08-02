package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzjh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class UpdateUserIntentRequest$Update$InStoreOrdering extends zzjh {
    public final LocalInStoreOrderingIntent value;

    public UpdateUserIntentRequest$Update$InStoreOrdering(LocalInStoreOrderingIntent localInStoreOrderingIntent) {
        localInStoreOrderingIntent.getClass();
        this.value = localInStoreOrderingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateUserIntentRequest$Update$InStoreOrdering) && Intrinsics.areEqual(this.value, ((UpdateUserIntentRequest$Update$InStoreOrdering) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "InStoreOrdering(value=" + this.value + ")";
    }
}
