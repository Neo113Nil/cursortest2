package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.ScheduledPaymentsConfig;
import com.squareup.protos.franklin.common.ScheduleRFC2445;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ScheduledPaymentsConfig$SupportedSchedule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ScheduledPaymentsConfig.SupportedSchedule((String) obj, (ScheduleRFC2445) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ScheduleRFC2445.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ScheduledPaymentsConfig.SupportedSchedule supportedSchedule = (ScheduledPaymentsConfig.SupportedSchedule) obj;
        reverseProtoWriter.getClass();
        supportedSchedule.getClass();
        reverseProtoWriter.writeBytes(supportedSchedule.unknownFields());
        ScheduleRFC2445.ADAPTER.encodeWithTag(reverseProtoWriter, 2, supportedSchedule.schedule);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, supportedSchedule.description);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ScheduledPaymentsConfig.SupportedSchedule supportedSchedule = (ScheduledPaymentsConfig.SupportedSchedule) obj;
        supportedSchedule.getClass();
        return ScheduleRFC2445.ADAPTER.encodedSizeWithTag(2, supportedSchedule.schedule) + ProtoAdapter.STRING.encodedSizeWithTag(1, supportedSchedule.description) + supportedSchedule.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ScheduledPaymentsConfig.SupportedSchedule supportedSchedule = (ScheduledPaymentsConfig.SupportedSchedule) obj;
        supportedSchedule.getClass();
        ScheduleRFC2445 scheduleRFC2445 = supportedSchedule.schedule;
        ScheduleRFC2445 scheduleRFC24452 = scheduleRFC2445 != null ? (ScheduleRFC2445) ScheduleRFC2445.ADAPTER.redact(scheduleRFC2445) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = supportedSchedule.description;
        byteString.getClass();
        return new ScheduledPaymentsConfig.SupportedSchedule(str, scheduleRFC24452, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ScheduledPaymentsConfig.SupportedSchedule supportedSchedule = (ScheduledPaymentsConfig.SupportedSchedule) obj;
        supportedSchedule.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, supportedSchedule.description);
        ScheduleRFC2445.ADAPTER.encodeWithTag(protoWriter, 2, supportedSchedule.schedule);
        protoWriter.writeBytes(supportedSchedule.unknownFields());
    }
}
