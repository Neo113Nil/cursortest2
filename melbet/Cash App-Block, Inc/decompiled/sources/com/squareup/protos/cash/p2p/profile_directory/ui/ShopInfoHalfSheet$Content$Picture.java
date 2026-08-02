package com.squareup.protos.cash.p2p.profile_directory.ui;

import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShopInfoHalfSheet$Content$Picture extends zzkd {
    public final Image value;

    public ShopInfoHalfSheet$Content$Picture(Image image) {
        image.getClass();
        this.value = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShopInfoHalfSheet$Content$Picture) && Intrinsics.areEqual(this.value, ((ShopInfoHalfSheet$Content$Picture) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Picture(value=", ")");
    }
}
