package com.squareup.stafftasks.endpoints;

import androidx.room.TransactorKt;
import com.squareup.stafftasks.resources.Task;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UpsertTaskResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpsertTaskResponse((Task) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Task.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpsertTaskResponse upsertTaskResponse = (UpsertTaskResponse) obj;
        reverseProtoWriter.getClass();
        upsertTaskResponse.getClass();
        reverseProtoWriter.writeBytes(upsertTaskResponse.unknownFields());
        Task.ADAPTER.encodeWithTag(reverseProtoWriter, 1, upsertTaskResponse.task);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpsertTaskResponse upsertTaskResponse = (UpsertTaskResponse) obj;
        upsertTaskResponse.getClass();
        return Task.ADAPTER.encodedSizeWithTag(1, upsertTaskResponse.task) + upsertTaskResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpsertTaskResponse upsertTaskResponse = (UpsertTaskResponse) obj;
        upsertTaskResponse.getClass();
        Task task = upsertTaskResponse.task;
        Task task2 = task != null ? (Task) Task.ADAPTER.redact(task) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UpsertTaskResponse(task2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpsertTaskResponse upsertTaskResponse = (UpsertTaskResponse) obj;
        upsertTaskResponse.getClass();
        Task.ADAPTER.encodeWithTag(protoWriter, 1, upsertTaskResponse.task);
        protoWriter.writeBytes(upsertTaskResponse.unknownFields());
    }
}
