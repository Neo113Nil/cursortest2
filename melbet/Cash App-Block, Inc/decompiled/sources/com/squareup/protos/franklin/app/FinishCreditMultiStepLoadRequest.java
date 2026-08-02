package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.ResolveMergeRequest;
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
public final class FinishCreditMultiStepLoadRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FinishCreditMultiStepLoadRequest> CREATOR;
    public final RequestContext request_context;
    public final Boolean requested_to_be_notified;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FinishCreditMultiStepLoadRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.FinishCreditMultiStepLoadRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new FinishCreditMultiStepLoadRequest((RequestContext) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                FinishCreditMultiStepLoadRequest finishCreditMultiStepLoadRequest = (FinishCreditMultiStepLoadRequest) obj;
                reverseProtoWriter.getClass();
                finishCreditMultiStepLoadRequest.getClass();
                reverseProtoWriter.writeBytes(finishCreditMultiStepLoadRequest.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, finishCreditMultiStepLoadRequest.requested_to_be_notified);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, finishCreditMultiStepLoadRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                FinishCreditMultiStepLoadRequest finishCreditMultiStepLoadRequest = (FinishCreditMultiStepLoadRequest) obj;
                finishCreditMultiStepLoadRequest.getClass();
                return ProtoAdapter.BOOL.encodedSizeWithTag(2, finishCreditMultiStepLoadRequest.requested_to_be_notified) + RequestContext.ADAPTER.encodedSizeWithTag(1, finishCreditMultiStepLoadRequest.request_context) + finishCreditMultiStepLoadRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                FinishCreditMultiStepLoadRequest finishCreditMultiStepLoadRequest = (FinishCreditMultiStepLoadRequest) obj;
                finishCreditMultiStepLoadRequest.getClass();
                RequestContext requestContext = finishCreditMultiStepLoadRequest.request_context;
                return FinishCreditMultiStepLoadRequest.copy$default(finishCreditMultiStepLoadRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                FinishCreditMultiStepLoadRequest finishCreditMultiStepLoadRequest = (FinishCreditMultiStepLoadRequest) obj;
                finishCreditMultiStepLoadRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, finishCreditMultiStepLoadRequest.request_context);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, finishCreditMultiStepLoadRequest.requested_to_be_notified);
                protoWriter.writeBytes(finishCreditMultiStepLoadRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinishCreditMultiStepLoadRequest(RequestContext requestContext, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.requested_to_be_notified = bool;
    }

    public static FinishCreditMultiStepLoadRequest copy$default(FinishCreditMultiStepLoadRequest finishCreditMultiStepLoadRequest, RequestContext requestContext, ByteString byteString, int i) {
        Boolean bool = finishCreditMultiStepLoadRequest.requested_to_be_notified;
        if ((i & 4) != 0) {
            byteString = finishCreditMultiStepLoadRequest.unknownFields();
        }
        finishCreditMultiStepLoadRequest.getClass();
        byteString.getClass();
        return new FinishCreditMultiStepLoadRequest(requestContext, bool, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FinishCreditMultiStepLoadRequest)) {
            return false;
        }
        FinishCreditMultiStepLoadRequest finishCreditMultiStepLoadRequest = (FinishCreditMultiStepLoadRequest) obj;
        return Intrinsics.areEqual(unknownFields(), finishCreditMultiStepLoadRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, finishCreditMultiStepLoadRequest.request_context) && Intrinsics.areEqual(this.requested_to_be_notified, finishCreditMultiStepLoadRequest.requested_to_be_notified);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        Boolean bool = this.requested_to_be_notified;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResolveMergeRequest.Builder builder = new ResolveMergeRequest.Builder(2);
        builder.request_context = this.request_context;
        builder.confirm_merge = this.requested_to_be_notified;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        Boolean bool = this.requested_to_be_notified;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requested_to_be_notified=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FinishCreditMultiStepLoadRequest{", "}", 0, null, null, 56);
    }
}
