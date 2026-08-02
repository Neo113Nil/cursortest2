package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$Section$CardSection extends LocalMenuHoursViewKt {
    public final AppletCardSection value;

    public AfterpayAppletHomeSection$Section$CardSection(AppletCardSection appletCardSection) {
        appletCardSection.getClass();
        this.value = appletCardSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$Section$CardSection) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$Section$CardSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CardSection(value=" + this.value + ")";
    }
}
