package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class EarningsTrackerDataResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002f. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj12 = obj8;
            if (nextTag == -1) {
                return new EarningsTrackerDataResponse(m, arrayList, arrayList2, (Trend) obj2, (Money) obj4, (Money) obj5, (Integer) obj3, arrayList3, (Money) obj6, (ResponseContext) obj7, (Integer) obj12, (Integer) obj9, (Integer) obj10, (Integer) obj11, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    m.add(DailyData.ADAPTER.decode(protoReader));
                    obj = obj3;
                    obj8 = obj12;
                    break;
                case 2:
                    arrayList.add(MonthlyData.ADAPTER.decode(protoReader));
                    obj = obj3;
                    obj8 = obj12;
                    break;
                case 3:
                    arrayList2.add(YearlyData.ADAPTER.decode(protoReader));
                    obj = obj3;
                    obj8 = obj12;
                    break;
                case 4:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    obj8 = obj12;
                    break;
                case 5:
                    obj2 = TransactorKt.decodeMessageOrMerge(Trend.ADAPTER, protoReader, obj2);
                    obj = obj3;
                    obj8 = obj12;
                    break;
                case 6:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    obj = obj3;
                    obj8 = obj12;
                    break;
                case 7:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    obj = obj3;
                    obj8 = obj12;
                    break;
                case 8:
                    obj = ProtoAdapter.INT32.decode(protoReader);
                    obj8 = obj12;
                    break;
                case 9:
                    arrayList3.add(CustomerData.ADAPTER.decode(protoReader));
                    obj = obj3;
                    obj8 = obj12;
                    break;
                case 10:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    obj8 = obj12;
                    obj = obj3;
                    break;
                case 11:
                    obj7 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj7);
                    obj8 = obj12;
                    obj = obj3;
                    break;
                case 12:
                    obj8 = ProtoAdapter.INT32.decode(protoReader);
                    obj = obj3;
                    break;
                case 13:
                    obj9 = ProtoAdapter.INT32.decode(protoReader);
                    obj8 = obj12;
                    obj = obj3;
                    break;
                case 14:
                    obj10 = ProtoAdapter.INT32.decode(protoReader);
                    obj8 = obj12;
                    obj = obj3;
                    break;
                case 15:
                    obj11 = ProtoAdapter.INT32.decode(protoReader);
                    obj8 = obj12;
                    obj = obj3;
                    break;
            }
            obj3 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningsTrackerDataResponse earningsTrackerDataResponse = (EarningsTrackerDataResponse) obj;
        reverseProtoWriter.getClass();
        earningsTrackerDataResponse.getClass();
        reverseProtoWriter.writeBytes(earningsTrackerDataResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, earningsTrackerDataResponse.number_of_listings_transactions);
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, earningsTrackerDataResponse.number_of_ttp_transactions);
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, earningsTrackerDataResponse.number_of_cash_app_transactions);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, earningsTrackerDataResponse.ttl_in_ms);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 11, earningsTrackerDataResponse.response_context);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, earningsTrackerDataResponse.net_earnings);
        CustomerData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 9, earningsTrackerDataResponse.customer_data);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, earningsTrackerDataResponse.number_of_transactions);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, earningsTrackerDataResponse.total_earnings);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, earningsTrackerDataResponse.processing_fees);
        Trend.ADAPTER.encodeWithTag(reverseProtoWriter, 5, earningsTrackerDataResponse.trend);
        YearlyData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, earningsTrackerDataResponse.yearly_data);
        MonthlyData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, earningsTrackerDataResponse.monthly_data);
        DailyData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, earningsTrackerDataResponse.daily_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarningsTrackerDataResponse earningsTrackerDataResponse = (EarningsTrackerDataResponse) obj;
        earningsTrackerDataResponse.getClass();
        int encodedSizeWithTag = Trend.ADAPTER.encodedSizeWithTag(5, earningsTrackerDataResponse.trend) + YearlyData.ADAPTER.asRepeated().encodedSizeWithTag(3, earningsTrackerDataResponse.yearly_data) + MonthlyData.ADAPTER.asRepeated().encodedSizeWithTag(2, earningsTrackerDataResponse.monthly_data) + DailyData.ADAPTER.asRepeated().encodedSizeWithTag(1, earningsTrackerDataResponse.daily_data) + earningsTrackerDataResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(7, earningsTrackerDataResponse.total_earnings) + protoAdapter.encodedSizeWithTag(6, earningsTrackerDataResponse.processing_fees) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        return protoAdapter2.encodedSizeWithTag(15, earningsTrackerDataResponse.number_of_listings_transactions) + protoAdapter2.encodedSizeWithTag(14, earningsTrackerDataResponse.number_of_ttp_transactions) + protoAdapter2.encodedSizeWithTag(13, earningsTrackerDataResponse.number_of_cash_app_transactions) + protoAdapter2.encodedSizeWithTag(12, earningsTrackerDataResponse.ttl_in_ms) + ResponseContext.ADAPTER.encodedSizeWithTag(11, earningsTrackerDataResponse.response_context) + protoAdapter.encodedSizeWithTag(10, earningsTrackerDataResponse.net_earnings) + CustomerData.ADAPTER.asRepeated().encodedSizeWithTag(9, earningsTrackerDataResponse.customer_data) + protoAdapter2.encodedSizeWithTag(8, earningsTrackerDataResponse.number_of_transactions) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningsTrackerDataResponse earningsTrackerDataResponse = (EarningsTrackerDataResponse) obj;
        earningsTrackerDataResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(earningsTrackerDataResponse.daily_data, DailyData.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(earningsTrackerDataResponse.monthly_data, MonthlyData.ADAPTER);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(earningsTrackerDataResponse.yearly_data, YearlyData.ADAPTER);
        Trend trend = earningsTrackerDataResponse.trend;
        Trend trend2 = trend != null ? (Trend) Trend.ADAPTER.redact(trend) : null;
        Money money = earningsTrackerDataResponse.processing_fees;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = earningsTrackerDataResponse.total_earnings;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ArrayList m1169redactElements4 = TransactorKt.m1169redactElements(earningsTrackerDataResponse.customer_data, CustomerData.ADAPTER);
        Money money5 = earningsTrackerDataResponse.net_earnings;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        ResponseContext responseContext = earningsTrackerDataResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = earningsTrackerDataResponse.number_of_transactions;
        Integer num2 = earningsTrackerDataResponse.ttl_in_ms;
        Integer num3 = earningsTrackerDataResponse.number_of_cash_app_transactions;
        Integer num4 = earningsTrackerDataResponse.number_of_ttp_transactions;
        Integer num5 = earningsTrackerDataResponse.number_of_listings_transactions;
        byteString.getClass();
        return new EarningsTrackerDataResponse(m1169redactElements, m1169redactElements2, m1169redactElements3, trend2, money2, money4, num, m1169redactElements4, money6, responseContext2, num2, num3, num4, num5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningsTrackerDataResponse earningsTrackerDataResponse = (EarningsTrackerDataResponse) obj;
        earningsTrackerDataResponse.getClass();
        DailyData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, earningsTrackerDataResponse.daily_data);
        MonthlyData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, earningsTrackerDataResponse.monthly_data);
        YearlyData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, earningsTrackerDataResponse.yearly_data);
        Trend.ADAPTER.encodeWithTag(protoWriter, 5, earningsTrackerDataResponse.trend);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 6, earningsTrackerDataResponse.processing_fees);
        protoAdapter.encodeWithTag(protoWriter, 7, earningsTrackerDataResponse.total_earnings);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 8, earningsTrackerDataResponse.number_of_transactions);
        CustomerData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, earningsTrackerDataResponse.customer_data);
        protoAdapter.encodeWithTag(protoWriter, 10, earningsTrackerDataResponse.net_earnings);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 11, earningsTrackerDataResponse.response_context);
        protoAdapter2.encodeWithTag(protoWriter, 12, earningsTrackerDataResponse.ttl_in_ms);
        protoAdapter2.encodeWithTag(protoWriter, 13, earningsTrackerDataResponse.number_of_cash_app_transactions);
        protoAdapter2.encodeWithTag(protoWriter, 14, earningsTrackerDataResponse.number_of_ttp_transactions);
        protoAdapter2.encodeWithTag(protoWriter, 15, earningsTrackerDataResponse.number_of_listings_transactions);
        protoWriter.writeBytes(earningsTrackerDataResponse.unknownFields());
    }
}
