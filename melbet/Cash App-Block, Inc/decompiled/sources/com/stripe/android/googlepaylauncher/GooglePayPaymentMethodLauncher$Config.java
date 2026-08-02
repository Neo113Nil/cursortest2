package com.stripe.android.googlepaylauncher;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.googlepaylauncher.GooglePayLauncher$Config;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class GooglePayPaymentMethodLauncher$Config implements Parcelable {
    public static final Parcelable.Creator<GooglePayPaymentMethodLauncher$Config> CREATOR = new GooglePayLauncher$Config.Creator(8);
    public final List additionalEnabledNetworks;
    public final boolean allowCreditCards;
    public final GooglePayPaymentMethodLauncher$BillingAddressConfig billingAddressConfig;
    public final GooglePayEnvironment environment;
    public final boolean existingPaymentMethodRequired;
    public final boolean isEmailRequired;
    public final String merchantCountryCode;
    public final String merchantName;

    public GooglePayPaymentMethodLauncher$Config(GooglePayEnvironment googlePayEnvironment, String str, String str2, boolean z, GooglePayPaymentMethodLauncher$BillingAddressConfig googlePayPaymentMethodLauncher$BillingAddressConfig, boolean z2, boolean z3, ArrayList arrayList) {
        googlePayEnvironment.getClass();
        str.getClass();
        str2.getClass();
        googlePayPaymentMethodLauncher$BillingAddressConfig.getClass();
        arrayList.getClass();
        this.environment = googlePayEnvironment;
        this.merchantCountryCode = str;
        this.merchantName = str2;
        this.isEmailRequired = z;
        this.billingAddressConfig = googlePayPaymentMethodLauncher$BillingAddressConfig;
        this.existingPaymentMethodRequired = z2;
        this.allowCreditCards = z3;
        this.additionalEnabledNetworks = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayPaymentMethodLauncher$Config)) {
            return false;
        }
        GooglePayPaymentMethodLauncher$Config googlePayPaymentMethodLauncher$Config = (GooglePayPaymentMethodLauncher$Config) obj;
        return this.environment == googlePayPaymentMethodLauncher$Config.environment && Intrinsics.areEqual(this.merchantCountryCode, googlePayPaymentMethodLauncher$Config.merchantCountryCode) && Intrinsics.areEqual(this.merchantName, googlePayPaymentMethodLauncher$Config.merchantName) && this.isEmailRequired == googlePayPaymentMethodLauncher$Config.isEmailRequired && Intrinsics.areEqual(this.billingAddressConfig, googlePayPaymentMethodLauncher$Config.billingAddressConfig) && this.existingPaymentMethodRequired == googlePayPaymentMethodLauncher$Config.existingPaymentMethodRequired && this.allowCreditCards == googlePayPaymentMethodLauncher$Config.allowCreditCards && Intrinsics.areEqual(this.additionalEnabledNetworks, googlePayPaymentMethodLauncher$Config.additionalEnabledNetworks);
    }

    public final int hashCode() {
        return this.additionalEnabledNetworks.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.billingAddressConfig.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.environment.hashCode() * 31, 31, this.merchantCountryCode), 31, this.merchantName), 31, this.isEmailRequired)) * 31, 31, this.existingPaymentMethodRequired), 31, this.allowCreditCards);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(environment=");
        sb.append(this.environment);
        sb.append(", merchantCountryCode=");
        sb.append(this.merchantCountryCode);
        sb.append(", merchantName=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.merchantName, ", isEmailRequired=", this.isEmailRequired, ", billingAddressConfig=");
        sb.append(this.billingAddressConfig);
        sb.append(", existingPaymentMethodRequired=");
        sb.append(this.existingPaymentMethodRequired);
        sb.append(", allowCreditCards=");
        sb.append(this.allowCreditCards);
        sb.append(", additionalEnabledNetworks=");
        sb.append(this.additionalEnabledNetworks);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.environment.name());
        parcel.writeString(this.merchantCountryCode);
        parcel.writeString(this.merchantName);
        parcel.writeInt(this.isEmailRequired ? 1 : 0);
        this.billingAddressConfig.writeToParcel(parcel, i);
        parcel.writeInt(this.existingPaymentMethodRequired ? 1 : 0);
        parcel.writeInt(this.allowCreditCards ? 1 : 0);
        parcel.writeStringList(this.additionalEnabledNetworks);
    }
}
