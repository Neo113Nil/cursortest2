package com.squareup.protos.cash.fiatly.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.personalization.api.v1.Personalization;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInput;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes.dex */
public final class InitiatePersonalizedPaymentRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiatePersonalizedPaymentRequest> CREATOR;
    public final String flow_token;
    public final InitiatePaymentRequest initiate_payment_request;
    public final Personalization personalization;
    public final PersonalizationInput personalization_input;

    static {
        InitiatePersonalizedPaymentRequest$Companion$ADAPTER$1 initiatePersonalizedPaymentRequest$Companion$ADAPTER$1 = new InitiatePersonalizedPaymentRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InitiatePersonalizedPaymentRequest.class), "type.googleapis.com/squareup.cash.fiatly.api.v1.InitiatePersonalizedPaymentRequest", Syntax.PROTO_2, null, "squareup/cash/fiatly/api/v1/personalized_payment.proto");
        ADAPTER = initiatePersonalizedPaymentRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(initiatePersonalizedPaymentRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiatePersonalizedPaymentRequest(InitiatePaymentRequest initiatePaymentRequest, Personalization personalization, String str, PersonalizationInput personalizationInput, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.initiate_payment_request = initiatePaymentRequest;
        this.personalization = personalization;
        this.flow_token = str;
        this.personalization_input = personalizationInput;
    }

    public static InitiatePersonalizedPaymentRequest copy$default(InitiatePersonalizedPaymentRequest initiatePersonalizedPaymentRequest, InitiatePaymentRequest initiatePaymentRequest, Personalization personalization, PersonalizationInput personalizationInput, ByteString byteString, int i) {
        if ((i & 2) != 0) {
            personalization = initiatePersonalizedPaymentRequest.personalization;
        }
        Personalization personalization2 = personalization;
        String str = initiatePersonalizedPaymentRequest.flow_token;
        if ((i & 8) != 0) {
            personalizationInput = initiatePersonalizedPaymentRequest.personalization_input;
        }
        PersonalizationInput personalizationInput2 = personalizationInput;
        if ((i & 16) != 0) {
            byteString = initiatePersonalizedPaymentRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        initiatePersonalizedPaymentRequest.getClass();
        byteString2.getClass();
        return new InitiatePersonalizedPaymentRequest(initiatePaymentRequest, personalization2, str, personalizationInput2, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiatePersonalizedPaymentRequest)) {
            return false;
        }
        InitiatePersonalizedPaymentRequest initiatePersonalizedPaymentRequest = (InitiatePersonalizedPaymentRequest) obj;
        return Intrinsics.areEqual(unknownFields(), initiatePersonalizedPaymentRequest.unknownFields()) && Intrinsics.areEqual(this.initiate_payment_request, initiatePersonalizedPaymentRequest.initiate_payment_request) && Intrinsics.areEqual(this.personalization, initiatePersonalizedPaymentRequest.personalization) && Intrinsics.areEqual(this.flow_token, initiatePersonalizedPaymentRequest.flow_token) && Intrinsics.areEqual(this.personalization_input, initiatePersonalizedPaymentRequest.personalization_input);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InitiatePaymentRequest initiatePaymentRequest = this.initiate_payment_request;
        int hashCode2 = (hashCode + (initiatePaymentRequest != null ? initiatePaymentRequest.hashCode() : 0)) * 37;
        Personalization personalization = this.personalization;
        int hashCode3 = (hashCode2 + (personalization != null ? personalization.hashCode() : 0)) * 37;
        String str = this.flow_token;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        PersonalizationInput personalizationInput = this.personalization_input;
        int hashCode5 = hashCode4 + (personalizationInput != null ? personalizationInput.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(6, false);
        builder.last_four_digits = this.initiate_payment_request;
        builder.expiration = this.personalization;
        builder.postal_code = this.flow_token;
        builder.ciphertext_ = this.personalization_input;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        InitiatePaymentRequest initiatePaymentRequest = this.initiate_payment_request;
        if (initiatePaymentRequest != null) {
            arrayList.add("initiate_payment_request=" + initiatePaymentRequest);
        }
        Personalization personalization = this.personalization;
        if (personalization != null) {
            arrayList.add("personalization=" + personalization);
        }
        String str = this.flow_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "flow_token=", arrayList);
        }
        PersonalizationInput personalizationInput = this.personalization_input;
        if (personalizationInput != null) {
            arrayList.add("personalization_input=" + personalizationInput);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiatePersonalizedPaymentRequest{", "}", 0, null, null, 56);
    }
}
