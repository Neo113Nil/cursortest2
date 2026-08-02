package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateOrderResponse$InputsNotFulfilled$InputError$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateOrderResponse.InputsNotFulfilled.InputError((String) obj, (LocalErrorResponse.Error) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalErrorResponse.Error.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateOrderResponse.InputsNotFulfilled.InputError inputError = (CreateOrderResponse.InputsNotFulfilled.InputError) obj;
        reverseProtoWriter.getClass();
        inputError.getClass();
        reverseProtoWriter.writeBytes(inputError.unknownFields());
        LocalErrorResponse.Error.ADAPTER.encodeWithTag(reverseProtoWriter, 2, inputError.error);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, inputError.input_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateOrderResponse.InputsNotFulfilled.InputError inputError = (CreateOrderResponse.InputsNotFulfilled.InputError) obj;
        inputError.getClass();
        return LocalErrorResponse.Error.ADAPTER.encodedSizeWithTag(2, inputError.error) + ProtoAdapter.STRING.encodedSizeWithTag(1, inputError.input_id) + inputError.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateOrderResponse.InputsNotFulfilled.InputError inputError = (CreateOrderResponse.InputsNotFulfilled.InputError) obj;
        inputError.getClass();
        LocalErrorResponse.Error error = inputError.error;
        LocalErrorResponse.Error error2 = error != null ? (LocalErrorResponse.Error) LocalErrorResponse.Error.ADAPTER.redact(error) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = inputError.input_id;
        byteString.getClass();
        return new CreateOrderResponse.InputsNotFulfilled.InputError(str, error2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateOrderResponse.InputsNotFulfilled.InputError inputError = (CreateOrderResponse.InputsNotFulfilled.InputError) obj;
        inputError.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, inputError.input_id);
        LocalErrorResponse.Error.ADAPTER.encodeWithTag(protoWriter, 2, inputError.error);
        protoWriter.writeBytes(inputError.unknownFields());
    }
}
