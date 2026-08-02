package com.squareup.protos.timecards.scheduling;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetShiftSchedulesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetShiftSchedulesResponse((String) obj, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ShiftSchedule.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                arrayList.add(TeamMember.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetShiftSchedulesResponse getShiftSchedulesResponse = (GetShiftSchedulesResponse) obj;
        reverseProtoWriter.getClass();
        getShiftSchedulesResponse.getClass();
        reverseProtoWriter.writeBytes(getShiftSchedulesResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, getShiftSchedulesResponse.cursor);
        TeamMember.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, getShiftSchedulesResponse.team_members);
        ShiftSchedule.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getShiftSchedulesResponse.shift_schedules);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetShiftSchedulesResponse getShiftSchedulesResponse = (GetShiftSchedulesResponse) obj;
        getShiftSchedulesResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, getShiftSchedulesResponse.cursor) + TeamMember.ADAPTER.asRepeated().encodedSizeWithTag(2, getShiftSchedulesResponse.team_members) + ShiftSchedule.ADAPTER.asRepeated().encodedSizeWithTag(1, getShiftSchedulesResponse.shift_schedules) + getShiftSchedulesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetShiftSchedulesResponse getShiftSchedulesResponse = (GetShiftSchedulesResponse) obj;
        getShiftSchedulesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getShiftSchedulesResponse.shift_schedules, ShiftSchedule.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(getShiftSchedulesResponse.team_members, TeamMember.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = getShiftSchedulesResponse.cursor;
        byteString.getClass();
        return new GetShiftSchedulesResponse(str, m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetShiftSchedulesResponse getShiftSchedulesResponse = (GetShiftSchedulesResponse) obj;
        getShiftSchedulesResponse.getClass();
        ShiftSchedule.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getShiftSchedulesResponse.shift_schedules);
        TeamMember.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getShiftSchedulesResponse.team_members);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getShiftSchedulesResponse.cursor);
        protoWriter.writeBytes(getShiftSchedulesResponse.unknownFields());
    }
}
