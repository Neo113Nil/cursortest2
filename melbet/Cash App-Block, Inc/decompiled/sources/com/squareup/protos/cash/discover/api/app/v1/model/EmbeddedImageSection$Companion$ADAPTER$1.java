package com.squareup.protos.cash.discover.api.app.v1.model;

import androidx.room.TransactorKt;
import coil3.Image_androidKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes.dex */
public final class EmbeddedImageSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Image_androidKt image_androidKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EmbeddedImageSection((ItemMetadata) obj, (String) obj2, image_androidKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ItemMetadata.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                image_androidKt = new EmbeddedImageSection$Image$EmbeddedImage((EmbeddedImage) EmbeddedImage.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                image_androidKt = new EmbeddedImageSection$Image$Picture((Image) Image.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EmbeddedImageSection embeddedImageSection = (EmbeddedImageSection) obj;
        reverseProtoWriter.getClass();
        embeddedImageSection.getClass();
        reverseProtoWriter.writeBytes(embeddedImageSection.unknownFields());
        Image_androidKt image_androidKt = embeddedImageSection.image;
        if (image_androidKt instanceof EmbeddedImageSection$Image$EmbeddedImage) {
            EmbeddedImage.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((EmbeddedImageSection$Image$EmbeddedImage) image_androidKt).getValue());
        } else if (image_androidKt instanceof EmbeddedImageSection$Image$Picture) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((EmbeddedImageSection$Image$Picture) image_androidKt).getValue());
        } else if (image_androidKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, embeddedImageSection.item_action_url);
        ItemMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, embeddedImageSection.metadata);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        EmbeddedImageSection embeddedImageSection = (EmbeddedImageSection) obj;
        embeddedImageSection.getClass();
        int encodedSizeWithTag2 = ProtoAdapter.STRING.encodedSizeWithTag(2, embeddedImageSection.item_action_url) + ItemMetadata.ADAPTER.encodedSizeWithTag(1, embeddedImageSection.metadata) + embeddedImageSection.unknownFields().getSize$okio();
        Image_androidKt image_androidKt = embeddedImageSection.image;
        if (image_androidKt instanceof EmbeddedImageSection$Image$EmbeddedImage) {
            encodedSizeWithTag = EmbeddedImage.ADAPTER.encodedSizeWithTag(3, ((EmbeddedImageSection$Image$EmbeddedImage) image_androidKt).getValue());
        } else {
            if (!(image_androidKt instanceof EmbeddedImageSection$Image$Picture)) {
                if (image_androidKt == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(4, ((EmbeddedImageSection$Image$Picture) image_androidKt).getValue());
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EmbeddedImageSection embeddedImageSection = (EmbeddedImageSection) obj;
        embeddedImageSection.getClass();
        ItemMetadata itemMetadata = embeddedImageSection.metadata;
        ItemMetadata itemMetadata2 = itemMetadata != null ? (ItemMetadata) ItemMetadata.ADAPTER.redact(itemMetadata) : null;
        ByteString byteString = ByteString.EMPTY;
        Image_androidKt image_androidKt = embeddedImageSection.image;
        byteString.getClass();
        return new EmbeddedImageSection(itemMetadata2, null, image_androidKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EmbeddedImageSection embeddedImageSection = (EmbeddedImageSection) obj;
        embeddedImageSection.getClass();
        ItemMetadata.ADAPTER.encodeWithTag(protoWriter, 1, embeddedImageSection.metadata);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, embeddedImageSection.item_action_url);
        Image_androidKt image_androidKt = embeddedImageSection.image;
        if (image_androidKt instanceof EmbeddedImageSection$Image$EmbeddedImage) {
            EmbeddedImage.ADAPTER.encodeWithTag(protoWriter, 3, ((EmbeddedImageSection$Image$EmbeddedImage) image_androidKt).getValue());
        } else if (image_androidKt instanceof EmbeddedImageSection$Image$Picture) {
            Image.ADAPTER.encodeWithTag(protoWriter, 4, ((EmbeddedImageSection$Image$Picture) image_androidKt).getValue());
        } else if (image_androidKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(embeddedImageSection.unknownFields());
    }
}
