package com.squareup.protos.cash.p2p.profile_directory.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.ui.Color;
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
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Avatar((Avatar.Initials) obj, (Image) obj2, (Image) obj3, (String) obj4, (Boolean) obj5, (Color) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Avatar.Initials.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj3);
            } else if (nextTag == 5) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 6) {
                obj5 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 7) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj6 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj6);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Avatar avatar = (Avatar) obj;
        reverseProtoWriter.getClass();
        avatar.getClass();
        reverseProtoWriter.writeBytes(avatar.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 7, avatar.background_color);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 6, avatar.colorize_avatar);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, avatar.action_url);
        ProtoAdapter protoAdapter = Image.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, avatar.icon);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, avatar.picture);
        Avatar.Initials.ADAPTER.encodeWithTag(reverseProtoWriter, 1, avatar.initials);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Avatar avatar = (Avatar) obj;
        avatar.getClass();
        int encodedSizeWithTag = Avatar.Initials.ADAPTER.encodedSizeWithTag(1, avatar.initials) + avatar.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Image.ADAPTER;
        return Color.ADAPTER.encodedSizeWithTag(7, avatar.background_color) + ProtoAdapter.BOOL.encodedSizeWithTag(6, avatar.colorize_avatar) + ProtoAdapter.STRING.encodedSizeWithTag(5, avatar.action_url) + protoAdapter.encodedSizeWithTag(4, avatar.icon) + protoAdapter.encodedSizeWithTag(2, avatar.picture) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Avatar avatar = (Avatar) obj;
        avatar.getClass();
        Avatar.Initials initials = avatar.initials;
        Avatar.Initials initials2 = initials != null ? (Avatar.Initials) Avatar.Initials.ADAPTER.redact(initials) : null;
        Image image = avatar.picture;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Image image3 = avatar.icon;
        Image image4 = image3 != null ? (Image) Image.ADAPTER.redact(image3) : null;
        Color color = avatar.background_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = avatar.colorize_avatar;
        byteString.getClass();
        return new Avatar(initials2, image2, image4, null, bool, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Avatar avatar = (Avatar) obj;
        avatar.getClass();
        Avatar.Initials.ADAPTER.encodeWithTag(protoWriter, 1, avatar.initials);
        ProtoAdapter protoAdapter = Image.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, avatar.picture);
        protoAdapter.encodeWithTag(protoWriter, 4, avatar.icon);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, avatar.action_url);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, avatar.colorize_avatar);
        Color.ADAPTER.encodeWithTag(protoWriter, 7, avatar.background_color);
        protoWriter.writeBytes(avatar.unknownFields());
    }
}
