package com.squareup.protos.cash.discover.api.app.v1.model;

import app.cash.zipline.loader.internal.fetcher.FetcherKt;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Button$Content$Icon extends FetcherKt {
    public final Image value;

    public Button$Content$Icon(Image image) {
        image.getClass();
        this.value = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Button$Content$Icon) && Intrinsics.areEqual(this.value, ((Button$Content$Icon) obj).value);
    }

    public final Image getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Icon(value=", ")");
    }
}
