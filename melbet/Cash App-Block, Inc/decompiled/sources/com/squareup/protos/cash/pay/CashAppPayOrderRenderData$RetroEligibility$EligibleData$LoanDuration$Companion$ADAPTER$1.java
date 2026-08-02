package com.squareup.protos.cash.pay;

import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayOrderRenderData$RetroEligibility$EligibleData$LoanDuration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration((Long) obj, (CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration.TimeUnit) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration.TimeUnit.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration loanDuration = (CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration) obj;
        reverseProtoWriter.getClass();
        loanDuration.getClass();
        reverseProtoWriter.writeBytes(loanDuration.unknownFields());
        CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration.TimeUnit.ADAPTER.encodeWithTag(reverseProtoWriter, 2, loanDuration.time_unit);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, loanDuration.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration loanDuration = (CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration) obj;
        loanDuration.getClass();
        return CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration.TimeUnit.ADAPTER.encodedSizeWithTag(2, loanDuration.time_unit) + ProtoAdapter.INT64.encodedSizeWithTag(1, loanDuration.amount) + loanDuration.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration loanDuration = (CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration) obj;
        loanDuration.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = loanDuration.amount;
        CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration.TimeUnit timeUnit = loanDuration.time_unit;
        byteString.getClass();
        return new CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration(l, timeUnit, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration loanDuration = (CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration) obj;
        loanDuration.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, loanDuration.amount);
        CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration.TimeUnit.ADAPTER.encodeWithTag(protoWriter, 2, loanDuration.time_unit);
        protoWriter.writeBytes(loanDuration.unknownFields());
    }
}
