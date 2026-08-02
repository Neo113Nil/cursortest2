package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.android.volley.toolbox.NetworkUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Grant extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Grant> CREATOR;
    public final Action action;
    public final List app_data;
    public final Channel channel;
    public final String client_id;
    public final Long created_at;
    public final String customer_id;
    public final DecisionMethod decision_method;
    public final Long expires_at;
    public final String id;
    public final String request_id;
    public final Long revoked_at;
    public final RiskSignals risk_signals;
    public final Status status;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1272type;
    public final Long updated_at;

    public final class AppData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AppData> CREATOR;
        public final NetworkUtility app_data;
        public final ByteString serialized_app_data;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1273type;

        public enum Type implements WireEnum {
            MERBRO_PREAUTHORIZATION(1),
            MERBRO_IN_TRANSACTION_TOP_UP(2),
            INTERNALLY_CREATED_ORDER(3),
            SANDBOX_METADATA(4),
            MANAGED_CUSTOMER_REQUEST_FLOW(5),
            DYNAMIC_GRANT_APPROVAL_METADATA(6),
            RISK_METADATA(7),
            OAUTH_APP_DATA(8),
            SECURITY_LOCK_METADATA(9);

            public final int value;
            public static final Alignment.Companion Companion = new Alignment.Companion();
            public static final Grant$AppData$Type$Companion$ADAPTER$1 ADAPTER = new Grant$AppData$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

            Type(int i) {
                this.value = i;
            }

            public static final Type fromValue(int i) {
                Companion.getClass();
                return Alignment.Companion.m3863fromValue(i);
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            Grant$AppData$Companion$ADAPTER$1 grant$AppData$Companion$ADAPTER$1 = new Grant$AppData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppData.class), "type.googleapis.com/squareup.cash.grantly.api.Grant.AppData", Syntax.PROTO_2, null, "squareup/cash/grantly/api/grant.proto");
            ADAPTER = grant$AppData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(grant$AppData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppData(Type type2, NetworkUtility networkUtility, ByteString byteString, ByteString byteString2) {
            super(ADAPTER, byteString2);
            type2.getClass();
            byteString2.getClass();
            this.f1273type = type2;
            this.app_data = networkUtility;
            this.serialized_app_data = byteString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AppData)) {
                return false;
            }
            AppData appData = (AppData) obj;
            return Intrinsics.areEqual(unknownFields(), appData.unknownFields()) && this.f1273type == appData.f1273type && Intrinsics.areEqual(this.app_data, appData.app_data) && Intrinsics.areEqual(this.serialized_app_data, appData.serialized_app_data);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = (this.f1273type.hashCode() + (unknownFields().hashCode() * 37)) * 37;
            NetworkUtility networkUtility = this.app_data;
            int hashCode2 = (hashCode + (networkUtility != null ? networkUtility.hashCode() : 0)) * 37;
            ByteString byteString = this.serialized_app_data;
            int hashCode3 = hashCode2 + (byteString != null ? byteString.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            LoanOption.Builder builder = new LoanOption.Builder(26);
            builder.loan_type = this.f1273type;
            builder.payment_schedule = this.app_data;
            builder.tila_data = this.serialized_app_data;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("type=" + this.f1273type);
            NetworkUtility networkUtility = this.app_data;
            if (networkUtility != null) {
                arrayList.add("app_data=" + networkUtility);
            }
            ByteString byteString = this.serialized_app_data;
            if (byteString != null) {
                Request$Priority$EnumUnboxingLocalUtility.m("serialized_app_data=", byteString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AppData{", "}", 0, null, null, 56);
        }
    }

    public enum Status implements WireEnum {
        ACTIVE(1),
        CONSUMED(2),
        REVOKED(3),
        EXPIRED(4);

        public final int value;
        public static final Channel.Companion Companion = new Channel.Companion();
        public static final Grant$Status$Companion$ADAPTER$1 ADAPTER = new Grant$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, null);

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return ACTIVE;
            }
            if (i == 2) {
                return CONSUMED;
            }
            if (i == 3) {
                return REVOKED;
            }
            if (i != 4) {
                return null;
            }
            return EXPIRED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum Type implements WireEnum {
        ONE_TIME(1),
        EXTENDED(2),
        INTRINSIC(3);

        public final int value;
        public static final RadioType.Companion Companion = new RadioType.Companion();
        public static final Grant$Type$Companion$ADAPTER$1 ADAPTER = new Grant$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return ONE_TIME;
            }
            if (i == 2) {
                return EXTENDED;
            }
            if (i != 3) {
                return null;
            }
            return INTRINSIC;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Grant$Companion$ADAPTER$1 grant$Companion$ADAPTER$1 = new Grant$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Grant.class), "type.googleapis.com/squareup.cash.grantly.api.Grant", Syntax.PROTO_2, null, "squareup/cash/grantly/api/grant.proto");
        ADAPTER = grant$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(grant$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Grant(String str, String str2, String str3, Action action, Status status, Type type2, Long l, Long l2, Long l3, String str4, Channel channel, List list, DecisionMethod decisionMethod, RiskSignals riskSignals, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        channel.getClass();
        list.getClass();
        byteString.getClass();
        this.id = str;
        this.client_id = str2;
        this.customer_id = str3;
        this.action = action;
        this.status = status;
        this.f1272type = type2;
        this.created_at = l;
        this.updated_at = l2;
        this.expires_at = l3;
        this.request_id = str4;
        this.channel = channel;
        this.decision_method = decisionMethod;
        this.risk_signals = riskSignals;
        this.revoked_at = l4;
        this.app_data = TransactorKt.immutableCopyOf("app_data", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Grant)) {
            return false;
        }
        Grant grant = (Grant) obj;
        return Intrinsics.areEqual(unknownFields(), grant.unknownFields()) && Intrinsics.areEqual(this.id, grant.id) && Intrinsics.areEqual(this.client_id, grant.client_id) && Intrinsics.areEqual(this.customer_id, grant.customer_id) && Intrinsics.areEqual(this.action, grant.action) && this.status == grant.status && this.f1272type == grant.f1272type && Intrinsics.areEqual(this.created_at, grant.created_at) && Intrinsics.areEqual(this.updated_at, grant.updated_at) && Intrinsics.areEqual(this.expires_at, grant.expires_at) && Intrinsics.areEqual(this.request_id, grant.request_id) && this.channel == grant.channel && Intrinsics.areEqual(this.app_data, grant.app_data) && this.decision_method == grant.decision_method && Intrinsics.areEqual(this.risk_signals, grant.risk_signals) && Intrinsics.areEqual(this.revoked_at, grant.revoked_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.client_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.customer_id;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode5 = (hashCode4 + (action != null ? action.hashCode() : 0)) * 37;
        Status status = this.status;
        int hashCode6 = (hashCode5 + (status != null ? status.hashCode() : 0)) * 37;
        Type type2 = this.f1272type;
        int hashCode7 = (hashCode6 + (type2 != null ? type2.hashCode() : 0)) * 37;
        Long l = this.created_at;
        int hashCode8 = (hashCode7 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.updated_at;
        int hashCode9 = (hashCode8 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.expires_at;
        int hashCode10 = (hashCode9 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        String str4 = this.request_id;
        int m = Recorder$$ExternalSyntheticOutline2.m((this.channel.hashCode() + ((hashCode10 + (str4 != null ? str4.hashCode() : 0)) * 37)) * 37, 37, this.app_data);
        DecisionMethod decisionMethod = this.decision_method;
        int hashCode11 = (m + (decisionMethod != null ? decisionMethod.hashCode() : 0)) * 37;
        RiskSignals riskSignals = this.risk_signals;
        int hashCode12 = (hashCode11 + (riskSignals != null ? riskSignals.hashCode() : 0)) * 37;
        Long l4 = this.revoked_at;
        int hashCode13 = hashCode12 + (l4 != null ? Long.hashCode(l4.longValue()) : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClientInfo.Builder builder = new ClientInfo.Builder(4);
        builder.user_agent = this.id;
        builder.device_uuid = this.client_id;
        builder.date_format = this.customer_id;
        builder.ip_address = this.action;
        builder.device_name = this.status;
        builder.accept_language = this.f1272type;
        builder.device_installation_id = this.created_at;
        builder.drm_id = this.updated_at;
        builder.device_vendor_id = this.expires_at;
        builder.time_format = this.request_id;
        builder.device_id = this.channel;
        builder.threatmetrix_smart_id = this.app_data;
        builder.timestamp = this.decision_method;
        builder.navigation_paradigm = this.risk_signals;
        builder.client_scenario = this.revoked_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.client_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "client_id=", arrayList);
        }
        String str3 = this.customer_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "customer_id=", arrayList);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        Type type2 = this.f1272type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        Long l2 = this.updated_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at=", l2, arrayList);
        }
        Long l3 = this.expires_at;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at=", l3, arrayList);
        }
        String str4 = this.request_id;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "request_id=", arrayList);
        }
        arrayList.add("channel=" + this.channel);
        List list = this.app_data;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("app_data=", arrayList, list);
        }
        DecisionMethod decisionMethod = this.decision_method;
        if (decisionMethod != null) {
            arrayList.add("decision_method=" + decisionMethod);
        }
        RiskSignals riskSignals = this.risk_signals;
        if (riskSignals != null) {
            arrayList.add("risk_signals=" + riskSignals);
        }
        Long l4 = this.revoked_at;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("revoked_at=", l4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Grant{", "}", 0, null, null, 56);
    }
}
