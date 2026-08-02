package com.squareup.protos.cash.cashsuggest.api;

import com.google.android.gms.internal.mlkit_vision_barcode.zzux;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppletCardSection$ImageTextContent$ImageContent$CashCard extends zzux {
    public final AppletCardSection.CashCardRenderingConfiguration value;

    public AppletCardSection$ImageTextContent$ImageContent$CashCard(AppletCardSection.CashCardRenderingConfiguration cashCardRenderingConfiguration) {
        cashCardRenderingConfiguration.getClass();
        this.value = cashCardRenderingConfiguration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppletCardSection$ImageTextContent$ImageContent$CashCard) && Intrinsics.areEqual(this.value, ((AppletCardSection$ImageTextContent$ImageContent$CashCard) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CashCard(value=" + this.value + ")";
    }
}
