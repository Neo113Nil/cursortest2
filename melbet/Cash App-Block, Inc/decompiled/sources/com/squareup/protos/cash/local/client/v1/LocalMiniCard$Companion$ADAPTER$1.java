package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMiniCard$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LocalMiniCard((LocalColor) obj, (LocalImage) obj2, (LocalImage) obj3, (LocalColor) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMiniCard localMiniCard = (LocalMiniCard) obj;
        reverseProtoWriter.getClass();
        localMiniCard.getClass();
        reverseProtoWriter.writeBytes(localMiniCard.unknownFields());
        ProtoAdapter protoAdapter = LocalColor.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, localMiniCard.brand_card_outline_color);
        ProtoAdapter protoAdapter2 = LocalImage.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, localMiniCard.artwork_image);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, localMiniCard.icon);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localMiniCard.background_color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMiniCard localMiniCard = (LocalMiniCard) obj;
        localMiniCard.getClass();
        int size$okio = localMiniCard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalColor.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, localMiniCard.background_color) + size$okio;
        ProtoAdapter protoAdapter2 = LocalImage.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, localMiniCard.brand_card_outline_color) + protoAdapter2.encodedSizeWithTag(3, localMiniCard.artwork_image) + protoAdapter2.encodedSizeWithTag(2, localMiniCard.icon) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMiniCard localMiniCard = (LocalMiniCard) obj;
        localMiniCard.getClass();
        LocalColor localColor = localMiniCard.background_color;
        LocalColor localColor2 = localColor != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor) : null;
        LocalImage localImage = localMiniCard.icon;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        LocalImage localImage3 = localMiniCard.artwork_image;
        LocalImage localImage4 = localImage3 != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage3) : null;
        LocalColor localColor3 = localMiniCard.brand_card_outline_color;
        LocalColor localColor4 = localColor3 != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LocalMiniCard(localColor2, localImage2, localImage4, localColor4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMiniCard localMiniCard = (LocalMiniCard) obj;
        localMiniCard.getClass();
        ProtoAdapter protoAdapter = LocalColor.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, localMiniCard.background_color);
        ProtoAdapter protoAdapter2 = LocalImage.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 2, localMiniCard.icon);
        protoAdapter2.encodeWithTag(protoWriter, 3, localMiniCard.artwork_image);
        protoAdapter.encodeWithTag(protoWriter, 4, localMiniCard.brand_card_outline_color);
        protoWriter.writeBytes(localMiniCard.unknownFields());
    }
}
