package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.CardModule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CardModule$HeroIssuedCardModule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardModule.HeroIssuedCardModule((IssuedCardElement) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(IssuedCardElement.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardModule.HeroIssuedCardModule heroIssuedCardModule = (CardModule.HeroIssuedCardModule) obj;
        reverseProtoWriter.getClass();
        heroIssuedCardModule.getClass();
        reverseProtoWriter.writeBytes(heroIssuedCardModule.unknownFields());
        IssuedCardElement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, heroIssuedCardModule.element);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardModule.HeroIssuedCardModule heroIssuedCardModule = (CardModule.HeroIssuedCardModule) obj;
        heroIssuedCardModule.getClass();
        return IssuedCardElement.ADAPTER.encodedSizeWithTag(1, heroIssuedCardModule.element) + heroIssuedCardModule.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardModule.HeroIssuedCardModule heroIssuedCardModule = (CardModule.HeroIssuedCardModule) obj;
        heroIssuedCardModule.getClass();
        IssuedCardElement issuedCardElement = heroIssuedCardModule.element;
        IssuedCardElement issuedCardElement2 = issuedCardElement != null ? (IssuedCardElement) IssuedCardElement.ADAPTER.redact(issuedCardElement) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardModule.HeroIssuedCardModule(issuedCardElement2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardModule.HeroIssuedCardModule heroIssuedCardModule = (CardModule.HeroIssuedCardModule) obj;
        heroIssuedCardModule.getClass();
        IssuedCardElement.ADAPTER.encodeWithTag(protoWriter, 1, heroIssuedCardModule.element);
        protoWriter.writeBytes(heroIssuedCardModule.unknownFields());
    }
}
