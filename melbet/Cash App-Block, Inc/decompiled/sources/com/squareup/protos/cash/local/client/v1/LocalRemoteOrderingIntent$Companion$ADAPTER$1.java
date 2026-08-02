package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalRemoteOrderingIntent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalRemoteOrderingIntent((String) obj, (LocalFulfillment) obj2, (LocalShoppingCart) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalFulfillment.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalShoppingCart.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalRemoteOrderingIntent localRemoteOrderingIntent = (LocalRemoteOrderingIntent) obj;
        reverseProtoWriter.getClass();
        localRemoteOrderingIntent.getClass();
        reverseProtoWriter.writeBytes(localRemoteOrderingIntent.unknownFields());
        LocalShoppingCart.ADAPTER.encodeWithTag(reverseProtoWriter, 3, localRemoteOrderingIntent.cart);
        LocalFulfillment.ADAPTER.encodeWithTag(reverseProtoWriter, 2, localRemoteOrderingIntent.fulfillment);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, localRemoteOrderingIntent.location_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalRemoteOrderingIntent localRemoteOrderingIntent = (LocalRemoteOrderingIntent) obj;
        localRemoteOrderingIntent.getClass();
        return LocalShoppingCart.ADAPTER.encodedSizeWithTag(3, localRemoteOrderingIntent.cart) + LocalFulfillment.ADAPTER.encodedSizeWithTag(2, localRemoteOrderingIntent.fulfillment) + ProtoAdapter.STRING.encodedSizeWithTag(1, localRemoteOrderingIntent.location_token) + localRemoteOrderingIntent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalRemoteOrderingIntent localRemoteOrderingIntent = (LocalRemoteOrderingIntent) obj;
        localRemoteOrderingIntent.getClass();
        LocalFulfillment localFulfillment = localRemoteOrderingIntent.fulfillment;
        LocalFulfillment localFulfillment2 = localFulfillment != null ? (LocalFulfillment) LocalFulfillment.ADAPTER.redact(localFulfillment) : null;
        LocalShoppingCart localShoppingCart = localRemoteOrderingIntent.cart;
        LocalShoppingCart localShoppingCart2 = localShoppingCart != null ? (LocalShoppingCart) LocalShoppingCart.ADAPTER.redact(localShoppingCart) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localRemoteOrderingIntent.location_token;
        byteString.getClass();
        return new LocalRemoteOrderingIntent(str, localFulfillment2, localShoppingCart2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalRemoteOrderingIntent localRemoteOrderingIntent = (LocalRemoteOrderingIntent) obj;
        localRemoteOrderingIntent.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, localRemoteOrderingIntent.location_token);
        LocalFulfillment.ADAPTER.encodeWithTag(protoWriter, 2, localRemoteOrderingIntent.fulfillment);
        LocalShoppingCart.ADAPTER.encodeWithTag(protoWriter, 3, localRemoteOrderingIntent.cart);
        protoWriter.writeBytes(localRemoteOrderingIntent.unknownFields());
    }
}
