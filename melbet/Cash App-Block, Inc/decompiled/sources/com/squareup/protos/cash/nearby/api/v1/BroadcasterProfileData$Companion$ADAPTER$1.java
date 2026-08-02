package com.squareup.protos.cash.nearby.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BroadcasterProfileData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BroadcasterProfileData((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BroadcasterProfileData broadcasterProfileData = (BroadcasterProfileData) obj;
        reverseProtoWriter.getClass();
        broadcasterProfileData.getClass();
        reverseProtoWriter.writeBytes(broadcasterProfileData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, broadcasterProfileData.profile_photo_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, broadcasterProfileData.cashtag);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, broadcasterProfileData.display_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, broadcasterProfileData.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BroadcasterProfileData broadcasterProfileData = (BroadcasterProfileData) obj;
        broadcasterProfileData.getClass();
        int size$okio = broadcasterProfileData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, broadcasterProfileData.profile_photo_url) + protoAdapter.encodedSizeWithTag(3, broadcasterProfileData.cashtag) + protoAdapter.encodedSizeWithTag(2, broadcasterProfileData.display_name) + protoAdapter.encodedSizeWithTag(1, broadcasterProfileData.customer_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BroadcasterProfileData broadcasterProfileData = (BroadcasterProfileData) obj;
        broadcasterProfileData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = broadcasterProfileData.customer_token;
        byteString.getClass();
        return new BroadcasterProfileData(str, null, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BroadcasterProfileData broadcasterProfileData = (BroadcasterProfileData) obj;
        broadcasterProfileData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, broadcasterProfileData.customer_token);
        protoAdapter.encodeWithTag(protoWriter, 2, broadcasterProfileData.display_name);
        protoAdapter.encodeWithTag(protoWriter, 3, broadcasterProfileData.cashtag);
        protoAdapter.encodeWithTag(protoWriter, 4, broadcasterProfileData.profile_photo_url);
        protoWriter.writeBytes(broadcasterProfileData.unknownFields());
    }
}
