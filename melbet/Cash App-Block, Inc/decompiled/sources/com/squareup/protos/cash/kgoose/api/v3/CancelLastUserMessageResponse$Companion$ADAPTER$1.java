package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/CancelLastUserMessageResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/CancelLastUserMessageResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CancelLastUserMessageResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CancelLastUserMessageResponse((Boolean) obj, (String) obj2, (ChatSessionStatus) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = ChatSessionStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CancelLastUserMessageResponse cancelLastUserMessageResponse = (CancelLastUserMessageResponse) obj;
        reverseProtoWriter.getClass();
        cancelLastUserMessageResponse.getClass();
        reverseProtoWriter.writeBytes(cancelLastUserMessageResponse.unknownFields());
        ChatSessionStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cancelLastUserMessageResponse.session_status);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, cancelLastUserMessageResponse.message);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, cancelLastUserMessageResponse.cancelled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CancelLastUserMessageResponse cancelLastUserMessageResponse = (CancelLastUserMessageResponse) obj;
        cancelLastUserMessageResponse.getClass();
        return ChatSessionStatus.ADAPTER.encodedSizeWithTag(3, cancelLastUserMessageResponse.session_status) + ProtoAdapter.STRING.encodedSizeWithTag(2, cancelLastUserMessageResponse.message) + ProtoAdapter.BOOL.encodedSizeWithTag(1, cancelLastUserMessageResponse.cancelled) + cancelLastUserMessageResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CancelLastUserMessageResponse cancelLastUserMessageResponse = (CancelLastUserMessageResponse) obj;
        cancelLastUserMessageResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = cancelLastUserMessageResponse.cancelled;
        String str = cancelLastUserMessageResponse.message;
        ChatSessionStatus chatSessionStatus = cancelLastUserMessageResponse.session_status;
        byteString.getClass();
        return new CancelLastUserMessageResponse(bool, str, chatSessionStatus, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CancelLastUserMessageResponse cancelLastUserMessageResponse = (CancelLastUserMessageResponse) obj;
        cancelLastUserMessageResponse.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, cancelLastUserMessageResponse.cancelled);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, cancelLastUserMessageResponse.message);
        ChatSessionStatus.ADAPTER.encodeWithTag(protoWriter, 3, cancelLastUserMessageResponse.session_status);
        protoWriter.writeBytes(cancelLastUserMessageResponse.unknownFields());
    }
}
