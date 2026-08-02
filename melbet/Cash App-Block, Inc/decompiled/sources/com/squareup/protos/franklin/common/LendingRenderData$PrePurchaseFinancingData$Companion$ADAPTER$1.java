package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingRenderData$PrePurchaseFinancingData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LendingRenderData.PrePurchaseFinancingData((Integer) obj, (Integer) obj2, (Long) obj3, (Long) obj4, (Long) obj5, (Long) obj6, (Long) obj8, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 5:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 6:
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 7:
                    obj6 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 8:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj8 = ProtoAdapter.INT64.decode(protoReader);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingRenderData.PrePurchaseFinancingData prePurchaseFinancingData = (LendingRenderData.PrePurchaseFinancingData) obj;
        reverseProtoWriter.getClass();
        prePurchaseFinancingData.getClass();
        reverseProtoWriter.writeBytes(prePurchaseFinancingData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, prePurchaseFinancingData.early_repayment_fee_refund_amounts_cents);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 8, prePurchaseFinancingData.start_view_payment_plan_flow_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, prePurchaseFinancingData.total_return_amounts_cents);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, prePurchaseFinancingData.order_total_cents);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, prePurchaseFinancingData.return_amount_cents);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, prePurchaseFinancingData.next_payment_due_at);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, prePurchaseFinancingData.number_of_payments);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, prePurchaseFinancingData.payment_number);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingRenderData.PrePurchaseFinancingData prePurchaseFinancingData = (LendingRenderData.PrePurchaseFinancingData) obj;
        prePurchaseFinancingData.getClass();
        int size$okio = prePurchaseFinancingData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, prePurchaseFinancingData.number_of_payments) + protoAdapter.encodedSizeWithTag(1, prePurchaseFinancingData.payment_number) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return protoAdapter2.encodedSizeWithTag(9, prePurchaseFinancingData.early_repayment_fee_refund_amounts_cents) + ProtoAdapter.STRING.encodedSizeWithTag(8, prePurchaseFinancingData.start_view_payment_plan_flow_url) + protoAdapter2.encodedSizeWithTag(7, prePurchaseFinancingData.total_return_amounts_cents) + protoAdapter2.encodedSizeWithTag(6, prePurchaseFinancingData.order_total_cents) + protoAdapter2.encodedSizeWithTag(5, prePurchaseFinancingData.return_amount_cents) + protoAdapter2.encodedSizeWithTag(3, prePurchaseFinancingData.next_payment_due_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingRenderData.PrePurchaseFinancingData prePurchaseFinancingData = (LendingRenderData.PrePurchaseFinancingData) obj;
        prePurchaseFinancingData.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = prePurchaseFinancingData.payment_number;
        Integer num2 = prePurchaseFinancingData.number_of_payments;
        Long l = prePurchaseFinancingData.next_payment_due_at;
        Long l2 = prePurchaseFinancingData.return_amount_cents;
        Long l3 = prePurchaseFinancingData.order_total_cents;
        Long l4 = prePurchaseFinancingData.total_return_amounts_cents;
        String str = prePurchaseFinancingData.start_view_payment_plan_flow_url;
        Long l5 = prePurchaseFinancingData.early_repayment_fee_refund_amounts_cents;
        byteString.getClass();
        return new LendingRenderData.PrePurchaseFinancingData(num, num2, l, l2, l3, l4, l5, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingRenderData.PrePurchaseFinancingData prePurchaseFinancingData = (LendingRenderData.PrePurchaseFinancingData) obj;
        prePurchaseFinancingData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, prePurchaseFinancingData.payment_number);
        protoAdapter.encodeWithTag(protoWriter, 2, prePurchaseFinancingData.number_of_payments);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 3, prePurchaseFinancingData.next_payment_due_at);
        protoAdapter2.encodeWithTag(protoWriter, 5, prePurchaseFinancingData.return_amount_cents);
        protoAdapter2.encodeWithTag(protoWriter, 6, prePurchaseFinancingData.order_total_cents);
        protoAdapter2.encodeWithTag(protoWriter, 7, prePurchaseFinancingData.total_return_amounts_cents);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, prePurchaseFinancingData.start_view_payment_plan_flow_url);
        protoAdapter2.encodeWithTag(protoWriter, 9, prePurchaseFinancingData.early_repayment_fee_refund_amounts_cents);
        protoWriter.writeBytes(prePurchaseFinancingData.unknownFields());
    }
}
