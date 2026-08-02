package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$HeroNullStateModule$UnifiedCardHomeNUX$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX((CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard) obj, (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content) obj2, m, (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig) obj3, (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX unifiedCardHomeNUX = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX) obj;
        reverseProtoWriter.getClass();
        unifiedCardHomeNUX.getClass();
        reverseProtoWriter.writeBytes(unifiedCardHomeNUX.unknownFields());
        ProtoAdapter protoAdapter = CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, unifiedCardHomeNUX.grid_content);
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 4, unifiedCardHomeNUX.grid_config);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 3, unifiedCardHomeNUX.rotating_card_theme_tokens);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, unifiedCardHomeNUX.content);
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard.ADAPTER.encodeWithTag(reverseProtoWriter, 1, unifiedCardHomeNUX.upsell_card);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX unifiedCardHomeNUX = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX) obj;
        unifiedCardHomeNUX.getClass();
        int encodedSizeWithTag = CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard.ADAPTER.encodedSizeWithTag(1, unifiedCardHomeNUX.upsell_card) + unifiedCardHomeNUX.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, unifiedCardHomeNUX.grid_content) + CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.ADAPTER.encodedSizeWithTag(4, unifiedCardHomeNUX.grid_config) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, unifiedCardHomeNUX.rotating_card_theme_tokens) + protoAdapter.encodedSizeWithTag(2, unifiedCardHomeNUX.content) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX unifiedCardHomeNUX = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX) obj;
        unifiedCardHomeNUX.getClass();
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard upsellCard = unifiedCardHomeNUX.upsell_card;
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard upsellCard2 = upsellCard != null ? (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard) CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard.ADAPTER.redact(upsellCard) : null;
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content content = unifiedCardHomeNUX.content;
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content content2 = content != null ? (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content) CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ADAPTER.redact(content) : null;
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig gridConfig = unifiedCardHomeNUX.grid_config;
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig gridConfig2 = gridConfig != null ? (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig) CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.ADAPTER.redact(gridConfig) : null;
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content content3 = unifiedCardHomeNUX.grid_content;
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content content4 = content3 != null ? (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content) CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ADAPTER.redact(content3) : null;
        ByteString byteString = ByteString.EMPTY;
        List list = unifiedCardHomeNUX.rotating_card_theme_tokens;
        list.getClass();
        byteString.getClass();
        return new CardModule.HeroNullStateModule.UnifiedCardHomeNUX(upsellCard2, content2, list, gridConfig2, content4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX unifiedCardHomeNUX = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX) obj;
        unifiedCardHomeNUX.getClass();
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard.ADAPTER.encodeWithTag(protoWriter, 1, unifiedCardHomeNUX.upsell_card);
        ProtoAdapter protoAdapter = CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, unifiedCardHomeNUX.content);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, unifiedCardHomeNUX.rotating_card_theme_tokens);
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.ADAPTER.encodeWithTag(protoWriter, 4, unifiedCardHomeNUX.grid_config);
        protoAdapter.encodeWithTag(protoWriter, 5, unifiedCardHomeNUX.grid_content);
        protoWriter.writeBytes(unifiedCardHomeNUX.unknownFields());
    }
}
