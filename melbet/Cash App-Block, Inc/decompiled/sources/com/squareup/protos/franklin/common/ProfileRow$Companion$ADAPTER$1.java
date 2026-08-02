package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ProfileRow$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ProfileRow((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 5) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProfileRow profileRow = (ProfileRow) obj;
        reverseProtoWriter.getClass();
        profileRow.getClass();
        reverseProtoWriter.writeBytes(profileRow.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, profileRow.call_to_action);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, profileRow.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, profileRow.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, profileRow.icon_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, profileRow.client_route);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProfileRow profileRow = (ProfileRow) obj;
        profileRow.getClass();
        int size$okio = profileRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, profileRow.call_to_action) + protoAdapter.encodedSizeWithTag(5, profileRow.subtitle) + protoAdapter.encodedSizeWithTag(4, profileRow.title) + protoAdapter.encodedSizeWithTag(3, profileRow.icon_id) + protoAdapter.encodedSizeWithTag(1, profileRow.client_route) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProfileRow profileRow = (ProfileRow) obj;
        profileRow.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = profileRow.client_route;
        String str2 = profileRow.icon_id;
        String str3 = profileRow.title;
        String str4 = profileRow.subtitle;
        String str5 = profileRow.call_to_action;
        byteString.getClass();
        return new ProfileRow(str, str2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProfileRow profileRow = (ProfileRow) obj;
        profileRow.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, profileRow.client_route);
        protoAdapter.encodeWithTag(protoWriter, 3, profileRow.icon_id);
        protoAdapter.encodeWithTag(protoWriter, 4, profileRow.title);
        protoAdapter.encodeWithTag(protoWriter, 5, profileRow.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 6, profileRow.call_to_action);
        protoWriter.writeBytes(profileRow.unknownFields());
    }
}
