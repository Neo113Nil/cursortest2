package com.squareup.protos.lending.sync_values;

import com.squareup.protos.lending.sync_values.AfterpayPrepurchaseData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AfterpayPrepurchaseData$CardsEntryPoint$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        AfterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayPrepurchaseData.CardsEntryPoint(afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint = new AfterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint((AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData) AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayPrepurchaseData.CardsEntryPoint cardsEntryPoint = (AfterpayPrepurchaseData.CardsEntryPoint) obj;
        reverseProtoWriter.getClass();
        cardsEntryPoint.getClass();
        reverseProtoWriter.writeBytes(cardsEntryPoint.unknownFields());
        AfterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint = cardsEntryPoint.entry_point;
        if (afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint != null) {
            AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint.value);
        } else {
            if (afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayPrepurchaseData.CardsEntryPoint cardsEntryPoint = (AfterpayPrepurchaseData.CardsEntryPoint) obj;
        cardsEntryPoint.getClass();
        int size$okio = cardsEntryPoint.unknownFields().getSize$okio();
        AfterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint = cardsEntryPoint.entry_point;
        if (afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint != null) {
            return AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.ADAPTER.encodedSizeWithTag(1, afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint.value) + size$okio;
        }
        if (afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint == null) {
            return size$okio;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayPrepurchaseData.CardsEntryPoint cardsEntryPoint = (AfterpayPrepurchaseData.CardsEntryPoint) obj;
        cardsEntryPoint.getClass();
        ByteString byteString = ByteString.EMPTY;
        AfterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint = cardsEntryPoint.entry_point;
        byteString.getClass();
        return new AfterpayPrepurchaseData.CardsEntryPoint(afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayPrepurchaseData.CardsEntryPoint cardsEntryPoint = (AfterpayPrepurchaseData.CardsEntryPoint) obj;
        cardsEntryPoint.getClass();
        AfterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint = cardsEntryPoint.entry_point;
        if (afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint != null) {
            AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.ADAPTER.encodeWithTag(protoWriter, 1, afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint.value);
        } else if (afterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(cardsEntryPoint.unknownFields());
    }
}
