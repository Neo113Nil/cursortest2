package com.squareup.protos.cash.fiatly.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.InitiatePaymentResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InitiatePersonalizedPaymentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InitiatePersonalizedPaymentResponse((InitiatePaymentResponse) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(InitiatePaymentResponse.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InitiatePersonalizedPaymentResponse initiatePersonalizedPaymentResponse = (InitiatePersonalizedPaymentResponse) obj;
        reverseProtoWriter.getClass();
        initiatePersonalizedPaymentResponse.getClass();
        reverseProtoWriter.writeBytes(initiatePersonalizedPaymentResponse.unknownFields());
        InitiatePaymentResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 1, initiatePersonalizedPaymentResponse.response);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InitiatePersonalizedPaymentResponse initiatePersonalizedPaymentResponse = (InitiatePersonalizedPaymentResponse) obj;
        initiatePersonalizedPaymentResponse.getClass();
        return InitiatePaymentResponse.ADAPTER.encodedSizeWithTag(1, initiatePersonalizedPaymentResponse.response) + initiatePersonalizedPaymentResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InitiatePersonalizedPaymentResponse initiatePersonalizedPaymentResponse = (InitiatePersonalizedPaymentResponse) obj;
        initiatePersonalizedPaymentResponse.getClass();
        InitiatePaymentResponse initiatePaymentResponse = initiatePersonalizedPaymentResponse.response;
        InitiatePaymentResponse initiatePaymentResponse2 = initiatePaymentResponse != null ? (InitiatePaymentResponse) InitiatePaymentResponse.ADAPTER.redact(initiatePaymentResponse) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InitiatePersonalizedPaymentResponse(initiatePaymentResponse2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InitiatePersonalizedPaymentResponse initiatePersonalizedPaymentResponse = (InitiatePersonalizedPaymentResponse) obj;
        initiatePersonalizedPaymentResponse.getClass();
        InitiatePaymentResponse.ADAPTER.encodeWithTag(protoWriter, 1, initiatePersonalizedPaymentResponse.response);
        protoWriter.writeBytes(initiatePersonalizedPaymentResponse.unknownFields());
    }
}
