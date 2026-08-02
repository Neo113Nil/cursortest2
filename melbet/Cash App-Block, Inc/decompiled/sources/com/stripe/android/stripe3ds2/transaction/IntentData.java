package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.stripe.hcaptcha.HCaptchaStateListener;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class IntentData implements Parcelable {
    public static final Parcelable.Creator<IntentData> CREATOR = new HCaptchaStateListener.Creator(11);
    public static final IntentData EMPTY = new IntentData("", "", "", null);
    public final String accountId;
    public final String clientSecret;
    public final String publishableKey;
    public final String sourceId;

    public IntentData(String str, String str2, String str3, String str4) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.clientSecret = str;
        this.sourceId = str2;
        this.publishableKey = str3;
        this.accountId = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntentData)) {
            return false;
        }
        IntentData intentData = (IntentData) obj;
        return Intrinsics.areEqual(this.clientSecret, intentData.clientSecret) && Intrinsics.areEqual(this.sourceId, intentData.sourceId) && Intrinsics.areEqual(this.publishableKey, intentData.publishableKey) && Intrinsics.areEqual(this.accountId, intentData.accountId);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.clientSecret.hashCode() * 31, 31, this.sourceId), 31, this.publishableKey);
        String str = this.accountId;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("IntentData(clientSecret=", this.clientSecret, ", sourceId=", this.sourceId, ", publishableKey="), this.publishableKey, ", accountId=", this.accountId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.sourceId);
        parcel.writeString(this.publishableKey);
        parcel.writeString(this.accountId);
    }
}
