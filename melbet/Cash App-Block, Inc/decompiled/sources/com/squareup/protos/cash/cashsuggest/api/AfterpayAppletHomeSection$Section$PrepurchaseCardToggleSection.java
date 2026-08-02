package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$Section$PrepurchaseCardToggleSection extends LocalMenuHoursViewKt {
    public final PrepurchaseCardToggleSection value;

    public AfterpayAppletHomeSection$Section$PrepurchaseCardToggleSection(PrepurchaseCardToggleSection prepurchaseCardToggleSection) {
        prepurchaseCardToggleSection.getClass();
        this.value = prepurchaseCardToggleSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$Section$PrepurchaseCardToggleSection) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$Section$PrepurchaseCardToggleSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PrepurchaseCardToggleSection(value=" + this.value + ")";
    }
}
