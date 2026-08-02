package com.squareup.lending;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.lending.app_support.AppSupport;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreHomeData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashCreditScoreHomeData(m, (CashCreditScoreHomeData.TitleBar) obj, (CashCreditScoreHomeData.ScoreSummary) obj2, arrayList, (CashCreditScoreHomeData.DisclaimerSection) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AppSupport.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(CashCreditScoreHomeData.TitleBar.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(CashCreditScoreHomeData.ScoreSummary.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                arrayList.add(CashCreditScoreHomeData.InfoSection.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(CashCreditScoreHomeData.DisclaimerSection.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreHomeData cashCreditScoreHomeData = (CashCreditScoreHomeData) obj;
        reverseProtoWriter.getClass();
        cashCreditScoreHomeData.getClass();
        reverseProtoWriter.writeBytes(cashCreditScoreHomeData.unknownFields());
        CashCreditScoreHomeData.DisclaimerSection.ADAPTER.encodeWithTag(reverseProtoWriter, 5, cashCreditScoreHomeData.disclaimer_section);
        CashCreditScoreHomeData.InfoSection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, cashCreditScoreHomeData.info_sections);
        CashCreditScoreHomeData.ScoreSummary.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cashCreditScoreHomeData.score_summary);
        CashCreditScoreHomeData.TitleBar.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cashCreditScoreHomeData.title_bar);
        AppSupport.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, cashCreditScoreHomeData.app_supports);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreHomeData cashCreditScoreHomeData = (CashCreditScoreHomeData) obj;
        cashCreditScoreHomeData.getClass();
        return CashCreditScoreHomeData.DisclaimerSection.ADAPTER.encodedSizeWithTag(5, cashCreditScoreHomeData.disclaimer_section) + CashCreditScoreHomeData.InfoSection.ADAPTER.asRepeated().encodedSizeWithTag(4, cashCreditScoreHomeData.info_sections) + CashCreditScoreHomeData.ScoreSummary.ADAPTER.encodedSizeWithTag(3, cashCreditScoreHomeData.score_summary) + CashCreditScoreHomeData.TitleBar.ADAPTER.encodedSizeWithTag(2, cashCreditScoreHomeData.title_bar) + AppSupport.ADAPTER.asRepeated().encodedSizeWithTag(1, cashCreditScoreHomeData.app_supports) + cashCreditScoreHomeData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreHomeData cashCreditScoreHomeData = (CashCreditScoreHomeData) obj;
        cashCreditScoreHomeData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cashCreditScoreHomeData.app_supports, AppSupport.ADAPTER);
        CashCreditScoreHomeData.TitleBar titleBar = cashCreditScoreHomeData.title_bar;
        CashCreditScoreHomeData.TitleBar titleBar2 = titleBar != null ? (CashCreditScoreHomeData.TitleBar) CashCreditScoreHomeData.TitleBar.ADAPTER.redact(titleBar) : null;
        CashCreditScoreHomeData.ScoreSummary scoreSummary = cashCreditScoreHomeData.score_summary;
        CashCreditScoreHomeData.ScoreSummary scoreSummary2 = scoreSummary != null ? (CashCreditScoreHomeData.ScoreSummary) CashCreditScoreHomeData.ScoreSummary.ADAPTER.redact(scoreSummary) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(cashCreditScoreHomeData.info_sections, CashCreditScoreHomeData.InfoSection.ADAPTER);
        CashCreditScoreHomeData.DisclaimerSection disclaimerSection = cashCreditScoreHomeData.disclaimer_section;
        CashCreditScoreHomeData.DisclaimerSection disclaimerSection2 = disclaimerSection != null ? (CashCreditScoreHomeData.DisclaimerSection) CashCreditScoreHomeData.DisclaimerSection.ADAPTER.redact(disclaimerSection) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashCreditScoreHomeData(m1169redactElements, titleBar2, scoreSummary2, m1169redactElements2, disclaimerSection2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreHomeData cashCreditScoreHomeData = (CashCreditScoreHomeData) obj;
        cashCreditScoreHomeData.getClass();
        AppSupport.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, cashCreditScoreHomeData.app_supports);
        CashCreditScoreHomeData.TitleBar.ADAPTER.encodeWithTag(protoWriter, 2, cashCreditScoreHomeData.title_bar);
        CashCreditScoreHomeData.ScoreSummary.ADAPTER.encodeWithTag(protoWriter, 3, cashCreditScoreHomeData.score_summary);
        CashCreditScoreHomeData.InfoSection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, cashCreditScoreHomeData.info_sections);
        CashCreditScoreHomeData.DisclaimerSection.ADAPTER.encodeWithTag(protoWriter, 5, cashCreditScoreHomeData.disclaimer_section);
        protoWriter.writeBytes(cashCreditScoreHomeData.unknownFields());
    }
}
