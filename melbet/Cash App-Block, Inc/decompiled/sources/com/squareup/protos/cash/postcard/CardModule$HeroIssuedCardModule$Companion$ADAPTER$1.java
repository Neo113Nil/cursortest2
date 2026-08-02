package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$HeroIssuedCardModule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.HeroIssuedCardModule((CardModule.IssuedCardElement) obj, (CardRenderingInfo) obj2, (CardModule.CardElementAction) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CardModule.IssuedCardElement.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(CardRenderingInfo.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(CardModule.CardElementAction.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.HeroIssuedCardModule heroIssuedCardModule = (CardModule.HeroIssuedCardModule) obj;
        reverseProtoWriter.getClass();
        heroIssuedCardModule.getClass();
        reverseProtoWriter.writeBytes(heroIssuedCardModule.unknownFields());
        CardModule.CardElementAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, heroIssuedCardModule.on_rotate_to_back);
        CardRenderingInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 2, heroIssuedCardModule.card_rendering_info);
        CardModule.IssuedCardElement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, heroIssuedCardModule.element);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.HeroIssuedCardModule heroIssuedCardModule = (CardModule.HeroIssuedCardModule) obj;
        heroIssuedCardModule.getClass();
        return CardModule.CardElementAction.ADAPTER.encodedSizeWithTag(3, heroIssuedCardModule.on_rotate_to_back) + CardRenderingInfo.ADAPTER.encodedSizeWithTag(2, heroIssuedCardModule.card_rendering_info) + CardModule.IssuedCardElement.ADAPTER.encodedSizeWithTag(1, heroIssuedCardModule.element) + heroIssuedCardModule.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.HeroIssuedCardModule heroIssuedCardModule = (CardModule.HeroIssuedCardModule) obj;
        heroIssuedCardModule.getClass();
        CardModule.IssuedCardElement issuedCardElement = heroIssuedCardModule.element;
        CardModule.IssuedCardElement issuedCardElement2 = issuedCardElement != null ? (CardModule.IssuedCardElement) CardModule.IssuedCardElement.ADAPTER.redact(issuedCardElement) : null;
        CardRenderingInfo cardRenderingInfo = heroIssuedCardModule.card_rendering_info;
        CardRenderingInfo cardRenderingInfo2 = cardRenderingInfo != null ? (CardRenderingInfo) CardRenderingInfo.ADAPTER.redact(cardRenderingInfo) : null;
        CardModule.CardElementAction cardElementAction = heroIssuedCardModule.on_rotate_to_back;
        CardModule.CardElementAction cardElementAction2 = cardElementAction != null ? (CardModule.CardElementAction) CardModule.CardElementAction.ADAPTER.redact(cardElementAction) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.HeroIssuedCardModule(issuedCardElement2, cardRenderingInfo2, cardElementAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.HeroIssuedCardModule heroIssuedCardModule = (CardModule.HeroIssuedCardModule) obj;
        heroIssuedCardModule.getClass();
        CardModule.IssuedCardElement.ADAPTER.encodeWithTag(protoWriter, 1, heroIssuedCardModule.element);
        CardRenderingInfo.ADAPTER.encodeWithTag(protoWriter, 2, heroIssuedCardModule.card_rendering_info);
        CardModule.CardElementAction.ADAPTER.encodeWithTag(protoWriter, 3, heroIssuedCardModule.on_rotate_to_back);
        protoWriter.writeBytes(heroIssuedCardModule.unknownFields());
    }
}
