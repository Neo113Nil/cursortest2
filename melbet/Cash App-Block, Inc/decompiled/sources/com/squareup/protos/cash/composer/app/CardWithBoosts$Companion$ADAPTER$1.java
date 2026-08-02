package com.squareup.protos.cash.composer.app;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardWithBoosts$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardWithBoosts((Card) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Card.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardWithBoosts cardWithBoosts = (CardWithBoosts) obj;
        reverseProtoWriter.getClass();
        cardWithBoosts.getClass();
        reverseProtoWriter.writeBytes(cardWithBoosts.unknownFields());
        Card.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cardWithBoosts.card);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardWithBoosts cardWithBoosts = (CardWithBoosts) obj;
        cardWithBoosts.getClass();
        return Card.ADAPTER.encodedSizeWithTag(1, cardWithBoosts.card) + cardWithBoosts.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardWithBoosts cardWithBoosts = (CardWithBoosts) obj;
        cardWithBoosts.getClass();
        Card card = cardWithBoosts.card;
        Card card2 = card != null ? (Card) Card.ADAPTER.redact(card) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardWithBoosts(card2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardWithBoosts cardWithBoosts = (CardWithBoosts) obj;
        cardWithBoosts.getClass();
        Card.ADAPTER.encodeWithTag(protoWriter, 1, cardWithBoosts.card);
        protoWriter.writeBytes(cardWithBoosts.unknownFields());
    }
}
