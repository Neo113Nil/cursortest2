package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.PaymentPlanEligibilityRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaymentPlanEligibilityRenderData$EligibleUiData$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaymentPlanEligibilityRenderData.EligibleUiData((PaymentPlanEligibilityRenderData.LoanDuration) obj, (String) obj2, (Money) obj3, (Boolean) obj4, (String) obj5, (Money) obj6, (Boolean) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(PaymentPlanEligibilityRenderData.LoanDuration.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentPlanEligibilityRenderData.EligibleUiData eligibleUiData = (PaymentPlanEligibilityRenderData.EligibleUiData) obj;
        reverseProtoWriter.getClass();
        eligibleUiData.getClass();
        reverseProtoWriter.writeBytes(eligibleUiData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, eligibleUiData.is_partial_retro);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, eligibleUiData.eligible_loan_amount);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, eligibleUiData.url_to_open);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, eligibleUiData.has_downpayment);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, eligibleUiData.eligible_amount);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, eligibleUiData.start_plasma_flow_url);
        PaymentPlanEligibilityRenderData.LoanDuration.ADAPTER.encodeWithTag(reverseProtoWriter, 1, eligibleUiData.loan_duration);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentPlanEligibilityRenderData.EligibleUiData eligibleUiData = (PaymentPlanEligibilityRenderData.EligibleUiData) obj;
        eligibleUiData.getClass();
        int encodedSizeWithTag = PaymentPlanEligibilityRenderData.LoanDuration.ADAPTER.encodedSizeWithTag(1, eligibleUiData.loan_duration) + eligibleUiData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, eligibleUiData.start_plasma_flow_url) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(3, eligibleUiData.eligible_amount) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        return protoAdapter3.encodedSizeWithTag(7, eligibleUiData.is_partial_retro) + protoAdapter2.encodedSizeWithTag(6, eligibleUiData.eligible_loan_amount) + protoAdapter.encodedSizeWithTag(5, eligibleUiData.url_to_open) + protoAdapter3.encodedSizeWithTag(4, eligibleUiData.has_downpayment) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentPlanEligibilityRenderData.EligibleUiData eligibleUiData = (PaymentPlanEligibilityRenderData.EligibleUiData) obj;
        eligibleUiData.getClass();
        PaymentPlanEligibilityRenderData.LoanDuration loanDuration = eligibleUiData.loan_duration;
        PaymentPlanEligibilityRenderData.LoanDuration loanDuration2 = loanDuration != null ? (PaymentPlanEligibilityRenderData.LoanDuration) PaymentPlanEligibilityRenderData.LoanDuration.ADAPTER.redact(loanDuration) : null;
        Money money = eligibleUiData.eligible_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = eligibleUiData.eligible_loan_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = eligibleUiData.start_plasma_flow_url;
        Boolean bool = eligibleUiData.has_downpayment;
        String str2 = eligibleUiData.url_to_open;
        Boolean bool2 = eligibleUiData.is_partial_retro;
        byteString.getClass();
        return new PaymentPlanEligibilityRenderData.EligibleUiData(loanDuration2, str, money2, bool, str2, money4, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentPlanEligibilityRenderData.EligibleUiData eligibleUiData = (PaymentPlanEligibilityRenderData.EligibleUiData) obj;
        eligibleUiData.getClass();
        PaymentPlanEligibilityRenderData.LoanDuration.ADAPTER.encodeWithTag(protoWriter, 1, eligibleUiData.loan_duration);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, eligibleUiData.start_plasma_flow_url);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, eligibleUiData.eligible_amount);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 4, eligibleUiData.has_downpayment);
        protoAdapter.encodeWithTag(protoWriter, 5, eligibleUiData.url_to_open);
        protoAdapter2.encodeWithTag(protoWriter, 6, eligibleUiData.eligible_loan_amount);
        protoAdapter3.encodeWithTag(protoWriter, 7, eligibleUiData.is_partial_retro);
        protoWriter.writeBytes(eligibleUiData.unknownFields());
    }
}
