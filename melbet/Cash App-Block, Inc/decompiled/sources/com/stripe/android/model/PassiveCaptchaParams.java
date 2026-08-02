package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.PaymentIntent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PassiveCaptchaParams implements StripeModel {
    public static final Parcelable.Creator<PassiveCaptchaParams> CREATOR = new PaymentIntent.Creator(11);
    public final String rqData;
    public final String siteKey;
    public final Integer tokenTimeoutSeconds;

    public PassiveCaptchaParams(Integer num, String str, String str2) {
        str.getClass();
        this.siteKey = str;
        this.rqData = str2;
        this.tokenTimeoutSeconds = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassiveCaptchaParams)) {
            return false;
        }
        PassiveCaptchaParams passiveCaptchaParams = (PassiveCaptchaParams) obj;
        return Intrinsics.areEqual(this.siteKey, passiveCaptchaParams.siteKey) && Intrinsics.areEqual(this.rqData, passiveCaptchaParams.rqData) && Intrinsics.areEqual(this.tokenTimeoutSeconds, passiveCaptchaParams.tokenTimeoutSeconds);
    }

    public final int hashCode() {
        int hashCode = this.siteKey.hashCode() * 31;
        String str = this.rqData;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.tokenTimeoutSeconds;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PassiveCaptchaParams(siteKey=", this.siteKey, ", rqData=", this.rqData, ", tokenTimeoutSeconds="), this.tokenTimeoutSeconds, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.siteKey);
        parcel.writeString(this.rqData);
        Integer num = this.tokenTimeoutSeconds;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
        }
    }
}
