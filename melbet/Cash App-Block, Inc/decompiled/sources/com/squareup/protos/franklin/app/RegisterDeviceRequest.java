package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.clients.OSLevelPushSettingState;
import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.protos.franklin.common.AppVersion;
import com.squareup.protos.franklin.common.BuildType;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class RegisterDeviceRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RegisterDeviceRequest> CREATOR;
    public final AppVersion app_version;
    public final BuildType build_type;
    public final Boolean can_receive_user_visible_notifications;
    public final String device_token;
    public final OSLevelPushSettingState os_push_setting_state;

    static {
        Channel.Companion companion = OSLevelPushSettingState.Companion;
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RegisterDeviceRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.RegisterDeviceRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

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
                        return new RegisterDeviceRequest((String) obj, (BuildType) obj2, (Boolean) obj3, (OSLevelPushSettingState) obj4, (AppVersion) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 3) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        try {
                            obj2 = BuildType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 5) {
                        obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 6) {
                        try {
                            obj4 = OSLevelPushSettingState.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (nextTag != 8) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj5 = TransactorKt.decodeMessageOrMerge(AppVersion.ADAPTER, protoReader, obj5);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                RegisterDeviceRequest registerDeviceRequest = (RegisterDeviceRequest) obj;
                reverseProtoWriter.getClass();
                registerDeviceRequest.getClass();
                reverseProtoWriter.writeBytes(registerDeviceRequest.unknownFields());
                AppVersion.ADAPTER.encodeWithTag(reverseProtoWriter, 8, registerDeviceRequest.app_version);
                OSLevelPushSettingState.ADAPTER.encodeWithTag(reverseProtoWriter, 6, registerDeviceRequest.os_push_setting_state);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, registerDeviceRequest.can_receive_user_visible_notifications);
                BuildType.ADAPTER.encodeWithTag(reverseProtoWriter, 4, registerDeviceRequest.build_type);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, registerDeviceRequest.device_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                RegisterDeviceRequest registerDeviceRequest = (RegisterDeviceRequest) obj;
                registerDeviceRequest.getClass();
                return AppVersion.ADAPTER.encodedSizeWithTag(8, registerDeviceRequest.app_version) + OSLevelPushSettingState.ADAPTER.encodedSizeWithTag(6, registerDeviceRequest.os_push_setting_state) + ProtoAdapter.BOOL.encodedSizeWithTag(5, registerDeviceRequest.can_receive_user_visible_notifications) + BuildType.ADAPTER.encodedSizeWithTag(4, registerDeviceRequest.build_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, registerDeviceRequest.device_token) + registerDeviceRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                RegisterDeviceRequest registerDeviceRequest = (RegisterDeviceRequest) obj;
                registerDeviceRequest.getClass();
                AppVersion appVersion = registerDeviceRequest.app_version;
                AppVersion appVersion2 = appVersion != null ? (AppVersion) AppVersion.ADAPTER.redact(appVersion) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = registerDeviceRequest.device_token;
                BuildType buildType = registerDeviceRequest.build_type;
                Boolean bool = registerDeviceRequest.can_receive_user_visible_notifications;
                OSLevelPushSettingState oSLevelPushSettingState = registerDeviceRequest.os_push_setting_state;
                byteString.getClass();
                return new RegisterDeviceRequest(str, buildType, bool, oSLevelPushSettingState, appVersion2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                RegisterDeviceRequest registerDeviceRequest = (RegisterDeviceRequest) obj;
                registerDeviceRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, registerDeviceRequest.device_token);
                BuildType.ADAPTER.encodeWithTag(protoWriter, 4, registerDeviceRequest.build_type);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, registerDeviceRequest.can_receive_user_visible_notifications);
                OSLevelPushSettingState.ADAPTER.encodeWithTag(protoWriter, 6, registerDeviceRequest.os_push_setting_state);
                AppVersion.ADAPTER.encodeWithTag(protoWriter, 8, registerDeviceRequest.app_version);
                protoWriter.writeBytes(registerDeviceRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterDeviceRequest(String str, BuildType buildType, Boolean bool, OSLevelPushSettingState oSLevelPushSettingState, AppVersion appVersion, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.device_token = str;
        this.build_type = buildType;
        this.can_receive_user_visible_notifications = bool;
        this.os_push_setting_state = oSLevelPushSettingState;
        this.app_version = appVersion;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegisterDeviceRequest)) {
            return false;
        }
        RegisterDeviceRequest registerDeviceRequest = (RegisterDeviceRequest) obj;
        return Intrinsics.areEqual(unknownFields(), registerDeviceRequest.unknownFields()) && Intrinsics.areEqual(this.device_token, registerDeviceRequest.device_token) && this.build_type == registerDeviceRequest.build_type && Intrinsics.areEqual(this.can_receive_user_visible_notifications, registerDeviceRequest.can_receive_user_visible_notifications) && this.os_push_setting_state == registerDeviceRequest.os_push_setting_state && Intrinsics.areEqual(this.app_version, registerDeviceRequest.app_version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.device_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        BuildType buildType = this.build_type;
        int hashCode3 = (hashCode2 + (buildType != null ? buildType.hashCode() : 0)) * 37;
        Boolean bool = this.can_receive_user_visible_notifications;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        OSLevelPushSettingState oSLevelPushSettingState = this.os_push_setting_state;
        int hashCode5 = (hashCode4 + (oSLevelPushSettingState != null ? oSLevelPushSettingState.hashCode() : 0)) * 37;
        AppVersion appVersion = this.app_version;
        int hashCode6 = hashCode5 + (appVersion != null ? appVersion.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileAlias.Builder builder = new ProfileAlias.Builder(2, false);
        builder.alias = this.device_token;
        builder.expires_at = this.build_type;
        builder.verified = this.can_receive_user_visible_notifications;
        builder.version = this.os_push_setting_state;
        builder.display_date = this.app_version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.device_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "device_token=", arrayList);
        }
        BuildType buildType = this.build_type;
        if (buildType != null) {
            arrayList.add("build_type=" + buildType);
        }
        Boolean bool = this.can_receive_user_visible_notifications;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("can_receive_user_visible_notifications=", bool, arrayList);
        }
        OSLevelPushSettingState oSLevelPushSettingState = this.os_push_setting_state;
        if (oSLevelPushSettingState != null) {
            arrayList.add("os_push_setting_state=" + oSLevelPushSettingState);
        }
        AppVersion appVersion = this.app_version;
        if (appVersion != null) {
            arrayList.add("app_version=" + appVersion);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RegisterDeviceRequest{", "}", 0, null, null, 56);
    }
}
