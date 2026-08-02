package com.squareup.protos.cash.aegis.api;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SelectAllowlistCustomersResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SelectAllowlistCustomersResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SelectAllowlistCustomersResponse selectAllowlistCustomersResponse = (SelectAllowlistCustomersResponse) obj;
        reverseProtoWriter.getClass();
        selectAllowlistCustomersResponse.getClass();
        reverseProtoWriter.writeBytes(selectAllowlistCustomersResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, selectAllowlistCustomersResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SelectAllowlistCustomersResponse selectAllowlistCustomersResponse = (SelectAllowlistCustomersResponse) obj;
        selectAllowlistCustomersResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, selectAllowlistCustomersResponse.response_context) + selectAllowlistCustomersResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SelectAllowlistCustomersResponse selectAllowlistCustomersResponse = (SelectAllowlistCustomersResponse) obj;
        selectAllowlistCustomersResponse.getClass();
        ResponseContext responseContext = selectAllowlistCustomersResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SelectAllowlistCustomersResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SelectAllowlistCustomersResponse selectAllowlistCustomersResponse = (SelectAllowlistCustomersResponse) obj;
        selectAllowlistCustomersResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, selectAllowlistCustomersResponse.response_context);
        protoWriter.writeBytes(selectAllowlistCustomersResponse.unknownFields());
    }
}
