package com.squareup.protos.cash.discover.api.app.v2.model;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.discover.api.app.v2.model.RowSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RowSection$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new RowSection((Text) obj, (RowSection.Page) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(RowSection.Page.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RowSection rowSection = (RowSection) obj;
        reverseProtoWriter.getClass();
        rowSection.getClass();
        reverseProtoWriter.writeBytes(rowSection.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, rowSection.id);
        RowSection.Page.ADAPTER.encodeWithTag(reverseProtoWriter, 3, rowSection.page);
        Text.ADAPTER.encodeWithTag(reverseProtoWriter, 1, rowSection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RowSection rowSection = (RowSection) obj;
        rowSection.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(4, rowSection.id) + RowSection.Page.ADAPTER.encodedSizeWithTag(3, rowSection.page) + Text.ADAPTER.encodedSizeWithTag(1, rowSection.title) + rowSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RowSection rowSection = (RowSection) obj;
        rowSection.getClass();
        Text text = rowSection.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        RowSection.Page page = rowSection.page;
        RowSection.Page page2 = page != null ? (RowSection.Page) RowSection.Page.ADAPTER.redact(page) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = rowSection.id;
        byteString.getClass();
        return new RowSection(text2, page2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RowSection rowSection = (RowSection) obj;
        rowSection.getClass();
        Text.ADAPTER.encodeWithTag(protoWriter, 1, rowSection.title);
        RowSection.Page.ADAPTER.encodeWithTag(protoWriter, 3, rowSection.page);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, rowSection.id);
        protoWriter.writeBytes(rowSection.unknownFields());
    }
}
