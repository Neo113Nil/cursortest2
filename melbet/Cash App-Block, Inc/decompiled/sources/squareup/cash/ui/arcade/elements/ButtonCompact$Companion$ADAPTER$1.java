package squareup.cash.ui.arcade.elements;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class ButtonCompact$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ButtonCompact((ButtonProminence) obj, (Boolean) obj2, (LocalizedString) obj3, (Icon) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ButtonProminence.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ButtonCompact buttonCompact = (ButtonCompact) obj;
        reverseProtoWriter.getClass();
        buttonCompact.getClass();
        reverseProtoWriter.writeBytes(buttonCompact.unknownFields());
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 4, buttonCompact.icon);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, buttonCompact.text);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, buttonCompact.is_destructive);
        ButtonProminence.ADAPTER.encodeWithTag(reverseProtoWriter, 1, buttonCompact.button_prominence);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ButtonCompact buttonCompact = (ButtonCompact) obj;
        buttonCompact.getClass();
        return Icon.ADAPTER.encodedSizeWithTag(4, buttonCompact.icon) + LocalizedString.ADAPTER.encodedSizeWithTag(3, buttonCompact.text) + ProtoAdapter.BOOL.encodedSizeWithTag(2, buttonCompact.is_destructive) + ButtonProminence.ADAPTER.encodedSizeWithTag(1, buttonCompact.button_prominence) + buttonCompact.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ButtonCompact buttonCompact = (ButtonCompact) obj;
        buttonCompact.getClass();
        LocalizedString localizedString = buttonCompact.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Icon icon = buttonCompact.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        ByteString byteString = ByteString.EMPTY;
        ButtonProminence buttonProminence = buttonCompact.button_prominence;
        Boolean bool = buttonCompact.is_destructive;
        byteString.getClass();
        return new ButtonCompact(buttonProminence, bool, localizedString2, icon2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ButtonCompact buttonCompact = (ButtonCompact) obj;
        buttonCompact.getClass();
        ButtonProminence.ADAPTER.encodeWithTag(protoWriter, 1, buttonCompact.button_prominence);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, buttonCompact.is_destructive);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, buttonCompact.text);
        Icon.ADAPTER.encodeWithTag(protoWriter, 4, buttonCompact.icon);
        protoWriter.writeBytes(buttonCompact.unknownFields());
    }
}
