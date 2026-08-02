package com.squareup.protos.cash.nearby.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ConnectionData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ConnectionData((BLEPayload) obj, (NFCPayload) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BLEPayload.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(NFCPayload.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ConnectionData connectionData = (ConnectionData) obj;
        reverseProtoWriter.getClass();
        connectionData.getClass();
        reverseProtoWriter.writeBytes(connectionData.unknownFields());
        NFCPayload.ADAPTER.encodeWithTag(reverseProtoWriter, 2, connectionData.nfc_payload);
        BLEPayload.ADAPTER.encodeWithTag(reverseProtoWriter, 1, connectionData.ble_payload);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ConnectionData connectionData = (ConnectionData) obj;
        connectionData.getClass();
        return NFCPayload.ADAPTER.encodedSizeWithTag(2, connectionData.nfc_payload) + BLEPayload.ADAPTER.encodedSizeWithTag(1, connectionData.ble_payload) + connectionData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ConnectionData connectionData = (ConnectionData) obj;
        connectionData.getClass();
        BLEPayload bLEPayload = connectionData.ble_payload;
        BLEPayload bLEPayload2 = bLEPayload != null ? (BLEPayload) BLEPayload.ADAPTER.redact(bLEPayload) : null;
        NFCPayload nFCPayload = connectionData.nfc_payload;
        NFCPayload nFCPayload2 = nFCPayload != null ? (NFCPayload) NFCPayload.ADAPTER.redact(nFCPayload) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ConnectionData(bLEPayload2, nFCPayload2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ConnectionData connectionData = (ConnectionData) obj;
        connectionData.getClass();
        BLEPayload.ADAPTER.encodeWithTag(protoWriter, 1, connectionData.ble_payload);
        NFCPayload.ADAPTER.encodeWithTag(protoWriter, 2, connectionData.nfc_payload);
        protoWriter.writeBytes(connectionData.unknownFields());
    }
}
