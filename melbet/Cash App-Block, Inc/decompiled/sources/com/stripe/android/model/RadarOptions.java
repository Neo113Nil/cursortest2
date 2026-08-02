package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.stripe.android.model.Source;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class RadarOptions implements Parcelable {
    public static final Parcelable.Creator<RadarOptions> CREATOR = new Source.Creator(24);
    public final AndroidVerificationObject androidVerificationObject;
    public final String hCaptchaToken;

    public RadarOptions(String str, AndroidVerificationObject androidVerificationObject) {
        this.hCaptchaToken = str;
        this.androidVerificationObject = androidVerificationObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadarOptions)) {
            return false;
        }
        RadarOptions radarOptions = (RadarOptions) obj;
        return Intrinsics.areEqual(this.hCaptchaToken, radarOptions.hCaptchaToken) && Intrinsics.areEqual(this.androidVerificationObject, radarOptions.androidVerificationObject);
    }

    public final int hashCode() {
        String str = this.hCaptchaToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AndroidVerificationObject androidVerificationObject = this.androidVerificationObject;
        return hashCode + (androidVerificationObject != null ? androidVerificationObject.hashCode() : 0);
    }

    public final Map toParamMap() {
        String str = this.hCaptchaToken;
        Map m = str != null ? Thread$State$EnumUnboxingLocalUtility.m("hcaptcha_token", str) : null;
        if (m == null) {
            m = EmptyMap.INSTANCE;
            m.getClass();
        }
        AndroidVerificationObject androidVerificationObject = this.androidVerificationObject;
        Map m2 = androidVerificationObject != null ? BalanceFeedKt$$ExternalSyntheticOutline0.m("android_verification_object", MapsKt__MapsKt.mapOf(new Pair("android_verification_token", androidVerificationObject.androidVerificationToken), new Pair("app_id", androidVerificationObject.appId))) : null;
        if (m2 == null) {
            m2 = EmptyMap.INSTANCE;
            m2.getClass();
        }
        return MapsKt__MapsKt.plus(m, m2);
    }

    public final String toString() {
        return "RadarOptions(hCaptchaToken=" + this.hCaptchaToken + ", androidVerificationObject=" + this.androidVerificationObject + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.hCaptchaToken);
        AndroidVerificationObject androidVerificationObject = this.androidVerificationObject;
        if (androidVerificationObject == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            androidVerificationObject.writeToParcel(parcel, i);
        }
    }
}
