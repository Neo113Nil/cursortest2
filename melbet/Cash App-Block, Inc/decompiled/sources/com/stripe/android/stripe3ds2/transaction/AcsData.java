package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.init.AppInfo;
import java.security.interfaces.ECPublicKey;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class AcsData implements Parcelable {
    public static final Parcelable.Creator<AcsData> CREATOR = new AppInfo.Creator(17);
    public final ECPublicKey acsEphemPubKey;
    public final String acsUrl;
    public final ECPublicKey sdkEphemPubKey;

    public AcsData(String str, ECPublicKey eCPublicKey, ECPublicKey eCPublicKey2) {
        str.getClass();
        eCPublicKey.getClass();
        eCPublicKey2.getClass();
        this.acsUrl = str;
        this.acsEphemPubKey = eCPublicKey;
        this.sdkEphemPubKey = eCPublicKey2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcsData)) {
            return false;
        }
        AcsData acsData = (AcsData) obj;
        return Intrinsics.areEqual(this.acsUrl, acsData.acsUrl) && Intrinsics.areEqual(this.acsEphemPubKey, acsData.acsEphemPubKey) && Intrinsics.areEqual(this.sdkEphemPubKey, acsData.sdkEphemPubKey);
    }

    public final int hashCode() {
        return this.sdkEphemPubKey.hashCode() + ((this.acsEphemPubKey.hashCode() + (this.acsUrl.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AcsData(acsUrl=" + this.acsUrl + ", acsEphemPubKey=" + this.acsEphemPubKey + ", sdkEphemPubKey=" + this.sdkEphemPubKey + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.acsUrl);
        parcel.writeSerializable(this.acsEphemPubKey);
        parcel.writeSerializable(this.sdkEphemPubKey);
    }
}
