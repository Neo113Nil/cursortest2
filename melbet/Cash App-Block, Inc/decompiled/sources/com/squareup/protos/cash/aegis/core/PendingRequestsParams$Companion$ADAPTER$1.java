package com.squareup.protos.cash.aegis.core;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PendingRequestsParams$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PendingRequestsParams(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(PendingRequest.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PendingRequestsParams pendingRequestsParams = (PendingRequestsParams) obj;
        reverseProtoWriter.getClass();
        pendingRequestsParams.getClass();
        reverseProtoWriter.writeBytes(pendingRequestsParams.unknownFields());
        PendingRequest.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, pendingRequestsParams.pending_requests);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PendingRequestsParams pendingRequestsParams = (PendingRequestsParams) obj;
        pendingRequestsParams.getClass();
        return PendingRequest.ADAPTER.asRepeated().encodedSizeWithTag(1, pendingRequestsParams.pending_requests) + pendingRequestsParams.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PendingRequestsParams pendingRequestsParams = (PendingRequestsParams) obj;
        pendingRequestsParams.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(pendingRequestsParams.pending_requests, PendingRequest.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PendingRequestsParams(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PendingRequestsParams pendingRequestsParams = (PendingRequestsParams) obj;
        pendingRequestsParams.getClass();
        PendingRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pendingRequestsParams.pending_requests);
        protoWriter.writeBytes(pendingRequestsParams.unknownFields());
    }
}
