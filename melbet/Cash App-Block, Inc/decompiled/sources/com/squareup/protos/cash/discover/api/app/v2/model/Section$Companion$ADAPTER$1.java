package com.squareup.protos.cash.discover.api.app.v2.model;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Section$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Section$Content$RowSection section$Content$RowSection = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Section(section$Content$RowSection, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 3) {
                section$Content$RowSection = new Section$Content$RowSection((RowSection) RowSection.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Section section = (Section) obj;
        reverseProtoWriter.getClass();
        section.getClass();
        reverseProtoWriter.writeBytes(section.unknownFields());
        Section$Content$RowSection section$Content$RowSection = section.content;
        if (section$Content$RowSection != null) {
            RowSection.ADAPTER.encodeWithTag(reverseProtoWriter, 3, section$Content$RowSection.value);
        } else {
            if (section$Content$RowSection == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Section section = (Section) obj;
        section.getClass();
        int size$okio = section.unknownFields().getSize$okio();
        Section$Content$RowSection section$Content$RowSection = section.content;
        if (section$Content$RowSection != null) {
            return RowSection.ADAPTER.encodedSizeWithTag(3, section$Content$RowSection.value) + size$okio;
        }
        if (section$Content$RowSection == null) {
            return size$okio;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Section section = (Section) obj;
        section.getClass();
        ByteString byteString = ByteString.EMPTY;
        Section$Content$RowSection section$Content$RowSection = section.content;
        byteString.getClass();
        return new Section(section$Content$RowSection, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Section section = (Section) obj;
        section.getClass();
        Section$Content$RowSection section$Content$RowSection = section.content;
        if (section$Content$RowSection != null) {
            RowSection.ADAPTER.encodeWithTag(protoWriter, 3, section$Content$RowSection.value);
        } else if (section$Content$RowSection != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(section.unknownFields());
    }
}
