package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.genericelements.ui.AvatarElement;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AvatarElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AvatarElement((Image) obj5, (AvatarElement.Size) obj6, (Boolean) obj7, (Color) obj8, (Alignment) obj9, (String) obj10, (AvatarElement.Badge) obj11, (Action) obj12, (Image) obj13, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = obj7;
                    obj5 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj5);
                    obj7 = obj;
                    break;
                case 2:
                    obj2 = obj6;
                    obj = obj7;
                    obj3 = obj9;
                    obj4 = obj10;
                    try {
                        obj6 = AvatarElement.Size.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj10 = obj4;
                    obj9 = obj3;
                    obj7 = obj;
                    break;
                case 3:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    obj = obj7;
                    obj8 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj8);
                    obj7 = obj;
                    break;
                case 5:
                    obj2 = obj6;
                    obj = obj7;
                    try {
                        obj6 = obj2;
                        obj9 = Alignment.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj3 = obj9;
                        obj4 = obj10;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                    obj7 = obj;
                    break;
                case 6:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    try {
                        obj11 = AvatarElement.Badge.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        obj2 = obj6;
                        obj = obj7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 8:
                    obj12 = TransactorKt.decodeMessageOrMerge(Action.ADAPTER, protoReader, obj12);
                    break;
                case 9:
                    obj13 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj13);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj2 = obj6;
                    obj = obj7;
                    obj3 = obj9;
                    obj4 = obj10;
                    obj6 = obj2;
                    obj10 = obj4;
                    obj9 = obj3;
                    obj7 = obj;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AvatarElement avatarElement = (AvatarElement) obj;
        reverseProtoWriter.getClass();
        avatarElement.getClass();
        reverseProtoWriter.writeBytes(avatarElement.unknownFields());
        ProtoAdapter protoAdapter = Image.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, avatarElement.badge_image);
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 8, avatarElement.action);
        AvatarElement.Badge.ADAPTER.encodeWithTag(reverseProtoWriter, 7, avatarElement.badge);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, avatarElement.accessibility_label);
        Alignment.ADAPTER.encodeWithTag(reverseProtoWriter, 5, avatarElement.alignment);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 4, avatarElement.backgroundColor);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, avatarElement.colorizeAvatar);
        AvatarElement.Size.ADAPTER.encodeWithTag(reverseProtoWriter, 2, avatarElement.size);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, avatarElement.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AvatarElement avatarElement = (AvatarElement) obj;
        avatarElement.getClass();
        int size$okio = avatarElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Image.ADAPTER;
        return protoAdapter.encodedSizeWithTag(9, avatarElement.badge_image) + Action.ADAPTER.encodedSizeWithTag(8, avatarElement.action) + AvatarElement.Badge.ADAPTER.encodedSizeWithTag(7, avatarElement.badge) + ProtoAdapter.STRING.encodedSizeWithTag(6, avatarElement.accessibility_label) + Alignment.ADAPTER.encodedSizeWithTag(5, avatarElement.alignment) + Color.ADAPTER.encodedSizeWithTag(4, avatarElement.backgroundColor) + ProtoAdapter.BOOL.encodedSizeWithTag(3, avatarElement.colorizeAvatar) + AvatarElement.Size.ADAPTER.encodedSizeWithTag(2, avatarElement.size) + protoAdapter.encodedSizeWithTag(1, avatarElement.image) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AvatarElement avatarElement = (AvatarElement) obj;
        avatarElement.getClass();
        Image image = avatarElement.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Color color = avatarElement.backgroundColor;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Action action = avatarElement.action;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        Image image3 = avatarElement.badge_image;
        Image image4 = image3 != null ? (Image) Image.ADAPTER.redact(image3) : null;
        ByteString byteString = ByteString.EMPTY;
        AvatarElement.Size size = avatarElement.size;
        Boolean bool = avatarElement.colorizeAvatar;
        Alignment alignment = avatarElement.alignment;
        String str = avatarElement.accessibility_label;
        AvatarElement.Badge badge = avatarElement.badge;
        byteString.getClass();
        return new AvatarElement(image2, size, bool, color2, alignment, str, badge, action2, image4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AvatarElement avatarElement = (AvatarElement) obj;
        avatarElement.getClass();
        ProtoAdapter protoAdapter = Image.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, avatarElement.image);
        AvatarElement.Size.ADAPTER.encodeWithTag(protoWriter, 2, avatarElement.size);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, avatarElement.colorizeAvatar);
        Color.ADAPTER.encodeWithTag(protoWriter, 4, avatarElement.backgroundColor);
        Alignment.ADAPTER.encodeWithTag(protoWriter, 5, avatarElement.alignment);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, avatarElement.accessibility_label);
        AvatarElement.Badge.ADAPTER.encodeWithTag(protoWriter, 7, avatarElement.badge);
        Action.ADAPTER.encodeWithTag(protoWriter, 8, avatarElement.action);
        protoAdapter.encodeWithTag(protoWriter, 9, avatarElement.badge_image);
        protoWriter.writeBytes(avatarElement.unknownFields());
    }
}
