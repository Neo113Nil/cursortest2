package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TiledHeroImage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TiledHeroImage((LocalImage) obj, (LocalMiniCard) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalMiniCard.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TiledHeroImage tiledHeroImage = (TiledHeroImage) obj;
        reverseProtoWriter.getClass();
        tiledHeroImage.getClass();
        reverseProtoWriter.writeBytes(tiledHeroImage.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, tiledHeroImage.caption);
        LocalMiniCard.ADAPTER.encodeWithTag(reverseProtoWriter, 2, tiledHeroImage.mini_card);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, tiledHeroImage.hero_image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TiledHeroImage tiledHeroImage = (TiledHeroImage) obj;
        tiledHeroImage.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, tiledHeroImage.caption) + LocalMiniCard.ADAPTER.encodedSizeWithTag(2, tiledHeroImage.mini_card) + LocalImage.ADAPTER.encodedSizeWithTag(1, tiledHeroImage.hero_image) + tiledHeroImage.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TiledHeroImage tiledHeroImage = (TiledHeroImage) obj;
        tiledHeroImage.getClass();
        LocalImage localImage = tiledHeroImage.hero_image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        LocalMiniCard localMiniCard = tiledHeroImage.mini_card;
        LocalMiniCard localMiniCard2 = localMiniCard != null ? (LocalMiniCard) LocalMiniCard.ADAPTER.redact(localMiniCard) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = tiledHeroImage.caption;
        byteString.getClass();
        return new TiledHeroImage(localImage2, localMiniCard2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TiledHeroImage tiledHeroImage = (TiledHeroImage) obj;
        tiledHeroImage.getClass();
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 1, tiledHeroImage.hero_image);
        LocalMiniCard.ADAPTER.encodeWithTag(protoWriter, 2, tiledHeroImage.mini_card);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, tiledHeroImage.caption);
        protoWriter.writeBytes(tiledHeroImage.unknownFields());
    }
}
