package com.squareup.protos.employeejobs;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.employeejobs.Wage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Wage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Wage((Wage.WageType) obj, (Money) obj2, (Money) obj3, (Integer) obj4, (Boolean) obj5, (Boolean) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = Wage.WageType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = ProtoAdapter.UINT32.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Wage wage = (Wage) obj;
        reverseProtoWriter.getClass();
        wage.getClass();
        reverseProtoWriter.writeBytes(wage.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, wage.overtime_exempt);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, wage.tip_eligible);
        ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 4, wage.hours_worked_per_week);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, wage.annual_wage);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, wage.hourly_wage);
        Wage.WageType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, wage.wage_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Wage wage = (Wage) obj;
        wage.getClass();
        int encodedSizeWithTag = Wage.WageType.ADAPTER.encodedSizeWithTag(1, wage.wage_type) + wage.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        int encodedSizeWithTag2 = ProtoAdapter.UINT32.encodedSizeWithTag(4, wage.hours_worked_per_week) + protoAdapter.encodedSizeWithTag(3, wage.annual_wage) + protoAdapter.encodedSizeWithTag(2, wage.hourly_wage) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(6, wage.overtime_exempt) + protoAdapter2.encodedSizeWithTag(5, wage.tip_eligible) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Wage wage = (Wage) obj;
        wage.getClass();
        Money money = wage.hourly_wage;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = wage.annual_wage;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        Wage.WageType wageType = wage.wage_type;
        Integer num = wage.hours_worked_per_week;
        Boolean bool = wage.tip_eligible;
        Boolean bool2 = wage.overtime_exempt;
        byteString.getClass();
        return new Wage(wageType, money2, money4, num, bool, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Wage wage = (Wage) obj;
        wage.getClass();
        Wage.WageType.ADAPTER.encodeWithTag(protoWriter, 1, wage.wage_type);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, wage.hourly_wage);
        protoAdapter.encodeWithTag(protoWriter, 3, wage.annual_wage);
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 4, wage.hours_worked_per_week);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 5, wage.tip_eligible);
        protoAdapter2.encodeWithTag(protoWriter, 6, wage.overtime_exempt);
        protoWriter.writeBytes(wage.unknownFields());
    }
}
