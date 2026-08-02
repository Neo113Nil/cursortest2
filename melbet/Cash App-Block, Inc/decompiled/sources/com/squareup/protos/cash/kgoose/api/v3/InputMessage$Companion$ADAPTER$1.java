package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/InputMessage$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/InputMessage;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InputMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InputMessage(m, (Boolean) obj, (String) obj2, (Role) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(MessageContent.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                try {
                    obj3 = Role.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InputMessage inputMessage = (InputMessage) obj;
        reverseProtoWriter.getClass();
        inputMessage.getClass();
        reverseProtoWriter.writeBytes(inputMessage.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 5, inputMessage.created);
        Role.ADAPTER.encodeWithTag(reverseProtoWriter, 4, inputMessage.role);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, inputMessage.id);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, inputMessage.hidden);
        MessageContent.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, inputMessage.message_contents);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InputMessage inputMessage = (InputMessage) obj;
        inputMessage.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(5, inputMessage.created) + Role.ADAPTER.encodedSizeWithTag(4, inputMessage.role) + ProtoAdapter.STRING.encodedSizeWithTag(3, inputMessage.id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, inputMessage.hidden) + MessageContent.ADAPTER.asRepeated().encodedSizeWithTag(1, inputMessage.message_contents) + inputMessage.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InputMessage inputMessage = (InputMessage) obj;
        inputMessage.getClass();
        return InputMessage.copy$default(inputMessage, TransactorKt.m1169redactElements(inputMessage.message_contents, MessageContent.ADAPTER), null, ByteString.EMPTY, 30);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InputMessage inputMessage = (InputMessage) obj;
        inputMessage.getClass();
        MessageContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, inputMessage.message_contents);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, inputMessage.hidden);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, inputMessage.id);
        Role.ADAPTER.encodeWithTag(protoWriter, 4, inputMessage.role);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, inputMessage.created);
        protoWriter.writeBytes(inputMessage.unknownFields());
    }
}
