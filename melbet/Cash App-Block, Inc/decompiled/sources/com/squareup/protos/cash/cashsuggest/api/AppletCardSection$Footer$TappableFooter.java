package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.toolbar.LocalToolbarKt;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppletCardSection$Footer$TappableFooter extends LocalToolbarKt {
    public final AppletCardSection.TappableFooter value;

    public AppletCardSection$Footer$TappableFooter(AppletCardSection.TappableFooter tappableFooter) {
        tappableFooter.getClass();
        this.value = tappableFooter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppletCardSection$Footer$TappableFooter) && Intrinsics.areEqual(this.value, ((AppletCardSection$Footer$TappableFooter) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TappableFooter(value=" + this.value + ")";
    }
}
