package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.timecards.OvertimeReportByTimecardForEmployeeResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OvertimeReportByTimecardForEmployeeResponse$ByTimecard$ConvertedPaidBreakOverage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ConvertedPaidBreakOverage((Money) obj2, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ConvertedPaidBreakOverage convertedPaidBreakOverage = (OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ConvertedPaidBreakOverage) obj;
        reverseProtoWriter.getClass();
        convertedPaidBreakOverage.getClass();
        reverseProtoWriter.writeBytes(convertedPaidBreakOverage.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, convertedPaidBreakOverage.labor_cost_saved);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, convertedPaidBreakOverage.break_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ConvertedPaidBreakOverage convertedPaidBreakOverage = (OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ConvertedPaidBreakOverage) obj;
        convertedPaidBreakOverage.getClass();
        return Money.ADAPTER.encodedSizeWithTag(2, convertedPaidBreakOverage.labor_cost_saved) + ProtoAdapter.STRING.encodedSizeWithTag(1, convertedPaidBreakOverage.break_id) + convertedPaidBreakOverage.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ConvertedPaidBreakOverage convertedPaidBreakOverage = (OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ConvertedPaidBreakOverage) obj;
        convertedPaidBreakOverage.getClass();
        Money money = convertedPaidBreakOverage.labor_cost_saved;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = convertedPaidBreakOverage.break_id;
        byteString.getClass();
        return new OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ConvertedPaidBreakOverage(money2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ConvertedPaidBreakOverage convertedPaidBreakOverage = (OvertimeReportByTimecardForEmployeeResponse.ByTimecard.ConvertedPaidBreakOverage) obj;
        convertedPaidBreakOverage.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, convertedPaidBreakOverage.break_id);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, convertedPaidBreakOverage.labor_cost_saved);
        protoWriter.writeBytes(convertedPaidBreakOverage.unknownFields());
    }
}
