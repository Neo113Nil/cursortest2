package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Bullet$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Bullet((Image) obj, (Text) obj2, (Text) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Bullet bullet = (Bullet) obj;
        reverseProtoWriter.getClass();
        bullet.getClass();
        reverseProtoWriter.writeBytes(bullet.unknownFields());
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, bullet.bullet_body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, bullet.bullet_title);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bullet.bullet_icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Bullet bullet = (Bullet) obj;
        bullet.getClass();
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, bullet.bullet_icon) + bullet.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, bullet.bullet_body) + protoAdapter.encodedSizeWithTag(2, bullet.bullet_title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Bullet bullet = (Bullet) obj;
        bullet.getClass();
        Image image = bullet.bullet_icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Text text = bullet.bullet_title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = bullet.bullet_body;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Bullet(image2, text2, text4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Bullet bullet = (Bullet) obj;
        bullet.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, bullet.bullet_icon);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, bullet.bullet_title);
        protoAdapter.encodeWithTag(protoWriter, 3, bullet.bullet_body);
        protoWriter.writeBytes(bullet.unknownFields());
    }
}
