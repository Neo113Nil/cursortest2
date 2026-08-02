package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.OutgoingMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OutgoingMessage$SelectedTransaction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OutgoingMessage.SelectedTransaction((String) obj2, (ByteString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OutgoingMessage.SelectedTransaction selectedTransaction = (OutgoingMessage.SelectedTransaction) obj;
        reverseProtoWriter.getClass();
        selectedTransaction.getClass();
        reverseProtoWriter.writeBytes(selectedTransaction.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, selectedTransaction.entity_id);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, selectedTransaction.payload);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OutgoingMessage.SelectedTransaction selectedTransaction = (OutgoingMessage.SelectedTransaction) obj;
        selectedTransaction.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, selectedTransaction.entity_id) + ProtoAdapter.BYTES.encodedSizeWithTag(1, selectedTransaction.payload) + selectedTransaction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OutgoingMessage.SelectedTransaction selectedTransaction = (OutgoingMessage.SelectedTransaction) obj;
        selectedTransaction.getClass();
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = selectedTransaction.payload;
        String str = selectedTransaction.entity_id;
        byteString.getClass();
        return new OutgoingMessage.SelectedTransaction(str, byteString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OutgoingMessage.SelectedTransaction selectedTransaction = (OutgoingMessage.SelectedTransaction) obj;
        selectedTransaction.getClass();
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, selectedTransaction.payload);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, selectedTransaction.entity_id);
        protoWriter.writeBytes(selectedTransaction.unknownFields());
    }
}
