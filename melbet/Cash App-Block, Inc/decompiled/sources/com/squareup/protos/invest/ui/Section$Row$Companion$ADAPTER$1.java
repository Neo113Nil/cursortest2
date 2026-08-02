package com.squareup.protos.invest.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.invest.ui.Section;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Section$Row$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Section.Row((String) obj, (Section.Row.Value) obj2, (Section.Row.MoreInfo) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Section.Row.Value.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Section.Row.MoreInfo.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Section.Row row = (Section.Row) obj;
        reverseProtoWriter.getClass();
        row.getClass();
        reverseProtoWriter.writeBytes(row.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, row.spoken_label);
        Section.Row.MoreInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 3, row.more_info);
        Section.Row.Value.ADAPTER.encodeWithTag(reverseProtoWriter, 2, row.value);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, row.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Section.Row row = (Section.Row) obj;
        row.getClass();
        int size$okio = row.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, row.spoken_label) + Section.Row.MoreInfo.ADAPTER.encodedSizeWithTag(3, row.more_info) + Section.Row.Value.ADAPTER.encodedSizeWithTag(2, row.value) + protoAdapter.encodedSizeWithTag(1, row.label) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Section.Row row = (Section.Row) obj;
        row.getClass();
        Section.Row.Value value = row.value;
        Section.Row.Value value2 = value != null ? (Section.Row.Value) Section.Row.Value.ADAPTER.redact(value) : null;
        Section.Row.MoreInfo moreInfo = row.more_info;
        return Section.Row.copy$default(row, value2, moreInfo != null ? (Section.Row.MoreInfo) Section.Row.MoreInfo.ADAPTER.redact(moreInfo) : null, ByteString.EMPTY, 9);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Section.Row row = (Section.Row) obj;
        row.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, row.label);
        Section.Row.Value.ADAPTER.encodeWithTag(protoWriter, 2, row.value);
        Section.Row.MoreInfo.ADAPTER.encodeWithTag(protoWriter, 3, row.more_info);
        protoAdapter.encodeWithTag(protoWriter, 4, row.spoken_label);
        protoWriter.writeBytes(row.unknownFields());
    }
}
