package com.squareup.protos.cash.lynx.api.v1_0;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CompleteStripeLinkResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CompleteStripeLinkResponse((ResponseContext) obj2, (String) obj, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CompleteStripeLinkResponse completeStripeLinkResponse = (CompleteStripeLinkResponse) obj;
        reverseProtoWriter.getClass();
        completeStripeLinkResponse.getClass();
        reverseProtoWriter.writeBytes(completeStripeLinkResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, completeStripeLinkResponse.instrument_token);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, completeStripeLinkResponse.response_context);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, completeStripeLinkResponse.instrument_link_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CompleteStripeLinkResponse completeStripeLinkResponse = (CompleteStripeLinkResponse) obj;
        completeStripeLinkResponse.getClass();
        int size$okio = completeStripeLinkResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, completeStripeLinkResponse.instrument_token) + ResponseContext.ADAPTER.encodedSizeWithTag(3, completeStripeLinkResponse.response_context) + protoAdapter.encodedSizeWithTag(2, completeStripeLinkResponse.instrument_link_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CompleteStripeLinkResponse completeStripeLinkResponse = (CompleteStripeLinkResponse) obj;
        completeStripeLinkResponse.getClass();
        ResponseContext responseContext = completeStripeLinkResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = completeStripeLinkResponse.instrument_link_token;
        String str2 = completeStripeLinkResponse.instrument_token;
        byteString.getClass();
        return new CompleteStripeLinkResponse(responseContext2, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CompleteStripeLinkResponse completeStripeLinkResponse = (CompleteStripeLinkResponse) obj;
        completeStripeLinkResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, completeStripeLinkResponse.instrument_link_token);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 3, completeStripeLinkResponse.response_context);
        protoAdapter.encodeWithTag(protoWriter, 4, completeStripeLinkResponse.instrument_token);
        protoWriter.writeBytes(completeStripeLinkResponse.unknownFields());
    }
}
