package com.squareup.protos.cash.janus.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.janus.api.AccountParams;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AccountParams$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AccountParams((AccountParams.EntryDialog) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AccountParams.EntryDialog.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AccountParams accountParams = (AccountParams) obj;
        reverseProtoWriter.getClass();
        accountParams.getClass();
        reverseProtoWriter.writeBytes(accountParams.unknownFields());
        AccountParams.EntryDialog.ADAPTER.encodeWithTag(reverseProtoWriter, 1, accountParams.entryDialog);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AccountParams accountParams = (AccountParams) obj;
        accountParams.getClass();
        return AccountParams.EntryDialog.ADAPTER.encodedSizeWithTag(1, accountParams.entryDialog) + accountParams.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AccountParams accountParams = (AccountParams) obj;
        accountParams.getClass();
        AccountParams.EntryDialog entryDialog = accountParams.entryDialog;
        AccountParams.EntryDialog entryDialog2 = entryDialog != null ? (AccountParams.EntryDialog) AccountParams.EntryDialog.ADAPTER.redact(entryDialog) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AccountParams(entryDialog2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AccountParams accountParams = (AccountParams) obj;
        accountParams.getClass();
        AccountParams.EntryDialog.ADAPTER.encodeWithTag(protoWriter, 1, accountParams.entryDialog);
        protoWriter.writeBytes(accountParams.unknownFields());
    }
}
