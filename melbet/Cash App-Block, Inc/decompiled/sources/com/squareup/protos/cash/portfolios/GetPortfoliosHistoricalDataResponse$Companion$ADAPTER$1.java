package com.squareup.protos.cash.portfolios;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.portfolios.syncvalues.PortfoliosHistoricalDataValue;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetPortfoliosHistoricalDataResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPortfoliosHistoricalDataResponse((BalanceHistory) obj, (Long) obj2, m, (PortfoliosHistoricalDataValue) obj3, (String) obj4, (Long) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BalanceHistory.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                switch (nextTag) {
                    case 30:
                        m.add(BalanceHistory.ADAPTER.decode(protoReader));
                        break;
                    case 31:
                        obj3 = TransactorKt.decodeMessageOrMerge(PortfoliosHistoricalDataValue.ADAPTER, protoReader, obj3);
                        break;
                    case 32:
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 33:
                        obj5 = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    default:
                        protoReader.readUnknownField(nextTag);
                        break;
                }
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPortfoliosHistoricalDataResponse getPortfoliosHistoricalDataResponse = (GetPortfoliosHistoricalDataResponse) obj;
        reverseProtoWriter.getClass();
        getPortfoliosHistoricalDataResponse.getClass();
        reverseProtoWriter.writeBytes(getPortfoliosHistoricalDataResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 33, getPortfoliosHistoricalDataResponse.version);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 32, getPortfoliosHistoricalDataResponse.entity_id);
        PortfoliosHistoricalDataValue.ADAPTER.encodeWithTag(reverseProtoWriter, 31, getPortfoliosHistoricalDataResponse.portfolios_historical_data_value);
        ProtoAdapter protoAdapter2 = BalanceHistory.ADAPTER;
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 30, getPortfoliosHistoricalDataResponse.comparison_balance_history);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getPortfoliosHistoricalDataResponse.next_refresh_ms);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getPortfoliosHistoricalDataResponse.balance_history);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPortfoliosHistoricalDataResponse getPortfoliosHistoricalDataResponse = (GetPortfoliosHistoricalDataResponse) obj;
        getPortfoliosHistoricalDataResponse.getClass();
        int size$okio = getPortfoliosHistoricalDataResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = BalanceHistory.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, getPortfoliosHistoricalDataResponse.balance_history) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return protoAdapter2.encodedSizeWithTag(33, getPortfoliosHistoricalDataResponse.version) + ProtoAdapter.STRING.encodedSizeWithTag(32, getPortfoliosHistoricalDataResponse.entity_id) + PortfoliosHistoricalDataValue.ADAPTER.encodedSizeWithTag(31, getPortfoliosHistoricalDataResponse.portfolios_historical_data_value) + protoAdapter.asRepeated().encodedSizeWithTag(30, getPortfoliosHistoricalDataResponse.comparison_balance_history) + protoAdapter2.encodedSizeWithTag(2, getPortfoliosHistoricalDataResponse.next_refresh_ms) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPortfoliosHistoricalDataResponse getPortfoliosHistoricalDataResponse = (GetPortfoliosHistoricalDataResponse) obj;
        getPortfoliosHistoricalDataResponse.getClass();
        BalanceHistory balanceHistory = getPortfoliosHistoricalDataResponse.balance_history;
        BalanceHistory balanceHistory2 = balanceHistory != null ? (BalanceHistory) BalanceHistory.ADAPTER.redact(balanceHistory) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getPortfoliosHistoricalDataResponse.comparison_balance_history, BalanceHistory.ADAPTER);
        PortfoliosHistoricalDataValue portfoliosHistoricalDataValue = getPortfoliosHistoricalDataResponse.portfolios_historical_data_value;
        PortfoliosHistoricalDataValue portfoliosHistoricalDataValue2 = portfoliosHistoricalDataValue != null ? (PortfoliosHistoricalDataValue) PortfoliosHistoricalDataValue.ADAPTER.redact(portfoliosHistoricalDataValue) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = getPortfoliosHistoricalDataResponse.next_refresh_ms;
        String str = getPortfoliosHistoricalDataResponse.entity_id;
        Long l2 = getPortfoliosHistoricalDataResponse.version;
        byteString.getClass();
        return new GetPortfoliosHistoricalDataResponse(balanceHistory2, l, m1169redactElements, portfoliosHistoricalDataValue2, str, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPortfoliosHistoricalDataResponse getPortfoliosHistoricalDataResponse = (GetPortfoliosHistoricalDataResponse) obj;
        getPortfoliosHistoricalDataResponse.getClass();
        ProtoAdapter protoAdapter = BalanceHistory.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, getPortfoliosHistoricalDataResponse.balance_history);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, getPortfoliosHistoricalDataResponse.next_refresh_ms);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 30, getPortfoliosHistoricalDataResponse.comparison_balance_history);
        PortfoliosHistoricalDataValue.ADAPTER.encodeWithTag(protoWriter, 31, getPortfoliosHistoricalDataResponse.portfolios_historical_data_value);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 32, getPortfoliosHistoricalDataResponse.entity_id);
        protoAdapter2.encodeWithTag(protoWriter, 33, getPortfoliosHistoricalDataResponse.version);
        protoWriter.writeBytes(getPortfoliosHistoricalDataResponse.unknownFields());
    }
}
