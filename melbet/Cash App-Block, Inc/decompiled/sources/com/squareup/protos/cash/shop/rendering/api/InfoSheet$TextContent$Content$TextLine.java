package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import com.squareup.protos.cash.localization.LocalizedString;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class InfoSheet$TextContent$Content$TextLine extends zzkv {
    public final LocalizedString value;

    public InfoSheet$TextContent$Content$TextLine(LocalizedString localizedString) {
        localizedString.getClass();
        this.value = localizedString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InfoSheet$TextContent$Content$TextLine) && Intrinsics.areEqual(this.value, ((InfoSheet$TextContent$Content$TextLine) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TextLine(value=" + this.value + ")";
    }
}
