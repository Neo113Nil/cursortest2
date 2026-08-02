package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\b\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ProfileConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProfileConfig$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProfileConfig$ProfileConfig;", "profile_config", "Lcom/squareup/protos/cash/kgoose/api/v3/ProfileConfig$ProfileConfig;", "Companion", "Builder", "ProfileConfig", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfileConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProfileConfig> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final AbstractC0071ProfileConfig profile_config;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ProfileConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProfileConfig;", "<init>", "()V", "profile_config", "Lcom/squareup/protos/cash/kgoose/api/v3/ProfileConfig$ProfileConfig;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public AbstractC0071ProfileConfig profile_config;

        @Override // com.squareup.wire.Message.Builder
        public ProfileConfig build() {
            return new ProfileConfig(this.profile_config, buildUnknownFields());
        }

        public final Builder profile_config(AbstractC0071ProfileConfig profile_config) {
            this.profile_config = profile_config;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ProfileConfig$ProfileConfig;", "", "ServiceProfile", "UserProfile", "Lcom/squareup/protos/cash/kgoose/api/v3/ProfileConfig$ProfileConfig$ServiceProfile;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProfileConfig$ProfileConfig$UserProfile;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.squareup.protos.cash.kgoose.api.v3.ProfileConfig$ProfileConfig, reason: collision with other inner class name */
    public static abstract class AbstractC0071ProfileConfig {

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ServiceProfileConfig#ADAPTER", declaredName = "service_profile", redacted = true, tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ProfileConfig$ProfileConfig$ServiceProfile;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProfileConfig$ProfileConfig;", "Lcom/squareup/protos/cash/kgoose/api/v3/ServiceProfileConfig;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ServiceProfileConfig;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ServiceProfileConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.squareup.protos.cash.kgoose.api.v3.ProfileConfig$ProfileConfig$ServiceProfile */
        public static final /* data */ class ServiceProfile extends AbstractC0071ProfileConfig {
            private final ServiceProfileConfig value;

            public ServiceProfile(ServiceProfileConfig serviceProfileConfig) {
                serviceProfileConfig.getClass();
                this.value = serviceProfileConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ServiceProfile) && Intrinsics.areEqual(this.value, ((ServiceProfile) obj).value);
            }

            public final ServiceProfileConfig getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ServiceProfile(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.UserProfileConfig#ADAPTER", declaredName = "user_profile", redacted = true, tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ProfileConfig$ProfileConfig$UserProfile;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProfileConfig$ProfileConfig;", "Lcom/squareup/protos/cash/kgoose/api/v3/UserProfileConfig;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/UserProfileConfig;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/UserProfileConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.squareup.protos.cash.kgoose.api.v3.ProfileConfig$ProfileConfig$UserProfile */
        public static final /* data */ class UserProfile extends AbstractC0071ProfileConfig {
            private final UserProfileConfig value;

            public UserProfile(UserProfileConfig userProfileConfig) {
                userProfileConfig.getClass();
                this.value = userProfileConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserProfile) && Intrinsics.areEqual(this.value, ((UserProfile) obj).value);
            }

            public final UserProfileConfig getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "UserProfile(value=" + this.value + ")";
            }
        }
    }

    static {
        ProfileConfig$Companion$ADAPTER$1 profileConfig$Companion$ADAPTER$1 = new ProfileConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProfileConfig.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ProfileConfig", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/profile_messages.proto");
        ADAPTER = profileConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(profileConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileConfig(AbstractC0071ProfileConfig abstractC0071ProfileConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.profile_config = abstractC0071ProfileConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileConfig)) {
            return false;
        }
        ProfileConfig profileConfig = (ProfileConfig) obj;
        return Intrinsics.areEqual(unknownFields(), profileConfig.unknownFields()) && Intrinsics.areEqual(this.profile_config, profileConfig.profile_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AbstractC0071ProfileConfig abstractC0071ProfileConfig = this.profile_config;
        int hashCode2 = hashCode + (abstractC0071ProfileConfig != null ? abstractC0071ProfileConfig.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.profile_config = this.profile_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.profile_config != null) {
            arrayList.add("profile_config=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProfileConfig{", "}", 0, null, null, 56);
    }
}
