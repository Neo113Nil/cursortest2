package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.BillPayRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BillPayRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BillPayRenderData((BillPayRenderData.BillCategory) obj, (BillPayRenderData.BillPayPaymentState) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = BillPayRenderData.BillCategory.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = BillPayRenderData.BillPayPaymentState.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BillPayRenderData billPayRenderData = (BillPayRenderData) obj;
        reverseProtoWriter.getClass();
        billPayRenderData.getClass();
        reverseProtoWriter.writeBytes(billPayRenderData.unknownFields());
        BillPayRenderData.BillPayPaymentState.ADAPTER.encodeWithTag(reverseProtoWriter, 2, billPayRenderData.state);
        BillPayRenderData.BillCategory.ADAPTER.encodeWithTag(reverseProtoWriter, 1, billPayRenderData.bill_category);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BillPayRenderData billPayRenderData = (BillPayRenderData) obj;
        billPayRenderData.getClass();
        return BillPayRenderData.BillPayPaymentState.ADAPTER.encodedSizeWithTag(2, billPayRenderData.state) + BillPayRenderData.BillCategory.ADAPTER.encodedSizeWithTag(1, billPayRenderData.bill_category) + billPayRenderData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BillPayRenderData billPayRenderData = (BillPayRenderData) obj;
        billPayRenderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        BillPayRenderData.BillCategory billCategory = billPayRenderData.bill_category;
        BillPayRenderData.BillPayPaymentState billPayPaymentState = billPayRenderData.state;
        byteString.getClass();
        return new BillPayRenderData(billCategory, billPayPaymentState, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BillPayRenderData billPayRenderData = (BillPayRenderData) obj;
        billPayRenderData.getClass();
        BillPayRenderData.BillCategory.ADAPTER.encodeWithTag(protoWriter, 1, billPayRenderData.bill_category);
        BillPayRenderData.BillPayPaymentState.ADAPTER.encodeWithTag(protoWriter, 2, billPayRenderData.state);
        protoWriter.writeBytes(billPayRenderData.unknownFields());
    }
}
