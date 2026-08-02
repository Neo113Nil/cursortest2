package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateOrderResponse$InputsNotFulfilled$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateOrderResponse.InputsNotFulfilled((CreateCartResponse) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CreateCartResponse.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(CreateOrderResponse.InputsNotFulfilled.InputError.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateOrderResponse.InputsNotFulfilled inputsNotFulfilled = (CreateOrderResponse.InputsNotFulfilled) obj;
        reverseProtoWriter.getClass();
        inputsNotFulfilled.getClass();
        reverseProtoWriter.writeBytes(inputsNotFulfilled.unknownFields());
        CreateOrderResponse.InputsNotFulfilled.InputError.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, inputsNotFulfilled.input_errors);
        CreateCartResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 1, inputsNotFulfilled.cart_response);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateOrderResponse.InputsNotFulfilled inputsNotFulfilled = (CreateOrderResponse.InputsNotFulfilled) obj;
        inputsNotFulfilled.getClass();
        return CreateOrderResponse.InputsNotFulfilled.InputError.ADAPTER.asRepeated().encodedSizeWithTag(2, inputsNotFulfilled.input_errors) + CreateCartResponse.ADAPTER.encodedSizeWithTag(1, inputsNotFulfilled.cart_response) + inputsNotFulfilled.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateOrderResponse.InputsNotFulfilled inputsNotFulfilled = (CreateOrderResponse.InputsNotFulfilled) obj;
        inputsNotFulfilled.getClass();
        CreateCartResponse createCartResponse = inputsNotFulfilled.cart_response;
        CreateCartResponse createCartResponse2 = createCartResponse != null ? (CreateCartResponse) CreateCartResponse.ADAPTER.redact(createCartResponse) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(inputsNotFulfilled.input_errors, CreateOrderResponse.InputsNotFulfilled.InputError.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CreateOrderResponse.InputsNotFulfilled(createCartResponse2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateOrderResponse.InputsNotFulfilled inputsNotFulfilled = (CreateOrderResponse.InputsNotFulfilled) obj;
        inputsNotFulfilled.getClass();
        CreateCartResponse.ADAPTER.encodeWithTag(protoWriter, 1, inputsNotFulfilled.cart_response);
        CreateOrderResponse.InputsNotFulfilled.InputError.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, inputsNotFulfilled.input_errors);
        protoWriter.writeBytes(inputsNotFulfilled.unknownFields());
    }
}
