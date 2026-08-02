package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.document.Document;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes8.dex */
public final class ClientRoutingConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClientRoutingConfig> CREATOR;
    public final List client_routes;
    public final List deep_links;

    /* loaded from: classes.dex */
    public final class ClientRouteRule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ClientRouteRule> CREATOR;
        public final Boolean include_raw_query_params;
        public final Boolean is_supported_on_latest_version;
        public final String path_regex;
        public final List required_parameter_names;
        public final String spec_name;

        static {
            ClientRoutingConfig$ClientRouteRule$Companion$ADAPTER$1 clientRoutingConfig$ClientRouteRule$Companion$ADAPTER$1 = new ClientRoutingConfig$ClientRouteRule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientRouteRule.class), "type.googleapis.com/squareup.franklin.common.ClientRoutingConfig.ClientRouteRule", Syntax.PROTO_2, null, "squareup/franklin/common/client_routing_config.proto");
            ADAPTER = clientRoutingConfig$ClientRouteRule$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(clientRoutingConfig$ClientRouteRule$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientRouteRule(String str, Boolean bool, Boolean bool2, List list, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.path_regex = str;
            this.is_supported_on_latest_version = bool;
            this.include_raw_query_params = bool2;
            this.spec_name = str2;
            this.required_parameter_names = TransactorKt.immutableCopyOf("required_parameter_names", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ClientRouteRule)) {
                return false;
            }
            ClientRouteRule clientRouteRule = (ClientRouteRule) obj;
            return Intrinsics.areEqual(unknownFields(), clientRouteRule.unknownFields()) && Intrinsics.areEqual(this.path_regex, clientRouteRule.path_regex) && Intrinsics.areEqual(this.is_supported_on_latest_version, clientRouteRule.is_supported_on_latest_version) && Intrinsics.areEqual(this.include_raw_query_params, clientRouteRule.include_raw_query_params) && Intrinsics.areEqual(this.required_parameter_names, clientRouteRule.required_parameter_names) && Intrinsics.areEqual(this.spec_name, clientRouteRule.spec_name);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.path_regex;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Boolean bool = this.is_supported_on_latest_version;
            int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.include_raw_query_params;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37, 37, this.required_parameter_names);
            String str2 = this.spec_name;
            int hashCode4 = m + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileAlias.Builder builder = new ProfileAlias.Builder(6);
            builder.alias = this.path_regex;
            builder.verified = this.is_supported_on_latest_version;
            builder.expires_at = this.include_raw_query_params;
            builder.version = this.required_parameter_names;
            builder.display_date = this.spec_name;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.path_regex;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "path_regex=", arrayList);
            }
            Boolean bool = this.is_supported_on_latest_version;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_supported_on_latest_version=", bool, arrayList);
            }
            Boolean bool2 = this.include_raw_query_params;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("include_raw_query_params=", bool2, arrayList);
            }
            List list = this.required_parameter_names;
            if (!list.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("required_parameter_names=", arrayList, list);
            }
            String str2 = this.spec_name;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "spec_name=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ClientRouteRule{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes.dex */
    public final class DeepLinkRule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DeepLinkRule> CREATOR;
        public final Boolean external_browser_fallback;
        public final Boolean include_raw_query_params;
        public final Boolean is_supported_on_latest_version;
        public final String path_regex;
        public final List required_parameter_names;
        public final String spec_name;

        static {
            ClientRoutingConfig$DeepLinkRule$Companion$ADAPTER$1 clientRoutingConfig$DeepLinkRule$Companion$ADAPTER$1 = new ClientRoutingConfig$DeepLinkRule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DeepLinkRule.class), "type.googleapis.com/squareup.franklin.common.ClientRoutingConfig.DeepLinkRule", Syntax.PROTO_2, null, "squareup/franklin/common/client_routing_config.proto");
            ADAPTER = clientRoutingConfig$DeepLinkRule$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(clientRoutingConfig$DeepLinkRule$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeepLinkRule(Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.path_regex = str;
            this.is_supported_on_latest_version = bool;
            this.external_browser_fallback = bool2;
            this.include_raw_query_params = bool3;
            this.spec_name = str2;
            this.required_parameter_names = TransactorKt.immutableCopyOf("required_parameter_names", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeepLinkRule)) {
                return false;
            }
            DeepLinkRule deepLinkRule = (DeepLinkRule) obj;
            return Intrinsics.areEqual(unknownFields(), deepLinkRule.unknownFields()) && Intrinsics.areEqual(this.path_regex, deepLinkRule.path_regex) && Intrinsics.areEqual(this.is_supported_on_latest_version, deepLinkRule.is_supported_on_latest_version) && Intrinsics.areEqual(this.external_browser_fallback, deepLinkRule.external_browser_fallback) && Intrinsics.areEqual(this.include_raw_query_params, deepLinkRule.include_raw_query_params) && Intrinsics.areEqual(this.required_parameter_names, deepLinkRule.required_parameter_names) && Intrinsics.areEqual(this.spec_name, deepLinkRule.spec_name);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.path_regex;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Boolean bool = this.is_supported_on_latest_version;
            int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.external_browser_fallback;
            int hashCode4 = (hashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
            Boolean bool3 = this.include_raw_query_params;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37, 37, this.required_parameter_names);
            String str2 = this.spec_name;
            int hashCode5 = m + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Document.Builder builder = new Document.Builder(24);
            builder.category = this.path_regex;
            builder.title = this.is_supported_on_latest_version;
            builder.url = this.external_browser_fallback;
            builder.owner_token = this.include_raw_query_params;
            builder.document_date = this.required_parameter_names;
            builder.token = this.spec_name;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.path_regex;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "path_regex=", arrayList);
            }
            Boolean bool = this.is_supported_on_latest_version;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_supported_on_latest_version=", bool, arrayList);
            }
            Boolean bool2 = this.external_browser_fallback;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("external_browser_fallback=", bool2, arrayList);
            }
            Boolean bool3 = this.include_raw_query_params;
            if (bool3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("include_raw_query_params=", bool3, arrayList);
            }
            List list = this.required_parameter_names;
            if (!list.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("required_parameter_names=", arrayList, list);
            }
            String str2 = this.spec_name;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "spec_name=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DeepLinkRule{", "}", 0, null, null, 56);
        }
    }

    static {
        ClientRoutingConfig$Companion$ADAPTER$1 clientRoutingConfig$Companion$ADAPTER$1 = new ClientRoutingConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientRoutingConfig.class), "type.googleapis.com/squareup.franklin.common.ClientRoutingConfig", Syntax.PROTO_2, null, "squareup/franklin/common/client_routing_config.proto");
        ADAPTER = clientRoutingConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(clientRoutingConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientRoutingConfig(List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.client_routes = TransactorKt.immutableCopyOf("client_routes", list);
        this.deep_links = TransactorKt.immutableCopyOf("deep_links", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientRoutingConfig)) {
            return false;
        }
        ClientRoutingConfig clientRoutingConfig = (ClientRoutingConfig) obj;
        return Intrinsics.areEqual(unknownFields(), clientRoutingConfig.unknownFields()) && Intrinsics.areEqual(this.client_routes, clientRoutingConfig.client_routes) && Intrinsics.areEqual(this.deep_links, clientRoutingConfig.deep_links);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.deep_links.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.client_routes);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GreenBenefitsV1.Builder builder = new GreenBenefitsV1.Builder(15, false);
        builder.card_holder_benefits = this.client_routes;
        builder.green_status_benefits = this.deep_links;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.client_routes;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("client_routes=", arrayList, list);
        }
        List list2 = this.deep_links;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("deep_links=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientRoutingConfig{", "}", 0, null, null, 56);
    }
}
