package com.squareup.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseCashCardData(m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(PrepurchaseCashCardAppletSyncData.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(CardsEntryPointData.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseCashCardData prepurchaseCashCardData = (PrepurchaseCashCardData) obj;
        reverseProtoWriter.getClass();
        prepurchaseCashCardData.getClass();
        reverseProtoWriter.writeBytes(prepurchaseCashCardData.unknownFields());
        CardsEntryPointData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, prepurchaseCashCardData.cards_entry_points);
        PrepurchaseCashCardAppletSyncData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, prepurchaseCashCardData.applet_sync_data_list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepurchaseCashCardData prepurchaseCashCardData = (PrepurchaseCashCardData) obj;
        prepurchaseCashCardData.getClass();
        return CardsEntryPointData.ADAPTER.asRepeated().encodedSizeWithTag(2, prepurchaseCashCardData.cards_entry_points) + PrepurchaseCashCardAppletSyncData.ADAPTER.asRepeated().encodedSizeWithTag(1, prepurchaseCashCardData.applet_sync_data_list) + prepurchaseCashCardData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseCashCardData prepurchaseCashCardData = (PrepurchaseCashCardData) obj;
        prepurchaseCashCardData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(prepurchaseCashCardData.applet_sync_data_list, PrepurchaseCashCardAppletSyncData.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(prepurchaseCashCardData.cards_entry_points, CardsEntryPointData.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PrepurchaseCashCardData(m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseCashCardData prepurchaseCashCardData = (PrepurchaseCashCardData) obj;
        prepurchaseCashCardData.getClass();
        PrepurchaseCashCardAppletSyncData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, prepurchaseCashCardData.applet_sync_data_list);
        CardsEntryPointData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, prepurchaseCashCardData.cards_entry_points);
        protoWriter.writeBytes(prepurchaseCashCardData.unknownFields());
    }
}
