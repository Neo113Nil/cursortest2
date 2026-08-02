package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ShiftsToSwap$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShiftsToSwap((ShiftSchedule) obj, (ShiftSchedule) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ShiftSchedule.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ShiftSchedule.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShiftsToSwap shiftsToSwap = (ShiftsToSwap) obj;
        reverseProtoWriter.getClass();
        shiftsToSwap.getClass();
        reverseProtoWriter.writeBytes(shiftsToSwap.unknownFields());
        ProtoAdapter protoAdapter = ShiftSchedule.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, shiftsToSwap.target_shift_schedule);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, shiftsToSwap.proposer_shift_schedule);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShiftsToSwap shiftsToSwap = (ShiftsToSwap) obj;
        shiftsToSwap.getClass();
        int size$okio = shiftsToSwap.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ShiftSchedule.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, shiftsToSwap.target_shift_schedule) + protoAdapter.encodedSizeWithTag(1, shiftsToSwap.proposer_shift_schedule) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShiftsToSwap shiftsToSwap = (ShiftsToSwap) obj;
        shiftsToSwap.getClass();
        ShiftSchedule shiftSchedule = shiftsToSwap.proposer_shift_schedule;
        ShiftSchedule shiftSchedule2 = shiftSchedule != null ? (ShiftSchedule) ShiftSchedule.ADAPTER.redact(shiftSchedule) : null;
        ShiftSchedule shiftSchedule3 = shiftsToSwap.target_shift_schedule;
        ShiftSchedule shiftSchedule4 = shiftSchedule3 != null ? (ShiftSchedule) ShiftSchedule.ADAPTER.redact(shiftSchedule3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ShiftsToSwap(shiftSchedule2, shiftSchedule4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShiftsToSwap shiftsToSwap = (ShiftsToSwap) obj;
        shiftsToSwap.getClass();
        ProtoAdapter protoAdapter = ShiftSchedule.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, shiftsToSwap.proposer_shift_schedule);
        protoAdapter.encodeWithTag(protoWriter, 2, shiftsToSwap.target_shift_schedule);
        protoWriter.writeBytes(shiftsToSwap.unknownFields());
    }
}
