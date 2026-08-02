package com.squareup.protos.cash.cashapproxy.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RowItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RowItem((Text) obj, (Text) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RowItem rowItem = (RowItem) obj;
        reverseProtoWriter.getClass();
        rowItem.getClass();
        reverseProtoWriter.writeBytes(rowItem.unknownFields());
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, rowItem.detail);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, rowItem.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RowItem rowItem = (RowItem) obj;
        rowItem.getClass();
        int size$okio = rowItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, rowItem.detail) + protoAdapter.encodedSizeWithTag(1, rowItem.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RowItem rowItem = (RowItem) obj;
        rowItem.getClass();
        Text text = rowItem.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = rowItem.detail;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RowItem(text2, text4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RowItem rowItem = (RowItem) obj;
        rowItem.getClass();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, rowItem.title);
        protoAdapter.encodeWithTag(protoWriter, 2, rowItem.detail);
        protoWriter.writeBytes(rowItem.unknownFields());
    }
}
