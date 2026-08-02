package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.DistributionSummaryUi;

/* loaded from: classes10.dex */
public final class DistributionSummaryUi$DestinationUiConfiguration$UiConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration((Boolean) obj, (LocalizedString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration uiConfiguration = (DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration) obj;
        reverseProtoWriter.getClass();
        uiConfiguration.getClass();
        reverseProtoWriter.writeBytes(uiConfiguration.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 5, uiConfiguration.nux_button_text);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, uiConfiguration.shows_investing_risk_alert);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration uiConfiguration = (DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration) obj;
        uiConfiguration.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(5, uiConfiguration.nux_button_text) + ProtoAdapter.BOOL.encodedSizeWithTag(2, uiConfiguration.shows_investing_risk_alert) + uiConfiguration.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration uiConfiguration = (DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration) obj;
        uiConfiguration.getClass();
        LocalizedString localizedString = uiConfiguration.nux_button_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = uiConfiguration.shows_investing_risk_alert;
        byteString.getClass();
        return new DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration(bool, localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration uiConfiguration = (DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration) obj;
        uiConfiguration.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, uiConfiguration.shows_investing_risk_alert);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 5, uiConfiguration.nux_button_text);
        protoWriter.writeBytes(uiConfiguration.unknownFields());
    }
}
