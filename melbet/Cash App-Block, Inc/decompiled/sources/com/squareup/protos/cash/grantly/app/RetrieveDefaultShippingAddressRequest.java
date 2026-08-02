package com.squareup.protos.cash.grantly.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.RequestMetadata;
import com.squareup.protos.cash.grantly.api.Card;
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
public final class RetrieveDefaultShippingAddressRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RetrieveDefaultShippingAddressRequest> CREATOR;
    public final Boolean attempt_auto_create;
    public final String customer_id;
    public final RequestMetadata metadata;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RetrieveDefaultShippingAddressRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.grantly.app.RetrieveDefaultShippingAddressRequest$Companion$ADAPTER$1
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
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new RetrieveDefaultShippingAddressRequest((RequestMetadata) obj, (String) obj2, (Boolean) obj3, (RequestContext) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestMetadata.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                RetrieveDefaultShippingAddressRequest retrieveDefaultShippingAddressRequest = (RetrieveDefaultShippingAddressRequest) obj;
                reverseProtoWriter.getClass();
                retrieveDefaultShippingAddressRequest.getClass();
                reverseProtoWriter.writeBytes(retrieveDefaultShippingAddressRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 5, retrieveDefaultShippingAddressRequest.request_context);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, retrieveDefaultShippingAddressRequest.attempt_auto_create);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, retrieveDefaultShippingAddressRequest.customer_id);
                RequestMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, retrieveDefaultShippingAddressRequest.metadata);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                RetrieveDefaultShippingAddressRequest retrieveDefaultShippingAddressRequest = (RetrieveDefaultShippingAddressRequest) obj;
                retrieveDefaultShippingAddressRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(5, retrieveDefaultShippingAddressRequest.request_context) + ProtoAdapter.BOOL.encodedSizeWithTag(4, retrieveDefaultShippingAddressRequest.attempt_auto_create) + ProtoAdapter.STRING.encodedSizeWithTag(2, retrieveDefaultShippingAddressRequest.customer_id) + RequestMetadata.ADAPTER.encodedSizeWithTag(1, retrieveDefaultShippingAddressRequest.metadata) + retrieveDefaultShippingAddressRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                RetrieveDefaultShippingAddressRequest retrieveDefaultShippingAddressRequest = (RetrieveDefaultShippingAddressRequest) obj;
                retrieveDefaultShippingAddressRequest.getClass();
                RequestMetadata requestMetadata = retrieveDefaultShippingAddressRequest.metadata;
                RequestMetadata requestMetadata2 = requestMetadata != null ? (RequestMetadata) RequestMetadata.ADAPTER.redact(requestMetadata) : null;
                RequestContext requestContext = retrieveDefaultShippingAddressRequest.request_context;
                return RetrieveDefaultShippingAddressRequest.copy$default(retrieveDefaultShippingAddressRequest, requestMetadata2, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 6);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                RetrieveDefaultShippingAddressRequest retrieveDefaultShippingAddressRequest = (RetrieveDefaultShippingAddressRequest) obj;
                retrieveDefaultShippingAddressRequest.getClass();
                RequestMetadata.ADAPTER.encodeWithTag(protoWriter, 1, retrieveDefaultShippingAddressRequest.metadata);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, retrieveDefaultShippingAddressRequest.customer_id);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, retrieveDefaultShippingAddressRequest.attempt_auto_create);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 5, retrieveDefaultShippingAddressRequest.request_context);
                protoWriter.writeBytes(retrieveDefaultShippingAddressRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrieveDefaultShippingAddressRequest(RequestMetadata requestMetadata, String str, Boolean bool, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.metadata = requestMetadata;
        this.customer_id = str;
        this.attempt_auto_create = bool;
        this.request_context = requestContext;
    }

    public static RetrieveDefaultShippingAddressRequest copy$default(RetrieveDefaultShippingAddressRequest retrieveDefaultShippingAddressRequest, RequestMetadata requestMetadata, RequestContext requestContext, ByteString byteString, int i) {
        if ((i & 1) != 0) {
            requestMetadata = retrieveDefaultShippingAddressRequest.metadata;
        }
        RequestMetadata requestMetadata2 = requestMetadata;
        String str = retrieveDefaultShippingAddressRequest.customer_id;
        Boolean bool = retrieveDefaultShippingAddressRequest.attempt_auto_create;
        if ((i & 16) != 0) {
            byteString = retrieveDefaultShippingAddressRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        retrieveDefaultShippingAddressRequest.getClass();
        byteString2.getClass();
        return new RetrieveDefaultShippingAddressRequest(requestMetadata2, str, bool, requestContext, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RetrieveDefaultShippingAddressRequest)) {
            return false;
        }
        RetrieveDefaultShippingAddressRequest retrieveDefaultShippingAddressRequest = (RetrieveDefaultShippingAddressRequest) obj;
        return Intrinsics.areEqual(unknownFields(), retrieveDefaultShippingAddressRequest.unknownFields()) && Intrinsics.areEqual(this.metadata, retrieveDefaultShippingAddressRequest.metadata) && Intrinsics.areEqual(this.customer_id, retrieveDefaultShippingAddressRequest.customer_id) && Intrinsics.areEqual(this.attempt_auto_create, retrieveDefaultShippingAddressRequest.attempt_auto_create) && Intrinsics.areEqual(this.request_context, retrieveDefaultShippingAddressRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestMetadata requestMetadata = this.metadata;
        int hashCode2 = (hashCode + (requestMetadata != null ? requestMetadata.hashCode() : 0)) * 37;
        String str = this.customer_id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.attempt_auto_create;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode5 = hashCode4 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(22, false);
        builder.last_four_digits = this.metadata;
        builder.postal_code = this.customer_id;
        builder.expiration = this.attempt_auto_create;
        builder.ciphertext_ = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestMetadata requestMetadata = this.metadata;
        if (requestMetadata != null) {
            arrayList.add("metadata=" + requestMetadata);
        }
        String str = this.customer_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_id=", arrayList);
        }
        Boolean bool = this.attempt_auto_create;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("attempt_auto_create=", bool, arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RetrieveDefaultShippingAddressRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ RetrieveDefaultShippingAddressRequest(String str) {
        this(null, str, Boolean.TRUE, null, ByteString.EMPTY);
    }
}
