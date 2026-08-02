package com.squareup.protos.teamapp.ui;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
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
                return new Row((ParameterizedText) obj, (ParameterizedText) obj2, (Link) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ParameterizedText.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(ParameterizedText.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Link.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Row row = (Row) obj;
        reverseProtoWriter.getClass();
        row.getClass();
        reverseProtoWriter.writeBytes(row.unknownFields());
        Link.ADAPTER.encodeWithTag(reverseProtoWriter, 3, row.link);
        ProtoAdapter protoAdapter = ParameterizedText.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, row.value);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, row.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Row row = (Row) obj;
        row.getClass();
        int size$okio = row.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ParameterizedText.ADAPTER;
        return Link.ADAPTER.encodedSizeWithTag(3, row.link) + protoAdapter.encodedSizeWithTag(2, row.value) + protoAdapter.encodedSizeWithTag(1, row.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Row row = (Row) obj;
        row.getClass();
        ParameterizedText parameterizedText = row.title;
        ParameterizedText parameterizedText2 = parameterizedText != null ? (ParameterizedText) ParameterizedText.ADAPTER.redact(parameterizedText) : null;
        ParameterizedText parameterizedText3 = row.value;
        ParameterizedText parameterizedText4 = parameterizedText3 != null ? (ParameterizedText) ParameterizedText.ADAPTER.redact(parameterizedText3) : null;
        Link link = row.link;
        Link link2 = link != null ? (Link) Link.ADAPTER.redact(link) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Row(parameterizedText2, parameterizedText4, link2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Row row = (Row) obj;
        row.getClass();
        ProtoAdapter protoAdapter = ParameterizedText.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, row.title);
        protoAdapter.encodeWithTag(protoWriter, 2, row.value);
        Link.ADAPTER.encodeWithTag(protoWriter, 3, row.link);
        protoWriter.writeBytes(row.unknownFields());
    }
}
