package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncGiftCardEntity$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncGiftCardEntity((GiftCard) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(GiftCard.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncGiftCardEntity syncGiftCardEntity = (SyncGiftCardEntity) obj;
        reverseProtoWriter.getClass();
        syncGiftCardEntity.getClass();
        reverseProtoWriter.writeBytes(syncGiftCardEntity.unknownFields());
        GiftCard.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncGiftCardEntity.gift_card);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncGiftCardEntity syncGiftCardEntity = (SyncGiftCardEntity) obj;
        syncGiftCardEntity.getClass();
        return GiftCard.ADAPTER.encodedSizeWithTag(1, syncGiftCardEntity.gift_card) + syncGiftCardEntity.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncGiftCardEntity syncGiftCardEntity = (SyncGiftCardEntity) obj;
        syncGiftCardEntity.getClass();
        GiftCard giftCard = syncGiftCardEntity.gift_card;
        GiftCard giftCard2 = giftCard != null ? (GiftCard) GiftCard.ADAPTER.redact(giftCard) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SyncGiftCardEntity(giftCard2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncGiftCardEntity syncGiftCardEntity = (SyncGiftCardEntity) obj;
        syncGiftCardEntity.getClass();
        GiftCard.ADAPTER.encodeWithTag(protoWriter, 1, syncGiftCardEntity.gift_card);
        protoWriter.writeBytes(syncGiftCardEntity.unknownFields());
    }
}
