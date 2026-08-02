package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.UiConfiguration;

/* loaded from: classes10.dex */
public final class UiConfiguration$DestinationUiConfiguration$DestinationUiConfigurationValues$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues((Color) obj, (LocalizedString) obj2, (Icon) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues destinationUiConfigurationValues = (UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues) obj;
        reverseProtoWriter.getClass();
        destinationUiConfigurationValues.getClass();
        reverseProtoWriter.writeBytes(destinationUiConfigurationValues.unknownFields());
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 4, destinationUiConfigurationValues.icon);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, destinationUiConfigurationValues.name);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 1, destinationUiConfigurationValues.tint_color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues destinationUiConfigurationValues = (UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues) obj;
        destinationUiConfigurationValues.getClass();
        return Icon.ADAPTER.encodedSizeWithTag(4, destinationUiConfigurationValues.icon) + LocalizedString.ADAPTER.encodedSizeWithTag(3, destinationUiConfigurationValues.name) + Color.ADAPTER.encodedSizeWithTag(1, destinationUiConfigurationValues.tint_color) + destinationUiConfigurationValues.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues destinationUiConfigurationValues = (UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues) obj;
        destinationUiConfigurationValues.getClass();
        Color color = destinationUiConfigurationValues.tint_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        LocalizedString localizedString = destinationUiConfigurationValues.name;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Icon icon = destinationUiConfigurationValues.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues(color2, localizedString2, icon2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues destinationUiConfigurationValues = (UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues) obj;
        destinationUiConfigurationValues.getClass();
        Color.ADAPTER.encodeWithTag(protoWriter, 1, destinationUiConfigurationValues.tint_color);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, destinationUiConfigurationValues.name);
        Icon.ADAPTER.encodeWithTag(protoWriter, 4, destinationUiConfigurationValues.icon);
        protoWriter.writeBytes(destinationUiConfigurationValues.unknownFields());
    }
}
