package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BulkRemoveBrandsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BulkRemoveBrandsResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BulkRemoveBrandsResponse bulkRemoveBrandsResponse = (BulkRemoveBrandsResponse) obj;
        reverseProtoWriter.getClass();
        bulkRemoveBrandsResponse.getClass();
        reverseProtoWriter.writeBytes(bulkRemoveBrandsResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bulkRemoveBrandsResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BulkRemoveBrandsResponse bulkRemoveBrandsResponse = (BulkRemoveBrandsResponse) obj;
        bulkRemoveBrandsResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, bulkRemoveBrandsResponse.response_context) + bulkRemoveBrandsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BulkRemoveBrandsResponse bulkRemoveBrandsResponse = (BulkRemoveBrandsResponse) obj;
        bulkRemoveBrandsResponse.getClass();
        ResponseContext responseContext = bulkRemoveBrandsResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BulkRemoveBrandsResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BulkRemoveBrandsResponse bulkRemoveBrandsResponse = (BulkRemoveBrandsResponse) obj;
        bulkRemoveBrandsResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, bulkRemoveBrandsResponse.response_context);
        protoWriter.writeBytes(bulkRemoveBrandsResponse.unknownFields());
    }
}
