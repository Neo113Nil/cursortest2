package com.stripe.android.payments.bankaccount.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.model.Token;
import com.stripe.android.stripe3ds2.init.AppInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class CollectBankAccountResultInternal implements Parcelable {

    public final class Cancelled extends CollectBankAccountResultInternal {
        public static final Cancelled INSTANCE = new Cancelled();
        public static final Parcelable.Creator<Cancelled> CREATOR = new Token.Creator(28);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancelled);
        }

        public final int hashCode() {
            return -338128877;
        }

        public final String toString() {
            return "Cancelled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Completed extends CollectBankAccountResultInternal {
        public static final Parcelable.Creator<Completed> CREATOR = new Token.Creator(29);
        public final CollectBankAccountResponseInternal response;

        public Completed(CollectBankAccountResponseInternal collectBankAccountResponseInternal) {
            collectBankAccountResponseInternal.getClass();
            this.response = collectBankAccountResponseInternal;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Completed) && Intrinsics.areEqual(this.response, ((Completed) obj).response);
        }

        public final int hashCode() {
            return this.response.hashCode();
        }

        public final String toString() {
            return "Completed(response=" + this.response + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.response.writeToParcel(parcel, i);
        }
    }

    public final class Failed extends CollectBankAccountResultInternal {
        public static final Parcelable.Creator<Failed> CREATOR = new AppInfo.Creator(1);
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
