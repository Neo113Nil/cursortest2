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
public final class UpdateDefaultShippingAddressRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateDefaultShippingAddressRequest> CREATOR;
    public final String customer_id;
    public final RequestMetadata metadata;
    public final RequestContext request_context;
    public final String shipping_address_id;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UpdateDefaultShippingAddressRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.grantly.app.UpdateDefaultShippingAddressRequest$Companion$ADAPTER$1
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
                        return new UpdateDefaultShippingAddressRequest((RequestMetadata) obj, (String) obj2, (String) obj3, (RequestContext) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestMetadata.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UpdateDefaultShippingAddressRequest updateDefaultShippingAddressRequest = (UpdateDefaultShippingAddressRequest) obj;
                reverseProtoWriter.getClass();
                updateDefaultShippingAddressRequest.getClass();
                reverseProtoWriter.writeBytes(updateDefaultShippingAddressRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, updateDefaultShippingAddressRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, updateDefaultShippingAddressRequest.shipping_address_id);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, updateDefaultShippingAddressRequest.customer_id);
                RequestMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateDefaultShippingAddressRequest.metadata);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UpdateDefaultShippingAddressRequest updateDefaultShippingAddressRequest = (UpdateDefaultShippingAddressRequest) obj;
                updateDefaultShippingAddressRequest.getClass();
                int encodedSizeWithTag = RequestMetadata.ADAPTER.encodedSizeWithTag(1, updateDefaultShippingAddressRequest.metadata) + updateDefaultShippingAddressRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return RequestContext.ADAPTER.encodedSizeWithTag(4, updateDefaultShippingAddressRequest.request_context) + protoAdapter2.encodedSizeWithTag(3, updateDefaultShippingAddressRequest.shipping_address_id) + protoAdapter2.encodedSizeWithTag(2, updateDefaultShippingAddressRequest.customer_id) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UpdateDefaultShippingAddressRequest updateDefaultShippingAddressRequest = (UpdateDefaultShippingAddressRequest) obj;
                updateDefaultShippingAddressRequest.getClass();
                RequestMetadata requestMetadata = updateDefaultShippingAddressRequest.metadata;
                RequestMetadata requestMetadata2 = requestMetadata != null ? (RequestMetadata) RequestMetadata.ADAPTER.redact(requestMetadata) : null;
                RequestContext requestContext = updateDefaultShippingAddressRequest.request_context;
                return UpdateDefaultShippingAddressRequest.copy$default(updateDefaultShippingAddressRequest, requestMetadata2, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 6);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UpdateDefaultShippingAddressRequest updateDefaultShippingAddressRequest = (UpdateDefaultShippingAddressRequest) obj;
                updateDefaultShippingAddressRequest.getClass();
                RequestMetadata.ADAPTER.encodeWithTag(protoWriter, 1, updateDefaultShippingAddressRequest.metadata);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, updateDefaultShippingAddressRequest.customer_id);
                protoAdapter2.encodeWithTag(protoWriter, 3, updateDefaultShippingAddressRequest.shipping_address_id);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 4, updateDefaultShippingAddressRequest.request_context);
                protoWriter.writeBytes(updateDefaultShippingAddressRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateDefaultShippingAddressRequest(RequestMetadata requestMetadata, String str, String str2, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.metadata = requestMetadata;
        this.customer_id = str;
        this.shipping_address_id = str2;
        this.request_context = requestContext;
    }

    public static UpdateDefaultShippingAddressRequest copy$default(UpdateDefaultShippingAddressRequest updateDefaultShippingAddressRequest, RequestMetadata requestMetadata, RequestContext requestContext, ByteString byteString, int i) {
        if ((i & 1) != 0) {
            requestMetadata = updateDefaultShippingAddressRequest.metadata;
        }
        RequestMetadata requestMetadata2 = requestMetadata;
        String str = updateDefaultShippingAddressRequest.customer_id;
        String str2 = updateDefaultShippingAddressRequest.shipping_address_id;
        if ((i & 16) != 0) {
            byteString = updateDefaultShippingAddressRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        updateDefaultShippingAddressRequest.getClass();
        byteString2.getClass();
        return new UpdateDefaultShippingAddressRequest(requestMetadata2, str, str2, requestContext, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateDefaultShippingAddressRequest)) {
            return false;
        }
        UpdateDefaultShippingAddressRequest updateDefaultShippingAddressRequest = (UpdateDefaultShippingAddressRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateDefaultShippingAddressRequest.unknownFields()) && Intrinsics.areEqual(this.metadata, updateDefaultShippingAddressRequest.metadata) && Intrinsics.areEqual(this.customer_id, updateDefaultShippingAddressRequest.customer_id) && Intrinsics.areEqual(this.shipping_address_id, updateDefaultShippingAddressRequest.shipping_address_id) && Intrinsics.areEqual(this.request_context, updateDefaultShippingAddressRequest.request_context);
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
        String str2 = this.shipping_address_id;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode5 = hashCode4 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(23, false);
        builder.expiration = this.metadata;
        builder.postal_code = this.customer_id;
        builder.last_four_digits = this.shipping_address_id;
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
        String str2 = this.shipping_address_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "shipping_address_id=", arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateDefaultShippingAddressRequest{", "}", 0, null, null, 56);
    }
}
