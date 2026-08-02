package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OpenShiftToClaim$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OpenShiftToClaim((ShiftSchedule) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ShiftSchedule.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OpenShiftToClaim openShiftToClaim = (OpenShiftToClaim) obj;
        reverseProtoWriter.getClass();
        openShiftToClaim.getClass();
        reverseProtoWriter.writeBytes(openShiftToClaim.unknownFields());
        ShiftSchedule.ADAPTER.encodeWithTag(reverseProtoWriter, 1, openShiftToClaim.shift_schedule);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OpenShiftToClaim openShiftToClaim = (OpenShiftToClaim) obj;
        openShiftToClaim.getClass();
        return ShiftSchedule.ADAPTER.encodedSizeWithTag(1, openShiftToClaim.shift_schedule) + openShiftToClaim.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OpenShiftToClaim openShiftToClaim = (OpenShiftToClaim) obj;
        openShiftToClaim.getClass();
        ShiftSchedule shiftSchedule = openShiftToClaim.shift_schedule;
        ShiftSchedule shiftSchedule2 = shiftSchedule != null ? (ShiftSchedule) ShiftSchedule.ADAPTER.redact(shiftSchedule) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OpenShiftToClaim(shiftSchedule2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OpenShiftToClaim openShiftToClaim = (OpenShiftToClaim) obj;
        openShiftToClaim.getClass();
        ShiftSchedule.ADAPTER.encodeWithTag(protoWriter, 1, openShiftToClaim.shift_schedule);
        protoWriter.writeBytes(openShiftToClaim.unknownFields());
    }
}
