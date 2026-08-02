package com.squareup.cash.support.chat.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.support.backend.api.activities.Amount;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ChatTransactionPickerResult extends Parcelable {

    public final class Failure implements ChatTransactionPickerResult {
        public static final Failure INSTANCE = new Failure();
        public static final Parcelable.Creator<Failure> CREATOR = new Amount.Creator(6);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return 1902122081;
        }

        public final String toString() {
            return "Failure";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Success implements ChatTransactionPickerResult {
        public static final Parcelable.Creator<Success> CREATOR = new Amount.Creator(7);
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
