package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PriceRange$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Integer num = (Integer) obj;
        if (num == null) {
            TransactorKt.missingRequiredFields(obj, "min");
            throw null;
        }
        int intValue = num.intValue();
        Integer num2 = (Integer) obj2;
        if (num2 != null) {
            return new PriceRange(intValue, num2.intValue(), endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj2, "max");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PriceRange priceRange = (PriceRange) obj;
        reverseProtoWriter.getClass();
        priceRange.getClass();
        reverseProtoWriter.writeBytes(priceRange.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, Integer.valueOf(priceRange.max));
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, Integer.valueOf(priceRange.min));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PriceRange priceRange = (PriceRange) obj;
        priceRange.getClass();
        int size$okio = priceRange.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(2, Integer.valueOf(priceRange.max)) + protoAdapter.encodedSizeWithTag(1, Integer.valueOf(priceRange.min)) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PriceRange priceRange = (PriceRange) obj;
        priceRange.getClass();
        ByteString byteString = ByteString.EMPTY;
        int i = priceRange.min;
        int i2 = priceRange.max;
        byteString.getClass();
        return new PriceRange(i, i2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PriceRange priceRange = (PriceRange) obj;
        priceRange.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, Integer.valueOf(priceRange.min));
        protoAdapter.encodeWithTag(protoWriter, 2, Integer.valueOf(priceRange.max));
        protoWriter.writeBytes(priceRange.unknownFields());
    }
}
