package com.squareup.protos.invest.ui;

import com.squareup.protos.invest.ui.Section;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Section$Row$Value$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Section.Row.Value((String) obj, (Section.Row.Value.Icon) obj2, (Section.Row.Value.Color) obj3, (ClientDriven) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = Section.Row.Value.Icon.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                try {
                    obj3 = Section.Row.Value.Color.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = ClientDriven.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Section.Row.Value value = (Section.Row.Value) obj;
        reverseProtoWriter.getClass();
        value.getClass();
        reverseProtoWriter.writeBytes(value.unknownFields());
        ClientDriven.ADAPTER.encodeWithTag(reverseProtoWriter, 4, value.client_driven);
        Section.Row.Value.Color.ADAPTER.encodeWithTag(reverseProtoWriter, 3, value.color);
        Section.Row.Value.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 2, value.icon);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, value.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Section.Row.Value value = (Section.Row.Value) obj;
        value.getClass();
        return ClientDriven.ADAPTER.encodedSizeWithTag(4, value.client_driven) + Section.Row.Value.Color.ADAPTER.encodedSizeWithTag(3, value.color) + Section.Row.Value.Icon.ADAPTER.encodedSizeWithTag(2, value.icon) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Section.Row.Value value = (Section.Row.Value) obj;
        value.getClass();
        return Section.Row.Value.copy$default(value, null, ByteString.EMPTY, 15);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Section.Row.Value value = (Section.Row.Value) obj;
        value.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, value.text);
        Section.Row.Value.Icon.ADAPTER.encodeWithTag(protoWriter, 2, value.icon);
        Section.Row.Value.Color.ADAPTER.encodeWithTag(protoWriter, 3, value.color);
        ClientDriven.ADAPTER.encodeWithTag(protoWriter, 4, value.client_driven);
        protoWriter.writeBytes(value.unknownFields());
    }
}
