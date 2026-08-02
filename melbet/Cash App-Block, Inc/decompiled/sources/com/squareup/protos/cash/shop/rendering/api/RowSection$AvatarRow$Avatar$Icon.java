package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class RowSection$AvatarRow$Avatar$Icon extends zzlb {
    public final TappableIcon value;

    public RowSection$AvatarRow$Avatar$Icon(TappableIcon tappableIcon) {
        tappableIcon.getClass();
        this.value = tappableIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RowSection$AvatarRow$Avatar$Icon) && Intrinsics.areEqual(this.value, ((RowSection$AvatarRow$Avatar$Icon) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Icon(value=" + this.value + ")";
    }
}
