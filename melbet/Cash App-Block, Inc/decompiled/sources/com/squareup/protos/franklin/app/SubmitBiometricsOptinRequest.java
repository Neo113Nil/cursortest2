package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.EndFlowRequest;
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

/* loaded from: classes8.dex */
public final class SubmitBiometricsOptinRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitBiometricsOptinRequest> CREATOR;
    public final String biometrics_optin_status;
    public final RequestContext request_context;

    static {
        SubmitBiometricsOptinRequest$Companion$ADAPTER$1 submitBiometricsOptinRequest$Companion$ADAPTER$1 = new SubmitBiometricsOptinRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SubmitBiometricsOptinRequest.class), "type.googleapis.com/squareup.franklin.app.SubmitBiometricsOptinRequest", Syntax.PROTO_2, null, "squareup/franklin/app/biometrics_optin.proto");
        ADAPTER = submitBiometricsOptinRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(submitBiometricsOptinRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitBiometricsOptinRequest(RequestContext requestContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.biometrics_optin_status = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubmitBiometricsOptinRequest)) {
            return false;
        }
        SubmitBiometricsOptinRequest submitBiometricsOptinRequest = (SubmitBiometricsOptinRequest) obj;
        return Intrinsics.areEqual(unknownFields(), submitBiometricsOptinRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, submitBiometricsOptinRequest.request_context) && Intrinsics.areEqual(this.biometrics_optin_status, submitBiometricsOptinRequest.biometrics_optin_status);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.biometrics_optin_status;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EndFlowRequest.Builder builder = new EndFlowRequest.Builder(20);
        builder.request_context = this.request_context;
        builder.action_id = this.biometrics_optin_status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.biometrics_optin_status;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "biometrics_optin_status=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitBiometricsOptinRequest{", "}", 0, null, null, 56);
    }
}
