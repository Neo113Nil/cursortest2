package com.squareup.cash.wallet.db;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CardCustomization {
    public final byte[] customization_bitmap;
    public final String path;

    public CardCustomization(String str, byte[] bArr) {
        str.getClass();
        this.path = str;
        this.customization_bitmap = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardCustomization)) {
            return false;
        }
        CardCustomization cardCustomization = (CardCustomization) obj;
        return Intrinsics.areEqual(this.path, cardCustomization.path) && Intrinsics.areEqual(this.customization_bitmap, cardCustomization.customization_bitmap);
    }

    public final int hashCode() {
        int hashCode = this.path.hashCode() * 31;
        byte[] bArr = this.customization_bitmap;
        return hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("CardCustomization(path=", this.path, ", customization_bitmap=", Arrays.toString(this.customization_bitmap), ")");
    }
}
