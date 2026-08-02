package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardModule$HeroNullStateModule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        CardModule$HeroNullStateModule$Nux$UhchNux cardModule$HeroNullStateModule$Nux$UhchNux = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.HeroNullStateModule(cardModule$HeroNullStateModule$Nux$UhchNux, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                cardModule$HeroNullStateModule$Nux$UhchNux = new CardModule$HeroNullStateModule$Nux$UhchNux((CardModule.HeroNullStateModule.UnifiedCardHomeNUX) CardModule.HeroNullStateModule.UnifiedCardHomeNUX.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.HeroNullStateModule heroNullStateModule = (CardModule.HeroNullStateModule) obj;
        reverseProtoWriter.getClass();
        heroNullStateModule.getClass();
        reverseProtoWriter.writeBytes(heroNullStateModule.unknownFields());
        CardModule$HeroNullStateModule$Nux$UhchNux cardModule$HeroNullStateModule$Nux$UhchNux = heroNullStateModule.nux;
        if (cardModule$HeroNullStateModule$Nux$UhchNux != null) {
            CardModule.HeroNullStateModule.UnifiedCardHomeNUX.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cardModule$HeroNullStateModule$Nux$UhchNux.value);
        } else {
            if (cardModule$HeroNullStateModule$Nux$UhchNux == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.HeroNullStateModule heroNullStateModule = (CardModule.HeroNullStateModule) obj;
        heroNullStateModule.getClass();
        int size$okio = heroNullStateModule.unknownFields().getSize$okio();
        CardModule$HeroNullStateModule$Nux$UhchNux cardModule$HeroNullStateModule$Nux$UhchNux = heroNullStateModule.nux;
        if (cardModule$HeroNullStateModule$Nux$UhchNux != null) {
            return CardModule.HeroNullStateModule.UnifiedCardHomeNUX.ADAPTER.encodedSizeWithTag(1, cardModule$HeroNullStateModule$Nux$UhchNux.value) + size$okio;
        }
        if (cardModule$HeroNullStateModule$Nux$UhchNux == null) {
            return size$okio;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.HeroNullStateModule heroNullStateModule = (CardModule.HeroNullStateModule) obj;
        heroNullStateModule.getClass();
        ByteString byteString = ByteString.EMPTY;
        CardModule$HeroNullStateModule$Nux$UhchNux cardModule$HeroNullStateModule$Nux$UhchNux = heroNullStateModule.nux;
        byteString.getClass();
        return new CardModule.HeroNullStateModule(cardModule$HeroNullStateModule$Nux$UhchNux, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.HeroNullStateModule heroNullStateModule = (CardModule.HeroNullStateModule) obj;
        heroNullStateModule.getClass();
        CardModule$HeroNullStateModule$Nux$UhchNux cardModule$HeroNullStateModule$Nux$UhchNux = heroNullStateModule.nux;
        if (cardModule$HeroNullStateModule$Nux$UhchNux != null) {
            CardModule.HeroNullStateModule.UnifiedCardHomeNUX.ADAPTER.encodeWithTag(protoWriter, 1, cardModule$HeroNullStateModule$Nux$UhchNux.value);
        } else if (cardModule$HeroNullStateModule$Nux$UhchNux != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(heroNullStateModule.unknownFields());
    }
}
