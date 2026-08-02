package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import app.cash.redwood.treehouse.EventListener;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class EmbeddedImageSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        EventListener eventListener = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EmbeddedImageSection((ItemMetadata) obj, (String) obj2, eventListener, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ItemMetadata.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                eventListener = new EmbeddedImageSection$Image$EmbeddedImage((EmbeddedImage) EmbeddedImage.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                eventListener = new EmbeddedImageSection$Image$Picture((Image) Image.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EmbeddedImageSection embeddedImageSection = (EmbeddedImageSection) obj;
        reverseProtoWriter.getClass();
        embeddedImageSection.getClass();
        reverseProtoWriter.writeBytes(embeddedImageSection.unknownFields());
        EventListener eventListener = embeddedImageSection.image;
        if (eventListener instanceof EmbeddedImageSection$Image$EmbeddedImage) {
            EmbeddedImage.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((EmbeddedImageSection$Image$EmbeddedImage) eventListener).value);
        } else if (eventListener instanceof EmbeddedImageSection$Image$Picture) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((EmbeddedImageSection$Image$Picture) eventListener).value);
        } else if (eventListener != null) {
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
        EventListener eventListener = embeddedImageSection.image;
        if (eventListener instanceof EmbeddedImageSection$Image$EmbeddedImage) {
            encodedSizeWithTag = EmbeddedImage.ADAPTER.encodedSizeWithTag(3, ((EmbeddedImageSection$Image$EmbeddedImage) eventListener).value);
        } else {
            if (!(eventListener instanceof EmbeddedImageSection$Image$Picture)) {
                if (eventListener == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(4, ((EmbeddedImageSection$Image$Picture) eventListener).value);
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
        EventListener eventListener = embeddedImageSection.image;
        byteString.getClass();
        return new EmbeddedImageSection(itemMetadata2, null, eventListener, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EmbeddedImageSection embeddedImageSection = (EmbeddedImageSection) obj;
        embeddedImageSection.getClass();
        ItemMetadata.ADAPTER.encodeWithTag(protoWriter, 1, embeddedImageSection.metadata);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, embeddedImageSection.item_action_url);
        EventListener eventListener = embeddedImageSection.image;
        if (eventListener instanceof EmbeddedImageSection$Image$EmbeddedImage) {
            EmbeddedImage.ADAPTER.encodeWithTag(protoWriter, 3, ((EmbeddedImageSection$Image$EmbeddedImage) eventListener).value);
        } else if (eventListener instanceof EmbeddedImageSection$Image$Picture) {
            Image.ADAPTER.encodeWithTag(protoWriter, 4, ((EmbeddedImageSection$Image$Picture) eventListener).value);
        } else if (eventListener != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(embeddedImageSection.unknownFields());
    }
}
