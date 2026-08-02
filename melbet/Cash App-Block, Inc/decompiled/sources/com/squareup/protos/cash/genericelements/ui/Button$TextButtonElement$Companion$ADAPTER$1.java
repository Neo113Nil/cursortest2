package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.genericelements.ui.Button$TextButtonElement;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Button$TextButtonElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Button$TextButtonElement((String) obj4, (Action) obj5, (Button$Type) obj6, (Button$TextButtonElement.State) obj7, (Button$TextButtonElement.Size) obj8, (Alignment) obj9, (Color) obj10, (Color) obj11, (Color) obj12, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj5 = TransactorKt.decodeMessageOrMerge(Action.ADAPTER, protoReader, obj5);
                    break;
                case 3:
                    obj = obj6;
                    obj2 = obj7;
                    obj3 = obj8;
                    try {
                        obj6 = Button$Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj8 = obj3;
                    obj7 = obj2;
                    break;
                case 4:
                    obj = obj6;
                    obj2 = obj7;
                    obj3 = obj8;
                    try {
                        obj6 = obj;
                        obj7 = Button$TextButtonElement.State.ADAPTER.decode(protoReader);
                        obj8 = obj3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 5:
                    obj = obj6;
                    obj2 = obj7;
                    try {
                        obj6 = obj;
                        obj8 = Button$TextButtonElement.Size.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        obj3 = obj8;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                    obj7 = obj2;
                    break;
                case 6:
                    try {
                        obj9 = Alignment.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        obj = obj6;
                        obj2 = obj7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                case 7:
                    obj10 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj10);
                    break;
                case 8:
                    obj11 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj11);
                    break;
                case 9:
                    obj12 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj12);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj6;
                    obj2 = obj7;
                    obj3 = obj8;
                    obj6 = obj;
                    obj8 = obj3;
                    obj7 = obj2;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Button$TextButtonElement button$TextButtonElement = (Button$TextButtonElement) obj;
        reverseProtoWriter.getClass();
        button$TextButtonElement.getClass();
        reverseProtoWriter.writeBytes(button$TextButtonElement.unknownFields());
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, button$TextButtonElement.background_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, button$TextButtonElement.text_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, button$TextButtonElement.color);
        Alignment.ADAPTER.encodeWithTag(reverseProtoWriter, 6, button$TextButtonElement.alignment);
        Button$TextButtonElement.Size.ADAPTER.encodeWithTag(reverseProtoWriter, 5, button$TextButtonElement.size);
        Button$TextButtonElement.State.ADAPTER.encodeWithTag(reverseProtoWriter, 4, button$TextButtonElement.state);
        Button$Type.ADAPTER.encodeWithTag(reverseProtoWriter, 3, button$TextButtonElement.f1265type);
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 2, button$TextButtonElement.action);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, button$TextButtonElement.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Button$TextButtonElement button$TextButtonElement = (Button$TextButtonElement) obj;
        button$TextButtonElement.getClass();
        int encodedSizeWithTag = Alignment.ADAPTER.encodedSizeWithTag(6, button$TextButtonElement.alignment) + Button$TextButtonElement.Size.ADAPTER.encodedSizeWithTag(5, button$TextButtonElement.size) + Button$TextButtonElement.State.ADAPTER.encodedSizeWithTag(4, button$TextButtonElement.state) + Button$Type.ADAPTER.encodedSizeWithTag(3, button$TextButtonElement.f1265type) + Action.ADAPTER.encodedSizeWithTag(2, button$TextButtonElement.action) + ProtoAdapter.STRING.encodedSizeWithTag(1, button$TextButtonElement.text) + button$TextButtonElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Color.ADAPTER;
        return protoAdapter.encodedSizeWithTag(9, button$TextButtonElement.background_color) + protoAdapter.encodedSizeWithTag(8, button$TextButtonElement.text_color) + protoAdapter.encodedSizeWithTag(7, button$TextButtonElement.color) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Button$TextButtonElement button$TextButtonElement = (Button$TextButtonElement) obj;
        button$TextButtonElement.getClass();
        Action action = button$TextButtonElement.action;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        Color color = button$TextButtonElement.color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = button$TextButtonElement.text_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        Color color5 = button$TextButtonElement.background_color;
        Color color6 = color5 != null ? (Color) Color.ADAPTER.redact(color5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = button$TextButtonElement.text;
        Button$Type button$Type = button$TextButtonElement.f1265type;
        Button$TextButtonElement.State state = button$TextButtonElement.state;
        Button$TextButtonElement.Size size = button$TextButtonElement.size;
        Alignment alignment = button$TextButtonElement.alignment;
        byteString.getClass();
        return new Button$TextButtonElement(str, action2, button$Type, state, size, alignment, color2, color4, color6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Button$TextButtonElement button$TextButtonElement = (Button$TextButtonElement) obj;
        button$TextButtonElement.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, button$TextButtonElement.text);
        Action.ADAPTER.encodeWithTag(protoWriter, 2, button$TextButtonElement.action);
        Button$Type.ADAPTER.encodeWithTag(protoWriter, 3, button$TextButtonElement.f1265type);
        Button$TextButtonElement.State.ADAPTER.encodeWithTag(protoWriter, 4, button$TextButtonElement.state);
        Button$TextButtonElement.Size.ADAPTER.encodeWithTag(protoWriter, 5, button$TextButtonElement.size);
        Alignment.ADAPTER.encodeWithTag(protoWriter, 6, button$TextButtonElement.alignment);
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 7, button$TextButtonElement.color);
        protoAdapter.encodeWithTag(protoWriter, 8, button$TextButtonElement.text_color);
        protoAdapter.encodeWithTag(protoWriter, 9, button$TextButtonElement.background_color);
        protoWriter.writeBytes(button$TextButtonElement.unknownFields());
    }
}
