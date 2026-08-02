package com.stripe.android.stripe3ds2.init.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.init.AppInfo;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class StripeToolbarCustomization extends BaseCustomization {
    public static final Parcelable.Creator<StripeToolbarCustomization> CREATOR = new AppInfo.Creator(15);
    public String mBackgroundColor;
    public String mButtonText;
    public String mHeaderText;
    public String mStatusBarColor;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StripeToolbarCustomization)) {
            return false;
        }
        StripeToolbarCustomization stripeToolbarCustomization = (StripeToolbarCustomization) obj;
        return Intrinsics.areEqual(this.mBackgroundColor, stripeToolbarCustomization.mBackgroundColor) && Intrinsics.areEqual(this.mStatusBarColor, stripeToolbarCustomization.mStatusBarColor) && Intrinsics.areEqual(this.mHeaderText, stripeToolbarCustomization.mHeaderText) && Intrinsics.areEqual(this.mButtonText, stripeToolbarCustomization.mButtonText);
    }

    public final int hashCode() {
        return ObjectUtils.hash(this.mBackgroundColor, this.mStatusBarColor, this.mHeaderText, this.mButtonText);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.BaseCustomization, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mBackgroundColor);
        parcel.writeString(this.mStatusBarColor);
        parcel.writeString(this.mHeaderText);
        parcel.writeString(this.mButtonText);
    }
}
