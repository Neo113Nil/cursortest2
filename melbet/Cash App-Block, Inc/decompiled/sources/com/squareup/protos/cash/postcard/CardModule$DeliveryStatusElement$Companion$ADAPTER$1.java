package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$DeliveryStatusElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.DeliveryStatusElement((LocalizedString) obj, (LocalizedString) obj2, (CardModule.Button) obj3, (CardModule.DeliveryStatusElement.Prominence) obj4, (LocalizedString) obj5, (CardModule.Button) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(CardModule.Button.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    try {
                        obj4 = CardModule.DeliveryStatusElement.Prominence.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(CardModule.Button.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.DeliveryStatusElement deliveryStatusElement = (CardModule.DeliveryStatusElement) obj;
        reverseProtoWriter.getClass();
        deliveryStatusElement.getClass();
        reverseProtoWriter.writeBytes(deliveryStatusElement.unknownFields());
        ProtoAdapter protoAdapter = CardModule.Button.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, deliveryStatusElement.secondary_button);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, deliveryStatusElement.accessibility_text);
        CardModule.DeliveryStatusElement.Prominence.ADAPTER.encodeWithTag(reverseProtoWriter, 4, deliveryStatusElement.prominence);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, deliveryStatusElement.button);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, deliveryStatusElement.info_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, deliveryStatusElement.main_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.DeliveryStatusElement deliveryStatusElement = (CardModule.DeliveryStatusElement) obj;
        deliveryStatusElement.getClass();
        int size$okio = deliveryStatusElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, deliveryStatusElement.info_text) + protoAdapter.encodedSizeWithTag(1, deliveryStatusElement.main_text) + size$okio;
        ProtoAdapter protoAdapter2 = CardModule.Button.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(6, deliveryStatusElement.secondary_button) + protoAdapter.encodedSizeWithTag(5, deliveryStatusElement.accessibility_text) + CardModule.DeliveryStatusElement.Prominence.ADAPTER.encodedSizeWithTag(4, deliveryStatusElement.prominence) + protoAdapter2.encodedSizeWithTag(3, deliveryStatusElement.button) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.DeliveryStatusElement deliveryStatusElement = (CardModule.DeliveryStatusElement) obj;
        deliveryStatusElement.getClass();
        LocalizedString localizedString = deliveryStatusElement.main_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = deliveryStatusElement.info_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        CardModule.Button button = deliveryStatusElement.button;
        CardModule.Button button2 = button != null ? (CardModule.Button) CardModule.Button.ADAPTER.redact(button) : null;
        LocalizedString localizedString5 = deliveryStatusElement.accessibility_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        CardModule.Button button3 = deliveryStatusElement.secondary_button;
        CardModule.Button button4 = button3 != null ? (CardModule.Button) CardModule.Button.ADAPTER.redact(button3) : null;
        ByteString byteString = ByteString.EMPTY;
        CardModule.DeliveryStatusElement.Prominence prominence = deliveryStatusElement.prominence;
        byteString.getClass();
        return new CardModule.DeliveryStatusElement(localizedString2, localizedString4, button2, prominence, localizedString6, button4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.DeliveryStatusElement deliveryStatusElement = (CardModule.DeliveryStatusElement) obj;
        deliveryStatusElement.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, deliveryStatusElement.main_text);
        protoAdapter.encodeWithTag(protoWriter, 2, deliveryStatusElement.info_text);
        ProtoAdapter protoAdapter2 = CardModule.Button.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, deliveryStatusElement.button);
        CardModule.DeliveryStatusElement.Prominence.ADAPTER.encodeWithTag(protoWriter, 4, deliveryStatusElement.prominence);
        protoAdapter.encodeWithTag(protoWriter, 5, deliveryStatusElement.accessibility_text);
        protoAdapter2.encodeWithTag(protoWriter, 6, deliveryStatusElement.secondary_button);
        protoWriter.writeBytes(deliveryStatusElement.unknownFields());
    }
}
