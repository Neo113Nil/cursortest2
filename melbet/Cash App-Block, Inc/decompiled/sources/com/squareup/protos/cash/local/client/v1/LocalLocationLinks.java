package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.security.mri.api.v1.Identifiers;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalLocationLinks extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalLocationLinks> CREATOR;
    public final String download_app_for_onboarding_url;
    public final String onboarding_flow_client_route;
    public final String onboarding_flow_deep_link_payload;
    public final String profile_share_link_url;
    public final String upsell_client_route;
    public final String web_ordering_url;

    static {
        LocalLocationLinks$Companion$ADAPTER$1 localLocationLinks$Companion$ADAPTER$1 = new LocalLocationLinks$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalLocationLinks.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalLocationLinks", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_brand.proto");
        ADAPTER = localLocationLinks$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localLocationLinks$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalLocationLinks(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.profile_share_link_url = str;
        this.web_ordering_url = str2;
        this.download_app_for_onboarding_url = str3;
        this.onboarding_flow_client_route = str4;
        this.onboarding_flow_deep_link_payload = str5;
        this.upsell_client_route = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalLocationLinks)) {
            return false;
        }
        LocalLocationLinks localLocationLinks = (LocalLocationLinks) obj;
        return Intrinsics.areEqual(unknownFields(), localLocationLinks.unknownFields()) && Intrinsics.areEqual(this.profile_share_link_url, localLocationLinks.profile_share_link_url) && Intrinsics.areEqual(this.web_ordering_url, localLocationLinks.web_ordering_url) && Intrinsics.areEqual(this.download_app_for_onboarding_url, localLocationLinks.download_app_for_onboarding_url) && Intrinsics.areEqual(this.onboarding_flow_client_route, localLocationLinks.onboarding_flow_client_route) && Intrinsics.areEqual(this.onboarding_flow_deep_link_payload, localLocationLinks.onboarding_flow_deep_link_payload) && Intrinsics.areEqual(this.upsell_client_route, localLocationLinks.upsell_client_route);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.profile_share_link_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.web_ordering_url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.download_app_for_onboarding_url;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.onboarding_flow_client_route;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.onboarding_flow_deep_link_payload;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.upsell_client_route;
        int hashCode7 = hashCode6 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Identifiers.Builder builder = new Identifiers.Builder(4);
        builder.operating_system = this.profile_share_link_url;
        builder.operating_system_version = this.web_ordering_url;
        builder.app_version = this.download_app_for_onboarding_url;
        builder.app_token = this.onboarding_flow_client_route;
        builder.device_id = this.onboarding_flow_deep_link_payload;
        builder.vendor_id = this.upsell_client_route;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.profile_share_link_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "profile_share_link_url=", arrayList);
        }
        String str2 = this.web_ordering_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "web_ordering_url=", arrayList);
        }
        String str3 = this.download_app_for_onboarding_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "download_app_for_onboarding_url=", arrayList);
        }
        String str4 = this.onboarding_flow_client_route;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "onboarding_flow_client_route=", arrayList);
        }
        String str5 = this.onboarding_flow_deep_link_payload;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "onboarding_flow_deep_link_payload=", arrayList);
        }
        String str6 = this.upsell_client_route;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "upsell_client_route=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalLocationLinks{", "}", 0, null, null, 56);
    }
}
