package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/Profile$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/Profile;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Profile$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Profile((String) obj, (String) obj2, (Long) obj3, (Long) obj4, (ProfileConfig) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(ProfileConfig.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Profile profile = (Profile) obj;
        reverseProtoWriter.getClass();
        profile.getClass();
        reverseProtoWriter.writeBytes(profile.unknownFields());
        ProfileConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 5, profile.profile_config);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, profile.updated_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, profile.created_at);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, profile.description);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, profile.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Profile profile = (Profile) obj;
        profile.getClass();
        int size$okio = profile.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, profile.description) + protoAdapter.encodedSizeWithTag(1, profile.id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return ProfileConfig.ADAPTER.encodedSizeWithTag(5, profile.profile_config) + protoAdapter2.encodedSizeWithTag(4, profile.updated_at) + protoAdapter2.encodedSizeWithTag(3, profile.created_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Profile profile = (Profile) obj;
        profile.getClass();
        ProfileConfig profileConfig = profile.profile_config;
        ProfileConfig profileConfig2 = profileConfig != null ? (ProfileConfig) ProfileConfig.ADAPTER.redact(profileConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = profile.id;
        String str2 = profile.description;
        Long l = profile.created_at;
        Long l2 = profile.updated_at;
        byteString.getClass();
        return new Profile(str, str2, l, l2, profileConfig2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Profile profile = (Profile) obj;
        profile.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, profile.id);
        protoAdapter.encodeWithTag(protoWriter, 2, profile.description);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 3, profile.created_at);
        protoAdapter2.encodeWithTag(protoWriter, 4, profile.updated_at);
        ProfileConfig.ADAPTER.encodeWithTag(protoWriter, 5, profile.profile_config);
        protoWriter.writeBytes(profile.unknownFields());
    }
}
