package com.squareup.protos.cash.discover.api.app.v2.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AiSearchResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AiSearchResponse((Summary) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Summary.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AiSearchResponse aiSearchResponse = (AiSearchResponse) obj;
        reverseProtoWriter.getClass();
        aiSearchResponse.getClass();
        reverseProtoWriter.writeBytes(aiSearchResponse.unknownFields());
        Summary.ADAPTER.encodeWithTag(reverseProtoWriter, 1, aiSearchResponse.summary);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AiSearchResponse aiSearchResponse = (AiSearchResponse) obj;
        aiSearchResponse.getClass();
        return Summary.ADAPTER.encodedSizeWithTag(1, aiSearchResponse.summary) + aiSearchResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AiSearchResponse aiSearchResponse = (AiSearchResponse) obj;
        aiSearchResponse.getClass();
        Summary summary = aiSearchResponse.summary;
        Summary summary2 = summary != null ? (Summary) Summary.ADAPTER.redact(summary) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AiSearchResponse(summary2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AiSearchResponse aiSearchResponse = (AiSearchResponse) obj;
        aiSearchResponse.getClass();
        Summary.ADAPTER.encodeWithTag(protoWriter, 1, aiSearchResponse.summary);
        protoWriter.writeBytes(aiSearchResponse.unknownFields());
    }
}
