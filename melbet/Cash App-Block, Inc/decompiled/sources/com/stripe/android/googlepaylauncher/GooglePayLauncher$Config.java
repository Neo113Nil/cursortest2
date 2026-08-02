package com.stripe.android.googlepaylauncher;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.DefaultCardBrandFilter;
import com.stripe.android.DefaultCardFundingFilter;
import com.stripe.android.googlepaylauncher.GooglePayLauncher$BillingAddressConfig;
import com.stripe.android.googlepaylauncher.GooglePayLauncher$Result;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$BillingAddressConfig;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Result;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.model.ClientAttributionMetadata;
import com.stripe.android.model.PaymentMethod;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class GooglePayLauncher$Config implements Parcelable {
    public static final Parcelable.Creator<GooglePayLauncher$Config> CREATOR = new Creator(0);
    public final List additionalEnabledNetworks;
    public final boolean allowCreditCards;
    public final GooglePayLauncher$BillingAddressConfig billingAddressConfig;
    public final GooglePayEnvironment environment;
    public final boolean existingPaymentMethodRequired;
    public final boolean isEmailRequired;
    public final String merchantCountryCode;
    public final String merchantName;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            GooglePayPaymentMethodLauncher$BillingAddressConfig googlePayPaymentMethodLauncher$BillingAddressConfig;
            boolean z3;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new GooglePayLauncher$Config(GooglePayEnvironment.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, GooglePayLauncher$BillingAddressConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.createStringArrayList());
                case 1:
                    boolean z4 = true;
                    parcel.getClass();
                    boolean z5 = parcel.readInt() != 0;
                    GooglePayLauncher$BillingAddressConfig.Format valueOf = GooglePayLauncher$BillingAddressConfig.Format.valueOf(parcel.readString());
                    if (parcel.readInt() == 0) {
                        z4 = false;
                    }
                    return new GooglePayLauncher$BillingAddressConfig(z5, valueOf, z4);
                case 2:
                    parcel.getClass();
                    parcel.readInt();
                    return GooglePayLauncher$Result.Canceled.INSTANCE;
                case 3:
                    parcel.getClass();
                    parcel.readInt();
                    return GooglePayLauncher$Result.Completed.INSTANCE;
                case 4:
                    parcel.getClass();
                    return new GooglePayLauncher$Result.Failed((Throwable) parcel.readSerializable());
                case 5:
                    parcel.getClass();
                    return new GooglePayLauncherContract.PaymentIntentArgs(parcel.readString(), GooglePayLauncher$Config.CREATOR.createFromParcel(parcel), parcel.readString());
                case 6:
                    parcel.getClass();
                    return new GooglePayLauncherContract.SetupIntentArgs(parcel.readString(), GooglePayLauncher$Config.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
                case 7:
                    boolean z6 = true;
                    parcel.getClass();
                    boolean z7 = parcel.readInt() != 0;
                    GooglePayPaymentMethodLauncher$BillingAddressConfig.Format valueOf2 = GooglePayPaymentMethodLauncher$BillingAddressConfig.Format.valueOf(parcel.readString());
                    if (parcel.readInt() == 0) {
                        z6 = false;
                    }
                    return new GooglePayPaymentMethodLauncher$BillingAddressConfig(z7, valueOf2, z6);
                case 8:
                    parcel.getClass();
                    GooglePayEnvironment valueOf3 = GooglePayEnvironment.valueOf(parcel.readString());
                    boolean z8 = false;
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = false;
                        z8 = true;
                    } else {
                        z = false;
                    }
                    GooglePayPaymentMethodLauncher$BillingAddressConfig createFromParcel = GooglePayPaymentMethodLauncher$BillingAddressConfig.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() != 0) {
                        z2 = z;
                        z = true;
                    } else {
                        z2 = z;
                    }
                    if (parcel.readInt() != 0) {
                        z3 = true;
                        googlePayPaymentMethodLauncher$BillingAddressConfig = createFromParcel;
                    } else {
                        googlePayPaymentMethodLauncher$BillingAddressConfig = createFromParcel;
                        z3 = z2;
                    }
                    return new GooglePayPaymentMethodLauncher$Config(valueOf3, readString, readString2, z8, googlePayPaymentMethodLauncher$BillingAddressConfig, z, z3, parcel.createStringArrayList());
                case 9:
                    parcel.getClass();
                    parcel.readInt();
                    return GooglePayPaymentMethodLauncher$Result.Canceled.INSTANCE;
                case 10:
                    parcel.getClass();
                    return new GooglePayPaymentMethodLauncher$Result.Completed(PaymentMethod.CREATOR.createFromParcel(parcel));
                case 11:
                    parcel.getClass();
                    return new GooglePayPaymentMethodLauncher$Result.Failed((Throwable) parcel.readSerializable(), parcel.readInt());
                default:
                    parcel.getClass();
                    return new GooglePayPaymentMethodLauncherContractV2.Args(GooglePayPaymentMethodLauncher$Config.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), (DefaultCardBrandFilter) parcel.readParcelable(GooglePayPaymentMethodLauncherContractV2.Args.class.getClassLoader()), (DefaultCardFundingFilter) parcel.readParcelable(GooglePayPaymentMethodLauncherContractV2.Args.class.getClassLoader()), parcel.readInt() != 0 ? ClientAttributionMetadata.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readString());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new GooglePayLauncher$Config[i];
                case 1:
                    return new GooglePayLauncher$BillingAddressConfig[i];
                case 2:
                    return new GooglePayLauncher$Result.Canceled[i];
                case 3:
                    return new GooglePayLauncher$Result.Completed[i];
                case 4:
                    return new GooglePayLauncher$Result.Failed[i];
                case 5:
                    return new GooglePayLauncherContract.PaymentIntentArgs[i];
                case 6:
                    return new GooglePayLauncherContract.SetupIntentArgs[i];
                case 7:
                    return new GooglePayPaymentMethodLauncher$BillingAddressConfig[i];
                case 8:
                    return new GooglePayPaymentMethodLauncher$Config[i];
                case 9:
                    return new GooglePayPaymentMethodLauncher$Result.Canceled[i];
                case 10:
                    return new GooglePayPaymentMethodLauncher$Result.Completed[i];
                case 11:
                    return new GooglePayPaymentMethodLauncher$Result.Failed[i];
                default:
                    return new GooglePayPaymentMethodLauncherContractV2.Args[i];
            }
        }
    }

    public GooglePayLauncher$Config(GooglePayEnvironment googlePayEnvironment, String str, String str2, boolean z, GooglePayLauncher$BillingAddressConfig googlePayLauncher$BillingAddressConfig, boolean z2, boolean z3, ArrayList arrayList) {
        googlePayEnvironment.getClass();
        str.getClass();
        str2.getClass();
        googlePayLauncher$BillingAddressConfig.getClass();
        arrayList.getClass();
        this.environment = googlePayEnvironment;
        this.merchantCountryCode = str;
        this.merchantName = str2;
        this.isEmailRequired = z;
        this.billingAddressConfig = googlePayLauncher$BillingAddressConfig;
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
        if (!(obj instanceof GooglePayLauncher$Config)) {
            return false;
        }
        GooglePayLauncher$Config googlePayLauncher$Config = (GooglePayLauncher$Config) obj;
        return this.environment == googlePayLauncher$Config.environment && Intrinsics.areEqual(this.merchantCountryCode, googlePayLauncher$Config.merchantCountryCode) && Intrinsics.areEqual(this.merchantName, googlePayLauncher$Config.merchantName) && this.isEmailRequired == googlePayLauncher$Config.isEmailRequired && Intrinsics.areEqual(this.billingAddressConfig, googlePayLauncher$Config.billingAddressConfig) && this.existingPaymentMethodRequired == googlePayLauncher$Config.existingPaymentMethodRequired && this.allowCreditCards == googlePayLauncher$Config.allowCreditCards && Intrinsics.areEqual(this.additionalEnabledNetworks, googlePayLauncher$Config.additionalEnabledNetworks);
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
