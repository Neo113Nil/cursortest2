package com.squareup.protos.cash.composer.app;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardWithBenefits$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardWithBenefits((Card) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        CardWithBenefits cardWithBenefits = (CardWithBenefits) obj;
        reverseProtoWriter.getClass();
        cardWithBenefits.getClass();
        reverseProtoWriter.writeBytes(cardWithBenefits.unknownFields());
        Card.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cardWithBenefits.card);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardWithBenefits cardWithBenefits = (CardWithBenefits) obj;
        cardWithBenefits.getClass();
        return Card.ADAPTER.encodedSizeWithTag(1, cardWithBenefits.card) + cardWithBenefits.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardWithBenefits cardWithBenefits = (CardWithBenefits) obj;
        cardWithBenefits.getClass();
        Card card = cardWithBenefits.card;
        Card card2 = card != null ? (Card) Card.ADAPTER.redact(card) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardWithBenefits(card2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardWithBenefits cardWithBenefits = (CardWithBenefits) obj;
        cardWithBenefits.getClass();
        Card.ADAPTER.encodeWithTag(protoWriter, 1, cardWithBenefits.card);
        protoWriter.writeBytes(cardWithBenefits.unknownFields());
    }
}
