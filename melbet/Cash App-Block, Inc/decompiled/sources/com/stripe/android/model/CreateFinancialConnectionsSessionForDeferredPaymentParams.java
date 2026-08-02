package com.stripe.android.model;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CreateFinancialConnectionsSessionForDeferredPaymentParams {
    public final Integer amount;
    public final String currency;
    public final String customer;
    public final String hostedSurface;
    public final LinkMode linkMode;
    public final String onBehalfOf;
    public final String product;
    public final String uniqueId;

    public CreateFinancialConnectionsSessionForDeferredPaymentParams(String str, String str2, String str3, String str4, LinkMode linkMode, String str5, Integer num, String str6) {
        VerificationMethodParam verificationMethodParam = VerificationMethodParam.Automatic;
        str.getClass();
        this.uniqueId = str;
        this.hostedSurface = str2;
        this.customer = str3;
        this.onBehalfOf = str4;
        this.linkMode = linkMode;
        this.product = str5;
        this.amount = num;
        this.currency = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateFinancialConnectionsSessionForDeferredPaymentParams)) {
            return false;
        }
        CreateFinancialConnectionsSessionForDeferredPaymentParams createFinancialConnectionsSessionForDeferredPaymentParams = (CreateFinancialConnectionsSessionForDeferredPaymentParams) obj;
        if (!Intrinsics.areEqual(this.uniqueId, createFinancialConnectionsSessionForDeferredPaymentParams.uniqueId)) {
            return false;
        }
        VerificationMethodParam verificationMethodParam = VerificationMethodParam.Automatic;
        return Intrinsics.areEqual(this.hostedSurface, createFinancialConnectionsSessionForDeferredPaymentParams.hostedSurface) && Intrinsics.areEqual(this.customer, createFinancialConnectionsSessionForDeferredPaymentParams.customer) && Intrinsics.areEqual(this.onBehalfOf, createFinancialConnectionsSessionForDeferredPaymentParams.onBehalfOf) && this.linkMode == createFinancialConnectionsSessionForDeferredPaymentParams.linkMode && Intrinsics.areEqual(this.product, createFinancialConnectionsSessionForDeferredPaymentParams.product) && Intrinsics.areEqual(this.amount, createFinancialConnectionsSessionForDeferredPaymentParams.amount) && Intrinsics.areEqual(this.currency, createFinancialConnectionsSessionForDeferredPaymentParams.currency);
    }

    public final int hashCode() {
        int hashCode = (VerificationMethodParam.Automatic.hashCode() + (this.uniqueId.hashCode() * 923521)) * 31;
        String str = this.hostedSurface;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.customer;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.onBehalfOf;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LinkMode linkMode = this.linkMode;
        int hashCode5 = (hashCode4 + (linkMode == null ? 0 : linkMode.hashCode())) * 31;
        String str4 = this.product;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.amount;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.currency;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        VerificationMethodParam verificationMethodParam = VerificationMethodParam.Automatic;
        StringBuilder sb = new StringBuilder("CreateFinancialConnectionsSessionForDeferredPaymentParams(uniqueId=");
        sb.append(this.uniqueId);
        sb.append(", initialInstitution=null, manualEntryOnly=null, searchSession=null, verificationMethod=");
        sb.append(verificationMethodParam);
        sb.append(", hostedSurface=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.hostedSurface, ", customer=", this.customer, ", onBehalfOf=");
        sb.append(this.onBehalfOf);
        sb.append(", linkMode=");
        sb.append(this.linkMode);
        sb.append(", product=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.product, ", amount=", this.amount, ", currency=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.currency, ")");
    }
}
