package com.stripe.android.stripe3ds2.init.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.init.AppInfo;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class StripeLabelCustomization extends BaseCustomization implements LabelCustomization {
    public static final Parcelable.Creator<StripeLabelCustomization> CREATOR = new AppInfo.Creator(13);
    public String mHeadingTextColor;
    public String mHeadingTextFontName;
    public int mHeadingTextFontSize;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StripeLabelCustomization)) {
            return false;
        }
        StripeLabelCustomization stripeLabelCustomization = (StripeLabelCustomization) obj;
        return Intrinsics.areEqual(this.mHeadingTextColor, stripeLabelCustomization.mHeadingTextColor) && Intrinsics.areEqual(this.mHeadingTextFontName, stripeLabelCustomization.mHeadingTextFontName) && this.mHeadingTextFontSize == stripeLabelCustomization.mHeadingTextFontSize;
    }

    public final int hashCode() {
        return ObjectUtils.hash(this.mHeadingTextColor, this.mHeadingTextFontName, Integer.valueOf(this.mHeadingTextFontSize));
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.BaseCustomization, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mHeadingTextColor);
        parcel.writeString(this.mHeadingTextFontName);
        parcel.writeInt(this.mHeadingTextFontSize);
    }
}
