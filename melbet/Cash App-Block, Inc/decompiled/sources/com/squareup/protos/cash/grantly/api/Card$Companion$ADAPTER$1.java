package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Card$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Card((InstrumentType) obj, (Card.CardPii) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = InstrumentType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Card.CardPii.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Card card = (Card) obj;
        reverseProtoWriter.getClass();
        card.getClass();
        reverseProtoWriter.writeBytes(card.unknownFields());
        Card.CardPii.ADAPTER.encodeWithTag(reverseProtoWriter, 2, card.card_pii);
        InstrumentType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, card.card_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Card card = (Card) obj;
        card.getClass();
        return Card.CardPii.ADAPTER.encodedSizeWithTag(2, card.card_pii) + InstrumentType.ADAPTER.encodedSizeWithTag(1, card.card_type) + card.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Card card = (Card) obj;
        card.getClass();
        ByteString byteString = ByteString.EMPTY;
        InstrumentType instrumentType = card.card_type;
        byteString.getClass();
        return new Card(instrumentType, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Card card = (Card) obj;
        card.getClass();
        InstrumentType.ADAPTER.encodeWithTag(protoWriter, 1, card.card_type);
        Card.CardPii.ADAPTER.encodeWithTag(protoWriter, 2, card.card_pii);
        protoWriter.writeBytes(card.unknownFields());
    }
}
