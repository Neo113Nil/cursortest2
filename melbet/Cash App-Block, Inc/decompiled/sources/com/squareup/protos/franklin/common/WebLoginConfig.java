package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.disputron.Pagination;
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

/* loaded from: classes8.dex */
public final class WebLoginConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<WebLoginConfig> CREATOR;
    public final Long expires_at;
    public final String token;

    static {
        WebLoginConfig$Companion$ADAPTER$1 webLoginConfig$Companion$ADAPTER$1 = new WebLoginConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(WebLoginConfig.class), "type.googleapis.com/squareup.franklin.common.WebLoginConfig", Syntax.PROTO_2, null, "squareup/franklin/common/web_login_config.proto");
        ADAPTER = webLoginConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(webLoginConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginConfig(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.expires_at = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebLoginConfig)) {
            return false;
        }
        WebLoginConfig webLoginConfig = (WebLoginConfig) obj;
        return Intrinsics.areEqual(unknownFields(), webLoginConfig.unknownFields()) && Intrinsics.areEqual(this.token, webLoginConfig.token) && Intrinsics.areEqual(this.expires_at, webLoginConfig.expires_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.expires_at;
        int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Pagination.Builder builder = new Pagination.Builder(10);
        builder.offset = this.token;
        builder.limit = this.expires_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.token != null) {
            arrayList.add("token=██");
        }
        Long l = this.expires_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WebLoginConfig{", "}", 0, null, null, 56);
    }
}
