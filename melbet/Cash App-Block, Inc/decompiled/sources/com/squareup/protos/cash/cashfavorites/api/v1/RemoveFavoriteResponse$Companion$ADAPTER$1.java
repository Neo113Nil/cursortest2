package com.squareup.protos.cash.cashfavorites.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RemoveFavoriteResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RemoveFavoriteResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        RemoveFavoriteResponse removeFavoriteResponse = (RemoveFavoriteResponse) obj;
        reverseProtoWriter.getClass();
        removeFavoriteResponse.getClass();
        reverseProtoWriter.writeBytes(removeFavoriteResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, removeFavoriteResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RemoveFavoriteResponse removeFavoriteResponse = (RemoveFavoriteResponse) obj;
        removeFavoriteResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, removeFavoriteResponse.response_context) + removeFavoriteResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RemoveFavoriteResponse removeFavoriteResponse = (RemoveFavoriteResponse) obj;
        removeFavoriteResponse.getClass();
        ResponseContext responseContext = removeFavoriteResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RemoveFavoriteResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RemoveFavoriteResponse removeFavoriteResponse = (RemoveFavoriteResponse) obj;
        removeFavoriteResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, removeFavoriteResponse.response_context);
        protoWriter.writeBytes(removeFavoriteResponse.unknownFields());
    }
}
