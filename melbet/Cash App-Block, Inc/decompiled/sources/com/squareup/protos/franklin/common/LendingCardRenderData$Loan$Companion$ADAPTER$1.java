package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.LendingCardRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingCardRenderData$Loan$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LendingCardRenderData.Loan((String) obj, (Integer) obj2, (Money) obj3, (Money) obj4, (Money) obj5, (Money) obj6, (Money) obj7, (String) obj8, (String) obj9, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 3:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 4:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    break;
                case 7:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    break;
                case 8:
                    obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                    break;
                case 9:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingCardRenderData.Loan loan = (LendingCardRenderData.Loan) obj;
        reverseProtoWriter.getClass();
        loan.getClass();
        reverseProtoWriter.writeBytes(loan.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, loan.order_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, loan.start_view_payment_plan_flow_url);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, loan.outstanding_loan_balance_amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, loan.paid_so_far_amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, loan.setup_fee_amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, loan.financed_principal_amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, loan.down_payment_amount);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, loan.number_of_payments);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, loan.loan_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingCardRenderData.Loan loan = (LendingCardRenderData.Loan) obj;
        loan.getClass();
        int size$okio = loan.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, loan.number_of_payments) + protoAdapter.encodedSizeWithTag(1, loan.loan_token) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(10, loan.order_id) + protoAdapter.encodedSizeWithTag(9, loan.start_view_payment_plan_flow_url) + protoAdapter2.encodedSizeWithTag(8, loan.outstanding_loan_balance_amount) + protoAdapter2.encodedSizeWithTag(7, loan.paid_so_far_amount) + protoAdapter2.encodedSizeWithTag(6, loan.setup_fee_amount) + protoAdapter2.encodedSizeWithTag(5, loan.financed_principal_amount) + protoAdapter2.encodedSizeWithTag(4, loan.down_payment_amount) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingCardRenderData.Loan loan = (LendingCardRenderData.Loan) obj;
        loan.getClass();
        Money money = loan.down_payment_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = loan.financed_principal_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = loan.setup_fee_amount;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = loan.paid_so_far_amount;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        Money money9 = loan.outstanding_loan_balance_amount;
        Money money10 = money9 != null ? (Money) Money.ADAPTER.redact(money9) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = loan.loan_token;
        Integer num = loan.number_of_payments;
        String str2 = loan.start_view_payment_plan_flow_url;
        String str3 = loan.order_id;
        byteString.getClass();
        return new LendingCardRenderData.Loan(str, num, money2, money4, money6, money8, money10, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingCardRenderData.Loan loan = (LendingCardRenderData.Loan) obj;
        loan.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, loan.loan_token);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, loan.number_of_payments);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, loan.down_payment_amount);
        protoAdapter2.encodeWithTag(protoWriter, 5, loan.financed_principal_amount);
        protoAdapter2.encodeWithTag(protoWriter, 6, loan.setup_fee_amount);
        protoAdapter2.encodeWithTag(protoWriter, 7, loan.paid_so_far_amount);
        protoAdapter2.encodeWithTag(protoWriter, 8, loan.outstanding_loan_balance_amount);
        protoAdapter.encodeWithTag(protoWriter, 9, loan.start_view_payment_plan_flow_url);
        protoAdapter.encodeWithTag(protoWriter, 10, loan.order_id);
        protoWriter.writeBytes(loan.unknownFields());
    }
}
