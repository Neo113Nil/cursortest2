package com.squareup.protos.cash.supportal.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzlk;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ChatMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        ChatMessage.Body body = null;
        zzlk zzlkVar = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ChatMessage((String) obj, (Long) obj2, (String) obj3, body, zzlkVar, m, (ChatMessage.Disclaimer) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 3:
                case 14:
                case 16:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 4:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    body = new ChatMessage.Body.Text((ChatMessage.TextBody) ChatMessage.TextBody.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    body = new ChatMessage.Body.File((ChatMessage.FileBody) ChatMessage.FileBody.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    body = new ChatMessage.Body.SunshineFile((ChatMessage.SunshineFileBody) ChatMessage.SunshineFileBody.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    zzlkVar = new ChatMessage$Sender$Customer((ChatMessage.Customer) ChatMessage.Customer.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    zzlkVar = new ChatMessage$Sender$Bot((ChatMessage.Bot) ChatMessage.Bot.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    zzlkVar = new ChatMessage$Sender$Advocate((ChatMessage.Advocate) ChatMessage.Advocate.ADAPTER.decode(protoReader));
                    break;
                case 11:
                    m.add(ChatMessage.SuggestedReply.ADAPTER.decode(protoReader));
                    break;
                case 12:
                    body = new ChatMessage.Body.Transaction((ChatMessage.TransactionBody) ChatMessage.TransactionBody.ADAPTER.decode(protoReader));
                    break;
                case 13:
                    body = new ChatMessage.Body.Action((ChatMessage.ActionBody) ChatMessage.ActionBody.ADAPTER.decode(protoReader));
                    break;
                case 15:
                    obj4 = TransactorKt.decodeMessageOrMerge(ChatMessage.Disclaimer.ADAPTER, protoReader, obj4);
                    break;
                case 17:
                    zzlkVar = new ChatMessage$Sender$System((ChatMessage.ChatSystem) ChatMessage.ChatSystem.ADAPTER.decode(protoReader));
                    break;
                case 18:
                    body = new ChatMessage.Body.SystemMessage((ChatMessage.SystemMessageBody) ChatMessage.SystemMessageBody.ADAPTER.decode(protoReader));
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ChatMessage chatMessage = (ChatMessage) obj;
        reverseProtoWriter.getClass();
        chatMessage.getClass();
        reverseProtoWriter.writeBytes(chatMessage.unknownFields());
        zzlk zzlkVar = chatMessage.sender;
        if (zzlkVar instanceof ChatMessage$Sender$Customer) {
            ChatMessage.Customer.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((ChatMessage$Sender$Customer) zzlkVar).value);
        } else if (zzlkVar instanceof ChatMessage$Sender$Bot) {
            ChatMessage.Bot.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((ChatMessage$Sender$Bot) zzlkVar).value);
        } else if (zzlkVar instanceof ChatMessage$Sender$Advocate) {
            ChatMessage.Advocate.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((ChatMessage$Sender$Advocate) zzlkVar).value);
        } else if (zzlkVar instanceof ChatMessage$Sender$System) {
            ChatMessage.ChatSystem.ADAPTER.encodeWithTag(reverseProtoWriter, 17, ((ChatMessage$Sender$System) zzlkVar).value);
        } else if (zzlkVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ChatMessage.Body body = chatMessage.body;
        if (body instanceof ChatMessage.Body.Text) {
            ChatMessage.TextBody.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((ChatMessage.Body.Text) body).value);
        } else if (body instanceof ChatMessage.Body.File) {
            ChatMessage.FileBody.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((ChatMessage.Body.File) body).value);
        } else if (body instanceof ChatMessage.Body.SunshineFile) {
            ChatMessage.SunshineFileBody.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((ChatMessage.Body.SunshineFile) body).value);
        } else if (body instanceof ChatMessage.Body.Transaction) {
            ChatMessage.TransactionBody.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((ChatMessage.Body.Transaction) body).value);
        } else if (body instanceof ChatMessage.Body.Action) {
            ChatMessage.ActionBody.ADAPTER.encodeWithTag(reverseProtoWriter, 13, ((ChatMessage.Body.Action) body).value);
        } else if (body instanceof ChatMessage.Body.SystemMessage) {
            ChatMessage.SystemMessageBody.ADAPTER.encodeWithTag(reverseProtoWriter, 18, ((ChatMessage.Body.SystemMessage) body).value);
        } else if (body != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ChatMessage.Disclaimer.ADAPTER.encodeWithTag(reverseProtoWriter, 15, chatMessage.disclaimer);
        ChatMessage.SuggestedReply.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 11, chatMessage.suggested_replies);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, chatMessage.idempotence_token);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, chatMessage.recorded_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, chatMessage.message_token);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0098  */
    @Override // com.squareup.wire.ProtoAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        zzlk zzlkVar;
        int encodedSizeWithTag2;
        ChatMessage chatMessage = (ChatMessage) obj;
        chatMessage.getClass();
        int size$okio = chatMessage.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(4, chatMessage.idempotence_token) + ProtoAdapter.INT64.encodedSizeWithTag(2, chatMessage.recorded_at) + protoAdapter.encodedSizeWithTag(1, chatMessage.message_token) + size$okio;
        ChatMessage.Body body = chatMessage.body;
        if (body instanceof ChatMessage.Body.Text) {
            encodedSizeWithTag = ChatMessage.TextBody.ADAPTER.encodedSizeWithTag(5, ((ChatMessage.Body.Text) body).value);
        } else if (body instanceof ChatMessage.Body.File) {
            encodedSizeWithTag = ChatMessage.FileBody.ADAPTER.encodedSizeWithTag(6, ((ChatMessage.Body.File) body).value);
        } else if (body instanceof ChatMessage.Body.SunshineFile) {
            encodedSizeWithTag = ChatMessage.SunshineFileBody.ADAPTER.encodedSizeWithTag(7, ((ChatMessage.Body.SunshineFile) body).value);
        } else if (body instanceof ChatMessage.Body.Transaction) {
            encodedSizeWithTag = ChatMessage.TransactionBody.ADAPTER.encodedSizeWithTag(12, ((ChatMessage.Body.Transaction) body).value);
        } else if (body instanceof ChatMessage.Body.Action) {
            encodedSizeWithTag = ChatMessage.ActionBody.ADAPTER.encodedSizeWithTag(13, ((ChatMessage.Body.Action) body).value);
        } else {
            if (!(body instanceof ChatMessage.Body.SystemMessage)) {
                if (body != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                zzlkVar = chatMessage.sender;
                if (!(zzlkVar instanceof ChatMessage$Sender$Customer)) {
                    encodedSizeWithTag2 = ChatMessage.Customer.ADAPTER.encodedSizeWithTag(8, ((ChatMessage$Sender$Customer) zzlkVar).value);
                } else if (zzlkVar instanceof ChatMessage$Sender$Bot) {
                    encodedSizeWithTag2 = ChatMessage.Bot.ADAPTER.encodedSizeWithTag(9, ((ChatMessage$Sender$Bot) zzlkVar).value);
                } else if (zzlkVar instanceof ChatMessage$Sender$Advocate) {
                    encodedSizeWithTag2 = ChatMessage.Advocate.ADAPTER.encodedSizeWithTag(10, ((ChatMessage$Sender$Advocate) zzlkVar).value);
                } else {
                    if (!(zzlkVar instanceof ChatMessage$Sender$System)) {
                        if (zzlkVar != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return ChatMessage.Disclaimer.ADAPTER.encodedSizeWithTag(15, chatMessage.disclaimer) + ChatMessage.SuggestedReply.ADAPTER.asRepeated().encodedSizeWithTag(11, chatMessage.suggested_replies) + encodedSizeWithTag3;
                    }
                    encodedSizeWithTag2 = ChatMessage.ChatSystem.ADAPTER.encodedSizeWithTag(17, ((ChatMessage$Sender$System) zzlkVar).value);
                }
                encodedSizeWithTag3 += encodedSizeWithTag2;
                return ChatMessage.Disclaimer.ADAPTER.encodedSizeWithTag(15, chatMessage.disclaimer) + ChatMessage.SuggestedReply.ADAPTER.asRepeated().encodedSizeWithTag(11, chatMessage.suggested_replies) + encodedSizeWithTag3;
            }
            encodedSizeWithTag = ChatMessage.SystemMessageBody.ADAPTER.encodedSizeWithTag(18, ((ChatMessage.Body.SystemMessage) body).value);
        }
        encodedSizeWithTag3 += encodedSizeWithTag;
        zzlkVar = chatMessage.sender;
        if (!(zzlkVar instanceof ChatMessage$Sender$Customer)) {
        }
        encodedSizeWithTag3 += encodedSizeWithTag2;
        return ChatMessage.Disclaimer.ADAPTER.encodedSizeWithTag(15, chatMessage.disclaimer) + ChatMessage.SuggestedReply.ADAPTER.asRepeated().encodedSizeWithTag(11, chatMessage.suggested_replies) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ChatMessage chatMessage = (ChatMessage) obj;
        chatMessage.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(chatMessage.suggested_replies, ChatMessage.SuggestedReply.ADAPTER);
        ChatMessage.Disclaimer disclaimer = chatMessage.disclaimer;
        ChatMessage.Disclaimer disclaimer2 = disclaimer != null ? (ChatMessage.Disclaimer) ChatMessage.Disclaimer.ADAPTER.redact(disclaimer) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = chatMessage.message_token;
        Long l = chatMessage.recorded_at;
        String str2 = chatMessage.idempotence_token;
        ChatMessage.Body body = chatMessage.body;
        zzlk zzlkVar = chatMessage.sender;
        byteString.getClass();
        return new ChatMessage(str, l, str2, body, zzlkVar, m1169redactElements, disclaimer2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ChatMessage chatMessage = (ChatMessage) obj;
        chatMessage.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, chatMessage.message_token);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, chatMessage.recorded_at);
        protoAdapter.encodeWithTag(protoWriter, 4, chatMessage.idempotence_token);
        ChatMessage.SuggestedReply.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, chatMessage.suggested_replies);
        ChatMessage.Disclaimer.ADAPTER.encodeWithTag(protoWriter, 15, chatMessage.disclaimer);
        ChatMessage.Body body = chatMessage.body;
        if (body instanceof ChatMessage.Body.Text) {
            ChatMessage.TextBody.ADAPTER.encodeWithTag(protoWriter, 5, ((ChatMessage.Body.Text) body).value);
        } else if (body instanceof ChatMessage.Body.File) {
            ChatMessage.FileBody.ADAPTER.encodeWithTag(protoWriter, 6, ((ChatMessage.Body.File) body).value);
        } else if (body instanceof ChatMessage.Body.SunshineFile) {
            ChatMessage.SunshineFileBody.ADAPTER.encodeWithTag(protoWriter, 7, ((ChatMessage.Body.SunshineFile) body).value);
        } else if (body instanceof ChatMessage.Body.Transaction) {
            ChatMessage.TransactionBody.ADAPTER.encodeWithTag(protoWriter, 12, ((ChatMessage.Body.Transaction) body).value);
        } else if (body instanceof ChatMessage.Body.Action) {
            ChatMessage.ActionBody.ADAPTER.encodeWithTag(protoWriter, 13, ((ChatMessage.Body.Action) body).value);
        } else if (body instanceof ChatMessage.Body.SystemMessage) {
            ChatMessage.SystemMessageBody.ADAPTER.encodeWithTag(protoWriter, 18, ((ChatMessage.Body.SystemMessage) body).value);
        } else if (body != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        zzlk zzlkVar = chatMessage.sender;
        if (zzlkVar instanceof ChatMessage$Sender$Customer) {
            ChatMessage.Customer.ADAPTER.encodeWithTag(protoWriter, 8, ((ChatMessage$Sender$Customer) zzlkVar).value);
        } else if (zzlkVar instanceof ChatMessage$Sender$Bot) {
            ChatMessage.Bot.ADAPTER.encodeWithTag(protoWriter, 9, ((ChatMessage$Sender$Bot) zzlkVar).value);
        } else if (zzlkVar instanceof ChatMessage$Sender$Advocate) {
            ChatMessage.Advocate.ADAPTER.encodeWithTag(protoWriter, 10, ((ChatMessage$Sender$Advocate) zzlkVar).value);
        } else if (zzlkVar instanceof ChatMessage$Sender$System) {
            ChatMessage.ChatSystem.ADAPTER.encodeWithTag(protoWriter, 17, ((ChatMessage$Sender$System) zzlkVar).value);
        } else if (zzlkVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(chatMessage.unknownFields());
    }
}
