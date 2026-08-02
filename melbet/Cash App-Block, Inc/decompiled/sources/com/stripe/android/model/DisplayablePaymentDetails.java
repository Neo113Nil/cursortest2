package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.PaymentIntent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes8.dex */
public final class DisplayablePaymentDetails implements StripeModel {
    public final String defaultCardBrand;
    public final String defaultPaymentType;
    public final String last4;
    public final Long numberOfSavedPaymentDetails;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<DisplayablePaymentDetails> CREATOR = new PaymentIntent.Creator(3);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/model/DisplayablePaymentDetails$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/DisplayablePaymentDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return DisplayablePaymentDetails$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DisplayablePaymentDetails(int i, String str, String str2, String str3, Long l) {
        if ((i & 1) == 0) {
            this.defaultCardBrand = null;
        } else {
            this.defaultCardBrand = str;
        }
        if ((i & 2) == 0) {
            this.defaultPaymentType = null;
        } else {
            this.defaultPaymentType = str2;
        }
        if ((i & 4) == 0) {
            this.last4 = null;
        } else {
            this.last4 = str3;
        }
        if ((i & 8) == 0) {
            this.numberOfSavedPaymentDetails = null;
        } else {
            this.numberOfSavedPaymentDetails = l;
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
        if (!(obj instanceof DisplayablePaymentDetails)) {
            return false;
        }
        DisplayablePaymentDetails displayablePaymentDetails = (DisplayablePaymentDetails) obj;
        return Intrinsics.areEqual(this.defaultCardBrand, displayablePaymentDetails.defaultCardBrand) && Intrinsics.areEqual(this.defaultPaymentType, displayablePaymentDetails.defaultPaymentType) && Intrinsics.areEqual(this.last4, displayablePaymentDetails.last4) && Intrinsics.areEqual(this.numberOfSavedPaymentDetails, displayablePaymentDetails.numberOfSavedPaymentDetails);
    }

    public final int hashCode() {
        String str = this.defaultCardBrand;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.defaultPaymentType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.last4;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.numberOfSavedPaymentDetails;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisplayablePaymentDetails(defaultCardBrand=", this.defaultCardBrand, ", defaultPaymentType=", this.defaultPaymentType, ", last4=");
        m.append(this.last4);
        m.append(", numberOfSavedPaymentDetails=");
        m.append(this.numberOfSavedPaymentDetails);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.defaultCardBrand);
        parcel.writeString(this.defaultPaymentType);
        parcel.writeString(this.last4);
        Long l = this.numberOfSavedPaymentDetails;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
        }
    }

    public DisplayablePaymentDetails(String str, String str2, String str3, Long l) {
        this.defaultCardBrand = str;
        this.defaultPaymentType = str2;
        this.last4 = str3;
        this.numberOfSavedPaymentDetails = l;
    }
}
