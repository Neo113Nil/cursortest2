package com.stripe.android.financialconnections.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.ServerLink;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class WebAuthFlowState implements Parcelable {

    public final class Canceled extends WebAuthFlowState {
        public static final Parcelable.Creator<Canceled> CREATOR = new ServerLink.Creator(16);
        public final String url;

        public Canceled(String str) {
            this.url = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Canceled) && Intrinsics.areEqual(this.url, ((Canceled) obj).url);
        }

        public final int hashCode() {
            String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Canceled(url=", this.url, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.url);
        }
    }

    public final class Failed extends WebAuthFlowState {
        public static final Parcelable.Creator<Failed> CREATOR = new ServerLink.Creator(17);
        public final String message;
        public final String reason;
        public final String url;

        public Failed(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.url = str;
            this.message = str2;
            this.reason = str3;
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
            return Intrinsics.areEqual(this.url, failed.url) && Intrinsics.areEqual(this.message, failed.message) && Intrinsics.areEqual(this.reason, failed.reason);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.url.hashCode() * 31, 31, this.message);
            String str = this.reason;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed(url=", this.url, ", message=", this.message, ", reason="), this.reason, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.url);
            parcel.writeString(this.message);
            parcel.writeString(this.reason);
        }
    }

    public final class InProgress extends WebAuthFlowState {
        public static final InProgress INSTANCE = new InProgress();
        public static final Parcelable.Creator<InProgress> CREATOR = new ServerLink.Creator(18);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InProgress);
        }

        public final int hashCode() {
            return 2112213844;
        }

        public final String toString() {
            return "InProgress";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Success extends WebAuthFlowState {
        public static final Parcelable.Creator<Success> CREATOR = new ServerLink.Creator(19);
        public final String url;

        public Success(String str) {
            str.getClass();
            this.url = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.url, ((Success) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(url=", this.url, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.url);
        }
    }

    public final class Uninitialized extends WebAuthFlowState {
        public static final Uninitialized INSTANCE = new Uninitialized();
        public static final Parcelable.Creator<Uninitialized> CREATOR = new ServerLink.Creator(20);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Uninitialized);
        }

        public final int hashCode() {
            return -1394387335;
        }

        public final String toString() {
            return "Uninitialized";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
