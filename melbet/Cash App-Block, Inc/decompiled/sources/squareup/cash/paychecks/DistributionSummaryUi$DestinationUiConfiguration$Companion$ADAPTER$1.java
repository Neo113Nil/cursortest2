package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.DistributionSummaryUi;

/* loaded from: classes10.dex */
public final class DistributionSummaryUi$DestinationUiConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DistributionSummaryUi.DestinationUiConfiguration((AllocationDestination) obj, (DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AllocationDestination.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DistributionSummaryUi.DestinationUiConfiguration destinationUiConfiguration = (DistributionSummaryUi.DestinationUiConfiguration) obj;
        reverseProtoWriter.getClass();
        destinationUiConfiguration.getClass();
        reverseProtoWriter.writeBytes(destinationUiConfiguration.unknownFields());
        DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 2, destinationUiConfiguration.ui_config);
        AllocationDestination.ADAPTER.encodeWithTag(reverseProtoWriter, 1, destinationUiConfiguration.destination);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DistributionSummaryUi.DestinationUiConfiguration destinationUiConfiguration = (DistributionSummaryUi.DestinationUiConfiguration) obj;
        destinationUiConfiguration.getClass();
        return DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration.ADAPTER.encodedSizeWithTag(2, destinationUiConfiguration.ui_config) + AllocationDestination.ADAPTER.encodedSizeWithTag(1, destinationUiConfiguration.destination) + destinationUiConfiguration.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DistributionSummaryUi.DestinationUiConfiguration destinationUiConfiguration = (DistributionSummaryUi.DestinationUiConfiguration) obj;
        destinationUiConfiguration.getClass();
        AllocationDestination allocationDestination = destinationUiConfiguration.destination;
        AllocationDestination allocationDestination2 = allocationDestination != null ? (AllocationDestination) AllocationDestination.ADAPTER.redact(allocationDestination) : null;
        DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration uiConfiguration = destinationUiConfiguration.ui_config;
        DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration uiConfiguration2 = uiConfiguration != null ? (DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration) DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration.ADAPTER.redact(uiConfiguration) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DistributionSummaryUi.DestinationUiConfiguration(allocationDestination2, uiConfiguration2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DistributionSummaryUi.DestinationUiConfiguration destinationUiConfiguration = (DistributionSummaryUi.DestinationUiConfiguration) obj;
        destinationUiConfiguration.getClass();
        AllocationDestination.ADAPTER.encodeWithTag(protoWriter, 1, destinationUiConfiguration.destination);
        DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration.ADAPTER.encodeWithTag(protoWriter, 2, destinationUiConfiguration.ui_config);
        protoWriter.writeBytes(destinationUiConfiguration.unknownFields());
    }
}
