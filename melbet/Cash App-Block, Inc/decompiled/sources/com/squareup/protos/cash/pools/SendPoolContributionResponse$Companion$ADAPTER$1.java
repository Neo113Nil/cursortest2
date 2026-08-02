package com.squareup.protos.cash.pools;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SendPoolContributionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SendPoolContributionResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SendPoolContributionResponse sendPoolContributionResponse = (SendPoolContributionResponse) obj;
        reverseProtoWriter.getClass();
        sendPoolContributionResponse.getClass();
        reverseProtoWriter.writeBytes(sendPoolContributionResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, sendPoolContributionResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SendPoolContributionResponse sendPoolContributionResponse = (SendPoolContributionResponse) obj;
        sendPoolContributionResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, sendPoolContributionResponse.response_context) + sendPoolContributionResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SendPoolContributionResponse sendPoolContributionResponse = (SendPoolContributionResponse) obj;
        sendPoolContributionResponse.getClass();
        ResponseContext responseContext = sendPoolContributionResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SendPoolContributionResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SendPoolContributionResponse sendPoolContributionResponse = (SendPoolContributionResponse) obj;
        sendPoolContributionResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, sendPoolContributionResponse.response_context);
        protoWriter.writeBytes(sendPoolContributionResponse.unknownFields());
    }
}
