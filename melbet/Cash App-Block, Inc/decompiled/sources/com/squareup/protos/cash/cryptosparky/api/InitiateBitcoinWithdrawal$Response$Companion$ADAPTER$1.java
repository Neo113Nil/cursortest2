package com.squareup.protos.cash.cryptosparky.api;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InitiateBitcoinWithdrawal$Response$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InitiateBitcoinWithdrawal$Response((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        InitiateBitcoinWithdrawal$Response initiateBitcoinWithdrawal$Response = (InitiateBitcoinWithdrawal$Response) obj;
        reverseProtoWriter.getClass();
        initiateBitcoinWithdrawal$Response.getClass();
        reverseProtoWriter.writeBytes(initiateBitcoinWithdrawal$Response.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, initiateBitcoinWithdrawal$Response.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InitiateBitcoinWithdrawal$Response initiateBitcoinWithdrawal$Response = (InitiateBitcoinWithdrawal$Response) obj;
        initiateBitcoinWithdrawal$Response.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, initiateBitcoinWithdrawal$Response.response_context) + initiateBitcoinWithdrawal$Response.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InitiateBitcoinWithdrawal$Response initiateBitcoinWithdrawal$Response = (InitiateBitcoinWithdrawal$Response) obj;
        initiateBitcoinWithdrawal$Response.getClass();
        ResponseContext responseContext = initiateBitcoinWithdrawal$Response.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InitiateBitcoinWithdrawal$Response(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InitiateBitcoinWithdrawal$Response initiateBitcoinWithdrawal$Response = (InitiateBitcoinWithdrawal$Response) obj;
        initiateBitcoinWithdrawal$Response.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, initiateBitcoinWithdrawal$Response.response_context);
        protoWriter.writeBytes(initiateBitcoinWithdrawal$Response.unknownFields());
    }
}
