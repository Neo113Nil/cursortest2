package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ChatMessage$Disclaimer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ChatMessage.Disclaimer((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ChatMessage.Disclaimer disclaimer = (ChatMessage.Disclaimer) obj;
        reverseProtoWriter.getClass();
        disclaimer.getClass();
        reverseProtoWriter.writeBytes(disclaimer.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, disclaimer.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ChatMessage.Disclaimer disclaimer = (ChatMessage.Disclaimer) obj;
        disclaimer.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, disclaimer.text) + disclaimer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ChatMessage.Disclaimer disclaimer = (ChatMessage.Disclaimer) obj;
        disclaimer.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = disclaimer.text;
        byteString.getClass();
        return new ChatMessage.Disclaimer(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ChatMessage.Disclaimer disclaimer = (ChatMessage.Disclaimer) obj;
        disclaimer.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, disclaimer.text);
        protoWriter.writeBytes(disclaimer.unknownFields());
    }
}
