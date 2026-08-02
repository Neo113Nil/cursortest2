package com.squareup.protos.cash.marketdata.model;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.marketdata.model.InvestmentEarnings;
import com.squareup.protos.invest.ui.Section;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InvestmentEarnings$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InvestmentEarnings(m, (Section.Row.MoreInfo) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(InvestmentEarnings.Earning.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(Section.Row.MoreInfo.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvestmentEarnings investmentEarnings = (InvestmentEarnings) obj;
        reverseProtoWriter.getClass();
        investmentEarnings.getClass();
        reverseProtoWriter.writeBytes(investmentEarnings.unknownFields());
        Section.Row.MoreInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 2, investmentEarnings.more_info);
        InvestmentEarnings.Earning.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, investmentEarnings.earnings);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestmentEarnings investmentEarnings = (InvestmentEarnings) obj;
        investmentEarnings.getClass();
        return Section.Row.MoreInfo.ADAPTER.encodedSizeWithTag(2, investmentEarnings.more_info) + InvestmentEarnings.Earning.ADAPTER.asRepeated().encodedSizeWithTag(1, investmentEarnings.earnings) + investmentEarnings.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestmentEarnings investmentEarnings = (InvestmentEarnings) obj;
        investmentEarnings.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(investmentEarnings.earnings, InvestmentEarnings.Earning.ADAPTER);
        Section.Row.MoreInfo moreInfo = investmentEarnings.more_info;
        Section.Row.MoreInfo moreInfo2 = moreInfo != null ? (Section.Row.MoreInfo) Section.Row.MoreInfo.ADAPTER.redact(moreInfo) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InvestmentEarnings(m1169redactElements, moreInfo2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestmentEarnings investmentEarnings = (InvestmentEarnings) obj;
        investmentEarnings.getClass();
        InvestmentEarnings.Earning.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, investmentEarnings.earnings);
        Section.Row.MoreInfo.ADAPTER.encodeWithTag(protoWriter, 2, investmentEarnings.more_info);
        protoWriter.writeBytes(investmentEarnings.unknownFields());
    }
}
