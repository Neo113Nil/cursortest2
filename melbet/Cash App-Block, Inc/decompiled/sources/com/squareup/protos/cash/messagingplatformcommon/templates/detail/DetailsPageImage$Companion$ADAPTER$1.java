package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DetailsPageImage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DetailsPageImage((DetailsPageImageAsset) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(DetailsPageImageAsset.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DetailsPageImage detailsPageImage = (DetailsPageImage) obj;
        reverseProtoWriter.getClass();
        detailsPageImage.getClass();
        reverseProtoWriter.writeBytes(detailsPageImage.unknownFields());
        DetailsPageImageAsset.ADAPTER.encodeWithTag(reverseProtoWriter, 1, detailsPageImage.image_asset);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DetailsPageImage detailsPageImage = (DetailsPageImage) obj;
        detailsPageImage.getClass();
        return DetailsPageImageAsset.ADAPTER.encodedSizeWithTag(1, detailsPageImage.image_asset) + detailsPageImage.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DetailsPageImage detailsPageImage = (DetailsPageImage) obj;
        detailsPageImage.getClass();
        DetailsPageImageAsset detailsPageImageAsset = detailsPageImage.image_asset;
        DetailsPageImageAsset detailsPageImageAsset2 = detailsPageImageAsset != null ? (DetailsPageImageAsset) DetailsPageImageAsset.ADAPTER.redact(detailsPageImageAsset) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DetailsPageImage(detailsPageImageAsset2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DetailsPageImage detailsPageImage = (DetailsPageImage) obj;
        detailsPageImage.getClass();
        DetailsPageImageAsset.ADAPTER.encodeWithTag(protoWriter, 1, detailsPageImage.image_asset);
        protoWriter.writeBytes(detailsPageImage.unknownFields());
    }
}
