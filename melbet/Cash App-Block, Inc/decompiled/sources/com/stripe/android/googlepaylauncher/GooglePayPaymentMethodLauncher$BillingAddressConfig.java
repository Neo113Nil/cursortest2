package com.stripe.android.googlepaylauncher;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.googlepaylauncher.GooglePayLauncher$Config;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes8.dex */
public final class GooglePayPaymentMethodLauncher$BillingAddressConfig implements Parcelable {
    public static final Parcelable.Creator<GooglePayPaymentMethodLauncher$BillingAddressConfig> CREATOR = new GooglePayLauncher$Config.Creator(7);

    /* renamed from: format, reason: collision with root package name */
    public final Format f1436format;
    public final boolean isPhoneNumberRequired;
    public final boolean isRequired;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Format {
        public static final /* synthetic */ Format[] $VALUES = {new Format("Min", 0), new Format("Full", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        Format EF5;

        public static Format valueOf(String str) {
            return (Format) Enum.valueOf(Format.class, str);
        }

        public static Format[] values() {
            return (Format[]) $VALUES.clone();
        }
    }

    public GooglePayPaymentMethodLauncher$BillingAddressConfig(boolean z, Format format2, boolean z2) {
        format2.getClass();
        this.isRequired = z;
        this.f1436format = format2;
        this.isPhoneNumberRequired = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayPaymentMethodLauncher$BillingAddressConfig)) {
            return false;
        }
        GooglePayPaymentMethodLauncher$BillingAddressConfig googlePayPaymentMethodLauncher$BillingAddressConfig = (GooglePayPaymentMethodLauncher$BillingAddressConfig) obj;
        return this.isRequired == googlePayPaymentMethodLauncher$BillingAddressConfig.isRequired && this.f1436format == googlePayPaymentMethodLauncher$BillingAddressConfig.f1436format && this.isPhoneNumberRequired == googlePayPaymentMethodLauncher$BillingAddressConfig.isPhoneNumberRequired;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isPhoneNumberRequired) + ((this.f1436format.hashCode() + (Boolean.hashCode(this.isRequired) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BillingAddressConfig(isRequired=");
        sb.append(this.isRequired);
        sb.append(", format=");
        sb.append(this.f1436format);
        sb.append(", isPhoneNumberRequired=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isPhoneNumberRequired, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.isRequired ? 1 : 0);
        parcel.writeString(this.f1436format.name());
        parcel.writeInt(this.isPhoneNumberRequired ? 1 : 0);
    }
}
