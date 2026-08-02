package com.squareup.protos.cash.grantly.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.PaginationResponseMetadata;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ListShippingAddressesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ListShippingAddressesResponse((ResponseMetadata) obj, (PaginationResponseMetadata) obj2, m, (ResponseContext) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseMetadata.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(PaginationResponseMetadata.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                m.add(ShippingAddress.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ListShippingAddressesResponse listShippingAddressesResponse = (ListShippingAddressesResponse) obj;
        reverseProtoWriter.getClass();
        listShippingAddressesResponse.getClass();
        reverseProtoWriter.writeBytes(listShippingAddressesResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, listShippingAddressesResponse.response_context);
        ShippingAddress.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, listShippingAddressesResponse.shipping_addresses);
        PaginationResponseMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 2, listShippingAddressesResponse.pagination);
        ResponseMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, listShippingAddressesResponse.metadata);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ListShippingAddressesResponse listShippingAddressesResponse = (ListShippingAddressesResponse) obj;
        listShippingAddressesResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(4, listShippingAddressesResponse.response_context) + ShippingAddress.ADAPTER.asRepeated().encodedSizeWithTag(3, listShippingAddressesResponse.shipping_addresses) + PaginationResponseMetadata.ADAPTER.encodedSizeWithTag(2, listShippingAddressesResponse.pagination) + ResponseMetadata.ADAPTER.encodedSizeWithTag(1, listShippingAddressesResponse.metadata) + listShippingAddressesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ListShippingAddressesResponse listShippingAddressesResponse = (ListShippingAddressesResponse) obj;
        listShippingAddressesResponse.getClass();
        ResponseMetadata responseMetadata = listShippingAddressesResponse.metadata;
        ResponseMetadata responseMetadata2 = responseMetadata != null ? (ResponseMetadata) ResponseMetadata.ADAPTER.redact(responseMetadata) : null;
        PaginationResponseMetadata paginationResponseMetadata = listShippingAddressesResponse.pagination;
        PaginationResponseMetadata paginationResponseMetadata2 = paginationResponseMetadata != null ? (PaginationResponseMetadata) PaginationResponseMetadata.ADAPTER.redact(paginationResponseMetadata) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(listShippingAddressesResponse.shipping_addresses, ShippingAddress.ADAPTER);
        ResponseContext responseContext = listShippingAddressesResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ListShippingAddressesResponse(responseMetadata2, paginationResponseMetadata2, m1169redactElements, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ListShippingAddressesResponse listShippingAddressesResponse = (ListShippingAddressesResponse) obj;
        listShippingAddressesResponse.getClass();
        ResponseMetadata.ADAPTER.encodeWithTag(protoWriter, 1, listShippingAddressesResponse.metadata);
        PaginationResponseMetadata.ADAPTER.encodeWithTag(protoWriter, 2, listShippingAddressesResponse.pagination);
        ShippingAddress.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, listShippingAddressesResponse.shipping_addresses);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 4, listShippingAddressesResponse.response_context);
        protoWriter.writeBytes(listShippingAddressesResponse.unknownFields());
    }
}
