package com.stripe.android.challenge.passive;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.stripe.android.SetupIntentResult;
import com.stripe.android.model.PassiveCaptchaParams;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PassiveChallengeArgs implements Parcelable {
    public static final Parcelable.Creator<PassiveChallengeArgs> CREATOR = new SetupIntentResult.Creator(29);
    public final PassiveCaptchaParams passiveCaptchaParams;
    public final List productUsage;
    public final String publishableKey;

    public PassiveChallengeArgs(PassiveCaptchaParams passiveCaptchaParams, String str, List list) {
        passiveCaptchaParams.getClass();
        str.getClass();
        list.getClass();
        this.passiveCaptchaParams = passiveCaptchaParams;
        this.publishableKey = str;
        this.productUsage = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassiveChallengeArgs)) {
            return false;
        }
        PassiveChallengeArgs passiveChallengeArgs = (PassiveChallengeArgs) obj;
        return Intrinsics.areEqual(this.passiveCaptchaParams, passiveChallengeArgs.passiveCaptchaParams) && Intrinsics.areEqual(this.publishableKey, passiveChallengeArgs.publishableKey) && Intrinsics.areEqual(this.productUsage, passiveChallengeArgs.productUsage);
    }

    public final int hashCode() {
        return this.productUsage.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.passiveCaptchaParams.hashCode() * 31, 31, this.publishableKey);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassiveChallengeArgs(passiveCaptchaParams=");
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
