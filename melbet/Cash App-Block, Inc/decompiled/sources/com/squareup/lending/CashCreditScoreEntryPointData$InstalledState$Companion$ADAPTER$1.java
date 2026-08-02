package com.squareup.lending;

import androidx.room.TransactorKt;
import com.squareup.lending.CashCreditScoreEntryPointData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreEntryPointData$InstalledState$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashCreditScoreEntryPointData.InstalledState((LocalizedString) obj, (CashCreditScoreEntryPointData.InstalledState.Subtitle) obj2, (Integer) obj3, (Integer) obj4, (CashCreditScoreEntryPointData.InstalledState.Graph) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(CashCreditScoreEntryPointData.InstalledState.Subtitle.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(CashCreditScoreEntryPointData.InstalledState.Graph.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreEntryPointData.InstalledState installedState = (CashCreditScoreEntryPointData.InstalledState) obj;
        reverseProtoWriter.getClass();
        installedState.getClass();
        reverseProtoWriter.writeBytes(installedState.unknownFields());
        CashCreditScoreEntryPointData.InstalledState.Graph.ADAPTER.encodeWithTag(reverseProtoWriter, 5, installedState.graph);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, installedState.change_since_last_week);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, installedState.score);
        CashCreditScoreEntryPointData.InstalledState.Subtitle.ADAPTER.encodeWithTag(reverseProtoWriter, 2, installedState.subtitle);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, installedState.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreEntryPointData.InstalledState installedState = (CashCreditScoreEntryPointData.InstalledState) obj;
        installedState.getClass();
        int encodedSizeWithTag = CashCreditScoreEntryPointData.InstalledState.Subtitle.ADAPTER.encodedSizeWithTag(2, installedState.subtitle) + LocalizedString.ADAPTER.encodedSizeWithTag(1, installedState.title) + installedState.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return CashCreditScoreEntryPointData.InstalledState.Graph.ADAPTER.encodedSizeWithTag(5, installedState.graph) + protoAdapter.encodedSizeWithTag(4, installedState.change_since_last_week) + protoAdapter.encodedSizeWithTag(3, installedState.score) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreEntryPointData.InstalledState installedState = (CashCreditScoreEntryPointData.InstalledState) obj;
        installedState.getClass();
        LocalizedString localizedString = installedState.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        CashCreditScoreEntryPointData.InstalledState.Subtitle subtitle = installedState.subtitle;
        CashCreditScoreEntryPointData.InstalledState.Subtitle subtitle2 = subtitle != null ? (CashCreditScoreEntryPointData.InstalledState.Subtitle) CashCreditScoreEntryPointData.InstalledState.Subtitle.ADAPTER.redact(subtitle) : null;
        CashCreditScoreEntryPointData.InstalledState.Graph graph = installedState.graph;
        CashCreditScoreEntryPointData.InstalledState.Graph graph2 = graph != null ? (CashCreditScoreEntryPointData.InstalledState.Graph) CashCreditScoreEntryPointData.InstalledState.Graph.ADAPTER.redact(graph) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = installedState.score;
        Integer num2 = installedState.change_since_last_week;
        byteString.getClass();
        return new CashCreditScoreEntryPointData.InstalledState(localizedString2, subtitle2, num, num2, graph2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreEntryPointData.InstalledState installedState = (CashCreditScoreEntryPointData.InstalledState) obj;
        installedState.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, installedState.title);
        CashCreditScoreEntryPointData.InstalledState.Subtitle.ADAPTER.encodeWithTag(protoWriter, 2, installedState.subtitle);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 3, installedState.score);
        protoAdapter.encodeWithTag(protoWriter, 4, installedState.change_since_last_week);
        CashCreditScoreEntryPointData.InstalledState.Graph.ADAPTER.encodeWithTag(protoWriter, 5, installedState.graph);
        protoWriter.writeBytes(installedState.unknownFields());
    }
}
