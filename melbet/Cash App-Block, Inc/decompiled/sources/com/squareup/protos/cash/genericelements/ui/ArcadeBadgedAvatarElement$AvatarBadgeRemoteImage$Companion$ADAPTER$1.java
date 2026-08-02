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
public final class ArcadeBadgedAvatarElement$AvatarBadgeRemoteImage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage((Image) obj, (Boolean) obj2, (ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon) obj3, (SemanticIconColor) obj4, (SemanticBackgroundColor) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                try {
                    obj4 = SemanticIconColor.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj5 = SemanticBackgroundColor.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage avatarBadgeRemoteImage = (ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage) obj;
        reverseProtoWriter.getClass();
        avatarBadgeRemoteImage.getClass();
        reverseProtoWriter.writeBytes(avatarBadgeRemoteImage.unknownFields());
        SemanticBackgroundColor.ADAPTER.encodeWithTag(reverseProtoWriter, 5, avatarBadgeRemoteImage.background_color);
        SemanticIconColor.ADAPTER.encodeWithTag(reverseProtoWriter, 4, avatarBadgeRemoteImage.tint_color);
        ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 3, avatarBadgeRemoteImage.placeholder);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, avatarBadgeRemoteImage.colorize_image);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, avatarBadgeRemoteImage.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage avatarBadgeRemoteImage = (ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage) obj;
        avatarBadgeRemoteImage.getClass();
        return SemanticBackgroundColor.ADAPTER.encodedSizeWithTag(5, avatarBadgeRemoteImage.background_color) + SemanticIconColor.ADAPTER.encodedSizeWithTag(4, avatarBadgeRemoteImage.tint_color) + ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon.ADAPTER.encodedSizeWithTag(3, avatarBadgeRemoteImage.placeholder) + ProtoAdapter.BOOL.encodedSizeWithTag(2, avatarBadgeRemoteImage.colorize_image) + Image.ADAPTER.encodedSizeWithTag(1, avatarBadgeRemoteImage.image) + avatarBadgeRemoteImage.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage avatarBadgeRemoteImage = (ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage) obj;
        avatarBadgeRemoteImage.getClass();
        Image image = avatarBadgeRemoteImage.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon avatarBadgeLocalIcon = avatarBadgeRemoteImage.placeholder;
        ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon avatarBadgeLocalIcon2 = avatarBadgeLocalIcon != null ? (ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon) ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon.ADAPTER.redact(avatarBadgeLocalIcon) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = avatarBadgeRemoteImage.colorize_image;
        SemanticIconColor semanticIconColor = avatarBadgeRemoteImage.tint_color;
        SemanticBackgroundColor semanticBackgroundColor = avatarBadgeRemoteImage.background_color;
        byteString.getClass();
        return new ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage(image2, bool, avatarBadgeLocalIcon2, semanticIconColor, semanticBackgroundColor, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage avatarBadgeRemoteImage = (ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage) obj;
        avatarBadgeRemoteImage.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, avatarBadgeRemoteImage.image);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, avatarBadgeRemoteImage.colorize_image);
        ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon.ADAPTER.encodeWithTag(protoWriter, 3, avatarBadgeRemoteImage.placeholder);
        SemanticIconColor.ADAPTER.encodeWithTag(protoWriter, 4, avatarBadgeRemoteImage.tint_color);
        SemanticBackgroundColor.ADAPTER.encodeWithTag(protoWriter, 5, avatarBadgeRemoteImage.background_color);
        protoWriter.writeBytes(avatarBadgeRemoteImage.unknownFields());
    }
}
