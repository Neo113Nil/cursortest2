package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.PaymentPlanEligibilityRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaymentPlanEligibilityRenderData$EligibilityUiData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaymentPlanEligibilityRenderData.EligibilityUiData((PaymentPlanEligibilityRenderData.LoanDuration) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(PaymentPlanEligibilityRenderData.LoanDuration.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentPlanEligibilityRenderData.EligibilityUiData eligibilityUiData = (PaymentPlanEligibilityRenderData.EligibilityUiData) obj;
        reverseProtoWriter.getClass();
        eligibilityUiData.getClass();
        reverseProtoWriter.writeBytes(eligibilityUiData.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, eligibilityUiData.start_plasma_flow_url);
        PaymentPlanEligibilityRenderData.LoanDuration.ADAPTER.encodeWithTag(reverseProtoWriter, 1, eligibilityUiData.loan_duration);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentPlanEligibilityRenderData.EligibilityUiData eligibilityUiData = (PaymentPlanEligibilityRenderData.EligibilityUiData) obj;
        eligibilityUiData.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, eligibilityUiData.start_plasma_flow_url) + PaymentPlanEligibilityRenderData.LoanDuration.ADAPTER.encodedSizeWithTag(1, eligibilityUiData.loan_duration) + eligibilityUiData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentPlanEligibilityRenderData.EligibilityUiData eligibilityUiData = (PaymentPlanEligibilityRenderData.EligibilityUiData) obj;
        eligibilityUiData.getClass();
        PaymentPlanEligibilityRenderData.LoanDuration loanDuration = eligibilityUiData.loan_duration;
        PaymentPlanEligibilityRenderData.LoanDuration loanDuration2 = loanDuration != null ? (PaymentPlanEligibilityRenderData.LoanDuration) PaymentPlanEligibilityRenderData.LoanDuration.ADAPTER.redact(loanDuration) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = eligibilityUiData.start_plasma_flow_url;
        byteString.getClass();
        return new PaymentPlanEligibilityRenderData.EligibilityUiData(loanDuration2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentPlanEligibilityRenderData.EligibilityUiData eligibilityUiData = (PaymentPlanEligibilityRenderData.EligibilityUiData) obj;
        eligibilityUiData.getClass();
        PaymentPlanEligibilityRenderData.LoanDuration.ADAPTER.encodeWithTag(protoWriter, 1, eligibilityUiData.loan_duration);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, eligibilityUiData.start_plasma_flow_url);
        protoWriter.writeBytes(eligibilityUiData.unknownFields());
    }
}
