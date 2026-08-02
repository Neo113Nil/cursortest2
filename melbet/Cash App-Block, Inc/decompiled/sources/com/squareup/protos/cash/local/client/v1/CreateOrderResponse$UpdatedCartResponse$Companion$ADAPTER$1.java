package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateOrderResponse$UpdatedCartResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateOrderResponse.UpdatedCartResponse((CreateCartResponse) obj, (LocalErrorResponse) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CreateCartResponse.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalErrorResponse.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateOrderResponse.UpdatedCartResponse updatedCartResponse = (CreateOrderResponse.UpdatedCartResponse) obj;
        reverseProtoWriter.getClass();
        updatedCartResponse.getClass();
        reverseProtoWriter.writeBytes(updatedCartResponse.unknownFields());
        LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, updatedCartResponse.error_responses);
        CreateCartResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updatedCartResponse.cart_response);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateOrderResponse.UpdatedCartResponse updatedCartResponse = (CreateOrderResponse.UpdatedCartResponse) obj;
        updatedCartResponse.getClass();
        return LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, updatedCartResponse.error_responses) + CreateCartResponse.ADAPTER.encodedSizeWithTag(1, updatedCartResponse.cart_response) + updatedCartResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateOrderResponse.UpdatedCartResponse updatedCartResponse = (CreateOrderResponse.UpdatedCartResponse) obj;
        updatedCartResponse.getClass();
        CreateCartResponse createCartResponse = updatedCartResponse.cart_response;
        CreateCartResponse createCartResponse2 = createCartResponse != null ? (CreateCartResponse) CreateCartResponse.ADAPTER.redact(createCartResponse) : null;
        LocalErrorResponse localErrorResponse = updatedCartResponse.error_responses;
        LocalErrorResponse localErrorResponse2 = localErrorResponse != null ? (LocalErrorResponse) LocalErrorResponse.ADAPTER.redact(localErrorResponse) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CreateOrderResponse.UpdatedCartResponse(createCartResponse2, localErrorResponse2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateOrderResponse.UpdatedCartResponse updatedCartResponse = (CreateOrderResponse.UpdatedCartResponse) obj;
        updatedCartResponse.getClass();
        CreateCartResponse.ADAPTER.encodeWithTag(protoWriter, 1, updatedCartResponse.cart_response);
        LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, updatedCartResponse.error_responses);
        protoWriter.writeBytes(updatedCartResponse.unknownFields());
    }
}
