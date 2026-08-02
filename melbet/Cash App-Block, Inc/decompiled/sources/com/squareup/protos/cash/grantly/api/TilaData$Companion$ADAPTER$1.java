package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TilaData$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0023. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj2 = null;
        Object obj3 = null;
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
        Object obj14 = null;
        Object obj15 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj16 = obj7;
            if (nextTag == -1) {
                return new TilaData((Long) obj3, (Money) obj4, (Money) obj5, (Money) obj6, (Long) obj15, (Integer) obj16, (Long) obj8, (Long) obj9, (Money) obj10, (Integer) obj11, (Money) obj12, (Long) obj13, (LoanParty) obj14, (LoanParty) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT64.decode(protoReader);
                    obj7 = obj16;
                    break;
                case 2:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    obj = obj3;
                    obj7 = obj16;
                    break;
                case 3:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    obj = obj3;
                    obj7 = obj16;
                    break;
                case 4:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    obj = obj3;
                    obj7 = obj16;
                    break;
                case 5:
                    obj15 = ProtoAdapter.INT64.decode(protoReader);
                    obj7 = obj16;
                    obj = obj3;
                    break;
                case 6:
                    obj7 = ProtoAdapter.INT32.decode(protoReader);
                    obj = obj3;
                    break;
                case 7:
                    obj8 = ProtoAdapter.INT64.decode(protoReader);
                    obj7 = obj16;
                    obj = obj3;
                    break;
                case 8:
                    obj9 = ProtoAdapter.INT64.decode(protoReader);
                    obj7 = obj16;
                    obj = obj3;
                    break;
                case 9:
                    obj10 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj10);
                    obj7 = obj16;
                    obj = obj3;
                    break;
                case 10:
                    obj11 = ProtoAdapter.INT32.decode(protoReader);
                    obj7 = obj16;
                    obj = obj3;
                    break;
                case 11:
                    obj12 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj12);
                    obj7 = obj16;
                    obj = obj3;
                    break;
                case 12:
                    obj13 = ProtoAdapter.INT64.decode(protoReader);
                    obj7 = obj16;
                    obj = obj3;
                    break;
                case 13:
                    obj14 = TransactorKt.decodeMessageOrMerge(LoanParty.ADAPTER, protoReader, obj14);
                    obj7 = obj16;
                    obj = obj3;
                    break;
                case 14:
                    obj2 = TransactorKt.decodeMessageOrMerge(LoanParty.ADAPTER, protoReader, obj2);
                    obj = obj3;
                    obj7 = obj16;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    obj7 = obj16;
                    break;
            }
            obj3 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TilaData tilaData = (TilaData) obj;
        reverseProtoWriter.getClass();
        tilaData.getClass();
        reverseProtoWriter.writeBytes(tilaData.unknownFields());
        ProtoAdapter protoAdapter = LoanParty.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, tilaData.borrower);
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, tilaData.lender);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, tilaData.setup_fee_BPS);
        ProtoAdapter protoAdapter3 = Money.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 11, tilaData.late_fee_amount);
        ProtoAdapter protoAdapter4 = ProtoAdapter.INT32;
        protoAdapter4.encodeWithTag(reverseProtoWriter, 10, tilaData.late_fee_grace_period_days);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 9, tilaData.amount_due_on_due_date);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, tilaData.final_due_date);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, tilaData.flat_fee_as_daily_fee_bps);
        protoAdapter4.encodeWithTag(reverseProtoWriter, 6, tilaData.loan_duration_days);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, tilaData.apr_bps);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 4, tilaData.total_of_payments);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, tilaData.finance_charge);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, tilaData.amount_financed);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, tilaData.date_borrowed);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TilaData tilaData = (TilaData) obj;
        tilaData.getClass();
        int size$okio = tilaData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, tilaData.date_borrowed) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(5, tilaData.apr_bps) + protoAdapter2.encodedSizeWithTag(4, tilaData.total_of_payments) + protoAdapter2.encodedSizeWithTag(3, tilaData.finance_charge) + protoAdapter2.encodedSizeWithTag(2, tilaData.amount_financed) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(12, tilaData.setup_fee_BPS) + protoAdapter2.encodedSizeWithTag(11, tilaData.late_fee_amount) + protoAdapter3.encodedSizeWithTag(10, tilaData.late_fee_grace_period_days) + protoAdapter2.encodedSizeWithTag(9, tilaData.amount_due_on_due_date) + protoAdapter.encodedSizeWithTag(8, tilaData.final_due_date) + protoAdapter.encodedSizeWithTag(7, tilaData.flat_fee_as_daily_fee_bps) + protoAdapter3.encodedSizeWithTag(6, tilaData.loan_duration_days) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter4 = LoanParty.ADAPTER;
        return protoAdapter4.encodedSizeWithTag(14, tilaData.borrower) + protoAdapter4.encodedSizeWithTag(13, tilaData.lender) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TilaData tilaData = (TilaData) obj;
        tilaData.getClass();
        Money money = tilaData.amount_financed;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = tilaData.finance_charge;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = tilaData.total_of_payments;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = tilaData.amount_due_on_due_date;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        Money money9 = tilaData.late_fee_amount;
        Money money10 = money9 != null ? (Money) Money.ADAPTER.redact(money9) : null;
        LoanParty loanParty = tilaData.lender;
        LoanParty loanParty2 = loanParty != null ? (LoanParty) LoanParty.ADAPTER.redact(loanParty) : null;
        LoanParty loanParty3 = tilaData.borrower;
        LoanParty loanParty4 = loanParty3 != null ? (LoanParty) LoanParty.ADAPTER.redact(loanParty3) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = tilaData.date_borrowed;
        Long l2 = tilaData.apr_bps;
        Integer num = tilaData.loan_duration_days;
        Long l3 = tilaData.flat_fee_as_daily_fee_bps;
        Long l4 = tilaData.final_due_date;
        Integer num2 = tilaData.late_fee_grace_period_days;
        Long l5 = tilaData.setup_fee_BPS;
        byteString.getClass();
        return new TilaData(l, money2, money4, money6, l2, num, l3, l4, money8, num2, money10, l5, loanParty2, loanParty4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TilaData tilaData = (TilaData) obj;
        tilaData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, tilaData.date_borrowed);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 2, tilaData.amount_financed);
        protoAdapter2.encodeWithTag(protoWriter, 3, tilaData.finance_charge);
        protoAdapter2.encodeWithTag(protoWriter, 4, tilaData.total_of_payments);
        protoAdapter.encodeWithTag(protoWriter, 5, tilaData.apr_bps);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(protoWriter, 6, tilaData.loan_duration_days);
        protoAdapter.encodeWithTag(protoWriter, 7, tilaData.flat_fee_as_daily_fee_bps);
        protoAdapter.encodeWithTag(protoWriter, 8, tilaData.final_due_date);
        protoAdapter2.encodeWithTag(protoWriter, 9, tilaData.amount_due_on_due_date);
        protoAdapter3.encodeWithTag(protoWriter, 10, tilaData.late_fee_grace_period_days);
        protoAdapter2.encodeWithTag(protoWriter, 11, tilaData.late_fee_amount);
        protoAdapter.encodeWithTag(protoWriter, 12, tilaData.setup_fee_BPS);
        ProtoAdapter protoAdapter4 = LoanParty.ADAPTER;
        protoAdapter4.encodeWithTag(protoWriter, 13, tilaData.lender);
        protoAdapter4.encodeWithTag(protoWriter, 14, tilaData.borrower);
        protoWriter.writeBytes(tilaData.unknownFields());
    }
}
