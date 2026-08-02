package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.ProfilePageUpsellComponent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ProfilePageUpsellComponent$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ProfilePageUpsellComponent((ProfilePageUpsellComponent.Icon) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ProfilePageUpsellComponent.Icon.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProfilePageUpsellComponent profilePageUpsellComponent = (ProfilePageUpsellComponent) obj;
        reverseProtoWriter.getClass();
        profilePageUpsellComponent.getClass();
        reverseProtoWriter.writeBytes(profilePageUpsellComponent.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, profilePageUpsellComponent.entity_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, profilePageUpsellComponent.url_on_press);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, profilePageUpsellComponent.subtext);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, profilePageUpsellComponent.header_text);
        ProfilePageUpsellComponent.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, profilePageUpsellComponent.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProfilePageUpsellComponent profilePageUpsellComponent = (ProfilePageUpsellComponent) obj;
        profilePageUpsellComponent.getClass();
        int encodedSizeWithTag = ProfilePageUpsellComponent.Icon.ADAPTER.encodedSizeWithTag(1, profilePageUpsellComponent.icon) + profilePageUpsellComponent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, profilePageUpsellComponent.entity_id) + protoAdapter.encodedSizeWithTag(4, profilePageUpsellComponent.url_on_press) + protoAdapter.encodedSizeWithTag(3, profilePageUpsellComponent.subtext) + protoAdapter.encodedSizeWithTag(2, profilePageUpsellComponent.header_text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProfilePageUpsellComponent profilePageUpsellComponent = (ProfilePageUpsellComponent) obj;
        profilePageUpsellComponent.getClass();
        ByteString byteString = ByteString.EMPTY;
        ProfilePageUpsellComponent.Icon icon = profilePageUpsellComponent.icon;
        String str = profilePageUpsellComponent.header_text;
        String str2 = profilePageUpsellComponent.subtext;
        String str3 = profilePageUpsellComponent.url_on_press;
        String str4 = profilePageUpsellComponent.entity_id;
        byteString.getClass();
        return new ProfilePageUpsellComponent(icon, str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProfilePageUpsellComponent profilePageUpsellComponent = (ProfilePageUpsellComponent) obj;
        profilePageUpsellComponent.getClass();
        ProfilePageUpsellComponent.Icon.ADAPTER.encodeWithTag(protoWriter, 1, profilePageUpsellComponent.icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, profilePageUpsellComponent.header_text);
        protoAdapter.encodeWithTag(protoWriter, 3, profilePageUpsellComponent.subtext);
        protoAdapter.encodeWithTag(protoWriter, 4, profilePageUpsellComponent.url_on_press);
        protoAdapter.encodeWithTag(protoWriter, 5, profilePageUpsellComponent.entity_id);
        protoWriter.writeBytes(profilePageUpsellComponent.unknownFields());
    }
}
