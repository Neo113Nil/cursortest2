package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$HeroNullStateModule$UnifiedCardHomeNUX$UpsellCard$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard upsellCard = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard) obj;
        reverseProtoWriter.getClass();
        upsellCard.getClass();
        reverseProtoWriter.writeBytes(upsellCard.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, upsellCard.card_theme_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard upsellCard = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard) obj;
        upsellCard.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, upsellCard.card_theme_token) + upsellCard.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard upsellCard = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard) obj;
        upsellCard.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = upsellCard.card_theme_token;
        byteString.getClass();
        return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard upsellCard = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard) obj;
        upsellCard.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, upsellCard.card_theme_token);
        protoWriter.writeBytes(upsellCard.unknownFields());
    }
}
