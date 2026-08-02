package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ArcadeBadgedAvatarElement$AvatarImageLocalIcon$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ArcadeBadgedAvatarElement.AvatarImageLocalIcon((String) obj, (SemanticIconColor) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = SemanticIconColor.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ArcadeBadgedAvatarElement.AvatarImageLocalIcon avatarImageLocalIcon = (ArcadeBadgedAvatarElement.AvatarImageLocalIcon) obj;
        reverseProtoWriter.getClass();
        avatarImageLocalIcon.getClass();
        reverseProtoWriter.writeBytes(avatarImageLocalIcon.unknownFields());
        SemanticIconColor.ADAPTER.encodeWithTag(reverseProtoWriter, 2, avatarImageLocalIcon.tint_color);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, avatarImageLocalIcon.icon_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ArcadeBadgedAvatarElement.AvatarImageLocalIcon avatarImageLocalIcon = (ArcadeBadgedAvatarElement.AvatarImageLocalIcon) obj;
        avatarImageLocalIcon.getClass();
        return SemanticIconColor.ADAPTER.encodedSizeWithTag(2, avatarImageLocalIcon.tint_color) + ProtoAdapter.STRING.encodedSizeWithTag(1, avatarImageLocalIcon.icon_id) + avatarImageLocalIcon.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ArcadeBadgedAvatarElement.AvatarImageLocalIcon avatarImageLocalIcon = (ArcadeBadgedAvatarElement.AvatarImageLocalIcon) obj;
        avatarImageLocalIcon.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = avatarImageLocalIcon.icon_id;
        SemanticIconColor semanticIconColor = avatarImageLocalIcon.tint_color;
        byteString.getClass();
        return new ArcadeBadgedAvatarElement.AvatarImageLocalIcon(str, semanticIconColor, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ArcadeBadgedAvatarElement.AvatarImageLocalIcon avatarImageLocalIcon = (ArcadeBadgedAvatarElement.AvatarImageLocalIcon) obj;
        avatarImageLocalIcon.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, avatarImageLocalIcon.icon_id);
        SemanticIconColor.ADAPTER.encodeWithTag(protoWriter, 2, avatarImageLocalIcon.tint_color);
        protoWriter.writeBytes(avatarImageLocalIcon.unknownFields());
    }
}
