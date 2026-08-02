package com.squareup.protos.cash.cashliteflow.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InitiateBitcoinWithdrawalResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InitiateBitcoinWithdrawalResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        InitiateBitcoinWithdrawalResponse initiateBitcoinWithdrawalResponse = (InitiateBitcoinWithdrawalResponse) obj;
        reverseProtoWriter.getClass();
        initiateBitcoinWithdrawalResponse.getClass();
        reverseProtoWriter.writeBytes(initiateBitcoinWithdrawalResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, initiateBitcoinWithdrawalResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InitiateBitcoinWithdrawalResponse initiateBitcoinWithdrawalResponse = (InitiateBitcoinWithdrawalResponse) obj;
        initiateBitcoinWithdrawalResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, initiateBitcoinWithdrawalResponse.response_context) + initiateBitcoinWithdrawalResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InitiateBitcoinWithdrawalResponse initiateBitcoinWithdrawalResponse = (InitiateBitcoinWithdrawalResponse) obj;
        initiateBitcoinWithdrawalResponse.getClass();
        ResponseContext responseContext = initiateBitcoinWithdrawalResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InitiateBitcoinWithdrawalResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InitiateBitcoinWithdrawalResponse initiateBitcoinWithdrawalResponse = (InitiateBitcoinWithdrawalResponse) obj;
        initiateBitcoinWithdrawalResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, initiateBitcoinWithdrawalResponse.response_context);
        protoWriter.writeBytes(initiateBitcoinWithdrawalResponse.unknownFields());
    }
}
