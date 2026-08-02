package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateOrderResponse$Success$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateOrderResponse.Success((LocalOrder) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalOrder.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateOrderResponse.Success success = (CreateOrderResponse.Success) obj;
        reverseProtoWriter.getClass();
        success.getClass();
        reverseProtoWriter.writeBytes(success.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, success.account_creation_intent_token);
        LocalOrder.ADAPTER.encodeWithTag(reverseProtoWriter, 1, success.order);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateOrderResponse.Success success = (CreateOrderResponse.Success) obj;
        success.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, success.account_creation_intent_token) + LocalOrder.ADAPTER.encodedSizeWithTag(1, success.order) + success.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateOrderResponse.Success success = (CreateOrderResponse.Success) obj;
        success.getClass();
        LocalOrder localOrder = success.order;
        LocalOrder localOrder2 = localOrder != null ? (LocalOrder) LocalOrder.ADAPTER.redact(localOrder) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = success.account_creation_intent_token;
        byteString.getClass();
        return new CreateOrderResponse.Success(localOrder2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateOrderResponse.Success success = (CreateOrderResponse.Success) obj;
        success.getClass();
        LocalOrder.ADAPTER.encodeWithTag(protoWriter, 1, success.order);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, success.account_creation_intent_token);
        protoWriter.writeBytes(success.unknownFields());
    }
}
