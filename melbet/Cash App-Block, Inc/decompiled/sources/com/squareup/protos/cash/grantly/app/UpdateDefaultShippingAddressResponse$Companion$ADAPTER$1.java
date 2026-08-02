package com.squareup.protos.cash.grantly.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UpdateDefaultShippingAddressResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateDefaultShippingAddressResponse((ResponseMetadata) obj, (ResponseContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseMetadata.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdateDefaultShippingAddressResponse updateDefaultShippingAddressResponse = (UpdateDefaultShippingAddressResponse) obj;
        reverseProtoWriter.getClass();
        updateDefaultShippingAddressResponse.getClass();
        reverseProtoWriter.writeBytes(updateDefaultShippingAddressResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, updateDefaultShippingAddressResponse.response_context);
        ResponseMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateDefaultShippingAddressResponse.metadata);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateDefaultShippingAddressResponse updateDefaultShippingAddressResponse = (UpdateDefaultShippingAddressResponse) obj;
        updateDefaultShippingAddressResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, updateDefaultShippingAddressResponse.response_context) + ResponseMetadata.ADAPTER.encodedSizeWithTag(1, updateDefaultShippingAddressResponse.metadata) + updateDefaultShippingAddressResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpdateDefaultShippingAddressResponse updateDefaultShippingAddressResponse = (UpdateDefaultShippingAddressResponse) obj;
        updateDefaultShippingAddressResponse.getClass();
        ResponseMetadata responseMetadata = updateDefaultShippingAddressResponse.metadata;
        ResponseMetadata responseMetadata2 = responseMetadata != null ? (ResponseMetadata) ResponseMetadata.ADAPTER.redact(responseMetadata) : null;
        ResponseContext responseContext = updateDefaultShippingAddressResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UpdateDefaultShippingAddressResponse(responseMetadata2, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateDefaultShippingAddressResponse updateDefaultShippingAddressResponse = (UpdateDefaultShippingAddressResponse) obj;
        updateDefaultShippingAddressResponse.getClass();
        ResponseMetadata.ADAPTER.encodeWithTag(protoWriter, 1, updateDefaultShippingAddressResponse.metadata);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, updateDefaultShippingAddressResponse.response_context);
        protoWriter.writeBytes(updateDefaultShippingAddressResponse.unknownFields());
    }
}
