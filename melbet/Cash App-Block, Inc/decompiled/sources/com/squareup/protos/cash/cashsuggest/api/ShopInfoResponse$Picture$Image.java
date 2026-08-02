package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.yoga.internal.detail.GlobalMembers;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShopInfoResponse$Picture$Image extends GlobalMembers {
    public final Image value;

    public ShopInfoResponse$Picture$Image(Image image) {
        image.getClass();
        this.value = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShopInfoResponse$Picture$Image) && Intrinsics.areEqual(this.value, ((ShopInfoResponse$Picture$Image) obj).value);
    }

    public final Image getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Image(value=", ")");
    }
}
