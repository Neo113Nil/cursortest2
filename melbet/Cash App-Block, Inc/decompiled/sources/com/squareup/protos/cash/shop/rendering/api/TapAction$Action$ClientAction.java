package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class TapAction$Action$ClientAction extends zzle {
    public final ClientHandledAction value;

    public TapAction$Action$ClientAction(ClientHandledAction clientHandledAction) {
        clientHandledAction.getClass();
        this.value = clientHandledAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TapAction$Action$ClientAction) && Intrinsics.areEqual(this.value, ((TapAction$Action$ClientAction) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ClientAction(value=" + this.value + ")";
    }
}
