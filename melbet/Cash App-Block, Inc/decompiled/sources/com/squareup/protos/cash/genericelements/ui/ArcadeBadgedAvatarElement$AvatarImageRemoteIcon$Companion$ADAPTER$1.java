package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ArcadeBadgedAvatarElement$AvatarImageRemoteIcon$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ArcadeBadgedAvatarElement.AvatarImageRemoteIcon((Image) obj, (Boolean) obj2, (ArcadeBadgedAvatarElement.AvatarImageLocalIcon) obj3, (SemanticIconColor) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(ArcadeBadgedAvatarElement.AvatarImageLocalIcon.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = SemanticIconColor.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ArcadeBadgedAvatarElement.AvatarImageRemoteIcon avatarImageRemoteIcon = (ArcadeBadgedAvatarElement.AvatarImageRemoteIcon) obj;
        reverseProtoWriter.getClass();
        avatarImageRemoteIcon.getClass();
        reverseProtoWriter.writeBytes(avatarImageRemoteIcon.unknownFields());
        SemanticIconColor.ADAPTER.encodeWithTag(reverseProtoWriter, 4, avatarImageRemoteIcon.tint_color);
        ArcadeBadgedAvatarElement.AvatarImageLocalIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 3, avatarImageRemoteIcon.placeholder);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, avatarImageRemoteIcon.colorize_image);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, avatarImageRemoteIcon.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ArcadeBadgedAvatarElement.AvatarImageRemoteIcon avatarImageRemoteIcon = (ArcadeBadgedAvatarElement.AvatarImageRemoteIcon) obj;
        avatarImageRemoteIcon.getClass();
        return SemanticIconColor.ADAPTER.encodedSizeWithTag(4, avatarImageRemoteIcon.tint_color) + ArcadeBadgedAvatarElement.AvatarImageLocalIcon.ADAPTER.encodedSizeWithTag(3, avatarImageRemoteIcon.placeholder) + ProtoAdapter.BOOL.encodedSizeWithTag(2, avatarImageRemoteIcon.colorize_image) + Image.ADAPTER.encodedSizeWithTag(1, avatarImageRemoteIcon.image) + avatarImageRemoteIcon.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ArcadeBadgedAvatarElement.AvatarImageRemoteIcon avatarImageRemoteIcon = (ArcadeBadgedAvatarElement.AvatarImageRemoteIcon) obj;
        avatarImageRemoteIcon.getClass();
        Image image = avatarImageRemoteIcon.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ArcadeBadgedAvatarElement.AvatarImageLocalIcon avatarImageLocalIcon = avatarImageRemoteIcon.placeholder;
        ArcadeBadgedAvatarElement.AvatarImageLocalIcon avatarImageLocalIcon2 = avatarImageLocalIcon != null ? (ArcadeBadgedAvatarElement.AvatarImageLocalIcon) ArcadeBadgedAvatarElement.AvatarImageLocalIcon.ADAPTER.redact(avatarImageLocalIcon) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = avatarImageRemoteIcon.colorize_image;
        SemanticIconColor semanticIconColor = avatarImageRemoteIcon.tint_color;
        byteString.getClass();
        return new ArcadeBadgedAvatarElement.AvatarImageRemoteIcon(image2, bool, avatarImageLocalIcon2, semanticIconColor, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ArcadeBadgedAvatarElement.AvatarImageRemoteIcon avatarImageRemoteIcon = (ArcadeBadgedAvatarElement.AvatarImageRemoteIcon) obj;
        avatarImageRemoteIcon.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, avatarImageRemoteIcon.image);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, avatarImageRemoteIcon.colorize_image);
        ArcadeBadgedAvatarElement.AvatarImageLocalIcon.ADAPTER.encodeWithTag(protoWriter, 3, avatarImageRemoteIcon.placeholder);
        SemanticIconColor.ADAPTER.encodeWithTag(protoWriter, 4, avatarImageRemoteIcon.tint_color);
        protoWriter.writeBytes(avatarImageRemoteIcon.unknownFields());
    }
}
