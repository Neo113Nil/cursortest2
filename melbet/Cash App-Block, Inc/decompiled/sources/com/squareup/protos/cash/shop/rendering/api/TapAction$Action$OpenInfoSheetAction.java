package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class TapAction$Action$OpenInfoSheetAction extends zzle {
    public final InfoSheet value;

    public TapAction$Action$OpenInfoSheetAction(InfoSheet infoSheet) {
        infoSheet.getClass();
        this.value = infoSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TapAction$Action$OpenInfoSheetAction) && Intrinsics.areEqual(this.value, ((TapAction$Action$OpenInfoSheetAction) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OpenInfoSheetAction(value=" + this.value + ")";
    }
}
