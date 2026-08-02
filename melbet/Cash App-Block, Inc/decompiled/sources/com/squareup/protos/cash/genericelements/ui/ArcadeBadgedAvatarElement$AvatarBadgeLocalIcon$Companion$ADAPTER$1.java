package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ArcadeBadgedAvatarElement$AvatarBadgeLocalIcon$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon((String) obj, (SemanticIconColor) obj2, (Boolean) obj3, (SemanticBackgroundColor) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = SemanticIconColor.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = SemanticBackgroundColor.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon avatarBadgeLocalIcon = (ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon) obj;
        reverseProtoWriter.getClass();
        avatarBadgeLocalIcon.getClass();
        reverseProtoWriter.writeBytes(avatarBadgeLocalIcon.unknownFields());
        SemanticBackgroundColor.ADAPTER.encodeWithTag(reverseProtoWriter, 4, avatarBadgeLocalIcon.background_color);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, avatarBadgeLocalIcon.colorize_image);
        SemanticIconColor.ADAPTER.encodeWithTag(reverseProtoWriter, 2, avatarBadgeLocalIcon.tint_color);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, avatarBadgeLocalIcon.icon_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon avatarBadgeLocalIcon = (ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon) obj;
        avatarBadgeLocalIcon.getClass();
        return SemanticBackgroundColor.ADAPTER.encodedSizeWithTag(4, avatarBadgeLocalIcon.background_color) + ProtoAdapter.BOOL.encodedSizeWithTag(3, avatarBadgeLocalIcon.colorize_image) + SemanticIconColor.ADAPTER.encodedSizeWithTag(2, avatarBadgeLocalIcon.tint_color) + ProtoAdapter.STRING.encodedSizeWithTag(1, avatarBadgeLocalIcon.icon_id) + avatarBadgeLocalIcon.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon avatarBadgeLocalIcon = (ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon) obj;
        avatarBadgeLocalIcon.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = avatarBadgeLocalIcon.icon_id;
        SemanticIconColor semanticIconColor = avatarBadgeLocalIcon.tint_color;
        Boolean bool = avatarBadgeLocalIcon.colorize_image;
        SemanticBackgroundColor semanticBackgroundColor = avatarBadgeLocalIcon.background_color;
        byteString.getClass();
        return new ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon(str, semanticIconColor, bool, semanticBackgroundColor, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon avatarBadgeLocalIcon = (ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon) obj;
        avatarBadgeLocalIcon.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, avatarBadgeLocalIcon.icon_id);
        SemanticIconColor.ADAPTER.encodeWithTag(protoWriter, 2, avatarBadgeLocalIcon.tint_color);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, avatarBadgeLocalIcon.colorize_image);
        SemanticBackgroundColor.ADAPTER.encodeWithTag(protoWriter, 4, avatarBadgeLocalIcon.background_color);
        protoWriter.writeBytes(avatarBadgeLocalIcon.unknownFields());
    }
}
