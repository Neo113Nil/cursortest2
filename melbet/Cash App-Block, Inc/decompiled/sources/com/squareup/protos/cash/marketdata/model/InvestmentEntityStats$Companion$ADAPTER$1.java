package com.squareup.protos.cash.marketdata.model;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityStats;
import com.squareup.protos.invest.ui.Section;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InvestmentEntityStats$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new InvestmentEntityStats((Long) obj, m, (String) obj2, (InvestmentEntityStats.InvestmentEntityStatsDetails) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(Section.Row.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(InvestmentEntityStats.InvestmentEntityStatsDetails.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvestmentEntityStats investmentEntityStats = (InvestmentEntityStats) obj;
        reverseProtoWriter.getClass();
        investmentEntityStats.getClass();
        reverseProtoWriter.writeBytes(investmentEntityStats.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, investmentEntityStats.num_equity_screen_stats);
        InvestmentEntityStats.InvestmentEntityStatsDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 4, investmentEntityStats.details);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, investmentEntityStats.title);
        Section.Row.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, investmentEntityStats.rows);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, investmentEntityStats.stats_per_page);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestmentEntityStats investmentEntityStats = (InvestmentEntityStats) obj;
        investmentEntityStats.getClass();
        int size$okio = investmentEntityStats.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(5, investmentEntityStats.num_equity_screen_stats) + InvestmentEntityStats.InvestmentEntityStatsDetails.ADAPTER.encodedSizeWithTag(4, investmentEntityStats.details) + ProtoAdapter.STRING.encodedSizeWithTag(3, investmentEntityStats.title) + Section.Row.ADAPTER.asRepeated().encodedSizeWithTag(2, investmentEntityStats.rows) + protoAdapter.encodedSizeWithTag(1, investmentEntityStats.stats_per_page) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestmentEntityStats investmentEntityStats = (InvestmentEntityStats) obj;
        investmentEntityStats.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(investmentEntityStats.rows, Section.Row.ADAPTER);
        InvestmentEntityStats.InvestmentEntityStatsDetails investmentEntityStatsDetails = investmentEntityStats.details;
        return InvestmentEntityStats.copy$default(investmentEntityStats, m1169redactElements, investmentEntityStatsDetails != null ? (InvestmentEntityStats.InvestmentEntityStatsDetails) InvestmentEntityStats.InvestmentEntityStatsDetails.ADAPTER.redact(investmentEntityStatsDetails) : null, ByteString.EMPTY, 21);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestmentEntityStats investmentEntityStats = (InvestmentEntityStats) obj;
        investmentEntityStats.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, investmentEntityStats.stats_per_page);
        Section.Row.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, investmentEntityStats.rows);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, investmentEntityStats.title);
        InvestmentEntityStats.InvestmentEntityStatsDetails.ADAPTER.encodeWithTag(protoWriter, 4, investmentEntityStats.details);
        protoAdapter.encodeWithTag(protoWriter, 5, investmentEntityStats.num_equity_screen_stats);
        protoWriter.writeBytes(investmentEntityStats.unknownFields());
    }
}
