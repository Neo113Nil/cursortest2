package com.squareup.protos.cash.marketdata.model;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.invest.ui.Section;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InvestmentAnalystOpinions$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new InvestmentAnalystOpinions((String) obj, (Integer) obj2, m, (Integer) obj3, (Section.Row.MoreInfo) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.UINT32.decode(protoReader);
            } else if (nextTag == 3) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 4) {
                obj3 = ProtoAdapter.UINT32.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Section.Row.MoreInfo.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvestmentAnalystOpinions investmentAnalystOpinions = (InvestmentAnalystOpinions) obj;
        reverseProtoWriter.getClass();
        investmentAnalystOpinions.getClass();
        reverseProtoWriter.writeBytes(investmentAnalystOpinions.unknownFields());
        Section.Row.MoreInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 5, investmentAnalystOpinions.more_info);
        ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, investmentAnalystOpinions.analyst_count);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 3, investmentAnalystOpinions.graph_labels);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, investmentAnalystOpinions.score);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, investmentAnalystOpinions.recommendation_label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestmentAnalystOpinions investmentAnalystOpinions = (InvestmentAnalystOpinions) obj;
        investmentAnalystOpinions.getClass();
        int size$okio = investmentAnalystOpinions.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, investmentAnalystOpinions.recommendation_label) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.UINT32;
        return Section.Row.MoreInfo.ADAPTER.encodedSizeWithTag(5, investmentAnalystOpinions.more_info) + protoAdapter2.encodedSizeWithTag(4, investmentAnalystOpinions.analyst_count) + protoAdapter.asRepeated().encodedSizeWithTag(3, investmentAnalystOpinions.graph_labels) + protoAdapter2.encodedSizeWithTag(2, investmentAnalystOpinions.score) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestmentAnalystOpinions investmentAnalystOpinions = (InvestmentAnalystOpinions) obj;
        investmentAnalystOpinions.getClass();
        Section.Row.MoreInfo moreInfo = investmentAnalystOpinions.more_info;
        Section.Row.MoreInfo moreInfo2 = moreInfo != null ? (Section.Row.MoreInfo) Section.Row.MoreInfo.ADAPTER.redact(moreInfo) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = investmentAnalystOpinions.recommendation_label;
        Integer num = investmentAnalystOpinions.score;
        List list = investmentAnalystOpinions.graph_labels;
        Integer num2 = investmentAnalystOpinions.analyst_count;
        list.getClass();
        byteString.getClass();
        return new InvestmentAnalystOpinions(str, num, list, num2, moreInfo2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestmentAnalystOpinions investmentAnalystOpinions = (InvestmentAnalystOpinions) obj;
        investmentAnalystOpinions.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, investmentAnalystOpinions.recommendation_label);
        ProtoAdapter protoAdapter2 = ProtoAdapter.UINT32;
        protoAdapter2.encodeWithTag(protoWriter, 2, investmentAnalystOpinions.score);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, investmentAnalystOpinions.graph_labels);
        protoAdapter2.encodeWithTag(protoWriter, 4, investmentAnalystOpinions.analyst_count);
        Section.Row.MoreInfo.ADAPTER.encodeWithTag(protoWriter, 5, investmentAnalystOpinions.more_info);
        protoWriter.writeBytes(investmentAnalystOpinions.unknownFields());
    }
}
