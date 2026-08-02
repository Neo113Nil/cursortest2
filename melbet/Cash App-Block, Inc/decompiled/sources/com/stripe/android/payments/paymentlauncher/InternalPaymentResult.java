package com.stripe.android.payments.paymentlauncher;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.stripe3ds2.init.AppInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class InternalPaymentResult implements Parcelable {

    public final class Canceled extends InternalPaymentResult {
        public static final Canceled INSTANCE = new Canceled();
        public static final Parcelable.Creator<Canceled> CREATOR = new AppInfo.Creator(3);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Completed extends InternalPaymentResult {
        public static final Parcelable.Creator<Completed> CREATOR = new AppInfo.Creator(4);
        public final StripeIntent intent;

        public Completed(StripeIntent stripeIntent) {
            stripeIntent.getClass();
            this.intent = stripeIntent;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Completed) && Intrinsics.areEqual(this.intent, ((Completed) obj).intent);
        }

        public final int hashCode() {
            return this.intent.hashCode();
        }

        public final String toString() {
            return "Completed(intent=" + this.intent + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.intent, i);
        }
    }

    public final class Failed extends InternalPaymentResult {
        public static final Parcelable.Creator<Failed> CREATOR = new AppInfo.Creator(5);
        public final Throwable throwable;

        public Failed(Throwable th) {
            th.getClass();
            this.throwable = th;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.throwable);
        }
    }
}
