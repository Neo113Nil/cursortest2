package com.squareup.protos.cash.security;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzkp;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardModule;
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
public final class VerifyPasswordRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VerifyPasswordRequest> CREATOR;
    public final zzkp input;
    public final RequestContext request_context;

    static {
        VerifyPasswordRequest$Companion$ADAPTER$1 verifyPasswordRequest$Companion$ADAPTER$1 = new VerifyPasswordRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VerifyPasswordRequest.class), "type.googleapis.com/squareup.cash.security.VerifyPasswordRequest", Syntax.PROTO_2, null, "squareup/cash/security/api.proto");
        ADAPTER = verifyPasswordRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(verifyPasswordRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyPasswordRequest(RequestContext requestContext, zzkp zzkpVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.input = zzkpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyPasswordRequest)) {
            return false;
        }
        VerifyPasswordRequest verifyPasswordRequest = (VerifyPasswordRequest) obj;
        return Intrinsics.areEqual(unknownFields(), verifyPasswordRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, verifyPasswordRequest.request_context) && Intrinsics.areEqual(this.input, verifyPasswordRequest.input);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        zzkp zzkpVar = this.input;
        int hashCode3 = hashCode2 + (zzkpVar != null ? zzkpVar.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(29);
        builder.f1329type = this.request_context;
        builder.use_case = this.input;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.input != null) {
            arrayList.add("input=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VerifyPasswordRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ VerifyPasswordRequest(RequestContext requestContext, zzkp zzkpVar) {
        this(requestContext, zzkpVar, ByteString.EMPTY);
    }
}
