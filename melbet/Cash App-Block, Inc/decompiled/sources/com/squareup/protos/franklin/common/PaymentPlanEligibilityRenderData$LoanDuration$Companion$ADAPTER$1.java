package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.PaymentPlanEligibilityRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaymentPlanEligibilityRenderData$LoanDuration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaymentPlanEligibilityRenderData.LoanDuration((PaymentPlanEligibilityRenderData.LoanDuration.TimeUnit) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = PaymentPlanEligibilityRenderData.LoanDuration.TimeUnit.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentPlanEligibilityRenderData.LoanDuration loanDuration = (PaymentPlanEligibilityRenderData.LoanDuration) obj;
        reverseProtoWriter.getClass();
        loanDuration.getClass();
        reverseProtoWriter.writeBytes(loanDuration.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, loanDuration.amount);
        PaymentPlanEligibilityRenderData.LoanDuration.TimeUnit.ADAPTER.encodeWithTag(reverseProtoWriter, 1, loanDuration.time_unit);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentPlanEligibilityRenderData.LoanDuration loanDuration = (PaymentPlanEligibilityRenderData.LoanDuration) obj;
        loanDuration.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, loanDuration.amount) + PaymentPlanEligibilityRenderData.LoanDuration.TimeUnit.ADAPTER.encodedSizeWithTag(1, loanDuration.time_unit) + loanDuration.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentPlanEligibilityRenderData.LoanDuration loanDuration = (PaymentPlanEligibilityRenderData.LoanDuration) obj;
        loanDuration.getClass();
        ByteString byteString = ByteString.EMPTY;
        PaymentPlanEligibilityRenderData.LoanDuration.TimeUnit timeUnit = loanDuration.time_unit;
        Long l = loanDuration.amount;
        byteString.getClass();
        return new PaymentPlanEligibilityRenderData.LoanDuration(timeUnit, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentPlanEligibilityRenderData.LoanDuration loanDuration = (PaymentPlanEligibilityRenderData.LoanDuration) obj;
        loanDuration.getClass();
        PaymentPlanEligibilityRenderData.LoanDuration.TimeUnit.ADAPTER.encodeWithTag(protoWriter, 1, loanDuration.time_unit);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, loanDuration.amount);
        protoWriter.writeBytes(loanDuration.unknownFields());
    }
}
