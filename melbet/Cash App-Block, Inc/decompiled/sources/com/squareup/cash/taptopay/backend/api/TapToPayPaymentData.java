package com.squareup.cash.taptopay.backend.api;

import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TapToPayPaymentData {
    public final Money amount;
    public final String cashtag;
    public final String customerToken;
    public final Screen exitScreen;
    public final String idempotencyToken;
    public final boolean isDemoMode;
    public final Character monogram;
    public final String photoUrl;

    public TapToPayPaymentData(Money money, String str, String str2, Screen screen, String str3, Character ch, String str4, boolean z) {
        money.getClass();
        str2.getClass();
        screen.getClass();
        this.amount = money;
        this.cashtag = str;
        this.idempotencyToken = str2;
        this.exitScreen = screen;
        this.photoUrl = str3;
        this.monogram = ch;
        this.customerToken = str4;
        this.isDemoMode = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapToPayPaymentData)) {
            return false;
        }
        TapToPayPaymentData tapToPayPaymentData = (TapToPayPaymentData) obj;
        return Intrinsics.areEqual(this.amount, tapToPayPaymentData.amount) && this.cashtag.equals(tapToPayPaymentData.cashtag) && Intrinsics.areEqual(this.idempotencyToken, tapToPayPaymentData.idempotencyToken) && Intrinsics.areEqual(this.exitScreen, tapToPayPaymentData.exitScreen) && Intrinsics.areEqual(this.photoUrl, tapToPayPaymentData.photoUrl) && Intrinsics.areEqual(this.monogram, tapToPayPaymentData.monogram) && Intrinsics.areEqual(this.customerToken, tapToPayPaymentData.customerToken) && this.isDemoMode == tapToPayPaymentData.isDemoMode;
    }

    public final int hashCode() {
        int m = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.exitScreen, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.amount.hashCode() * 31, 31, this.cashtag), 31, this.idempotencyToken), 31);
        String str = this.photoUrl;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Character ch = this.monogram;
        int hashCode2 = (hashCode + (ch == null ? 0 : ch.hashCode())) * 31;
        String str2 = this.customerToken;
        return Boolean.hashCode(this.isDemoMode) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TapToPayPaymentData(amount=");
        sb.append(this.amount);
        sb.append(", cashtag=");
        sb.append(this.cashtag);
        sb.append(", idempotencyToken=");
        sb.append(this.idempotencyToken);
        sb.append(", exitScreen=");
        sb.append(this.exitScreen);
        sb.append(", photoUrl=");
        sb.append(this.photoUrl);
        sb.append(", monogram=");
        sb.append(this.monogram);
        sb.append(", customerToken=");
        return re$$ExternalSyntheticOutline0.m(sb, this.customerToken, ", isDemoMode=", this.isDemoMode, ")");
    }
}
