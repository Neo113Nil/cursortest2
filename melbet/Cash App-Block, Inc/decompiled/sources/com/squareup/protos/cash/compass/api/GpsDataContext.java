package com.squareup.protos.cash.compass.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.cash.genericelements.ui.Alignment;
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
public final class GpsDataContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GpsDataContext> CREATOR;
    public final String app_token;
    public final String device_id;
    public final Environment env;
    public final String event_token;
    public final String idempotency_key;
    public final Long occurred_at;
    public final String timezone;
    public final String trigger;

    public enum Environment implements WireEnum {
        UNSPECIFIED(0),
        FOREGROUND(1),
        BACKGROUND(2);

        public static final GpsDataContext$Environment$Companion$ADAPTER$1 ADAPTER;
        public static final Alignment.Companion Companion;
        public final int value;

        static {
            Environment environment = UNSPECIFIED;
            Companion = new Alignment.Companion();
            ADAPTER = new GpsDataContext$Environment$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Environment.class), Syntax.PROTO_2, environment);
        }

        Environment(int i) {
            this.value = i;
        }

        public static final Environment fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNSPECIFIED;
            }
            if (i == 1) {
                return FOREGROUND;
            }
            if (i != 2) {
                return null;
            }
            return BACKGROUND;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        GpsDataContext$Companion$ADAPTER$1 gpsDataContext$Companion$ADAPTER$1 = new GpsDataContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GpsDataContext.class), "type.googleapis.com/squareup.cash.compass.api.v1.GpsDataContext", Syntax.PROTO_2, null, "squareup/cash/compass/api/v1/gps_data_context.proto");
        ADAPTER = gpsDataContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(gpsDataContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsDataContext(Long l, String str, String str2, String str3, String str4, String str5, String str6, Environment environment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.occurred_at = l;
        this.idempotency_key = str;
        this.device_id = str2;
        this.app_token = str3;
        this.timezone = str4;
        this.trigger = str5;
        this.event_token = str6;
        this.env = environment;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GpsDataContext)) {
            return false;
        }
        GpsDataContext gpsDataContext = (GpsDataContext) obj;
        return Intrinsics.areEqual(unknownFields(), gpsDataContext.unknownFields()) && Intrinsics.areEqual(this.occurred_at, gpsDataContext.occurred_at) && Intrinsics.areEqual(this.idempotency_key, gpsDataContext.idempotency_key) && Intrinsics.areEqual(this.device_id, gpsDataContext.device_id) && Intrinsics.areEqual(this.app_token, gpsDataContext.app_token) && Intrinsics.areEqual(this.timezone, gpsDataContext.timezone) && Intrinsics.areEqual(this.trigger, gpsDataContext.trigger) && Intrinsics.areEqual(this.event_token, gpsDataContext.event_token) && this.env == gpsDataContext.env;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.occurred_at;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str = this.idempotency_key;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.device_id;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.app_token;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.timezone;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.trigger;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.event_token;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Environment environment = this.env;
        int hashCode9 = hashCode8 + (environment != null ? environment.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(17, false);
        builder.external_version = this.occurred_at;
        builder.external_token = this.idempotency_key;
        builder.customer_token = this.device_id;
        builder.updated_at = this.app_token;
        builder.created_at = this.timezone;
        builder.is_badged = this.trigger;
        builder.item_type = this.event_token;
        builder.count_groups = this.env;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.occurred_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("occurred_at=", l, arrayList);
        }
        String str = this.idempotency_key;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "idempotency_key=", arrayList);
        }
        String str2 = this.device_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "device_id=", arrayList);
        }
        String str3 = this.app_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "app_token=", arrayList);
        }
        String str4 = this.timezone;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "timezone=", arrayList);
        }
        String str5 = this.trigger;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "trigger=", arrayList);
        }
        String str6 = this.event_token;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "event_token=", arrayList);
        }
        Environment environment = this.env;
        if (environment != null) {
            arrayList.add("env=" + environment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GpsDataContext{", "}", 0, null, null, 56);
    }

    public /* synthetic */ GpsDataContext(Long l, String str, String str2, String str3, String str4, String str5, String str6, Environment environment) {
        this(l, str, str2, str3, str4, str5, str6, environment, ByteString.EMPTY);
    }
}
