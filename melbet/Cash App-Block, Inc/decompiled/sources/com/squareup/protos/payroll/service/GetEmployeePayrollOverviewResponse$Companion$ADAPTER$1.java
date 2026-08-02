package com.squareup.protos.payroll.service;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.time.YearMonthDay;
import com.squareup.protos.teamapp.ui.Row;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetEmployeePayrollOverviewResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetEmployeePayrollOverviewResponse(m, (Money) obj, (Money) obj2, (YearMonthDay) obj3, (YearMonthDay) obj4, (String) obj5, (String) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    m.add(Row.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
                    break;
                case 3:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    break;
                case 4:
                    obj3 = TransactorKt.decodeMessageOrMerge(YearMonthDay.ADAPTER, protoReader, obj3);
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(YearMonthDay.ADAPTER, protoReader, obj4);
                    break;
                case 6:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEmployeePayrollOverviewResponse getEmployeePayrollOverviewResponse = (GetEmployeePayrollOverviewResponse) obj;
        reverseProtoWriter.getClass();
        getEmployeePayrollOverviewResponse.getClass();
        reverseProtoWriter.writeBytes(getEmployeePayrollOverviewResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, getEmployeePayrollOverviewResponse.next_stub_detail_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, getEmployeePayrollOverviewResponse.last_stub_detail_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, getEmployeePayrollOverviewResponse.stubs_list_url);
        ProtoAdapter protoAdapter2 = YearMonthDay.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, getEmployeePayrollOverviewResponse.next_pay_date);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, getEmployeePayrollOverviewResponse.last_pay_date);
        ProtoAdapter protoAdapter3 = Money.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, getEmployeePayrollOverviewResponse.last_pay_amount);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, getEmployeePayrollOverviewResponse.earnings_ytd);
        Row.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getEmployeePayrollOverviewResponse.rows);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEmployeePayrollOverviewResponse getEmployeePayrollOverviewResponse = (GetEmployeePayrollOverviewResponse) obj;
        getEmployeePayrollOverviewResponse.getClass();
        int encodedSizeWithTag = Row.ADAPTER.asRepeated().encodedSizeWithTag(1, getEmployeePayrollOverviewResponse.rows) + getEmployeePayrollOverviewResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, getEmployeePayrollOverviewResponse.last_pay_amount) + protoAdapter.encodedSizeWithTag(2, getEmployeePayrollOverviewResponse.earnings_ytd) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = YearMonthDay.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(5, getEmployeePayrollOverviewResponse.next_pay_date) + protoAdapter2.encodedSizeWithTag(4, getEmployeePayrollOverviewResponse.last_pay_date) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        return protoAdapter3.encodedSizeWithTag(8, getEmployeePayrollOverviewResponse.next_stub_detail_url) + protoAdapter3.encodedSizeWithTag(7, getEmployeePayrollOverviewResponse.last_stub_detail_url) + protoAdapter3.encodedSizeWithTag(6, getEmployeePayrollOverviewResponse.stubs_list_url) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEmployeePayrollOverviewResponse getEmployeePayrollOverviewResponse = (GetEmployeePayrollOverviewResponse) obj;
        getEmployeePayrollOverviewResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getEmployeePayrollOverviewResponse.rows, Row.ADAPTER);
        Money money = getEmployeePayrollOverviewResponse.earnings_ytd;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = getEmployeePayrollOverviewResponse.last_pay_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        YearMonthDay yearMonthDay = getEmployeePayrollOverviewResponse.last_pay_date;
        YearMonthDay yearMonthDay2 = yearMonthDay != null ? (YearMonthDay) YearMonthDay.ADAPTER.redact(yearMonthDay) : null;
        YearMonthDay yearMonthDay3 = getEmployeePayrollOverviewResponse.next_pay_date;
        YearMonthDay yearMonthDay4 = yearMonthDay3 != null ? (YearMonthDay) YearMonthDay.ADAPTER.redact(yearMonthDay3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = getEmployeePayrollOverviewResponse.stubs_list_url;
        String str2 = getEmployeePayrollOverviewResponse.last_stub_detail_url;
        String str3 = getEmployeePayrollOverviewResponse.next_stub_detail_url;
        byteString.getClass();
        return new GetEmployeePayrollOverviewResponse(m1169redactElements, money2, money4, yearMonthDay2, yearMonthDay4, str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEmployeePayrollOverviewResponse getEmployeePayrollOverviewResponse = (GetEmployeePayrollOverviewResponse) obj;
        getEmployeePayrollOverviewResponse.getClass();
        Row.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getEmployeePayrollOverviewResponse.rows);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, getEmployeePayrollOverviewResponse.earnings_ytd);
        protoAdapter.encodeWithTag(protoWriter, 3, getEmployeePayrollOverviewResponse.last_pay_amount);
        ProtoAdapter protoAdapter2 = YearMonthDay.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, getEmployeePayrollOverviewResponse.last_pay_date);
        protoAdapter2.encodeWithTag(protoWriter, 5, getEmployeePayrollOverviewResponse.next_pay_date);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(protoWriter, 6, getEmployeePayrollOverviewResponse.stubs_list_url);
        protoAdapter3.encodeWithTag(protoWriter, 7, getEmployeePayrollOverviewResponse.last_stub_detail_url);
        protoAdapter3.encodeWithTag(protoWriter, 8, getEmployeePayrollOverviewResponse.next_stub_detail_url);
        protoWriter.writeBytes(getEmployeePayrollOverviewResponse.unknownFields());
    }
}
