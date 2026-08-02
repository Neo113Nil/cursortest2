package com.squareup.protos.cash.postbank.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.FinishTutorialRequest;
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

/* loaded from: classes.dex */
public final class GetCustomerPrimaryDdaDetailsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCustomerPrimaryDdaDetailsRequest> CREATOR;
    public final RequestContext request_context;

    static {
        GetCustomerPrimaryDdaDetailsRequest$Companion$ADAPTER$1 getCustomerPrimaryDdaDetailsRequest$Companion$ADAPTER$1 = new GetCustomerPrimaryDdaDetailsRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetCustomerPrimaryDdaDetailsRequest.class), "type.googleapis.com/squareup.cash.postbank.api.GetCustomerPrimaryDdaDetailsRequest", Syntax.PROTO_2, null, "squareup/cash/postbank/api/GetCustomerPrimaryDdaDetails.proto");
        ADAPTER = getCustomerPrimaryDdaDetailsRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomerPrimaryDdaDetailsRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCustomerPrimaryDdaDetailsRequest(RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCustomerPrimaryDdaDetailsRequest)) {
            return false;
        }
        GetCustomerPrimaryDdaDetailsRequest getCustomerPrimaryDdaDetailsRequest = (GetCustomerPrimaryDdaDetailsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getCustomerPrimaryDdaDetailsRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, getCustomerPrimaryDdaDetailsRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = hashCode + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        FinishTutorialRequest.Builder builder = new FinishTutorialRequest.Builder(19);
        builder.request_context = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCustomerPrimaryDdaDetailsRequest{", "}", 0, null, null, 56);
    }
}
