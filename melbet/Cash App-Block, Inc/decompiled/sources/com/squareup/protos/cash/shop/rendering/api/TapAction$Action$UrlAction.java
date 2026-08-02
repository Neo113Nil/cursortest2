package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class TapAction$Action$UrlAction extends zzle {
    public final UrlTapAction value;

    public TapAction$Action$UrlAction(UrlTapAction urlTapAction) {
        urlTapAction.getClass();
        this.value = urlTapAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TapAction$Action$UrlAction) && Intrinsics.areEqual(this.value, ((TapAction$Action$UrlAction) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "UrlAction(value=" + this.value + ")";
    }
}
