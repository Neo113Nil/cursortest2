package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.lending.sync_values.GlobalBorrowData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GlobalBorrowData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GlobalBorrowData((String) obj, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(BorrowData.AppletData.EntryPointData.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                arrayList.add(GlobalBorrowData.CountrySupport.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GlobalBorrowData globalBorrowData = (GlobalBorrowData) obj;
        reverseProtoWriter.getClass();
        globalBorrowData.getClass();
        reverseProtoWriter.writeBytes(globalBorrowData.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, globalBorrowData.fallback_client_route);
        GlobalBorrowData.CountrySupport.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, globalBorrowData.country_supports);
        BorrowData.AppletData.EntryPointData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, globalBorrowData.entry_points);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GlobalBorrowData globalBorrowData = (GlobalBorrowData) obj;
        globalBorrowData.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, globalBorrowData.fallback_client_route) + GlobalBorrowData.CountrySupport.ADAPTER.asRepeated().encodedSizeWithTag(2, globalBorrowData.country_supports) + BorrowData.AppletData.EntryPointData.ADAPTER.asRepeated().encodedSizeWithTag(1, globalBorrowData.entry_points) + globalBorrowData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GlobalBorrowData globalBorrowData = (GlobalBorrowData) obj;
        globalBorrowData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(globalBorrowData.entry_points, BorrowData.AppletData.EntryPointData.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(globalBorrowData.country_supports, GlobalBorrowData.CountrySupport.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = globalBorrowData.fallback_client_route;
        byteString.getClass();
        return new GlobalBorrowData(str, m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GlobalBorrowData globalBorrowData = (GlobalBorrowData) obj;
        globalBorrowData.getClass();
        BorrowData.AppletData.EntryPointData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, globalBorrowData.entry_points);
        GlobalBorrowData.CountrySupport.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, globalBorrowData.country_supports);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, globalBorrowData.fallback_client_route);
        protoWriter.writeBytes(globalBorrowData.unknownFields());
    }
}
