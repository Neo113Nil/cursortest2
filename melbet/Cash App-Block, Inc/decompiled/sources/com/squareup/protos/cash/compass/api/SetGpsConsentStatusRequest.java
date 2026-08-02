package com.squareup.protos.cash.compass.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.janus.api.ContactAlias;
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
public final class SetGpsConsentStatusRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetGpsConsentStatusRequest> CREATOR;
    public final String app_token;
    public final GpsConsentStatus consent_status;
    public final String device_id;
    public final Long occurred_at;
    public final Platform platform;
    public final Boolean precise_enabled;
    public final String trigger;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetGpsConsentStatusRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.compass.api.SetGpsConsentStatusRequest$Companion$ADAPTER$1
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
                Object obj6 = null;
                Object obj7 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SetGpsConsentStatusRequest((String) obj, (String) obj2, (GpsConsentStatus) obj3, (Platform) obj4, (Long) obj5, (Boolean) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 3:
                            obj = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                obj3 = GpsConsentStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 6:
                            try {
                                obj4 = Platform.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 7:
                            obj5 = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                        case 9:
                            obj6 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            obj7 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetGpsConsentStatusRequest setGpsConsentStatusRequest = (SetGpsConsentStatusRequest) obj;
                reverseProtoWriter.getClass();
                setGpsConsentStatusRequest.getClass();
                reverseProtoWriter.writeBytes(setGpsConsentStatusRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 10, setGpsConsentStatusRequest.trigger);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 9, setGpsConsentStatusRequest.precise_enabled);
                ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 7, setGpsConsentStatusRequest.occurred_at);
                Platform.ADAPTER.encodeWithTag(reverseProtoWriter, 6, setGpsConsentStatusRequest.platform);
                GpsConsentStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 5, setGpsConsentStatusRequest.consent_status);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, setGpsConsentStatusRequest.app_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, setGpsConsentStatusRequest.device_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetGpsConsentStatusRequest setGpsConsentStatusRequest = (SetGpsConsentStatusRequest) obj;
                setGpsConsentStatusRequest.getClass();
                int size$okio = setGpsConsentStatusRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(10, setGpsConsentStatusRequest.trigger) + ProtoAdapter.BOOL.encodedSizeWithTag(9, setGpsConsentStatusRequest.precise_enabled) + ProtoAdapter.INT64.encodedSizeWithTag(7, setGpsConsentStatusRequest.occurred_at) + Platform.ADAPTER.encodedSizeWithTag(6, setGpsConsentStatusRequest.platform) + GpsConsentStatus.ADAPTER.encodedSizeWithTag(5, setGpsConsentStatusRequest.consent_status) + protoAdapter2.encodedSizeWithTag(4, setGpsConsentStatusRequest.app_token) + protoAdapter2.encodedSizeWithTag(3, setGpsConsentStatusRequest.device_id) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetGpsConsentStatusRequest setGpsConsentStatusRequest = (SetGpsConsentStatusRequest) obj;
                setGpsConsentStatusRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = setGpsConsentStatusRequest.device_id;
                String str2 = setGpsConsentStatusRequest.app_token;
                GpsConsentStatus gpsConsentStatus = setGpsConsentStatusRequest.consent_status;
                Platform platform = setGpsConsentStatusRequest.platform;
                Long l = setGpsConsentStatusRequest.occurred_at;
                Boolean bool = setGpsConsentStatusRequest.precise_enabled;
                String str3 = setGpsConsentStatusRequest.trigger;
                byteString.getClass();
                return new SetGpsConsentStatusRequest(str, str2, gpsConsentStatus, platform, l, bool, str3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetGpsConsentStatusRequest setGpsConsentStatusRequest = (SetGpsConsentStatusRequest) obj;
                setGpsConsentStatusRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 3, setGpsConsentStatusRequest.device_id);
                protoAdapter2.encodeWithTag(protoWriter, 4, setGpsConsentStatusRequest.app_token);
                GpsConsentStatus.ADAPTER.encodeWithTag(protoWriter, 5, setGpsConsentStatusRequest.consent_status);
                Platform.ADAPTER.encodeWithTag(protoWriter, 6, setGpsConsentStatusRequest.platform);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, setGpsConsentStatusRequest.occurred_at);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, setGpsConsentStatusRequest.precise_enabled);
                protoAdapter2.encodeWithTag(protoWriter, 10, setGpsConsentStatusRequest.trigger);
                protoWriter.writeBytes(setGpsConsentStatusRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetGpsConsentStatusRequest(String str, String str2, GpsConsentStatus gpsConsentStatus, Platform platform, Long l, Boolean bool, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.device_id = str;
        this.app_token = str2;
        this.consent_status = gpsConsentStatus;
        this.platform = platform;
        this.occurred_at = l;
        this.precise_enabled = bool;
        this.trigger = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetGpsConsentStatusRequest)) {
            return false;
        }
        SetGpsConsentStatusRequest setGpsConsentStatusRequest = (SetGpsConsentStatusRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setGpsConsentStatusRequest.unknownFields()) && Intrinsics.areEqual(this.device_id, setGpsConsentStatusRequest.device_id) && Intrinsics.areEqual(this.app_token, setGpsConsentStatusRequest.app_token) && this.consent_status == setGpsConsentStatusRequest.consent_status && this.platform == setGpsConsentStatusRequest.platform && Intrinsics.areEqual(this.occurred_at, setGpsConsentStatusRequest.occurred_at) && Intrinsics.areEqual(this.precise_enabled, setGpsConsentStatusRequest.precise_enabled) && Intrinsics.areEqual(this.trigger, setGpsConsentStatusRequest.trigger);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.device_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.app_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        GpsConsentStatus gpsConsentStatus = this.consent_status;
        int hashCode4 = (hashCode3 + (gpsConsentStatus != null ? gpsConsentStatus.hashCode() : 0)) * 37;
        Platform platform = this.platform;
        int hashCode5 = (hashCode4 + (platform != null ? platform.hashCode() : 0)) * 37;
        Long l = this.occurred_at;
        int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Boolean bool = this.precise_enabled;
        int hashCode7 = (hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str3 = this.trigger;
        int hashCode8 = hashCode7 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ContactAlias.Builder builder = new ContactAlias.Builder(14, false);
        builder.customer_token = this.device_id;
        builder.alias_value = this.app_token;
        builder.alias_type = this.consent_status;
        builder.linked_at = this.platform;
        builder.updated_at = this.occurred_at;
        builder.version = this.precise_enabled;
        builder.hashed_alias_token = this.trigger;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.device_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "device_id=", arrayList);
        }
        String str2 = this.app_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "app_token=", arrayList);
        }
        GpsConsentStatus gpsConsentStatus = this.consent_status;
        if (gpsConsentStatus != null) {
            arrayList.add("consent_status=" + gpsConsentStatus);
        }
        Platform platform = this.platform;
        if (platform != null) {
            arrayList.add("platform=" + platform);
        }
        Long l = this.occurred_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("occurred_at=", l, arrayList);
        }
        Boolean bool = this.precise_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("precise_enabled=", bool, arrayList);
        }
        String str3 = this.trigger;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "trigger=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetGpsConsentStatusRequest{", "}", 0, null, null, 56);
    }
}
