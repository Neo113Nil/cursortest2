package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.AddRoundToTabResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AddRoundToTabResponse$Success$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AddRoundToTabResponse.Success((CreateCartResponse) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CreateCartResponse.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AddRoundToTabResponse.Success success = (AddRoundToTabResponse.Success) obj;
        reverseProtoWriter.getClass();
        success.getClass();
        reverseProtoWriter.writeBytes(success.unknownFields());
        CreateCartResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 1, success.updated_cart);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AddRoundToTabResponse.Success success = (AddRoundToTabResponse.Success) obj;
        success.getClass();
        return CreateCartResponse.ADAPTER.encodedSizeWithTag(1, success.updated_cart) + success.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AddRoundToTabResponse.Success success = (AddRoundToTabResponse.Success) obj;
        success.getClass();
        CreateCartResponse createCartResponse = success.updated_cart;
        CreateCartResponse createCartResponse2 = createCartResponse != null ? (CreateCartResponse) CreateCartResponse.ADAPTER.redact(createCartResponse) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AddRoundToTabResponse.Success(createCartResponse2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AddRoundToTabResponse.Success success = (AddRoundToTabResponse.Success) obj;
        success.getClass();
        CreateCartResponse.ADAPTER.encodeWithTag(protoWriter, 1, success.updated_cart);
        protoWriter.writeBytes(success.unknownFields());
    }
}
