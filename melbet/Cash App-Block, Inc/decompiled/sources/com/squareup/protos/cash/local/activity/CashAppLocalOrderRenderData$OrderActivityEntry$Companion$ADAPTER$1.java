package com.squareup.protos.cash.local.activity;

import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppLocalOrderRenderData$OrderActivityEntry$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashAppLocalOrderRenderData.OrderActivityEntry((CashAppLocalOrderRenderData.OrderActivityEntrySubject) obj, (String) obj2, (Long) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CashAppLocalOrderRenderData.OrderActivityEntrySubject.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppLocalOrderRenderData.OrderActivityEntry orderActivityEntry = (CashAppLocalOrderRenderData.OrderActivityEntry) obj;
        reverseProtoWriter.getClass();
        orderActivityEntry.getClass();
        reverseProtoWriter.writeBytes(orderActivityEntry.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, orderActivityEntry.subject_version);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, orderActivityEntry.subject_id);
        CashAppLocalOrderRenderData.OrderActivityEntrySubject.ADAPTER.encodeWithTag(reverseProtoWriter, 1, orderActivityEntry.subject_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppLocalOrderRenderData.OrderActivityEntry orderActivityEntry = (CashAppLocalOrderRenderData.OrderActivityEntry) obj;
        orderActivityEntry.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(3, orderActivityEntry.subject_version) + ProtoAdapter.STRING.encodedSizeWithTag(2, orderActivityEntry.subject_id) + CashAppLocalOrderRenderData.OrderActivityEntrySubject.ADAPTER.encodedSizeWithTag(1, orderActivityEntry.subject_type) + orderActivityEntry.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppLocalOrderRenderData.OrderActivityEntry orderActivityEntry = (CashAppLocalOrderRenderData.OrderActivityEntry) obj;
        orderActivityEntry.getClass();
        ByteString byteString = ByteString.EMPTY;
        CashAppLocalOrderRenderData.OrderActivityEntrySubject orderActivityEntrySubject = orderActivityEntry.subject_type;
        String str = orderActivityEntry.subject_id;
        Long l = orderActivityEntry.subject_version;
        byteString.getClass();
        return new CashAppLocalOrderRenderData.OrderActivityEntry(orderActivityEntrySubject, str, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppLocalOrderRenderData.OrderActivityEntry orderActivityEntry = (CashAppLocalOrderRenderData.OrderActivityEntry) obj;
        orderActivityEntry.getClass();
        CashAppLocalOrderRenderData.OrderActivityEntrySubject.ADAPTER.encodeWithTag(protoWriter, 1, orderActivityEntry.subject_type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, orderActivityEntry.subject_id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, orderActivityEntry.subject_version);
        protoWriter.writeBytes(orderActivityEntry.unknownFields());
    }
}
