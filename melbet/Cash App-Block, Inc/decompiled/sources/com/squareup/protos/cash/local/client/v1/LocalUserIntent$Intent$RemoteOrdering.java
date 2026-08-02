package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzja;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalUserIntent$Intent$RemoteOrdering extends zzja {
    public final LocalRemoteOrderingIntent value;

    public LocalUserIntent$Intent$RemoteOrdering(LocalRemoteOrderingIntent localRemoteOrderingIntent) {
        localRemoteOrderingIntent.getClass();
        this.value = localRemoteOrderingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalUserIntent$Intent$RemoteOrdering) && Intrinsics.areEqual(this.value, ((LocalUserIntent$Intent$RemoteOrdering) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RemoteOrdering(value=" + this.value + ")";
    }
}
