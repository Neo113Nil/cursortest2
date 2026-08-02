package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FeeData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FeeData((Long) obj, (Long) obj2, (Long) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FeeData feeData = (FeeData) obj;
        reverseProtoWriter.getClass();
        feeData.getClass();
        reverseProtoWriter.writeBytes(feeData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, feeData.maximum_fee_cents);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, feeData.fee_fixed_amount_cents);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, feeData.minimum_fee_cents);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, feeData.fee_bps);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FeeData feeData = (FeeData) obj;
        feeData.getClass();
        int size$okio = feeData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(4, feeData.maximum_fee_cents) + protoAdapter.encodedSizeWithTag(3, feeData.fee_fixed_amount_cents) + protoAdapter.encodedSizeWithTag(2, feeData.minimum_fee_cents) + protoAdapter.encodedSizeWithTag(1, feeData.fee_bps) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FeeData feeData = (FeeData) obj;
        feeData.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = feeData.fee_bps;
        Long l2 = feeData.minimum_fee_cents;
        Long l3 = feeData.fee_fixed_amount_cents;
        Long l4 = feeData.maximum_fee_cents;
        byteString.getClass();
        return new FeeData(l, l2, l3, l4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FeeData feeData = (FeeData) obj;
        feeData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, feeData.fee_bps);
        protoAdapter.encodeWithTag(protoWriter, 2, feeData.minimum_fee_cents);
        protoAdapter.encodeWithTag(protoWriter, 3, feeData.fee_fixed_amount_cents);
        protoAdapter.encodeWithTag(protoWriter, 4, feeData.maximum_fee_cents);
        protoWriter.writeBytes(feeData.unknownFields());
    }
}
