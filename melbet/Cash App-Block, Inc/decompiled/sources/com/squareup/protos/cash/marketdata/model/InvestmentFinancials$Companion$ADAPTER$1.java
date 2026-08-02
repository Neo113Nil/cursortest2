package com.squareup.protos.cash.marketdata.model;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.marketdata.model.InvestmentFinancials;
import com.squareup.protos.invest.ui.Section;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InvestmentFinancials$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InvestmentFinancials(m, arrayList, (Section.Row.MoreInfo) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(InvestmentFinancials.Revenue.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                arrayList.add(InvestmentFinancials.Revenue.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(Section.Row.MoreInfo.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvestmentFinancials investmentFinancials = (InvestmentFinancials) obj;
        reverseProtoWriter.getClass();
        investmentFinancials.getClass();
        reverseProtoWriter.writeBytes(investmentFinancials.unknownFields());
        Section.Row.MoreInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 3, investmentFinancials.more_info);
        ProtoAdapter protoAdapter = InvestmentFinancials.Revenue.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, investmentFinancials.quarters);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 1, investmentFinancials.years);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestmentFinancials investmentFinancials = (InvestmentFinancials) obj;
        investmentFinancials.getClass();
        int size$okio = investmentFinancials.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = InvestmentFinancials.Revenue.ADAPTER;
        return Section.Row.MoreInfo.ADAPTER.encodedSizeWithTag(3, investmentFinancials.more_info) + protoAdapter.asRepeated().encodedSizeWithTag(2, investmentFinancials.quarters) + protoAdapter.asRepeated().encodedSizeWithTag(1, investmentFinancials.years) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestmentFinancials investmentFinancials = (InvestmentFinancials) obj;
        investmentFinancials.getClass();
        List list = investmentFinancials.years;
        ProtoAdapter protoAdapter = InvestmentFinancials.Revenue.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(investmentFinancials.quarters, protoAdapter);
        Section.Row.MoreInfo moreInfo = investmentFinancials.more_info;
        Section.Row.MoreInfo moreInfo2 = moreInfo != null ? (Section.Row.MoreInfo) Section.Row.MoreInfo.ADAPTER.redact(moreInfo) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InvestmentFinancials(m1169redactElements, m1169redactElements2, moreInfo2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestmentFinancials investmentFinancials = (InvestmentFinancials) obj;
        investmentFinancials.getClass();
        ProtoAdapter protoAdapter = InvestmentFinancials.Revenue.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, investmentFinancials.years);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, investmentFinancials.quarters);
        Section.Row.MoreInfo.ADAPTER.encodeWithTag(protoWriter, 3, investmentFinancials.more_info);
        protoWriter.writeBytes(investmentFinancials.unknownFields());
    }
}
