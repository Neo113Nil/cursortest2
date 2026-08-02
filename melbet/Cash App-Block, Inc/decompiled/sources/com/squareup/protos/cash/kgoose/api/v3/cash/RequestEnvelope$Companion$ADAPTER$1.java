package com.squareup.protos.cash.kgoose.api.v3.cash;

import com.squareup.protos.cash.kgoose.api.v3.GetMessagesRequest;
import com.squareup.protos.cash.kgoose.api.v3.cash.RequestEnvelope;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/cash/RequestEnvelope$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/RequestEnvelope;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RequestEnvelope$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        RequestEnvelope.Type.Request request = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RequestEnvelope(request, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                request = new RequestEnvelope.Type.Request((GetMessagesRequest) GetMessagesRequest.ADAPTER.decode(protoReader));
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
        RequestEnvelope.Type type2 = requestEnvelope.type;
        if (type2 instanceof RequestEnvelope.Type.Request) {
            GetMessagesRequest.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((RequestEnvelope.Type.Request) type2).getValue());
        } else {
            if (type2 == null) {
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
        RequestEnvelope.Type type2 = requestEnvelope.type;
        if (type2 instanceof RequestEnvelope.Type.Request) {
            return GetMessagesRequest.ADAPTER.encodedSizeWithTag(1, ((RequestEnvelope.Type.Request) type2).getValue()) + size$okio;
        }
        if (type2 == null) {
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
        RequestEnvelope.Type type2 = requestEnvelope.type;
        byteString.getClass();
        return new RequestEnvelope(type2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RequestEnvelope requestEnvelope = (RequestEnvelope) obj;
        requestEnvelope.getClass();
        RequestEnvelope.Type type2 = requestEnvelope.type;
        if (type2 instanceof RequestEnvelope.Type.Request) {
            GetMessagesRequest.ADAPTER.encodeWithTag(protoWriter, 1, ((RequestEnvelope.Type.Request) type2).getValue());
        } else if (type2 != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(requestEnvelope.unknownFields());
    }
}
