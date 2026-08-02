package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.kgoose.api.v3.Message;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/Message$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/Message;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Message$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Message((String) obj, (Role) obj2, (Long) obj3, m, (Boolean) obj4, (Message.ErrorInfo) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    try {
                        obj2 = Role.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    m.add(MessageContent.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(Message.ErrorInfo.ADAPTER, protoReader, obj5);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Message message = (Message) obj;
        reverseProtoWriter.getClass();
        message.getClass();
        reverseProtoWriter.writeBytes(message.unknownFields());
        Message.ErrorInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 6, message.llm_call_error_info);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, message.deleted);
        MessageContent.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, message.content);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, message.created);
        Role.ADAPTER.encodeWithTag(reverseProtoWriter, 2, message.role);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, message.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Message message = (Message) obj;
        message.getClass();
        return Message.ErrorInfo.ADAPTER.encodedSizeWithTag(6, message.llm_call_error_info) + ProtoAdapter.BOOL.encodedSizeWithTag(5, message.deleted) + MessageContent.ADAPTER.asRepeated().encodedSizeWithTag(4, message.content) + ProtoAdapter.INT64.encodedSizeWithTag(3, message.created) + Role.ADAPTER.encodedSizeWithTag(2, message.role) + ProtoAdapter.STRING.encodedSizeWithTag(1, message.id) + message.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Message message = (Message) obj;
        message.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(message.content, MessageContent.ADAPTER);
        Message.ErrorInfo errorInfo = message.llm_call_error_info;
        Message.ErrorInfo errorInfo2 = errorInfo != null ? (Message.ErrorInfo) Message.ErrorInfo.ADAPTER.redact(errorInfo) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = message.id;
        Role role = message.role;
        Long l = message.created;
        Boolean bool = message.deleted;
        byteString.getClass();
        return new Message(str, role, l, m1169redactElements, bool, errorInfo2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Message message = (Message) obj;
        message.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, message.id);
        Role.ADAPTER.encodeWithTag(protoWriter, 2, message.role);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, message.created);
        MessageContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, message.content);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, message.deleted);
        Message.ErrorInfo.ADAPTER.encodeWithTag(protoWriter, 6, message.llm_call_error_info);
        protoWriter.writeBytes(message.unknownFields());
    }
}
