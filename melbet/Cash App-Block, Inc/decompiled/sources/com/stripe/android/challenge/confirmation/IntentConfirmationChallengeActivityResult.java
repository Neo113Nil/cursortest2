package com.stripe.android.challenge.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.SetupIntentResult;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public interface IntentConfirmationChallengeActivityResult extends Parcelable {

    public final class Canceled implements IntentConfirmationChallengeActivityResult {
        public static final Parcelable.Creator<Canceled> CREATOR = new SetupIntentResult.Creator(22);
        public final String clientSecret;

        public Canceled(String str) {
            this.clientSecret = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Canceled) && Intrinsics.areEqual(this.clientSecret, ((Canceled) obj).clientSecret);
        }

        public final int hashCode() {
            String str = this.clientSecret;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Canceled(clientSecret=", this.clientSecret, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.clientSecret);
        }
    }

    public final class Failed implements IntentConfirmationChallengeActivityResult {
        public static final Parcelable.Creator<Failed> CREATOR = new SetupIntentResult.Creator(23);
        public final String clientSecret;
        public final Throwable error;

        public Failed(String str, Throwable th) {
            th.getClass();
            this.clientSecret = str;
            this.error = th;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) obj;
            return Intrinsics.areEqual(this.clientSecret, failed.clientSecret) && Intrinsics.areEqual(this.error, failed.error);
        }

        public final int hashCode() {
            String str = this.clientSecret;
            return this.error.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "Failed(clientSecret=" + this.clientSecret + ", error=" + this.error + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.clientSecret);
            parcel.writeSerializable(this.error);
        }
    }

    public final class Success implements IntentConfirmationChallengeActivityResult {
        public static final Parcelable.Creator<Success> CREATOR = new SetupIntentResult.Creator(24);
        public final String clientSecret;

        public Success(String str) {
            str.getClass();
            this.clientSecret = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.clientSecret, ((Success) obj).clientSecret);
        }

        public final int hashCode() {
            return this.clientSecret.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(clientSecret=", this.clientSecret, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.clientSecret);
        }
    }
}
