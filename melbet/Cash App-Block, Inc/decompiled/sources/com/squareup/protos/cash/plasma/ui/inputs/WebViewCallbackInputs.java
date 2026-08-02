package com.squareup.protos.cash.plasma.ui.inputs;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.ListPoolsResponse;
import com.squareup.protos.common.Header;
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

/* loaded from: classes7.dex */
public final class WebViewCallbackInputs extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<WebViewCallbackInputs> CREATOR;
    public final List query_params;

    public final class QueryParam extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<QueryParam> CREATOR;
        public final String key;
        public final String value;

        static {
            WebViewCallbackInputs$QueryParam$Companion$ADAPTER$1 webViewCallbackInputs$QueryParam$Companion$ADAPTER$1 = new WebViewCallbackInputs$QueryParam$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(QueryParam.class), "type.googleapis.com/squareup.cash.plasma.ui.inputs.WebViewCallbackInputs.QueryParam", Syntax.PROTO_2, null, "squareup/cash/plasma/ui/inputs/BlockerInputsProto.proto");
            ADAPTER = webViewCallbackInputs$QueryParam$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(webViewCallbackInputs$QueryParam$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QueryParam(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.key = str;
            this.value = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof QueryParam)) {
                return false;
            }
            QueryParam queryParam = (QueryParam) obj;
            return Intrinsics.areEqual(unknownFields(), queryParam.unknownFields()) && Intrinsics.areEqual(this.key, queryParam.key) && Intrinsics.areEqual(this.value, queryParam.value);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.key;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.value;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Header.Builder builder = new Header.Builder(6);
            builder.name = this.key;
            builder.value = this.value;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.key;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "key=", arrayList);
            }
            if (this.value != null) {
                arrayList.add("value=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "QueryParam{", "}", 0, null, null, 56);
        }
    }

    static {
        WebViewCallbackInputs$Companion$ADAPTER$1 webViewCallbackInputs$Companion$ADAPTER$1 = new WebViewCallbackInputs$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(WebViewCallbackInputs.class), "type.googleapis.com/squareup.cash.plasma.ui.inputs.WebViewCallbackInputs", Syntax.PROTO_2, null, "squareup/cash/plasma/ui/inputs/BlockerInputsProto.proto");
        ADAPTER = webViewCallbackInputs$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(webViewCallbackInputs$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewCallbackInputs(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.query_params = TransactorKt.immutableCopyOf("query_params", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebViewCallbackInputs)) {
            return false;
        }
        WebViewCallbackInputs webViewCallbackInputs = (WebViewCallbackInputs) obj;
        return Intrinsics.areEqual(unknownFields(), webViewCallbackInputs.unknownFields()) && Intrinsics.areEqual(this.query_params, webViewCallbackInputs.query_params);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.query_params.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(4, false);
        builder.pools = this.query_params;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.query_params;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("query_params=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WebViewCallbackInputs{", "}", 0, null, null, 56);
    }
}
