package com.squareup.protos.cash.marketprices.service;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.marketprices.PriceTick;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetInvestmentEntityHistoricalDataResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
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
                return new GetInvestmentEntityHistoricalDataResponse((Long) obj, (Long) obj2, (CurrencyCode) obj3, m, (Long) obj4, (Long) obj5, (Long) obj6, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag != 80) {
                switch (nextTag) {
                    case 1:
                        obj = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 2:
                        obj2 = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        try {
                            obj3 = CurrencyCode.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    case 4:
                        m.add(PriceTick.ADAPTER.decode(protoReader));
                        break;
                    case 5:
                        obj4 = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 6:
                        obj5 = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 7:
                        obj6 = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    default:
                        protoReader.readUnknownField(nextTag);
                        break;
                }
            } else {
                arrayList.add(PriceTick.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetInvestmentEntityHistoricalDataResponse getInvestmentEntityHistoricalDataResponse = (GetInvestmentEntityHistoricalDataResponse) obj;
        reverseProtoWriter.getClass();
        getInvestmentEntityHistoricalDataResponse.getClass();
        reverseProtoWriter.writeBytes(getInvestmentEntityHistoricalDataResponse.unknownFields());
        ProtoAdapter protoAdapter = PriceTick.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 80, getInvestmentEntityHistoricalDataResponse.comparison_price_ticks);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, getInvestmentEntityHistoricalDataResponse.next_refresh_ms);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, getInvestmentEntityHistoricalDataResponse.end_time);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, getInvestmentEntityHistoricalDataResponse.prior_trading_day_price_cents);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 4, getInvestmentEntityHistoricalDataResponse.price_ticks);
        CurrencyCode.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getInvestmentEntityHistoricalDataResponse.base_currency_code);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getInvestmentEntityHistoricalDataResponse.tick_frequency_ms);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getInvestmentEntityHistoricalDataResponse.start_time);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetInvestmentEntityHistoricalDataResponse getInvestmentEntityHistoricalDataResponse = (GetInvestmentEntityHistoricalDataResponse) obj;
        getInvestmentEntityHistoricalDataResponse.getClass();
        int size$okio = getInvestmentEntityHistoricalDataResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = CurrencyCode.ADAPTER.encodedSizeWithTag(3, getInvestmentEntityHistoricalDataResponse.base_currency_code) + protoAdapter.encodedSizeWithTag(2, getInvestmentEntityHistoricalDataResponse.tick_frequency_ms) + protoAdapter.encodedSizeWithTag(1, getInvestmentEntityHistoricalDataResponse.start_time) + size$okio;
        ProtoAdapter protoAdapter2 = PriceTick.ADAPTER;
        return protoAdapter2.asRepeated().encodedSizeWithTag(80, getInvestmentEntityHistoricalDataResponse.comparison_price_ticks) + protoAdapter.encodedSizeWithTag(7, getInvestmentEntityHistoricalDataResponse.next_refresh_ms) + protoAdapter.encodedSizeWithTag(6, getInvestmentEntityHistoricalDataResponse.end_time) + protoAdapter.encodedSizeWithTag(5, getInvestmentEntityHistoricalDataResponse.prior_trading_day_price_cents) + protoAdapter2.asRepeated().encodedSizeWithTag(4, getInvestmentEntityHistoricalDataResponse.price_ticks) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetInvestmentEntityHistoricalDataResponse getInvestmentEntityHistoricalDataResponse = (GetInvestmentEntityHistoricalDataResponse) obj;
        getInvestmentEntityHistoricalDataResponse.getClass();
        List list = getInvestmentEntityHistoricalDataResponse.price_ticks;
        ProtoAdapter protoAdapter = PriceTick.ADAPTER;
        return GetInvestmentEntityHistoricalDataResponse.copy$default(getInvestmentEntityHistoricalDataResponse, TransactorKt.m1169redactElements(list, protoAdapter), TransactorKt.m1169redactElements(getInvestmentEntityHistoricalDataResponse.comparison_price_ticks, protoAdapter), ByteString.EMPTY, 119);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetInvestmentEntityHistoricalDataResponse getInvestmentEntityHistoricalDataResponse = (GetInvestmentEntityHistoricalDataResponse) obj;
        getInvestmentEntityHistoricalDataResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, getInvestmentEntityHistoricalDataResponse.start_time);
        protoAdapter.encodeWithTag(protoWriter, 2, getInvestmentEntityHistoricalDataResponse.tick_frequency_ms);
        CurrencyCode.ADAPTER.encodeWithTag(protoWriter, 3, getInvestmentEntityHistoricalDataResponse.base_currency_code);
        ProtoAdapter protoAdapter2 = PriceTick.ADAPTER;
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, getInvestmentEntityHistoricalDataResponse.price_ticks);
        protoAdapter.encodeWithTag(protoWriter, 5, getInvestmentEntityHistoricalDataResponse.prior_trading_day_price_cents);
        protoAdapter.encodeWithTag(protoWriter, 6, getInvestmentEntityHistoricalDataResponse.end_time);
        protoAdapter.encodeWithTag(protoWriter, 7, getInvestmentEntityHistoricalDataResponse.next_refresh_ms);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 80, getInvestmentEntityHistoricalDataResponse.comparison_price_ticks);
        protoWriter.writeBytes(getInvestmentEntityHistoricalDataResponse.unknownFields());
    }
}
