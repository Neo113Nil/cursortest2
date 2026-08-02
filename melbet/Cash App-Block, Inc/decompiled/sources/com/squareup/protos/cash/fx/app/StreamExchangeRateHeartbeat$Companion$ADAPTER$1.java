package com.squareup.protos.cash.fx.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class StreamExchangeRateHeartbeat$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StreamExchangeRateHeartbeat((Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StreamExchangeRateHeartbeat streamExchangeRateHeartbeat = (StreamExchangeRateHeartbeat) obj;
        reverseProtoWriter.getClass();
        streamExchangeRateHeartbeat.getClass();
        reverseProtoWriter.writeBytes(streamExchangeRateHeartbeat.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, streamExchangeRateHeartbeat.timestamp_ms);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StreamExchangeRateHeartbeat streamExchangeRateHeartbeat = (StreamExchangeRateHeartbeat) obj;
        streamExchangeRateHeartbeat.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(1, streamExchangeRateHeartbeat.timestamp_ms) + streamExchangeRateHeartbeat.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StreamExchangeRateHeartbeat streamExchangeRateHeartbeat = (StreamExchangeRateHeartbeat) obj;
        streamExchangeRateHeartbeat.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = streamExchangeRateHeartbeat.timestamp_ms;
        byteString.getClass();
        return new StreamExchangeRateHeartbeat(l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StreamExchangeRateHeartbeat streamExchangeRateHeartbeat = (StreamExchangeRateHeartbeat) obj;
        streamExchangeRateHeartbeat.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, streamExchangeRateHeartbeat.timestamp_ms);
        protoWriter.writeBytes(streamExchangeRateHeartbeat.unknownFields());
    }
}
