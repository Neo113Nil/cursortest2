package com.squareup.protos.cash.local.client.app.internal;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateLocalCashTransactionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateLocalCashTransactionResponse((Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateLocalCashTransactionResponse createLocalCashTransactionResponse = (CreateLocalCashTransactionResponse) obj;
        reverseProtoWriter.getClass();
        createLocalCashTransactionResponse.getClass();
        reverseProtoWriter.writeBytes(createLocalCashTransactionResponse.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, createLocalCashTransactionResponse.transaction_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateLocalCashTransactionResponse createLocalCashTransactionResponse = (CreateLocalCashTransactionResponse) obj;
        createLocalCashTransactionResponse.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(1, createLocalCashTransactionResponse.transaction_id) + createLocalCashTransactionResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateLocalCashTransactionResponse createLocalCashTransactionResponse = (CreateLocalCashTransactionResponse) obj;
        createLocalCashTransactionResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = createLocalCashTransactionResponse.transaction_id;
        byteString.getClass();
        return new CreateLocalCashTransactionResponse(l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateLocalCashTransactionResponse createLocalCashTransactionResponse = (CreateLocalCashTransactionResponse) obj;
        createLocalCashTransactionResponse.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, createLocalCashTransactionResponse.transaction_id);
        protoWriter.writeBytes(createLocalCashTransactionResponse.unknownFields());
    }
}
