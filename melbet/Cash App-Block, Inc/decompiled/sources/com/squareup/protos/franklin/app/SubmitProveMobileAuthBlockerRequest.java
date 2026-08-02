package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SetDateRequest;
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
public final class SubmitProveMobileAuthBlockerRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitProveMobileAuthBlockerRequest> CREATOR;
    public final String failure_reason;
    public final Boolean finished;
    public final RequestContext request_context;

    static {
        SubmitProveMobileAuthBlockerRequest$Companion$ADAPTER$1 submitProveMobileAuthBlockerRequest$Companion$ADAPTER$1 = new SubmitProveMobileAuthBlockerRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SubmitProveMobileAuthBlockerRequest.class), "type.googleapis.com/squareup.franklin.app.SubmitProveMobileAuthBlockerRequest", Syntax.PROTO_2, null, "squareup/franklin/app/prove_mobile_auth.proto");
        ADAPTER = submitProveMobileAuthBlockerRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(submitProveMobileAuthBlockerRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitProveMobileAuthBlockerRequest(RequestContext requestContext, Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.finished = bool;
        this.failure_reason = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubmitProveMobileAuthBlockerRequest)) {
            return false;
        }
        SubmitProveMobileAuthBlockerRequest submitProveMobileAuthBlockerRequest = (SubmitProveMobileAuthBlockerRequest) obj;
        return Intrinsics.areEqual(unknownFields(), submitProveMobileAuthBlockerRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, submitProveMobileAuthBlockerRequest.request_context) && Intrinsics.areEqual(this.finished, submitProveMobileAuthBlockerRequest.finished) && Intrinsics.areEqual(this.failure_reason, submitProveMobileAuthBlockerRequest.failure_reason);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        Boolean bool = this.finished;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.failure_reason;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SetDateRequest.Builder builder = new SetDateRequest.Builder(2);
        builder.request_context = this.request_context;
        builder.disabling_toggle_enabled = this.finished;
        builder.date = this.failure_reason;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        Boolean bool = this.finished;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("finished=", bool, arrayList);
        }
        String str = this.failure_reason;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "failure_reason=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitProveMobileAuthBlockerRequest{", "}", 0, null, null, 56);
    }
}
