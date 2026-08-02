package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzje;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShortlinkAppAction$Action$ShowToast extends zzje {
    public final ShowToast value;

    public ShortlinkAppAction$Action$ShowToast(ShowToast showToast) {
        showToast.getClass();
        this.value = showToast;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortlinkAppAction$Action$ShowToast) && Intrinsics.areEqual(this.value, ((ShortlinkAppAction$Action$ShowToast) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ShowToast(value=" + this.value + ")";
    }
}
