package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.OutgoingMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OutgoingMessage$TextBody$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OutgoingMessage.TextBody((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OutgoingMessage.TextBody textBody = (OutgoingMessage.TextBody) obj;
        reverseProtoWriter.getClass();
        textBody.getClass();
        reverseProtoWriter.writeBytes(textBody.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, textBody.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OutgoingMessage.TextBody textBody = (OutgoingMessage.TextBody) obj;
        textBody.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, textBody.text) + textBody.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OutgoingMessage.TextBody textBody = (OutgoingMessage.TextBody) obj;
        textBody.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = textBody.text;
        byteString.getClass();
        return new OutgoingMessage.TextBody(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OutgoingMessage.TextBody textBody = (OutgoingMessage.TextBody) obj;
        textBody.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, textBody.text);
        protoWriter.writeBytes(textBody.unknownFields());
    }
}
