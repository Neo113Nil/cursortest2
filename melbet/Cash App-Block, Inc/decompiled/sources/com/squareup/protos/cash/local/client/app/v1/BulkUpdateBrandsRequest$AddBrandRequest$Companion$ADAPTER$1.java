package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.app.v1.BulkUpdateBrandsRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BulkUpdateBrandsRequest$AddBrandRequest$Companion$ADAPTER$1 extends ProtoAdapter {
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
            return new BulkUpdateBrandsRequest.AddBrandRequest(str, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "brand_token");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BulkUpdateBrandsRequest.AddBrandRequest addBrandRequest = (BulkUpdateBrandsRequest.AddBrandRequest) obj;
        reverseProtoWriter.getClass();
        addBrandRequest.getClass();
        reverseProtoWriter.writeBytes(addBrandRequest.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, addBrandRequest.brand_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BulkUpdateBrandsRequest.AddBrandRequest addBrandRequest = (BulkUpdateBrandsRequest.AddBrandRequest) obj;
        addBrandRequest.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, addBrandRequest.brand_token) + addBrandRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BulkUpdateBrandsRequest.AddBrandRequest addBrandRequest = (BulkUpdateBrandsRequest.AddBrandRequest) obj;
        addBrandRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = addBrandRequest.brand_token;
        str.getClass();
        byteString.getClass();
        return new BulkUpdateBrandsRequest.AddBrandRequest(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BulkUpdateBrandsRequest.AddBrandRequest addBrandRequest = (BulkUpdateBrandsRequest.AddBrandRequest) obj;
        addBrandRequest.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, addBrandRequest.brand_token);
        protoWriter.writeBytes(addBrandRequest.unknownFields());
    }
}
