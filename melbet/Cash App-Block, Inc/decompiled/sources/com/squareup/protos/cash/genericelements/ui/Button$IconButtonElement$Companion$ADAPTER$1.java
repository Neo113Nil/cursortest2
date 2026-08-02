package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.genericelements.ui.Button$IconButtonElement;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Button$IconButtonElement$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Button$IconButtonElement((Image) obj, (Action) obj2, (Button$Type) obj3, (Button$IconButtonElement.State) obj4, (Button$IconButtonElement.Size) obj5, (Alignment) obj6, (Color) obj7, (Color) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Action.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    try {
                        obj3 = Button$Type.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    try {
                        obj4 = Button$IconButtonElement.State.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 5:
                    try {
                        obj5 = Button$IconButtonElement.Size.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 6:
                    try {
                        obj6 = Alignment.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj8);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Button$IconButtonElement button$IconButtonElement = (Button$IconButtonElement) obj;
        reverseProtoWriter.getClass();
        button$IconButtonElement.getClass();
        reverseProtoWriter.writeBytes(button$IconButtonElement.unknownFields());
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, button$IconButtonElement.background_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, button$IconButtonElement.color);
        Alignment.ADAPTER.encodeWithTag(reverseProtoWriter, 6, button$IconButtonElement.alignment);
        Button$IconButtonElement.Size.ADAPTER.encodeWithTag(reverseProtoWriter, 5, button$IconButtonElement.size);
        Button$IconButtonElement.State.ADAPTER.encodeWithTag(reverseProtoWriter, 4, button$IconButtonElement.state);
        Button$Type.ADAPTER.encodeWithTag(reverseProtoWriter, 3, button$IconButtonElement.f1264type);
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 2, button$IconButtonElement.action);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, button$IconButtonElement.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Button$IconButtonElement button$IconButtonElement = (Button$IconButtonElement) obj;
        button$IconButtonElement.getClass();
        int encodedSizeWithTag = Alignment.ADAPTER.encodedSizeWithTag(6, button$IconButtonElement.alignment) + Button$IconButtonElement.Size.ADAPTER.encodedSizeWithTag(5, button$IconButtonElement.size) + Button$IconButtonElement.State.ADAPTER.encodedSizeWithTag(4, button$IconButtonElement.state) + Button$Type.ADAPTER.encodedSizeWithTag(3, button$IconButtonElement.f1264type) + Action.ADAPTER.encodedSizeWithTag(2, button$IconButtonElement.action) + Image.ADAPTER.encodedSizeWithTag(1, button$IconButtonElement.icon) + button$IconButtonElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Color.ADAPTER;
        return protoAdapter.encodedSizeWithTag(8, button$IconButtonElement.background_color) + protoAdapter.encodedSizeWithTag(7, button$IconButtonElement.color) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Button$IconButtonElement button$IconButtonElement = (Button$IconButtonElement) obj;
        button$IconButtonElement.getClass();
        Image image = button$IconButtonElement.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Action action = button$IconButtonElement.action;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        Color color = button$IconButtonElement.color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = button$IconButtonElement.background_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        ByteString byteString = ByteString.EMPTY;
        Button$Type button$Type = button$IconButtonElement.f1264type;
        Button$IconButtonElement.State state = button$IconButtonElement.state;
        Button$IconButtonElement.Size size = button$IconButtonElement.size;
        Alignment alignment = button$IconButtonElement.alignment;
        byteString.getClass();
        return new Button$IconButtonElement(image2, action2, button$Type, state, size, alignment, color2, color4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Button$IconButtonElement button$IconButtonElement = (Button$IconButtonElement) obj;
        button$IconButtonElement.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, button$IconButtonElement.icon);
        Action.ADAPTER.encodeWithTag(protoWriter, 2, button$IconButtonElement.action);
        Button$Type.ADAPTER.encodeWithTag(protoWriter, 3, button$IconButtonElement.f1264type);
        Button$IconButtonElement.State.ADAPTER.encodeWithTag(protoWriter, 4, button$IconButtonElement.state);
        Button$IconButtonElement.Size.ADAPTER.encodeWithTag(protoWriter, 5, button$IconButtonElement.size);
        Alignment.ADAPTER.encodeWithTag(protoWriter, 6, button$IconButtonElement.alignment);
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 7, button$IconButtonElement.color);
        protoAdapter.encodeWithTag(protoWriter, 8, button$IconButtonElement.background_color);
        protoWriter.writeBytes(button$IconButtonElement.unknownFields());
    }
}
