package com.squareup.protos.cash.fx.app;

import coil3.network.CacheNetworkResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class StreamExchangeRateResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        CacheNetworkResponse cacheNetworkResponse = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StreamExchangeRateResponse(cacheNetworkResponse, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                cacheNetworkResponse = new StreamExchangeRateResponse$Type$Update((StreamExchangeRateUpdate) StreamExchangeRateUpdate.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                cacheNetworkResponse = new StreamExchangeRateResponse$Type$Heartbeat((StreamExchangeRateHeartbeat) StreamExchangeRateHeartbeat.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StreamExchangeRateResponse streamExchangeRateResponse = (StreamExchangeRateResponse) obj;
        reverseProtoWriter.getClass();
        streamExchangeRateResponse.getClass();
        reverseProtoWriter.writeBytes(streamExchangeRateResponse.unknownFields());
        CacheNetworkResponse cacheNetworkResponse = streamExchangeRateResponse.f1263type;
        if (cacheNetworkResponse instanceof StreamExchangeRateResponse$Type$Update) {
            StreamExchangeRateUpdate.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((StreamExchangeRateResponse$Type$Update) cacheNetworkResponse).value);
        } else if (cacheNetworkResponse instanceof StreamExchangeRateResponse$Type$Heartbeat) {
            StreamExchangeRateHeartbeat.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((StreamExchangeRateResponse$Type$Heartbeat) cacheNetworkResponse).value);
        } else {
            if (cacheNetworkResponse == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        StreamExchangeRateResponse streamExchangeRateResponse = (StreamExchangeRateResponse) obj;
        streamExchangeRateResponse.getClass();
        int size$okio = streamExchangeRateResponse.unknownFields().getSize$okio();
        CacheNetworkResponse cacheNetworkResponse = streamExchangeRateResponse.f1263type;
        if (cacheNetworkResponse instanceof StreamExchangeRateResponse$Type$Update) {
            encodedSizeWithTag = StreamExchangeRateUpdate.ADAPTER.encodedSizeWithTag(1, ((StreamExchangeRateResponse$Type$Update) cacheNetworkResponse).value);
        } else {
            if (!(cacheNetworkResponse instanceof StreamExchangeRateResponse$Type$Heartbeat)) {
                if (cacheNetworkResponse == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = StreamExchangeRateHeartbeat.ADAPTER.encodedSizeWithTag(2, ((StreamExchangeRateResponse$Type$Heartbeat) cacheNetworkResponse).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StreamExchangeRateResponse streamExchangeRateResponse = (StreamExchangeRateResponse) obj;
        streamExchangeRateResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        CacheNetworkResponse cacheNetworkResponse = streamExchangeRateResponse.f1263type;
        byteString.getClass();
        return new StreamExchangeRateResponse(cacheNetworkResponse, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StreamExchangeRateResponse streamExchangeRateResponse = (StreamExchangeRateResponse) obj;
        streamExchangeRateResponse.getClass();
        CacheNetworkResponse cacheNetworkResponse = streamExchangeRateResponse.f1263type;
        if (cacheNetworkResponse instanceof StreamExchangeRateResponse$Type$Update) {
            StreamExchangeRateUpdate.ADAPTER.encodeWithTag(protoWriter, 1, ((StreamExchangeRateResponse$Type$Update) cacheNetworkResponse).value);
        } else if (cacheNetworkResponse instanceof StreamExchangeRateResponse$Type$Heartbeat) {
            StreamExchangeRateHeartbeat.ADAPTER.encodeWithTag(protoWriter, 2, ((StreamExchangeRateResponse$Type$Heartbeat) cacheNetworkResponse).value);
        } else if (cacheNetworkResponse != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(streamExchangeRateResponse.unknownFields());
    }
}
