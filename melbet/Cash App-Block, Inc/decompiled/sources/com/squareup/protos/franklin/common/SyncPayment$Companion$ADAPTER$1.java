package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncPayment$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncPayment((UiPayment) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiPayment.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncPayment syncPayment = (SyncPayment) obj;
        reverseProtoWriter.getClass();
        syncPayment.getClass();
        reverseProtoWriter.writeBytes(syncPayment.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, syncPayment.is_badged);
        UiPayment.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncPayment.payment);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncPayment syncPayment = (SyncPayment) obj;
        syncPayment.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, syncPayment.is_badged) + UiPayment.ADAPTER.encodedSizeWithTag(1, syncPayment.payment) + syncPayment.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncPayment syncPayment = (SyncPayment) obj;
        syncPayment.getClass();
        UiPayment uiPayment = syncPayment.payment;
        UiPayment uiPayment2 = uiPayment != null ? (UiPayment) UiPayment.ADAPTER.redact(uiPayment) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = syncPayment.is_badged;
        byteString.getClass();
        return new SyncPayment(uiPayment2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncPayment syncPayment = (SyncPayment) obj;
        syncPayment.getClass();
        UiPayment.ADAPTER.encodeWithTag(protoWriter, 1, syncPayment.payment);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, syncPayment.is_badged);
        protoWriter.writeBytes(syncPayment.unknownFields());
    }
}
