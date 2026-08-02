package com.stripe.android.googlepaylauncher;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.googlepaylauncher.GooglePayLauncher$Config;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class GooglePayLauncher$Result implements Parcelable {

    public final class Canceled extends GooglePayLauncher$Result {
        public static final Canceled INSTANCE = new Canceled();
        public static final Parcelable.Creator<Canceled> CREATOR = new GooglePayLauncher$Config.Creator(2);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Canceled);
        }

        public final int hashCode() {
            return 1700832601;
        }

        public final String toString() {
            return "Canceled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Completed extends GooglePayLauncher$Result {
        public static final Completed INSTANCE = new Completed();
        public static final Parcelable.Creator<Completed> CREATOR = new GooglePayLauncher$Config.Creator(3);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Completed);
        }

        public final int hashCode() {
            return -693310069;
        }

        public final String toString() {
            return "Completed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Failed extends GooglePayLauncher$Result {
        public static final Parcelable.Creator<Failed> CREATOR = new GooglePayLauncher$Config.Creator(4);
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
}
