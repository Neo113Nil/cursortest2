package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import com.stripe.hcaptcha.HCaptchaStateListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class InitChallengeResult implements Parcelable {

    public final class End extends InitChallengeResult {
        public static final Parcelable.Creator<End> CREATOR = new HCaptchaStateListener.Creator(9);
        public final ChallengeResult challengeResult;

        public End(ChallengeResult challengeResult) {
            challengeResult.getClass();
            this.challengeResult = challengeResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof End) && Intrinsics.areEqual(this.challengeResult, ((End) obj).challengeResult);
        }

        public final int hashCode() {
            return this.challengeResult.hashCode();
        }

        public final String toString() {
            return "End(challengeResult=" + this.challengeResult + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.challengeResult, i);
        }
    }

    public final class Start extends InitChallengeResult {
        public static final Parcelable.Creator<Start> CREATOR = new HCaptchaStateListener.Creator(10);
        public final ChallengeViewArgs challengeViewArgs;

        public Start(ChallengeViewArgs challengeViewArgs) {
            challengeViewArgs.getClass();
            this.challengeViewArgs = challengeViewArgs;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Start) && Intrinsics.areEqual(this.challengeViewArgs, ((Start) obj).challengeViewArgs);
        }

        public final int hashCode() {
            return this.challengeViewArgs.hashCode();
        }

        public final String toString() {
            return "Start(challengeViewArgs=" + this.challengeViewArgs + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.challengeViewArgs.writeToParcel(parcel, i);
        }
    }
}
