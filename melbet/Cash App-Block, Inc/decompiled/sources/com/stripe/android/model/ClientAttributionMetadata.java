package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.model.Card;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ClientAttributionMetadata implements Parcelable {
    public static final Parcelable.Creator<ClientAttributionMetadata> CREATOR = new Card.Creator(9);
    public final String checkoutSessionId;
    public final String elementsSessionConfigId;
    public final PaymentIntentCreationFlow paymentIntentCreationFlow;
    public final PaymentMethodSelectionFlow paymentMethodSelectionFlow;
    public final String stripeSdkVersion;

    public ClientAttributionMetadata(String str, PaymentIntentCreationFlow paymentIntentCreationFlow, PaymentMethodSelectionFlow paymentMethodSelectionFlow, String str2, String str3) {
        str3.getClass();
        this.elementsSessionConfigId = str;
        this.paymentIntentCreationFlow = paymentIntentCreationFlow;
        this.paymentMethodSelectionFlow = paymentMethodSelectionFlow;
        this.checkoutSessionId = str2;
        this.stripeSdkVersion = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientAttributionMetadata)) {
            return false;
        }
        ClientAttributionMetadata clientAttributionMetadata = (ClientAttributionMetadata) obj;
        return Intrinsics.areEqual(this.elementsSessionConfigId, clientAttributionMetadata.elementsSessionConfigId) && this.paymentIntentCreationFlow == clientAttributionMetadata.paymentIntentCreationFlow && this.paymentMethodSelectionFlow == clientAttributionMetadata.paymentMethodSelectionFlow && Intrinsics.areEqual(this.checkoutSessionId, clientAttributionMetadata.checkoutSessionId) && Intrinsics.areEqual(this.stripeSdkVersion, clientAttributionMetadata.stripeSdkVersion);
    }

    public final int hashCode() {
        String str = this.elementsSessionConfigId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PaymentIntentCreationFlow paymentIntentCreationFlow = this.paymentIntentCreationFlow;
        int hashCode2 = (hashCode + (paymentIntentCreationFlow == null ? 0 : paymentIntentCreationFlow.hashCode())) * 31;
        PaymentMethodSelectionFlow paymentMethodSelectionFlow = this.paymentMethodSelectionFlow;
        int hashCode3 = (hashCode2 + (paymentMethodSelectionFlow == null ? 0 : paymentMethodSelectionFlow.hashCode())) * 31;
        String str2 = this.checkoutSessionId;
        return this.stripeSdkVersion.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final Map toParamMap() {
        Pair pair = new Pair("merchant_integration_source", "elements");
        Pair pair2 = new Pair("merchant_integration_subtype", "mobile");
        Pair pair3 = new Pair("merchant_integration_version", Recorder$$ExternalSyntheticOutline2.m("stripe-android/", this.stripeSdkVersion));
        UUID uuid = AnalyticsRequestFactory.sessionId;
        Map mapOf = MapsKt__MapsKt.mapOf(pair, pair2, pair3, new Pair("client_session_id", AnalyticsRequestFactory.sessionId.toString()));
        PaymentMethodSelectionFlow paymentMethodSelectionFlow = this.paymentMethodSelectionFlow;
        Map m = paymentMethodSelectionFlow != null ? Thread$State$EnumUnboxingLocalUtility.m("payment_method_selection_flow", paymentMethodSelectionFlow.paramValue) : null;
        if (m == null) {
            m = EmptyMap.INSTANCE;
            m.getClass();
        }
        LinkedHashMap plus = MapsKt__MapsKt.plus(mapOf, m);
        PaymentIntentCreationFlow paymentIntentCreationFlow = this.paymentIntentCreationFlow;
        Map m2 = paymentIntentCreationFlow != null ? Thread$State$EnumUnboxingLocalUtility.m("payment_intent_creation_flow", paymentIntentCreationFlow.paramValue) : null;
        if (m2 == null) {
            m2 = EmptyMap.INSTANCE;
            m2.getClass();
        }
        LinkedHashMap plus2 = MapsKt__MapsKt.plus(plus, m2);
        String str = this.elementsSessionConfigId;
        Map m3 = str != null ? Thread$State$EnumUnboxingLocalUtility.m("elements_session_config_id", str) : null;
        if (m3 == null) {
            m3 = EmptyMap.INSTANCE;
            m3.getClass();
        }
        LinkedHashMap plus3 = MapsKt__MapsKt.plus(plus2, m3);
        String str2 = this.checkoutSessionId;
        Map m4 = str2 != null ? Thread$State$EnumUnboxingLocalUtility.m("checkout_session_id", str2) : null;
        if (m4 == null) {
            m4 = EmptyMap.INSTANCE;
            m4.getClass();
        }
        return MapsKt__MapsKt.plus(plus3, m4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientAttributionMetadata(elementsSessionConfigId=");
        sb.append(this.elementsSessionConfigId);
        sb.append(", paymentIntentCreationFlow=");
        sb.append(this.paymentIntentCreationFlow);
        sb.append(", paymentMethodSelectionFlow=");
        sb.append(this.paymentMethodSelectionFlow);
        sb.append(", checkoutSessionId=");
        sb.append(this.checkoutSessionId);
        sb.append(", stripeSdkVersion=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.stripeSdkVersion, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.elementsSessionConfigId);
        PaymentIntentCreationFlow paymentIntentCreationFlow = this.paymentIntentCreationFlow;
        if (paymentIntentCreationFlow == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(paymentIntentCreationFlow.name());
        }
        PaymentMethodSelectionFlow paymentMethodSelectionFlow = this.paymentMethodSelectionFlow;
        if (paymentMethodSelectionFlow == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(paymentMethodSelectionFlow.name());
        }
        parcel.writeString(this.checkoutSessionId);
        parcel.writeString(this.stripeSdkVersion);
    }
}
