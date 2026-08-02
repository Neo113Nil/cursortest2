package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.RowSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RowSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RowSection(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(RowSection.RowItem.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RowSection rowSection = (RowSection) obj;
        reverseProtoWriter.getClass();
        rowSection.getClass();
        reverseProtoWriter.writeBytes(rowSection.unknownFields());
        RowSection.RowItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, rowSection.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RowSection rowSection = (RowSection) obj;
        rowSection.getClass();
        return RowSection.RowItem.ADAPTER.asRepeated().encodedSizeWithTag(1, rowSection.items) + rowSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RowSection rowSection = (RowSection) obj;
        rowSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(rowSection.items, RowSection.RowItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RowSection(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RowSection rowSection = (RowSection) obj;
        rowSection.getClass();
        RowSection.RowItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, rowSection.items);
        protoWriter.writeBytes(rowSection.unknownFields());
    }
}
