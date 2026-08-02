package com.squareup.stafftasks.endpoints;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.stafftasks.resources.Task;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ListTasksResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ListTasksResponse(m, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Task.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ListTasksResponse listTasksResponse = (ListTasksResponse) obj;
        reverseProtoWriter.getClass();
        listTasksResponse.getClass();
        reverseProtoWriter.writeBytes(listTasksResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, listTasksResponse.cursor);
        Task.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, listTasksResponse.tasks);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ListTasksResponse listTasksResponse = (ListTasksResponse) obj;
        listTasksResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, listTasksResponse.cursor) + Task.ADAPTER.asRepeated().encodedSizeWithTag(1, listTasksResponse.tasks) + listTasksResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ListTasksResponse listTasksResponse = (ListTasksResponse) obj;
        listTasksResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(listTasksResponse.tasks, Task.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = listTasksResponse.cursor;
        byteString.getClass();
        return new ListTasksResponse(m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ListTasksResponse listTasksResponse = (ListTasksResponse) obj;
        listTasksResponse.getClass();
        Task.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listTasksResponse.tasks);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, listTasksResponse.cursor);
        protoWriter.writeBytes(listTasksResponse.unknownFields());
    }
}
