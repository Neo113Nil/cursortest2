package com.squareup.protos.cash.groups;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PrimaryAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrimaryAction((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        PrimaryAction primaryAction = (PrimaryAction) obj;
        reverseProtoWriter.getClass();
        primaryAction.getClass();
        reverseProtoWriter.writeBytes(primaryAction.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, primaryAction.action_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, primaryAction.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrimaryAction primaryAction = (PrimaryAction) obj;
        primaryAction.getClass();
        int size$okio = primaryAction.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, primaryAction.action_url) + protoAdapter.encodedSizeWithTag(1, primaryAction.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrimaryAction primaryAction = (PrimaryAction) obj;
        primaryAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = primaryAction.title;
        String str2 = primaryAction.action_url;
        byteString.getClass();
        return new PrimaryAction(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrimaryAction primaryAction = (PrimaryAction) obj;
        primaryAction.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, primaryAction.title);
        protoAdapter.encodeWithTag(protoWriter, 2, primaryAction.action_url);
        protoWriter.writeBytes(primaryAction.unknownFields());
    }
}
