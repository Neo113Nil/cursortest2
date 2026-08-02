package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.pay.CashAppPayRenderData;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayRenderData$Dispute$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayRenderData.Dispute((String) obj, (CashAppPayRenderData.Dispute.State) obj2, (Money) obj3, (Money) obj4, (Money) obj5, (Money) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                switch (nextTag) {
                    case 6:
                        obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                        break;
                    case 7:
                        obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                        break;
                    case 8:
                        obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                        break;
                    case 9:
                        obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                        break;
                    default:
                        protoReader.readUnknownField(nextTag);
                        break;
                }
            } else {
                try {
                    obj2 = CashAppPayRenderData.Dispute.State.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayRenderData.Dispute dispute = (CashAppPayRenderData.Dispute) obj;
        reverseProtoWriter.getClass();
        dispute.getClass();
        reverseProtoWriter.writeBytes(dispute.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, dispute.customer_dispute_clawback_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, dispute.customer_dispute_final_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, dispute.customer_dispute_credit_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, dispute.customer_disputed_money);
        CashAppPayRenderData.Dispute.State.ADAPTER.encodeWithTag(reverseProtoWriter, 2, dispute.state);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, dispute.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayRenderData.Dispute dispute = (CashAppPayRenderData.Dispute) obj;
        dispute.getClass();
        int encodedSizeWithTag = CashAppPayRenderData.Dispute.State.ADAPTER.encodedSizeWithTag(2, dispute.state) + ProtoAdapter.STRING.encodedSizeWithTag(1, dispute.token) + dispute.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(9, dispute.customer_dispute_clawback_money) + protoAdapter.encodedSizeWithTag(8, dispute.customer_dispute_final_money) + protoAdapter.encodedSizeWithTag(7, dispute.customer_dispute_credit_money) + protoAdapter.encodedSizeWithTag(6, dispute.customer_disputed_money) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayRenderData.Dispute dispute = (CashAppPayRenderData.Dispute) obj;
        dispute.getClass();
        Money money = dispute.customer_disputed_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = dispute.customer_dispute_credit_money;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = dispute.customer_dispute_final_money;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = dispute.customer_dispute_clawback_money;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = dispute.token;
        CashAppPayRenderData.Dispute.State state = dispute.state;
        byteString.getClass();
        return new CashAppPayRenderData.Dispute(str, state, money2, money4, money6, money8, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayRenderData.Dispute dispute = (CashAppPayRenderData.Dispute) obj;
        dispute.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, dispute.token);
        CashAppPayRenderData.Dispute.State.ADAPTER.encodeWithTag(protoWriter, 2, dispute.state);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 6, dispute.customer_disputed_money);
        protoAdapter.encodeWithTag(protoWriter, 7, dispute.customer_dispute_credit_money);
        protoAdapter.encodeWithTag(protoWriter, 8, dispute.customer_dispute_final_money);
        protoAdapter.encodeWithTag(protoWriter, 9, dispute.customer_dispute_clawback_money);
        protoWriter.writeBytes(dispute.unknownFields());
    }
}
