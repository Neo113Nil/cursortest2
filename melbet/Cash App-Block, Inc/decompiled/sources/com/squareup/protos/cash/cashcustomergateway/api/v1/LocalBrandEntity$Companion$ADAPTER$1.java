package com.squareup.protos.cash.cashcustomergateway.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalBrandEntity$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalBrandEntity((com.squareup.protos.cash.local.client.v1.LocalBrand) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(com.squareup.protos.cash.local.client.v1.LocalBrand.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalBrandEntity localBrandEntity = (LocalBrandEntity) obj;
        reverseProtoWriter.getClass();
        localBrandEntity.getClass();
        reverseProtoWriter.writeBytes(localBrandEntity.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, localBrandEntity.customer_token);
        com.squareup.protos.cash.local.client.v1.LocalBrand.ADAPTER.encodeWithTag(reverseProtoWriter, 1, localBrandEntity.brand);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalBrandEntity localBrandEntity = (LocalBrandEntity) obj;
        localBrandEntity.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, localBrandEntity.customer_token) + com.squareup.protos.cash.local.client.v1.LocalBrand.ADAPTER.encodedSizeWithTag(1, localBrandEntity.brand) + localBrandEntity.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalBrandEntity localBrandEntity = (LocalBrandEntity) obj;
        localBrandEntity.getClass();
        com.squareup.protos.cash.local.client.v1.LocalBrand localBrand = localBrandEntity.brand;
        com.squareup.protos.cash.local.client.v1.LocalBrand localBrand2 = localBrand != null ? (com.squareup.protos.cash.local.client.v1.LocalBrand) com.squareup.protos.cash.local.client.v1.LocalBrand.ADAPTER.redact(localBrand) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localBrandEntity.customer_token;
        byteString.getClass();
        return new LocalBrandEntity(localBrand2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalBrandEntity localBrandEntity = (LocalBrandEntity) obj;
        localBrandEntity.getClass();
        com.squareup.protos.cash.local.client.v1.LocalBrand.ADAPTER.encodeWithTag(protoWriter, 1, localBrandEntity.brand);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, localBrandEntity.customer_token);
        protoWriter.writeBytes(localBrandEntity.unknownFields());
    }
}
