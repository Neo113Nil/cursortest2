package com.squareup.protos.cash.discover.api.app.v1.model;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CaptionSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CaptionSection((Image) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CaptionSection captionSection = (CaptionSection) obj;
        reverseProtoWriter.getClass();
        captionSection.getClass();
        reverseProtoWriter.writeBytes(captionSection.unknownFields());
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, captionSection.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CaptionSection captionSection = (CaptionSection) obj;
        captionSection.getClass();
        return Image.ADAPTER.encodedSizeWithTag(1, captionSection.image) + captionSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CaptionSection captionSection = (CaptionSection) obj;
        captionSection.getClass();
        Image image = captionSection.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CaptionSection(image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CaptionSection captionSection = (CaptionSection) obj;
        captionSection.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, captionSection.image);
        protoWriter.writeBytes(captionSection.unknownFields());
    }
}
