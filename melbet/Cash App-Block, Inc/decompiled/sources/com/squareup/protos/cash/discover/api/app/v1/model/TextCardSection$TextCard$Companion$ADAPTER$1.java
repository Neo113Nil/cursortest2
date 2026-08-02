package com.squareup.protos.cash.discover.api.app.v1.model;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.discover.api.app.v1.model.TextCardSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TextCardSection$TextCard$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new TextCardSection.TextCard((Text) obj, (Text) obj2, (Text) obj3, (Avatar) obj4, (TapAction) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TextCardSection.TextCard textCard = (TextCardSection.TextCard) obj;
        reverseProtoWriter.getClass();
        textCard.getClass();
        reverseProtoWriter.writeBytes(textCard.unknownFields());
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 5, textCard.action);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 4, textCard.avatar);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, textCard.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, textCard.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, textCard.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TextCardSection.TextCard textCard = (TextCardSection.TextCard) obj;
        textCard.getClass();
        int size$okio = textCard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        return TapAction.ADAPTER.encodedSizeWithTag(5, textCard.action) + Avatar.ADAPTER.encodedSizeWithTag(4, textCard.avatar) + protoAdapter.encodedSizeWithTag(3, textCard.description) + protoAdapter.encodedSizeWithTag(2, textCard.subtitle) + protoAdapter.encodedSizeWithTag(1, textCard.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TextCardSection.TextCard textCard = (TextCardSection.TextCard) obj;
        textCard.getClass();
        Text text = textCard.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = textCard.subtitle;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        Text text5 = textCard.description;
        Text text6 = text5 != null ? (Text) Text.ADAPTER.redact(text5) : null;
        Avatar avatar = textCard.avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        TapAction tapAction = textCard.action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TextCardSection.TextCard(text2, text4, text6, avatar2, tapAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TextCardSection.TextCard textCard = (TextCardSection.TextCard) obj;
        textCard.getClass();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, textCard.title);
        protoAdapter.encodeWithTag(protoWriter, 2, textCard.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, textCard.description);
        Avatar.ADAPTER.encodeWithTag(protoWriter, 4, textCard.avatar);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 5, textCard.action);
        protoWriter.writeBytes(textCard.unknownFields());
    }
}
