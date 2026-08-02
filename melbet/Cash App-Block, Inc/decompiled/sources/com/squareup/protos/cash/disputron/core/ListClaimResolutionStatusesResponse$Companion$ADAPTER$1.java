package com.squareup.protos.cash.disputron.core;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ListClaimResolutionStatusesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ListClaimResolutionStatusesResponse(m, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ClaimResolutionStatus.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ListClaimResolutionStatusesResponse listClaimResolutionStatusesResponse = (ListClaimResolutionStatusesResponse) obj;
        reverseProtoWriter.getClass();
        listClaimResolutionStatusesResponse.getClass();
        reverseProtoWriter.writeBytes(listClaimResolutionStatusesResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, listClaimResolutionStatusesResponse.next);
        ClaimResolutionStatus.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, listClaimResolutionStatusesResponse.statuses);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ListClaimResolutionStatusesResponse listClaimResolutionStatusesResponse = (ListClaimResolutionStatusesResponse) obj;
        listClaimResolutionStatusesResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, listClaimResolutionStatusesResponse.next) + ClaimResolutionStatus.ADAPTER.asRepeated().encodedSizeWithTag(1, listClaimResolutionStatusesResponse.statuses) + listClaimResolutionStatusesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ListClaimResolutionStatusesResponse listClaimResolutionStatusesResponse = (ListClaimResolutionStatusesResponse) obj;
        listClaimResolutionStatusesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(listClaimResolutionStatusesResponse.statuses, ClaimResolutionStatus.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = listClaimResolutionStatusesResponse.next;
        byteString.getClass();
        return new ListClaimResolutionStatusesResponse(m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ListClaimResolutionStatusesResponse listClaimResolutionStatusesResponse = (ListClaimResolutionStatusesResponse) obj;
        listClaimResolutionStatusesResponse.getClass();
        ClaimResolutionStatus.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listClaimResolutionStatusesResponse.statuses);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, listClaimResolutionStatusesResponse.next);
        protoWriter.writeBytes(listClaimResolutionStatusesResponse.unknownFields());
    }
}
