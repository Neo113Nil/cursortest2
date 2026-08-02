package com.squareup.protos.cash.supportal.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Headers;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SendChatMessagesRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SendChatMessagesRequest> CREATOR;
    public final List messages;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SendChatMessagesRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.supportal.app.SendChatMessagesRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SendChatMessagesRequest(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(OutgoingMessage.ADAPTER.decode(protoReader));
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SendChatMessagesRequest sendChatMessagesRequest = (SendChatMessagesRequest) obj;
                reverseProtoWriter.getClass();
                sendChatMessagesRequest.getClass();
                reverseProtoWriter.writeBytes(sendChatMessagesRequest.unknownFields());
                OutgoingMessage.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, sendChatMessagesRequest.messages);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SendChatMessagesRequest sendChatMessagesRequest = (SendChatMessagesRequest) obj;
                sendChatMessagesRequest.getClass();
                return OutgoingMessage.ADAPTER.asRepeated().encodedSizeWithTag(1, sendChatMessagesRequest.messages) + sendChatMessagesRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SendChatMessagesRequest sendChatMessagesRequest = (SendChatMessagesRequest) obj;
                sendChatMessagesRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(sendChatMessagesRequest.messages, OutgoingMessage.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new SendChatMessagesRequest(m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SendChatMessagesRequest sendChatMessagesRequest = (SendChatMessagesRequest) obj;
                sendChatMessagesRequest.getClass();
                OutgoingMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, sendChatMessagesRequest.messages);
                protoWriter.writeBytes(sendChatMessagesRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendChatMessagesRequest(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.messages = TransactorKt.immutableCopyOf("messages", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendChatMessagesRequest)) {
            return false;
        }
        SendChatMessagesRequest sendChatMessagesRequest = (SendChatMessagesRequest) obj;
        return Intrinsics.areEqual(unknownFields(), sendChatMessagesRequest.unknownFields()) && Intrinsics.areEqual(this.messages, sendChatMessagesRequest.messages);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.messages.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(3);
        builder.header = this.messages;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.messages;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("messages=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SendChatMessagesRequest{", "}", 0, null, null, 56);
    }
}
