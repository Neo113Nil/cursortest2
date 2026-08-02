package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingRenderData$CfBnplData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LendingRenderData.CfBnplData((Integer) obj, (Integer) obj2, (Long) obj3, (Long) obj4, (Long) obj5, (Long) obj6, (Long) obj7, (String) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 8:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingRenderData.CfBnplData cfBnplData = (LendingRenderData.CfBnplData) obj;
        reverseProtoWriter.getClass();
        cfBnplData.getClass();
        reverseProtoWriter.writeBytes(cfBnplData.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 8, cfBnplData.start_view_payment_plan_flow_url);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, cfBnplData.total_return_amounts_cents);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, cfBnplData.order_total_cents);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, cfBnplData.return_amount_cents);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cfBnplData.late_fee_applies_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cfBnplData.next_payment_due_at);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, cfBnplData.number_of_payments);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, cfBnplData.payment_number);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingRenderData.CfBnplData cfBnplData = (LendingRenderData.CfBnplData) obj;
        cfBnplData.getClass();
        int size$okio = cfBnplData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, cfBnplData.number_of_payments) + protoAdapter.encodedSizeWithTag(1, cfBnplData.payment_number) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return ProtoAdapter.STRING.encodedSizeWithTag(8, cfBnplData.start_view_payment_plan_flow_url) + protoAdapter2.encodedSizeWithTag(7, cfBnplData.total_return_amounts_cents) + protoAdapter2.encodedSizeWithTag(6, cfBnplData.order_total_cents) + protoAdapter2.encodedSizeWithTag(5, cfBnplData.return_amount_cents) + protoAdapter2.encodedSizeWithTag(4, cfBnplData.late_fee_applies_at) + protoAdapter2.encodedSizeWithTag(3, cfBnplData.next_payment_due_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingRenderData.CfBnplData cfBnplData = (LendingRenderData.CfBnplData) obj;
        cfBnplData.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = cfBnplData.payment_number;
        Integer num2 = cfBnplData.number_of_payments;
        Long l = cfBnplData.next_payment_due_at;
        Long l2 = cfBnplData.late_fee_applies_at;
        Long l3 = cfBnplData.return_amount_cents;
        Long l4 = cfBnplData.order_total_cents;
        Long l5 = cfBnplData.total_return_amounts_cents;
        String str = cfBnplData.start_view_payment_plan_flow_url;
        byteString.getClass();
        return new LendingRenderData.CfBnplData(num, num2, l, l2, l3, l4, l5, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingRenderData.CfBnplData cfBnplData = (LendingRenderData.CfBnplData) obj;
        cfBnplData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, cfBnplData.payment_number);
        protoAdapter.encodeWithTag(protoWriter, 2, cfBnplData.number_of_payments);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 3, cfBnplData.next_payment_due_at);
        protoAdapter2.encodeWithTag(protoWriter, 4, cfBnplData.late_fee_applies_at);
        protoAdapter2.encodeWithTag(protoWriter, 5, cfBnplData.return_amount_cents);
        protoAdapter2.encodeWithTag(protoWriter, 6, cfBnplData.order_total_cents);
        protoAdapter2.encodeWithTag(protoWriter, 7, cfBnplData.total_return_amounts_cents);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, cfBnplData.start_view_payment_plan_flow_url);
        protoWriter.writeBytes(cfBnplData.unknownFields());
    }
}
