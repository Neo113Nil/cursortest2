package com.squareup.protos.cash.investcrypto.resources;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Order$RecurringSchedule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Order.RecurringSchedule((Order.RecurringSchedule.Frequency) obj, m, (String) obj2, (Integer) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Order.RecurringSchedule.Frequency.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                m.add(ProtoAdapter.INT32.decode(protoReader));
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Order.RecurringSchedule recurringSchedule = (Order.RecurringSchedule) obj;
        reverseProtoWriter.getClass();
        recurringSchedule.getClass();
        reverseProtoWriter.writeBytes(recurringSchedule.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, recurringSchedule.time_of_day);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, recurringSchedule.timezone);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, recurringSchedule.days_of_period);
        Order.RecurringSchedule.Frequency.ADAPTER.encodeWithTag(reverseProtoWriter, 1, recurringSchedule.frequency);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Order.RecurringSchedule recurringSchedule = (Order.RecurringSchedule) obj;
        recurringSchedule.getClass();
        int encodedSizeWithTag = Order.RecurringSchedule.Frequency.ADAPTER.encodedSizeWithTag(1, recurringSchedule.frequency) + recurringSchedule.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(4, recurringSchedule.time_of_day) + ProtoAdapter.STRING.encodedSizeWithTag(3, recurringSchedule.timezone) + protoAdapter.asRepeated().encodedSizeWithTag(2, recurringSchedule.days_of_period) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Order.RecurringSchedule recurringSchedule = (Order.RecurringSchedule) obj;
        recurringSchedule.getClass();
        ByteString byteString = ByteString.EMPTY;
        Order.RecurringSchedule.Frequency frequency = recurringSchedule.frequency;
        List list = recurringSchedule.days_of_period;
        String str = recurringSchedule.timezone;
        Integer num = recurringSchedule.time_of_day;
        list.getClass();
        byteString.getClass();
        return new Order.RecurringSchedule(frequency, list, str, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Order.RecurringSchedule recurringSchedule = (Order.RecurringSchedule) obj;
        recurringSchedule.getClass();
        Order.RecurringSchedule.Frequency.ADAPTER.encodeWithTag(protoWriter, 1, recurringSchedule.frequency);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, recurringSchedule.days_of_period);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, recurringSchedule.timezone);
        protoAdapter.encodeWithTag(protoWriter, 4, recurringSchedule.time_of_day);
        protoWriter.writeBytes(recurringSchedule.unknownFields());
    }
}
