package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AddOrUpdateRewardResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AddOrUpdateRewardResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        AddOrUpdateRewardResponse addOrUpdateRewardResponse = (AddOrUpdateRewardResponse) obj;
        reverseProtoWriter.getClass();
        addOrUpdateRewardResponse.getClass();
        reverseProtoWriter.writeBytes(addOrUpdateRewardResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, addOrUpdateRewardResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AddOrUpdateRewardResponse addOrUpdateRewardResponse = (AddOrUpdateRewardResponse) obj;
        addOrUpdateRewardResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, addOrUpdateRewardResponse.response_context) + addOrUpdateRewardResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AddOrUpdateRewardResponse addOrUpdateRewardResponse = (AddOrUpdateRewardResponse) obj;
        addOrUpdateRewardResponse.getClass();
        ResponseContext responseContext = addOrUpdateRewardResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AddOrUpdateRewardResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AddOrUpdateRewardResponse addOrUpdateRewardResponse = (AddOrUpdateRewardResponse) obj;
        addOrUpdateRewardResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, addOrUpdateRewardResponse.response_context);
        protoWriter.writeBytes(addOrUpdateRewardResponse.unknownFields());
    }
}
