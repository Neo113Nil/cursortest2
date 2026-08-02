package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateOrderResponse$ErrorResponse$Error$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateOrderResponse.ErrorResponse.Error((String) obj, (LocalErrorResponse.Error.Type) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = LocalErrorResponse.Error.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateOrderResponse.ErrorResponse.Error error = (CreateOrderResponse.ErrorResponse.Error) obj;
        reverseProtoWriter.getClass();
        error.getClass();
        reverseProtoWriter.writeBytes(error.unknownFields());
        LocalErrorResponse.Error.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 2, error.f1304type);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, error.message);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateOrderResponse.ErrorResponse.Error error = (CreateOrderResponse.ErrorResponse.Error) obj;
        error.getClass();
        return LocalErrorResponse.Error.Type.ADAPTER.encodedSizeWithTag(2, error.f1304type) + ProtoAdapter.STRING.encodedSizeWithTag(1, error.message) + error.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateOrderResponse.ErrorResponse.Error error = (CreateOrderResponse.ErrorResponse.Error) obj;
        error.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = error.message;
        LocalErrorResponse.Error.Type type2 = error.f1304type;
        byteString.getClass();
        return new CreateOrderResponse.ErrorResponse.Error(str, type2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateOrderResponse.ErrorResponse.Error error = (CreateOrderResponse.ErrorResponse.Error) obj;
        error.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, error.message);
        LocalErrorResponse.Error.Type.ADAPTER.encodeWithTag(protoWriter, 2, error.f1304type);
        protoWriter.writeBytes(error.unknownFields());
    }
}
