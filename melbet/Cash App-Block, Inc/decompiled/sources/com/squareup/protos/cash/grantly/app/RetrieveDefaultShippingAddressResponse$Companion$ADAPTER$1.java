package com.squareup.protos.cash.grantly.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RetrieveDefaultShippingAddressResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RetrieveDefaultShippingAddressResponse((ResponseMetadata) obj, (ShippingAddress) obj2, (ResponseContext) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseMetadata.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(ShippingAddress.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RetrieveDefaultShippingAddressResponse retrieveDefaultShippingAddressResponse = (RetrieveDefaultShippingAddressResponse) obj;
        reverseProtoWriter.getClass();
        retrieveDefaultShippingAddressResponse.getClass();
        reverseProtoWriter.writeBytes(retrieveDefaultShippingAddressResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, retrieveDefaultShippingAddressResponse.response_context);
        ShippingAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 2, retrieveDefaultShippingAddressResponse.shipping_address);
        ResponseMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, retrieveDefaultShippingAddressResponse.metadata);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RetrieveDefaultShippingAddressResponse retrieveDefaultShippingAddressResponse = (RetrieveDefaultShippingAddressResponse) obj;
        retrieveDefaultShippingAddressResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(3, retrieveDefaultShippingAddressResponse.response_context) + ShippingAddress.ADAPTER.encodedSizeWithTag(2, retrieveDefaultShippingAddressResponse.shipping_address) + ResponseMetadata.ADAPTER.encodedSizeWithTag(1, retrieveDefaultShippingAddressResponse.metadata) + retrieveDefaultShippingAddressResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RetrieveDefaultShippingAddressResponse retrieveDefaultShippingAddressResponse = (RetrieveDefaultShippingAddressResponse) obj;
        retrieveDefaultShippingAddressResponse.getClass();
        ResponseMetadata responseMetadata = retrieveDefaultShippingAddressResponse.metadata;
        ResponseMetadata responseMetadata2 = responseMetadata != null ? (ResponseMetadata) ResponseMetadata.ADAPTER.redact(responseMetadata) : null;
        ShippingAddress shippingAddress = retrieveDefaultShippingAddressResponse.shipping_address;
        ShippingAddress shippingAddress2 = shippingAddress != null ? (ShippingAddress) ShippingAddress.ADAPTER.redact(shippingAddress) : null;
        ResponseContext responseContext = retrieveDefaultShippingAddressResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RetrieveDefaultShippingAddressResponse(responseMetadata2, shippingAddress2, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RetrieveDefaultShippingAddressResponse retrieveDefaultShippingAddressResponse = (RetrieveDefaultShippingAddressResponse) obj;
        retrieveDefaultShippingAddressResponse.getClass();
        ResponseMetadata.ADAPTER.encodeWithTag(protoWriter, 1, retrieveDefaultShippingAddressResponse.metadata);
        ShippingAddress.ADAPTER.encodeWithTag(protoWriter, 2, retrieveDefaultShippingAddressResponse.shipping_address);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 3, retrieveDefaultShippingAddressResponse.response_context);
        protoWriter.writeBytes(retrieveDefaultShippingAddressResponse.unknownFields());
    }
}
