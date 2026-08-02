package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AfterpayPrepurchaseElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayPrepurchaseElement(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayPrepurchaseElement afterpayPrepurchaseElement = (AfterpayPrepurchaseElement) obj;
        reverseProtoWriter.getClass();
        afterpayPrepurchaseElement.getClass();
        reverseProtoWriter.writeBytes(afterpayPrepurchaseElement.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayPrepurchaseElement afterpayPrepurchaseElement = (AfterpayPrepurchaseElement) obj;
        afterpayPrepurchaseElement.getClass();
        return afterpayPrepurchaseElement.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((AfterpayPrepurchaseElement) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AfterpayPrepurchaseElement(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayPrepurchaseElement afterpayPrepurchaseElement = (AfterpayPrepurchaseElement) obj;
        afterpayPrepurchaseElement.getClass();
        protoWriter.writeBytes(afterpayPrepurchaseElement.unknownFields());
    }
}
