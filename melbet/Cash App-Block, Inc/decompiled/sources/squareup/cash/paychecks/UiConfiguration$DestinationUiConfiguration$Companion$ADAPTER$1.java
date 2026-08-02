package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.UiConfiguration;

/* loaded from: classes10.dex */
public final class UiConfiguration$DestinationUiConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiConfiguration.DestinationUiConfiguration((AllocationDestination) obj, (UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AllocationDestination.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiConfiguration.DestinationUiConfiguration destinationUiConfiguration = (UiConfiguration.DestinationUiConfiguration) obj;
        reverseProtoWriter.getClass();
        destinationUiConfiguration.getClass();
        reverseProtoWriter.writeBytes(destinationUiConfiguration.unknownFields());
        UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues.ADAPTER.encodeWithTag(reverseProtoWriter, 2, destinationUiConfiguration.ui_config_values);
        AllocationDestination.ADAPTER.encodeWithTag(reverseProtoWriter, 1, destinationUiConfiguration.destination);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiConfiguration.DestinationUiConfiguration destinationUiConfiguration = (UiConfiguration.DestinationUiConfiguration) obj;
        destinationUiConfiguration.getClass();
        return UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues.ADAPTER.encodedSizeWithTag(2, destinationUiConfiguration.ui_config_values) + AllocationDestination.ADAPTER.encodedSizeWithTag(1, destinationUiConfiguration.destination) + destinationUiConfiguration.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiConfiguration.DestinationUiConfiguration destinationUiConfiguration = (UiConfiguration.DestinationUiConfiguration) obj;
        destinationUiConfiguration.getClass();
        AllocationDestination allocationDestination = destinationUiConfiguration.destination;
        AllocationDestination allocationDestination2 = allocationDestination != null ? (AllocationDestination) AllocationDestination.ADAPTER.redact(allocationDestination) : null;
        UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues destinationUiConfigurationValues = destinationUiConfiguration.ui_config_values;
        UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues destinationUiConfigurationValues2 = destinationUiConfigurationValues != null ? (UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues) UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues.ADAPTER.redact(destinationUiConfigurationValues) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UiConfiguration.DestinationUiConfiguration(allocationDestination2, destinationUiConfigurationValues2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiConfiguration.DestinationUiConfiguration destinationUiConfiguration = (UiConfiguration.DestinationUiConfiguration) obj;
        destinationUiConfiguration.getClass();
        AllocationDestination.ADAPTER.encodeWithTag(protoWriter, 1, destinationUiConfiguration.destination);
        UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues.ADAPTER.encodeWithTag(protoWriter, 2, destinationUiConfiguration.ui_config_values);
        protoWriter.writeBytes(destinationUiConfiguration.unknownFields());
    }
}
