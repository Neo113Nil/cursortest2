package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.app.v1.BulkUpdateBrandsRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BulkUpdateBrandsRequest$RemoveBrandRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        String str = (String) obj;
        if (str != null) {
            return new BulkUpdateBrandsRequest.RemoveBrandRequest(str, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "brand_token");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BulkUpdateBrandsRequest.RemoveBrandRequest removeBrandRequest = (BulkUpdateBrandsRequest.RemoveBrandRequest) obj;
        reverseProtoWriter.getClass();
        removeBrandRequest.getClass();
        reverseProtoWriter.writeBytes(removeBrandRequest.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, removeBrandRequest.brand_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BulkUpdateBrandsRequest.RemoveBrandRequest removeBrandRequest = (BulkUpdateBrandsRequest.RemoveBrandRequest) obj;
        removeBrandRequest.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, removeBrandRequest.brand_token) + removeBrandRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BulkUpdateBrandsRequest.RemoveBrandRequest removeBrandRequest = (BulkUpdateBrandsRequest.RemoveBrandRequest) obj;
        removeBrandRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = removeBrandRequest.brand_token;
        str.getClass();
        byteString.getClass();
        return new BulkUpdateBrandsRequest.RemoveBrandRequest(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BulkUpdateBrandsRequest.RemoveBrandRequest removeBrandRequest = (BulkUpdateBrandsRequest.RemoveBrandRequest) obj;
        removeBrandRequest.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, removeBrandRequest.brand_token);
        protoWriter.writeBytes(removeBrandRequest.unknownFields());
    }
}
