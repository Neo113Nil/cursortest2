package com.squareup.lending;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreHomeData$ScoreSummaryOverlayData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashCreditScoreHomeData.ScoreSummaryOverlayData((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, m, (CashCreditScoreHomeData.DisclaimerSection) obj4, (Boolean) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 2:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 3:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 4:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 5:
                    m.add(CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    obj4 = TransactorKt.decodeMessageOrMerge(CashCreditScoreHomeData.DisclaimerSection.ADAPTER, protoReader, obj4);
                    break;
                case 7:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreHomeData.ScoreSummaryOverlayData scoreSummaryOverlayData = (CashCreditScoreHomeData.ScoreSummaryOverlayData) obj;
        reverseProtoWriter.getClass();
        scoreSummaryOverlayData.getClass();
        reverseProtoWriter.writeBytes(scoreSummaryOverlayData.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, scoreSummaryOverlayData.describes_feature_impact);
        CashCreditScoreHomeData.DisclaimerSection.ADAPTER.encodeWithTag(reverseProtoWriter, 6, scoreSummaryOverlayData.disclaimer_section);
        CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, scoreSummaryOverlayData.list);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, scoreSummaryOverlayData.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, scoreSummaryOverlayData.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, scoreSummaryOverlayData.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreHomeData.ScoreSummaryOverlayData scoreSummaryOverlayData = (CashCreditScoreHomeData.ScoreSummaryOverlayData) obj;
        scoreSummaryOverlayData.getClass();
        int size$okio = scoreSummaryOverlayData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(7, scoreSummaryOverlayData.describes_feature_impact) + CashCreditScoreHomeData.DisclaimerSection.ADAPTER.encodedSizeWithTag(6, scoreSummaryOverlayData.disclaimer_section) + CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem.ADAPTER.asRepeated().encodedSizeWithTag(5, scoreSummaryOverlayData.list) + protoAdapter.encodedSizeWithTag(4, scoreSummaryOverlayData.body) + protoAdapter.encodedSizeWithTag(3, scoreSummaryOverlayData.subtitle) + protoAdapter.encodedSizeWithTag(2, scoreSummaryOverlayData.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreHomeData.ScoreSummaryOverlayData scoreSummaryOverlayData = (CashCreditScoreHomeData.ScoreSummaryOverlayData) obj;
        scoreSummaryOverlayData.getClass();
        LocalizedString localizedString = scoreSummaryOverlayData.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = scoreSummaryOverlayData.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = scoreSummaryOverlayData.body;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(scoreSummaryOverlayData.list, CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem.ADAPTER);
        CashCreditScoreHomeData.DisclaimerSection disclaimerSection = scoreSummaryOverlayData.disclaimer_section;
        CashCreditScoreHomeData.DisclaimerSection disclaimerSection2 = disclaimerSection != null ? (CashCreditScoreHomeData.DisclaimerSection) CashCreditScoreHomeData.DisclaimerSection.ADAPTER.redact(disclaimerSection) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = scoreSummaryOverlayData.describes_feature_impact;
        byteString.getClass();
        return new CashCreditScoreHomeData.ScoreSummaryOverlayData(localizedString2, localizedString4, localizedString6, m1169redactElements, disclaimerSection2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreHomeData.ScoreSummaryOverlayData scoreSummaryOverlayData = (CashCreditScoreHomeData.ScoreSummaryOverlayData) obj;
        scoreSummaryOverlayData.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, scoreSummaryOverlayData.title);
        protoAdapter.encodeWithTag(protoWriter, 3, scoreSummaryOverlayData.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 4, scoreSummaryOverlayData.body);
        CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, scoreSummaryOverlayData.list);
        CashCreditScoreHomeData.DisclaimerSection.ADAPTER.encodeWithTag(protoWriter, 6, scoreSummaryOverlayData.disclaimer_section);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, scoreSummaryOverlayData.describes_feature_impact);
        protoWriter.writeBytes(scoreSummaryOverlayData.unknownFields());
    }
}
