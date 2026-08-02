package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SelectParticipantRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SelectParticipantRequest((RequestContext) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(GroupParticipant.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SelectParticipantRequest selectParticipantRequest = (SelectParticipantRequest) obj;
        reverseProtoWriter.getClass();
        selectParticipantRequest.getClass();
        reverseProtoWriter.writeBytes(selectParticipantRequest.unknownFields());
        GroupParticipant.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, selectParticipantRequest.participants);
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, selectParticipantRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SelectParticipantRequest selectParticipantRequest = (SelectParticipantRequest) obj;
        selectParticipantRequest.getClass();
        return GroupParticipant.ADAPTER.asRepeated().encodedSizeWithTag(2, selectParticipantRequest.participants) + RequestContext.ADAPTER.encodedSizeWithTag(1, selectParticipantRequest.request_context) + selectParticipantRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SelectParticipantRequest selectParticipantRequest = (SelectParticipantRequest) obj;
        selectParticipantRequest.getClass();
        RequestContext requestContext = selectParticipantRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(selectParticipantRequest.participants, GroupParticipant.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SelectParticipantRequest(requestContext2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SelectParticipantRequest selectParticipantRequest = (SelectParticipantRequest) obj;
        selectParticipantRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, selectParticipantRequest.request_context);
        GroupParticipant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, selectParticipantRequest.participants);
        protoWriter.writeBytes(selectParticipantRequest.unknownFields());
    }
}
