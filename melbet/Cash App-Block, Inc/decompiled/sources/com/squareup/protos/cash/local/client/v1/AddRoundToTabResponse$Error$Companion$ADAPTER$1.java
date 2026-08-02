package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.AddRoundToTabResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AddRoundToTabResponse$Error$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AddRoundToTabResponse.Error((CreateCartResponse) obj2, (LocalErrorResponse) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalErrorResponse.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(CreateCartResponse.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AddRoundToTabResponse.Error error = (AddRoundToTabResponse.Error) obj;
        reverseProtoWriter.getClass();
        error.getClass();
        reverseProtoWriter.writeBytes(error.unknownFields());
        CreateCartResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, error.current_cart);
        LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 1, error.error_response);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AddRoundToTabResponse.Error error = (AddRoundToTabResponse.Error) obj;
        error.getClass();
        return CreateCartResponse.ADAPTER.encodedSizeWithTag(2, error.current_cart) + LocalErrorResponse.ADAPTER.encodedSizeWithTag(1, error.error_response) + error.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AddRoundToTabResponse.Error error = (AddRoundToTabResponse.Error) obj;
        error.getClass();
        LocalErrorResponse localErrorResponse = error.error_response;
        LocalErrorResponse localErrorResponse2 = localErrorResponse != null ? (LocalErrorResponse) LocalErrorResponse.ADAPTER.redact(localErrorResponse) : null;
        CreateCartResponse createCartResponse = error.current_cart;
        CreateCartResponse createCartResponse2 = createCartResponse != null ? (CreateCartResponse) CreateCartResponse.ADAPTER.redact(createCartResponse) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AddRoundToTabResponse.Error(createCartResponse2, localErrorResponse2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AddRoundToTabResponse.Error error = (AddRoundToTabResponse.Error) obj;
        error.getClass();
        LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 1, error.error_response);
        CreateCartResponse.ADAPTER.encodeWithTag(protoWriter, 2, error.current_cart);
        protoWriter.writeBytes(error.unknownFields());
    }
}
