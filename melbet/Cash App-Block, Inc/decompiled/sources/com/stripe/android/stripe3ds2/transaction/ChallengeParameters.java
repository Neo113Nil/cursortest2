package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.stripe3ds2.init.AppInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ChallengeParameters implements Parcelable {
    public static final Parcelable.Creator<ChallengeParameters> CREATOR = new AppInfo.Creator(24);
    public final String acsRefNumber;
    public final String acsSignedContent;
    public final String acsTransactionId;
    public final String threeDSRequestorAppURL;
    public final String threeDsServerTransactionId;

    public ChallengeParameters(String str, String str2, String str3, String str4, String str5) {
        this.threeDsServerTransactionId = str;
        this.acsTransactionId = str2;
        this.acsRefNumber = str3;
        this.acsSignedContent = str4;
        this.threeDSRequestorAppURL = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeParameters)) {
            return false;
        }
        ChallengeParameters challengeParameters = (ChallengeParameters) obj;
        return Intrinsics.areEqual(this.threeDsServerTransactionId, challengeParameters.threeDsServerTransactionId) && Intrinsics.areEqual(this.acsTransactionId, challengeParameters.acsTransactionId) && Intrinsics.areEqual(this.acsRefNumber, challengeParameters.acsRefNumber) && Intrinsics.areEqual(this.acsSignedContent, challengeParameters.acsSignedContent) && Intrinsics.areEqual(this.threeDSRequestorAppURL, challengeParameters.threeDSRequestorAppURL);
    }

    public final int hashCode() {
        String str = this.threeDsServerTransactionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.acsTransactionId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.acsRefNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.acsSignedContent;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.threeDSRequestorAppURL;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ChallengeParameters(threeDsServerTransactionId=", this.threeDsServerTransactionId, ", acsTransactionId=", this.acsTransactionId, ", acsRefNumber=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.acsRefNumber, ", acsSignedContent=", this.acsSignedContent, ", threeDSRequestorAppURL=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.threeDSRequestorAppURL, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.threeDsServerTransactionId);
        parcel.writeString(this.acsTransactionId);
        parcel.writeString(this.acsRefNumber);
        parcel.writeString(this.acsSignedContent);
        parcel.writeString(this.threeDSRequestorAppURL);
    }
}
