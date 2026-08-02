package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalRelatedContent;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalRelatedContent$Item$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LocalRelatedContent.Item((LocalImage) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalRelatedContent.Item item = (LocalRelatedContent.Item) obj;
        reverseProtoWriter.getClass();
        item.getClass();
        reverseProtoWriter.writeBytes(item.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, item.client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, item.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, item.title);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, item.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalRelatedContent.Item item = (LocalRelatedContent.Item) obj;
        item.getClass();
        int encodedSizeWithTag = LocalImage.ADAPTER.encodedSizeWithTag(1, item.image) + item.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, item.client_route) + protoAdapter.encodedSizeWithTag(3, item.description) + protoAdapter.encodedSizeWithTag(2, item.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalRelatedContent.Item item = (LocalRelatedContent.Item) obj;
        item.getClass();
        LocalImage localImage = item.image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = item.title;
        String str2 = item.description;
        String str3 = item.client_route;
        byteString.getClass();
        return new LocalRelatedContent.Item(localImage2, str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalRelatedContent.Item item = (LocalRelatedContent.Item) obj;
        item.getClass();
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 1, item.image);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, item.title);
        protoAdapter.encodeWithTag(protoWriter, 3, item.description);
        protoAdapter.encodeWithTag(protoWriter, 4, item.client_route);
        protoWriter.writeBytes(item.unknownFields());
    }
}
