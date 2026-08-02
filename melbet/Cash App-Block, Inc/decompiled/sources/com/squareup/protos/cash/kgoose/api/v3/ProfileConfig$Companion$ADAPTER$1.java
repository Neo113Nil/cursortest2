package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.ProfileConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ProfileConfig$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProfileConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfileConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ProfileConfig.AbstractC0071ProfileConfig abstractC0071ProfileConfig = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProfileConfig(abstractC0071ProfileConfig, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                abstractC0071ProfileConfig = new ProfileConfig.AbstractC0071ProfileConfig.ServiceProfile((ServiceProfileConfig) ServiceProfileConfig.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                abstractC0071ProfileConfig = new ProfileConfig.AbstractC0071ProfileConfig.UserProfile((UserProfileConfig) UserProfileConfig.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProfileConfig profileConfig = (ProfileConfig) obj;
        reverseProtoWriter.getClass();
        profileConfig.getClass();
        reverseProtoWriter.writeBytes(profileConfig.unknownFields());
        ProfileConfig.AbstractC0071ProfileConfig abstractC0071ProfileConfig = profileConfig.profile_config;
        if (abstractC0071ProfileConfig instanceof ProfileConfig.AbstractC0071ProfileConfig.ServiceProfile) {
            ServiceProfileConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ProfileConfig.AbstractC0071ProfileConfig.ServiceProfile) abstractC0071ProfileConfig).getValue());
        } else if (abstractC0071ProfileConfig instanceof ProfileConfig.AbstractC0071ProfileConfig.UserProfile) {
            UserProfileConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ProfileConfig.AbstractC0071ProfileConfig.UserProfile) abstractC0071ProfileConfig).getValue());
        } else {
            if (abstractC0071ProfileConfig == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ProfileConfig profileConfig = (ProfileConfig) obj;
        profileConfig.getClass();
        int size$okio = profileConfig.unknownFields().getSize$okio();
        ProfileConfig.AbstractC0071ProfileConfig abstractC0071ProfileConfig = profileConfig.profile_config;
        if (abstractC0071ProfileConfig instanceof ProfileConfig.AbstractC0071ProfileConfig.ServiceProfile) {
            encodedSizeWithTag = ServiceProfileConfig.ADAPTER.encodedSizeWithTag(1, ((ProfileConfig.AbstractC0071ProfileConfig.ServiceProfile) abstractC0071ProfileConfig).getValue());
        } else {
            if (!(abstractC0071ProfileConfig instanceof ProfileConfig.AbstractC0071ProfileConfig.UserProfile)) {
                if (abstractC0071ProfileConfig == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = UserProfileConfig.ADAPTER.encodedSizeWithTag(2, ((ProfileConfig.AbstractC0071ProfileConfig.UserProfile) abstractC0071ProfileConfig).getValue());
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ProfileConfig) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ProfileConfig(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProfileConfig profileConfig = (ProfileConfig) obj;
        profileConfig.getClass();
        ProfileConfig.AbstractC0071ProfileConfig abstractC0071ProfileConfig = profileConfig.profile_config;
        if (abstractC0071ProfileConfig instanceof ProfileConfig.AbstractC0071ProfileConfig.ServiceProfile) {
            ServiceProfileConfig.ADAPTER.encodeWithTag(protoWriter, 1, ((ProfileConfig.AbstractC0071ProfileConfig.ServiceProfile) abstractC0071ProfileConfig).getValue());
        } else if (abstractC0071ProfileConfig instanceof ProfileConfig.AbstractC0071ProfileConfig.UserProfile) {
            UserProfileConfig.ADAPTER.encodeWithTag(protoWriter, 2, ((ProfileConfig.AbstractC0071ProfileConfig.UserProfile) abstractC0071ProfileConfig).getValue());
        } else if (abstractC0071ProfileConfig != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(profileConfig.unknownFields());
    }
}
