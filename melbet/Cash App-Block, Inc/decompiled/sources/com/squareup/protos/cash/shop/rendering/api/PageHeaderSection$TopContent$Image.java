package com.squareup.protos.cash.shop.rendering.api;

import com.datadog.android.rum.model.ErrorEvent;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PageHeaderSection$TopContent$Image extends ErrorEvent.Usr.Companion {
    public final Image value;

    public PageHeaderSection$TopContent$Image(Image image) {
        image.getClass();
        this.value = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PageHeaderSection$TopContent$Image) && Intrinsics.areEqual(this.value, ((PageHeaderSection$TopContent$Image) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Image(value=", ")");
    }
}
