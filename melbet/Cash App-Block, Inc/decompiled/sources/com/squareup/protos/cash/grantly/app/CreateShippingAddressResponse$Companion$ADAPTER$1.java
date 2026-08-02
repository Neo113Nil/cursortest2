package com.squareup.protos.cash.grantly.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateShippingAddressResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CreateShippingAddressResponse((ResponseMetadata) obj, (ShippingAddress) obj2, (GlobalAddress) obj3, (ResponseContext) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseMetadata.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(ShippingAddress.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateShippingAddressResponse createShippingAddressResponse = (CreateShippingAddressResponse) obj;
        reverseProtoWriter.getClass();
        createShippingAddressResponse.getClass();
        reverseProtoWriter.writeBytes(createShippingAddressResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, createShippingAddressResponse.response_context);
        GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 3, createShippingAddressResponse.corrected_address);
        ShippingAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 2, createShippingAddressResponse.shipping_address);
        ResponseMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, createShippingAddressResponse.metadata);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateShippingAddressResponse createShippingAddressResponse = (CreateShippingAddressResponse) obj;
        createShippingAddressResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(4, createShippingAddressResponse.response_context) + GlobalAddress.ADAPTER.encodedSizeWithTag(3, createShippingAddressResponse.corrected_address) + ShippingAddress.ADAPTER.encodedSizeWithTag(2, createShippingAddressResponse.shipping_address) + ResponseMetadata.ADAPTER.encodedSizeWithTag(1, createShippingAddressResponse.metadata) + createShippingAddressResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateShippingAddressResponse createShippingAddressResponse = (CreateShippingAddressResponse) obj;
        createShippingAddressResponse.getClass();
        ResponseMetadata responseMetadata = createShippingAddressResponse.metadata;
        ResponseMetadata responseMetadata2 = responseMetadata != null ? (ResponseMetadata) ResponseMetadata.ADAPTER.redact(responseMetadata) : null;
        ShippingAddress shippingAddress = createShippingAddressResponse.shipping_address;
        ShippingAddress shippingAddress2 = shippingAddress != null ? (ShippingAddress) ShippingAddress.ADAPTER.redact(shippingAddress) : null;
        ResponseContext responseContext = createShippingAddressResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CreateShippingAddressResponse(responseMetadata2, shippingAddress2, null, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateShippingAddressResponse createShippingAddressResponse = (CreateShippingAddressResponse) obj;
        createShippingAddressResponse.getClass();
        ResponseMetadata.ADAPTER.encodeWithTag(protoWriter, 1, createShippingAddressResponse.metadata);
        ShippingAddress.ADAPTER.encodeWithTag(protoWriter, 2, createShippingAddressResponse.shipping_address);
        GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 3, createShippingAddressResponse.corrected_address);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 4, createShippingAddressResponse.response_context);
        protoWriter.writeBytes(createShippingAddressResponse.unknownFields());
    }
}
