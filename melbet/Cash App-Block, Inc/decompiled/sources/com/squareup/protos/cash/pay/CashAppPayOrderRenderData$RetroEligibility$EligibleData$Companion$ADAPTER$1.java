package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayOrderRenderData$RetroEligibility$EligibleData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashAppPayOrderRenderData.RetroEligibility.EligibleData((String) obj, (Money) obj2, (Boolean) obj3, (CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration) obj4, (Money) obj5, (Boolean) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayOrderRenderData.RetroEligibility.EligibleData eligibleData = (CashAppPayOrderRenderData.RetroEligibility.EligibleData) obj;
        reverseProtoWriter.getClass();
        eligibleData.getClass();
        reverseProtoWriter.writeBytes(eligibleData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, eligibleData.is_partial_retro);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, eligibleData.eligible_loan_money);
        CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration.ADAPTER.encodeWithTag(reverseProtoWriter, 4, eligibleData.loan_duration);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, eligibleData.has_downpayment);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, eligibleData.eligible_amount);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, eligibleData.convert_to_payment_plan_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayOrderRenderData.RetroEligibility.EligibleData eligibleData = (CashAppPayOrderRenderData.RetroEligibility.EligibleData) obj;
        eligibleData.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, eligibleData.convert_to_payment_plan_url) + eligibleData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, eligibleData.eligible_amount) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(6, eligibleData.is_partial_retro) + protoAdapter.encodedSizeWithTag(5, eligibleData.eligible_loan_money) + CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration.ADAPTER.encodedSizeWithTag(4, eligibleData.loan_duration) + protoAdapter2.encodedSizeWithTag(3, eligibleData.has_downpayment) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayOrderRenderData.RetroEligibility.EligibleData eligibleData = (CashAppPayOrderRenderData.RetroEligibility.EligibleData) obj;
        eligibleData.getClass();
        Money money = eligibleData.eligible_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration loanDuration = eligibleData.loan_duration;
        CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration loanDuration2 = loanDuration != null ? (CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration) CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration.ADAPTER.redact(loanDuration) : null;
        Money money3 = eligibleData.eligible_loan_money;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = eligibleData.convert_to_payment_plan_url;
        Boolean bool = eligibleData.has_downpayment;
        Boolean bool2 = eligibleData.is_partial_retro;
        byteString.getClass();
        return new CashAppPayOrderRenderData.RetroEligibility.EligibleData(str, money2, bool, loanDuration2, money4, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayOrderRenderData.RetroEligibility.EligibleData eligibleData = (CashAppPayOrderRenderData.RetroEligibility.EligibleData) obj;
        eligibleData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, eligibleData.convert_to_payment_plan_url);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, eligibleData.eligible_amount);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 3, eligibleData.has_downpayment);
        CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration.ADAPTER.encodeWithTag(protoWriter, 4, eligibleData.loan_duration);
        protoAdapter.encodeWithTag(protoWriter, 5, eligibleData.eligible_loan_money);
        protoAdapter2.encodeWithTag(protoWriter, 6, eligibleData.is_partial_retro);
        protoWriter.writeBytes(eligibleData.unknownFields());
    }
}
