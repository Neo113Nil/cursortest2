package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaidBreakOverageConversionSummary$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaidBreakOverageConversionSummary((Money) obj2, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaidBreakOverageConversionSummary paidBreakOverageConversionSummary = (PaidBreakOverageConversionSummary) obj;
        reverseProtoWriter.getClass();
        paidBreakOverageConversionSummary.getClass();
        reverseProtoWriter.writeBytes(paidBreakOverageConversionSummary.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, paidBreakOverageConversionSummary.total_labor_cost_saved);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, paidBreakOverageConversionSummary.converted_duration);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaidBreakOverageConversionSummary paidBreakOverageConversionSummary = (PaidBreakOverageConversionSummary) obj;
        paidBreakOverageConversionSummary.getClass();
        return Money.ADAPTER.encodedSizeWithTag(2, paidBreakOverageConversionSummary.total_labor_cost_saved) + ProtoAdapter.STRING.encodedSizeWithTag(1, paidBreakOverageConversionSummary.converted_duration) + paidBreakOverageConversionSummary.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaidBreakOverageConversionSummary paidBreakOverageConversionSummary = (PaidBreakOverageConversionSummary) obj;
        paidBreakOverageConversionSummary.getClass();
        Money money = paidBreakOverageConversionSummary.total_labor_cost_saved;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = paidBreakOverageConversionSummary.converted_duration;
        byteString.getClass();
        return new PaidBreakOverageConversionSummary(money2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaidBreakOverageConversionSummary paidBreakOverageConversionSummary = (PaidBreakOverageConversionSummary) obj;
        paidBreakOverageConversionSummary.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, paidBreakOverageConversionSummary.converted_duration);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, paidBreakOverageConversionSummary.total_labor_cost_saved);
        protoWriter.writeBytes(paidBreakOverageConversionSummary.unknownFields());
    }
}
