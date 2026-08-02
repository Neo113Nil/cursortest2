package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateOrderResponse$OpenTab$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateOrderResponse.OpenTab((LocalCart) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalCart.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateOrderResponse.OpenTab openTab = (CreateOrderResponse.OpenTab) obj;
        reverseProtoWriter.getClass();
        openTab.getClass();
        reverseProtoWriter.writeBytes(openTab.unknownFields());
        LocalCart.ADAPTER.encodeWithTag(reverseProtoWriter, 1, openTab.active_cart);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateOrderResponse.OpenTab openTab = (CreateOrderResponse.OpenTab) obj;
        openTab.getClass();
        return LocalCart.ADAPTER.encodedSizeWithTag(1, openTab.active_cart) + openTab.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateOrderResponse.OpenTab openTab = (CreateOrderResponse.OpenTab) obj;
        openTab.getClass();
        LocalCart localCart = openTab.active_cart;
        LocalCart localCart2 = localCart != null ? (LocalCart) LocalCart.ADAPTER.redact(localCart) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CreateOrderResponse.OpenTab(localCart2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateOrderResponse.OpenTab openTab = (CreateOrderResponse.OpenTab) obj;
        openTab.getClass();
        LocalCart.ADAPTER.encodeWithTag(protoWriter, 1, openTab.active_cart);
        protoWriter.writeBytes(openTab.unknownFields());
    }
}
