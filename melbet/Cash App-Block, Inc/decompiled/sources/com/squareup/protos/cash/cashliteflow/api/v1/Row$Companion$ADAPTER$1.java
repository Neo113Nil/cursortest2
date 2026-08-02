package com.squareup.protos.cash.cashliteflow.api.v1;

import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Row$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Row((String) obj, (String) obj2, (Row.RowAction) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = Row.RowAction.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Row row = (Row) obj;
        reverseProtoWriter.getClass();
        row.getClass();
        reverseProtoWriter.writeBytes(row.unknownFields());
        Row.RowAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, row.action);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, row.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, row.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Row row = (Row) obj;
        row.getClass();
        int size$okio = row.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Row.RowAction.ADAPTER.encodedSizeWithTag(3, row.action) + protoAdapter.encodedSizeWithTag(2, row.subtitle) + protoAdapter.encodedSizeWithTag(1, row.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Row row = (Row) obj;
        row.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = row.title;
        String str2 = row.subtitle;
        Row.RowAction rowAction = row.action;
        byteString.getClass();
        return new Row(str, str2, rowAction, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Row row = (Row) obj;
        row.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, row.title);
        protoAdapter.encodeWithTag(protoWriter, 2, row.subtitle);
        Row.RowAction.ADAPTER.encodeWithTag(protoWriter, 3, row.action);
        protoWriter.writeBytes(row.unknownFields());
    }
}
