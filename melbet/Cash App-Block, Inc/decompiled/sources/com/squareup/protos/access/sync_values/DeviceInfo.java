package com.squareup.protos.access.sync_values;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DeviceInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DeviceInfo> CREATOR;
    public final String device_name;
    public final DeviceType device_type;
    public final String hashed_app_token;
    public final Long last_login_at;
    public final String last_login_location;
    public final String last_login_location_image_url;
    public final Status status;
    public final Long verified_at;

    public enum DeviceType implements WireEnum {
        MAC(1),
        WINDOWS(2),
        ANDROID(3),
        IPHONE(4),
        IPAD(5),
        IPOD_TOUCH(6),
        OTHER(7),
        WEB(8);

        public final int value;
        public static final WorkCookieJar Companion = new WorkCookieJar(13);
        public static final DeviceInfo$DeviceType$Companion$ADAPTER$1 ADAPTER = new DeviceInfo$DeviceType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DeviceType.class), Syntax.PROTO_2, null);

        DeviceType(int i) {
            this.value = i;
        }

        public static final DeviceType fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 1:
                    return MAC;
                case 2:
                    return WINDOWS;
                case 3:
                    return ANDROID;
                case 4:
                    return IPHONE;
                case 5:
                    return IPAD;
                case 6:
                    return IPOD_TOUCH;
                case 7:
                    return OTHER;
                case 8:
                    return WEB;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum Status implements WireEnum {
        LOGGED_IN(1),
        LOGGED_OUT(2),
        HARD_SIGNED_OUT(3);

        public final int value;
        public static final Edge.Companion Companion = new Edge.Companion(13);
        public static final DeviceInfo$Status$Companion$ADAPTER$1 ADAPTER = new DeviceInfo$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, null);

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return LOGGED_IN;
            }
            if (i == 2) {
                return LOGGED_OUT;
            }
            if (i != 3) {
                return null;
            }
            return HARD_SIGNED_OUT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        DeviceInfo$Companion$ADAPTER$1 deviceInfo$Companion$ADAPTER$1 = new DeviceInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DeviceInfo.class), "type.googleapis.com/squareup.access.sync_values.DeviceInfo", Syntax.PROTO_2, null, "squareup/access/sync_values.proto");
        ADAPTER = deviceInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(deviceInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceInfo(Long l, String str, String str2, String str3, DeviceType deviceType, String str4, Status status, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.last_login_at = l;
        this.last_login_location = str;
        this.device_name = str2;
        this.hashed_app_token = str3;
        this.device_type = deviceType;
        this.last_login_location_image_url = str4;
        this.status = status;
        this.verified_at = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return Intrinsics.areEqual(unknownFields(), deviceInfo.unknownFields()) && Intrinsics.areEqual(this.last_login_at, deviceInfo.last_login_at) && Intrinsics.areEqual(this.last_login_location, deviceInfo.last_login_location) && Intrinsics.areEqual(this.device_name, deviceInfo.device_name) && Intrinsics.areEqual(this.hashed_app_token, deviceInfo.hashed_app_token) && this.device_type == deviceInfo.device_type && Intrinsics.areEqual(this.last_login_location_image_url, deviceInfo.last_login_location_image_url) && this.status == deviceInfo.status && Intrinsics.areEqual(this.verified_at, deviceInfo.verified_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.last_login_at;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str = this.last_login_location;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.device_name;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.hashed_app_token;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        DeviceType deviceType = this.device_type;
        int hashCode6 = (hashCode5 + (deviceType != null ? deviceType.hashCode() : 0)) * 37;
        String str4 = this.last_login_location_image_url;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Status status = this.status;
        int hashCode8 = (hashCode7 + (status != null ? status.hashCode() : 0)) * 37;
        Long l2 = this.verified_at;
        int hashCode9 = hashCode8 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(5, false);
        builder.external_version = this.last_login_at;
        builder.external_token = this.last_login_location;
        builder.customer_token = this.device_name;
        builder.created_at = this.hashed_app_token;
        builder.is_badged = this.device_type;
        builder.item_type = this.last_login_location_image_url;
        builder.count_groups = this.status;
        builder.updated_at = this.verified_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.last_login_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("last_login_at=", l, arrayList);
        }
        String str = this.last_login_location;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "last_login_location=", arrayList);
        }
        if (this.device_name != null) {
            arrayList.add("device_name=██");
        }
        String str2 = this.hashed_app_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "hashed_app_token=", arrayList);
        }
        DeviceType deviceType = this.device_type;
        if (deviceType != null) {
            arrayList.add("device_type=" + deviceType);
        }
        String str3 = this.last_login_location_image_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "last_login_location_image_url=", arrayList);
        }
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        Long l2 = this.verified_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("verified_at=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DeviceInfo{", "}", 0, null, null, 56);
    }
}
