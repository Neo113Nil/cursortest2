package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.paychecks.DistributionSummaryUi;

/* loaded from: classes10.dex */
public final class DistributionSummaryUi$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new DistributionSummaryUi(m, (DistributionSummaryUi.HelpSheetUi) obj, (AlertUi) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (AlertUi) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(DistributionSummaryUi.DestinationUiConfiguration.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(DistributionSummaryUi.HelpSheetUi.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(AlertUi.ADAPTER, protoReader, obj2);
            } else if (nextTag == 5) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag == 6) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            } else if (nextTag != 7) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(AlertUi.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DistributionSummaryUi distributionSummaryUi = (DistributionSummaryUi) obj;
        reverseProtoWriter.getClass();
        distributionSummaryUi.getClass();
        reverseProtoWriter.writeBytes(distributionSummaryUi.unknownFields());
        ProtoAdapter protoAdapter = AlertUi.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, distributionSummaryUi.overallocation_alert_ui);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, distributionSummaryUi.done_button_title);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, distributionSummaryUi.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, distributionSummaryUi.investing_risk_alert_ui);
        DistributionSummaryUi.HelpSheetUi.ADAPTER.encodeWithTag(reverseProtoWriter, 2, distributionSummaryUi.help_sheet_ui);
        DistributionSummaryUi.DestinationUiConfiguration.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, distributionSummaryUi.destination_ui_configs);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DistributionSummaryUi distributionSummaryUi = (DistributionSummaryUi) obj;
        distributionSummaryUi.getClass();
        int encodedSizeWithTag = DistributionSummaryUi.HelpSheetUi.ADAPTER.encodedSizeWithTag(2, distributionSummaryUi.help_sheet_ui) + DistributionSummaryUi.DestinationUiConfiguration.ADAPTER.asRepeated().encodedSizeWithTag(1, distributionSummaryUi.destination_ui_configs) + distributionSummaryUi.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = AlertUi.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, distributionSummaryUi.investing_risk_alert_ui) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(7, distributionSummaryUi.overallocation_alert_ui) + protoAdapter2.encodedSizeWithTag(6, distributionSummaryUi.done_button_title) + protoAdapter2.encodedSizeWithTag(5, distributionSummaryUi.title) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DistributionSummaryUi distributionSummaryUi = (DistributionSummaryUi) obj;
        distributionSummaryUi.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(distributionSummaryUi.destination_ui_configs, DistributionSummaryUi.DestinationUiConfiguration.ADAPTER);
        DistributionSummaryUi.HelpSheetUi helpSheetUi = distributionSummaryUi.help_sheet_ui;
        DistributionSummaryUi.HelpSheetUi helpSheetUi2 = helpSheetUi != null ? (DistributionSummaryUi.HelpSheetUi) DistributionSummaryUi.HelpSheetUi.ADAPTER.redact(helpSheetUi) : null;
        AlertUi alertUi = distributionSummaryUi.investing_risk_alert_ui;
        AlertUi alertUi2 = alertUi != null ? (AlertUi) AlertUi.ADAPTER.redact(alertUi) : null;
        LocalizedString localizedString = distributionSummaryUi.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = distributionSummaryUi.done_button_title;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        AlertUi alertUi3 = distributionSummaryUi.overallocation_alert_ui;
        AlertUi alertUi4 = alertUi3 != null ? (AlertUi) AlertUi.ADAPTER.redact(alertUi3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DistributionSummaryUi(m1169redactElements, helpSheetUi2, alertUi2, localizedString2, localizedString4, alertUi4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DistributionSummaryUi distributionSummaryUi = (DistributionSummaryUi) obj;
        distributionSummaryUi.getClass();
        DistributionSummaryUi.DestinationUiConfiguration.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, distributionSummaryUi.destination_ui_configs);
        DistributionSummaryUi.HelpSheetUi.ADAPTER.encodeWithTag(protoWriter, 2, distributionSummaryUi.help_sheet_ui);
        ProtoAdapter protoAdapter = AlertUi.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, distributionSummaryUi.investing_risk_alert_ui);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 5, distributionSummaryUi.title);
        protoAdapter2.encodeWithTag(protoWriter, 6, distributionSummaryUi.done_button_title);
        protoAdapter.encodeWithTag(protoWriter, 7, distributionSummaryUi.overallocation_alert_ui);
        protoWriter.writeBytes(distributionSummaryUi.unknownFields());
    }
}
