package com.squareup.protos.timecards;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BatchGetTimecardBreakDefinitionRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BatchGetTimecardBreakDefinitionRequest((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BatchGetTimecardBreakDefinitionRequest batchGetTimecardBreakDefinitionRequest = (BatchGetTimecardBreakDefinitionRequest) obj;
        reverseProtoWriter.getClass();
        batchGetTimecardBreakDefinitionRequest.getClass();
        reverseProtoWriter.writeBytes(batchGetTimecardBreakDefinitionRequest.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, batchGetTimecardBreakDefinitionRequest.unit_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, batchGetTimecardBreakDefinitionRequest.merchant_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BatchGetTimecardBreakDefinitionRequest batchGetTimecardBreakDefinitionRequest = (BatchGetTimecardBreakDefinitionRequest) obj;
        batchGetTimecardBreakDefinitionRequest.getClass();
        int size$okio = batchGetTimecardBreakDefinitionRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, batchGetTimecardBreakDefinitionRequest.unit_token) + protoAdapter.encodedSizeWithTag(1, batchGetTimecardBreakDefinitionRequest.merchant_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BatchGetTimecardBreakDefinitionRequest batchGetTimecardBreakDefinitionRequest = (BatchGetTimecardBreakDefinitionRequest) obj;
        batchGetTimecardBreakDefinitionRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = batchGetTimecardBreakDefinitionRequest.merchant_token;
        String str2 = batchGetTimecardBreakDefinitionRequest.unit_token;
        byteString.getClass();
        return new BatchGetTimecardBreakDefinitionRequest(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BatchGetTimecardBreakDefinitionRequest batchGetTimecardBreakDefinitionRequest = (BatchGetTimecardBreakDefinitionRequest) obj;
        batchGetTimecardBreakDefinitionRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, batchGetTimecardBreakDefinitionRequest.merchant_token);
        protoAdapter.encodeWithTag(protoWriter, 2, batchGetTimecardBreakDefinitionRequest.unit_token);
        protoWriter.writeBytes(batchGetTimecardBreakDefinitionRequest.unknownFields());
    }
}
