package com.stripe.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.SetupIntentResult;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes8.dex */
public final class PaymentConfiguration implements Parcelable {
    public static final Parcelable.Creator<PaymentConfiguration> CREATOR = new SetupIntentResult.Creator(15);
    public static PaymentConfiguration instance;
    public final String publishableKey;
    public final String stripeAccountId;

    /* loaded from: classes9.dex */
    public final class Store {
        public static final String NAME = PaymentConfiguration.class.getCanonicalName();
        public final SharedPreferences prefs;

        public Store(Context context) {
            context.getClass();
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(NAME, 0);
            sharedPreferences.getClass();
            this.prefs = sharedPreferences;
        }
    }

    public PaymentConfiguration(String str, String str2) {
        str.getClass();
        this.publishableKey = str;
        this.stripeAccountId = str2;
        if (StringsKt.isBlank(str)) {
            a$$ExternalSyntheticBUOutline0.m$3("Invalid Publishable Key: You must use a valid Stripe API key to make a Stripe API request. For more info, see https://stripe.com/docs/keys");
            throw null;
        }
        if (StringsKt__StringsJVMKt.startsWith(str, "sk_", false)) {
            a$$ExternalSyntheticBUOutline0.m$3("Invalid Publishable Key: You are using a secret key instead of a publishable one. For more info, see https://stripe.com/docs/keys");
            throw null;
        }
        if (StringsKt__StringsJVMKt.startsWith(str, "rk_", false)) {
            a$$ExternalSyntheticBUOutline0.m$3("Invalid Publishable Key: You are using a restricted key instead of a publishable one. For more info, see https://stripe.com/docs/keys");
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
        if (!(obj instanceof PaymentConfiguration)) {
            return false;
        }
        PaymentConfiguration paymentConfiguration = (PaymentConfiguration) obj;
        return Intrinsics.areEqual(this.publishableKey, paymentConfiguration.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, paymentConfiguration.stripeAccountId);
    }

    public final int hashCode() {
        int hashCode = this.publishableKey.hashCode() * 31;
        String str = this.stripeAccountId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("PaymentConfiguration(publishableKey=", this.publishableKey, ", stripeAccountId=", this.stripeAccountId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.publishableKey);
        parcel.writeString(this.stripeAccountId);
    }
}
