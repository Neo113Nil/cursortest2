package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.pay.CashAppPayRefundRenderData;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayRefundRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Long l;
        Long l2;
        Long l3;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Long l4 = null;
        Long l5 = null;
        Long l6 = null;
        Long l7 = null;
        Long l8 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        CashAppPayRefundRenderData.RefundState refundState = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayRefundRenderData(str, (CashAppPayMerchantRenderData) obj2, refundState, (Money) obj3, (Money) obj4, l4, l5, l6, l7, l8, str2, str3, (CashAppPayInstrumentRenderData) obj, str4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(CashAppPayMerchantRenderData.ADAPTER, protoReader, obj2);
                    decode = str;
                    break;
                case 3:
                default:
                    protoReader.readUnknownField(nextTag);
                    l = l4;
                    l2 = l5;
                    l3 = l6;
                    decode = str;
                    l4 = l;
                    l5 = l2;
                    l6 = l3;
                    break;
                case 4:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    decode = str;
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    decode = str;
                    break;
                case 6:
                    l4 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 7:
                    l5 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 8:
                    l6 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 9:
                    l7 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 10:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 11:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 12:
                    obj = TransactorKt.decodeMessageOrMerge(CashAppPayInstrumentRenderData.ADAPTER, protoReader, obj);
                    decode = str;
                    break;
                case 13:
                    try {
                        refundState = CashAppPayRefundRenderData.RefundState.ADAPTER.decode(protoReader);
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        l = l4;
                        l2 = l5;
                        l3 = l6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 14:
                    l8 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 15:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
            }
            str = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayRefundRenderData cashAppPayRefundRenderData = (CashAppPayRefundRenderData) obj;
        reverseProtoWriter.getClass();
        cashAppPayRefundRenderData.getClass();
        reverseProtoWriter.writeBytes(cashAppPayRefundRenderData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, cashAppPayRefundRenderData.associated_order_id);
        CashAppPayInstrumentRenderData.ADAPTER.encodeWithTag(reverseProtoWriter, 12, cashAppPayRefundRenderData.instrument);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, cashAppPayRefundRenderData.linked_payment_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, cashAppPayRefundRenderData.instrument_display_name);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 14, cashAppPayRefundRenderData.display_date);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, cashAppPayRefundRenderData.failed_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, cashAppPayRefundRenderData.captured_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, cashAppPayRefundRenderData.voided_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, cashAppPayRefundRenderData.authorized_at);
        ProtoAdapter protoAdapter3 = Money.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, cashAppPayRefundRenderData.discount_reclaimed_money);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 4, cashAppPayRefundRenderData.total_money);
        CashAppPayRefundRenderData.RefundState.ADAPTER.encodeWithTag(reverseProtoWriter, 13, cashAppPayRefundRenderData.refund_state);
        CashAppPayMerchantRenderData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cashAppPayRefundRenderData.merchant);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cashAppPayRefundRenderData.refund_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayRefundRenderData cashAppPayRefundRenderData = (CashAppPayRefundRenderData) obj;
        cashAppPayRefundRenderData.getClass();
        int size$okio = cashAppPayRefundRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = CashAppPayRefundRenderData.RefundState.ADAPTER.encodedSizeWithTag(13, cashAppPayRefundRenderData.refund_state) + CashAppPayMerchantRenderData.ADAPTER.encodedSizeWithTag(2, cashAppPayRefundRenderData.merchant) + protoAdapter.encodedSizeWithTag(1, cashAppPayRefundRenderData.refund_id) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(5, cashAppPayRefundRenderData.discount_reclaimed_money) + protoAdapter2.encodedSizeWithTag(4, cashAppPayRefundRenderData.total_money) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(15, cashAppPayRefundRenderData.associated_order_id) + CashAppPayInstrumentRenderData.ADAPTER.encodedSizeWithTag(12, cashAppPayRefundRenderData.instrument) + protoAdapter.encodedSizeWithTag(11, cashAppPayRefundRenderData.linked_payment_id) + protoAdapter.encodedSizeWithTag(10, cashAppPayRefundRenderData.instrument_display_name) + protoAdapter3.encodedSizeWithTag(14, cashAppPayRefundRenderData.display_date) + protoAdapter3.encodedSizeWithTag(9, cashAppPayRefundRenderData.failed_at) + protoAdapter3.encodedSizeWithTag(8, cashAppPayRefundRenderData.captured_at) + protoAdapter3.encodedSizeWithTag(7, cashAppPayRefundRenderData.voided_at) + protoAdapter3.encodedSizeWithTag(6, cashAppPayRefundRenderData.authorized_at) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayRefundRenderData cashAppPayRefundRenderData = (CashAppPayRefundRenderData) obj;
        cashAppPayRefundRenderData.getClass();
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = cashAppPayRefundRenderData.merchant;
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData2 = cashAppPayMerchantRenderData != null ? (CashAppPayMerchantRenderData) CashAppPayMerchantRenderData.ADAPTER.redact(cashAppPayMerchantRenderData) : null;
        Money money = cashAppPayRefundRenderData.total_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = cashAppPayRefundRenderData.discount_reclaimed_money;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData = cashAppPayRefundRenderData.instrument;
        CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData2 = cashAppPayInstrumentRenderData != null ? (CashAppPayInstrumentRenderData) CashAppPayInstrumentRenderData.ADAPTER.redact(cashAppPayInstrumentRenderData) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppPayRefundRenderData.refund_id;
        CashAppPayRefundRenderData.RefundState refundState = cashAppPayRefundRenderData.refund_state;
        Long l = cashAppPayRefundRenderData.authorized_at;
        Long l2 = cashAppPayRefundRenderData.voided_at;
        Long l3 = cashAppPayRefundRenderData.captured_at;
        Long l4 = cashAppPayRefundRenderData.failed_at;
        Long l5 = cashAppPayRefundRenderData.display_date;
        String str2 = cashAppPayRefundRenderData.instrument_display_name;
        String str3 = cashAppPayRefundRenderData.linked_payment_id;
        String str4 = cashAppPayRefundRenderData.associated_order_id;
        byteString.getClass();
        return new CashAppPayRefundRenderData(str, cashAppPayMerchantRenderData2, refundState, money2, money4, l, l2, l3, l4, l5, str2, str3, cashAppPayInstrumentRenderData2, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayRefundRenderData cashAppPayRefundRenderData = (CashAppPayRefundRenderData) obj;
        cashAppPayRefundRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashAppPayRefundRenderData.refund_id);
        CashAppPayMerchantRenderData.ADAPTER.encodeWithTag(protoWriter, 2, cashAppPayRefundRenderData.merchant);
        CashAppPayRefundRenderData.RefundState.ADAPTER.encodeWithTag(protoWriter, 13, cashAppPayRefundRenderData.refund_state);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, cashAppPayRefundRenderData.total_money);
        protoAdapter2.encodeWithTag(protoWriter, 5, cashAppPayRefundRenderData.discount_reclaimed_money);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 6, cashAppPayRefundRenderData.authorized_at);
        protoAdapter3.encodeWithTag(protoWriter, 7, cashAppPayRefundRenderData.voided_at);
        protoAdapter3.encodeWithTag(protoWriter, 8, cashAppPayRefundRenderData.captured_at);
        protoAdapter3.encodeWithTag(protoWriter, 9, cashAppPayRefundRenderData.failed_at);
        protoAdapter3.encodeWithTag(protoWriter, 14, cashAppPayRefundRenderData.display_date);
        protoAdapter.encodeWithTag(protoWriter, 10, cashAppPayRefundRenderData.instrument_display_name);
        protoAdapter.encodeWithTag(protoWriter, 11, cashAppPayRefundRenderData.linked_payment_id);
        CashAppPayInstrumentRenderData.ADAPTER.encodeWithTag(protoWriter, 12, cashAppPayRefundRenderData.instrument);
        protoAdapter.encodeWithTag(protoWriter, 15, cashAppPayRefundRenderData.associated_order_id);
        protoWriter.writeBytes(cashAppPayRefundRenderData.unknownFields());
    }
}
