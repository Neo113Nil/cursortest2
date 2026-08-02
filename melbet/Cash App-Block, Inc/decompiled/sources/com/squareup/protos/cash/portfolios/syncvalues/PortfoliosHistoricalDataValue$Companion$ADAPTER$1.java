package com.squareup.protos.cash.portfolios.syncvalues;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PortfoliosHistoricalDataValue$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PortfoliosHistoricalDataValue((BalanceHistory) obj, (Long) obj2, (HistoricalRange) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BalanceHistory.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj3 = HistoricalRange.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 30) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(BalanceHistory.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PortfoliosHistoricalDataValue portfoliosHistoricalDataValue = (PortfoliosHistoricalDataValue) obj;
        reverseProtoWriter.getClass();
        portfoliosHistoricalDataValue.getClass();
        reverseProtoWriter.writeBytes(portfoliosHistoricalDataValue.unknownFields());
        ProtoAdapter protoAdapter = BalanceHistory.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 30, portfoliosHistoricalDataValue.comparison_balance_history);
        HistoricalRange.ADAPTER.encodeWithTag(reverseProtoWriter, 3, portfoliosHistoricalDataValue.historical_range);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, portfoliosHistoricalDataValue.next_refresh_ms);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, portfoliosHistoricalDataValue.balance_history);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PortfoliosHistoricalDataValue portfoliosHistoricalDataValue = (PortfoliosHistoricalDataValue) obj;
        portfoliosHistoricalDataValue.getClass();
        int size$okio = portfoliosHistoricalDataValue.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = BalanceHistory.ADAPTER;
        return protoAdapter.asRepeated().encodedSizeWithTag(30, portfoliosHistoricalDataValue.comparison_balance_history) + HistoricalRange.ADAPTER.encodedSizeWithTag(3, portfoliosHistoricalDataValue.historical_range) + ProtoAdapter.INT64.encodedSizeWithTag(2, portfoliosHistoricalDataValue.next_refresh_ms) + protoAdapter.encodedSizeWithTag(1, portfoliosHistoricalDataValue.balance_history) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PortfoliosHistoricalDataValue portfoliosHistoricalDataValue = (PortfoliosHistoricalDataValue) obj;
        portfoliosHistoricalDataValue.getClass();
        BalanceHistory balanceHistory = portfoliosHistoricalDataValue.balance_history;
        BalanceHistory balanceHistory2 = balanceHistory != null ? (BalanceHistory) BalanceHistory.ADAPTER.redact(balanceHistory) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(portfoliosHistoricalDataValue.comparison_balance_history, BalanceHistory.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Long l = portfoliosHistoricalDataValue.next_refresh_ms;
        HistoricalRange historicalRange = portfoliosHistoricalDataValue.historical_range;
        byteString.getClass();
        return new PortfoliosHistoricalDataValue(balanceHistory2, l, historicalRange, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PortfoliosHistoricalDataValue portfoliosHistoricalDataValue = (PortfoliosHistoricalDataValue) obj;
        portfoliosHistoricalDataValue.getClass();
        ProtoAdapter protoAdapter = BalanceHistory.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, portfoliosHistoricalDataValue.balance_history);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, portfoliosHistoricalDataValue.next_refresh_ms);
        HistoricalRange.ADAPTER.encodeWithTag(protoWriter, 3, portfoliosHistoricalDataValue.historical_range);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 30, portfoliosHistoricalDataValue.comparison_balance_history);
        protoWriter.writeBytes(portfoliosHistoricalDataValue.unknownFields());
    }
}
