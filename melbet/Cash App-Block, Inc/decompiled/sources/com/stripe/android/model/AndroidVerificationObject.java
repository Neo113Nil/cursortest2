package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.model.Card;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class AndroidVerificationObject implements Parcelable {
    public static final Parcelable.Creator<AndroidVerificationObject> CREATOR = new Card.Creator(4);
    public final String androidVerificationToken;
    public final String appId;

    public AndroidVerificationObject(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.appId = str;
        this.androidVerificationToken = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidVerificationObject)) {
            return false;
        }
        AndroidVerificationObject androidVerificationObject = (AndroidVerificationObject) obj;
        return Intrinsics.areEqual(this.appId, androidVerificationObject.appId) && Intrinsics.areEqual(this.androidVerificationToken, androidVerificationObject.androidVerificationToken);
    }

    public final int hashCode() {
        return this.androidVerificationToken.hashCode() + (this.appId.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("AndroidVerificationObject(appId=", this.appId, ", androidVerificationToken=", this.androidVerificationToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.appId);
        parcel.writeString(this.androidVerificationToken);
    }
}
