package com.squareup.protos.cash.transactionwriter.config;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.transactionwriter.config.TransactionActivityConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TransactionActivityConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TransactionActivityConfig((TransactionActivityConfig.TransactionAuthConfig) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(TransactionActivityConfig.TransactionAuthConfig.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TransactionActivityConfig transactionActivityConfig = (TransactionActivityConfig) obj;
        reverseProtoWriter.getClass();
        transactionActivityConfig.getClass();
        reverseProtoWriter.writeBytes(transactionActivityConfig.unknownFields());
        TransactionActivityConfig.TransactionAuthConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 1, transactionActivityConfig.transaction_auth_config);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TransactionActivityConfig transactionActivityConfig = (TransactionActivityConfig) obj;
        transactionActivityConfig.getClass();
        return TransactionActivityConfig.TransactionAuthConfig.ADAPTER.encodedSizeWithTag(1, transactionActivityConfig.transaction_auth_config) + transactionActivityConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TransactionActivityConfig transactionActivityConfig = (TransactionActivityConfig) obj;
        transactionActivityConfig.getClass();
        TransactionActivityConfig.TransactionAuthConfig transactionAuthConfig = transactionActivityConfig.transaction_auth_config;
        TransactionActivityConfig.TransactionAuthConfig transactionAuthConfig2 = transactionAuthConfig != null ? (TransactionActivityConfig.TransactionAuthConfig) TransactionActivityConfig.TransactionAuthConfig.ADAPTER.redact(transactionAuthConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TransactionActivityConfig(transactionAuthConfig2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TransactionActivityConfig transactionActivityConfig = (TransactionActivityConfig) obj;
        transactionActivityConfig.getClass();
        TransactionActivityConfig.TransactionAuthConfig.ADAPTER.encodeWithTag(protoWriter, 1, transactionActivityConfig.transaction_auth_config);
        protoWriter.writeBytes(transactionActivityConfig.unknownFields());
    }
}
