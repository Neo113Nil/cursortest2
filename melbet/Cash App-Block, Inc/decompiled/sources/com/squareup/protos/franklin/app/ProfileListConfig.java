package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AccountListConfig;
import com.squareup.protos.franklin.app.ProfileListConfig;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ProfileListConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProfileListConfig> CREATOR;
    public final ClientScenario client_scenario;
    public final List profiles;

    /* loaded from: classes8.dex */
    public final class Profile extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Profile> CREATOR;
        public final List aliases;
        public final Avatar avatar;
        public final String cash_tag;
        public final Boolean is_business;
        public final Boolean is_passkey_registered;
        public final UiAlias preferred_alias;
        public final String profile_id;
        public final Region region;
        public final String subtitle;
        public final String title;

        static {
            ProfileListConfig$Profile$Companion$ADAPTER$1 profileListConfig$Profile$Companion$ADAPTER$1 = new ProfileListConfig$Profile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Profile.class), "type.googleapis.com/squareup.franklin.app.ProfileListConfig.Profile", Syntax.PROTO_2, null, "squareup/franklin/app/initiateSession.proto");
            ADAPTER = profileListConfig$Profile$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(profileListConfig$Profile$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Profile(String str, String str2, Avatar avatar, List list, UiAlias uiAlias, String str3, String str4, Region region, Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = str;
            this.subtitle = str2;
            this.avatar = avatar;
            this.preferred_alias = uiAlias;
            this.profile_id = str3;
            this.cash_tag = str4;
            this.region = region;
            this.is_passkey_registered = bool;
            this.is_business = bool2;
            this.aliases = TransactorKt.immutableCopyOf("aliases", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Profile)) {
                return false;
            }
            Profile profile = (Profile) obj;
            return Intrinsics.areEqual(unknownFields(), profile.unknownFields()) && Intrinsics.areEqual(this.title, profile.title) && Intrinsics.areEqual(this.subtitle, profile.subtitle) && Intrinsics.areEqual(this.avatar, profile.avatar) && Intrinsics.areEqual(this.aliases, profile.aliases) && Intrinsics.areEqual(this.preferred_alias, profile.preferred_alias) && Intrinsics.areEqual(this.profile_id, profile.profile_id) && Intrinsics.areEqual(this.cash_tag, profile.cash_tag) && this.region == profile.region && Intrinsics.areEqual(this.is_passkey_registered, profile.is_passkey_registered) && Intrinsics.areEqual(this.is_business, profile.is_business);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.subtitle;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Avatar avatar = this.avatar;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (avatar != null ? avatar.hashCode() : 0)) * 37, 37, this.aliases);
            UiAlias uiAlias = this.preferred_alias;
            int hashCode4 = (m + (uiAlias != null ? uiAlias.hashCode() : 0)) * 37;
            String str3 = this.profile_id;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.cash_tag;
            int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
            Region region = this.region;
            int hashCode7 = (hashCode6 + (region != null ? region.hashCode() : 0)) * 37;
            Boolean bool = this.is_passkey_registered;
            int hashCode8 = (hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.is_business;
            int hashCode9 = hashCode8 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            AccountListConfig.Account.Builder builder = new AccountListConfig.Account.Builder(1);
            builder.title = this.title;
            builder.subtitle = this.subtitle;
            builder.avatar = this.avatar;
            builder.aliases = this.aliases;
            builder.preferred_alias = this.preferred_alias;
            builder.account_id = this.profile_id;
            builder.cash_tag = this.cash_tag;
            builder.region = this.region;
            builder.is_passkey_registered = this.is_passkey_registered;
            builder.is_business = this.is_business;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.title != null) {
                arrayList.add("title=██");
            }
            if (this.subtitle != null) {
                arrayList.add("subtitle=██");
            }
            Avatar avatar = this.avatar;
            if (avatar != null) {
                arrayList.add("avatar=" + avatar);
            }
            List list = this.aliases;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("aliases=", arrayList, list);
            }
            UiAlias uiAlias = this.preferred_alias;
            if (uiAlias != null) {
                arrayList.add("preferred_alias=" + uiAlias);
            }
            if (this.profile_id != null) {
                arrayList.add("profile_id=██");
            }
            if (this.cash_tag != null) {
                arrayList.add("cash_tag=██");
            }
            Region region = this.region;
            if (region != null) {
                arrayList.add("region=" + region);
            }
            Boolean bool = this.is_passkey_registered;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_passkey_registered=", bool, arrayList);
            }
            Boolean bool2 = this.is_business;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_business=", bool2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Profile{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ProfileListConfig.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.ProfileListConfig$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ProfileListConfig(m, (ClientScenario) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(ProfileListConfig.Profile.ADAPTER.decode(protoReader));
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj = ClientScenario.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ProfileListConfig profileListConfig = (ProfileListConfig) obj;
                reverseProtoWriter.getClass();
                profileListConfig.getClass();
                reverseProtoWriter.writeBytes(profileListConfig.unknownFields());
                ClientScenario.ADAPTER.encodeWithTag(reverseProtoWriter, 2, profileListConfig.client_scenario);
                ProfileListConfig.Profile.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, profileListConfig.profiles);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ProfileListConfig profileListConfig = (ProfileListConfig) obj;
                profileListConfig.getClass();
                return ClientScenario.ADAPTER.encodedSizeWithTag(2, profileListConfig.client_scenario) + ProfileListConfig.Profile.ADAPTER.asRepeated().encodedSizeWithTag(1, profileListConfig.profiles) + profileListConfig.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ProfileListConfig profileListConfig = (ProfileListConfig) obj;
                profileListConfig.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(profileListConfig.profiles, ProfileListConfig.Profile.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                ClientScenario clientScenario = profileListConfig.client_scenario;
                byteString.getClass();
                return new ProfileListConfig(m1169redactElements, clientScenario, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ProfileListConfig profileListConfig = (ProfileListConfig) obj;
                profileListConfig.getClass();
                ProfileListConfig.Profile.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, profileListConfig.profiles);
                ClientScenario.ADAPTER.encodeWithTag(protoWriter, 2, profileListConfig.client_scenario);
                protoWriter.writeBytes(profileListConfig.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileListConfig(List list, ClientScenario clientScenario, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.client_scenario = clientScenario;
        this.profiles = TransactorKt.immutableCopyOf("profiles", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileListConfig)) {
            return false;
        }
        ProfileListConfig profileListConfig = (ProfileListConfig) obj;
        return Intrinsics.areEqual(unknownFields(), profileListConfig.unknownFields()) && Intrinsics.areEqual(this.profiles, profileListConfig.profiles) && this.client_scenario == profileListConfig.client_scenario;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.profiles);
        ClientScenario clientScenario = this.client_scenario;
        int hashCode = m + (clientScenario != null ? clientScenario.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AccountListConfig.Builder builder = new AccountListConfig.Builder(1);
        builder.accounts = this.profiles;
        builder.client_scenario = this.client_scenario;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.profiles;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("profiles=", arrayList, list);
        }
        ClientScenario clientScenario = this.client_scenario;
        if (clientScenario != null) {
            Matcher$$ExternalSyntheticOutline0.m("client_scenario=", clientScenario, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProfileListConfig{", "}", 0, null, null, 56);
    }
}
