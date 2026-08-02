package com.squareup.protos.cash.fiatly.api.v2;

import coil3.intercept.EngineInterceptorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetPaymentUpdatesBySessionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        EngineInterceptorKt engineInterceptorKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPaymentUpdatesBySessionResponse(engineInterceptorKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                engineInterceptorKt = new GetPaymentUpdatesBySessionResponse$Type$Update((PaymentUpdate) PaymentUpdate.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                engineInterceptorKt = new GetPaymentUpdatesBySessionResponse$Type$Heartbeat((PaymentUpdateHeartbeat) PaymentUpdateHeartbeat.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPaymentUpdatesBySessionResponse getPaymentUpdatesBySessionResponse = (GetPaymentUpdatesBySessionResponse) obj;
        reverseProtoWriter.getClass();
        getPaymentUpdatesBySessionResponse.getClass();
        reverseProtoWriter.writeBytes(getPaymentUpdatesBySessionResponse.unknownFields());
        EngineInterceptorKt engineInterceptorKt = getPaymentUpdatesBySessionResponse.f1262type;
        if (engineInterceptorKt instanceof GetPaymentUpdatesBySessionResponse$Type$Update) {
            PaymentUpdate.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetPaymentUpdatesBySessionResponse$Type$Update) engineInterceptorKt).value);
        } else if (engineInterceptorKt instanceof GetPaymentUpdatesBySessionResponse$Type$Heartbeat) {
            PaymentUpdateHeartbeat.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetPaymentUpdatesBySessionResponse$Type$Heartbeat) engineInterceptorKt).value);
        } else {
            if (engineInterceptorKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetPaymentUpdatesBySessionResponse getPaymentUpdatesBySessionResponse = (GetPaymentUpdatesBySessionResponse) obj;
        getPaymentUpdatesBySessionResponse.getClass();
        int size$okio = getPaymentUpdatesBySessionResponse.unknownFields().getSize$okio();
        EngineInterceptorKt engineInterceptorKt = getPaymentUpdatesBySessionResponse.f1262type;
        if (engineInterceptorKt instanceof GetPaymentUpdatesBySessionResponse$Type$Update) {
            encodedSizeWithTag = PaymentUpdate.ADAPTER.encodedSizeWithTag(1, ((GetPaymentUpdatesBySessionResponse$Type$Update) engineInterceptorKt).value);
        } else {
            if (!(engineInterceptorKt instanceof GetPaymentUpdatesBySessionResponse$Type$Heartbeat)) {
                if (engineInterceptorKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = PaymentUpdateHeartbeat.ADAPTER.encodedSizeWithTag(2, ((GetPaymentUpdatesBySessionResponse$Type$Heartbeat) engineInterceptorKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPaymentUpdatesBySessionResponse getPaymentUpdatesBySessionResponse = (GetPaymentUpdatesBySessionResponse) obj;
        getPaymentUpdatesBySessionResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        EngineInterceptorKt engineInterceptorKt = getPaymentUpdatesBySessionResponse.f1262type;
        byteString.getClass();
        return new GetPaymentUpdatesBySessionResponse(engineInterceptorKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPaymentUpdatesBySessionResponse getPaymentUpdatesBySessionResponse = (GetPaymentUpdatesBySessionResponse) obj;
        getPaymentUpdatesBySessionResponse.getClass();
        EngineInterceptorKt engineInterceptorKt = getPaymentUpdatesBySessionResponse.f1262type;
        if (engineInterceptorKt instanceof GetPaymentUpdatesBySessionResponse$Type$Update) {
            PaymentUpdate.ADAPTER.encodeWithTag(protoWriter, 1, ((GetPaymentUpdatesBySessionResponse$Type$Update) engineInterceptorKt).value);
        } else if (engineInterceptorKt instanceof GetPaymentUpdatesBySessionResponse$Type$Heartbeat) {
            PaymentUpdateHeartbeat.ADAPTER.encodeWithTag(protoWriter, 2, ((GetPaymentUpdatesBySessionResponse$Type$Heartbeat) engineInterceptorKt).value);
        } else if (engineInterceptorKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getPaymentUpdatesBySessionResponse.unknownFields());
    }
}
