package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzli;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ChatMessage$ActionBody$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        zzli zzliVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ChatMessage.ActionBody((String) obj, (String) obj2, zzliVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                zzliVar = new ChatMessage$ActionBody$Action$OpenLink((ChatMessage.OpenLink) ChatMessage.OpenLink.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzliVar = new ChatMessage$ActionBody$Action$SelectTransaction((ChatMessage.SelectTransaction) ChatMessage.SelectTransaction.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ChatMessage.ActionBody actionBody = (ChatMessage.ActionBody) obj;
        reverseProtoWriter.getClass();
        actionBody.getClass();
        reverseProtoWriter.writeBytes(actionBody.unknownFields());
        zzli zzliVar = actionBody.action;
        if (zzliVar instanceof ChatMessage$ActionBody$Action$OpenLink) {
            ChatMessage.OpenLink.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((ChatMessage$ActionBody$Action$OpenLink) zzliVar).value);
        } else if (zzliVar instanceof ChatMessage$ActionBody$Action$SelectTransaction) {
            ChatMessage.SelectTransaction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((ChatMessage$ActionBody$Action$SelectTransaction) zzliVar).value);
        } else if (zzliVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, actionBody.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, actionBody.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ChatMessage.ActionBody actionBody = (ChatMessage.ActionBody) obj;
        actionBody.getClass();
        int size$okio = actionBody.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, actionBody.subtitle) + protoAdapter.encodedSizeWithTag(1, actionBody.title) + size$okio;
        zzli zzliVar = actionBody.action;
        if (zzliVar instanceof ChatMessage$ActionBody$Action$OpenLink) {
            encodedSizeWithTag = ChatMessage.OpenLink.ADAPTER.encodedSizeWithTag(3, ((ChatMessage$ActionBody$Action$OpenLink) zzliVar).value);
        } else {
            if (!(zzliVar instanceof ChatMessage$ActionBody$Action$SelectTransaction)) {
                if (zzliVar == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = ChatMessage.SelectTransaction.ADAPTER.encodedSizeWithTag(4, ((ChatMessage$ActionBody$Action$SelectTransaction) zzliVar).value);
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ChatMessage.ActionBody actionBody = (ChatMessage.ActionBody) obj;
        actionBody.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = actionBody.title;
        String str2 = actionBody.subtitle;
        zzli zzliVar = actionBody.action;
        byteString.getClass();
        return new ChatMessage.ActionBody(str, str2, zzliVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ChatMessage.ActionBody actionBody = (ChatMessage.ActionBody) obj;
        actionBody.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, actionBody.title);
        protoAdapter.encodeWithTag(protoWriter, 2, actionBody.subtitle);
        zzli zzliVar = actionBody.action;
        if (zzliVar instanceof ChatMessage$ActionBody$Action$OpenLink) {
            ChatMessage.OpenLink.ADAPTER.encodeWithTag(protoWriter, 3, ((ChatMessage$ActionBody$Action$OpenLink) zzliVar).value);
        } else if (zzliVar instanceof ChatMessage$ActionBody$Action$SelectTransaction) {
            ChatMessage.SelectTransaction.ADAPTER.encodeWithTag(protoWriter, 4, ((ChatMessage$ActionBody$Action$SelectTransaction) zzliVar).value);
        } else if (zzliVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(actionBody.unknownFields());
    }
}
