package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.SandboxMetadata;
import com.squareup.protos.cash.janus.api.ContactAlias;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/janus/api/GetWebAuthnCredentialsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/SandboxMetadata$Builder;", "Builder", "Credential", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetWebAuthnCredentialsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetWebAuthnCredentialsResponse> CREATOR;
    public final List credentials;

    public final class Credential extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Credential> CREATOR;
        public final String credential_id;
        public final String description;
        public final DeviceType device_type;
        public final Long last_used_at_millis;
        public final String localized_creation_device_string;
        public final String localized_creation_string;
        public final Long registered_at_millis;

        public enum DeviceType implements WireEnum {
            BROWSER(1),
            IPHONE(2),
            IPAD(3),
            ANDROID(4),
            OTHER(5);

            public final int value;
            public static final FeeType.Companion Companion = new FeeType.Companion();
            public static final GetWebAuthnCredentialsResponse$Credential$DeviceType$Companion$ADAPTER$1 ADAPTER = new GetWebAuthnCredentialsResponse$Credential$DeviceType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DeviceType.class), Syntax.PROTO_2, null);

            DeviceType(int i) {
                this.value = i;
            }

            public static final DeviceType fromValue(int i) {
                Companion.getClass();
                return FeeType.Companion.m3909fromValue(i);
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            GetWebAuthnCredentialsResponse$Credential$Companion$ADAPTER$1 getWebAuthnCredentialsResponse$Credential$Companion$ADAPTER$1 = new GetWebAuthnCredentialsResponse$Credential$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Credential.class), "type.googleapis.com/squareup.cash.janus.api.GetWebAuthnCredentialsResponse.Credential", Syntax.PROTO_2, null, "squareup/cash/janus/api/WebAuthn.proto");
            ADAPTER = getWebAuthnCredentialsResponse$Credential$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getWebAuthnCredentialsResponse$Credential$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Credential(String str, String str2, Long l, Long l2, String str3, String str4, DeviceType deviceType, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.credential_id = str;
            this.description = str2;
            this.registered_at_millis = l;
            this.last_used_at_millis = l2;
            this.localized_creation_string = str3;
            this.localized_creation_device_string = str4;
            this.device_type = deviceType;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Credential)) {
                return false;
            }
            Credential credential = (Credential) obj;
            return Intrinsics.areEqual(unknownFields(), credential.unknownFields()) && Intrinsics.areEqual(this.credential_id, credential.credential_id) && Intrinsics.areEqual(this.description, credential.description) && Intrinsics.areEqual(this.registered_at_millis, credential.registered_at_millis) && Intrinsics.areEqual(this.last_used_at_millis, credential.last_used_at_millis) && Intrinsics.areEqual(this.localized_creation_string, credential.localized_creation_string) && Intrinsics.areEqual(this.localized_creation_device_string, credential.localized_creation_device_string) && this.device_type == credential.device_type;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.credential_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.description;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Long l = this.registered_at_millis;
            int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Long l2 = this.last_used_at_millis;
            int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
            String str3 = this.localized_creation_string;
            int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.localized_creation_device_string;
            int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
            DeviceType deviceType = this.device_type;
            int hashCode8 = hashCode7 + (deviceType != null ? deviceType.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ContactAlias.Builder builder = new ContactAlias.Builder(28, false);
            builder.customer_token = this.credential_id;
            builder.alias_value = this.description;
            builder.updated_at = this.registered_at_millis;
            builder.linked_at = this.last_used_at_millis;
            builder.hashed_alias_token = this.localized_creation_string;
            builder.alias_type = this.localized_creation_device_string;
            builder.version = this.device_type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.credential_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "credential_id=", arrayList);
            }
            String str2 = this.description;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
            }
            Long l = this.registered_at_millis;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("registered_at_millis=", l, arrayList);
            }
            Long l2 = this.last_used_at_millis;
            if (l2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("last_used_at_millis=", l2, arrayList);
            }
            String str3 = this.localized_creation_string;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "localized_creation_string=", arrayList);
            }
            String str4 = this.localized_creation_device_string;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "localized_creation_device_string=", arrayList);
            }
            DeviceType deviceType = this.device_type;
            if (deviceType != null) {
                arrayList.add("device_type=" + deviceType);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Credential{", "}", 0, null, null, 56);
        }
    }

    static {
        GetWebAuthnCredentialsResponse$Companion$ADAPTER$1 getWebAuthnCredentialsResponse$Companion$ADAPTER$1 = new GetWebAuthnCredentialsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetWebAuthnCredentialsResponse.class), "type.googleapis.com/squareup.cash.janus.api.GetWebAuthnCredentialsResponse", Syntax.PROTO_2, null, "squareup/cash/janus/api/WebAuthn.proto");
        ADAPTER = getWebAuthnCredentialsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getWebAuthnCredentialsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetWebAuthnCredentialsResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.credentials = TransactorKt.immutableCopyOf("credentials", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetWebAuthnCredentialsResponse)) {
            return false;
        }
        GetWebAuthnCredentialsResponse getWebAuthnCredentialsResponse = (GetWebAuthnCredentialsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getWebAuthnCredentialsResponse.unknownFields()) && Intrinsics.areEqual(this.credentials, getWebAuthnCredentialsResponse.credentials);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.credentials.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SandboxMetadata.Builder builder = new SandboxMetadata.Builder(24, false);
        builder.scenarios = this.credentials;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.credentials;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("credentials=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetWebAuthnCredentialsResponse{", "}", 0, null, null, 56);
    }
}
