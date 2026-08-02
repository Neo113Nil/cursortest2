package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.genericelements.ui.ButtonCtaGroupComponent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ButtonCtaGroupComponent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ButtonCtaGroupComponent((ButtonCtaGroupComponent.Direction) obj, (String) obj2, (Boolean) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ButtonCtaGroupComponent.Direction.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ArcadeButtonElement.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ButtonCtaGroupComponent buttonCtaGroupComponent = (ButtonCtaGroupComponent) obj;
        reverseProtoWriter.getClass();
        buttonCtaGroupComponent.getClass();
        reverseProtoWriter.writeBytes(buttonCtaGroupComponent.unknownFields());
        ArcadeButtonElement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, buttonCtaGroupComponent.buttons);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, buttonCtaGroupComponent.show_horizontal_divider);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, buttonCtaGroupComponent.text);
        ButtonCtaGroupComponent.Direction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, buttonCtaGroupComponent.direction);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ButtonCtaGroupComponent buttonCtaGroupComponent = (ButtonCtaGroupComponent) obj;
        buttonCtaGroupComponent.getClass();
        return ArcadeButtonElement.ADAPTER.asRepeated().encodedSizeWithTag(4, buttonCtaGroupComponent.buttons) + ProtoAdapter.BOOL.encodedSizeWithTag(3, buttonCtaGroupComponent.show_horizontal_divider) + ProtoAdapter.STRING.encodedSizeWithTag(2, buttonCtaGroupComponent.text) + ButtonCtaGroupComponent.Direction.ADAPTER.encodedSizeWithTag(1, buttonCtaGroupComponent.direction) + buttonCtaGroupComponent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ButtonCtaGroupComponent buttonCtaGroupComponent = (ButtonCtaGroupComponent) obj;
        buttonCtaGroupComponent.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(buttonCtaGroupComponent.buttons, ArcadeButtonElement.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        ButtonCtaGroupComponent.Direction direction = buttonCtaGroupComponent.direction;
        String str = buttonCtaGroupComponent.text;
        Boolean bool = buttonCtaGroupComponent.show_horizontal_divider;
        byteString.getClass();
        return new ButtonCtaGroupComponent(direction, str, bool, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ButtonCtaGroupComponent buttonCtaGroupComponent = (ButtonCtaGroupComponent) obj;
        buttonCtaGroupComponent.getClass();
        ButtonCtaGroupComponent.Direction.ADAPTER.encodeWithTag(protoWriter, 1, buttonCtaGroupComponent.direction);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, buttonCtaGroupComponent.text);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, buttonCtaGroupComponent.show_horizontal_divider);
        ArcadeButtonElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, buttonCtaGroupComponent.buttons);
        protoWriter.writeBytes(buttonCtaGroupComponent.unknownFields());
    }
}
