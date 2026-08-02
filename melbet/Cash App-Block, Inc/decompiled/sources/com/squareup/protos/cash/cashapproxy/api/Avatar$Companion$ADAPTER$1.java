package com.squareup.protos.cash.cashapproxy.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Avatar$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Avatar((Image) obj, (Image) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Avatar avatar = (Avatar) obj;
        reverseProtoWriter.getClass();
        avatar.getClass();
        reverseProtoWriter.writeBytes(avatar.unknownFields());
        ProtoAdapter protoAdapter = Image.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, avatar.badge);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, avatar.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Avatar avatar = (Avatar) obj;
        avatar.getClass();
        int size$okio = avatar.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Image.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, avatar.badge) + protoAdapter.encodedSizeWithTag(1, avatar.image) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Avatar avatar = (Avatar) obj;
        avatar.getClass();
        Image image = avatar.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Image image3 = avatar.badge;
        Image image4 = image3 != null ? (Image) Image.ADAPTER.redact(image3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Avatar(image2, image4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Avatar avatar = (Avatar) obj;
        avatar.getClass();
        ProtoAdapter protoAdapter = Image.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, avatar.image);
        protoAdapter.encodeWithTag(protoWriter, 2, avatar.badge);
        protoWriter.writeBytes(avatar.unknownFields());
    }
}
