package com.stripe.android.model;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.utils.MapUtilsKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public interface CreateFinancialConnectionsSessionParams {

    public final class InstantDebits implements CreateFinancialConnectionsSessionParams {
        public final String clientSecret;
        public final String customerEmailAddress;
        public final String hostedSurface;
        public final LinkMode linkMode;

        public InstantDebits(String str, String str2, String str3, LinkMode linkMode) {
            str.getClass();
            this.clientSecret = str;
            this.customerEmailAddress = str2;
            this.hostedSurface = str3;
            this.linkMode = linkMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstantDebits)) {
                return false;
            }
            InstantDebits instantDebits = (InstantDebits) obj;
            return Intrinsics.areEqual(this.clientSecret, instantDebits.clientSecret) && Intrinsics.areEqual(this.customerEmailAddress, instantDebits.customerEmailAddress) && Intrinsics.areEqual(this.hostedSurface, instantDebits.hostedSurface) && this.linkMode == instantDebits.linkMode;
        }

        public final int hashCode() {
            int hashCode = this.clientSecret.hashCode() * 31;
            String str = this.customerEmailAddress;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.hostedSurface;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            LinkMode linkMode = this.linkMode;
            return hashCode3 + (linkMode != null ? linkMode.hashCode() : 0);
        }

        @Override // com.stripe.android.model.CreateFinancialConnectionsSessionParams
        public final Map toMap() {
            String str = null;
            PaymentMethodCreateParams paymentMethodCreateParams = new PaymentMethodCreateParams(PaymentMethod.Type.Link, null, new PaymentMethod.BillingDetails(this.customerEmailAddress, null, 13), null, 1040382);
            Pair pair = new Pair("client_secret", this.clientSecret);
            String str2 = this.hostedSurface;
            Pair pair2 = new Pair("hosted_surface", str2);
            Pair pair3 = new Pair("product", "instant_debits");
            Pair pair4 = new Pair("attach_required", Boolean.TRUE);
            if (str2 != null) {
                LinkMode linkMode = this.linkMode;
                str = linkMode != null ? linkMode.value : "LINK_DISABLED";
            }
            return MapUtilsKt.filterNotNullValues(MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, new Pair("link_mode", str), new Pair("payment_method_data", paymentMethodCreateParams.toParamMap())));
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstantDebits(clientSecret=", this.clientSecret, ", customerEmailAddress=", this.customerEmailAddress, ", hostedSurface=");
            m.append(this.hostedSurface);
            m.append(", linkMode=");
            m.append(this.linkMode);
            m.append(")");
            return m.toString();
        }
    }

    public final class USBankAccount implements CreateFinancialConnectionsSessionParams {
        public final String clientSecret;
        public final String customerEmailAddress;
        public final String customerName;
        public final String hostedSurface;
        public final LinkMode linkMode;

        public USBankAccount(String str, String str2, String str3, String str4, LinkMode linkMode) {
            str.getClass();
            str2.getClass();
            this.clientSecret = str;
            this.customerName = str2;
            this.customerEmailAddress = str3;
            this.hostedSurface = str4;
            this.linkMode = linkMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof USBankAccount)) {
                return false;
            }
            USBankAccount uSBankAccount = (USBankAccount) obj;
            return Intrinsics.areEqual(this.clientSecret, uSBankAccount.clientSecret) && Intrinsics.areEqual(this.customerName, uSBankAccount.customerName) && Intrinsics.areEqual(this.customerEmailAddress, uSBankAccount.customerEmailAddress) && Intrinsics.areEqual(this.hostedSurface, uSBankAccount.hostedSurface) && this.linkMode == uSBankAccount.linkMode;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.clientSecret.hashCode() * 31, 31, this.customerName);
            String str = this.customerEmailAddress;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.hostedSurface;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            LinkMode linkMode = this.linkMode;
            return hashCode2 + (linkMode != null ? linkMode.hashCode() : 0);
        }

        @Override // com.stripe.android.model.CreateFinancialConnectionsSessionParams
        public final Map toMap() {
            String str;
            PaymentMethodCreateParams paymentMethodCreateParams = new PaymentMethodCreateParams(PaymentMethod.Type.USBankAccount, null, new PaymentMethod.BillingDetails(this.customerEmailAddress, this.customerName, 9), null, 958462);
            Pair pair = new Pair("client_secret", this.clientSecret);
            String str2 = this.hostedSurface;
            Pair pair2 = new Pair("hosted_surface", str2);
            if (str2 != null) {
                LinkMode linkMode = this.linkMode;
                str = linkMode != null ? linkMode.value : "LINK_DISABLED";
            } else {
                str = null;
            }
            return MapUtilsKt.filterNotNullValues(MapsKt__MapsKt.mapOf(pair, pair2, new Pair("link_mode", str), new Pair("payment_method_data", paymentMethodCreateParams.toParamMap())));
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("USBankAccount(clientSecret=", this.clientSecret, ", customerName=", this.customerName, ", customerEmailAddress=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.customerEmailAddress, ", hostedSurface=", this.hostedSurface, ", linkMode=");
            m.append(this.linkMode);
            m.append(")");
            return m.toString();
        }
    }

    Map toMap();
}
