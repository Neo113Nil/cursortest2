package com.squareup.protos.rewardly.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class IconAsset$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new IconAsset((String) obj, (String) obj2, (Image) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        IconAsset iconAsset = (IconAsset) obj;
        reverseProtoWriter.getClass();
        iconAsset.getClass();
        reverseProtoWriter.writeBytes(iconAsset.unknownFields());
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, iconAsset.image);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, iconAsset.url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, iconAsset.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        IconAsset iconAsset = (IconAsset) obj;
        iconAsset.getClass();
        int size$okio = iconAsset.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Image.ADAPTER.encodedSizeWithTag(3, iconAsset.image) + protoAdapter.encodedSizeWithTag(2, iconAsset.url) + protoAdapter.encodedSizeWithTag(1, iconAsset.name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        IconAsset iconAsset = (IconAsset) obj;
        iconAsset.getClass();
        Image image = iconAsset.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = iconAsset.name;
        String str2 = iconAsset.url;
        byteString.getClass();
        return new IconAsset(str, str2, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        IconAsset iconAsset = (IconAsset) obj;
        iconAsset.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, iconAsset.name);
        protoAdapter.encodeWithTag(protoWriter, 2, iconAsset.url);
        Image.ADAPTER.encodeWithTag(protoWriter, 3, iconAsset.image);
        protoWriter.writeBytes(iconAsset.unknownFields());
    }
}
