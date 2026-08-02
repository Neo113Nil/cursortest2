package com.squareup.protos.cash.postcard.app;

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
public final class RefreshCardTabSchemeRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RefreshCardTabSchemeRequest> CREATOR;
    public final RequestContext request_context;

    static {
        RefreshCardTabSchemeRequest$Companion$ADAPTER$1 refreshCardTabSchemeRequest$Companion$ADAPTER$1 = new RefreshCardTabSchemeRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RefreshCardTabSchemeRequest.class), "type.googleapis.com/squareup.cash.postcard.app.RefreshCardTabSchemeRequest", Syntax.PROTO_2, null, "squareup/cash/postcard/app/RefreshCardTabScheme.proto");
        ADAPTER = refreshCardTabSchemeRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(refreshCardTabSchemeRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshCardTabSchemeRequest(RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RefreshCardTabSchemeRequest)) {
            return false;
        }
        RefreshCardTabSchemeRequest refreshCardTabSchemeRequest = (RefreshCardTabSchemeRequest) obj;
        return Intrinsics.areEqual(unknownFields(), refreshCardTabSchemeRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, refreshCardTabSchemeRequest.request_context);
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
        FinishTutorialRequest.Builder builder = new FinishTutorialRequest.Builder(20);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "RefreshCardTabSchemeRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ RefreshCardTabSchemeRequest(RequestContext requestContext) {
        this(requestContext, ByteString.EMPTY);
    }
}
