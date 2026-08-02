package com.squareup.protos.cash.contacts.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SocialProfile$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SocialProfile((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
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
        SocialProfile socialProfile = (SocialProfile) obj;
        reverseProtoWriter.getClass();
        socialProfile.getClass();
        reverseProtoWriter.writeBytes(socialProfile.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, socialProfile.label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, socialProfile.user_identifier);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, socialProfile.username);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, socialProfile.url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, socialProfile.service);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SocialProfile socialProfile = (SocialProfile) obj;
        socialProfile.getClass();
        int size$okio = socialProfile.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, socialProfile.label) + protoAdapter.encodedSizeWithTag(4, socialProfile.user_identifier) + protoAdapter.encodedSizeWithTag(3, socialProfile.username) + protoAdapter.encodedSizeWithTag(2, socialProfile.url) + protoAdapter.encodedSizeWithTag(1, socialProfile.service) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SocialProfile socialProfile = (SocialProfile) obj;
        socialProfile.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = socialProfile.service;
        String str2 = socialProfile.url;
        String str3 = socialProfile.username;
        String str4 = socialProfile.user_identifier;
        String str5 = socialProfile.label;
        byteString.getClass();
        return new SocialProfile(str, str2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SocialProfile socialProfile = (SocialProfile) obj;
        socialProfile.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, socialProfile.service);
        protoAdapter.encodeWithTag(protoWriter, 2, socialProfile.url);
        protoAdapter.encodeWithTag(protoWriter, 3, socialProfile.username);
        protoAdapter.encodeWithTag(protoWriter, 4, socialProfile.user_identifier);
        protoAdapter.encodeWithTag(protoWriter, 5, socialProfile.label);
        protoWriter.writeBytes(socialProfile.unknownFields());
    }
}
