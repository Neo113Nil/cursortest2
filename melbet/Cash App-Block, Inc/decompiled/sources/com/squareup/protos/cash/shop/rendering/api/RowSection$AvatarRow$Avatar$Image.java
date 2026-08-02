package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.ui.UiAvatar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class RowSection$AvatarRow$Avatar$Image extends zzlb {
    public final UiAvatar value;

    public RowSection$AvatarRow$Avatar$Image(UiAvatar uiAvatar) {
        uiAvatar.getClass();
        this.value = uiAvatar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RowSection$AvatarRow$Avatar$Image) && Intrinsics.areEqual(this.value, ((RowSection$AvatarRow$Avatar$Image) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Image(value=", ")");
    }
}
