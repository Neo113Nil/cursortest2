package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.InputValue;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Instant;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InputValue$AppointmentSlotValue$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InputValue.AppointmentSlotValue((String) obj, (Instant) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InputValue.AppointmentSlotValue appointmentSlotValue = (InputValue.AppointmentSlotValue) obj;
        reverseProtoWriter.getClass();
        appointmentSlotValue.getClass();
        reverseProtoWriter.writeBytes(appointmentSlotValue.unknownFields());
        ProtoAdapter.INSTANT.encodeWithTag(reverseProtoWriter, 2, appointmentSlotValue.selected_time);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, appointmentSlotValue.slot_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InputValue.AppointmentSlotValue appointmentSlotValue = (InputValue.AppointmentSlotValue) obj;
        appointmentSlotValue.getClass();
        return ProtoAdapter.INSTANT.encodedSizeWithTag(2, appointmentSlotValue.selected_time) + ProtoAdapter.STRING.encodedSizeWithTag(1, appointmentSlotValue.slot_id) + appointmentSlotValue.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InputValue.AppointmentSlotValue appointmentSlotValue = (InputValue.AppointmentSlotValue) obj;
        appointmentSlotValue.getClass();
        Instant instant = appointmentSlotValue.selected_time;
        Instant instant2 = instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = appointmentSlotValue.slot_id;
        byteString.getClass();
        return new InputValue.AppointmentSlotValue(str, instant2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InputValue.AppointmentSlotValue appointmentSlotValue = (InputValue.AppointmentSlotValue) obj;
        appointmentSlotValue.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, appointmentSlotValue.slot_id);
        ProtoAdapter.INSTANT.encodeWithTag(protoWriter, 2, appointmentSlotValue.selected_time);
        protoWriter.writeBytes(appointmentSlotValue.unknownFields());
    }
}
