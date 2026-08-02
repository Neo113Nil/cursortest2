package com.squareup.protos.cash.incidentalerts.app.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetIncidentsListResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetIncidentsListResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Incident.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetIncidentsListResponse getIncidentsListResponse = (GetIncidentsListResponse) obj;
        reverseProtoWriter.getClass();
        getIncidentsListResponse.getClass();
        reverseProtoWriter.writeBytes(getIncidentsListResponse.unknownFields());
        Incident.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getIncidentsListResponse.incidents);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetIncidentsListResponse getIncidentsListResponse = (GetIncidentsListResponse) obj;
        getIncidentsListResponse.getClass();
        return Incident.ADAPTER.asRepeated().encodedSizeWithTag(1, getIncidentsListResponse.incidents) + getIncidentsListResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetIncidentsListResponse getIncidentsListResponse = (GetIncidentsListResponse) obj;
        getIncidentsListResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getIncidentsListResponse.incidents, Incident.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetIncidentsListResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetIncidentsListResponse getIncidentsListResponse = (GetIncidentsListResponse) obj;
        getIncidentsListResponse.getClass();
        Incident.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getIncidentsListResponse.incidents);
        protoWriter.writeBytes(getIncidentsListResponse.unknownFields());
    }
}
