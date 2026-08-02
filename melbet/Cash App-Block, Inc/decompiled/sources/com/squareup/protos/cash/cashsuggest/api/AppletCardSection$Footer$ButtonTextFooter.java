package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.toolbar.LocalToolbarKt;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppletCardSection$Footer$ButtonTextFooter extends LocalToolbarKt {
    public final AppletCardSection.ButtonTextFooter value;

    public AppletCardSection$Footer$ButtonTextFooter(AppletCardSection.ButtonTextFooter buttonTextFooter) {
        buttonTextFooter.getClass();
        this.value = buttonTextFooter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppletCardSection$Footer$ButtonTextFooter) && Intrinsics.areEqual(this.value, ((AppletCardSection$Footer$ButtonTextFooter) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ButtonTextFooter(value=" + this.value + ")";
    }
}
