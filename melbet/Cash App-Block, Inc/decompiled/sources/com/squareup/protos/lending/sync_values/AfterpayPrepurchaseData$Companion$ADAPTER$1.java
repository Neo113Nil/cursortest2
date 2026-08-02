package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import com.squareup.protos.lending.sync_values.AfterpayPrepurchaseData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AfterpayPrepurchaseData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayPrepurchaseData((AfterpayPrepurchaseData.CardsEntryPoint) obj, (PrepurchaseAfterpayAppletData) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AfterpayPrepurchaseData.CardsEntryPoint.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(PrepurchaseAfterpayAppletData.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayPrepurchaseData afterpayPrepurchaseData = (AfterpayPrepurchaseData) obj;
        reverseProtoWriter.getClass();
        afterpayPrepurchaseData.getClass();
        reverseProtoWriter.writeBytes(afterpayPrepurchaseData.unknownFields());
        PrepurchaseAfterpayAppletData.ADAPTER.encodeWithTag(reverseProtoWriter, 3, afterpayPrepurchaseData.applet_data);
        AfterpayPrepurchaseData.CardsEntryPoint.ADAPTER.encodeWithTag(reverseProtoWriter, 1, afterpayPrepurchaseData.cards_entry_point);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayPrepurchaseData afterpayPrepurchaseData = (AfterpayPrepurchaseData) obj;
        afterpayPrepurchaseData.getClass();
        return PrepurchaseAfterpayAppletData.ADAPTER.encodedSizeWithTag(3, afterpayPrepurchaseData.applet_data) + AfterpayPrepurchaseData.CardsEntryPoint.ADAPTER.encodedSizeWithTag(1, afterpayPrepurchaseData.cards_entry_point) + afterpayPrepurchaseData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayPrepurchaseData afterpayPrepurchaseData = (AfterpayPrepurchaseData) obj;
        afterpayPrepurchaseData.getClass();
        AfterpayPrepurchaseData.CardsEntryPoint cardsEntryPoint = afterpayPrepurchaseData.cards_entry_point;
        AfterpayPrepurchaseData.CardsEntryPoint cardsEntryPoint2 = cardsEntryPoint != null ? (AfterpayPrepurchaseData.CardsEntryPoint) AfterpayPrepurchaseData.CardsEntryPoint.ADAPTER.redact(cardsEntryPoint) : null;
        PrepurchaseAfterpayAppletData prepurchaseAfterpayAppletData = afterpayPrepurchaseData.applet_data;
        PrepurchaseAfterpayAppletData prepurchaseAfterpayAppletData2 = prepurchaseAfterpayAppletData != null ? (PrepurchaseAfterpayAppletData) PrepurchaseAfterpayAppletData.ADAPTER.redact(prepurchaseAfterpayAppletData) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AfterpayPrepurchaseData(cardsEntryPoint2, prepurchaseAfterpayAppletData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayPrepurchaseData afterpayPrepurchaseData = (AfterpayPrepurchaseData) obj;
        afterpayPrepurchaseData.getClass();
        AfterpayPrepurchaseData.CardsEntryPoint.ADAPTER.encodeWithTag(protoWriter, 1, afterpayPrepurchaseData.cards_entry_point);
        PrepurchaseAfterpayAppletData.ADAPTER.encodeWithTag(protoWriter, 3, afterpayPrepurchaseData.applet_data);
        protoWriter.writeBytes(afterpayPrepurchaseData.unknownFields());
    }
}
