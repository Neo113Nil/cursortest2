package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$UpsellElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.UpsellElement((String) obj3, (CardModule.InformationSource) obj4, (LocalizedString) obj5, (LocalizedString) obj6, (Icon) obj7, (Image) obj8, (CardModule.Button) obj9, (LocalizedString) obj10, (Boolean) obj11, (Boolean) obj12, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    try {
                        obj4 = CardModule.InformationSource.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj3;
                        obj2 = obj4;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    continue;
                case 4:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj6);
                    continue;
                case 5:
                    obj7 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj7);
                    continue;
                case 6:
                    obj8 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj8);
                    continue;
                case 7:
                    obj9 = TransactorKt.decodeMessageOrMerge(CardModule.Button.ADAPTER, protoReader, obj9);
                    continue;
                case 8:
                    obj10 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj10);
                    continue;
                case 9:
                    obj11 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                case 10:
                    obj12 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    obj2 = obj4;
                    break;
            }
            obj3 = obj;
            obj4 = obj2;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.UpsellElement upsellElement = (CardModule.UpsellElement) obj;
        reverseProtoWriter.getClass();
        upsellElement.getClass();
        reverseProtoWriter.writeBytes(upsellElement.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, upsellElement.is_dismissible);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, upsellElement.is_disabled);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, upsellElement.accessibility_text);
        CardModule.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 7, upsellElement.button);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 6, upsellElement.image);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 5, upsellElement.icon);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, upsellElement.body);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, upsellElement.title);
        CardModule.InformationSource.ADAPTER.encodeWithTag(reverseProtoWriter, 2, upsellElement.source);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, upsellElement.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.UpsellElement upsellElement = (CardModule.UpsellElement) obj;
        upsellElement.getClass();
        int encodedSizeWithTag = CardModule.InformationSource.ADAPTER.encodedSizeWithTag(2, upsellElement.source) + ProtoAdapter.STRING.encodedSizeWithTag(1, upsellElement.id) + upsellElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(8, upsellElement.accessibility_text) + CardModule.Button.ADAPTER.encodedSizeWithTag(7, upsellElement.button) + Image.ADAPTER.encodedSizeWithTag(6, upsellElement.image) + Icon.ADAPTER.encodedSizeWithTag(5, upsellElement.icon) + protoAdapter.encodedSizeWithTag(4, upsellElement.body) + protoAdapter.encodedSizeWithTag(3, upsellElement.title) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(10, upsellElement.is_dismissible) + protoAdapter2.encodedSizeWithTag(9, upsellElement.is_disabled) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.UpsellElement upsellElement = (CardModule.UpsellElement) obj;
        upsellElement.getClass();
        LocalizedString localizedString = upsellElement.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = upsellElement.body;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Icon icon = upsellElement.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        Image image = upsellElement.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        CardModule.Button button = upsellElement.button;
        CardModule.Button button2 = button != null ? (CardModule.Button) CardModule.Button.ADAPTER.redact(button) : null;
        LocalizedString localizedString5 = upsellElement.accessibility_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = upsellElement.id;
        CardModule.InformationSource informationSource = upsellElement.source;
        Boolean bool = upsellElement.is_disabled;
        Boolean bool2 = upsellElement.is_dismissible;
        byteString.getClass();
        return new CardModule.UpsellElement(str, informationSource, localizedString2, localizedString4, icon2, image2, button2, localizedString6, bool, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.UpsellElement upsellElement = (CardModule.UpsellElement) obj;
        upsellElement.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, upsellElement.id);
        CardModule.InformationSource.ADAPTER.encodeWithTag(protoWriter, 2, upsellElement.source);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, upsellElement.title);
        protoAdapter.encodeWithTag(protoWriter, 4, upsellElement.body);
        Icon.ADAPTER.encodeWithTag(protoWriter, 5, upsellElement.icon);
        Image.ADAPTER.encodeWithTag(protoWriter, 6, upsellElement.image);
        CardModule.Button.ADAPTER.encodeWithTag(protoWriter, 7, upsellElement.button);
        protoAdapter.encodeWithTag(protoWriter, 8, upsellElement.accessibility_text);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 9, upsellElement.is_disabled);
        protoAdapter2.encodeWithTag(protoWriter, 10, upsellElement.is_dismissible);
        protoWriter.writeBytes(upsellElement.unknownFields());
    }
}
