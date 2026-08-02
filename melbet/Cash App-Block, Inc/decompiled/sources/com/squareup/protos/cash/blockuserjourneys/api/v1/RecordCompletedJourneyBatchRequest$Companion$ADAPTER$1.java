package com.squareup.protos.cash.blockuserjourneys.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class RecordCompletedJourneyBatchRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecordCompletedJourneyBatchRequest(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(RecordCompletedJourneyRequest.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecordCompletedJourneyBatchRequest recordCompletedJourneyBatchRequest = (RecordCompletedJourneyBatchRequest) obj;
        reverseProtoWriter.getClass();
        recordCompletedJourneyBatchRequest.getClass();
        reverseProtoWriter.writeBytes(recordCompletedJourneyBatchRequest.unknownFields());
        RecordCompletedJourneyRequest.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, recordCompletedJourneyBatchRequest.requests);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecordCompletedJourneyBatchRequest recordCompletedJourneyBatchRequest = (RecordCompletedJourneyBatchRequest) obj;
        recordCompletedJourneyBatchRequest.getClass();
        return RecordCompletedJourneyRequest.ADAPTER.asRepeated().encodedSizeWithTag(1, recordCompletedJourneyBatchRequest.requests) + recordCompletedJourneyBatchRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecordCompletedJourneyBatchRequest recordCompletedJourneyBatchRequest = (RecordCompletedJourneyBatchRequest) obj;
        recordCompletedJourneyBatchRequest.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(recordCompletedJourneyBatchRequest.requests, RecordCompletedJourneyRequest.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RecordCompletedJourneyBatchRequest(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecordCompletedJourneyBatchRequest recordCompletedJourneyBatchRequest = (RecordCompletedJourneyBatchRequest) obj;
        recordCompletedJourneyBatchRequest.getClass();
        RecordCompletedJourneyRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, recordCompletedJourneyBatchRequest.requests);
        protoWriter.writeBytes(recordCompletedJourneyBatchRequest.unknownFields());
    }
}
