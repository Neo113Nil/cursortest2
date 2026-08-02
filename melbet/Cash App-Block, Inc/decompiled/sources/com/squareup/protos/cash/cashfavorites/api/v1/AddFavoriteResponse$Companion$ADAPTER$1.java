package com.squareup.protos.cash.cashfavorites.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class AddFavoriteResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AddFavoriteResponse((ResponseContext) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AddFavoriteResponse addFavoriteResponse = (AddFavoriteResponse) obj;
        reverseProtoWriter.getClass();
        addFavoriteResponse.getClass();
        reverseProtoWriter.writeBytes(addFavoriteResponse.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, addFavoriteResponse.is_first_time_customer_favorite);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, addFavoriteResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AddFavoriteResponse addFavoriteResponse = (AddFavoriteResponse) obj;
        addFavoriteResponse.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, addFavoriteResponse.is_first_time_customer_favorite) + ResponseContext.ADAPTER.encodedSizeWithTag(1, addFavoriteResponse.response_context) + addFavoriteResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AddFavoriteResponse addFavoriteResponse = (AddFavoriteResponse) obj;
        addFavoriteResponse.getClass();
        ResponseContext responseContext = addFavoriteResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = addFavoriteResponse.is_first_time_customer_favorite;
        byteString.getClass();
        return new AddFavoriteResponse(responseContext2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AddFavoriteResponse addFavoriteResponse = (AddFavoriteResponse) obj;
        addFavoriteResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, addFavoriteResponse.response_context);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, addFavoriteResponse.is_first_time_customer_favorite);
        protoWriter.writeBytes(addFavoriteResponse.unknownFields());
    }
}
