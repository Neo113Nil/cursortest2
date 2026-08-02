package com.squareup.protos.cash.transactionwriter.config;

import com.squareup.protos.cash.transactionwriter.config.TransactionActivityConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TransactionActivityConfig$TransactionAuthConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TransactionActivityConfig.TransactionAuthConfig((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TransactionActivityConfig.TransactionAuthConfig transactionAuthConfig = (TransactionActivityConfig.TransactionAuthConfig) obj;
        reverseProtoWriter.getClass();
        transactionAuthConfig.getClass();
        reverseProtoWriter.writeBytes(transactionAuthConfig.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, transactionAuthConfig.transaction_auth_rollup_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TransactionActivityConfig.TransactionAuthConfig transactionAuthConfig = (TransactionActivityConfig.TransactionAuthConfig) obj;
        transactionAuthConfig.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, transactionAuthConfig.transaction_auth_rollup_url) + transactionAuthConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TransactionActivityConfig.TransactionAuthConfig transactionAuthConfig = (TransactionActivityConfig.TransactionAuthConfig) obj;
        transactionAuthConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = transactionAuthConfig.transaction_auth_rollup_url;
        byteString.getClass();
        return new TransactionActivityConfig.TransactionAuthConfig(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TransactionActivityConfig.TransactionAuthConfig transactionAuthConfig = (TransactionActivityConfig.TransactionAuthConfig) obj;
        transactionAuthConfig.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, transactionAuthConfig.transaction_auth_rollup_url);
        protoWriter.writeBytes(transactionAuthConfig.unknownFields());
    }
}
