package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.ui.UiLoyaltyAccount;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncLoyaltyAccount$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncLoyaltyAccount((UiLoyaltyAccount) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiLoyaltyAccount.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncLoyaltyAccount syncLoyaltyAccount = (SyncLoyaltyAccount) obj;
        reverseProtoWriter.getClass();
        syncLoyaltyAccount.getClass();
        reverseProtoWriter.writeBytes(syncLoyaltyAccount.unknownFields());
        UiLoyaltyAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncLoyaltyAccount.loyalty_account);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncLoyaltyAccount syncLoyaltyAccount = (SyncLoyaltyAccount) obj;
        syncLoyaltyAccount.getClass();
        return UiLoyaltyAccount.ADAPTER.encodedSizeWithTag(1, syncLoyaltyAccount.loyalty_account) + syncLoyaltyAccount.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncLoyaltyAccount syncLoyaltyAccount = (SyncLoyaltyAccount) obj;
        syncLoyaltyAccount.getClass();
        UiLoyaltyAccount uiLoyaltyAccount = syncLoyaltyAccount.loyalty_account;
        UiLoyaltyAccount uiLoyaltyAccount2 = uiLoyaltyAccount != null ? (UiLoyaltyAccount) UiLoyaltyAccount.ADAPTER.redact(uiLoyaltyAccount) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SyncLoyaltyAccount(uiLoyaltyAccount2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncLoyaltyAccount syncLoyaltyAccount = (SyncLoyaltyAccount) obj;
        syncLoyaltyAccount.getClass();
        UiLoyaltyAccount.ADAPTER.encodeWithTag(protoWriter, 1, syncLoyaltyAccount.loyalty_account);
        protoWriter.writeBytes(syncLoyaltyAccount.unknownFields());
    }
}
