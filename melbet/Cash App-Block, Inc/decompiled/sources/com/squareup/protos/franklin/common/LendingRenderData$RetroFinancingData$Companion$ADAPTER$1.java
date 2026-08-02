package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingRenderData$RetroFinancingData$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj9 = null;
        Object obj10 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LendingRenderData.RetroFinancingData((String) obj, (Integer) obj2, (Integer) obj3, (Long) obj4, (Long) obj5, (Long) obj6, (Long) obj7, (Boolean) obj8, (Long) obj9, (Boolean) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.INT32.decode(protoReader);
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
                    obj8 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 9:
                    obj9 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 10:
                    obj10 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingRenderData.RetroFinancingData retroFinancingData = (LendingRenderData.RetroFinancingData) obj;
        reverseProtoWriter.getClass();
        retroFinancingData.getClass();
        reverseProtoWriter.writeBytes(retroFinancingData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, retroFinancingData.is_p2p_eligible_customer);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, retroFinancingData.early_repayment_fee_refund_amounts_cents);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, retroFinancingData.is_final_payment);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, retroFinancingData.next_payment_due_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, retroFinancingData.total_return_amounts_cents);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, retroFinancingData.order_total_cents);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, retroFinancingData.return_amount_cents);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, retroFinancingData.number_of_payments);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, retroFinancingData.payment_number);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, retroFinancingData.start_view_payment_plan_flow_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingRenderData.RetroFinancingData retroFinancingData = (LendingRenderData.RetroFinancingData) obj;
        retroFinancingData.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, retroFinancingData.start_view_payment_plan_flow_url) + retroFinancingData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, retroFinancingData.number_of_payments) + protoAdapter.encodedSizeWithTag(2, retroFinancingData.payment_number) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(7, retroFinancingData.next_payment_due_at) + protoAdapter2.encodedSizeWithTag(6, retroFinancingData.total_return_amounts_cents) + protoAdapter2.encodedSizeWithTag(5, retroFinancingData.order_total_cents) + protoAdapter2.encodedSizeWithTag(4, retroFinancingData.return_amount_cents) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        return protoAdapter3.encodedSizeWithTag(10, retroFinancingData.is_p2p_eligible_customer) + protoAdapter2.encodedSizeWithTag(9, retroFinancingData.early_repayment_fee_refund_amounts_cents) + protoAdapter3.encodedSizeWithTag(8, retroFinancingData.is_final_payment) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingRenderData.RetroFinancingData retroFinancingData = (LendingRenderData.RetroFinancingData) obj;
        retroFinancingData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = retroFinancingData.start_view_payment_plan_flow_url;
        Integer num = retroFinancingData.payment_number;
        Integer num2 = retroFinancingData.number_of_payments;
        Long l = retroFinancingData.return_amount_cents;
        Long l2 = retroFinancingData.order_total_cents;
        Long l3 = retroFinancingData.total_return_amounts_cents;
        Long l4 = retroFinancingData.next_payment_due_at;
        Boolean bool = retroFinancingData.is_final_payment;
        Long l5 = retroFinancingData.early_repayment_fee_refund_amounts_cents;
        Boolean bool2 = retroFinancingData.is_p2p_eligible_customer;
        byteString.getClass();
        return new LendingRenderData.RetroFinancingData(str, num, num2, l, l2, l3, l4, bool, l5, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingRenderData.RetroFinancingData retroFinancingData = (LendingRenderData.RetroFinancingData) obj;
        retroFinancingData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, retroFinancingData.start_view_payment_plan_flow_url);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 2, retroFinancingData.payment_number);
        protoAdapter.encodeWithTag(protoWriter, 3, retroFinancingData.number_of_payments);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 4, retroFinancingData.return_amount_cents);
        protoAdapter2.encodeWithTag(protoWriter, 5, retroFinancingData.order_total_cents);
        protoAdapter2.encodeWithTag(protoWriter, 6, retroFinancingData.total_return_amounts_cents);
        protoAdapter2.encodeWithTag(protoWriter, 7, retroFinancingData.next_payment_due_at);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 8, retroFinancingData.is_final_payment);
        protoAdapter2.encodeWithTag(protoWriter, 9, retroFinancingData.early_repayment_fee_refund_amounts_cents);
        protoAdapter3.encodeWithTag(protoWriter, 10, retroFinancingData.is_p2p_eligible_customer);
        protoWriter.writeBytes(retroFinancingData.unknownFields());
    }
}
