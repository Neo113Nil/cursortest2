package com.squareup.protos.cash.cashsuggest.api;

import com.google.android.gms.internal.mlkit_vision_barcode.zzuv;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppletCardSection$Content$ImageTextContent extends zzuv {
    public final AppletCardSection.ImageTextContent value;

    public AppletCardSection$Content$ImageTextContent(AppletCardSection.ImageTextContent imageTextContent) {
        imageTextContent.getClass();
        this.value = imageTextContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppletCardSection$Content$ImageTextContent) && Intrinsics.areEqual(this.value, ((AppletCardSection$Content$ImageTextContent) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ImageTextContent(value=" + this.value + ")";
    }
}
