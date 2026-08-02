package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.TagDefinition;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TagDefinition$OpenNow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TagDefinition.OpenNow(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TagDefinition.OpenNow openNow = (TagDefinition.OpenNow) obj;
        reverseProtoWriter.getClass();
        openNow.getClass();
        reverseProtoWriter.writeBytes(openNow.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TagDefinition.OpenNow openNow = (TagDefinition.OpenNow) obj;
        openNow.getClass();
        return openNow.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((TagDefinition.OpenNow) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TagDefinition.OpenNow(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TagDefinition.OpenNow openNow = (TagDefinition.OpenNow) obj;
        openNow.getClass();
        protoWriter.writeBytes(openNow.unknownFields());
    }
}
