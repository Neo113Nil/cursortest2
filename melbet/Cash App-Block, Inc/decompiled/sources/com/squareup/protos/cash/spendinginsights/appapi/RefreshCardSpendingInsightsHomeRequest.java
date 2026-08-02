package com.squareup.protos.cash.spendinginsights.appapi;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.FinishTutorialRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class RefreshCardSpendingInsightsHomeRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RefreshCardSpendingInsightsHomeRequest> CREATOR;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RefreshCardSpendingInsightsHomeRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.spendinginsights.appapi.RefreshCardSpendingInsightsHomeRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new RefreshCardSpendingInsightsHomeRequest((RequestContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                RefreshCardSpendingInsightsHomeRequest refreshCardSpendingInsightsHomeRequest = (RefreshCardSpendingInsightsHomeRequest) obj;
                reverseProtoWriter.getClass();
                refreshCardSpendingInsightsHomeRequest.getClass();
                reverseProtoWriter.writeBytes(refreshCardSpendingInsightsHomeRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, refreshCardSpendingInsightsHomeRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                RefreshCardSpendingInsightsHomeRequest refreshCardSpendingInsightsHomeRequest = (RefreshCardSpendingInsightsHomeRequest) obj;
                refreshCardSpendingInsightsHomeRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(1, refreshCardSpendingInsightsHomeRequest.request_context) + refreshCardSpendingInsightsHomeRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                RefreshCardSpendingInsightsHomeRequest refreshCardSpendingInsightsHomeRequest = (RefreshCardSpendingInsightsHomeRequest) obj;
                refreshCardSpendingInsightsHomeRequest.getClass();
                RequestContext requestContext = refreshCardSpendingInsightsHomeRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new RefreshCardSpendingInsightsHomeRequest(requestContext2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                RefreshCardSpendingInsightsHomeRequest refreshCardSpendingInsightsHomeRequest = (RefreshCardSpendingInsightsHomeRequest) obj;
                refreshCardSpendingInsightsHomeRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, refreshCardSpendingInsightsHomeRequest.request_context);
                protoWriter.writeBytes(refreshCardSpendingInsightsHomeRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshCardSpendingInsightsHomeRequest(RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RefreshCardSpendingInsightsHomeRequest)) {
            return false;
        }
        RefreshCardSpendingInsightsHomeRequest refreshCardSpendingInsightsHomeRequest = (RefreshCardSpendingInsightsHomeRequest) obj;
        return Intrinsics.areEqual(unknownFields(), refreshCardSpendingInsightsHomeRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, refreshCardSpendingInsightsHomeRequest.request_context);
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
        FinishTutorialRequest.Builder builder = new FinishTutorialRequest.Builder(22);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "RefreshCardSpendingInsightsHomeRequest{", "}", 0, null, null, 56);
    }
}
