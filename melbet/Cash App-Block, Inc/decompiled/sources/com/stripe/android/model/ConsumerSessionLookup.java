package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.Card;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class ConsumerSessionLookup implements StripeModel {
    public final ConsentUi consentUi;
    public final ConsumerSession consumerSession;
    public final DisplayablePaymentDetails displayablePaymentDetails;
    public final String errorMessage;
    public final boolean exists;
    public final LinkBrand linkBrand;
    public final String publishableKey;
    public final String suggestedEmail;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ConsumerSessionLookup> CREATOR = new Card.Creator(29);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/model/ConsumerSessionLookup$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/ConsumerSessionLookup;", "serializer", "()Lkotlinx/serialization/KSerializer;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ConsumerSessionLookup$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConsumerSessionLookup(int i, boolean z, ConsumerSession consumerSession, String str, String str2, DisplayablePaymentDetails displayablePaymentDetails, ConsentUi consentUi, String str3, LinkBrand linkBrand) {
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, ConsumerSessionLookup$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.exists = z;
        if ((i & 2) == 0) {
            this.consumerSession = null;
        } else {
            this.consumerSession = consumerSession;
        }
        if ((i & 4) == 0) {
            this.errorMessage = null;
        } else {
            this.errorMessage = str;
        }
        if ((i & 8) == 0) {
            this.publishableKey = null;
        } else {
            this.publishableKey = str2;
        }
        if ((i & 16) == 0) {
            this.displayablePaymentDetails = null;
        } else {
            this.displayablePaymentDetails = displayablePaymentDetails;
        }
        if ((i & 32) == 0) {
            this.consentUi = null;
        } else {
            this.consentUi = consentUi;
        }
        if ((i & 64) == 0) {
            this.suggestedEmail = null;
        } else {
            this.suggestedEmail = str3;
        }
        if ((i & 128) == 0) {
            this.linkBrand = null;
        } else {
            this.linkBrand = linkBrand;
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
        if (!(obj instanceof ConsumerSessionLookup)) {
            return false;
        }
        ConsumerSessionLookup consumerSessionLookup = (ConsumerSessionLookup) obj;
        return this.exists == consumerSessionLookup.exists && Intrinsics.areEqual(this.consumerSession, consumerSessionLookup.consumerSession) && Intrinsics.areEqual(this.errorMessage, consumerSessionLookup.errorMessage) && Intrinsics.areEqual(this.publishableKey, consumerSessionLookup.publishableKey) && Intrinsics.areEqual(this.displayablePaymentDetails, consumerSessionLookup.displayablePaymentDetails) && Intrinsics.areEqual(this.consentUi, consumerSessionLookup.consentUi) && Intrinsics.areEqual(this.suggestedEmail, consumerSessionLookup.suggestedEmail) && this.linkBrand == consumerSessionLookup.linkBrand;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.exists) * 31;
        ConsumerSession consumerSession = this.consumerSession;
        int hashCode2 = (hashCode + (consumerSession == null ? 0 : consumerSession.hashCode())) * 31;
        String str = this.errorMessage;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.publishableKey;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DisplayablePaymentDetails displayablePaymentDetails = this.displayablePaymentDetails;
        int hashCode5 = (hashCode4 + (displayablePaymentDetails == null ? 0 : displayablePaymentDetails.hashCode())) * 31;
        ConsentUi consentUi = this.consentUi;
        int hashCode6 = (hashCode5 + (consentUi == null ? 0 : consentUi.hashCode())) * 31;
        String str3 = this.suggestedEmail;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LinkBrand linkBrand = this.linkBrand;
        return hashCode7 + (linkBrand != null ? linkBrand.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsumerSessionLookup(exists=");
        sb.append(this.exists);
        sb.append(", consumerSession=");
        sb.append(this.consumerSession);
        sb.append(", errorMessage=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.errorMessage, ", publishableKey=", this.publishableKey, ", displayablePaymentDetails=");
        sb.append(this.displayablePaymentDetails);
        sb.append(", consentUi=");
        sb.append(this.consentUi);
        sb.append(", suggestedEmail=");
        sb.append(this.suggestedEmail);
        sb.append(", linkBrand=");
        sb.append(this.linkBrand);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.exists ? 1 : 0);
        ConsumerSession consumerSession = this.consumerSession;
        if (consumerSession == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            consumerSession.writeToParcel(parcel, i);
        }
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.publishableKey);
        DisplayablePaymentDetails displayablePaymentDetails = this.displayablePaymentDetails;
        if (displayablePaymentDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayablePaymentDetails.writeToParcel(parcel, i);
        }
        ConsentUi consentUi = this.consentUi;
        if (consentUi == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            consentUi.writeToParcel(parcel, i);
        }
        parcel.writeString(this.suggestedEmail);
        LinkBrand linkBrand = this.linkBrand;
        if (linkBrand == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(linkBrand.name());
        }
    }

    public ConsumerSessionLookup(boolean z, ConsumerSession consumerSession, String str, String str2, DisplayablePaymentDetails displayablePaymentDetails, ConsentUi consentUi, String str3, LinkBrand linkBrand) {
        this.exists = z;
        this.consumerSession = consumerSession;
        this.errorMessage = str;
        this.publishableKey = str2;
        this.displayablePaymentDetails = displayablePaymentDetails;
        this.consentUi = consentUi;
        this.suggestedEmail = str3;
        this.linkBrand = linkBrand;
    }
}
