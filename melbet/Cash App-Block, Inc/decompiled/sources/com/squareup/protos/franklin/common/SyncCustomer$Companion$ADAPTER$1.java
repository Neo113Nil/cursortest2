package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncCustomer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncCustomer((UiCustomer) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiCustomer.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncCustomer syncCustomer = (SyncCustomer) obj;
        reverseProtoWriter.getClass();
        syncCustomer.getClass();
        reverseProtoWriter.writeBytes(syncCustomer.unknownFields());
        UiCustomer.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncCustomer.customer);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncCustomer syncCustomer = (SyncCustomer) obj;
        syncCustomer.getClass();
        return UiCustomer.ADAPTER.encodedSizeWithTag(1, syncCustomer.customer) + syncCustomer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncCustomer syncCustomer = (SyncCustomer) obj;
        syncCustomer.getClass();
        UiCustomer uiCustomer = syncCustomer.customer;
        UiCustomer uiCustomer2 = uiCustomer != null ? (UiCustomer) UiCustomer.ADAPTER.redact(uiCustomer) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SyncCustomer(uiCustomer2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncCustomer syncCustomer = (SyncCustomer) obj;
        syncCustomer.getClass();
        UiCustomer.ADAPTER.encodeWithTag(protoWriter, 1, syncCustomer.customer);
        protoWriter.writeBytes(syncCustomer.unknownFields());
    }
}
