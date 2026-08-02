package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.yoga.internal.YGNode;
import com.squareup.protos.cash.cashsuggest.api.RetroOrderSelectionResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RetroOrderSelectionResponse$ScreenContent$TextLines extends YGNode.Companion {
    public final RetroOrderSelectionResponse.TextLineItemSection value;

    public RetroOrderSelectionResponse$ScreenContent$TextLines(RetroOrderSelectionResponse.TextLineItemSection textLineItemSection) {
        textLineItemSection.getClass();
        this.value = textLineItemSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RetroOrderSelectionResponse$ScreenContent$TextLines) && Intrinsics.areEqual(this.value, ((RetroOrderSelectionResponse$ScreenContent$TextLines) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TextLines(value=" + this.value + ")";
    }
}
