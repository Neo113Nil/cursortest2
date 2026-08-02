package com.squareup.protos.cash.marketdata.server;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.marketdata.model.InvestmentAnalystOpinions;
import com.squareup.protos.cash.marketdata.model.InvestmentEarnings;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityStats;
import com.squareup.protos.cash.marketdata.model.InvestmentFinancials;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetInvestingMetricsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetInvestingMetricsResponse((Long) obj, (InvestmentEntityStats) obj2, (InvestmentFinancials) obj3, (InvestmentEarnings) obj4, (InvestmentAnalystOpinions) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(InvestmentEntityStats.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(InvestmentFinancials.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(InvestmentEarnings.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(InvestmentAnalystOpinions.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetInvestingMetricsResponse getInvestingMetricsResponse = (GetInvestingMetricsResponse) obj;
        reverseProtoWriter.getClass();
        getInvestingMetricsResponse.getClass();
        reverseProtoWriter.writeBytes(getInvestingMetricsResponse.unknownFields());
        InvestmentAnalystOpinions.ADAPTER.encodeWithTag(reverseProtoWriter, 5, getInvestingMetricsResponse.opinions);
        InvestmentEarnings.ADAPTER.encodeWithTag(reverseProtoWriter, 4, getInvestingMetricsResponse.earnings);
        InvestmentFinancials.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getInvestingMetricsResponse.financials);
        InvestmentEntityStats.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getInvestingMetricsResponse.stats);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, getInvestingMetricsResponse.next_refresh_ms);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetInvestingMetricsResponse getInvestingMetricsResponse = (GetInvestingMetricsResponse) obj;
        getInvestingMetricsResponse.getClass();
        return InvestmentAnalystOpinions.ADAPTER.encodedSizeWithTag(5, getInvestingMetricsResponse.opinions) + InvestmentEarnings.ADAPTER.encodedSizeWithTag(4, getInvestingMetricsResponse.earnings) + InvestmentFinancials.ADAPTER.encodedSizeWithTag(3, getInvestingMetricsResponse.financials) + InvestmentEntityStats.ADAPTER.encodedSizeWithTag(2, getInvestingMetricsResponse.stats) + ProtoAdapter.INT64.encodedSizeWithTag(1, getInvestingMetricsResponse.next_refresh_ms) + getInvestingMetricsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetInvestingMetricsResponse getInvestingMetricsResponse = (GetInvestingMetricsResponse) obj;
        getInvestingMetricsResponse.getClass();
        InvestmentEntityStats investmentEntityStats = getInvestingMetricsResponse.stats;
        InvestmentEntityStats investmentEntityStats2 = investmentEntityStats != null ? (InvestmentEntityStats) InvestmentEntityStats.ADAPTER.redact(investmentEntityStats) : null;
        InvestmentFinancials investmentFinancials = getInvestingMetricsResponse.financials;
        InvestmentFinancials investmentFinancials2 = investmentFinancials != null ? (InvestmentFinancials) InvestmentFinancials.ADAPTER.redact(investmentFinancials) : null;
        InvestmentEarnings investmentEarnings = getInvestingMetricsResponse.earnings;
        InvestmentEarnings investmentEarnings2 = investmentEarnings != null ? (InvestmentEarnings) InvestmentEarnings.ADAPTER.redact(investmentEarnings) : null;
        InvestmentAnalystOpinions investmentAnalystOpinions = getInvestingMetricsResponse.opinions;
        return GetInvestingMetricsResponse.copy$default(getInvestingMetricsResponse, investmentEntityStats2, investmentFinancials2, investmentEarnings2, investmentAnalystOpinions != null ? (InvestmentAnalystOpinions) InvestmentAnalystOpinions.ADAPTER.redact(investmentAnalystOpinions) : null, ByteString.EMPTY, 1);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetInvestingMetricsResponse getInvestingMetricsResponse = (GetInvestingMetricsResponse) obj;
        getInvestingMetricsResponse.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getInvestingMetricsResponse.next_refresh_ms);
        InvestmentEntityStats.ADAPTER.encodeWithTag(protoWriter, 2, getInvestingMetricsResponse.stats);
        InvestmentFinancials.ADAPTER.encodeWithTag(protoWriter, 3, getInvestingMetricsResponse.financials);
        InvestmentEarnings.ADAPTER.encodeWithTag(protoWriter, 4, getInvestingMetricsResponse.earnings);
        InvestmentAnalystOpinions.ADAPTER.encodeWithTag(protoWriter, 5, getInvestingMetricsResponse.opinions);
        protoWriter.writeBytes(getInvestingMetricsResponse.unknownFields());
    }
}
