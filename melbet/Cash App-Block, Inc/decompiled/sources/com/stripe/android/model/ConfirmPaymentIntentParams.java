package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.stripe.android.model.Card;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ConfirmPaymentIntentParams implements ConfirmStripeIntentParams {
    public static final Parcelable.Creator<ConfirmPaymentIntentParams> CREATOR = new Card.Creator(10);
    public final ClientAttributionMetadata clientAttributionMetadata;
    public final String clientSecret;
    public final String confirmationTokenId;
    public final MandateDataParams mandateData;
    public final String mandateId;
    public final String paymentMethodCode;
    public final PaymentMethodCreateParams paymentMethodCreateParams;
    public final String paymentMethodId;
    public final PaymentMethodOptionsParams$Card paymentMethodOptions;
    public final RadarOptions radarOptions;
    public final String receiptEmail;
    public String returnUrl;
    public final Boolean savePaymentMethod;
    public final Boolean setAsDefaultPaymentMethod;
    public final SetupFutureUsage setupFutureUsage;
    public final Shipping shipping;
    public final String sourceId;
    public final SourceParams sourceParams;
    public final boolean useStripeSdk;

    public enum SetupFutureUsage {
        /* JADX INFO: Fake field, exist only in values array */
        OnSession("on_session"),
        /* JADX INFO: Fake field, exist only in values array */
        OffSession("off_session"),
        /* JADX INFO: Fake field, exist only in values array */
        Blank(""),
        /* JADX INFO: Fake field, exist only in values array */
        None("none");

        public final String code;

        SetupFutureUsage(String str) {
            this.code = str;
        }
    }

    public final class Shipping implements Parcelable {
        public static final Parcelable.Creator<Shipping> CREATOR = new Card.Creator(11);
        public final Address address;
        public final String carrier;
        public final String name;
        public final String phone;
        public final String trackingNumber;

        public Shipping(Address address, String str, String str2, String str3, String str4) {
            address.getClass();
            str.getClass();
            this.address = address;
            this.name = str;
            this.carrier = str2;
            this.phone = str3;
            this.trackingNumber = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Shipping)) {
                return false;
            }
            Shipping shipping = (Shipping) obj;
            return Intrinsics.areEqual(this.address, shipping.address) && Intrinsics.areEqual(this.name, shipping.name) && Intrinsics.areEqual(this.carrier, shipping.carrier) && Intrinsics.areEqual(this.phone, shipping.phone) && Intrinsics.areEqual(this.trackingNumber, shipping.trackingNumber);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.address.hashCode() * 31, 31, this.name);
            String str = this.carrier;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.phone;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.trackingNumber;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Shipping(address=");
            sb.append(this.address);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", carrier=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.carrier, ", phone=", this.phone, ", trackingNumber=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.trackingNumber, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.address.writeToParcel(parcel, i);
            parcel.writeString(this.name);
            parcel.writeString(this.carrier);
            parcel.writeString(this.phone);
            parcel.writeString(this.trackingNumber);
        }
    }

    public ConfirmPaymentIntentParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Boolean bool, PaymentMethodOptionsParams$Card paymentMethodOptionsParams$Card, String str3, int i) {
        this((i & 1) != 0 ? null : paymentMethodCreateParams, (i & 2) != 0 ? null : str, null, null, str2, null, bool, (i & 128) == 0, paymentMethodOptionsParams$Card, null, null, null, null, null, null, str3, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmPaymentIntentParams)) {
            return false;
        }
        ConfirmPaymentIntentParams confirmPaymentIntentParams = (ConfirmPaymentIntentParams) obj;
        return Intrinsics.areEqual(this.paymentMethodCreateParams, confirmPaymentIntentParams.paymentMethodCreateParams) && Intrinsics.areEqual(this.paymentMethodId, confirmPaymentIntentParams.paymentMethodId) && Intrinsics.areEqual(this.sourceParams, confirmPaymentIntentParams.sourceParams) && Intrinsics.areEqual(this.sourceId, confirmPaymentIntentParams.sourceId) && Intrinsics.areEqual(this.clientSecret, confirmPaymentIntentParams.clientSecret) && Intrinsics.areEqual(this.returnUrl, confirmPaymentIntentParams.returnUrl) && Intrinsics.areEqual(this.savePaymentMethod, confirmPaymentIntentParams.savePaymentMethod) && this.useStripeSdk == confirmPaymentIntentParams.useStripeSdk && Intrinsics.areEqual(this.paymentMethodOptions, confirmPaymentIntentParams.paymentMethodOptions) && Intrinsics.areEqual(this.mandateId, confirmPaymentIntentParams.mandateId) && Intrinsics.areEqual(this.mandateData, confirmPaymentIntentParams.mandateData) && this.setupFutureUsage == confirmPaymentIntentParams.setupFutureUsage && Intrinsics.areEqual(this.shipping, confirmPaymentIntentParams.shipping) && Intrinsics.areEqual(this.receiptEmail, confirmPaymentIntentParams.receiptEmail) && Intrinsics.areEqual(this.setAsDefaultPaymentMethod, confirmPaymentIntentParams.setAsDefaultPaymentMethod) && Intrinsics.areEqual(this.paymentMethodCode, confirmPaymentIntentParams.paymentMethodCode) && Intrinsics.areEqual(this.radarOptions, confirmPaymentIntentParams.radarOptions) && Intrinsics.areEqual(this.clientAttributionMetadata, confirmPaymentIntentParams.clientAttributionMetadata) && Intrinsics.areEqual(this.confirmationTokenId, confirmPaymentIntentParams.confirmationTokenId);
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public final String getClientSecret() {
        return this.clientSecret;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final int hashCode() {
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        int hashCode = (paymentMethodCreateParams == null ? 0 : paymentMethodCreateParams.hashCode()) * 31;
        String str = this.paymentMethodId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SourceParams sourceParams = this.sourceParams;
        int hashCode3 = (hashCode2 + (sourceParams == null ? 0 : sourceParams.hashCode())) * 31;
        String str2 = this.sourceId;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.clientSecret);
        String str3 = this.returnUrl;
        int hashCode4 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.savePaymentMethod;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.useStripeSdk);
        PaymentMethodOptionsParams$Card paymentMethodOptionsParams$Card = this.paymentMethodOptions;
        int hashCode5 = (m2 + (paymentMethodOptionsParams$Card == null ? 0 : paymentMethodOptionsParams$Card.hashCode())) * 31;
        String str4 = this.mandateId;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MandateDataParams mandateDataParams = this.mandateData;
        int hashCode7 = (hashCode6 + (mandateDataParams == null ? 0 : mandateDataParams.f1438type.hashCode())) * 31;
        SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
        int hashCode8 = (hashCode7 + (setupFutureUsage == null ? 0 : setupFutureUsage.hashCode())) * 31;
        Shipping shipping = this.shipping;
        int hashCode9 = (hashCode8 + (shipping == null ? 0 : shipping.hashCode())) * 31;
        String str5 = this.receiptEmail;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.setAsDefaultPaymentMethod;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.paymentMethodCode;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        RadarOptions radarOptions = this.radarOptions;
        int hashCode13 = (hashCode12 + (radarOptions == null ? 0 : radarOptions.hashCode())) * 31;
        ClientAttributionMetadata clientAttributionMetadata = this.clientAttributionMetadata;
        int hashCode14 = (hashCode13 + (clientAttributionMetadata == null ? 0 : clientAttributionMetadata.hashCode())) * 31;
        String str7 = this.confirmationTokenId;
        return hashCode14 + (str7 != null ? str7.hashCode() : 0);
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public final void setReturnUrl(String str) {
        this.returnUrl = str;
    }

    public final String toString() {
        String str = this.returnUrl;
        StringBuilder sb = new StringBuilder("ConfirmPaymentIntentParams(paymentMethodCreateParams=");
        sb.append(this.paymentMethodCreateParams);
        sb.append(", paymentMethodId=");
        sb.append(this.paymentMethodId);
        sb.append(", sourceParams=");
        sb.append(this.sourceParams);
        sb.append(", sourceId=");
        sb.append(this.sourceId);
        sb.append(", clientSecret=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.clientSecret, ", returnUrl=", str, ", savePaymentMethod=");
        sb.append(this.savePaymentMethod);
        sb.append(", useStripeSdk=");
        sb.append(this.useStripeSdk);
        sb.append(", paymentMethodOptions=");
        sb.append(this.paymentMethodOptions);
        sb.append(", mandateId=");
        sb.append(this.mandateId);
        sb.append(", mandateData=");
        sb.append(this.mandateData);
        sb.append(", setupFutureUsage=");
        sb.append(this.setupFutureUsage);
        sb.append(", shipping=");
        sb.append(this.shipping);
        sb.append(", receiptEmail=");
        sb.append(this.receiptEmail);
        sb.append(", setAsDefaultPaymentMethod=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.setAsDefaultPaymentMethod, ", paymentMethodCode=", this.paymentMethodCode, ", radarOptions=");
        sb.append(this.radarOptions);
        sb.append(", clientAttributionMetadata=");
        sb.append(this.clientAttributionMetadata);
        sb.append(", confirmationTokenId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.confirmationTokenId, ")");
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public final ConfirmPaymentIntentParams withShouldUseStripeSdk() {
        String str = this.returnUrl;
        String str2 = this.clientSecret;
        str2.getClass();
        return new ConfirmPaymentIntentParams(this.paymentMethodCreateParams, this.paymentMethodId, this.sourceParams, this.sourceId, str2, str, this.savePaymentMethod, true, this.paymentMethodOptions, this.mandateId, this.mandateData, this.setupFutureUsage, this.shipping, this.receiptEmail, this.setAsDefaultPaymentMethod, this.paymentMethodCode, this.radarOptions, this.clientAttributionMetadata, this.confirmationTokenId);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethodCreateParams.writeToParcel(parcel, i);
        }
        parcel.writeString(this.paymentMethodId);
        SourceParams sourceParams = this.sourceParams;
        if (sourceParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sourceParams.writeToParcel(parcel, i);
        }
        parcel.writeString(this.sourceId);
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.returnUrl);
        Boolean bool = this.savePaymentMethod;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
        }
        parcel.writeInt(this.useStripeSdk ? 1 : 0);
        parcel.writeParcelable(this.paymentMethodOptions, i);
        parcel.writeString(this.mandateId);
        MandateDataParams mandateDataParams = this.mandateData;
        if (mandateDataParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(mandateDataParams.f1438type, i);
        }
        SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
        if (setupFutureUsage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(setupFutureUsage.name());
        }
        Shipping shipping = this.shipping;
        if (shipping == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shipping.writeToParcel(parcel, i);
        }
        parcel.writeString(this.receiptEmail);
        Boolean bool2 = this.setAsDefaultPaymentMethod;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool2);
        }
        parcel.writeString(this.paymentMethodCode);
        RadarOptions radarOptions = this.radarOptions;
        if (radarOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            radarOptions.writeToParcel(parcel, i);
        }
        ClientAttributionMetadata clientAttributionMetadata = this.clientAttributionMetadata;
        if (clientAttributionMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clientAttributionMetadata.writeToParcel(parcel, i);
        }
        parcel.writeString(this.confirmationTokenId);
    }

    public ConfirmPaymentIntentParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, SourceParams sourceParams, String str2, String str3, String str4, Boolean bool, boolean z, PaymentMethodOptionsParams$Card paymentMethodOptionsParams$Card, String str5, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, String str6, Boolean bool2, String str7, RadarOptions radarOptions, ClientAttributionMetadata clientAttributionMetadata, String str8) {
        str3.getClass();
        this.paymentMethodCreateParams = paymentMethodCreateParams;
        this.paymentMethodId = str;
        this.sourceParams = sourceParams;
        this.sourceId = str2;
        this.clientSecret = str3;
        this.returnUrl = str4;
        this.savePaymentMethod = bool;
        this.useStripeSdk = z;
        this.paymentMethodOptions = paymentMethodOptionsParams$Card;
        this.mandateId = str5;
        this.mandateData = mandateDataParams;
        this.setupFutureUsage = setupFutureUsage;
        this.shipping = shipping;
        this.receiptEmail = str6;
        this.setAsDefaultPaymentMethod = bool2;
        this.paymentMethodCode = str7;
        this.radarOptions = radarOptions;
        this.clientAttributionMetadata = clientAttributionMetadata;
        this.confirmationTokenId = str8;
    }
}
