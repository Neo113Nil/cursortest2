package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$LineItemElement$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.LineItemElement((CardModule.InformationSource) obj, (String) obj2, (CardModule.Push) obj3, (LocalizedString) obj4, (Icon) obj5, (LocalizedString) obj6, (Boolean) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(CardModule.Push.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.LineItemElement lineItemElement = (CardModule.LineItemElement) obj;
        reverseProtoWriter.getClass();
        lineItemElement.getClass();
        reverseProtoWriter.writeBytes(lineItemElement.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, lineItemElement.is_disabled);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, lineItemElement.accessibility_text);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 5, lineItemElement.icon);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, lineItemElement.main_text);
        CardModule.Push.ADAPTER.encodeWithTag(reverseProtoWriter, 3, lineItemElement.push);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, lineItemElement.icon_token);
        CardModule.InformationSource.ADAPTER.encodeWithTag(reverseProtoWriter, 1, lineItemElement.source);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.LineItemElement lineItemElement = (CardModule.LineItemElement) obj;
        lineItemElement.getClass();
        int encodedSizeWithTag = CardModule.Push.ADAPTER.encodedSizeWithTag(3, lineItemElement.push) + ProtoAdapter.STRING.encodedSizeWithTag(2, lineItemElement.icon_token) + CardModule.InformationSource.ADAPTER.encodedSizeWithTag(1, lineItemElement.source) + lineItemElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(7, lineItemElement.is_disabled) + protoAdapter.encodedSizeWithTag(6, lineItemElement.accessibility_text) + Icon.ADAPTER.encodedSizeWithTag(5, lineItemElement.icon) + protoAdapter.encodedSizeWithTag(4, lineItemElement.main_text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.LineItemElement lineItemElement = (CardModule.LineItemElement) obj;
        lineItemElement.getClass();
        CardModule.Push push = lineItemElement.push;
        CardModule.Push push2 = push != null ? (CardModule.Push) CardModule.Push.ADAPTER.redact(push) : null;
        LocalizedString localizedString = lineItemElement.main_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Icon icon = lineItemElement.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        LocalizedString localizedString3 = lineItemElement.accessibility_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        CardModule.InformationSource informationSource = lineItemElement.source;
        String str = lineItemElement.icon_token;
        Boolean bool = lineItemElement.is_disabled;
        byteString.getClass();
        return new CardModule.LineItemElement(informationSource, str, push2, localizedString2, icon2, localizedString4, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.LineItemElement lineItemElement = (CardModule.LineItemElement) obj;
        lineItemElement.getClass();
        CardModule.InformationSource.ADAPTER.encodeWithTag(protoWriter, 1, lineItemElement.source);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, lineItemElement.icon_token);
        CardModule.Push.ADAPTER.encodeWithTag(protoWriter, 3, lineItemElement.push);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 4, lineItemElement.main_text);
        Icon.ADAPTER.encodeWithTag(protoWriter, 5, lineItemElement.icon);
        protoAdapter.encodeWithTag(protoWriter, 6, lineItemElement.accessibility_text);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, lineItemElement.is_disabled);
        protoWriter.writeBytes(lineItemElement.unknownFields());
    }
}
