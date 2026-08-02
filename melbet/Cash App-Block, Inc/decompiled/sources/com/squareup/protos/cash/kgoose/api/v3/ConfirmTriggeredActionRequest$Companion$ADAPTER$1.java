package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ConfirmTriggeredActionRequest$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ConfirmTriggeredActionRequest;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConfirmTriggeredActionRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ConfirmTriggeredActionRequest((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ConfirmTriggeredActionRequest confirmTriggeredActionRequest = (ConfirmTriggeredActionRequest) obj;
        reverseProtoWriter.getClass();
        confirmTriggeredActionRequest.getClass();
        reverseProtoWriter.writeBytes(confirmTriggeredActionRequest.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, confirmTriggeredActionRequest.session_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, confirmTriggeredActionRequest.hidden_message);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ConfirmTriggeredActionRequest confirmTriggeredActionRequest = (ConfirmTriggeredActionRequest) obj;
        confirmTriggeredActionRequest.getClass();
        int size$okio = confirmTriggeredActionRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, confirmTriggeredActionRequest.session_id) + protoAdapter.encodedSizeWithTag(1, confirmTriggeredActionRequest.hidden_message) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ConfirmTriggeredActionRequest confirmTriggeredActionRequest = (ConfirmTriggeredActionRequest) obj;
        confirmTriggeredActionRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = confirmTriggeredActionRequest.hidden_message;
        String str2 = confirmTriggeredActionRequest.session_id;
        byteString.getClass();
        return new ConfirmTriggeredActionRequest(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ConfirmTriggeredActionRequest confirmTriggeredActionRequest = (ConfirmTriggeredActionRequest) obj;
        confirmTriggeredActionRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, confirmTriggeredActionRequest.hidden_message);
        protoAdapter.encodeWithTag(protoWriter, 2, confirmTriggeredActionRequest.session_id);
        protoWriter.writeBytes(confirmTriggeredActionRequest.unknownFields());
    }
}
