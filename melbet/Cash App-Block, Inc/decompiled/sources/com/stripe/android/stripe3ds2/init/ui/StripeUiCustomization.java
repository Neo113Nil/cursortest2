package com.stripe.android.stripe3ds2.init.ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import coil3.size.SizeKt;
import com.stripe.android.stripe3ds2.init.AppInfo;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class StripeUiCustomization implements Parcelable {
    public static final Parcelable.Creator<StripeUiCustomization> CREATOR = new AppInfo.Creator(16);
    public final String mAccentColor;
    public final HashMap mCustomButtonTypeCustomization;
    public final AbstractMap mDefaultButtonTypeCustomizations;
    public final LabelCustomization mLabelCustomization;
    public final TextBoxCustomization mTextBoxCustomization;
    public final StripeToolbarCustomization mToolbarCustomization;

    public StripeUiCustomization(Parcel parcel) {
        this.mAccentColor = parcel.readString();
        this.mToolbarCustomization = (StripeToolbarCustomization) parcel.readParcelable(StripeToolbarCustomization.class.getClassLoader());
        this.mLabelCustomization = (LabelCustomization) parcel.readParcelable(StripeLabelCustomization.class.getClassLoader());
        this.mTextBoxCustomization = (TextBoxCustomization) parcel.readParcelable(StripeTextBoxCustomization.class.getClassLoader());
        this.mDefaultButtonTypeCustomizations = new HashMap();
        Bundle readBundle = parcel.readBundle(StripeUiCustomization.class.getClassLoader());
        if (readBundle != null) {
            for (String str : readBundle.keySet()) {
                ButtonCustomization buttonCustomization = (ButtonCustomization) SizeKt.getParcelable(readBundle, str, ButtonCustomization.class);
                if (buttonCustomization != null) {
                    this.mDefaultButtonTypeCustomizations.put(UiCustomization$ButtonType.valueOf(str), buttonCustomization);
                }
            }
        }
        this.mCustomButtonTypeCustomization = new HashMap();
        Bundle readBundle2 = parcel.readBundle(StripeUiCustomization.class.getClassLoader());
        if (readBundle2 != null) {
            for (String str2 : readBundle2.keySet()) {
                ButtonCustomization buttonCustomization2 = (ButtonCustomization) SizeKt.getParcelable(readBundle2, str2, ButtonCustomization.class);
                if (buttonCustomization2 != null) {
                    this.mCustomButtonTypeCustomization.put(str2, buttonCustomization2);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StripeUiCustomization)) {
            return false;
        }
        StripeUiCustomization stripeUiCustomization = (StripeUiCustomization) obj;
        return Intrinsics.areEqual(this.mToolbarCustomization, stripeUiCustomization.mToolbarCustomization) && Intrinsics.areEqual(this.mAccentColor, stripeUiCustomization.mAccentColor) && Intrinsics.areEqual(this.mLabelCustomization, stripeUiCustomization.mLabelCustomization) && Intrinsics.areEqual(this.mTextBoxCustomization, stripeUiCustomization.mTextBoxCustomization) && Intrinsics.areEqual(this.mDefaultButtonTypeCustomizations, stripeUiCustomization.mDefaultButtonTypeCustomizations) && Intrinsics.areEqual(this.mCustomButtonTypeCustomization, stripeUiCustomization.mCustomButtonTypeCustomization);
    }

    public final ButtonCustomization getButtonCustomization(UiCustomization$ButtonType uiCustomization$ButtonType) {
        return (ButtonCustomization) this.mDefaultButtonTypeCustomizations.get(uiCustomization$ButtonType);
    }

    public final int hashCode() {
        return Objects.hash(Arrays.copyOf(new Object[]{this.mToolbarCustomization, this.mAccentColor, this.mLabelCustomization, this.mTextBoxCustomization, this.mDefaultButtonTypeCustomizations, this.mCustomButtonTypeCustomization}, 6));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAccentColor);
        parcel.writeParcelable(this.mToolbarCustomization, 0);
        parcel.writeParcelable((StripeLabelCustomization) this.mLabelCustomization, 0);
        parcel.writeParcelable((StripeTextBoxCustomization) this.mTextBoxCustomization, 0);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.mDefaultButtonTypeCustomizations.entrySet()) {
            bundle.putParcelable(((UiCustomization$ButtonType) entry.getKey()).name(), (StripeButtonCustomization) entry.getValue());
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry2 : this.mCustomButtonTypeCustomization.entrySet()) {
            bundle2.putParcelable((String) entry2.getKey(), (StripeButtonCustomization) entry2.getValue());
        }
        parcel.writeBundle(bundle2);
    }

    public StripeUiCustomization() {
        this.mDefaultButtonTypeCustomizations = new EnumMap(UiCustomization$ButtonType.class);
        this.mCustomButtonTypeCustomization = new HashMap();
    }
}
