package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.checkmate.sync.UiCheckDeposit;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncCheckDepositReceiptEntity$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncCheckDepositReceiptEntity((UiCheckDeposit) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiCheckDeposit.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncCheckDepositReceiptEntity syncCheckDepositReceiptEntity = (SyncCheckDepositReceiptEntity) obj;
        reverseProtoWriter.getClass();
        syncCheckDepositReceiptEntity.getClass();
        reverseProtoWriter.writeBytes(syncCheckDepositReceiptEntity.unknownFields());
        UiCheckDeposit.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncCheckDepositReceiptEntity.receipt);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncCheckDepositReceiptEntity syncCheckDepositReceiptEntity = (SyncCheckDepositReceiptEntity) obj;
        syncCheckDepositReceiptEntity.getClass();
        return UiCheckDeposit.ADAPTER.encodedSizeWithTag(1, syncCheckDepositReceiptEntity.receipt) + syncCheckDepositReceiptEntity.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncCheckDepositReceiptEntity syncCheckDepositReceiptEntity = (SyncCheckDepositReceiptEntity) obj;
        syncCheckDepositReceiptEntity.getClass();
        UiCheckDeposit uiCheckDeposit = syncCheckDepositReceiptEntity.receipt;
        UiCheckDeposit uiCheckDeposit2 = uiCheckDeposit != null ? (UiCheckDeposit) UiCheckDeposit.ADAPTER.redact(uiCheckDeposit) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SyncCheckDepositReceiptEntity(uiCheckDeposit2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncCheckDepositReceiptEntity syncCheckDepositReceiptEntity = (SyncCheckDepositReceiptEntity) obj;
        syncCheckDepositReceiptEntity.getClass();
        UiCheckDeposit.ADAPTER.encodeWithTag(protoWriter, 1, syncCheckDepositReceiptEntity.receipt);
        protoWriter.writeBytes(syncCheckDepositReceiptEntity.unknownFields());
    }
}
