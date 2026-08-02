package com.squareup.protos.cash.blockstable.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Asset$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Asset((String) obj, (String) obj2, (Image) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        Asset asset = (Asset) obj;
        reverseProtoWriter.getClass();
        asset.getClass();
        reverseProtoWriter.writeBytes(asset.unknownFields());
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, asset.icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, asset.display_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, asset.asset);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Asset asset = (Asset) obj;
        asset.getClass();
        int size$okio = asset.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Image.ADAPTER.encodedSizeWithTag(3, asset.icon) + protoAdapter.encodedSizeWithTag(2, asset.display_name) + protoAdapter.encodedSizeWithTag(1, asset.asset) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Asset asset = (Asset) obj;
        asset.getClass();
        Image image = asset.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = asset.asset;
        String str2 = asset.display_name;
        byteString.getClass();
        return new Asset(str, str2, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Asset asset = (Asset) obj;
        asset.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, asset.asset);
        protoAdapter.encodeWithTag(protoWriter, 2, asset.display_name);
        Image.ADAPTER.encodeWithTag(protoWriter, 3, asset.icon);
        protoWriter.writeBytes(asset.unknownFields());
    }
}
