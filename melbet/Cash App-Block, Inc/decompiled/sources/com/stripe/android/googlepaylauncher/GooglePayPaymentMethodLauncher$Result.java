package com.stripe.android.googlepaylauncher;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.googlepaylauncher.GooglePayLauncher$Config;
import com.stripe.android.model.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class GooglePayPaymentMethodLauncher$Result implements Parcelable {

    public final class Canceled extends GooglePayPaymentMethodLauncher$Result {
        public static final Canceled INSTANCE = new Canceled();
        public static final Parcelable.Creator<Canceled> CREATOR = new GooglePayLauncher$Config.Creator(9);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Canceled);
        }

        public final int hashCode() {
            return -299418266;
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

    public final class Completed extends GooglePayPaymentMethodLauncher$Result {
        public static final Parcelable.Creator<Completed> CREATOR = new GooglePayLauncher$Config.Creator(10);
        public final PaymentMethod paymentMethod;

        public Completed(PaymentMethod paymentMethod) {
            paymentMethod.getClass();
            this.paymentMethod = paymentMethod;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Completed) && Intrinsics.areEqual(this.paymentMethod, ((Completed) obj).paymentMethod);
        }

        public final int hashCode() {
            return this.paymentMethod.hashCode();
        }

        public final String toString() {
            return "Completed(paymentMethod=" + this.paymentMethod + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.paymentMethod.writeToParcel(parcel, i);
        }
    }

    public final class Failed extends GooglePayPaymentMethodLauncher$Result {
        public static final Parcelable.Creator<Failed> CREATOR = new GooglePayLauncher$Config.Creator(11);
        public final Throwable error;
        public final int errorCode;

        public Failed(Throwable th, int i) {
            th.getClass();
            this.error = th;
            this.errorCode = i;
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
            return Intrinsics.areEqual(this.error, failed.error) && this.errorCode == failed.errorCode;
        }

        public final int hashCode() {
            return (this.error.hashCode() * 31) + this.errorCode;
        }

        public final String toString() {
            return "Failed(error=" + this.error + ", errorCode=" + this.errorCode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.error);
            parcel.writeInt(this.errorCode);
        }
    }
}
