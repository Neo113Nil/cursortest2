package com.squareup.protos.cash.profiles;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ProfileDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProfileDetails((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProfileDetails profileDetails = (ProfileDetails) obj;
        reverseProtoWriter.getClass();
        profileDetails.getClass();
        reverseProtoWriter.writeBytes(profileDetails.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, profileDetails.bio);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProfileDetails profileDetails = (ProfileDetails) obj;
        profileDetails.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, profileDetails.bio) + profileDetails.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ProfileDetails) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ProfileDetails(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProfileDetails profileDetails = (ProfileDetails) obj;
        profileDetails.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, profileDetails.bio);
        protoWriter.writeBytes(profileDetails.unknownFields());
    }
}
