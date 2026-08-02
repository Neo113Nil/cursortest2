package com.squareup.protos.cash.blockuserjourneys.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class RecordCompletedJourneyBatchResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecordCompletedJourneyBatchResponse((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecordCompletedJourneyBatchResponse recordCompletedJourneyBatchResponse = (RecordCompletedJourneyBatchResponse) obj;
        reverseProtoWriter.getClass();
        recordCompletedJourneyBatchResponse.getClass();
        reverseProtoWriter.writeBytes(recordCompletedJourneyBatchResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, recordCompletedJourneyBatchResponse.message);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecordCompletedJourneyBatchResponse recordCompletedJourneyBatchResponse = (RecordCompletedJourneyBatchResponse) obj;
        recordCompletedJourneyBatchResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, recordCompletedJourneyBatchResponse.message) + recordCompletedJourneyBatchResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecordCompletedJourneyBatchResponse recordCompletedJourneyBatchResponse = (RecordCompletedJourneyBatchResponse) obj;
        recordCompletedJourneyBatchResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = recordCompletedJourneyBatchResponse.message;
        byteString.getClass();
        return new RecordCompletedJourneyBatchResponse(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecordCompletedJourneyBatchResponse recordCompletedJourneyBatchResponse = (RecordCompletedJourneyBatchResponse) obj;
        recordCompletedJourneyBatchResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recordCompletedJourneyBatchResponse.message);
        protoWriter.writeBytes(recordCompletedJourneyBatchResponse.unknownFields());
    }
}
