package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.OutgoingMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OutgoingMessage$SelectedReply$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OutgoingMessage.SelectedReply((String) obj, (String) obj2, (ByteString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BYTES.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OutgoingMessage.SelectedReply selectedReply = (OutgoingMessage.SelectedReply) obj;
        reverseProtoWriter.getClass();
        selectedReply.getClass();
        reverseProtoWriter.writeBytes(selectedReply.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 3, selectedReply.payload);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, selectedReply.text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, selectedReply.reply_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OutgoingMessage.SelectedReply selectedReply = (OutgoingMessage.SelectedReply) obj;
        selectedReply.getClass();
        int size$okio = selectedReply.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BYTES.encodedSizeWithTag(3, selectedReply.payload) + protoAdapter.encodedSizeWithTag(2, selectedReply.text) + protoAdapter.encodedSizeWithTag(1, selectedReply.reply_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OutgoingMessage.SelectedReply selectedReply = (OutgoingMessage.SelectedReply) obj;
        selectedReply.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = selectedReply.reply_token;
        String str2 = selectedReply.text;
        ByteString byteString2 = selectedReply.payload;
        byteString.getClass();
        return new OutgoingMessage.SelectedReply(str, str2, byteString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OutgoingMessage.SelectedReply selectedReply = (OutgoingMessage.SelectedReply) obj;
        selectedReply.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, selectedReply.reply_token);
        protoAdapter.encodeWithTag(protoWriter, 2, selectedReply.text);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, selectedReply.payload);
        protoWriter.writeBytes(selectedReply.unknownFields());
    }
}
