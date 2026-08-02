package com.squareup.protos.franklin.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TriggerBalanceCheckResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TriggerBalanceCheckResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TriggerBalanceCheckResponse triggerBalanceCheckResponse = (TriggerBalanceCheckResponse) obj;
        reverseProtoWriter.getClass();
        triggerBalanceCheckResponse.getClass();
        reverseProtoWriter.writeBytes(triggerBalanceCheckResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TriggerBalanceCheckResponse triggerBalanceCheckResponse = (TriggerBalanceCheckResponse) obj;
        triggerBalanceCheckResponse.getClass();
        return triggerBalanceCheckResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((TriggerBalanceCheckResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TriggerBalanceCheckResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TriggerBalanceCheckResponse triggerBalanceCheckResponse = (TriggerBalanceCheckResponse) obj;
        triggerBalanceCheckResponse.getClass();
        protoWriter.writeBytes(triggerBalanceCheckResponse.unknownFields());
    }
}
