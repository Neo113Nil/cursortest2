package com.squareup.protos.cash.kgoose.api.v3.cash;

import com.squareup.protos.cash.kgoose.api.v3.GetMessagesResponse;
import com.squareup.protos.cash.kgoose.api.v3.cash.ResponseEnvelope;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/cash/ResponseEnvelope$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/ResponseEnvelope;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ResponseEnvelope$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ResponseEnvelope.Type type2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ResponseEnvelope(type2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                type2 = new ResponseEnvelope.Type.Response((GetMessagesResponse) GetMessagesResponse.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                type2 = new ResponseEnvelope.Type.Heartbeat((GetMessagesHeartbeat) GetMessagesHeartbeat.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ResponseEnvelope responseEnvelope = (ResponseEnvelope) obj;
        reverseProtoWriter.getClass();
        responseEnvelope.getClass();
        reverseProtoWriter.writeBytes(responseEnvelope.unknownFields());
        ResponseEnvelope.Type type2 = responseEnvelope.type;
        if (type2 instanceof ResponseEnvelope.Type.Response) {
            GetMessagesResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ResponseEnvelope.Type.Response) type2).getValue());
        } else if (type2 instanceof ResponseEnvelope.Type.Heartbeat) {
            GetMessagesHeartbeat.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ResponseEnvelope.Type.Heartbeat) type2).getValue());
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
        ResponseEnvelope responseEnvelope = (ResponseEnvelope) obj;
        responseEnvelope.getClass();
        int size$okio = responseEnvelope.unknownFields().getSize$okio();
        ResponseEnvelope.Type type2 = responseEnvelope.type;
        if (type2 instanceof ResponseEnvelope.Type.Response) {
            encodedSizeWithTag = GetMessagesResponse.ADAPTER.encodedSizeWithTag(1, ((ResponseEnvelope.Type.Response) type2).getValue());
        } else {
            if (!(type2 instanceof ResponseEnvelope.Type.Heartbeat)) {
                if (type2 == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = GetMessagesHeartbeat.ADAPTER.encodedSizeWithTag(2, ((ResponseEnvelope.Type.Heartbeat) type2).getValue());
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ResponseEnvelope responseEnvelope = (ResponseEnvelope) obj;
        responseEnvelope.getClass();
        ByteString byteString = ByteString.EMPTY;
        ResponseEnvelope.Type type2 = responseEnvelope.type;
        byteString.getClass();
        return new ResponseEnvelope(type2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ResponseEnvelope responseEnvelope = (ResponseEnvelope) obj;
        responseEnvelope.getClass();
        ResponseEnvelope.Type type2 = responseEnvelope.type;
        if (type2 instanceof ResponseEnvelope.Type.Response) {
            GetMessagesResponse.ADAPTER.encodeWithTag(protoWriter, 1, ((ResponseEnvelope.Type.Response) type2).getValue());
        } else if (type2 instanceof ResponseEnvelope.Type.Heartbeat) {
            GetMessagesHeartbeat.ADAPTER.encodeWithTag(protoWriter, 2, ((ResponseEnvelope.Type.Heartbeat) type2).getValue());
        } else if (type2 != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(responseEnvelope.unknownFields());
    }
}
