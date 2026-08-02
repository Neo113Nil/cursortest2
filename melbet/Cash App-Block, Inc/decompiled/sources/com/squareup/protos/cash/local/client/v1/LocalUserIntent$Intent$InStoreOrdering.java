package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzja;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalUserIntent$Intent$InStoreOrdering extends zzja {
    public final LocalInStoreOrderingIntent value;

    public LocalUserIntent$Intent$InStoreOrdering(LocalInStoreOrderingIntent localInStoreOrderingIntent) {
        localInStoreOrderingIntent.getClass();
        this.value = localInStoreOrderingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalUserIntent$Intent$InStoreOrdering) && Intrinsics.areEqual(this.value, ((LocalUserIntent$Intent$InStoreOrdering) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "InStoreOrdering(value=" + this.value + ")";
    }
}
