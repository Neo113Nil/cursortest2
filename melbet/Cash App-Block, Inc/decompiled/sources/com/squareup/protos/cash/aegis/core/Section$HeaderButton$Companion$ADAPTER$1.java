package com.squareup.protos.cash.aegis.core;

import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Section$HeaderButton$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Section.HeaderButton((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Section.HeaderButton headerButton = (Section.HeaderButton) obj;
        reverseProtoWriter.getClass();
        headerButton.getClass();
        reverseProtoWriter.writeBytes(headerButton.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, headerButton.url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, headerButton.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Section.HeaderButton headerButton = (Section.HeaderButton) obj;
        headerButton.getClass();
        int size$okio = headerButton.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, headerButton.url) + protoAdapter.encodedSizeWithTag(1, headerButton.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Section.HeaderButton headerButton = (Section.HeaderButton) obj;
        headerButton.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = headerButton.title;
        String str2 = headerButton.url;
        byteString.getClass();
        return new Section.HeaderButton(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Section.HeaderButton headerButton = (Section.HeaderButton) obj;
        headerButton.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, headerButton.title);
        protoAdapter.encodeWithTag(protoWriter, 2, headerButton.url);
        protoWriter.writeBytes(headerButton.unknownFields());
    }
}
