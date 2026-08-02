package com.squareup.protos.cash.fiatly.api.v2;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SenderProfileData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SenderProfileData((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SenderProfileData senderProfileData = (SenderProfileData) obj;
        reverseProtoWriter.getClass();
        senderProfileData.getClass();
        reverseProtoWriter.writeBytes(senderProfileData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, senderProfileData.profile_photo_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, senderProfileData.cashtag);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, senderProfileData.display_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SenderProfileData senderProfileData = (SenderProfileData) obj;
        senderProfileData.getClass();
        int size$okio = senderProfileData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, senderProfileData.profile_photo_url) + protoAdapter.encodedSizeWithTag(2, senderProfileData.cashtag) + protoAdapter.encodedSizeWithTag(1, senderProfileData.display_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SenderProfileData) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SenderProfileData(null, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SenderProfileData senderProfileData = (SenderProfileData) obj;
        senderProfileData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, senderProfileData.display_name);
        protoAdapter.encodeWithTag(protoWriter, 2, senderProfileData.cashtag);
        protoAdapter.encodeWithTag(protoWriter, 3, senderProfileData.profile_photo_url);
        protoWriter.writeBytes(senderProfileData.unknownFields());
    }
}
