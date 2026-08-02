package com.squareup.lending;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.lending.CashCreditScoreEntryPointData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreEntryPointData$InstalledState$Graph$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashCreditScoreEntryPointData.InstalledState.Graph(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CashCreditScoreEntryPointData.InstalledState.Graph.Item.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreEntryPointData.InstalledState.Graph graph = (CashCreditScoreEntryPointData.InstalledState.Graph) obj;
        reverseProtoWriter.getClass();
        graph.getClass();
        reverseProtoWriter.writeBytes(graph.unknownFields());
        CashCreditScoreEntryPointData.InstalledState.Graph.Item.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, graph.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreEntryPointData.InstalledState.Graph graph = (CashCreditScoreEntryPointData.InstalledState.Graph) obj;
        graph.getClass();
        return CashCreditScoreEntryPointData.InstalledState.Graph.Item.ADAPTER.asRepeated().encodedSizeWithTag(1, graph.items) + graph.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreEntryPointData.InstalledState.Graph graph = (CashCreditScoreEntryPointData.InstalledState.Graph) obj;
        graph.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(graph.items, CashCreditScoreEntryPointData.InstalledState.Graph.Item.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashCreditScoreEntryPointData.InstalledState.Graph(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreEntryPointData.InstalledState.Graph graph = (CashCreditScoreEntryPointData.InstalledState.Graph) obj;
        graph.getClass();
        CashCreditScoreEntryPointData.InstalledState.Graph.Item.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, graph.items);
        protoWriter.writeBytes(graph.unknownFields());
    }
}
