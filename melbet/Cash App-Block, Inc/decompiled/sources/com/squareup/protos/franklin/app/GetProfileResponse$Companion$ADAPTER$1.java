package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.GetProfileResponse;
import com.squareup.protos.franklin.common.Profile;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetProfileResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetProfileResponse((GetProfileResponse.Status) obj, (Profile) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = GetProfileResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Profile.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetProfileResponse getProfileResponse = (GetProfileResponse) obj;
        reverseProtoWriter.getClass();
        getProfileResponse.getClass();
        reverseProtoWriter.writeBytes(getProfileResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, getProfileResponse.profile_token);
        Profile.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getProfileResponse.profile);
        GetProfileResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getProfileResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetProfileResponse getProfileResponse = (GetProfileResponse) obj;
        getProfileResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, getProfileResponse.profile_token) + Profile.ADAPTER.encodedSizeWithTag(2, getProfileResponse.profile) + GetProfileResponse.Status.ADAPTER.encodedSizeWithTag(1, getProfileResponse.status) + getProfileResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetProfileResponse getProfileResponse = (GetProfileResponse) obj;
        getProfileResponse.getClass();
        Profile profile = getProfileResponse.profile;
        Profile profile2 = profile != null ? (Profile) Profile.ADAPTER.redact(profile) : null;
        ByteString byteString = ByteString.EMPTY;
        GetProfileResponse.Status status = getProfileResponse.status;
        String str = getProfileResponse.profile_token;
        byteString.getClass();
        return new GetProfileResponse(status, profile2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetProfileResponse getProfileResponse = (GetProfileResponse) obj;
        getProfileResponse.getClass();
        GetProfileResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, getProfileResponse.status);
        Profile.ADAPTER.encodeWithTag(protoWriter, 2, getProfileResponse.profile);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getProfileResponse.profile_token);
        protoWriter.writeBytes(getProfileResponse.unknownFields());
    }
}
