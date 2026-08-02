package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.SetupIntentResult;

/* loaded from: classes8.dex */
public final class DefaultCardFundingFilter implements Parcelable {
    public static final DefaultCardFundingFilter INSTANCE = new DefaultCardFundingFilter();
    public static final Parcelable.Creator<DefaultCardFundingFilter> CREATOR = new SetupIntentResult.Creator(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
