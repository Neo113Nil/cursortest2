package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.compose.HostFocusDirectorKt;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppletCardSection$TappableFooter$ImageContent$Image extends HostFocusDirectorKt {
    public final Image value;

    public AppletCardSection$TappableFooter$ImageContent$Image(Image image) {
        image.getClass();
        this.value = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppletCardSection$TappableFooter$ImageContent$Image) && Intrinsics.areEqual(this.value, ((AppletCardSection$TappableFooter$ImageContent$Image) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Image(value=", ")");
    }
}
