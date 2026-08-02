package com.stripe.android.challenge.passive;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.SetupIntentResult;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public interface PassiveChallengeActivityResult extends Parcelable {

    public final class Failed implements PassiveChallengeActivityResult {
        public static final Parcelable.Creator<Failed> CREATOR = new SetupIntentResult.Creator(27);
        public final Throwable error;

        public Failed(Throwable th) {
            th.getClass();
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
            return (obj instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) obj).error);
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("Failed(error=", ")", this.error);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.error);
        }
    }

    public final class Success implements PassiveChallengeActivityResult {
        public static final Parcelable.Creator<Success> CREATOR = new SetupIntentResult.Creator(28);
        public final String token;

        public Success(String str) {
            str.getClass();
            this.token = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.token, ((Success) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(token=", this.token, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.token);
        }
    }
}
