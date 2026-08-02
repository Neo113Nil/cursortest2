package com.squareup.protos.cash.discover.api.app.v2.model;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v2.model.RowSection;
import com.squareup.protos.cash.discover.api.app.v2.model.Section;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RowSection$Page$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RowSection.Page(m, (String) obj, (Section.Modal) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(RowSection.Item.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Section.Modal.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RowSection.Page page = (RowSection.Page) obj;
        reverseProtoWriter.getClass();
        page.getClass();
        reverseProtoWriter.writeBytes(page.unknownFields());
        Section.Modal.ADAPTER.encodeWithTag(reverseProtoWriter, 3, page.warning);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, page.cursor);
        RowSection.Item.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, page.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RowSection.Page page = (RowSection.Page) obj;
        page.getClass();
        return Section.Modal.ADAPTER.encodedSizeWithTag(3, page.warning) + ProtoAdapter.STRING.encodedSizeWithTag(2, page.cursor) + RowSection.Item.ADAPTER.asRepeated().encodedSizeWithTag(1, page.items) + page.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RowSection.Page page = (RowSection.Page) obj;
        page.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(page.items, RowSection.Item.ADAPTER);
        Section.Modal modal = page.warning;
        Section.Modal modal2 = modal != null ? (Section.Modal) Section.Modal.ADAPTER.redact(modal) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = page.cursor;
        byteString.getClass();
        return new RowSection.Page(m1169redactElements, str, modal2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RowSection.Page page = (RowSection.Page) obj;
        page.getClass();
        RowSection.Item.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, page.items);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, page.cursor);
        Section.Modal.ADAPTER.encodeWithTag(protoWriter, 3, page.warning);
        protoWriter.writeBytes(page.unknownFields());
    }
}
