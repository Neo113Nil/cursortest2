package com.squareup.protos.cash.marketprices;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PriceTick$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PriceTick((Long) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PriceTick priceTick = (PriceTick) obj;
        reverseProtoWriter.getClass();
        priceTick.getClass();
        reverseProtoWriter.writeBytes(priceTick.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, priceTick.time_sec);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, priceTick.price);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PriceTick priceTick = (PriceTick) obj;
        priceTick.getClass();
        int size$okio = priceTick.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(2, priceTick.time_sec) + protoAdapter.encodedSizeWithTag(1, priceTick.price) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PriceTick priceTick = (PriceTick) obj;
        priceTick.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = priceTick.price;
        Long l2 = priceTick.time_sec;
        byteString.getClass();
        return new PriceTick(l, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PriceTick priceTick = (PriceTick) obj;
        priceTick.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, priceTick.price);
        protoAdapter.encodeWithTag(protoWriter, 2, priceTick.time_sec);
        protoWriter.writeBytes(priceTick.unknownFields());
    }
}
