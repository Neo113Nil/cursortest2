package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.pay.CashAppPayLoanSummaryRenderData;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayLoanSummaryRenderData$Adjustment$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayLoanSummaryRenderData.Adjustment((Money) obj, (CashAppPayLoanSummaryRenderData.Adjustment.Type) obj2, (CashAppPayLoanSummaryRenderData.Adjustment.Reason) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                try {
                    obj2 = CashAppPayLoanSummaryRenderData.Adjustment.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = CashAppPayLoanSummaryRenderData.Adjustment.Reason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayLoanSummaryRenderData.Adjustment adjustment = (CashAppPayLoanSummaryRenderData.Adjustment) obj;
        reverseProtoWriter.getClass();
        adjustment.getClass();
        reverseProtoWriter.writeBytes(adjustment.unknownFields());
        CashAppPayLoanSummaryRenderData.Adjustment.Reason.ADAPTER.encodeWithTag(reverseProtoWriter, 3, adjustment.reason);
        CashAppPayLoanSummaryRenderData.Adjustment.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 2, adjustment.f1322type);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, adjustment.adjustment_money);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayLoanSummaryRenderData.Adjustment adjustment = (CashAppPayLoanSummaryRenderData.Adjustment) obj;
        adjustment.getClass();
        return CashAppPayLoanSummaryRenderData.Adjustment.Reason.ADAPTER.encodedSizeWithTag(3, adjustment.reason) + CashAppPayLoanSummaryRenderData.Adjustment.Type.ADAPTER.encodedSizeWithTag(2, adjustment.f1322type) + Money.ADAPTER.encodedSizeWithTag(1, adjustment.adjustment_money) + adjustment.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayLoanSummaryRenderData.Adjustment adjustment = (CashAppPayLoanSummaryRenderData.Adjustment) obj;
        adjustment.getClass();
        Money money = adjustment.adjustment_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        CashAppPayLoanSummaryRenderData.Adjustment.Type type2 = adjustment.f1322type;
        CashAppPayLoanSummaryRenderData.Adjustment.Reason reason = adjustment.reason;
        byteString.getClass();
        return new CashAppPayLoanSummaryRenderData.Adjustment(money2, type2, reason, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayLoanSummaryRenderData.Adjustment adjustment = (CashAppPayLoanSummaryRenderData.Adjustment) obj;
        adjustment.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, adjustment.adjustment_money);
        CashAppPayLoanSummaryRenderData.Adjustment.Type.ADAPTER.encodeWithTag(protoWriter, 2, adjustment.f1322type);
        CashAppPayLoanSummaryRenderData.Adjustment.Reason.ADAPTER.encodeWithTag(protoWriter, 3, adjustment.reason);
        protoWriter.writeBytes(adjustment.unknownFields());
    }
}
