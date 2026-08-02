package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.stripe3ds2.init.AppInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class AuthenticationRequestParameters implements Parcelable {
    public static final Parcelable.Creator<AuthenticationRequestParameters> CREATOR = new AppInfo.Creator(18);
    public final String deviceData;
    public final String messageVersion;
    public final String sdkAppId;
    public final String sdkEphemeralPublicKey;
    public final String sdkReferenceNumber;
    public final SdkTransactionId sdkTransactionId;

    public AuthenticationRequestParameters(String str, SdkTransactionId sdkTransactionId, String str2, String str3, String str4, String str5) {
        str.getClass();
        sdkTransactionId.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.deviceData = str;
        this.sdkTransactionId = sdkTransactionId;
        this.sdkAppId = str2;
        this.sdkReferenceNumber = str3;
        this.sdkEphemeralPublicKey = str4;
        this.messageVersion = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationRequestParameters)) {
            return false;
        }
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) obj;
        return Intrinsics.areEqual(this.deviceData, authenticationRequestParameters.deviceData) && Intrinsics.areEqual(this.sdkTransactionId, authenticationRequestParameters.sdkTransactionId) && Intrinsics.areEqual(this.sdkAppId, authenticationRequestParameters.sdkAppId) && Intrinsics.areEqual(this.sdkReferenceNumber, authenticationRequestParameters.sdkReferenceNumber) && Intrinsics.areEqual(this.sdkEphemeralPublicKey, authenticationRequestParameters.sdkEphemeralPublicKey) && Intrinsics.areEqual(this.messageVersion, authenticationRequestParameters.messageVersion);
    }

    public final int hashCode() {
        return this.messageVersion.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.deviceData.hashCode() * 31, 31, this.sdkTransactionId.value), 31, this.sdkAppId), 31, this.sdkReferenceNumber), 31, this.sdkEphemeralPublicKey);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthenticationRequestParameters(deviceData=");
        sb.append(this.deviceData);
        sb.append(", sdkTransactionId=");
        sb.append(this.sdkTransactionId);
        sb.append(", sdkAppId=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.sdkAppId, ", sdkReferenceNumber=", this.sdkReferenceNumber, ", sdkEphemeralPublicKey=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.sdkEphemeralPublicKey, ", messageVersion=", this.messageVersion, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.deviceData);
        SdkTransactionId sdkTransactionId = this.sdkTransactionId;
        sdkTransactionId.getClass();
        parcel.writeString(sdkTransactionId.value);
        parcel.writeString(this.sdkAppId);
        parcel.writeString(this.sdkReferenceNumber);
        parcel.writeString(this.sdkEphemeralPublicKey);
        parcel.writeString(this.messageVersion);
    }
}
