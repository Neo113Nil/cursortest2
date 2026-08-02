package com.squareup.protos.cash.aegis.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.aegis.core.PendingRequestsParams;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetFamilyPendingRequestsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetFamilyPendingRequestsResponse((PendingRequestsParams) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(PendingRequestsParams.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetFamilyPendingRequestsResponse getFamilyPendingRequestsResponse = (GetFamilyPendingRequestsResponse) obj;
        reverseProtoWriter.getClass();
        getFamilyPendingRequestsResponse.getClass();
        reverseProtoWriter.writeBytes(getFamilyPendingRequestsResponse.unknownFields());
        PendingRequestsParams.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getFamilyPendingRequestsResponse.pending_requests_parameters);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetFamilyPendingRequestsResponse getFamilyPendingRequestsResponse = (GetFamilyPendingRequestsResponse) obj;
        getFamilyPendingRequestsResponse.getClass();
        return PendingRequestsParams.ADAPTER.encodedSizeWithTag(1, getFamilyPendingRequestsResponse.pending_requests_parameters) + getFamilyPendingRequestsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetFamilyPendingRequestsResponse getFamilyPendingRequestsResponse = (GetFamilyPendingRequestsResponse) obj;
        getFamilyPendingRequestsResponse.getClass();
        PendingRequestsParams pendingRequestsParams = getFamilyPendingRequestsResponse.pending_requests_parameters;
        PendingRequestsParams pendingRequestsParams2 = pendingRequestsParams != null ? (PendingRequestsParams) PendingRequestsParams.ADAPTER.redact(pendingRequestsParams) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetFamilyPendingRequestsResponse(pendingRequestsParams2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetFamilyPendingRequestsResponse getFamilyPendingRequestsResponse = (GetFamilyPendingRequestsResponse) obj;
        getFamilyPendingRequestsResponse.getClass();
        PendingRequestsParams.ADAPTER.encodeWithTag(protoWriter, 1, getFamilyPendingRequestsResponse.pending_requests_parameters);
        protoWriter.writeBytes(getFamilyPendingRequestsResponse.unknownFields());
    }
}
