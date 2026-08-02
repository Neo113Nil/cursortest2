package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalNumberedListItem$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LocalNumberedListItem((Long) obj, (String) obj2, (String) obj3, (LocalImage) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalNumberedListItem localNumberedListItem = (LocalNumberedListItem) obj;
        reverseProtoWriter.getClass();
        localNumberedListItem.getClass();
        reverseProtoWriter.writeBytes(localNumberedListItem.unknownFields());
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 4, localNumberedListItem.image);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localNumberedListItem.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localNumberedListItem.header_label);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, localNumberedListItem.index);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalNumberedListItem localNumberedListItem = (LocalNumberedListItem) obj;
        localNumberedListItem.getClass();
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, localNumberedListItem.index) + localNumberedListItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalImage.ADAPTER.encodedSizeWithTag(4, localNumberedListItem.image) + protoAdapter.encodedSizeWithTag(3, localNumberedListItem.body) + protoAdapter.encodedSizeWithTag(2, localNumberedListItem.header_label) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalNumberedListItem localNumberedListItem = (LocalNumberedListItem) obj;
        localNumberedListItem.getClass();
        LocalImage localImage = localNumberedListItem.image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = localNumberedListItem.index;
        String str = localNumberedListItem.header_label;
        String str2 = localNumberedListItem.body;
        byteString.getClass();
        return new LocalNumberedListItem(l, str, str2, localImage2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalNumberedListItem localNumberedListItem = (LocalNumberedListItem) obj;
        localNumberedListItem.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, localNumberedListItem.index);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, localNumberedListItem.header_label);
        protoAdapter.encodeWithTag(protoWriter, 3, localNumberedListItem.body);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 4, localNumberedListItem.image);
        protoWriter.writeBytes(localNumberedListItem.unknownFields());
    }
}
