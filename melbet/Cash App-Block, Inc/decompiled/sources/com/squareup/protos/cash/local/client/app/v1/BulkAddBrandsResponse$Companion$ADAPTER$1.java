package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BulkAddBrandsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BulkAddBrandsResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        BulkAddBrandsResponse bulkAddBrandsResponse = (BulkAddBrandsResponse) obj;
        reverseProtoWriter.getClass();
        bulkAddBrandsResponse.getClass();
        reverseProtoWriter.writeBytes(bulkAddBrandsResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bulkAddBrandsResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BulkAddBrandsResponse bulkAddBrandsResponse = (BulkAddBrandsResponse) obj;
        bulkAddBrandsResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, bulkAddBrandsResponse.response_context) + bulkAddBrandsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BulkAddBrandsResponse bulkAddBrandsResponse = (BulkAddBrandsResponse) obj;
        bulkAddBrandsResponse.getClass();
        ResponseContext responseContext = bulkAddBrandsResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BulkAddBrandsResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BulkAddBrandsResponse bulkAddBrandsResponse = (BulkAddBrandsResponse) obj;
        bulkAddBrandsResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, bulkAddBrandsResponse.response_context);
        protoWriter.writeBytes(bulkAddBrandsResponse.unknownFields());
    }
}
