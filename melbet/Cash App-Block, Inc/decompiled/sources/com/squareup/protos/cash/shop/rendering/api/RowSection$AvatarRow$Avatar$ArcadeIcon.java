package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import com.squareup.protos.cash.ui.Icon;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class RowSection$AvatarRow$Avatar$ArcadeIcon extends zzlb {
    public final Icon value;

    public RowSection$AvatarRow$Avatar$ArcadeIcon(Icon icon) {
        icon.getClass();
        this.value = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RowSection$AvatarRow$Avatar$ArcadeIcon) && Intrinsics.areEqual(this.value, ((RowSection$AvatarRow$Avatar$ArcadeIcon) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ArcadeIcon(value=" + this.value + ")";
    }
}
