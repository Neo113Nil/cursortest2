package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.timecards.CalculationTotal;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CalculationTotal$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CalculationTotal((Integer) obj, (Integer) obj2, (Integer) obj3, m, (Integer) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.UINT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.UINT32.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.UINT32.decode(protoReader);
            } else if (nextTag == 4) {
                m.add(CalculationTotal.MapEntry.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.UINT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CalculationTotal calculationTotal = (CalculationTotal) obj;
        reverseProtoWriter.getClass();
        calculationTotal.getClass();
        reverseProtoWriter.writeBytes(calculationTotal.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, calculationTotal.total_paid_seconds);
        CalculationTotal.MapEntry.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, calculationTotal.seconds_worked_for_pay_state);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, calculationTotal.doubletime_seconds);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, calculationTotal.overtime_seconds);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, calculationTotal.regular_seconds);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CalculationTotal calculationTotal = (CalculationTotal) obj;
        calculationTotal.getClass();
        int size$okio = calculationTotal.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
        return protoAdapter.encodedSizeWithTag(5, calculationTotal.total_paid_seconds) + CalculationTotal.MapEntry.ADAPTER.asRepeated().encodedSizeWithTag(4, calculationTotal.seconds_worked_for_pay_state) + protoAdapter.encodedSizeWithTag(3, calculationTotal.doubletime_seconds) + protoAdapter.encodedSizeWithTag(2, calculationTotal.overtime_seconds) + protoAdapter.encodedSizeWithTag(1, calculationTotal.regular_seconds) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CalculationTotal calculationTotal = (CalculationTotal) obj;
        calculationTotal.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(calculationTotal.seconds_worked_for_pay_state, CalculationTotal.MapEntry.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Integer num = calculationTotal.regular_seconds;
        Integer num2 = calculationTotal.overtime_seconds;
        Integer num3 = calculationTotal.doubletime_seconds;
        Integer num4 = calculationTotal.total_paid_seconds;
        byteString.getClass();
        return new CalculationTotal(num, num2, num3, m1169redactElements, num4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CalculationTotal calculationTotal = (CalculationTotal) obj;
        calculationTotal.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
        protoAdapter.encodeWithTag(protoWriter, 1, calculationTotal.regular_seconds);
        protoAdapter.encodeWithTag(protoWriter, 2, calculationTotal.overtime_seconds);
        protoAdapter.encodeWithTag(protoWriter, 3, calculationTotal.doubletime_seconds);
        CalculationTotal.MapEntry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, calculationTotal.seconds_worked_for_pay_state);
        protoAdapter.encodeWithTag(protoWriter, 5, calculationTotal.total_paid_seconds);
        protoWriter.writeBytes(calculationTotal.unknownFields());
    }
}
