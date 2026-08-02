package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CardModule$HeroNullStateModule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.HeroNullStateModule((CardModuleElement) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        CardModule.HeroNullStateModule heroNullStateModule = (CardModule.HeroNullStateModule) obj;
        reverseProtoWriter.getClass();
        heroNullStateModule.getClass();
        reverseProtoWriter.writeBytes(heroNullStateModule.unknownFields());
        CardModuleElement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, heroNullStateModule.element);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.HeroNullStateModule heroNullStateModule = (CardModule.HeroNullStateModule) obj;
        heroNullStateModule.getClass();
        return CardModuleElement.ADAPTER.encodedSizeWithTag(1, heroNullStateModule.element) + heroNullStateModule.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.HeroNullStateModule heroNullStateModule = (CardModule.HeroNullStateModule) obj;
        heroNullStateModule.getClass();
        CardModuleElement cardModuleElement = heroNullStateModule.element;
        CardModuleElement cardModuleElement2 = cardModuleElement != null ? (CardModuleElement) CardModuleElement.ADAPTER.redact(cardModuleElement) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.HeroNullStateModule(cardModuleElement2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.HeroNullStateModule heroNullStateModule = (CardModule.HeroNullStateModule) obj;
        heroNullStateModule.getClass();
        CardModuleElement.ADAPTER.encodeWithTag(protoWriter, 1, heroNullStateModule.element);
        protoWriter.writeBytes(heroNullStateModule.unknownFields());
    }
}
