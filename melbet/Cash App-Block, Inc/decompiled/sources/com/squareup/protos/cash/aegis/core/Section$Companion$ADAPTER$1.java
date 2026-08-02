package com.squareup.protos.cash.aegis.core;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Section$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Section((String) obj, (Section.HeaderButton) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Section.HeaderButton.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(Section.Group.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Section section = (Section) obj;
        reverseProtoWriter.getClass();
        section.getClass();
        reverseProtoWriter.writeBytes(section.unknownFields());
        Section.Group.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, section.groups);
        Section.HeaderButton.ADAPTER.encodeWithTag(reverseProtoWriter, 2, section.header_button);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, section.header_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Section section = (Section) obj;
        section.getClass();
        return Section.Group.ADAPTER.asRepeated().encodedSizeWithTag(3, section.groups) + Section.HeaderButton.ADAPTER.encodedSizeWithTag(2, section.header_button) + ProtoAdapter.STRING.encodedSizeWithTag(1, section.header_text) + section.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Section section = (Section) obj;
        section.getClass();
        Section.HeaderButton headerButton = section.header_button;
        Section.HeaderButton headerButton2 = headerButton != null ? (Section.HeaderButton) Section.HeaderButton.ADAPTER.redact(headerButton) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(section.groups, Section.Group.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = section.header_text;
        byteString.getClass();
        return new Section(str, headerButton2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Section section = (Section) obj;
        section.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, section.header_text);
        Section.HeaderButton.ADAPTER.encodeWithTag(protoWriter, 2, section.header_button);
        Section.Group.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, section.groups);
        protoWriter.writeBytes(section.unknownFields());
    }
}
