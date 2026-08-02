package com.squareup.protos.cash.cashstorefronts.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashstorefronts.api.ImageAsset;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ImageAsset$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ImageAsset((Image) obj, (String) obj2, (ImageAsset.TextColor) obj3, (ImageAsset.DimmerMode) obj4, (ImageAsset.ImageType) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj3 = ImageAsset.TextColor.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 4) {
                try {
                    obj4 = ImageAsset.DimmerMode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj5 = ImageAsset.ImageType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ImageAsset imageAsset = (ImageAsset) obj;
        reverseProtoWriter.getClass();
        imageAsset.getClass();
        reverseProtoWriter.writeBytes(imageAsset.unknownFields());
        ImageAsset.ImageType.ADAPTER.encodeWithTag(reverseProtoWriter, 5, imageAsset.f1258type);
        ImageAsset.DimmerMode.ADAPTER.encodeWithTag(reverseProtoWriter, 4, imageAsset.dimmer_mode);
        ImageAsset.TextColor.ADAPTER.encodeWithTag(reverseProtoWriter, 3, imageAsset.text_color);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, imageAsset.image_type);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, imageAsset.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ImageAsset imageAsset = (ImageAsset) obj;
        imageAsset.getClass();
        return ImageAsset.ImageType.ADAPTER.encodedSizeWithTag(5, imageAsset.f1258type) + ImageAsset.DimmerMode.ADAPTER.encodedSizeWithTag(4, imageAsset.dimmer_mode) + ImageAsset.TextColor.ADAPTER.encodedSizeWithTag(3, imageAsset.text_color) + ProtoAdapter.STRING.encodedSizeWithTag(2, imageAsset.image_type) + Image.ADAPTER.encodedSizeWithTag(1, imageAsset.image) + imageAsset.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ImageAsset imageAsset = (ImageAsset) obj;
        imageAsset.getClass();
        Image image = imageAsset.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = imageAsset.image_type;
        ImageAsset.TextColor textColor = imageAsset.text_color;
        ImageAsset.DimmerMode dimmerMode = imageAsset.dimmer_mode;
        ImageAsset.ImageType imageType = imageAsset.f1258type;
        byteString.getClass();
        return new ImageAsset(image2, str, textColor, dimmerMode, imageType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ImageAsset imageAsset = (ImageAsset) obj;
        imageAsset.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, imageAsset.image);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, imageAsset.image_type);
        ImageAsset.TextColor.ADAPTER.encodeWithTag(protoWriter, 3, imageAsset.text_color);
        ImageAsset.DimmerMode.ADAPTER.encodeWithTag(protoWriter, 4, imageAsset.dimmer_mode);
        ImageAsset.ImageType.ADAPTER.encodeWithTag(protoWriter, 5, imageAsset.f1258type);
        protoWriter.writeBytes(imageAsset.unknownFields());
    }
}
