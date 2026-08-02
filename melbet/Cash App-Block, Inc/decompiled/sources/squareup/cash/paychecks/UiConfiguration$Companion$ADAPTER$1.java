package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.paychecks.UiConfiguration;

/* loaded from: classes10.dex */
public final class UiConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new UiConfiguration(m, (PaychecksHomeUi) obj, (DistributionSummaryUi) obj2, (UiConfiguration.ReceiptUi) obj3, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(UiConfiguration.DestinationUiConfiguration.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(PaychecksHomeUi.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(DistributionSummaryUi.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(UiConfiguration.ReceiptUi.ADAPTER, protoReader, obj3);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(UiConfiguration.WheelColorList.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiConfiguration uiConfiguration = (UiConfiguration) obj;
        reverseProtoWriter.getClass();
        uiConfiguration.getClass();
        reverseProtoWriter.writeBytes(uiConfiguration.unknownFields());
        UiConfiguration.WheelColorList.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, uiConfiguration.product_tint_wheel_color_lists);
        UiConfiguration.ReceiptUi.ADAPTER.encodeWithTag(reverseProtoWriter, 4, uiConfiguration.receipt_ui);
        DistributionSummaryUi.ADAPTER.encodeWithTag(reverseProtoWriter, 3, uiConfiguration.distribution_summary_ui);
        PaychecksHomeUi.ADAPTER.encodeWithTag(reverseProtoWriter, 2, uiConfiguration.paychecks_home_ui);
        UiConfiguration.DestinationUiConfiguration.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, uiConfiguration.destination_ui_configs);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiConfiguration uiConfiguration = (UiConfiguration) obj;
        uiConfiguration.getClass();
        return UiConfiguration.WheelColorList.ADAPTER.asRepeated().encodedSizeWithTag(6, uiConfiguration.product_tint_wheel_color_lists) + UiConfiguration.ReceiptUi.ADAPTER.encodedSizeWithTag(4, uiConfiguration.receipt_ui) + DistributionSummaryUi.ADAPTER.encodedSizeWithTag(3, uiConfiguration.distribution_summary_ui) + PaychecksHomeUi.ADAPTER.encodedSizeWithTag(2, uiConfiguration.paychecks_home_ui) + UiConfiguration.DestinationUiConfiguration.ADAPTER.asRepeated().encodedSizeWithTag(1, uiConfiguration.destination_ui_configs) + uiConfiguration.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiConfiguration uiConfiguration = (UiConfiguration) obj;
        uiConfiguration.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(uiConfiguration.destination_ui_configs, UiConfiguration.DestinationUiConfiguration.ADAPTER);
        PaychecksHomeUi paychecksHomeUi = uiConfiguration.paychecks_home_ui;
        PaychecksHomeUi paychecksHomeUi2 = paychecksHomeUi != null ? (PaychecksHomeUi) PaychecksHomeUi.ADAPTER.redact(paychecksHomeUi) : null;
        DistributionSummaryUi distributionSummaryUi = uiConfiguration.distribution_summary_ui;
        DistributionSummaryUi distributionSummaryUi2 = distributionSummaryUi != null ? (DistributionSummaryUi) DistributionSummaryUi.ADAPTER.redact(distributionSummaryUi) : null;
        UiConfiguration.ReceiptUi receiptUi = uiConfiguration.receipt_ui;
        UiConfiguration.ReceiptUi receiptUi2 = receiptUi != null ? (UiConfiguration.ReceiptUi) UiConfiguration.ReceiptUi.ADAPTER.redact(receiptUi) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(uiConfiguration.product_tint_wheel_color_lists, UiConfiguration.WheelColorList.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UiConfiguration(m1169redactElements, paychecksHomeUi2, distributionSummaryUi2, receiptUi2, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiConfiguration uiConfiguration = (UiConfiguration) obj;
        uiConfiguration.getClass();
        UiConfiguration.DestinationUiConfiguration.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, uiConfiguration.destination_ui_configs);
        PaychecksHomeUi.ADAPTER.encodeWithTag(protoWriter, 2, uiConfiguration.paychecks_home_ui);
        DistributionSummaryUi.ADAPTER.encodeWithTag(protoWriter, 3, uiConfiguration.distribution_summary_ui);
        UiConfiguration.ReceiptUi.ADAPTER.encodeWithTag(protoWriter, 4, uiConfiguration.receipt_ui);
        UiConfiguration.WheelColorList.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, uiConfiguration.product_tint_wheel_color_lists);
        protoWriter.writeBytes(uiConfiguration.unknownFields());
    }
}
