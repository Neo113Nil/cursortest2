package com.squareup.protos.cash.shop.rendering.api;

import com.datadog.android.rum.model.LongTaskEvent;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class UpsellSheet$TopContent$Image extends LongTaskEvent.Companion {
    public final Image value;

    public UpsellSheet$TopContent$Image(Image image) {
        image.getClass();
        this.value = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpsellSheet$TopContent$Image) && Intrinsics.areEqual(this.value, ((UpsellSheet$TopContent$Image) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Image(value=", ")");
    }
}
