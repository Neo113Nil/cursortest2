package com.stripe.android.stripe3ds2.views;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor$Config;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$Factory;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.hcaptcha.HCaptchaStateListener;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ChallengeViewArgs implements Parcelable {
    public static final Parcelable.Creator<ChallengeViewArgs> CREATOR = new HCaptchaStateListener.Creator(19);
    public final ChallengeRequestData creqData;
    public final ChallengeRequestExecutor$Config creqExecutorConfig;
    public final StripeChallengeRequestExecutor$Factory creqExecutorFactory;
    public final ChallengeResponseData cresData;
    public final IntentData intentData;
    public final int timeoutMins;
    public final StripeUiCustomization uiCustomization;

    public ChallengeViewArgs(ChallengeResponseData challengeResponseData, ChallengeRequestData challengeRequestData, StripeUiCustomization stripeUiCustomization, ChallengeRequestExecutor$Config challengeRequestExecutor$Config, StripeChallengeRequestExecutor$Factory stripeChallengeRequestExecutor$Factory, int i, IntentData intentData) {
        challengeResponseData.getClass();
        challengeRequestData.getClass();
        stripeUiCustomization.getClass();
        challengeRequestExecutor$Config.getClass();
        stripeChallengeRequestExecutor$Factory.getClass();
        intentData.getClass();
        this.cresData = challengeResponseData;
        this.creqData = challengeRequestData;
        this.uiCustomization = stripeUiCustomization;
        this.creqExecutorConfig = challengeRequestExecutor$Config;
        this.creqExecutorFactory = stripeChallengeRequestExecutor$Factory;
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
        if (!(obj instanceof ChallengeViewArgs)) {
            return false;
        }
        ChallengeViewArgs challengeViewArgs = (ChallengeViewArgs) obj;
        return Intrinsics.areEqual(this.cresData, challengeViewArgs.cresData) && Intrinsics.areEqual(this.creqData, challengeViewArgs.creqData) && Intrinsics.areEqual(this.uiCustomization, challengeViewArgs.uiCustomization) && Intrinsics.areEqual(this.creqExecutorConfig, challengeViewArgs.creqExecutorConfig) && Intrinsics.areEqual(this.creqExecutorFactory, challengeViewArgs.creqExecutorFactory) && this.timeoutMins == challengeViewArgs.timeoutMins && Intrinsics.areEqual(this.intentData, challengeViewArgs.intentData);
    }

    public final int hashCode() {
        return this.intentData.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.timeoutMins, (this.creqExecutorFactory.hashCode() + ((this.creqExecutorConfig.hashCode() + ((this.uiCustomization.hashCode() + ((this.creqData.hashCode() + (this.cresData.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ChallengeViewArgs(cresData=" + this.cresData + ", creqData=" + this.creqData + ", uiCustomization=" + this.uiCustomization + ", creqExecutorConfig=" + this.creqExecutorConfig + ", creqExecutorFactory=" + this.creqExecutorFactory + ", timeoutMins=" + this.timeoutMins + ", intentData=" + this.intentData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.cresData.writeToParcel(parcel, i);
        this.creqData.writeToParcel(parcel, i);
        parcel.writeParcelable(this.uiCustomization, i);
        this.creqExecutorConfig.writeToParcel(parcel, i);
        parcel.writeSerializable(this.creqExecutorFactory);
        parcel.writeInt(this.timeoutMins);
        this.intentData.writeToParcel(parcel, i);
    }
}
