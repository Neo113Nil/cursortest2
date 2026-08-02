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
public final class Section$Group$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Section.Group(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Section.Group.RowItem.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Section.Group group = (Section.Group) obj;
        reverseProtoWriter.getClass();
        group.getClass();
        reverseProtoWriter.writeBytes(group.unknownFields());
        Section.Group.RowItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, group.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Section.Group group = (Section.Group) obj;
        group.getClass();
        return Section.Group.RowItem.ADAPTER.asRepeated().encodedSizeWithTag(1, group.items) + group.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Section.Group group = (Section.Group) obj;
        group.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(group.items, Section.Group.RowItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Section.Group(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Section.Group group = (Section.Group) obj;
        group.getClass();
        Section.Group.RowItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, group.items);
        protoWriter.writeBytes(group.unknownFields());
    }
}
