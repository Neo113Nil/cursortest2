package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
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
                m.add(RowSection.Row.ADAPTER.decode(protoReader));
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
        RowSection.Row.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, rowSection.rows);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RowSection rowSection = (RowSection) obj;
        rowSection.getClass();
        return RowSection.Row.ADAPTER.asRepeated().encodedSizeWithTag(1, rowSection.rows) + rowSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RowSection rowSection = (RowSection) obj;
        rowSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(rowSection.rows, RowSection.Row.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RowSection(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RowSection rowSection = (RowSection) obj;
        rowSection.getClass();
        RowSection.Row.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, rowSection.rows);
        protoWriter.writeBytes(rowSection.unknownFields());
    }
}
