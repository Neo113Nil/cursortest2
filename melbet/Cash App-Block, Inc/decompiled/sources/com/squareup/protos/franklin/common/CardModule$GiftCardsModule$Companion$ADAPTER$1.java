package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CardModule$GiftCardsModule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.GiftCardsModule((CardModuleElement) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CardModuleElement.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.GiftCardsModule giftCardsModule = (CardModule.GiftCardsModule) obj;
        reverseProtoWriter.getClass();
        giftCardsModule.getClass();
        reverseProtoWriter.writeBytes(giftCardsModule.unknownFields());
        CardModuleElement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, giftCardsModule.element);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.GiftCardsModule giftCardsModule = (CardModule.GiftCardsModule) obj;
        giftCardsModule.getClass();
        return CardModuleElement.ADAPTER.encodedSizeWithTag(1, giftCardsModule.element) + giftCardsModule.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.GiftCardsModule giftCardsModule = (CardModule.GiftCardsModule) obj;
        giftCardsModule.getClass();
        CardModuleElement cardModuleElement = giftCardsModule.element;
        CardModuleElement cardModuleElement2 = cardModuleElement != null ? (CardModuleElement) CardModuleElement.ADAPTER.redact(cardModuleElement) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.GiftCardsModule(cardModuleElement2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.GiftCardsModule giftCardsModule = (CardModule.GiftCardsModule) obj;
        giftCardsModule.getClass();
        CardModuleElement.ADAPTER.encodeWithTag(protoWriter, 1, giftCardsModule.element);
        protoWriter.writeBytes(giftCardsModule.unknownFields());
    }
}
