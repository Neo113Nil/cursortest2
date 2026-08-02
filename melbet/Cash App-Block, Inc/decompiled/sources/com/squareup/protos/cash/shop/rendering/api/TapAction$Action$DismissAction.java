package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class TapAction$Action$DismissAction extends zzle {
    public final DismissTapAction value;

    public TapAction$Action$DismissAction(DismissTapAction dismissTapAction) {
        dismissTapAction.getClass();
        this.value = dismissTapAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TapAction$Action$DismissAction) && Intrinsics.areEqual(this.value, ((TapAction$Action$DismissAction) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DismissAction(value=" + this.value + ")";
    }
}
