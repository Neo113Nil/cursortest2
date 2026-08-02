package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Card$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Card((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Card card = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Card) obj;
        reverseProtoWriter.getClass();
        card.getClass();
        reverseProtoWriter.writeBytes(card.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, card.skin_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, card.card_theme_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Card card = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Card) obj;
        card.getClass();
        int size$okio = card.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, card.skin_id) + protoAdapter.encodedSizeWithTag(1, card.card_theme_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Card card = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Card) obj;
        card.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = card.card_theme_id;
        String str2 = card.skin_id;
        byteString.getClass();
        return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Card(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Card card = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Card) obj;
        card.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, card.card_theme_id);
        protoAdapter.encodeWithTag(protoWriter, 2, card.skin_id);
        protoWriter.writeBytes(card.unknownFields());
    }
}
