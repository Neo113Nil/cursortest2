package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetEditorialResponse$EditorialContent$Image$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetEditorialResponse.EditorialContent.Image((LocalImage) obj, (GetEditorialResponse.EditorialContent.Image.Style) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = GetEditorialResponse.EditorialContent.Image.Style.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEditorialResponse.EditorialContent.Image image = (GetEditorialResponse.EditorialContent.Image) obj;
        reverseProtoWriter.getClass();
        image.getClass();
        reverseProtoWriter.writeBytes(image.unknownFields());
        GetEditorialResponse.EditorialContent.Image.Style.ADAPTER.encodeWithTag(reverseProtoWriter, 2, image.style);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, image.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEditorialResponse.EditorialContent.Image image = (GetEditorialResponse.EditorialContent.Image) obj;
        image.getClass();
        return GetEditorialResponse.EditorialContent.Image.Style.ADAPTER.encodedSizeWithTag(2, image.style) + LocalImage.ADAPTER.encodedSizeWithTag(1, image.image) + image.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEditorialResponse.EditorialContent.Image image = (GetEditorialResponse.EditorialContent.Image) obj;
        image.getClass();
        LocalImage localImage = image.image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        ByteString byteString = ByteString.EMPTY;
        GetEditorialResponse.EditorialContent.Image.Style style = image.style;
        byteString.getClass();
        return new GetEditorialResponse.EditorialContent.Image(localImage2, style, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEditorialResponse.EditorialContent.Image image = (GetEditorialResponse.EditorialContent.Image) obj;
        image.getClass();
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 1, image.image);
        GetEditorialResponse.EditorialContent.Image.Style.ADAPTER.encodeWithTag(protoWriter, 2, image.style);
        protoWriter.writeBytes(image.unknownFields());
    }
}
