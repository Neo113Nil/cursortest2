package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.GetMessagesStreamResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$DeltaMessageContent$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesStreamResponse$DeltaMessageContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetMessagesStreamResponse$DeltaMessageContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetMessagesStreamResponse.DeltaMessageContent((String) obj, (MessageContent) obj2, (Boolean) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(MessageContent.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetMessagesStreamResponse.DeltaMessageContent deltaMessageContent = (GetMessagesStreamResponse.DeltaMessageContent) obj;
        reverseProtoWriter.getClass();
        deltaMessageContent.getClass();
        reverseProtoWriter.writeBytes(deltaMessageContent.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, deltaMessageContent.is_start);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, deltaMessageContent.is_final);
        MessageContent.ADAPTER.encodeWithTag(reverseProtoWriter, 2, deltaMessageContent.message_content);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, deltaMessageContent.streaming_message_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetMessagesStreamResponse.DeltaMessageContent deltaMessageContent = (GetMessagesStreamResponse.DeltaMessageContent) obj;
        deltaMessageContent.getClass();
        int encodedSizeWithTag = MessageContent.ADAPTER.encodedSizeWithTag(2, deltaMessageContent.message_content) + ProtoAdapter.STRING.encodedSizeWithTag(1, deltaMessageContent.streaming_message_id) + deltaMessageContent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(4, deltaMessageContent.is_start) + protoAdapter.encodedSizeWithTag(3, deltaMessageContent.is_final) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetMessagesStreamResponse.DeltaMessageContent deltaMessageContent = (GetMessagesStreamResponse.DeltaMessageContent) obj;
        deltaMessageContent.getClass();
        MessageContent messageContent = deltaMessageContent.message_content;
        MessageContent messageContent2 = messageContent != null ? (MessageContent) MessageContent.ADAPTER.redact(messageContent) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = deltaMessageContent.streaming_message_id;
        Boolean bool = deltaMessageContent.is_final;
        Boolean bool2 = deltaMessageContent.is_start;
        byteString.getClass();
        return new GetMessagesStreamResponse.DeltaMessageContent(str, messageContent2, bool, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetMessagesStreamResponse.DeltaMessageContent deltaMessageContent = (GetMessagesStreamResponse.DeltaMessageContent) obj;
        deltaMessageContent.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deltaMessageContent.streaming_message_id);
        MessageContent.ADAPTER.encodeWithTag(protoWriter, 2, deltaMessageContent.message_content);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 3, deltaMessageContent.is_final);
        protoAdapter.encodeWithTag(protoWriter, 4, deltaMessageContent.is_start);
        protoWriter.writeBytes(deltaMessageContent.unknownFields());
    }
}
