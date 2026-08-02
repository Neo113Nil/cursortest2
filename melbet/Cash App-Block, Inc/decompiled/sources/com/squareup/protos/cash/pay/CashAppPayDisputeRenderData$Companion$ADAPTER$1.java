package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pay.CashAppPayDisputeRenderData;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayDisputeRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayDisputeRenderData((String) obj4, (CashAppPayDisputeRenderData.DisputeState) obj5, (Money) obj6, (Money) obj7, (Money) obj8, (Money) obj9, m, (Long) obj10, (Long) obj11, (Long) obj12, (CashAppPayDisputeRenderData.DisputeReason) obj13, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj = obj4;
                    obj2 = obj10;
                    obj3 = obj11;
                    try {
                        obj4 = obj;
                        obj5 = CashAppPayDisputeRenderData.DisputeState.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj10 = obj2;
                    obj11 = obj3;
                    break;
                case 3:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    break;
                case 4:
                    obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                    break;
                case 5:
                    obj8 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj8);
                    break;
                case 6:
                    obj9 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj9);
                    break;
                case 7:
                    obj = obj4;
                    obj2 = obj10;
                    obj3 = obj11;
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    obj4 = obj;
                    obj10 = obj2;
                    obj11 = obj3;
                    break;
                case 8:
                    obj10 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 9:
                    obj11 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 10:
                    obj12 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 11:
                    try {
                        obj13 = CashAppPayDisputeRenderData.DisputeReason.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj4;
                        obj2 = obj10;
                        obj3 = obj11;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj10;
                    obj3 = obj11;
                    obj4 = obj;
                    obj10 = obj2;
                    obj11 = obj3;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayDisputeRenderData cashAppPayDisputeRenderData = (CashAppPayDisputeRenderData) obj;
        reverseProtoWriter.getClass();
        cashAppPayDisputeRenderData.getClass();
        reverseProtoWriter.writeBytes(cashAppPayDisputeRenderData.unknownFields());
        CashAppPayDisputeRenderData.DisputeReason.ADAPTER.encodeWithTag(reverseProtoWriter, 11, cashAppPayDisputeRenderData.reason);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, cashAppPayDisputeRenderData.resolution_required_by);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, cashAppPayDisputeRenderData.resolved_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, cashAppPayDisputeRenderData.initiated_at);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 7, cashAppPayDisputeRenderData.linked_payment_ids);
        ProtoAdapter protoAdapter3 = Money.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 6, cashAppPayDisputeRenderData.clawback_money);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, cashAppPayDisputeRenderData.final_money);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 4, cashAppPayDisputeRenderData.credit_money);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, cashAppPayDisputeRenderData.customer_disputed_money);
        CashAppPayDisputeRenderData.DisputeState.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cashAppPayDisputeRenderData.state);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, cashAppPayDisputeRenderData.dispute_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayDisputeRenderData cashAppPayDisputeRenderData = (CashAppPayDisputeRenderData) obj;
        cashAppPayDisputeRenderData.getClass();
        int size$okio = cashAppPayDisputeRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = CashAppPayDisputeRenderData.DisputeState.ADAPTER.encodedSizeWithTag(2, cashAppPayDisputeRenderData.state) + protoAdapter.encodedSizeWithTag(1, cashAppPayDisputeRenderData.dispute_id) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.asRepeated().encodedSizeWithTag(7, cashAppPayDisputeRenderData.linked_payment_ids) + protoAdapter2.encodedSizeWithTag(6, cashAppPayDisputeRenderData.clawback_money) + protoAdapter2.encodedSizeWithTag(5, cashAppPayDisputeRenderData.final_money) + protoAdapter2.encodedSizeWithTag(4, cashAppPayDisputeRenderData.credit_money) + protoAdapter2.encodedSizeWithTag(3, cashAppPayDisputeRenderData.customer_disputed_money) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        return CashAppPayDisputeRenderData.DisputeReason.ADAPTER.encodedSizeWithTag(11, cashAppPayDisputeRenderData.reason) + protoAdapter3.encodedSizeWithTag(10, cashAppPayDisputeRenderData.resolution_required_by) + protoAdapter3.encodedSizeWithTag(9, cashAppPayDisputeRenderData.resolved_at) + protoAdapter3.encodedSizeWithTag(8, cashAppPayDisputeRenderData.initiated_at) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayDisputeRenderData cashAppPayDisputeRenderData = (CashAppPayDisputeRenderData) obj;
        cashAppPayDisputeRenderData.getClass();
        Money money = cashAppPayDisputeRenderData.customer_disputed_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = cashAppPayDisputeRenderData.credit_money;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = cashAppPayDisputeRenderData.final_money;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = cashAppPayDisputeRenderData.clawback_money;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppPayDisputeRenderData.dispute_id;
        CashAppPayDisputeRenderData.DisputeState disputeState = cashAppPayDisputeRenderData.state;
        List list = cashAppPayDisputeRenderData.linked_payment_ids;
        Long l = cashAppPayDisputeRenderData.initiated_at;
        Long l2 = cashAppPayDisputeRenderData.resolved_at;
        Long l3 = cashAppPayDisputeRenderData.resolution_required_by;
        CashAppPayDisputeRenderData.DisputeReason disputeReason = cashAppPayDisputeRenderData.reason;
        list.getClass();
        byteString.getClass();
        return new CashAppPayDisputeRenderData(str, disputeState, money2, money4, money6, money8, list, l, l2, l3, disputeReason, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayDisputeRenderData cashAppPayDisputeRenderData = (CashAppPayDisputeRenderData) obj;
        cashAppPayDisputeRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashAppPayDisputeRenderData.dispute_id);
        CashAppPayDisputeRenderData.DisputeState.ADAPTER.encodeWithTag(protoWriter, 2, cashAppPayDisputeRenderData.state);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, cashAppPayDisputeRenderData.customer_disputed_money);
        protoAdapter2.encodeWithTag(protoWriter, 4, cashAppPayDisputeRenderData.credit_money);
        protoAdapter2.encodeWithTag(protoWriter, 5, cashAppPayDisputeRenderData.final_money);
        protoAdapter2.encodeWithTag(protoWriter, 6, cashAppPayDisputeRenderData.clawback_money);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 7, cashAppPayDisputeRenderData.linked_payment_ids);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 8, cashAppPayDisputeRenderData.initiated_at);
        protoAdapter3.encodeWithTag(protoWriter, 9, cashAppPayDisputeRenderData.resolved_at);
        protoAdapter3.encodeWithTag(protoWriter, 10, cashAppPayDisputeRenderData.resolution_required_by);
        CashAppPayDisputeRenderData.DisputeReason.ADAPTER.encodeWithTag(protoWriter, 11, cashAppPayDisputeRenderData.reason);
        protoWriter.writeBytes(cashAppPayDisputeRenderData.unknownFields());
    }
}
