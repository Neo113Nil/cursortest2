package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$DeliveryStatusModule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.DeliveryStatusModule((LocalizedString) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(CardModule.DeliveryStatusElement.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.DeliveryStatusModule deliveryStatusModule = (CardModule.DeliveryStatusModule) obj;
        reverseProtoWriter.getClass();
        deliveryStatusModule.getClass();
        reverseProtoWriter.writeBytes(deliveryStatusModule.unknownFields());
        CardModule.DeliveryStatusElement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, deliveryStatusModule.elements);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, deliveryStatusModule.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.DeliveryStatusModule deliveryStatusModule = (CardModule.DeliveryStatusModule) obj;
        deliveryStatusModule.getClass();
        return CardModule.DeliveryStatusElement.ADAPTER.asRepeated().encodedSizeWithTag(2, deliveryStatusModule.elements) + LocalizedString.ADAPTER.encodedSizeWithTag(1, deliveryStatusModule.title) + deliveryStatusModule.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.DeliveryStatusModule deliveryStatusModule = (CardModule.DeliveryStatusModule) obj;
        deliveryStatusModule.getClass();
        LocalizedString localizedString = deliveryStatusModule.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(deliveryStatusModule.elements, CardModule.DeliveryStatusElement.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.DeliveryStatusModule(localizedString2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.DeliveryStatusModule deliveryStatusModule = (CardModule.DeliveryStatusModule) obj;
        deliveryStatusModule.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, deliveryStatusModule.title);
        CardModule.DeliveryStatusElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, deliveryStatusModule.elements);
        protoWriter.writeBytes(deliveryStatusModule.unknownFields());
    }
}
