package com.squareup.protos.cash.security;

import android.os.Parcelable;
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

/* loaded from: classes7.dex */
public final class SetPasswordRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetPasswordRequest> CREATOR;
    public final String new_password;
    public final RequestContext request_context;

    static {
        SetPasswordRequest$Companion$ADAPTER$1 setPasswordRequest$Companion$ADAPTER$1 = new SetPasswordRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetPasswordRequest.class), "type.googleapis.com/squareup.cash.security.SetPasswordRequest", Syntax.PROTO_2, null, "squareup/cash/security/api.proto");
        ADAPTER = setPasswordRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setPasswordRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetPasswordRequest(RequestContext requestContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.new_password = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetPasswordRequest)) {
            return false;
        }
        SetPasswordRequest setPasswordRequest = (SetPasswordRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setPasswordRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, setPasswordRequest.request_context) && Intrinsics.areEqual(this.new_password, setPasswordRequest.new_password);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.new_password;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EndFlowRequest.Builder builder = new EndFlowRequest.Builder(12);
        builder.request_context = this.request_context;
        builder.action_id = this.new_password;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.new_password != null) {
            arrayList.add("new_password=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetPasswordRequest{", "}", 0, null, null, 56);
    }
}
