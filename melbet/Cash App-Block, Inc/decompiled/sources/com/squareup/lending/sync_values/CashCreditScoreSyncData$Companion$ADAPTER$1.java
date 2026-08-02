package com.squareup.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.lending.CashCreditScoreEntryPointData;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreSyncData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashCreditScoreSyncData(m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CashCreditScoreHomeData.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(CashCreditScoreEntryPointData.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreSyncData cashCreditScoreSyncData = (CashCreditScoreSyncData) obj;
        reverseProtoWriter.getClass();
        cashCreditScoreSyncData.getClass();
        reverseProtoWriter.writeBytes(cashCreditScoreSyncData.unknownFields());
        CashCreditScoreEntryPointData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, cashCreditScoreSyncData.entry_point_data);
        CashCreditScoreHomeData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, cashCreditScoreSyncData.home_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreSyncData cashCreditScoreSyncData = (CashCreditScoreSyncData) obj;
        cashCreditScoreSyncData.getClass();
        return CashCreditScoreEntryPointData.ADAPTER.asRepeated().encodedSizeWithTag(2, cashCreditScoreSyncData.entry_point_data) + CashCreditScoreHomeData.ADAPTER.asRepeated().encodedSizeWithTag(1, cashCreditScoreSyncData.home_data) + cashCreditScoreSyncData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreSyncData cashCreditScoreSyncData = (CashCreditScoreSyncData) obj;
        cashCreditScoreSyncData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cashCreditScoreSyncData.home_data, CashCreditScoreHomeData.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(cashCreditScoreSyncData.entry_point_data, CashCreditScoreEntryPointData.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashCreditScoreSyncData(m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreSyncData cashCreditScoreSyncData = (CashCreditScoreSyncData) obj;
        cashCreditScoreSyncData.getClass();
        CashCreditScoreHomeData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, cashCreditScoreSyncData.home_data);
        CashCreditScoreEntryPointData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, cashCreditScoreSyncData.entry_point_data);
        protoWriter.writeBytes(cashCreditScoreSyncData.unknownFields());
    }
}
