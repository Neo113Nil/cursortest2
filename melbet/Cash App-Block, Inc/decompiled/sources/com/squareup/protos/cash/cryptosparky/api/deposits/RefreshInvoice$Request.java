package com.squareup.protos.cash.cryptosparky.api.deposits;

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
public final class RefreshInvoice$Request extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RefreshInvoice$Request> CREATOR;
    public final String invoiceId;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RefreshInvoice$Request.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cryptosparky.api.deposits.RefreshInvoice$Request$Companion$ADAPTER$1
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
                        return new RefreshInvoice$Request((RequestContext) obj2, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                RefreshInvoice$Request refreshInvoice$Request = (RefreshInvoice$Request) obj;
                reverseProtoWriter.getClass();
                refreshInvoice$Request.getClass();
                reverseProtoWriter.writeBytes(refreshInvoice$Request.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, refreshInvoice$Request.request_context);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, refreshInvoice$Request.invoiceId);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                RefreshInvoice$Request refreshInvoice$Request = (RefreshInvoice$Request) obj;
                refreshInvoice$Request.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(2, refreshInvoice$Request.request_context) + ProtoAdapter.STRING.encodedSizeWithTag(1, refreshInvoice$Request.invoiceId) + refreshInvoice$Request.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                RefreshInvoice$Request refreshInvoice$Request = (RefreshInvoice$Request) obj;
                refreshInvoice$Request.getClass();
                RequestContext requestContext = refreshInvoice$Request.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new RefreshInvoice$Request(requestContext2, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                RefreshInvoice$Request refreshInvoice$Request = (RefreshInvoice$Request) obj;
                refreshInvoice$Request.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, refreshInvoice$Request.invoiceId);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, refreshInvoice$Request.request_context);
                protoWriter.writeBytes(refreshInvoice$Request.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshInvoice$Request(RequestContext requestContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.invoiceId = str;
        this.request_context = requestContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RefreshInvoice$Request)) {
            return false;
        }
        RefreshInvoice$Request refreshInvoice$Request = (RefreshInvoice$Request) obj;
        return Intrinsics.areEqual(unknownFields(), refreshInvoice$Request.unknownFields()) && Intrinsics.areEqual(this.invoiceId, refreshInvoice$Request.invoiceId) && Intrinsics.areEqual(this.request_context, refreshInvoice$Request.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.invoiceId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode3 = hashCode2 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EndFlowRequest.Builder builder = new EndFlowRequest.Builder(6);
        builder.action_id = this.invoiceId;
        builder.request_context = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.invoiceId != null) {
            arrayList.add("invoiceId=██");
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Request{", "}", 0, null, null, 56);
    }
}
