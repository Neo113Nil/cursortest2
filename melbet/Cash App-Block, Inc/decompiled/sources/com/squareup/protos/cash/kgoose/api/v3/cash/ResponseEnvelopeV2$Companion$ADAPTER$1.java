package com.squareup.protos.cash.kgoose.api.v3.cash;

import com.squareup.protos.cash.kgoose.api.v3.GetMessagesStreamResponse;
import com.squareup.protos.cash.kgoose.api.v3.cash.ResponseEnvelopeV2;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/cash/ResponseEnvelopeV2$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/ResponseEnvelopeV2;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ResponseEnvelopeV2$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ResponseEnvelopeV2.Type type2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ResponseEnvelopeV2(type2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                type2 = new ResponseEnvelopeV2.Type.Response((GetMessagesStreamResponse) GetMessagesStreamResponse.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                type2 = new ResponseEnvelopeV2.Type.Heartbeat((GetMessagesHeartbeat) GetMessagesHeartbeat.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ResponseEnvelopeV2 responseEnvelopeV2 = (ResponseEnvelopeV2) obj;
        reverseProtoWriter.getClass();
        responseEnvelopeV2.getClass();
        reverseProtoWriter.writeBytes(responseEnvelopeV2.unknownFields());
        ResponseEnvelopeV2.Type type2 = responseEnvelopeV2.type;
        if (type2 instanceof ResponseEnvelopeV2.Type.Response) {
            GetMessagesStreamResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ResponseEnvelopeV2.Type.Response) type2).getValue());
        } else if (type2 instanceof ResponseEnvelopeV2.Type.Heartbeat) {
            GetMessagesHeartbeat.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ResponseEnvelopeV2.Type.Heartbeat) type2).getValue());
        } else {
            if (type2 == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ResponseEnvelopeV2 responseEnvelopeV2 = (ResponseEnvelopeV2) obj;
        responseEnvelopeV2.getClass();
        int size$okio = responseEnvelopeV2.unknownFields().getSize$okio();
        ResponseEnvelopeV2.Type type2 = responseEnvelopeV2.type;
        if (type2 instanceof ResponseEnvelopeV2.Type.Response) {
            encodedSizeWithTag = GetMessagesStreamResponse.ADAPTER.encodedSizeWithTag(1, ((ResponseEnvelopeV2.Type.Response) type2).getValue());
        } else {
            if (!(type2 instanceof ResponseEnvelopeV2.Type.Heartbeat)) {
                if (type2 == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = GetMessagesHeartbeat.ADAPTER.encodedSizeWithTag(2, ((ResponseEnvelopeV2.Type.Heartbeat) type2).getValue());
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ResponseEnvelopeV2 responseEnvelopeV2 = (ResponseEnvelopeV2) obj;
        responseEnvelopeV2.getClass();
        ByteString byteString = ByteString.EMPTY;
        ResponseEnvelopeV2.Type type2 = responseEnvelopeV2.type;
        byteString.getClass();
        return new ResponseEnvelopeV2(type2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ResponseEnvelopeV2 responseEnvelopeV2 = (ResponseEnvelopeV2) obj;
        responseEnvelopeV2.getClass();
        ResponseEnvelopeV2.Type type2 = responseEnvelopeV2.type;
        if (type2 instanceof ResponseEnvelopeV2.Type.Response) {
            GetMessagesStreamResponse.ADAPTER.encodeWithTag(protoWriter, 1, ((ResponseEnvelopeV2.Type.Response) type2).getValue());
        } else if (type2 instanceof ResponseEnvelopeV2.Type.Heartbeat) {
            GetMessagesHeartbeat.ADAPTER.encodeWithTag(protoWriter, 2, ((ResponseEnvelopeV2.Type.Heartbeat) type2).getValue());
        } else if (type2 != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(responseEnvelopeV2.unknownFields());
    }
}
