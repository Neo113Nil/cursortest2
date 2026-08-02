package squareup.cash.customer_feed.service;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class RequestEnvelope$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        RequestEnvelope$Type$Subscribe requestEnvelope$Type$Subscribe = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RequestEnvelope(requestEnvelope$Type$Subscribe, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                requestEnvelope$Type$Subscribe = new RequestEnvelope$Type$Subscribe((SubscribeRequest) SubscribeRequest.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RequestEnvelope requestEnvelope = (RequestEnvelope) obj;
        reverseProtoWriter.getClass();
        requestEnvelope.getClass();
        reverseProtoWriter.writeBytes(requestEnvelope.unknownFields());
        RequestEnvelope$Type$Subscribe requestEnvelope$Type$Subscribe = requestEnvelope.f1635type;
        if (requestEnvelope$Type$Subscribe != null) {
            SubscribeRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 1, requestEnvelope$Type$Subscribe.value);
        } else {
            if (requestEnvelope$Type$Subscribe == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RequestEnvelope requestEnvelope = (RequestEnvelope) obj;
        requestEnvelope.getClass();
        int size$okio = requestEnvelope.unknownFields().getSize$okio();
        RequestEnvelope$Type$Subscribe requestEnvelope$Type$Subscribe = requestEnvelope.f1635type;
        if (requestEnvelope$Type$Subscribe != null) {
            return SubscribeRequest.ADAPTER.encodedSizeWithTag(1, requestEnvelope$Type$Subscribe.value) + size$okio;
        }
        if (requestEnvelope$Type$Subscribe == null) {
            return size$okio;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RequestEnvelope requestEnvelope = (RequestEnvelope) obj;
        requestEnvelope.getClass();
        ByteString byteString = ByteString.EMPTY;
        RequestEnvelope$Type$Subscribe requestEnvelope$Type$Subscribe = requestEnvelope.f1635type;
        byteString.getClass();
        return new RequestEnvelope(requestEnvelope$Type$Subscribe, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RequestEnvelope requestEnvelope = (RequestEnvelope) obj;
        requestEnvelope.getClass();
        RequestEnvelope$Type$Subscribe requestEnvelope$Type$Subscribe = requestEnvelope.f1635type;
        if (requestEnvelope$Type$Subscribe != null) {
            SubscribeRequest.ADAPTER.encodeWithTag(protoWriter, 1, requestEnvelope$Type$Subscribe.value);
        } else if (requestEnvelope$Type$Subscribe != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(requestEnvelope.unknownFields());
    }
}
