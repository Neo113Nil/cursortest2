package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$Button$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CardModule.Button((CardModule.Button.Prominence) obj, (CardModule.CardElementAction) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (Boolean) obj5, (Icon) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(CardModule.Button.Prominence.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(CardModule.CardElementAction.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.Button button = (CardModule.Button) obj;
        reverseProtoWriter.getClass();
        button.getClass();
        reverseProtoWriter.writeBytes(button.unknownFields());
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 6, button.icon);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, button.is_disabled);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, button.accessibility_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, button.text);
        CardModule.CardElementAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, button.card_element_action);
        CardModule.Button.Prominence.ADAPTER.encodeWithTag(reverseProtoWriter, 1, button.prominence);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.Button button = (CardModule.Button) obj;
        button.getClass();
        int encodedSizeWithTag = CardModule.CardElementAction.ADAPTER.encodedSizeWithTag(2, button.card_element_action) + CardModule.Button.Prominence.ADAPTER.encodedSizeWithTag(1, button.prominence) + button.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return Icon.ADAPTER.encodedSizeWithTag(6, button.icon) + ProtoAdapter.BOOL.encodedSizeWithTag(5, button.is_disabled) + protoAdapter.encodedSizeWithTag(4, button.accessibility_text) + protoAdapter.encodedSizeWithTag(3, button.text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.Button button = (CardModule.Button) obj;
        button.getClass();
        CardModule.Button.Prominence prominence = button.prominence;
        CardModule.Button.Prominence prominence2 = prominence != null ? (CardModule.Button.Prominence) CardModule.Button.Prominence.ADAPTER.redact(prominence) : null;
        CardModule.CardElementAction cardElementAction = button.card_element_action;
        CardModule.CardElementAction cardElementAction2 = cardElementAction != null ? (CardModule.CardElementAction) CardModule.CardElementAction.ADAPTER.redact(cardElementAction) : null;
        LocalizedString localizedString = button.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = button.accessibility_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Icon icon = button.icon;
        return CardModule.Button.copy$default(button, prominence2, cardElementAction2, localizedString2, localizedString4, icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null, ByteString.EMPTY, 16);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.Button button = (CardModule.Button) obj;
        button.getClass();
        CardModule.Button.Prominence.ADAPTER.encodeWithTag(protoWriter, 1, button.prominence);
        CardModule.CardElementAction.ADAPTER.encodeWithTag(protoWriter, 2, button.card_element_action);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, button.text);
        protoAdapter.encodeWithTag(protoWriter, 4, button.accessibility_text);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, button.is_disabled);
        Icon.ADAPTER.encodeWithTag(protoWriter, 6, button.icon);
        protoWriter.writeBytes(button.unknownFields());
    }
}
