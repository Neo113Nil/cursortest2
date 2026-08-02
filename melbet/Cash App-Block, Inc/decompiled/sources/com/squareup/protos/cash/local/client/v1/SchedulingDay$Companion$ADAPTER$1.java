package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SchedulingDay$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SchedulingDay((Boolean) obj2, (String) obj, (String) obj3, (String) obj4, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(SchedulingTime.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SchedulingDay schedulingDay = (SchedulingDay) obj;
        reverseProtoWriter.getClass();
        schedulingDay.getClass();
        reverseProtoWriter.writeBytes(schedulingDay.unknownFields());
        SchedulingTime.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, schedulingDay.day_times);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, schedulingDay.day_date_label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, schedulingDay.day_label);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, schedulingDay.is_in_context);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, schedulingDay.scheduling_day_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SchedulingDay schedulingDay = (SchedulingDay) obj;
        schedulingDay.getClass();
        int size$okio = schedulingDay.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return SchedulingTime.ADAPTER.asRepeated().encodedSizeWithTag(5, schedulingDay.day_times) + protoAdapter.encodedSizeWithTag(4, schedulingDay.day_date_label) + protoAdapter.encodedSizeWithTag(3, schedulingDay.day_label) + ProtoAdapter.BOOL.encodedSizeWithTag(2, schedulingDay.is_in_context) + protoAdapter.encodedSizeWithTag(1, schedulingDay.scheduling_day_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SchedulingDay schedulingDay = (SchedulingDay) obj;
        schedulingDay.getClass();
        return SchedulingDay.copy$default(schedulingDay, TransactorKt.m1169redactElements(schedulingDay.day_times, SchedulingTime.ADAPTER), ByteString.EMPTY, 15);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SchedulingDay schedulingDay = (SchedulingDay) obj;
        schedulingDay.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, schedulingDay.scheduling_day_token);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, schedulingDay.is_in_context);
        protoAdapter.encodeWithTag(protoWriter, 3, schedulingDay.day_label);
        protoAdapter.encodeWithTag(protoWriter, 4, schedulingDay.day_date_label);
        SchedulingTime.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, schedulingDay.day_times);
        protoWriter.writeBytes(schedulingDay.unknownFields());
    }
}
