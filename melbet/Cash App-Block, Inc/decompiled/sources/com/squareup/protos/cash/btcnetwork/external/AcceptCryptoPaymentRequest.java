package com.squareup.protos.cash.btcnetwork.external;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class AcceptCryptoPaymentRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AcceptCryptoPaymentRequest> CREATOR;
    public final String payment_token;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AcceptCryptoPaymentRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.btcnetwork.external.AcceptCryptoPaymentRequest$Companion$ADAPTER$1
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
                        break;
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj2);
                    }
                }
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                String str = (String) obj;
                if (str != null) {
                    return new AcceptCryptoPaymentRequest((RequestContext) obj2, str, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj, "payment_token");
                throw null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                AcceptCryptoPaymentRequest acceptCryptoPaymentRequest = (AcceptCryptoPaymentRequest) obj;
                reverseProtoWriter.getClass();
                acceptCryptoPaymentRequest.getClass();
                reverseProtoWriter.writeBytes(acceptCryptoPaymentRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, acceptCryptoPaymentRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, acceptCryptoPaymentRequest.payment_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AcceptCryptoPaymentRequest acceptCryptoPaymentRequest = (AcceptCryptoPaymentRequest) obj;
                acceptCryptoPaymentRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(3, acceptCryptoPaymentRequest.request_context) + ProtoAdapter.STRING.encodedSizeWithTag(1, acceptCryptoPaymentRequest.payment_token) + acceptCryptoPaymentRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AcceptCryptoPaymentRequest acceptCryptoPaymentRequest = (AcceptCryptoPaymentRequest) obj;
                acceptCryptoPaymentRequest.getClass();
                RequestContext requestContext = acceptCryptoPaymentRequest.request_context;
                return AcceptCryptoPaymentRequest.copy$default(acceptCryptoPaymentRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 1);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AcceptCryptoPaymentRequest acceptCryptoPaymentRequest = (AcceptCryptoPaymentRequest) obj;
                acceptCryptoPaymentRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, acceptCryptoPaymentRequest.payment_token);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 3, acceptCryptoPaymentRequest.request_context);
                protoWriter.writeBytes(acceptCryptoPaymentRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptCryptoPaymentRequest(RequestContext requestContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        byteString.getClass();
        this.payment_token = str;
        this.request_context = requestContext;
    }

    public static AcceptCryptoPaymentRequest copy$default(AcceptCryptoPaymentRequest acceptCryptoPaymentRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = acceptCryptoPaymentRequest.payment_token;
        if ((i & 4) != 0) {
            byteString = acceptCryptoPaymentRequest.unknownFields();
        }
        acceptCryptoPaymentRequest.getClass();
        str.getClass();
        byteString.getClass();
        return new AcceptCryptoPaymentRequest(requestContext, str, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AcceptCryptoPaymentRequest)) {
            return false;
        }
        AcceptCryptoPaymentRequest acceptCryptoPaymentRequest = (AcceptCryptoPaymentRequest) obj;
        return Intrinsics.areEqual(unknownFields(), acceptCryptoPaymentRequest.unknownFields()) && Intrinsics.areEqual(this.payment_token, acceptCryptoPaymentRequest.payment_token) && Intrinsics.areEqual(this.request_context, acceptCryptoPaymentRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.payment_token);
        RequestContext requestContext = this.request_context;
        int hashCode = m + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EndFlowRequest.Builder builder = new EndFlowRequest.Builder(2);
        builder.action_id = this.payment_token;
        builder.request_context = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.payment_token, "payment_token=", arrayList);
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AcceptCryptoPaymentRequest{", "}", 0, null, null, 56);
    }
}
