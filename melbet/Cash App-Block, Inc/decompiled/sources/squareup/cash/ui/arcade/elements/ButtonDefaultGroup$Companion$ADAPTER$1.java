package squareup.cash.ui.arcade.elements;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.ButtonDefaultGroup;

/* loaded from: classes10.dex */
public final class ButtonDefaultGroup$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ButtonDefaultGroup((ButtonDefault) obj, (ButtonDefault) obj2, (ButtonDefault) obj3, (ButtonDefaultGroup.Direction) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ButtonDefault.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(ButtonDefault.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(ButtonDefault.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = ButtonDefaultGroup.Direction.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ButtonDefaultGroup buttonDefaultGroup = (ButtonDefaultGroup) obj;
        reverseProtoWriter.getClass();
        buttonDefaultGroup.getClass();
        reverseProtoWriter.writeBytes(buttonDefaultGroup.unknownFields());
        ButtonDefaultGroup.Direction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, buttonDefaultGroup.direction);
        ProtoAdapter protoAdapter = ButtonDefault.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, buttonDefaultGroup.tertiary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, buttonDefaultGroup.secondary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, buttonDefaultGroup.primary_button);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ButtonDefaultGroup buttonDefaultGroup = (ButtonDefaultGroup) obj;
        buttonDefaultGroup.getClass();
        int size$okio = buttonDefaultGroup.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ButtonDefault.ADAPTER;
        return ButtonDefaultGroup.Direction.ADAPTER.encodedSizeWithTag(4, buttonDefaultGroup.direction) + protoAdapter.encodedSizeWithTag(3, buttonDefaultGroup.tertiary_button) + protoAdapter.encodedSizeWithTag(2, buttonDefaultGroup.secondary_button) + protoAdapter.encodedSizeWithTag(1, buttonDefaultGroup.primary_button) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ButtonDefaultGroup buttonDefaultGroup = (ButtonDefaultGroup) obj;
        buttonDefaultGroup.getClass();
        ButtonDefault buttonDefault = buttonDefaultGroup.primary_button;
        ButtonDefault buttonDefault2 = buttonDefault != null ? (ButtonDefault) ButtonDefault.ADAPTER.redact(buttonDefault) : null;
        ButtonDefault buttonDefault3 = buttonDefaultGroup.secondary_button;
        ButtonDefault buttonDefault4 = buttonDefault3 != null ? (ButtonDefault) ButtonDefault.ADAPTER.redact(buttonDefault3) : null;
        ButtonDefault buttonDefault5 = buttonDefaultGroup.tertiary_button;
        ButtonDefault buttonDefault6 = buttonDefault5 != null ? (ButtonDefault) ButtonDefault.ADAPTER.redact(buttonDefault5) : null;
        ByteString byteString = ByteString.EMPTY;
        ButtonDefaultGroup.Direction direction = buttonDefaultGroup.direction;
        byteString.getClass();
        return new ButtonDefaultGroup(buttonDefault2, buttonDefault4, buttonDefault6, direction, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ButtonDefaultGroup buttonDefaultGroup = (ButtonDefaultGroup) obj;
        buttonDefaultGroup.getClass();
        ProtoAdapter protoAdapter = ButtonDefault.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, buttonDefaultGroup.primary_button);
        protoAdapter.encodeWithTag(protoWriter, 2, buttonDefaultGroup.secondary_button);
        protoAdapter.encodeWithTag(protoWriter, 3, buttonDefaultGroup.tertiary_button);
        ButtonDefaultGroup.Direction.ADAPTER.encodeWithTag(protoWriter, 4, buttonDefaultGroup.direction);
        protoWriter.writeBytes(buttonDefaultGroup.unknownFields());
    }
}
