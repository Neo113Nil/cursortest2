package com.squareup.protos.cash.scheduledreloader.resources.v1;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.scheduledreloader.resources.v1.ReloadSchedule;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ReloadSchedule$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ReloadSchedule((ReloadSchedule.Frequency) obj, m, (String) obj2, (Integer) obj3, (Integer) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ReloadSchedule.Frequency.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                m.add(ProtoAdapter.INT32.decode(protoReader));
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ReloadSchedule reloadSchedule = (ReloadSchedule) obj;
        reverseProtoWriter.getClass();
        reloadSchedule.getClass();
        reverseProtoWriter.writeBytes(reloadSchedule.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, reloadSchedule.day_of_period);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, reloadSchedule.time_of_day);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, reloadSchedule.timezone);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, reloadSchedule.days_of_period);
        ReloadSchedule.Frequency.ADAPTER.encodeWithTag(reverseProtoWriter, 1, reloadSchedule.frequency);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ReloadSchedule reloadSchedule = (ReloadSchedule) obj;
        reloadSchedule.getClass();
        int encodedSizeWithTag = ReloadSchedule.Frequency.ADAPTER.encodedSizeWithTag(1, reloadSchedule.frequency) + reloadSchedule.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(5, reloadSchedule.day_of_period) + protoAdapter.encodedSizeWithTag(4, reloadSchedule.time_of_day) + ProtoAdapter.STRING.encodedSizeWithTag(3, reloadSchedule.timezone) + protoAdapter.asRepeated().encodedSizeWithTag(2, reloadSchedule.days_of_period) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ReloadSchedule reloadSchedule = (ReloadSchedule) obj;
        reloadSchedule.getClass();
        ByteString byteString = ByteString.EMPTY;
        ReloadSchedule.Frequency frequency = reloadSchedule.frequency;
        List list = reloadSchedule.days_of_period;
        String str = reloadSchedule.timezone;
        Integer num = reloadSchedule.time_of_day;
        Integer num2 = reloadSchedule.day_of_period;
        list.getClass();
        byteString.getClass();
        return new ReloadSchedule(frequency, list, str, num, num2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ReloadSchedule reloadSchedule = (ReloadSchedule) obj;
        reloadSchedule.getClass();
        ReloadSchedule.Frequency.ADAPTER.encodeWithTag(protoWriter, 1, reloadSchedule.frequency);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, reloadSchedule.days_of_period);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, reloadSchedule.timezone);
        protoAdapter.encodeWithTag(protoWriter, 4, reloadSchedule.time_of_day);
        protoAdapter.encodeWithTag(protoWriter, 5, reloadSchedule.day_of_period);
        protoWriter.writeBytes(reloadSchedule.unknownFields());
    }
}
