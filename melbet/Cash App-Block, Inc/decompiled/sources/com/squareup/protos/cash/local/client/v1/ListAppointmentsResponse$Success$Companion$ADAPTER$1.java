package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.ListAppointmentsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ListAppointmentsResponse$Success$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ListAppointmentsResponse.Success(m, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LocalAppointment.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ListAppointmentsResponse.Success success = (ListAppointmentsResponse.Success) obj;
        reverseProtoWriter.getClass();
        success.getClass();
        reverseProtoWriter.writeBytes(success.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, success.cursor);
        LocalAppointment.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, success.appointments);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ListAppointmentsResponse.Success success = (ListAppointmentsResponse.Success) obj;
        success.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, success.cursor) + LocalAppointment.ADAPTER.asRepeated().encodedSizeWithTag(1, success.appointments) + success.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ListAppointmentsResponse.Success success = (ListAppointmentsResponse.Success) obj;
        success.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(success.appointments, LocalAppointment.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = success.cursor;
        byteString.getClass();
        return new ListAppointmentsResponse.Success(m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ListAppointmentsResponse.Success success = (ListAppointmentsResponse.Success) obj;
        success.getClass();
        LocalAppointment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, success.appointments);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, success.cursor);
        protoWriter.writeBytes(success.unknownFields());
    }
}
