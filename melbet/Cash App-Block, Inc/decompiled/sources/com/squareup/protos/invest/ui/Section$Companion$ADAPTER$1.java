package com.squareup.protos.invest.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.invest.ui.Section;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class Section$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Section((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(Section.Row.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Section section = (Section) obj;
        reverseProtoWriter.getClass();
        section.getClass();
        reverseProtoWriter.writeBytes(section.unknownFields());
        Section.Row.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, section.rows);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, section.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Section section = (Section) obj;
        section.getClass();
        return Section.Row.ADAPTER.asRepeated().encodedSizeWithTag(2, section.rows) + ProtoAdapter.STRING.encodedSizeWithTag(1, section.title) + section.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Section section = (Section) obj;
        section.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(section.rows, Section.Row.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = section.title;
        byteString.getClass();
        return new Section(str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Section section = (Section) obj;
        section.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, section.title);
        Section.Row.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, section.rows);
        protoWriter.writeBytes(section.unknownFields());
    }
}
