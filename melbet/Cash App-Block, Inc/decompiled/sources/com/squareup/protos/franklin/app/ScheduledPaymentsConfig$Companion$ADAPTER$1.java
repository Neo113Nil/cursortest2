package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.ScheduledPaymentsConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ScheduledPaymentsConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ScheduledPaymentsConfig(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ScheduledPaymentsConfig.SupportedSchedule.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ScheduledPaymentsConfig scheduledPaymentsConfig = (ScheduledPaymentsConfig) obj;
        reverseProtoWriter.getClass();
        scheduledPaymentsConfig.getClass();
        reverseProtoWriter.writeBytes(scheduledPaymentsConfig.unknownFields());
        ScheduledPaymentsConfig.SupportedSchedule.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, scheduledPaymentsConfig.supported_schedules);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ScheduledPaymentsConfig scheduledPaymentsConfig = (ScheduledPaymentsConfig) obj;
        scheduledPaymentsConfig.getClass();
        return ScheduledPaymentsConfig.SupportedSchedule.ADAPTER.asRepeated().encodedSizeWithTag(1, scheduledPaymentsConfig.supported_schedules) + scheduledPaymentsConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ScheduledPaymentsConfig scheduledPaymentsConfig = (ScheduledPaymentsConfig) obj;
        scheduledPaymentsConfig.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(scheduledPaymentsConfig.supported_schedules, ScheduledPaymentsConfig.SupportedSchedule.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ScheduledPaymentsConfig(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ScheduledPaymentsConfig scheduledPaymentsConfig = (ScheduledPaymentsConfig) obj;
        scheduledPaymentsConfig.getClass();
        ScheduledPaymentsConfig.SupportedSchedule.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, scheduledPaymentsConfig.supported_schedules);
        protoWriter.writeBytes(scheduledPaymentsConfig.unknownFields());
    }
}
