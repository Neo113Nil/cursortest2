package com.squareup.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.lending.app_support.AppSupport;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardsEntryPointData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        CardsEntryPointData$EntryPoint$ToggleEntryPointData cardsEntryPointData$EntryPoint$ToggleEntryPointData = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardsEntryPointData(m, cardsEntryPointData$EntryPoint$ToggleEntryPointData, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AppSupport.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                cardsEntryPointData$EntryPoint$ToggleEntryPointData = new CardsEntryPointData$EntryPoint$ToggleEntryPointData((ToggleEntryPointData) ToggleEntryPointData.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardsEntryPointData cardsEntryPointData = (CardsEntryPointData) obj;
        reverseProtoWriter.getClass();
        cardsEntryPointData.getClass();
        reverseProtoWriter.writeBytes(cardsEntryPointData.unknownFields());
        CardsEntryPointData$EntryPoint$ToggleEntryPointData cardsEntryPointData$EntryPoint$ToggleEntryPointData = cardsEntryPointData.entry_point;
        if (cardsEntryPointData$EntryPoint$ToggleEntryPointData != null) {
            ToggleEntryPointData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cardsEntryPointData$EntryPoint$ToggleEntryPointData.value);
        } else if (cardsEntryPointData$EntryPoint$ToggleEntryPointData != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        AppSupport.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, cardsEntryPointData.app_supports);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardsEntryPointData cardsEntryPointData = (CardsEntryPointData) obj;
        cardsEntryPointData.getClass();
        int encodedSizeWithTag = AppSupport.ADAPTER.asRepeated().encodedSizeWithTag(1, cardsEntryPointData.app_supports) + cardsEntryPointData.unknownFields().getSize$okio();
        CardsEntryPointData$EntryPoint$ToggleEntryPointData cardsEntryPointData$EntryPoint$ToggleEntryPointData = cardsEntryPointData.entry_point;
        if (cardsEntryPointData$EntryPoint$ToggleEntryPointData != null) {
            return ToggleEntryPointData.ADAPTER.encodedSizeWithTag(2, cardsEntryPointData$EntryPoint$ToggleEntryPointData.value) + encodedSizeWithTag;
        }
        if (cardsEntryPointData$EntryPoint$ToggleEntryPointData == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardsEntryPointData cardsEntryPointData = (CardsEntryPointData) obj;
        cardsEntryPointData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cardsEntryPointData.app_supports, AppSupport.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        CardsEntryPointData$EntryPoint$ToggleEntryPointData cardsEntryPointData$EntryPoint$ToggleEntryPointData = cardsEntryPointData.entry_point;
        byteString.getClass();
        return new CardsEntryPointData(m1169redactElements, cardsEntryPointData$EntryPoint$ToggleEntryPointData, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardsEntryPointData cardsEntryPointData = (CardsEntryPointData) obj;
        cardsEntryPointData.getClass();
        AppSupport.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, cardsEntryPointData.app_supports);
        CardsEntryPointData$EntryPoint$ToggleEntryPointData cardsEntryPointData$EntryPoint$ToggleEntryPointData = cardsEntryPointData.entry_point;
        if (cardsEntryPointData$EntryPoint$ToggleEntryPointData != null) {
            ToggleEntryPointData.ADAPTER.encodeWithTag(protoWriter, 2, cardsEntryPointData$EntryPoint$ToggleEntryPointData.value);
        } else if (cardsEntryPointData$EntryPoint$ToggleEntryPointData != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(cardsEntryPointData.unknownFields());
    }
}
