package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.ui.UiItemizedReceipt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncReceiptEntity$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncReceiptEntity((UiItemizedReceipt) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiItemizedReceipt.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncReceiptEntity syncReceiptEntity = (SyncReceiptEntity) obj;
        reverseProtoWriter.getClass();
        syncReceiptEntity.getClass();
        reverseProtoWriter.writeBytes(syncReceiptEntity.unknownFields());
        UiItemizedReceipt.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncReceiptEntity.receipt);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncReceiptEntity syncReceiptEntity = (SyncReceiptEntity) obj;
        syncReceiptEntity.getClass();
        return UiItemizedReceipt.ADAPTER.encodedSizeWithTag(1, syncReceiptEntity.receipt) + syncReceiptEntity.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncReceiptEntity syncReceiptEntity = (SyncReceiptEntity) obj;
        syncReceiptEntity.getClass();
        UiItemizedReceipt uiItemizedReceipt = syncReceiptEntity.receipt;
        UiItemizedReceipt uiItemizedReceipt2 = uiItemizedReceipt != null ? (UiItemizedReceipt) UiItemizedReceipt.ADAPTER.redact(uiItemizedReceipt) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SyncReceiptEntity(uiItemizedReceipt2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncReceiptEntity syncReceiptEntity = (SyncReceiptEntity) obj;
        syncReceiptEntity.getClass();
        UiItemizedReceipt.ADAPTER.encodeWithTag(protoWriter, 1, syncReceiptEntity.receipt);
        protoWriter.writeBytes(syncReceiptEntity.unknownFields());
    }
}
