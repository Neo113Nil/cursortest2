package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncAccountStatementEntity$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncAccountStatementEntity((Account) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Account.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncAccountStatementEntity syncAccountStatementEntity = (SyncAccountStatementEntity) obj;
        reverseProtoWriter.getClass();
        syncAccountStatementEntity.getClass();
        reverseProtoWriter.writeBytes(syncAccountStatementEntity.unknownFields());
        Account.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncAccountStatementEntity.account);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncAccountStatementEntity syncAccountStatementEntity = (SyncAccountStatementEntity) obj;
        syncAccountStatementEntity.getClass();
        return Account.ADAPTER.encodedSizeWithTag(1, syncAccountStatementEntity.account) + syncAccountStatementEntity.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncAccountStatementEntity syncAccountStatementEntity = (SyncAccountStatementEntity) obj;
        syncAccountStatementEntity.getClass();
        Account account = syncAccountStatementEntity.account;
        Account account2 = account != null ? (Account) Account.ADAPTER.redact(account) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SyncAccountStatementEntity(account2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncAccountStatementEntity syncAccountStatementEntity = (SyncAccountStatementEntity) obj;
        syncAccountStatementEntity.getClass();
        Account.ADAPTER.encodeWithTag(protoWriter, 1, syncAccountStatementEntity.account);
        protoWriter.writeBytes(syncAccountStatementEntity.unknownFields());
    }
}
