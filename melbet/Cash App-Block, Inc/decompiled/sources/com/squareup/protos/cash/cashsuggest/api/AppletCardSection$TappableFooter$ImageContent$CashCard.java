package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.compose.HostFocusDirectorKt;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppletCardSection$TappableFooter$ImageContent$CashCard extends HostFocusDirectorKt {
    public final AppletCardSection.CashCardRenderingConfiguration value;

    public AppletCardSection$TappableFooter$ImageContent$CashCard(AppletCardSection.CashCardRenderingConfiguration cashCardRenderingConfiguration) {
        cashCardRenderingConfiguration.getClass();
        this.value = cashCardRenderingConfiguration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppletCardSection$TappableFooter$ImageContent$CashCard) && Intrinsics.areEqual(this.value, ((AppletCardSection$TappableFooter$ImageContent$CashCard) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CashCard(value=" + this.value + ")";
    }
}
