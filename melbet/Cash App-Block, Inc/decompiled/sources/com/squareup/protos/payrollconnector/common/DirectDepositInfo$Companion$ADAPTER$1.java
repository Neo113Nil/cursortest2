package com.squareup.protos.payrollconnector.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DirectDepositInfo$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new DirectDepositInfo((Boolean) obj, (Boolean) obj2, (Long) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
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
        DirectDepositInfo directDepositInfo = (DirectDepositInfo) obj;
        reverseProtoWriter.getClass();
        directDepositInfo.getClass();
        reverseProtoWriter.writeBytes(directDepositInfo.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, directDepositInfo.min_amount_cents);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, directDepositInfo.max_amount_cents);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, directDepositInfo.fractional_amount_supported);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, directDepositInfo.amount_supported);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DirectDepositInfo directDepositInfo = (DirectDepositInfo) obj;
        directDepositInfo.getClass();
        int size$okio = directDepositInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, directDepositInfo.fractional_amount_supported) + protoAdapter.encodedSizeWithTag(1, directDepositInfo.amount_supported) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return protoAdapter2.encodedSizeWithTag(4, directDepositInfo.min_amount_cents) + protoAdapter2.encodedSizeWithTag(3, directDepositInfo.max_amount_cents) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DirectDepositInfo directDepositInfo = (DirectDepositInfo) obj;
        directDepositInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = directDepositInfo.amount_supported;
        Boolean bool2 = directDepositInfo.fractional_amount_supported;
        Long l = directDepositInfo.max_amount_cents;
        Long l2 = directDepositInfo.min_amount_cents;
        byteString.getClass();
        return new DirectDepositInfo(bool, bool2, l, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DirectDepositInfo directDepositInfo = (DirectDepositInfo) obj;
        directDepositInfo.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, directDepositInfo.amount_supported);
        protoAdapter.encodeWithTag(protoWriter, 2, directDepositInfo.fractional_amount_supported);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 3, directDepositInfo.max_amount_cents);
        protoAdapter2.encodeWithTag(protoWriter, 4, directDepositInfo.min_amount_cents);
        protoWriter.writeBytes(directDepositInfo.unknownFields());
    }
}
