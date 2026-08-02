package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OverdraftCoverageElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OverdraftCoverageElement(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OverdraftCoverageElement overdraftCoverageElement = (OverdraftCoverageElement) obj;
        reverseProtoWriter.getClass();
        overdraftCoverageElement.getClass();
        reverseProtoWriter.writeBytes(overdraftCoverageElement.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OverdraftCoverageElement overdraftCoverageElement = (OverdraftCoverageElement) obj;
        overdraftCoverageElement.getClass();
        return overdraftCoverageElement.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((OverdraftCoverageElement) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OverdraftCoverageElement(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OverdraftCoverageElement overdraftCoverageElement = (OverdraftCoverageElement) obj;
        overdraftCoverageElement.getClass();
        protoWriter.writeBytes(overdraftCoverageElement.unknownFields());
    }
}
