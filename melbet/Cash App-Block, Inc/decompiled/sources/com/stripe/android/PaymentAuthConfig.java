package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.SetupIntentResult;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PaymentAuthConfig {
    public static final PaymentAuthConfig DEFAULT = new PaymentAuthConfig(new Stripe3ds2Config(5, new Stripe3ds2UiCustomization(new StripeUiCustomization())));
    public final Stripe3ds2Config stripe3ds2Config;

    public final class Stripe3ds2Config implements Parcelable {
        public static final Parcelable.Creator<Stripe3ds2Config> CREATOR = new SetupIntentResult.Creator(13);
        public final int timeout;
        public final Stripe3ds2UiCustomization uiCustomization;

        public Stripe3ds2Config(int i, Stripe3ds2UiCustomization stripe3ds2UiCustomization) {
            stripe3ds2UiCustomization.getClass();
            this.timeout = i;
            this.uiCustomization = stripe3ds2UiCustomization;
            if (i < 5 || i > 99) {
                a$$ExternalSyntheticBUOutline0.m$3("Timeout value must be between 5 and 99, inclusive");
                throw null;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Stripe3ds2Config)) {
                return false;
            }
            Stripe3ds2Config stripe3ds2Config = (Stripe3ds2Config) obj;
            return this.timeout == stripe3ds2Config.timeout && Intrinsics.areEqual(this.uiCustomization, stripe3ds2Config.uiCustomization);
        }

        public final int hashCode() {
            return this.uiCustomization.uiCustomization.hashCode() + (Integer.hashCode(this.timeout) * 31);
        }

        public final String toString() {
            return "Stripe3ds2Config(timeout=" + this.timeout + ", uiCustomization=" + this.uiCustomization + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.timeout);
            Stripe3ds2UiCustomization stripe3ds2UiCustomization = this.uiCustomization;
            stripe3ds2UiCustomization.getClass();
            parcel.writeParcelable(stripe3ds2UiCustomization.uiCustomization, i);
        }
    }

    public final class Stripe3ds2UiCustomization implements Parcelable {
        public static final Parcelable.Creator<Stripe3ds2UiCustomization> CREATOR = new SetupIntentResult.Creator(14);
        public final StripeUiCustomization uiCustomization;

        public Stripe3ds2UiCustomization(StripeUiCustomization stripeUiCustomization) {
            stripeUiCustomization.getClass();
            this.uiCustomization = stripeUiCustomization;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stripe3ds2UiCustomization) && Intrinsics.areEqual(this.uiCustomization, ((Stripe3ds2UiCustomization) obj).uiCustomization);
        }

        public final int hashCode() {
            return this.uiCustomization.hashCode();
        }

        public final String toString() {
            return "Stripe3ds2UiCustomization(uiCustomization=" + this.uiCustomization + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.uiCustomization, i);
        }
    }

    public PaymentAuthConfig(Stripe3ds2Config stripe3ds2Config) {
        this.stripe3ds2Config = stripe3ds2Config;
    }
}
