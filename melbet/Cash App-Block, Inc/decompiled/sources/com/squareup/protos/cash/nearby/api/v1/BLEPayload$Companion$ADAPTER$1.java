package com.squareup.protos.cash.nearby.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BLEPayload$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BLEPayload((ByteString) obj, (Integer) obj2, (Integer) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BLEPayload bLEPayload = (BLEPayload) obj;
        reverseProtoWriter.getClass();
        bLEPayload.getClass();
        reverseProtoWriter.writeBytes(bLEPayload.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, bLEPayload.frequency);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, bLEPayload.transmission_level);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, bLEPayload.advertisement_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BLEPayload bLEPayload = (BLEPayload) obj;
        bLEPayload.getClass();
        int encodedSizeWithTag = ProtoAdapter.BYTES.encodedSizeWithTag(1, bLEPayload.advertisement_data) + bLEPayload.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(3, bLEPayload.frequency) + protoAdapter.encodedSizeWithTag(2, bLEPayload.transmission_level) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BLEPayload bLEPayload = (BLEPayload) obj;
        bLEPayload.getClass();
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = bLEPayload.advertisement_data;
        Integer num = bLEPayload.transmission_level;
        Integer num2 = bLEPayload.frequency;
        byteString.getClass();
        return new BLEPayload(byteString2, num, num2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BLEPayload bLEPayload = (BLEPayload) obj;
        bLEPayload.getClass();
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, bLEPayload.advertisement_data);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 2, bLEPayload.transmission_level);
        protoAdapter.encodeWithTag(protoWriter, 3, bLEPayload.frequency);
        protoWriter.writeBytes(bLEPayload.unknownFields());
    }
}
