package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.GetFulfillmentSchedulingQuoteRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetFulfillmentSchedulingQuoteRequest$FreeFormFulfillmentFilter$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetFulfillmentSchedulingQuoteRequest.FreeFormFulfillmentFilter((LocalFulfillmentType) obj, (LocalAddress) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = LocalFulfillmentType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalAddress.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetFulfillmentSchedulingQuoteRequest.FreeFormFulfillmentFilter freeFormFulfillmentFilter = (GetFulfillmentSchedulingQuoteRequest.FreeFormFulfillmentFilter) obj;
        reverseProtoWriter.getClass();
        freeFormFulfillmentFilter.getClass();
        reverseProtoWriter.writeBytes(freeFormFulfillmentFilter.unknownFields());
        LocalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 2, freeFormFulfillmentFilter.delivery_address);
        LocalFulfillmentType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, freeFormFulfillmentFilter.fulfillment_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetFulfillmentSchedulingQuoteRequest.FreeFormFulfillmentFilter freeFormFulfillmentFilter = (GetFulfillmentSchedulingQuoteRequest.FreeFormFulfillmentFilter) obj;
        freeFormFulfillmentFilter.getClass();
        return LocalAddress.ADAPTER.encodedSizeWithTag(2, freeFormFulfillmentFilter.delivery_address) + LocalFulfillmentType.ADAPTER.encodedSizeWithTag(1, freeFormFulfillmentFilter.fulfillment_type) + freeFormFulfillmentFilter.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetFulfillmentSchedulingQuoteRequest.FreeFormFulfillmentFilter freeFormFulfillmentFilter = (GetFulfillmentSchedulingQuoteRequest.FreeFormFulfillmentFilter) obj;
        freeFormFulfillmentFilter.getClass();
        LocalAddress localAddress = freeFormFulfillmentFilter.delivery_address;
        LocalAddress localAddress2 = localAddress != null ? (LocalAddress) LocalAddress.ADAPTER.redact(localAddress) : null;
        ByteString byteString = ByteString.EMPTY;
        LocalFulfillmentType localFulfillmentType = freeFormFulfillmentFilter.fulfillment_type;
        byteString.getClass();
        return new GetFulfillmentSchedulingQuoteRequest.FreeFormFulfillmentFilter(localFulfillmentType, localAddress2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetFulfillmentSchedulingQuoteRequest.FreeFormFulfillmentFilter freeFormFulfillmentFilter = (GetFulfillmentSchedulingQuoteRequest.FreeFormFulfillmentFilter) obj;
        freeFormFulfillmentFilter.getClass();
        LocalFulfillmentType.ADAPTER.encodeWithTag(protoWriter, 1, freeFormFulfillmentFilter.fulfillment_type);
        LocalAddress.ADAPTER.encodeWithTag(protoWriter, 2, freeFormFulfillmentFilter.delivery_address);
        protoWriter.writeBytes(freeFormFulfillmentFilter.unknownFields());
    }
}
