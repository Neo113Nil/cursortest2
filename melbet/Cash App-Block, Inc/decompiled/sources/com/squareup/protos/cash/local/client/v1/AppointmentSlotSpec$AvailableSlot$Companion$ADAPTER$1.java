package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.AppointmentSlotSpec;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Instant;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AppointmentSlotSpec$AvailableSlot$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AppointmentSlotSpec.AvailableSlot((String) obj, (Instant) obj2, (Instant) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppointmentSlotSpec.AvailableSlot availableSlot = (AppointmentSlotSpec.AvailableSlot) obj;
        reverseProtoWriter.getClass();
        availableSlot.getClass();
        reverseProtoWriter.writeBytes(availableSlot.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, availableSlot.display_text);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INSTANT;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, availableSlot.end_time);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, availableSlot.start_time);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, availableSlot.slot_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AppointmentSlotSpec.AvailableSlot availableSlot = (AppointmentSlotSpec.AvailableSlot) obj;
        availableSlot.getClass();
        int size$okio = availableSlot.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, availableSlot.slot_id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INSTANT;
        return protoAdapter.encodedSizeWithTag(4, availableSlot.display_text) + protoAdapter2.encodedSizeWithTag(3, availableSlot.end_time) + protoAdapter2.encodedSizeWithTag(2, availableSlot.start_time) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppointmentSlotSpec.AvailableSlot availableSlot = (AppointmentSlotSpec.AvailableSlot) obj;
        availableSlot.getClass();
        Instant instant = availableSlot.start_time;
        Instant instant2 = instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null;
        Instant instant3 = availableSlot.end_time;
        Instant instant4 = instant3 != null ? (Instant) ProtoAdapter.INSTANT.redact(instant3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = availableSlot.slot_id;
        String str2 = availableSlot.display_text;
        byteString.getClass();
        return new AppointmentSlotSpec.AvailableSlot(str, instant2, instant4, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppointmentSlotSpec.AvailableSlot availableSlot = (AppointmentSlotSpec.AvailableSlot) obj;
        availableSlot.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, availableSlot.slot_id);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INSTANT;
        protoAdapter2.encodeWithTag(protoWriter, 2, availableSlot.start_time);
        protoAdapter2.encodeWithTag(protoWriter, 3, availableSlot.end_time);
        protoAdapter.encodeWithTag(protoWriter, 4, availableSlot.display_text);
        protoWriter.writeBytes(availableSlot.unknownFields());
    }
}
