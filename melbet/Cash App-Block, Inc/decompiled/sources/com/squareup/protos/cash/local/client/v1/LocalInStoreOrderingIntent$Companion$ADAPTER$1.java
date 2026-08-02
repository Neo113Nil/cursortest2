package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalInStoreOrderingIntent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalInStoreOrderingIntent((String) obj, (String) obj2, (LocalShoppingCart) obj3, (LocalCart) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalShoppingCart.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalCart.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalInStoreOrderingIntent localInStoreOrderingIntent = (LocalInStoreOrderingIntent) obj;
        reverseProtoWriter.getClass();
        localInStoreOrderingIntent.getClass();
        reverseProtoWriter.writeBytes(localInStoreOrderingIntent.unknownFields());
        LocalCart.ADAPTER.encodeWithTag(reverseProtoWriter, 4, localInStoreOrderingIntent.open_tab);
        LocalShoppingCart.ADAPTER.encodeWithTag(reverseProtoWriter, 3, localInStoreOrderingIntent.cart);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localInStoreOrderingIntent.ordering_station_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localInStoreOrderingIntent.location_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalInStoreOrderingIntent localInStoreOrderingIntent = (LocalInStoreOrderingIntent) obj;
        localInStoreOrderingIntent.getClass();
        int size$okio = localInStoreOrderingIntent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalCart.ADAPTER.encodedSizeWithTag(4, localInStoreOrderingIntent.open_tab) + LocalShoppingCart.ADAPTER.encodedSizeWithTag(3, localInStoreOrderingIntent.cart) + protoAdapter.encodedSizeWithTag(2, localInStoreOrderingIntent.ordering_station_token) + protoAdapter.encodedSizeWithTag(1, localInStoreOrderingIntent.location_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalInStoreOrderingIntent localInStoreOrderingIntent = (LocalInStoreOrderingIntent) obj;
        localInStoreOrderingIntent.getClass();
        LocalShoppingCart localShoppingCart = localInStoreOrderingIntent.cart;
        LocalShoppingCart localShoppingCart2 = localShoppingCart != null ? (LocalShoppingCart) LocalShoppingCart.ADAPTER.redact(localShoppingCart) : null;
        LocalCart localCart = localInStoreOrderingIntent.open_tab;
        LocalCart localCart2 = localCart != null ? (LocalCart) LocalCart.ADAPTER.redact(localCart) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localInStoreOrderingIntent.location_token;
        String str2 = localInStoreOrderingIntent.ordering_station_token;
        byteString.getClass();
        return new LocalInStoreOrderingIntent(str, str2, localShoppingCart2, localCart2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalInStoreOrderingIntent localInStoreOrderingIntent = (LocalInStoreOrderingIntent) obj;
        localInStoreOrderingIntent.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localInStoreOrderingIntent.location_token);
        protoAdapter.encodeWithTag(protoWriter, 2, localInStoreOrderingIntent.ordering_station_token);
        LocalShoppingCart.ADAPTER.encodeWithTag(protoWriter, 3, localInStoreOrderingIntent.cart);
        LocalCart.ADAPTER.encodeWithTag(protoWriter, 4, localInStoreOrderingIntent.open_tab);
        protoWriter.writeBytes(localInStoreOrderingIntent.unknownFields());
    }
}
