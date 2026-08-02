package com.squareup.protos.cash.cashface.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ProfileElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        String str = (String) obj;
        if (str == null) {
            TransactorKt.missingRequiredFields(obj, "icon_url");
            throw null;
        }
        String str2 = (String) obj2;
        if (str2 != null) {
            return new ProfileElement(str, str2, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj2, "text");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProfileElement profileElement = (ProfileElement) obj;
        reverseProtoWriter.getClass();
        profileElement.getClass();
        reverseProtoWriter.writeBytes(profileElement.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, profileElement.text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, profileElement.icon_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProfileElement profileElement = (ProfileElement) obj;
        profileElement.getClass();
        int size$okio = profileElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, profileElement.text) + protoAdapter.encodedSizeWithTag(1, profileElement.icon_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProfileElement profileElement = (ProfileElement) obj;
        profileElement.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = profileElement.icon_url;
        String str2 = profileElement.text;
        str.getClass();
        str2.getClass();
        byteString.getClass();
        return new ProfileElement(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProfileElement profileElement = (ProfileElement) obj;
        profileElement.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, profileElement.icon_url);
        protoAdapter.encodeWithTag(protoWriter, 2, profileElement.text);
        protoWriter.writeBytes(profileElement.unknownFields());
    }
}
