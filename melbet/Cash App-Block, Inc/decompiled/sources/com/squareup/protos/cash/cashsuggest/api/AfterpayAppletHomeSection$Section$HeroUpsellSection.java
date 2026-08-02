package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$Section$HeroUpsellSection extends LocalMenuHoursViewKt {
    public final HeroUpsellSection value;

    public AfterpayAppletHomeSection$Section$HeroUpsellSection(HeroUpsellSection heroUpsellSection) {
        heroUpsellSection.getClass();
        this.value = heroUpsellSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$Section$HeroUpsellSection) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$Section$HeroUpsellSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "HeroUpsellSection(value=" + this.value + ")";
    }
}
