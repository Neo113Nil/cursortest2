package com.stripe.android.googlepaylauncher;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.googlepaylauncher.GooglePayLauncher$Config;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes8.dex */
public final class GooglePayLauncher$BillingAddressConfig implements Parcelable {
    public static final Parcelable.Creator<GooglePayLauncher$BillingAddressConfig> CREATOR = new GooglePayLauncher$Config.Creator(1);

    /* renamed from: format, reason: collision with root package name */
    public final Format f1435format;
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

    public GooglePayLauncher$BillingAddressConfig(boolean z, Format format2, boolean z2) {
        format2.getClass();
        this.isRequired = z;
        this.f1435format = format2;
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
        if (!(obj instanceof GooglePayLauncher$BillingAddressConfig)) {
            return false;
        }
        GooglePayLauncher$BillingAddressConfig googlePayLauncher$BillingAddressConfig = (GooglePayLauncher$BillingAddressConfig) obj;
        return this.isRequired == googlePayLauncher$BillingAddressConfig.isRequired && this.f1435format == googlePayLauncher$BillingAddressConfig.f1435format && this.isPhoneNumberRequired == googlePayLauncher$BillingAddressConfig.isPhoneNumberRequired;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isPhoneNumberRequired) + ((this.f1435format.hashCode() + (Boolean.hashCode(this.isRequired) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BillingAddressConfig(isRequired=");
        sb.append(this.isRequired);
        sb.append(", format=");
        sb.append(this.f1435format);
        sb.append(", isPhoneNumberRequired=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isPhoneNumberRequired, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.isRequired ? 1 : 0);
        parcel.writeString(this.f1435format.name());
        parcel.writeInt(this.isPhoneNumberRequired ? 1 : 0);
    }
}
