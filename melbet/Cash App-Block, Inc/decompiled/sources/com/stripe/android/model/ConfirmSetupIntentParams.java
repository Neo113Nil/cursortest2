package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.model.Card;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ConfirmSetupIntentParams implements ConfirmStripeIntentParams {
    public static final Parcelable.Creator<ConfirmSetupIntentParams> CREATOR = new Card.Creator(12);
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
    public String returnUrl;
    public final Boolean setAsDefaultPaymentMethod;
    public final boolean useStripeSdk;

    public ConfirmSetupIntentParams(String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams, String str3, boolean z, String str4, MandateDataParams mandateDataParams, Boolean bool, String str5, PaymentMethodOptionsParams$Card paymentMethodOptionsParams$Card, RadarOptions radarOptions, ClientAttributionMetadata clientAttributionMetadata, String str6, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : paymentMethodCreateParams, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : mandateDataParams, (i & 128) != 0 ? null : bool, str5, (i & 512) != 0 ? null : paymentMethodOptionsParams$Card, (i & 1024) != 0 ? null : radarOptions, (i & 2048) != 0 ? null : clientAttributionMetadata, (i & 4096) != 0 ? null : str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmSetupIntentParams)) {
            return false;
        }
        ConfirmSetupIntentParams confirmSetupIntentParams = (ConfirmSetupIntentParams) obj;
        return Intrinsics.areEqual(this.clientSecret, confirmSetupIntentParams.clientSecret) && Intrinsics.areEqual(this.paymentMethodId, confirmSetupIntentParams.paymentMethodId) && Intrinsics.areEqual(this.paymentMethodCreateParams, confirmSetupIntentParams.paymentMethodCreateParams) && Intrinsics.areEqual(this.returnUrl, confirmSetupIntentParams.returnUrl) && this.useStripeSdk == confirmSetupIntentParams.useStripeSdk && Intrinsics.areEqual(this.mandateId, confirmSetupIntentParams.mandateId) && Intrinsics.areEqual(this.mandateData, confirmSetupIntentParams.mandateData) && Intrinsics.areEqual(this.setAsDefaultPaymentMethod, confirmSetupIntentParams.setAsDefaultPaymentMethod) && Intrinsics.areEqual(this.paymentMethodCode, confirmSetupIntentParams.paymentMethodCode) && Intrinsics.areEqual(this.paymentMethodOptions, confirmSetupIntentParams.paymentMethodOptions) && Intrinsics.areEqual(this.radarOptions, confirmSetupIntentParams.radarOptions) && Intrinsics.areEqual(this.clientAttributionMetadata, confirmSetupIntentParams.clientAttributionMetadata) && Intrinsics.areEqual(this.confirmationTokenId, confirmSetupIntentParams.confirmationTokenId);
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public final /* synthetic */ String getClientSecret() {
        return this.clientSecret;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final int hashCode() {
        int hashCode = this.clientSecret.hashCode() * 31;
        String str = this.paymentMethodId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        int hashCode3 = (hashCode2 + (paymentMethodCreateParams == null ? 0 : paymentMethodCreateParams.hashCode())) * 31;
        String str2 = this.returnUrl;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.useStripeSdk);
        String str3 = this.mandateId;
        int hashCode4 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
        MandateDataParams mandateDataParams = this.mandateData;
        int hashCode5 = (hashCode4 + (mandateDataParams == null ? 0 : mandateDataParams.f1438type.hashCode())) * 31;
        Boolean bool = this.setAsDefaultPaymentMethod;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.paymentMethodCode;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PaymentMethodOptionsParams$Card paymentMethodOptionsParams$Card = this.paymentMethodOptions;
        int hashCode8 = (hashCode7 + (paymentMethodOptionsParams$Card == null ? 0 : paymentMethodOptionsParams$Card.hashCode())) * 31;
        RadarOptions radarOptions = this.radarOptions;
        int hashCode9 = (hashCode8 + (radarOptions == null ? 0 : radarOptions.hashCode())) * 31;
        ClientAttributionMetadata clientAttributionMetadata = this.clientAttributionMetadata;
        int hashCode10 = (hashCode9 + (clientAttributionMetadata == null ? 0 : clientAttributionMetadata.hashCode())) * 31;
        String str5 = this.confirmationTokenId;
        return hashCode10 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public final void setReturnUrl(String str) {
        this.returnUrl = str;
    }

    public final String toString() {
        String str = this.returnUrl;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConfirmSetupIntentParams(clientSecret=", this.clientSecret, ", paymentMethodId=", this.paymentMethodId, ", paymentMethodCreateParams=");
        m.append(this.paymentMethodCreateParams);
        m.append(", returnUrl=");
        m.append(str);
        m.append(", useStripeSdk=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.useStripeSdk, ", mandateId=", this.mandateId, ", mandateData=");
        m.append(this.mandateData);
        m.append(", setAsDefaultPaymentMethod=");
        m.append(this.setAsDefaultPaymentMethod);
        m.append(", paymentMethodCode=");
        m.append(this.paymentMethodCode);
        m.append(", paymentMethodOptions=");
        m.append(this.paymentMethodOptions);
        m.append(", radarOptions=");
        m.append(this.radarOptions);
        m.append(", clientAttributionMetadata=");
        m.append(this.clientAttributionMetadata);
        m.append(", confirmationTokenId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.confirmationTokenId, ")");
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public final ConfirmSetupIntentParams withShouldUseStripeSdk() {
        String str = this.returnUrl;
        String str2 = this.clientSecret;
        str2.getClass();
        return new ConfirmSetupIntentParams(str2, this.paymentMethodId, this.paymentMethodCreateParams, str, true, this.mandateId, this.mandateData, this.setAsDefaultPaymentMethod, this.paymentMethodCode, null, this.radarOptions, this.clientAttributionMetadata, this.confirmationTokenId, 512);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.paymentMethodId);
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethodCreateParams.writeToParcel(parcel, i);
        }
        parcel.writeString(this.returnUrl);
        parcel.writeInt(this.useStripeSdk ? 1 : 0);
        parcel.writeString(this.mandateId);
        MandateDataParams mandateDataParams = this.mandateData;
        if (mandateDataParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(mandateDataParams.f1438type, i);
        }
        Boolean bool = this.setAsDefaultPaymentMethod;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
        }
        parcel.writeString(this.paymentMethodCode);
        parcel.writeParcelable(this.paymentMethodOptions, i);
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

    public ConfirmSetupIntentParams(String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams, String str3, boolean z, String str4, MandateDataParams mandateDataParams, Boolean bool, String str5, PaymentMethodOptionsParams$Card paymentMethodOptionsParams$Card, RadarOptions radarOptions, ClientAttributionMetadata clientAttributionMetadata, String str6) {
        str.getClass();
        this.clientSecret = str;
        this.paymentMethodId = str2;
        this.paymentMethodCreateParams = paymentMethodCreateParams;
        this.returnUrl = str3;
        this.useStripeSdk = z;
        this.mandateId = str4;
        this.mandateData = mandateDataParams;
        this.setAsDefaultPaymentMethod = bool;
        this.paymentMethodCode = str5;
        this.paymentMethodOptions = paymentMethodOptionsParams$Card;
        this.radarOptions = radarOptions;
        this.clientAttributionMetadata = clientAttributionMetadata;
        this.confirmationTokenId = str6;
    }
}
