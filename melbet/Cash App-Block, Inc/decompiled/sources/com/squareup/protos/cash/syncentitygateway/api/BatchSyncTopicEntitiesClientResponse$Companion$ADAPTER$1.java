package com.squareup.protos.cash.syncentitygateway.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BatchSyncTopicEntitiesClientResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BatchSyncTopicEntitiesClientResponse(m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(SyncTopicEntitiesClientResponse.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(SyncTopicEntitiesClientError.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BatchSyncTopicEntitiesClientResponse batchSyncTopicEntitiesClientResponse = (BatchSyncTopicEntitiesClientResponse) obj;
        reverseProtoWriter.getClass();
        batchSyncTopicEntitiesClientResponse.getClass();
        reverseProtoWriter.writeBytes(batchSyncTopicEntitiesClientResponse.unknownFields());
        SyncTopicEntitiesClientError.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, batchSyncTopicEntitiesClientResponse.failed_requests);
        SyncTopicEntitiesClientResponse.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, batchSyncTopicEntitiesClientResponse.successful_responses);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BatchSyncTopicEntitiesClientResponse batchSyncTopicEntitiesClientResponse = (BatchSyncTopicEntitiesClientResponse) obj;
        batchSyncTopicEntitiesClientResponse.getClass();
        return SyncTopicEntitiesClientError.ADAPTER.asRepeated().encodedSizeWithTag(2, batchSyncTopicEntitiesClientResponse.failed_requests) + SyncTopicEntitiesClientResponse.ADAPTER.asRepeated().encodedSizeWithTag(1, batchSyncTopicEntitiesClientResponse.successful_responses) + batchSyncTopicEntitiesClientResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BatchSyncTopicEntitiesClientResponse batchSyncTopicEntitiesClientResponse = (BatchSyncTopicEntitiesClientResponse) obj;
        batchSyncTopicEntitiesClientResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(batchSyncTopicEntitiesClientResponse.successful_responses, SyncTopicEntitiesClientResponse.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(batchSyncTopicEntitiesClientResponse.failed_requests, SyncTopicEntitiesClientError.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BatchSyncTopicEntitiesClientResponse(m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BatchSyncTopicEntitiesClientResponse batchSyncTopicEntitiesClientResponse = (BatchSyncTopicEntitiesClientResponse) obj;
        batchSyncTopicEntitiesClientResponse.getClass();
        SyncTopicEntitiesClientResponse.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchSyncTopicEntitiesClientResponse.successful_responses);
        SyncTopicEntitiesClientError.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, batchSyncTopicEntitiesClientResponse.failed_requests);
        protoWriter.writeBytes(batchSyncTopicEntitiesClientResponse.unknownFields());
    }
}
