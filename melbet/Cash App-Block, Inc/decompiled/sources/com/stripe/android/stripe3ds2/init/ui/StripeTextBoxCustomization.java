package com.stripe.android.stripe3ds2.init.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.init.AppInfo;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class StripeTextBoxCustomization extends BaseCustomization implements TextBoxCustomization {
    public static final Parcelable.Creator<StripeTextBoxCustomization> CREATOR = new AppInfo.Creator(14);
    public String mBorderColor;
    public int mBorderWidth;
    public int mCornerRadius;
    public String mHintTextColor;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StripeTextBoxCustomization)) {
            return false;
        }
        StripeTextBoxCustomization stripeTextBoxCustomization = (StripeTextBoxCustomization) obj;
        return this.mBorderWidth == stripeTextBoxCustomization.mBorderWidth && Intrinsics.areEqual(this.mBorderColor, stripeTextBoxCustomization.mBorderColor) && this.mCornerRadius == stripeTextBoxCustomization.mCornerRadius && Intrinsics.areEqual(this.mHintTextColor, stripeTextBoxCustomization.mHintTextColor);
    }

    public final int hashCode() {
        return ObjectUtils.hash(Integer.valueOf(this.mBorderWidth), this.mBorderColor, Integer.valueOf(this.mCornerRadius), this.mHintTextColor);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.BaseCustomization, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.mBorderWidth);
        parcel.writeString(this.mBorderColor);
        parcel.writeInt(this.mCornerRadius);
        parcel.writeString(this.mHintTextColor);
    }
}
