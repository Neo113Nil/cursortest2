package com.squareup.protos.cash.balancemover.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SavingsMoveCashResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsMoveCashResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsMoveCashResponse savingsMoveCashResponse = (SavingsMoveCashResponse) obj;
        reverseProtoWriter.getClass();
        savingsMoveCashResponse.getClass();
        reverseProtoWriter.writeBytes(savingsMoveCashResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, savingsMoveCashResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsMoveCashResponse savingsMoveCashResponse = (SavingsMoveCashResponse) obj;
        savingsMoveCashResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, savingsMoveCashResponse.response_context) + savingsMoveCashResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsMoveCashResponse savingsMoveCashResponse = (SavingsMoveCashResponse) obj;
        savingsMoveCashResponse.getClass();
        ResponseContext responseContext = savingsMoveCashResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SavingsMoveCashResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsMoveCashResponse savingsMoveCashResponse = (SavingsMoveCashResponse) obj;
        savingsMoveCashResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, savingsMoveCashResponse.response_context);
        protoWriter.writeBytes(savingsMoveCashResponse.unknownFields());
    }
}
