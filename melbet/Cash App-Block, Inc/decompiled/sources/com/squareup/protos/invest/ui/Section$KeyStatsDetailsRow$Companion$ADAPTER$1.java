package com.squareup.protos.invest.ui;

import com.squareup.protos.invest.ui.Section;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Section$KeyStatsDetailsRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Section.KeyStatsDetailsRow((String) obj, (String) obj2, (String) obj3, (ClientDriven) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                try {
                    obj4 = ClientDriven.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Section.KeyStatsDetailsRow keyStatsDetailsRow = (Section.KeyStatsDetailsRow) obj;
        reverseProtoWriter.getClass();
        keyStatsDetailsRow.getClass();
        reverseProtoWriter.writeBytes(keyStatsDetailsRow.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, keyStatsDetailsRow.spoken_label);
        ClientDriven.ADAPTER.encodeWithTag(reverseProtoWriter, 4, keyStatsDetailsRow.client_driven);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, keyStatsDetailsRow.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, keyStatsDetailsRow.value);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, keyStatsDetailsRow.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Section.KeyStatsDetailsRow keyStatsDetailsRow = (Section.KeyStatsDetailsRow) obj;
        keyStatsDetailsRow.getClass();
        int size$okio = keyStatsDetailsRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, keyStatsDetailsRow.spoken_label) + ClientDriven.ADAPTER.encodedSizeWithTag(4, keyStatsDetailsRow.client_driven) + protoAdapter.encodedSizeWithTag(3, keyStatsDetailsRow.description) + protoAdapter.encodedSizeWithTag(2, keyStatsDetailsRow.value) + protoAdapter.encodedSizeWithTag(1, keyStatsDetailsRow.label) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Section.KeyStatsDetailsRow keyStatsDetailsRow = (Section.KeyStatsDetailsRow) obj;
        keyStatsDetailsRow.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = keyStatsDetailsRow.label;
        String str2 = keyStatsDetailsRow.value;
        String str3 = keyStatsDetailsRow.description;
        ClientDriven clientDriven = keyStatsDetailsRow.client_driven;
        String str4 = keyStatsDetailsRow.spoken_label;
        byteString.getClass();
        return new Section.KeyStatsDetailsRow(str, str2, str3, clientDriven, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Section.KeyStatsDetailsRow keyStatsDetailsRow = (Section.KeyStatsDetailsRow) obj;
        keyStatsDetailsRow.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, keyStatsDetailsRow.label);
        protoAdapter.encodeWithTag(protoWriter, 2, keyStatsDetailsRow.value);
        protoAdapter.encodeWithTag(protoWriter, 3, keyStatsDetailsRow.description);
        ClientDriven.ADAPTER.encodeWithTag(protoWriter, 4, keyStatsDetailsRow.client_driven);
        protoAdapter.encodeWithTag(protoWriter, 5, keyStatsDetailsRow.spoken_label);
        protoWriter.writeBytes(keyStatsDetailsRow.unknownFields());
    }
}
