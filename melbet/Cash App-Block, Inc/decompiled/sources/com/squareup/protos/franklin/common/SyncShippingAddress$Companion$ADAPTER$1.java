package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncShippingAddress$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncShippingAddress((ShippingAddress) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ShippingAddress.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncShippingAddress syncShippingAddress = (SyncShippingAddress) obj;
        reverseProtoWriter.getClass();
        syncShippingAddress.getClass();
        reverseProtoWriter.writeBytes(syncShippingAddress.unknownFields());
        ShippingAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncShippingAddress.shipping_address);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncShippingAddress syncShippingAddress = (SyncShippingAddress) obj;
        syncShippingAddress.getClass();
        return ShippingAddress.ADAPTER.encodedSizeWithTag(1, syncShippingAddress.shipping_address) + syncShippingAddress.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncShippingAddress syncShippingAddress = (SyncShippingAddress) obj;
        syncShippingAddress.getClass();
        ShippingAddress shippingAddress = syncShippingAddress.shipping_address;
        ShippingAddress shippingAddress2 = shippingAddress != null ? (ShippingAddress) ShippingAddress.ADAPTER.redact(shippingAddress) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SyncShippingAddress(shippingAddress2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncShippingAddress syncShippingAddress = (SyncShippingAddress) obj;
        syncShippingAddress.getClass();
        ShippingAddress.ADAPTER.encodeWithTag(protoWriter, 1, syncShippingAddress.shipping_address);
        protoWriter.writeBytes(syncShippingAddress.unknownFields());
    }
}
