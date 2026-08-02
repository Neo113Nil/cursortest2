package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.treehouse.TreehouseAppContentKt;
import com.squareup.protos.cash.cashsuggest.api.HeroBalanceSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class HeroBalanceSection$Content$NoBalance extends TreehouseAppContentKt {
    public final HeroBalanceSection.NoBalance value;

    public HeroBalanceSection$Content$NoBalance(HeroBalanceSection.NoBalance noBalance) {
        noBalance.getClass();
        this.value = noBalance;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HeroBalanceSection$Content$NoBalance) && Intrinsics.areEqual(this.value, ((HeroBalanceSection$Content$NoBalance) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "NoBalance(value=" + this.value + ")";
    }
}
