package com.squareup.protos.cash.fiatly.api.v1;

import androidx.room.TransactorKt;
import com.squareup.cash.mosaic.personalization.api.v1.Personalization;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInput;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class InitiatePersonalizedPaymentRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InitiatePersonalizedPaymentRequest((InitiatePaymentRequest) obj, (Personalization) obj2, (String) obj3, (PersonalizationInput) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(InitiatePaymentRequest.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Personalization.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(PersonalizationInput.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InitiatePersonalizedPaymentRequest initiatePersonalizedPaymentRequest = (InitiatePersonalizedPaymentRequest) obj;
        reverseProtoWriter.getClass();
        initiatePersonalizedPaymentRequest.getClass();
        reverseProtoWriter.writeBytes(initiatePersonalizedPaymentRequest.unknownFields());
        PersonalizationInput.ADAPTER.encodeWithTag(reverseProtoWriter, 4, initiatePersonalizedPaymentRequest.personalization_input);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, initiatePersonalizedPaymentRequest.flow_token);
        Personalization.ADAPTER.encodeWithTag(reverseProtoWriter, 2, initiatePersonalizedPaymentRequest.personalization);
        InitiatePaymentRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 1, initiatePersonalizedPaymentRequest.initiate_payment_request);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InitiatePersonalizedPaymentRequest initiatePersonalizedPaymentRequest = (InitiatePersonalizedPaymentRequest) obj;
        initiatePersonalizedPaymentRequest.getClass();
        return PersonalizationInput.ADAPTER.encodedSizeWithTag(4, initiatePersonalizedPaymentRequest.personalization_input) + ProtoAdapter.STRING.encodedSizeWithTag(3, initiatePersonalizedPaymentRequest.flow_token) + Personalization.ADAPTER.encodedSizeWithTag(2, initiatePersonalizedPaymentRequest.personalization) + InitiatePaymentRequest.ADAPTER.encodedSizeWithTag(1, initiatePersonalizedPaymentRequest.initiate_payment_request) + initiatePersonalizedPaymentRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InitiatePersonalizedPaymentRequest initiatePersonalizedPaymentRequest = (InitiatePersonalizedPaymentRequest) obj;
        initiatePersonalizedPaymentRequest.getClass();
        InitiatePaymentRequest initiatePaymentRequest = initiatePersonalizedPaymentRequest.initiate_payment_request;
        InitiatePaymentRequest initiatePaymentRequest2 = initiatePaymentRequest != null ? (InitiatePaymentRequest) InitiatePaymentRequest.ADAPTER.redact(initiatePaymentRequest) : null;
        Personalization personalization = initiatePersonalizedPaymentRequest.personalization;
        Personalization personalization2 = personalization != null ? (Personalization) Personalization.ADAPTER.redact(personalization) : null;
        PersonalizationInput personalizationInput = initiatePersonalizedPaymentRequest.personalization_input;
        return InitiatePersonalizedPaymentRequest.copy$default(initiatePersonalizedPaymentRequest, initiatePaymentRequest2, personalization2, personalizationInput != null ? (PersonalizationInput) PersonalizationInput.ADAPTER.redact(personalizationInput) : null, ByteString.EMPTY, 4);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InitiatePersonalizedPaymentRequest initiatePersonalizedPaymentRequest = (InitiatePersonalizedPaymentRequest) obj;
        initiatePersonalizedPaymentRequest.getClass();
        InitiatePaymentRequest.ADAPTER.encodeWithTag(protoWriter, 1, initiatePersonalizedPaymentRequest.initiate_payment_request);
        Personalization.ADAPTER.encodeWithTag(protoWriter, 2, initiatePersonalizedPaymentRequest.personalization);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, initiatePersonalizedPaymentRequest.flow_token);
        PersonalizationInput.ADAPTER.encodeWithTag(protoWriter, 4, initiatePersonalizedPaymentRequest.personalization_input);
        protoWriter.writeBytes(initiatePersonalizedPaymentRequest.unknownFields());
    }
}
