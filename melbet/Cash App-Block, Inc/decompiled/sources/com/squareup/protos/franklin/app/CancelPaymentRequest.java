package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.EndFlowRequest;
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
public final class CancelPaymentRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CancelPaymentRequest> CREATOR;
    public final String payment_token;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CancelPaymentRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.CancelPaymentRequest$Companion$ADAPTER$1
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
                        return new CancelPaymentRequest((RequestContext) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 3) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CancelPaymentRequest cancelPaymentRequest = (CancelPaymentRequest) obj;
                reverseProtoWriter.getClass();
                cancelPaymentRequest.getClass();
                reverseProtoWriter.writeBytes(cancelPaymentRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, cancelPaymentRequest.payment_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, cancelPaymentRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CancelPaymentRequest cancelPaymentRequest = (CancelPaymentRequest) obj;
                cancelPaymentRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(3, cancelPaymentRequest.payment_token) + RequestContext.ADAPTER.encodedSizeWithTag(4, cancelPaymentRequest.request_context) + cancelPaymentRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CancelPaymentRequest cancelPaymentRequest = (CancelPaymentRequest) obj;
                cancelPaymentRequest.getClass();
                RequestContext requestContext = cancelPaymentRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new CancelPaymentRequest(requestContext2, (String) null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CancelPaymentRequest cancelPaymentRequest = (CancelPaymentRequest) obj;
                cancelPaymentRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 4, cancelPaymentRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, cancelPaymentRequest.payment_token);
                protoWriter.writeBytes(cancelPaymentRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelPaymentRequest(RequestContext requestContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.payment_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CancelPaymentRequest)) {
            return false;
        }
        CancelPaymentRequest cancelPaymentRequest = (CancelPaymentRequest) obj;
        return Intrinsics.areEqual(unknownFields(), cancelPaymentRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, cancelPaymentRequest.request_context) && Intrinsics.areEqual(this.payment_token, cancelPaymentRequest.payment_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.payment_token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EndFlowRequest.Builder builder = new EndFlowRequest.Builder(15);
        builder.request_context = this.request_context;
        builder.action_id = this.payment_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.payment_token != null) {
            arrayList.add("payment_token=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CancelPaymentRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ CancelPaymentRequest(RequestContext requestContext, String str, int i) {
        this((i & 1) != 0 ? null : requestContext, str, ByteString.EMPTY);
    }
}
