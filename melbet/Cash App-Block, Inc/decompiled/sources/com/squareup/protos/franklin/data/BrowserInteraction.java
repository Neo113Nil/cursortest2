package com.squareup.protos.franklin.data;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Headers;
import com.squareup.protos.person.Alias;
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

/* loaded from: classes8.dex */
public final class BrowserInteraction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BrowserInteraction> CREATOR;
    public final String antibot_report;
    public final String client_ip;
    public final List header_name;
    public final Headers request_headers;
    public final String sift_science_token;
    public final Long timestamp;
    public final String tracking_cookie;

    static {
        BrowserInteraction$Companion$ADAPTER$1 browserInteraction$Companion$ADAPTER$1 = new BrowserInteraction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BrowserInteraction.class), "type.googleapis.com/squareup.franklin.BrowserInteraction", Syntax.PROTO_2, null, "squareup/franklin/browser_interaction.proto");
        ADAPTER = browserInteraction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(browserInteraction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserInteraction(Long l, String str, String str2, List list, String str3, String str4, Headers headers, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.timestamp = l;
        this.sift_science_token = str;
        this.antibot_report = str2;
        this.client_ip = str3;
        this.tracking_cookie = str4;
        this.request_headers = headers;
        this.header_name = TransactorKt.immutableCopyOf("header_name", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BrowserInteraction)) {
            return false;
        }
        BrowserInteraction browserInteraction = (BrowserInteraction) obj;
        return Intrinsics.areEqual(unknownFields(), browserInteraction.unknownFields()) && Intrinsics.areEqual(this.timestamp, browserInteraction.timestamp) && Intrinsics.areEqual(this.sift_science_token, browserInteraction.sift_science_token) && Intrinsics.areEqual(this.antibot_report, browserInteraction.antibot_report) && Intrinsics.areEqual(this.header_name, browserInteraction.header_name) && Intrinsics.areEqual(this.client_ip, browserInteraction.client_ip) && Intrinsics.areEqual(this.tracking_cookie, browserInteraction.tracking_cookie) && Intrinsics.areEqual(this.request_headers, browserInteraction.request_headers);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.timestamp;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str = this.sift_science_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.antibot_report;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.header_name);
        String str3 = this.client_ip;
        int hashCode4 = (m + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.tracking_cookie;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Headers headers = this.request_headers;
        int hashCode6 = hashCode5 + (headers != null ? headers.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(12, false);
        builder.first_verified_at_ms = this.timestamp;
        builder.scope = this.sift_science_token;
        builder.value = this.antibot_report;
        builder.f1407type = this.header_name;
        builder.last_verified_at_ms = this.client_ip;
        builder.created_at = this.tracking_cookie;
        builder.updated_at = this.request_headers;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.timestamp;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("timestamp=", l, arrayList);
        }
        String str = this.sift_science_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sift_science_token=", arrayList);
        }
        String str2 = this.antibot_report;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "antibot_report=", arrayList);
        }
        List list = this.header_name;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("header_name=", arrayList, list);
        }
        String str3 = this.client_ip;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "client_ip=", arrayList);
        }
        String str4 = this.tracking_cookie;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "tracking_cookie=", arrayList);
        }
        Headers headers = this.request_headers;
        if (headers != null) {
            arrayList.add("request_headers=" + headers);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BrowserInteraction{", "}", 0, null, null, 56);
    }
}
