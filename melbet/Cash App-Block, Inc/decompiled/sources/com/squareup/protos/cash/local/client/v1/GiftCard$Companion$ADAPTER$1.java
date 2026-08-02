package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GiftCard$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GiftCard((String) obj, (String) obj2, (LocalMoney) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GiftCard giftCard = (GiftCard) obj;
        reverseProtoWriter.getClass();
        giftCard.getClass();
        reverseProtoWriter.writeBytes(giftCard.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, giftCard.gift_card_id);
        LocalMoney.ADAPTER.encodeWithTag(reverseProtoWriter, 3, giftCard.gift_card_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, giftCard.last_4);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, giftCard.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GiftCard giftCard = (GiftCard) obj;
        giftCard.getClass();
        int size$okio = giftCard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, giftCard.gift_card_id) + LocalMoney.ADAPTER.encodedSizeWithTag(3, giftCard.gift_card_amount) + protoAdapter.encodedSizeWithTag(2, giftCard.last_4) + protoAdapter.encodedSizeWithTag(1, giftCard.id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GiftCard giftCard = (GiftCard) obj;
        giftCard.getClass();
        LocalMoney localMoney = giftCard.gift_card_amount;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = giftCard.last_4;
        String str2 = giftCard.gift_card_id;
        byteString.getClass();
        return new GiftCard(null, str, localMoney2, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GiftCard giftCard = (GiftCard) obj;
        giftCard.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, giftCard.id);
        protoAdapter.encodeWithTag(protoWriter, 2, giftCard.last_4);
        LocalMoney.ADAPTER.encodeWithTag(protoWriter, 3, giftCard.gift_card_amount);
        protoAdapter.encodeWithTag(protoWriter, 4, giftCard.gift_card_id);
        protoWriter.writeBytes(giftCard.unknownFields());
    }
}
