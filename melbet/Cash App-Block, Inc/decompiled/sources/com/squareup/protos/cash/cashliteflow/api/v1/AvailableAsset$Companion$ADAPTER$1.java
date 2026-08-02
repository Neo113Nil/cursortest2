package com.squareup.protos.cash.cashliteflow.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AvailableAsset$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AvailableAsset((String) obj, (String) obj2, (Image) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        AvailableAsset availableAsset = (AvailableAsset) obj;
        reverseProtoWriter.getClass();
        availableAsset.getClass();
        reverseProtoWriter.writeBytes(availableAsset.unknownFields());
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, availableAsset.icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, availableAsset.display_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, availableAsset.asset);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AvailableAsset availableAsset = (AvailableAsset) obj;
        availableAsset.getClass();
        int size$okio = availableAsset.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Image.ADAPTER.encodedSizeWithTag(3, availableAsset.icon) + protoAdapter.encodedSizeWithTag(2, availableAsset.display_name) + protoAdapter.encodedSizeWithTag(1, availableAsset.asset) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AvailableAsset availableAsset = (AvailableAsset) obj;
        availableAsset.getClass();
        Image image = availableAsset.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = availableAsset.asset;
        String str2 = availableAsset.display_name;
        byteString.getClass();
        return new AvailableAsset(str, str2, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AvailableAsset availableAsset = (AvailableAsset) obj;
        availableAsset.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, availableAsset.asset);
        protoAdapter.encodeWithTag(protoWriter, 2, availableAsset.display_name);
        Image.ADAPTER.encodeWithTag(protoWriter, 3, availableAsset.icon);
        protoWriter.writeBytes(availableAsset.unknownFields());
    }
}
