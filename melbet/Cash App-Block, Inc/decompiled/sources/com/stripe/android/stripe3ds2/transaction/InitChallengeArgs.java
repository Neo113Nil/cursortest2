package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.hcaptcha.HCaptchaStateListener;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.KeyPair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class InitChallengeArgs implements Parcelable {
    public static final Parcelable.Creator<InitChallengeArgs> CREATOR = new HCaptchaStateListener.Creator(8);
    public final ChallengeParameters challengeParameters;
    public final IntentData intentData;
    public final KeyPair sdkKeyPair;
    public final String sdkReferenceNumber;
    public final int timeoutMins;

    public InitChallengeArgs(String str, KeyPair keyPair, ChallengeParameters challengeParameters, int i, IntentData intentData) {
        str.getClass();
        keyPair.getClass();
        challengeParameters.getClass();
        intentData.getClass();
        this.sdkReferenceNumber = str;
        this.sdkKeyPair = keyPair;
        this.challengeParameters = challengeParameters;
        this.timeoutMins = i;
        this.intentData = intentData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitChallengeArgs)) {
            return false;
        }
        InitChallengeArgs initChallengeArgs = (InitChallengeArgs) obj;
        return Intrinsics.areEqual(this.sdkReferenceNumber, initChallengeArgs.sdkReferenceNumber) && Intrinsics.areEqual(this.sdkKeyPair, initChallengeArgs.sdkKeyPair) && Intrinsics.areEqual(this.challengeParameters, initChallengeArgs.challengeParameters) && this.timeoutMins == initChallengeArgs.timeoutMins && Intrinsics.areEqual(this.intentData, initChallengeArgs.intentData);
    }

    public final int hashCode() {
        return this.intentData.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.timeoutMins, (this.challengeParameters.hashCode() + ((this.sdkKeyPair.hashCode() + (this.sdkReferenceNumber.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "InitChallengeArgs(sdkReferenceNumber=" + this.sdkReferenceNumber + ", sdkKeyPair=" + this.sdkKeyPair + ", challengeParameters=" + this.challengeParameters + ", timeoutMins=" + this.timeoutMins + ", intentData=" + this.intentData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.sdkReferenceNumber);
        parcel.writeSerializable(this.sdkKeyPair);
        this.challengeParameters.writeToParcel(parcel, i);
        parcel.writeInt(this.timeoutMins);
        this.intentData.writeToParcel(parcel, i);
    }
}
