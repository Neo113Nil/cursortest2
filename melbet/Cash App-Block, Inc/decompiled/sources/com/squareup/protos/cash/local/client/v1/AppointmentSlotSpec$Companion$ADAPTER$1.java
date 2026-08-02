package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.AppointmentSlotSpec;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AppointmentSlotSpec$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AppointmentSlotSpec((Long) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(AppointmentSlotSpec.AvailableSlot.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppointmentSlotSpec appointmentSlotSpec = (AppointmentSlotSpec) obj;
        reverseProtoWriter.getClass();
        appointmentSlotSpec.getClass();
        reverseProtoWriter.writeBytes(appointmentSlotSpec.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, appointmentSlotSpec.lookup_token);
        AppointmentSlotSpec.AvailableSlot.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, appointmentSlotSpec.available_slots);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, appointmentSlotSpec.total_duration_minutes);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AppointmentSlotSpec appointmentSlotSpec = (AppointmentSlotSpec) obj;
        appointmentSlotSpec.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, appointmentSlotSpec.lookup_token) + AppointmentSlotSpec.AvailableSlot.ADAPTER.asRepeated().encodedSizeWithTag(2, appointmentSlotSpec.available_slots) + ProtoAdapter.INT64.encodedSizeWithTag(1, appointmentSlotSpec.total_duration_minutes) + appointmentSlotSpec.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppointmentSlotSpec appointmentSlotSpec = (AppointmentSlotSpec) obj;
        appointmentSlotSpec.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(appointmentSlotSpec.available_slots, AppointmentSlotSpec.AvailableSlot.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Long l = appointmentSlotSpec.total_duration_minutes;
        String str = appointmentSlotSpec.lookup_token;
        byteString.getClass();
        return new AppointmentSlotSpec(l, str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppointmentSlotSpec appointmentSlotSpec = (AppointmentSlotSpec) obj;
        appointmentSlotSpec.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, appointmentSlotSpec.total_duration_minutes);
        AppointmentSlotSpec.AvailableSlot.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, appointmentSlotSpec.available_slots);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, appointmentSlotSpec.lookup_token);
        protoWriter.writeBytes(appointmentSlotSpec.unknownFields());
    }
}
