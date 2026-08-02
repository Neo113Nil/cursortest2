package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class TapAction$Action$ClearInputAction extends zzle {
    public final ClearInputTapAction value;

    public TapAction$Action$ClearInputAction(ClearInputTapAction clearInputTapAction) {
        clearInputTapAction.getClass();
        this.value = clearInputTapAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TapAction$Action$ClearInputAction) && Intrinsics.areEqual(this.value, ((TapAction$Action$ClearInputAction) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ClearInputAction(value=" + this.value + ")";
    }
}
