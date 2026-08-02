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
public final class CardModule$StatusElement$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.StatusElement((CardModule.InformationSource) obj, (CardModule.StatusElement.Icon) obj2, (CardModule.StatusElement.Accessory) obj3, (LocalizedString) obj4, (LocalizedString) obj5, (CardModule.Button) obj6, (LocalizedString) obj7, (Boolean) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = CardModule.InformationSource.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(CardModule.StatusElement.Icon.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(CardModule.StatusElement.Accessory.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(CardModule.Button.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.StatusElement statusElement = (CardModule.StatusElement) obj;
        reverseProtoWriter.getClass();
        statusElement.getClass();
        reverseProtoWriter.writeBytes(statusElement.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 8, statusElement.is_disabled);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, statusElement.accessibility_text);
        CardModule.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 6, statusElement.button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, statusElement.info_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, statusElement.main_text);
        CardModule.StatusElement.Accessory.ADAPTER.encodeWithTag(reverseProtoWriter, 3, statusElement.accessory);
        CardModule.StatusElement.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 2, statusElement.icon);
        CardModule.InformationSource.ADAPTER.encodeWithTag(reverseProtoWriter, 1, statusElement.source);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.StatusElement statusElement = (CardModule.StatusElement) obj;
        statusElement.getClass();
        int encodedSizeWithTag = CardModule.StatusElement.Accessory.ADAPTER.encodedSizeWithTag(3, statusElement.accessory) + CardModule.StatusElement.Icon.ADAPTER.encodedSizeWithTag(2, statusElement.icon) + CardModule.InformationSource.ADAPTER.encodedSizeWithTag(1, statusElement.source) + statusElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(8, statusElement.is_disabled) + protoAdapter.encodedSizeWithTag(7, statusElement.accessibility_text) + CardModule.Button.ADAPTER.encodedSizeWithTag(6, statusElement.button) + protoAdapter.encodedSizeWithTag(5, statusElement.info_text) + protoAdapter.encodedSizeWithTag(4, statusElement.main_text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.StatusElement statusElement = (CardModule.StatusElement) obj;
        statusElement.getClass();
        CardModule.StatusElement.Icon icon = statusElement.icon;
        CardModule.StatusElement.Icon icon2 = icon != null ? (CardModule.StatusElement.Icon) CardModule.StatusElement.Icon.ADAPTER.redact(icon) : null;
        CardModule.StatusElement.Accessory accessory = statusElement.accessory;
        CardModule.StatusElement.Accessory accessory2 = accessory != null ? (CardModule.StatusElement.Accessory) CardModule.StatusElement.Accessory.ADAPTER.redact(accessory) : null;
        LocalizedString localizedString = statusElement.main_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = statusElement.info_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        CardModule.Button button = statusElement.button;
        CardModule.Button button2 = button != null ? (CardModule.Button) CardModule.Button.ADAPTER.redact(button) : null;
        LocalizedString localizedString5 = statusElement.accessibility_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        CardModule.InformationSource informationSource = statusElement.source;
        Boolean bool = statusElement.is_disabled;
        byteString.getClass();
        return new CardModule.StatusElement(informationSource, icon2, accessory2, localizedString2, localizedString4, button2, localizedString6, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.StatusElement statusElement = (CardModule.StatusElement) obj;
        statusElement.getClass();
        CardModule.InformationSource.ADAPTER.encodeWithTag(protoWriter, 1, statusElement.source);
        CardModule.StatusElement.Icon.ADAPTER.encodeWithTag(protoWriter, 2, statusElement.icon);
        CardModule.StatusElement.Accessory.ADAPTER.encodeWithTag(protoWriter, 3, statusElement.accessory);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 4, statusElement.main_text);
        protoAdapter.encodeWithTag(protoWriter, 5, statusElement.info_text);
        CardModule.Button.ADAPTER.encodeWithTag(protoWriter, 6, statusElement.button);
        protoAdapter.encodeWithTag(protoWriter, 7, statusElement.accessibility_text);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, statusElement.is_disabled);
        protoWriter.writeBytes(statusElement.unknownFields());
    }
}
