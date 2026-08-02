package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SpendingInsightsElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SpendingInsightsElement(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SpendingInsightsElement spendingInsightsElement = (SpendingInsightsElement) obj;
        reverseProtoWriter.getClass();
        spendingInsightsElement.getClass();
        reverseProtoWriter.writeBytes(spendingInsightsElement.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SpendingInsightsElement spendingInsightsElement = (SpendingInsightsElement) obj;
        spendingInsightsElement.getClass();
        return spendingInsightsElement.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SpendingInsightsElement) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SpendingInsightsElement(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SpendingInsightsElement spendingInsightsElement = (SpendingInsightsElement) obj;
        spendingInsightsElement.getClass();
        protoWriter.writeBytes(spendingInsightsElement.unknownFields());
    }
}
