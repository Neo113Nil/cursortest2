package com.squareup.protos.cash.blockuserjourneys.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RecordCompletedJourneyResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecordCompletedJourneyResponse((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        RecordCompletedJourneyResponse recordCompletedJourneyResponse = (RecordCompletedJourneyResponse) obj;
        reverseProtoWriter.getClass();
        recordCompletedJourneyResponse.getClass();
        reverseProtoWriter.writeBytes(recordCompletedJourneyResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, recordCompletedJourneyResponse.message);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecordCompletedJourneyResponse recordCompletedJourneyResponse = (RecordCompletedJourneyResponse) obj;
        recordCompletedJourneyResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, recordCompletedJourneyResponse.message) + recordCompletedJourneyResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecordCompletedJourneyResponse recordCompletedJourneyResponse = (RecordCompletedJourneyResponse) obj;
        recordCompletedJourneyResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = recordCompletedJourneyResponse.message;
        byteString.getClass();
        return new RecordCompletedJourneyResponse(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecordCompletedJourneyResponse recordCompletedJourneyResponse = (RecordCompletedJourneyResponse) obj;
        recordCompletedJourneyResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recordCompletedJourneyResponse.message);
        protoWriter.writeBytes(recordCompletedJourneyResponse.unknownFields());
    }
}
