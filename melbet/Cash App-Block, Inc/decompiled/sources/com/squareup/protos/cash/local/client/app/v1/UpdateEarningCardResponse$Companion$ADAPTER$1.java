package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UpdateEarningCardResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateEarningCardResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        UpdateEarningCardResponse updateEarningCardResponse = (UpdateEarningCardResponse) obj;
        reverseProtoWriter.getClass();
        updateEarningCardResponse.getClass();
        reverseProtoWriter.writeBytes(updateEarningCardResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateEarningCardResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateEarningCardResponse updateEarningCardResponse = (UpdateEarningCardResponse) obj;
        updateEarningCardResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, updateEarningCardResponse.response_context) + updateEarningCardResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpdateEarningCardResponse updateEarningCardResponse = (UpdateEarningCardResponse) obj;
        updateEarningCardResponse.getClass();
        ResponseContext responseContext = updateEarningCardResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UpdateEarningCardResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateEarningCardResponse updateEarningCardResponse = (UpdateEarningCardResponse) obj;
        updateEarningCardResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, updateEarningCardResponse.response_context);
        protoWriter.writeBytes(updateEarningCardResponse.unknownFields());
    }
}
