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
public final class CreateOrderResponse$ErrorResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateOrderResponse.ErrorResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CreateOrderResponse.ErrorResponse.Error.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateOrderResponse.ErrorResponse errorResponse = (CreateOrderResponse.ErrorResponse) obj;
        reverseProtoWriter.getClass();
        errorResponse.getClass();
        reverseProtoWriter.writeBytes(errorResponse.unknownFields());
        CreateOrderResponse.ErrorResponse.Error.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, errorResponse.errors);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateOrderResponse.ErrorResponse errorResponse = (CreateOrderResponse.ErrorResponse) obj;
        errorResponse.getClass();
        return CreateOrderResponse.ErrorResponse.Error.ADAPTER.asRepeated().encodedSizeWithTag(1, errorResponse.errors) + errorResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateOrderResponse.ErrorResponse errorResponse = (CreateOrderResponse.ErrorResponse) obj;
        errorResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(errorResponse.errors, CreateOrderResponse.ErrorResponse.Error.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CreateOrderResponse.ErrorResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateOrderResponse.ErrorResponse errorResponse = (CreateOrderResponse.ErrorResponse) obj;
        errorResponse.getClass();
        CreateOrderResponse.ErrorResponse.Error.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, errorResponse.errors);
        protoWriter.writeBytes(errorResponse.unknownFields());
    }
}
