package com.stripe.android.challenge.passive.warmer.activity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.stripe.android.core.model.Country;
import com.stripe.android.model.PassiveCaptchaParams;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PassiveChallengeWarmerArgs implements Parcelable {
    public static final Parcelable.Creator<PassiveChallengeWarmerArgs> CREATOR = new Country.Creator(1);
    public final PassiveCaptchaParams passiveCaptchaParams;
    public final List productUsage;
    public final String publishableKey;

    public PassiveChallengeWarmerArgs(PassiveCaptchaParams passiveCaptchaParams, String str, ArrayList arrayList) {
        passiveCaptchaParams.getClass();
        str.getClass();
        arrayList.getClass();
        this.passiveCaptchaParams = passiveCaptchaParams;
        this.publishableKey = str;
        this.productUsage = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassiveChallengeWarmerArgs)) {
            return false;
        }
        PassiveChallengeWarmerArgs passiveChallengeWarmerArgs = (PassiveChallengeWarmerArgs) obj;
        return Intrinsics.areEqual(this.passiveCaptchaParams, passiveChallengeWarmerArgs.passiveCaptchaParams) && Intrinsics.areEqual(this.publishableKey, passiveChallengeWarmerArgs.publishableKey) && Intrinsics.areEqual(this.productUsage, passiveChallengeWarmerArgs.productUsage);
    }

    public final int hashCode() {
        return this.productUsage.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.passiveCaptchaParams.hashCode() * 31, 31, this.publishableKey);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassiveChallengeWarmerArgs(passiveCaptchaParams=");
        sb.append(this.passiveCaptchaParams);
        sb.append(", publishableKey=");
        sb.append(this.publishableKey);
        sb.append(", productUsage=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.productUsage, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.passiveCaptchaParams.writeToParcel(parcel, i);
        parcel.writeString(this.publishableKey);
        parcel.writeStringList(this.productUsage);
    }
}
