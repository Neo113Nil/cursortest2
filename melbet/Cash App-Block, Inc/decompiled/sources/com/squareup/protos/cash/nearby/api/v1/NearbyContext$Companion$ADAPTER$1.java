package com.squareup.protos.cash.nearby.api.v1;

import com.squareup.protos.cash.nearby.api.v1.NearbyContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class NearbyContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NearbyContext((NearbyContext.NearbyIntent) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = NearbyContext.NearbyIntent.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NearbyContext nearbyContext = (NearbyContext) obj;
        reverseProtoWriter.getClass();
        nearbyContext.getClass();
        reverseProtoWriter.writeBytes(nearbyContext.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, nearbyContext.context_token);
        NearbyContext.NearbyIntent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, nearbyContext.intent);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NearbyContext nearbyContext = (NearbyContext) obj;
        nearbyContext.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, nearbyContext.context_token) + NearbyContext.NearbyIntent.ADAPTER.encodedSizeWithTag(1, nearbyContext.intent) + nearbyContext.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NearbyContext nearbyContext = (NearbyContext) obj;
        nearbyContext.getClass();
        ByteString byteString = ByteString.EMPTY;
        NearbyContext.NearbyIntent nearbyIntent = nearbyContext.intent;
        String str = nearbyContext.context_token;
        byteString.getClass();
        return new NearbyContext(nearbyIntent, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NearbyContext nearbyContext = (NearbyContext) obj;
        nearbyContext.getClass();
        NearbyContext.NearbyIntent.ADAPTER.encodeWithTag(protoWriter, 1, nearbyContext.intent);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, nearbyContext.context_token);
        protoWriter.writeBytes(nearbyContext.unknownFields());
    }
}
