package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayMerchantSheet$Content$PasteboardTextLines {
    public final AfterpayMerchantSheet.PasteboardTextLines value;

    public AfterpayMerchantSheet$Content$PasteboardTextLines(AfterpayMerchantSheet.PasteboardTextLines pasteboardTextLines) {
        pasteboardTextLines.getClass();
        this.value = pasteboardTextLines;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayMerchantSheet$Content$PasteboardTextLines) && Intrinsics.areEqual(this.value, ((AfterpayMerchantSheet$Content$PasteboardTextLines) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PasteboardTextLines(value=" + this.value + ")";
    }
}
