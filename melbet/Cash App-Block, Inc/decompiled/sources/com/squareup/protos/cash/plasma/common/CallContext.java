package com.squareup.protos.cash.plasma.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
import com.squareup.protos.franklin.common.RequestContext;
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
public final class CallContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CallContext> CREATOR;
    public final String app_token;
    public final ClientInfo client_info;
    public final RequestContext initial_request_context;

    static {
        CallContext$Companion$ADAPTER$1 callContext$Companion$ADAPTER$1 = new CallContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CallContext.class), "type.googleapis.com/squareup.cash.plasma.common.CallContext", Syntax.PROTO_2, null, "squareup/cash/plasma/common/CallContext.proto");
        ADAPTER = callContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(callContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallContext(String str, ClientInfo clientInfo, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.app_token = str;
        this.client_info = clientInfo;
        this.initial_request_context = requestContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CallContext)) {
            return false;
        }
        CallContext callContext = (CallContext) obj;
        return Intrinsics.areEqual(unknownFields(), callContext.unknownFields()) && Intrinsics.areEqual(this.app_token, callContext.app_token) && Intrinsics.areEqual(this.client_info, callContext.client_info) && Intrinsics.areEqual(this.initial_request_context, callContext.initial_request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.app_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ClientInfo clientInfo = this.client_info;
        int hashCode3 = (hashCode2 + (clientInfo != null ? clientInfo.hashCode() : 0)) * 37;
        RequestContext requestContext = this.initial_request_context;
        int hashCode4 = hashCode3 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(28, false);
        builder.advertisement_data = this.app_token;
        builder.transmission_level = this.client_info;
        builder.frequency = this.initial_request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.app_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "app_token=", arrayList);
        }
        ClientInfo clientInfo = this.client_info;
        if (clientInfo != null) {
            arrayList.add("client_info=" + clientInfo);
        }
        RequestContext requestContext = this.initial_request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("initial_request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CallContext{", "}", 0, null, null, 56);
    }
}
