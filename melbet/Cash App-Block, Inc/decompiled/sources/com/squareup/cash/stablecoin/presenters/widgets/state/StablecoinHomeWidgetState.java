package com.squareup.cash.stablecoin.presenters.widgets.state;

import com.squareup.cash.crypto.backend.balance.CryptoBalance$StablecoinBalance;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class StablecoinHomeWidgetState {
    public final boolean hasStablecoinActivity;
    public final CryptoBalance$StablecoinBalance stablecoinBalance;
    public final boolean userCanBuyStablecoin;

    public StablecoinHomeWidgetState(CryptoBalance$StablecoinBalance cryptoBalance$StablecoinBalance, boolean z, boolean z2) {
        this.stablecoinBalance = cryptoBalance$StablecoinBalance;
        this.userCanBuyStablecoin = z;
        this.hasStablecoinActivity = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StablecoinHomeWidgetState)) {
            return false;
        }
        StablecoinHomeWidgetState stablecoinHomeWidgetState = (StablecoinHomeWidgetState) obj;
        return Intrinsics.areEqual(this.stablecoinBalance, stablecoinHomeWidgetState.stablecoinBalance) && this.userCanBuyStablecoin == stablecoinHomeWidgetState.userCanBuyStablecoin && this.hasStablecoinActivity == stablecoinHomeWidgetState.hasStablecoinActivity;
    }

    public final int hashCode() {
        CryptoBalance$StablecoinBalance cryptoBalance$StablecoinBalance = this.stablecoinBalance;
        return Boolean.hashCode(this.hasStablecoinActivity) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((cryptoBalance$StablecoinBalance == null ? 0 : cryptoBalance$StablecoinBalance.hashCode()) * 31, 31, this.userCanBuyStablecoin);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StablecoinHomeWidgetState(stablecoinBalance=");
        sb.append(this.stablecoinBalance);
        sb.append(", userCanBuyStablecoin=");
        sb.append(this.userCanBuyStablecoin);
        sb.append(", hasStablecoinActivity=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.hasStablecoinActivity, ")");
    }
}
