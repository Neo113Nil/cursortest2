package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class TapAction$Action$ScrollToAction extends zzle {
    public final ScrollToAction value;

    public TapAction$Action$ScrollToAction(ScrollToAction scrollToAction) {
        scrollToAction.getClass();
        this.value = scrollToAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TapAction$Action$ScrollToAction) && Intrinsics.areEqual(this.value, ((TapAction$Action$ScrollToAction) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ScrollToAction(value=" + this.value + ")";
    }
}
