package com.squareup.protos.cash.incidentalerts.app.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetIncidentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetIncidentResponse((Incident) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Incident.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetIncidentResponse getIncidentResponse = (GetIncidentResponse) obj;
        reverseProtoWriter.getClass();
        getIncidentResponse.getClass();
        reverseProtoWriter.writeBytes(getIncidentResponse.unknownFields());
        Incident.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getIncidentResponse.incident);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetIncidentResponse getIncidentResponse = (GetIncidentResponse) obj;
        getIncidentResponse.getClass();
        return Incident.ADAPTER.encodedSizeWithTag(1, getIncidentResponse.incident) + getIncidentResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetIncidentResponse getIncidentResponse = (GetIncidentResponse) obj;
        getIncidentResponse.getClass();
        Incident incident = getIncidentResponse.incident;
        Incident incident2 = incident != null ? (Incident) Incident.ADAPTER.redact(incident) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetIncidentResponse(incident2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetIncidentResponse getIncidentResponse = (GetIncidentResponse) obj;
        getIncidentResponse.getClass();
        Incident.ADAPTER.encodeWithTag(protoWriter, 1, getIncidentResponse.incident);
        protoWriter.writeBytes(getIncidentResponse.unknownFields());
    }
}
