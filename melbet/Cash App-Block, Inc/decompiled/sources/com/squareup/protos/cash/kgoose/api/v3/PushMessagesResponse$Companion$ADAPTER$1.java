package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/PushMessagesResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/PushMessagesResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PushMessagesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PushMessagesResponse((String) obj, (PushMessageStatus) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = PushMessageStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PushMessagesResponse pushMessagesResponse = (PushMessagesResponse) obj;
        reverseProtoWriter.getClass();
        pushMessagesResponse.getClass();
        reverseProtoWriter.writeBytes(pushMessagesResponse.unknownFields());
        PushMessageStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 2, pushMessagesResponse.status);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, pushMessagesResponse.session_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PushMessagesResponse pushMessagesResponse = (PushMessagesResponse) obj;
        pushMessagesResponse.getClass();
        return PushMessageStatus.ADAPTER.encodedSizeWithTag(2, pushMessagesResponse.status) + ProtoAdapter.STRING.encodedSizeWithTag(1, pushMessagesResponse.session_id) + pushMessagesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PushMessagesResponse pushMessagesResponse = (PushMessagesResponse) obj;
        pushMessagesResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = pushMessagesResponse.session_id;
        PushMessageStatus pushMessageStatus = pushMessagesResponse.status;
        byteString.getClass();
        return new PushMessagesResponse(str, pushMessageStatus, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PushMessagesResponse pushMessagesResponse = (PushMessagesResponse) obj;
        pushMessagesResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushMessagesResponse.session_id);
        PushMessageStatus.ADAPTER.encodeWithTag(protoWriter, 2, pushMessagesResponse.status);
        protoWriter.writeBytes(pushMessagesResponse.unknownFields());
    }
}
