package com.squareup.protos.cash.postcard.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class KnotSwitchCardResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new KnotSwitchCardResponse((Boolean) obj, (Integer) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        KnotSwitchCardResponse knotSwitchCardResponse = (KnotSwitchCardResponse) obj;
        reverseProtoWriter.getClass();
        knotSwitchCardResponse.getClass();
        reverseProtoWriter.writeBytes(knotSwitchCardResponse.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, knotSwitchCardResponse.merchant_id);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, knotSwitchCardResponse.success);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        KnotSwitchCardResponse knotSwitchCardResponse = (KnotSwitchCardResponse) obj;
        knotSwitchCardResponse.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(2, knotSwitchCardResponse.merchant_id) + ProtoAdapter.BOOL.encodedSizeWithTag(1, knotSwitchCardResponse.success) + knotSwitchCardResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        KnotSwitchCardResponse knotSwitchCardResponse = (KnotSwitchCardResponse) obj;
        knotSwitchCardResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = knotSwitchCardResponse.success;
        Integer num = knotSwitchCardResponse.merchant_id;
        byteString.getClass();
        return new KnotSwitchCardResponse(bool, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        KnotSwitchCardResponse knotSwitchCardResponse = (KnotSwitchCardResponse) obj;
        knotSwitchCardResponse.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, knotSwitchCardResponse.success);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, knotSwitchCardResponse.merchant_id);
        protoWriter.writeBytes(knotSwitchCardResponse.unknownFields());
    }
}
