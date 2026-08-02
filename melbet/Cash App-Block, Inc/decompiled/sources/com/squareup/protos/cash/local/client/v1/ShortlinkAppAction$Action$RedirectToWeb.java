package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzje;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShortlinkAppAction$Action$RedirectToWeb extends zzje {
    public final RedirectToWeb value;

    public ShortlinkAppAction$Action$RedirectToWeb(RedirectToWeb redirectToWeb) {
        redirectToWeb.getClass();
        this.value = redirectToWeb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortlinkAppAction$Action$RedirectToWeb) && Intrinsics.areEqual(this.value, ((ShortlinkAppAction$Action$RedirectToWeb) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RedirectToWeb(value=" + this.value + ")";
    }
}
