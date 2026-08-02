package squareup.cash.savings.action;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.savings.action.Button;

/* loaded from: classes10.dex */
public final class Button$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Button((LocalizedString) obj, (Icon) obj2, (SavingsAction) obj3, (Placement) obj4, (Button.Style) obj5, (LocalizedString) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    try {
                        obj2 = Icon.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(SavingsAction.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    try {
                        obj4 = Placement.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 5:
                    try {
                        obj5 = Button.Style.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Button button = (Button) obj;
        reverseProtoWriter.getClass();
        button.getClass();
        reverseProtoWriter.writeBytes(button.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, button.markdown_formatted_title);
        Button.Style.ADAPTER.encodeWithTag(reverseProtoWriter, 5, button.style);
        Placement.ADAPTER.encodeWithTag(reverseProtoWriter, 4, button.accessory_placement);
        SavingsAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, button.action);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 2, button.accessory);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, button.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Button button = (Button) obj;
        button.getClass();
        int size$okio = button.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(6, button.markdown_formatted_title) + Button.Style.ADAPTER.encodedSizeWithTag(5, button.style) + Placement.ADAPTER.encodedSizeWithTag(4, button.accessory_placement) + SavingsAction.ADAPTER.encodedSizeWithTag(3, button.action) + Icon.ADAPTER.encodedSizeWithTag(2, button.accessory) + protoAdapter.encodedSizeWithTag(1, button.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Button button = (Button) obj;
        button.getClass();
        LocalizedString localizedString = button.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        SavingsAction savingsAction = button.action;
        SavingsAction savingsAction2 = savingsAction != null ? (SavingsAction) SavingsAction.ADAPTER.redact(savingsAction) : null;
        LocalizedString localizedString3 = button.markdown_formatted_title;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        Icon icon = button.accessory;
        Placement placement = button.accessory_placement;
        Button.Style style = button.style;
        byteString.getClass();
        return new Button(localizedString2, icon, savingsAction2, placement, style, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Button button = (Button) obj;
        button.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, button.title);
        Icon.ADAPTER.encodeWithTag(protoWriter, 2, button.accessory);
        SavingsAction.ADAPTER.encodeWithTag(protoWriter, 3, button.action);
        Placement.ADAPTER.encodeWithTag(protoWriter, 4, button.accessory_placement);
        Button.Style.ADAPTER.encodeWithTag(protoWriter, 5, button.style);
        protoAdapter.encodeWithTag(protoWriter, 6, button.markdown_formatted_title);
        protoWriter.writeBytes(button.unknownFields());
    }
}
