package com.squareup.protos.cash.cashface.api;

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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Avatar((Image) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        Avatar avatar = (Avatar) obj;
        reverseProtoWriter.getClass();
        avatar.getClass();
        reverseProtoWriter.writeBytes(avatar.unknownFields());
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, avatar.photo);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Avatar avatar = (Avatar) obj;
        avatar.getClass();
        return Image.ADAPTER.encodedSizeWithTag(1, avatar.photo) + avatar.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((Avatar) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Avatar(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Avatar avatar = (Avatar) obj;
        avatar.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, avatar.photo);
        protoWriter.writeBytes(avatar.unknownFields());
    }
}
