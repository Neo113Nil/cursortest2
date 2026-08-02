package squareup.cash.ui.arcade.elements;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.ButtonCtaGroup;

/* loaded from: classes10.dex */
public final class ButtonCtaGroup$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ButtonCtaGroup((ButtonDefault) obj, (ButtonDefault) obj2, (ButtonDefault) obj3, (ButtonCtaGroup.Direction) obj4, (LocalizedString) obj5, (Boolean) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(ButtonDefault.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(ButtonDefault.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(ButtonDefault.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    try {
                        obj4 = ButtonCtaGroup.Direction.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ButtonCtaGroup buttonCtaGroup = (ButtonCtaGroup) obj;
        reverseProtoWriter.getClass();
        buttonCtaGroup.getClass();
        reverseProtoWriter.writeBytes(buttonCtaGroup.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 6, buttonCtaGroup.show_hairline);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 5, buttonCtaGroup.disclaimer_text);
        ButtonCtaGroup.Direction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, buttonCtaGroup.direction);
        ProtoAdapter protoAdapter = ButtonDefault.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, buttonCtaGroup.tertiary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, buttonCtaGroup.secondary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, buttonCtaGroup.primary_button);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ButtonCtaGroup buttonCtaGroup = (ButtonCtaGroup) obj;
        buttonCtaGroup.getClass();
        int size$okio = buttonCtaGroup.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ButtonDefault.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(6, buttonCtaGroup.show_hairline) + LocalizedString.ADAPTER.encodedSizeWithTag(5, buttonCtaGroup.disclaimer_text) + ButtonCtaGroup.Direction.ADAPTER.encodedSizeWithTag(4, buttonCtaGroup.direction) + protoAdapter.encodedSizeWithTag(3, buttonCtaGroup.tertiary_button) + protoAdapter.encodedSizeWithTag(2, buttonCtaGroup.secondary_button) + protoAdapter.encodedSizeWithTag(1, buttonCtaGroup.primary_button) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ButtonCtaGroup buttonCtaGroup = (ButtonCtaGroup) obj;
        buttonCtaGroup.getClass();
        ButtonDefault buttonDefault = buttonCtaGroup.primary_button;
        ButtonDefault buttonDefault2 = buttonDefault != null ? (ButtonDefault) ButtonDefault.ADAPTER.redact(buttonDefault) : null;
        ButtonDefault buttonDefault3 = buttonCtaGroup.secondary_button;
        ButtonDefault buttonDefault4 = buttonDefault3 != null ? (ButtonDefault) ButtonDefault.ADAPTER.redact(buttonDefault3) : null;
        ButtonDefault buttonDefault5 = buttonCtaGroup.tertiary_button;
        ButtonDefault buttonDefault6 = buttonDefault5 != null ? (ButtonDefault) ButtonDefault.ADAPTER.redact(buttonDefault5) : null;
        LocalizedString localizedString = buttonCtaGroup.disclaimer_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        ButtonCtaGroup.Direction direction = buttonCtaGroup.direction;
        Boolean bool = buttonCtaGroup.show_hairline;
        byteString.getClass();
        return new ButtonCtaGroup(buttonDefault2, buttonDefault4, buttonDefault6, direction, localizedString2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ButtonCtaGroup buttonCtaGroup = (ButtonCtaGroup) obj;
        buttonCtaGroup.getClass();
        ProtoAdapter protoAdapter = ButtonDefault.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, buttonCtaGroup.primary_button);
        protoAdapter.encodeWithTag(protoWriter, 2, buttonCtaGroup.secondary_button);
        protoAdapter.encodeWithTag(protoWriter, 3, buttonCtaGroup.tertiary_button);
        ButtonCtaGroup.Direction.ADAPTER.encodeWithTag(protoWriter, 4, buttonCtaGroup.direction);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 5, buttonCtaGroup.disclaimer_text);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, buttonCtaGroup.show_hairline);
        protoWriter.writeBytes(buttonCtaGroup.unknownFields());
    }
}
