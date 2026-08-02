package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ChatMessage$SystemMessageBody$Styling$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ChatMessage.SystemMessageBody.Styling((Boolean) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ChatMessage.SystemMessageBody.Styling styling = (ChatMessage.SystemMessageBody.Styling) obj;
        reverseProtoWriter.getClass();
        styling.getClass();
        reverseProtoWriter.writeBytes(styling.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, styling.show_timestamp);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, styling.show_divider);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ChatMessage.SystemMessageBody.Styling styling = (ChatMessage.SystemMessageBody.Styling) obj;
        styling.getClass();
        int size$okio = styling.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(2, styling.show_timestamp) + protoAdapter.encodedSizeWithTag(1, styling.show_divider) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ChatMessage.SystemMessageBody.Styling styling = (ChatMessage.SystemMessageBody.Styling) obj;
        styling.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = styling.show_divider;
        Boolean bool2 = styling.show_timestamp;
        byteString.getClass();
        return new ChatMessage.SystemMessageBody.Styling(bool, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ChatMessage.SystemMessageBody.Styling styling = (ChatMessage.SystemMessageBody.Styling) obj;
        styling.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, styling.show_divider);
        protoAdapter.encodeWithTag(protoWriter, 2, styling.show_timestamp);
        protoWriter.writeBytes(styling.unknownFields());
    }
}
