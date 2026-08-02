package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.teamapp.ui.Row;
import com.squareup.protos.timecards.GetShiftsOverviewResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetShiftsOverviewResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        GetShiftsOverviewResponse.IntervalType intervalType;
        String str;
        String str2;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        String str3 = null;
        Object obj = null;
        GetShiftsOverviewResponse.IntervalType intervalType2 = null;
        String str4 = null;
        String str5 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Integer num = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetShiftsOverviewResponse(str3, m, arrayList, arrayList2, (DatetimeInterval) obj, intervalType2, str4, str5, (Money) obj2, (Money) obj3, (Money) obj4, num, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    intervalType = intervalType2;
                    str = str4;
                    str2 = str5;
                    m.add(Row.ADAPTER.decode(protoReader));
                    decode = str3;
                    intervalType2 = intervalType;
                    str5 = str2;
                    str4 = str;
                    break;
                case 3:
                    intervalType = intervalType2;
                    str = str4;
                    str2 = str5;
                    arrayList.add(DatetimeInterval.ADAPTER.decode(protoReader));
                    decode = str3;
                    intervalType2 = intervalType;
                    str5 = str2;
                    str4 = str;
                    break;
                case 4:
                    intervalType = intervalType2;
                    str = str4;
                    str2 = str5;
                    arrayList2.add(DatetimeInterval.ADAPTER.decode(protoReader));
                    decode = str3;
                    intervalType2 = intervalType;
                    str5 = str2;
                    str4 = str;
                    break;
                case 5:
                    obj = TransactorKt.decodeMessageOrMerge(DatetimeInterval.ADAPTER, protoReader, obj);
                    decode = str3;
                    break;
                case 6:
                    try {
                        intervalType2 = GetShiftsOverviewResponse.IntervalType.ADAPTER.decode(protoReader);
                        decode = str3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        intervalType = intervalType2;
                        str = str4;
                        str2 = str5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 7:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 8:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 9:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    decode = str3;
                    break;
                case 10:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    decode = str3;
                    break;
                case 11:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    decode = str3;
                    break;
                case 12:
                    num = ProtoAdapter.UINT32.decode(protoReader);
                    decode = str3;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    intervalType = intervalType2;
                    str = str4;
                    str2 = str5;
                    decode = str3;
                    intervalType2 = intervalType;
                    str5 = str2;
                    str4 = str;
                    break;
            }
            str3 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetShiftsOverviewResponse getShiftsOverviewResponse = (GetShiftsOverviewResponse) obj;
        reverseProtoWriter.getClass();
        getShiftsOverviewResponse.getClass();
        reverseProtoWriter.writeBytes(getShiftsOverviewResponse.unknownFields());
        ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 12, getShiftsOverviewResponse.total_timecards);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, getShiftsOverviewResponse.total_commissions);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, getShiftsOverviewResponse.total_estimated_pay);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, getShiftsOverviewResponse.total_tips);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, getShiftsOverviewResponse.total_hours_scheduled);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, getShiftsOverviewResponse.total_hours_worked);
        GetShiftsOverviewResponse.IntervalType.ADAPTER.encodeWithTag(reverseProtoWriter, 6, getShiftsOverviewResponse.interval_type);
        ProtoAdapter protoAdapter3 = DatetimeInterval.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, getShiftsOverviewResponse.current_interval);
        protoAdapter3.asRepeated().encodeWithTag(reverseProtoWriter, 4, getShiftsOverviewResponse.next_intervals);
        protoAdapter3.asRepeated().encodeWithTag(reverseProtoWriter, 3, getShiftsOverviewResponse.previous_intervals);
        Row.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, getShiftsOverviewResponse.rows);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getShiftsOverviewResponse.workweek_start);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetShiftsOverviewResponse getShiftsOverviewResponse = (GetShiftsOverviewResponse) obj;
        getShiftsOverviewResponse.getClass();
        int size$okio = getShiftsOverviewResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = Row.ADAPTER.asRepeated().encodedSizeWithTag(2, getShiftsOverviewResponse.rows) + protoAdapter.encodedSizeWithTag(1, getShiftsOverviewResponse.workweek_start) + size$okio;
        ProtoAdapter protoAdapter2 = DatetimeInterval.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(8, getShiftsOverviewResponse.total_hours_scheduled) + protoAdapter.encodedSizeWithTag(7, getShiftsOverviewResponse.total_hours_worked) + GetShiftsOverviewResponse.IntervalType.ADAPTER.encodedSizeWithTag(6, getShiftsOverviewResponse.interval_type) + protoAdapter2.encodedSizeWithTag(5, getShiftsOverviewResponse.current_interval) + protoAdapter2.asRepeated().encodedSizeWithTag(4, getShiftsOverviewResponse.next_intervals) + protoAdapter2.asRepeated().encodedSizeWithTag(3, getShiftsOverviewResponse.previous_intervals) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = Money.ADAPTER;
        return ProtoAdapter.UINT32.encodedSizeWithTag(12, getShiftsOverviewResponse.total_timecards) + protoAdapter3.encodedSizeWithTag(11, getShiftsOverviewResponse.total_commissions) + protoAdapter3.encodedSizeWithTag(10, getShiftsOverviewResponse.total_estimated_pay) + protoAdapter3.encodedSizeWithTag(9, getShiftsOverviewResponse.total_tips) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetShiftsOverviewResponse getShiftsOverviewResponse = (GetShiftsOverviewResponse) obj;
        getShiftsOverviewResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getShiftsOverviewResponse.rows, Row.ADAPTER);
        List list = getShiftsOverviewResponse.previous_intervals;
        ProtoAdapter protoAdapter = DatetimeInterval.ADAPTER;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(getShiftsOverviewResponse.next_intervals, protoAdapter);
        DatetimeInterval datetimeInterval = getShiftsOverviewResponse.current_interval;
        DatetimeInterval datetimeInterval2 = datetimeInterval != null ? (DatetimeInterval) protoAdapter.redact(datetimeInterval) : null;
        Money money = getShiftsOverviewResponse.total_tips;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = getShiftsOverviewResponse.total_estimated_pay;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = getShiftsOverviewResponse.total_commissions;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = getShiftsOverviewResponse.workweek_start;
        GetShiftsOverviewResponse.IntervalType intervalType = getShiftsOverviewResponse.interval_type;
        String str2 = getShiftsOverviewResponse.total_hours_worked;
        String str3 = getShiftsOverviewResponse.total_hours_scheduled;
        Integer num = getShiftsOverviewResponse.total_timecards;
        byteString.getClass();
        return new GetShiftsOverviewResponse(str, m1169redactElements, m1169redactElements2, m1169redactElements3, datetimeInterval2, intervalType, str2, str3, money2, money4, money6, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetShiftsOverviewResponse getShiftsOverviewResponse = (GetShiftsOverviewResponse) obj;
        getShiftsOverviewResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, getShiftsOverviewResponse.workweek_start);
        Row.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getShiftsOverviewResponse.rows);
        ProtoAdapter protoAdapter2 = DatetimeInterval.ADAPTER;
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 3, getShiftsOverviewResponse.previous_intervals);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, getShiftsOverviewResponse.next_intervals);
        protoAdapter2.encodeWithTag(protoWriter, 5, getShiftsOverviewResponse.current_interval);
        GetShiftsOverviewResponse.IntervalType.ADAPTER.encodeWithTag(protoWriter, 6, getShiftsOverviewResponse.interval_type);
        protoAdapter.encodeWithTag(protoWriter, 7, getShiftsOverviewResponse.total_hours_worked);
        protoAdapter.encodeWithTag(protoWriter, 8, getShiftsOverviewResponse.total_hours_scheduled);
        ProtoAdapter protoAdapter3 = Money.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 9, getShiftsOverviewResponse.total_tips);
        protoAdapter3.encodeWithTag(protoWriter, 10, getShiftsOverviewResponse.total_estimated_pay);
        protoAdapter3.encodeWithTag(protoWriter, 11, getShiftsOverviewResponse.total_commissions);
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 12, getShiftsOverviewResponse.total_timecards);
        protoWriter.writeBytes(getShiftsOverviewResponse.unknownFields());
    }
}
