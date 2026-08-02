package com.squareup.protos.cash.grantly.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RetrieveShippingAddressResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RetrieveShippingAddressResponse((ResponseMetadata) obj, (ShippingAddress) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseMetadata.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ShippingAddress.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RetrieveShippingAddressResponse retrieveShippingAddressResponse = (RetrieveShippingAddressResponse) obj;
        reverseProtoWriter.getClass();
        retrieveShippingAddressResponse.getClass();
        reverseProtoWriter.writeBytes(retrieveShippingAddressResponse.unknownFields());
        ShippingAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 2, retrieveShippingAddressResponse.shipping_address);
        ResponseMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, retrieveShippingAddressResponse.metadata);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RetrieveShippingAddressResponse retrieveShippingAddressResponse = (RetrieveShippingAddressResponse) obj;
        retrieveShippingAddressResponse.getClass();
        return ShippingAddress.ADAPTER.encodedSizeWithTag(2, retrieveShippingAddressResponse.shipping_address) + ResponseMetadata.ADAPTER.encodedSizeWithTag(1, retrieveShippingAddressResponse.metadata) + retrieveShippingAddressResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RetrieveShippingAddressResponse retrieveShippingAddressResponse = (RetrieveShippingAddressResponse) obj;
        retrieveShippingAddressResponse.getClass();
        ResponseMetadata responseMetadata = retrieveShippingAddressResponse.metadata;
        ResponseMetadata responseMetadata2 = responseMetadata != null ? (ResponseMetadata) ResponseMetadata.ADAPTER.redact(responseMetadata) : null;
        ShippingAddress shippingAddress = retrieveShippingAddressResponse.shipping_address;
        ShippingAddress shippingAddress2 = shippingAddress != null ? (ShippingAddress) ShippingAddress.ADAPTER.redact(shippingAddress) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RetrieveShippingAddressResponse(responseMetadata2, shippingAddress2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RetrieveShippingAddressResponse retrieveShippingAddressResponse = (RetrieveShippingAddressResponse) obj;
        retrieveShippingAddressResponse.getClass();
        ResponseMetadata.ADAPTER.encodeWithTag(protoWriter, 1, retrieveShippingAddressResponse.metadata);
        ShippingAddress.ADAPTER.encodeWithTag(protoWriter, 2, retrieveShippingAddressResponse.shipping_address);
        protoWriter.writeBytes(retrieveShippingAddressResponse.unknownFields());
    }
}
