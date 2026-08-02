package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Card$CardPii$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Card.CardPii((String) obj, (Expiration) obj2, (String) obj3, (ByteString) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Expiration.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3237) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.BYTES.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Card.CardPii cardPii = (Card.CardPii) obj;
        reverseProtoWriter.getClass();
        cardPii.getClass();
        reverseProtoWriter.writeBytes(cardPii.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 3237, cardPii.ciphertext_);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cardPii.last_four_digits);
        Expiration.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cardPii.expiration);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cardPii.postal_code);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Card.CardPii cardPii = (Card.CardPii) obj;
        cardPii.getClass();
        int size$okio = cardPii.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BYTES.encodedSizeWithTag(3237, cardPii.ciphertext_) + protoAdapter.encodedSizeWithTag(3, cardPii.last_four_digits) + Expiration.ADAPTER.encodedSizeWithTag(2, cardPii.expiration) + protoAdapter.encodedSizeWithTag(1, cardPii.postal_code) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Card.CardPii cardPii = (Card.CardPii) obj;
        cardPii.getClass();
        Expiration expiration = cardPii.expiration;
        Expiration expiration2 = expiration != null ? (Expiration) Expiration.ADAPTER.redact(expiration) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cardPii.last_four_digits;
        ByteString byteString2 = cardPii.ciphertext_;
        byteString.getClass();
        return new Card.CardPii(null, expiration2, str, byteString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Card.CardPii cardPii = (Card.CardPii) obj;
        cardPii.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cardPii.postal_code);
        Expiration.ADAPTER.encodeWithTag(protoWriter, 2, cardPii.expiration);
        protoAdapter.encodeWithTag(protoWriter, 3, cardPii.last_four_digits);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3237, cardPii.ciphertext_);
        protoWriter.writeBytes(cardPii.unknownFields());
    }
}
