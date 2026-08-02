package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.employeejobs.Job;
import com.squareup.protos.timecards.scheduling.Shift;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetClockinEssentialsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetClockinEssentialsResponse((Shift) obj, (ShiftSchedule) obj2, (AutomaticClockoutDetails) obj3, (Job) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Shift.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(ShiftSchedule.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(AutomaticClockoutDetails.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Job.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetClockinEssentialsResponse getClockinEssentialsResponse = (GetClockinEssentialsResponse) obj;
        reverseProtoWriter.getClass();
        getClockinEssentialsResponse.getClass();
        reverseProtoWriter.writeBytes(getClockinEssentialsResponse.unknownFields());
        Job.ADAPTER.encodeWithTag(reverseProtoWriter, 5, getClockinEssentialsResponse.next_shift_job);
        AutomaticClockoutDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getClockinEssentialsResponse.automatic_clockout_details);
        ShiftSchedule.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getClockinEssentialsResponse.next_shift_schedule);
        Shift.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getClockinEssentialsResponse.clocked_in_shift);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetClockinEssentialsResponse getClockinEssentialsResponse = (GetClockinEssentialsResponse) obj;
        getClockinEssentialsResponse.getClass();
        return Job.ADAPTER.encodedSizeWithTag(5, getClockinEssentialsResponse.next_shift_job) + AutomaticClockoutDetails.ADAPTER.encodedSizeWithTag(3, getClockinEssentialsResponse.automatic_clockout_details) + ShiftSchedule.ADAPTER.encodedSizeWithTag(2, getClockinEssentialsResponse.next_shift_schedule) + Shift.ADAPTER.encodedSizeWithTag(1, getClockinEssentialsResponse.clocked_in_shift) + getClockinEssentialsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetClockinEssentialsResponse getClockinEssentialsResponse = (GetClockinEssentialsResponse) obj;
        getClockinEssentialsResponse.getClass();
        Shift shift = getClockinEssentialsResponse.clocked_in_shift;
        Shift shift2 = shift != null ? (Shift) Shift.ADAPTER.redact(shift) : null;
        ShiftSchedule shiftSchedule = getClockinEssentialsResponse.next_shift_schedule;
        ShiftSchedule shiftSchedule2 = shiftSchedule != null ? (ShiftSchedule) ShiftSchedule.ADAPTER.redact(shiftSchedule) : null;
        AutomaticClockoutDetails automaticClockoutDetails = getClockinEssentialsResponse.automatic_clockout_details;
        AutomaticClockoutDetails automaticClockoutDetails2 = automaticClockoutDetails != null ? (AutomaticClockoutDetails) AutomaticClockoutDetails.ADAPTER.redact(automaticClockoutDetails) : null;
        Job job = getClockinEssentialsResponse.next_shift_job;
        Job job2 = job != null ? (Job) Job.ADAPTER.redact(job) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetClockinEssentialsResponse(shift2, shiftSchedule2, automaticClockoutDetails2, job2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetClockinEssentialsResponse getClockinEssentialsResponse = (GetClockinEssentialsResponse) obj;
        getClockinEssentialsResponse.getClass();
        Shift.ADAPTER.encodeWithTag(protoWriter, 1, getClockinEssentialsResponse.clocked_in_shift);
        ShiftSchedule.ADAPTER.encodeWithTag(protoWriter, 2, getClockinEssentialsResponse.next_shift_schedule);
        AutomaticClockoutDetails.ADAPTER.encodeWithTag(protoWriter, 3, getClockinEssentialsResponse.automatic_clockout_details);
        Job.ADAPTER.encodeWithTag(protoWriter, 5, getClockinEssentialsResponse.next_shift_job);
        protoWriter.writeBytes(getClockinEssentialsResponse.unknownFields());
    }
}
