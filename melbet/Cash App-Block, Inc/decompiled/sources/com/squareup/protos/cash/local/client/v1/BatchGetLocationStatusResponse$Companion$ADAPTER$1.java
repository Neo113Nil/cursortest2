package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.BatchGetLocationStatusResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BatchGetLocationStatusResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BatchGetLocationStatusResponse((Long) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(BatchGetLocationStatusResponse.GetLocationStatusResponse.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BatchGetLocationStatusResponse batchGetLocationStatusResponse = (BatchGetLocationStatusResponse) obj;
        reverseProtoWriter.getClass();
        batchGetLocationStatusResponse.getClass();
        reverseProtoWriter.writeBytes(batchGetLocationStatusResponse.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, batchGetLocationStatusResponse.expires_at);
        BatchGetLocationStatusResponse.GetLocationStatusResponse.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, batchGetLocationStatusResponse.responses);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BatchGetLocationStatusResponse batchGetLocationStatusResponse = (BatchGetLocationStatusResponse) obj;
        batchGetLocationStatusResponse.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, batchGetLocationStatusResponse.expires_at) + BatchGetLocationStatusResponse.GetLocationStatusResponse.ADAPTER.asRepeated().encodedSizeWithTag(1, batchGetLocationStatusResponse.responses) + batchGetLocationStatusResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BatchGetLocationStatusResponse batchGetLocationStatusResponse = (BatchGetLocationStatusResponse) obj;
        batchGetLocationStatusResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(batchGetLocationStatusResponse.responses, BatchGetLocationStatusResponse.GetLocationStatusResponse.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Long l = batchGetLocationStatusResponse.expires_at;
        byteString.getClass();
        return new BatchGetLocationStatusResponse(l, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BatchGetLocationStatusResponse batchGetLocationStatusResponse = (BatchGetLocationStatusResponse) obj;
        batchGetLocationStatusResponse.getClass();
        BatchGetLocationStatusResponse.GetLocationStatusResponse.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchGetLocationStatusResponse.responses);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, batchGetLocationStatusResponse.expires_at);
        protoWriter.writeBytes(batchGetLocationStatusResponse.unknownFields());
    }
}
