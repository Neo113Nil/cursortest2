package com.squareup.protos.franklin.lending;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncPrepurchaseAfterpayResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncPrepurchaseAfterpayResponse((ResponseContext) obj, (PrepurchaseAfterpayAppletData) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(PrepurchaseAfterpayAppletData.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncPrepurchaseAfterpayResponse syncPrepurchaseAfterpayResponse = (SyncPrepurchaseAfterpayResponse) obj;
        reverseProtoWriter.getClass();
        syncPrepurchaseAfterpayResponse.getClass();
        reverseProtoWriter.writeBytes(syncPrepurchaseAfterpayResponse.unknownFields());
        PrepurchaseAfterpayAppletData.ADAPTER.encodeWithTag(reverseProtoWriter, 4, syncPrepurchaseAfterpayResponse.applet_data);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncPrepurchaseAfterpayResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncPrepurchaseAfterpayResponse syncPrepurchaseAfterpayResponse = (SyncPrepurchaseAfterpayResponse) obj;
        syncPrepurchaseAfterpayResponse.getClass();
        return PrepurchaseAfterpayAppletData.ADAPTER.encodedSizeWithTag(4, syncPrepurchaseAfterpayResponse.applet_data) + ResponseContext.ADAPTER.encodedSizeWithTag(1, syncPrepurchaseAfterpayResponse.response_context) + syncPrepurchaseAfterpayResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncPrepurchaseAfterpayResponse syncPrepurchaseAfterpayResponse = (SyncPrepurchaseAfterpayResponse) obj;
        syncPrepurchaseAfterpayResponse.getClass();
        ResponseContext responseContext = syncPrepurchaseAfterpayResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        PrepurchaseAfterpayAppletData prepurchaseAfterpayAppletData = syncPrepurchaseAfterpayResponse.applet_data;
        PrepurchaseAfterpayAppletData prepurchaseAfterpayAppletData2 = prepurchaseAfterpayAppletData != null ? (PrepurchaseAfterpayAppletData) PrepurchaseAfterpayAppletData.ADAPTER.redact(prepurchaseAfterpayAppletData) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SyncPrepurchaseAfterpayResponse(responseContext2, prepurchaseAfterpayAppletData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncPrepurchaseAfterpayResponse syncPrepurchaseAfterpayResponse = (SyncPrepurchaseAfterpayResponse) obj;
        syncPrepurchaseAfterpayResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, syncPrepurchaseAfterpayResponse.response_context);
        PrepurchaseAfterpayAppletData.ADAPTER.encodeWithTag(protoWriter, 4, syncPrepurchaseAfterpayResponse.applet_data);
        protoWriter.writeBytes(syncPrepurchaseAfterpayResponse.unknownFields());
    }
}
