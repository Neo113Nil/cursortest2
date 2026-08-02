package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$Section$HeroBalanceSection extends LocalMenuHoursViewKt {
    public final HeroBalanceSection value;

    public AfterpayAppletHomeSection$Section$HeroBalanceSection(HeroBalanceSection heroBalanceSection) {
        heroBalanceSection.getClass();
        this.value = heroBalanceSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$Section$HeroBalanceSection) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$Section$HeroBalanceSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "HeroBalanceSection(value=" + this.value + ")";
    }
}
