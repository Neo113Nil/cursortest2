package com.squareup.protos.cash.discover.api.app.v2.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.discover.api.app.v2.api.Summary;
import com.squareup.protos.cash.discover.api.app.v2.model.Text;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Summary$LineItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Summary.LineItem((Text) obj, (Text) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        Summary.LineItem lineItem = (Summary.LineItem) obj;
        reverseProtoWriter.getClass();
        lineItem.getClass();
        reverseProtoWriter.writeBytes(lineItem.unknownFields());
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, lineItem.amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, lineItem.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Summary.LineItem lineItem = (Summary.LineItem) obj;
        lineItem.getClass();
        int size$okio = lineItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, lineItem.amount) + protoAdapter.encodedSizeWithTag(1, lineItem.label) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Summary.LineItem lineItem = (Summary.LineItem) obj;
        lineItem.getClass();
        Text text = lineItem.label;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = lineItem.amount;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Summary.LineItem(text2, text4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Summary.LineItem lineItem = (Summary.LineItem) obj;
        lineItem.getClass();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, lineItem.label);
        protoAdapter.encodeWithTag(protoWriter, 2, lineItem.amount);
        protoWriter.writeBytes(lineItem.unknownFields());
    }
}
