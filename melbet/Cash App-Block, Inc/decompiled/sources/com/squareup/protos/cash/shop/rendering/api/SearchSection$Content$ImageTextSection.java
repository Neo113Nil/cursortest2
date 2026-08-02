package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzld;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SearchSection$Content$ImageTextSection extends zzld {
    public final ImageTextSection value;

    public SearchSection$Content$ImageTextSection(ImageTextSection imageTextSection) {
        imageTextSection.getClass();
        this.value = imageTextSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchSection$Content$ImageTextSection) && Intrinsics.areEqual(this.value, ((SearchSection$Content$ImageTextSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ImageTextSection(value=" + this.value + ")";
    }
}
