package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetBrandCollectionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBrandCollectionResponse((BrandCollection) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BrandCollection.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBrandCollectionResponse getBrandCollectionResponse = (GetBrandCollectionResponse) obj;
        reverseProtoWriter.getClass();
        getBrandCollectionResponse.getClass();
        reverseProtoWriter.writeBytes(getBrandCollectionResponse.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, getBrandCollectionResponse.expires_at);
        BrandCollection.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getBrandCollectionResponse.brand_collection);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBrandCollectionResponse getBrandCollectionResponse = (GetBrandCollectionResponse) obj;
        getBrandCollectionResponse.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, getBrandCollectionResponse.expires_at) + BrandCollection.ADAPTER.encodedSizeWithTag(1, getBrandCollectionResponse.brand_collection) + getBrandCollectionResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBrandCollectionResponse getBrandCollectionResponse = (GetBrandCollectionResponse) obj;
        getBrandCollectionResponse.getClass();
        BrandCollection brandCollection = getBrandCollectionResponse.brand_collection;
        BrandCollection brandCollection2 = brandCollection != null ? (BrandCollection) BrandCollection.ADAPTER.redact(brandCollection) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = getBrandCollectionResponse.expires_at;
        byteString.getClass();
        return new GetBrandCollectionResponse(brandCollection2, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBrandCollectionResponse getBrandCollectionResponse = (GetBrandCollectionResponse) obj;
        getBrandCollectionResponse.getClass();
        BrandCollection.ADAPTER.encodeWithTag(protoWriter, 1, getBrandCollectionResponse.brand_collection);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getBrandCollectionResponse.expires_at);
        protoWriter.writeBytes(getBrandCollectionResponse.unknownFields());
    }
}
