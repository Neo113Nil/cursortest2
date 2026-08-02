package com.squareup.lending;

import androidx.room.TransactorKt;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreHomeData$ScoreSummary$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashCreditScoreHomeData.ScoreSummary((CashCreditScoreHomeData.Visualization) obj, (Integer) obj2, (Integer) obj3, (String) obj4, (Icon) obj5, (LocalizedString) obj6, (LocalizedString) obj7, (CashCreditScoreHomeData.Action) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(CashCreditScoreHomeData.Visualization.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 3:
                    obj5 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj5);
                    break;
                case 4:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj6);
                    break;
                case 5:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj7);
                    break;
                case 6:
                    obj8 = TransactorKt.decodeMessageOrMerge(CashCreditScoreHomeData.Action.ADAPTER, protoReader, obj8);
                    break;
                case 7:
                    obj3 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 8:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreHomeData.ScoreSummary scoreSummary = (CashCreditScoreHomeData.ScoreSummary) obj;
        reverseProtoWriter.getClass();
        scoreSummary.getClass();
        reverseProtoWriter.writeBytes(scoreSummary.unknownFields());
        CashCreditScoreHomeData.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 6, scoreSummary.action);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, scoreSummary.action_accessibility_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, scoreSummary.action_text);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 3, scoreSummary.action_leading_icon);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 8, scoreSummary.score_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, scoreSummary.previous_score);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, scoreSummary.score);
        CashCreditScoreHomeData.Visualization.ADAPTER.encodeWithTag(reverseProtoWriter, 1, scoreSummary.visualization);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreHomeData.ScoreSummary scoreSummary = (CashCreditScoreHomeData.ScoreSummary) obj;
        scoreSummary.getClass();
        int encodedSizeWithTag = CashCreditScoreHomeData.Visualization.ADAPTER.encodedSizeWithTag(1, scoreSummary.visualization) + scoreSummary.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = Icon.ADAPTER.encodedSizeWithTag(3, scoreSummary.action_leading_icon) + ProtoAdapter.STRING.encodedSizeWithTag(8, scoreSummary.score_token) + protoAdapter.encodedSizeWithTag(7, scoreSummary.previous_score) + protoAdapter.encodedSizeWithTag(2, scoreSummary.score) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        return CashCreditScoreHomeData.Action.ADAPTER.encodedSizeWithTag(6, scoreSummary.action) + protoAdapter2.encodedSizeWithTag(5, scoreSummary.action_accessibility_description) + protoAdapter2.encodedSizeWithTag(4, scoreSummary.action_text) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreHomeData.ScoreSummary scoreSummary = (CashCreditScoreHomeData.ScoreSummary) obj;
        scoreSummary.getClass();
        CashCreditScoreHomeData.Visualization visualization = scoreSummary.visualization;
        CashCreditScoreHomeData.Visualization visualization2 = visualization != null ? (CashCreditScoreHomeData.Visualization) CashCreditScoreHomeData.Visualization.ADAPTER.redact(visualization) : null;
        Icon icon = scoreSummary.action_leading_icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        LocalizedString localizedString = scoreSummary.action_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = scoreSummary.action_accessibility_description;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        CashCreditScoreHomeData.Action action = scoreSummary.action;
        CashCreditScoreHomeData.Action action2 = action != null ? (CashCreditScoreHomeData.Action) CashCreditScoreHomeData.Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = scoreSummary.score;
        Integer num2 = scoreSummary.previous_score;
        String str = scoreSummary.score_token;
        byteString.getClass();
        return new CashCreditScoreHomeData.ScoreSummary(visualization2, num, num2, str, icon2, localizedString2, localizedString4, action2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreHomeData.ScoreSummary scoreSummary = (CashCreditScoreHomeData.ScoreSummary) obj;
        scoreSummary.getClass();
        CashCreditScoreHomeData.Visualization.ADAPTER.encodeWithTag(protoWriter, 1, scoreSummary.visualization);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 2, scoreSummary.score);
        protoAdapter.encodeWithTag(protoWriter, 7, scoreSummary.previous_score);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, scoreSummary.score_token);
        Icon.ADAPTER.encodeWithTag(protoWriter, 3, scoreSummary.action_leading_icon);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, scoreSummary.action_text);
        protoAdapter2.encodeWithTag(protoWriter, 5, scoreSummary.action_accessibility_description);
        CashCreditScoreHomeData.Action.ADAPTER.encodeWithTag(protoWriter, 6, scoreSummary.action);
        protoWriter.writeBytes(scoreSummary.unknownFields());
    }
}
