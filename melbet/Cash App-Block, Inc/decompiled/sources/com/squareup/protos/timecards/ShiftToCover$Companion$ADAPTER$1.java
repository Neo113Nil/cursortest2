package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.timecards.scheduling.ShiftCover;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ShiftToCover$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShiftToCover((ShiftSchedule) obj, (String) obj2, (ShiftCover) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ShiftSchedule.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(ShiftCover.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShiftToCover shiftToCover = (ShiftToCover) obj;
        reverseProtoWriter.getClass();
        shiftToCover.getClass();
        reverseProtoWriter.writeBytes(shiftToCover.unknownFields());
        ShiftCover.ADAPTER.encodeWithTag(reverseProtoWriter, 3, shiftToCover.shift_cover);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, shiftToCover.shift_schedule_version_token);
        ShiftSchedule.ADAPTER.encodeWithTag(reverseProtoWriter, 1, shiftToCover.shift_schedule);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShiftToCover shiftToCover = (ShiftToCover) obj;
        shiftToCover.getClass();
        return ShiftCover.ADAPTER.encodedSizeWithTag(3, shiftToCover.shift_cover) + ProtoAdapter.STRING.encodedSizeWithTag(2, shiftToCover.shift_schedule_version_token) + ShiftSchedule.ADAPTER.encodedSizeWithTag(1, shiftToCover.shift_schedule) + shiftToCover.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShiftToCover shiftToCover = (ShiftToCover) obj;
        shiftToCover.getClass();
        ShiftSchedule shiftSchedule = shiftToCover.shift_schedule;
        ShiftSchedule shiftSchedule2 = shiftSchedule != null ? (ShiftSchedule) ShiftSchedule.ADAPTER.redact(shiftSchedule) : null;
        ShiftCover shiftCover = shiftToCover.shift_cover;
        ShiftCover shiftCover2 = shiftCover != null ? (ShiftCover) ShiftCover.ADAPTER.redact(shiftCover) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = shiftToCover.shift_schedule_version_token;
        byteString.getClass();
        return new ShiftToCover(shiftSchedule2, str, shiftCover2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShiftToCover shiftToCover = (ShiftToCover) obj;
        shiftToCover.getClass();
        ShiftSchedule.ADAPTER.encodeWithTag(protoWriter, 1, shiftToCover.shift_schedule);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, shiftToCover.shift_schedule_version_token);
        ShiftCover.ADAPTER.encodeWithTag(protoWriter, 3, shiftToCover.shift_cover);
        protoWriter.writeBytes(shiftToCover.unknownFields());
    }
}
