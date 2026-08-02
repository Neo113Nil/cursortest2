package com.stripe.android.stripe3ds2.init.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.init.AppInfo;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class StripeButtonCustomization extends BaseCustomization implements ButtonCustomization {
    public static final Parcelable.Creator<StripeButtonCustomization> CREATOR = new AppInfo.Creator(12);
    public String mBackgroundColor;
    public int mCornerRadius;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StripeButtonCustomization)) {
            return false;
        }
        StripeButtonCustomization stripeButtonCustomization = (StripeButtonCustomization) obj;
        return Intrinsics.areEqual(this.mBackgroundColor, stripeButtonCustomization.mBackgroundColor) && this.mCornerRadius == stripeButtonCustomization.mCornerRadius;
    }

    public final int hashCode() {
        return ObjectUtils.hash(this.mBackgroundColor, Integer.valueOf(this.mCornerRadius));
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.BaseCustomization, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mBackgroundColor);
        parcel.writeInt(this.mCornerRadius);
    }
}
