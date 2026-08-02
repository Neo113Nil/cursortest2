package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.app.v1.BulkAddBrandsRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BulkAddBrandsRequest$AddBrandRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        String str = (String) obj;
        if (str != null) {
            return new BulkAddBrandsRequest.AddBrandRequest(str, (String) obj2, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "brand_token");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BulkAddBrandsRequest.AddBrandRequest addBrandRequest = (BulkAddBrandsRequest.AddBrandRequest) obj;
        reverseProtoWriter.getClass();
        addBrandRequest.getClass();
        reverseProtoWriter.writeBytes(addBrandRequest.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, addBrandRequest.location_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, addBrandRequest.brand_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BulkAddBrandsRequest.AddBrandRequest addBrandRequest = (BulkAddBrandsRequest.AddBrandRequest) obj;
        addBrandRequest.getClass();
        int size$okio = addBrandRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, addBrandRequest.location_token) + protoAdapter.encodedSizeWithTag(1, addBrandRequest.brand_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BulkAddBrandsRequest.AddBrandRequest addBrandRequest = (BulkAddBrandsRequest.AddBrandRequest) obj;
        addBrandRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = addBrandRequest.brand_token;
        String str2 = addBrandRequest.location_token;
        str.getClass();
        byteString.getClass();
        return new BulkAddBrandsRequest.AddBrandRequest(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BulkAddBrandsRequest.AddBrandRequest addBrandRequest = (BulkAddBrandsRequest.AddBrandRequest) obj;
        addBrandRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, addBrandRequest.brand_token);
        protoAdapter.encodeWithTag(protoWriter, 2, addBrandRequest.location_token);
        protoWriter.writeBytes(addBrandRequest.unknownFields());
    }
}
