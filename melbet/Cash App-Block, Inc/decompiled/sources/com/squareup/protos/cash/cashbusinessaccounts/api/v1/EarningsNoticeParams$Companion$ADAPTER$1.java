package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import com.squareup.protos.cash.cashbusinessaccounts.api.v1.EarningsNoticeParams;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class EarningsNoticeParams$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new EarningsNoticeParams((Integer) obj, (Integer) obj2, (EarningsNoticeParams.EntryPoint) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = EarningsNoticeParams.EntryPoint.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningsNoticeParams earningsNoticeParams = (EarningsNoticeParams) obj;
        reverseProtoWriter.getClass();
        earningsNoticeParams.getClass();
        reverseProtoWriter.writeBytes(earningsNoticeParams.unknownFields());
        EarningsNoticeParams.EntryPoint.ADAPTER.encodeWithTag(reverseProtoWriter, 3, earningsNoticeParams.entry_point);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, earningsNoticeParams.year);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, earningsNoticeParams.month);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarningsNoticeParams earningsNoticeParams = (EarningsNoticeParams) obj;
        earningsNoticeParams.getClass();
        int size$okio = earningsNoticeParams.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return EarningsNoticeParams.EntryPoint.ADAPTER.encodedSizeWithTag(3, earningsNoticeParams.entry_point) + protoAdapter.encodedSizeWithTag(2, earningsNoticeParams.year) + protoAdapter.encodedSizeWithTag(1, earningsNoticeParams.month) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningsNoticeParams earningsNoticeParams = (EarningsNoticeParams) obj;
        earningsNoticeParams.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = earningsNoticeParams.month;
        Integer num2 = earningsNoticeParams.year;
        EarningsNoticeParams.EntryPoint entryPoint = earningsNoticeParams.entry_point;
        byteString.getClass();
        return new EarningsNoticeParams(num, num2, entryPoint, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningsNoticeParams earningsNoticeParams = (EarningsNoticeParams) obj;
        earningsNoticeParams.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, earningsNoticeParams.month);
        protoAdapter.encodeWithTag(protoWriter, 2, earningsNoticeParams.year);
        EarningsNoticeParams.EntryPoint.ADAPTER.encodeWithTag(protoWriter, 3, earningsNoticeParams.entry_point);
        protoWriter.writeBytes(earningsNoticeParams.unknownFields());
    }
}
