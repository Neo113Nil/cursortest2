package com.squareup.protos.multipass.service;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiPublicProfile;
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
import net.idrnd.face.iad.capture.Plane;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DeviceDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DeviceDetails> CREATOR;
    public final String device_id;
    public final String ip_address;
    public final Boolean is_squid;
    public final String secondary_device_id;
    public final String serial;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1403type;

    /* loaded from: classes9.dex */
    public enum Type implements WireEnum {
        WEB(0),
        API(1),
        OAUTH(2),
        OAUTH_PERM(3),
        RESTRICTED(4),
        OAUTH_SHORT(5),
        WEB_BUYER(6),
        OAUTH_PERSON(7),
        OAUTH_DELEGATED(8);

        public static final DeviceDetails$Type$Companion$ADAPTER$1 ADAPTER;
        public static final Plane Companion;
        public final int value;

        static {
            Type type2 = WEB;
            Companion = new Plane(1);
            ADAPTER = new DeviceDetails$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, type2);
        }

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            return Plane.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        DeviceDetails$Companion$ADAPTER$1 deviceDetails$Companion$ADAPTER$1 = new DeviceDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DeviceDetails.class), "type.googleapis.com/squareup.multipass.service.DeviceDetails", Syntax.PROTO_2, null, "squareup/multipass/service/common.proto");
        ADAPTER = deviceDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(deviceDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceDetails(Type type2, String str, String str2, String str3, String str4, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1403type = type2;
        this.device_id = str;
        this.ip_address = str2;
        this.secondary_device_id = str3;
        this.serial = str4;
        this.is_squid = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceDetails)) {
            return false;
        }
        DeviceDetails deviceDetails = (DeviceDetails) obj;
        return Intrinsics.areEqual(unknownFields(), deviceDetails.unknownFields()) && this.f1403type == deviceDetails.f1403type && Intrinsics.areEqual(this.device_id, deviceDetails.device_id) && Intrinsics.areEqual(this.ip_address, deviceDetails.ip_address) && Intrinsics.areEqual(this.secondary_device_id, deviceDetails.secondary_device_id) && Intrinsics.areEqual(this.serial, deviceDetails.serial) && Intrinsics.areEqual(this.is_squid, deviceDetails.is_squid);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Type type2 = this.f1403type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
        String str = this.device_id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.ip_address;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.secondary_device_id;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.serial;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool = this.is_squid;
        int hashCode7 = hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiPublicProfile.Builder builder = new UiPublicProfile.Builder(24, false);
        builder.full_cashtag = this.f1403type;
        builder.full_name = this.device_id;
        builder.photo_url = this.ip_address;
        builder.synopsis = this.secondary_device_id;
        builder.is_verified_account = this.serial;
        builder.cashtag_url_enabled = this.is_squid;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Type type2 = this.f1403type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        if (this.device_id != null) {
            arrayList.add("device_id=██");
        }
        if (this.ip_address != null) {
            arrayList.add("ip_address=██");
        }
        if (this.secondary_device_id != null) {
            arrayList.add("secondary_device_id=██");
        }
        if (this.serial != null) {
            arrayList.add("serial=██");
        }
        Boolean bool = this.is_squid;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_squid=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DeviceDetails{", "}", 0, null, null, 56);
    }
}
