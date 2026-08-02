package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/FireTriggeredActionResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/FireTriggeredActionResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FireTriggeredActionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new FireTriggeredActionResponse((Boolean) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FireTriggeredActionResponse fireTriggeredActionResponse = (FireTriggeredActionResponse) obj;
        reverseProtoWriter.getClass();
        fireTriggeredActionResponse.getClass();
        reverseProtoWriter.writeBytes(fireTriggeredActionResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, fireTriggeredActionResponse.execution_session_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, fireTriggeredActionResponse.error_msg);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, fireTriggeredActionResponse.success);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FireTriggeredActionResponse fireTriggeredActionResponse = (FireTriggeredActionResponse) obj;
        fireTriggeredActionResponse.getClass();
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, fireTriggeredActionResponse.success) + fireTriggeredActionResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, fireTriggeredActionResponse.execution_session_id) + protoAdapter.encodedSizeWithTag(2, fireTriggeredActionResponse.error_msg) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FireTriggeredActionResponse fireTriggeredActionResponse = (FireTriggeredActionResponse) obj;
        fireTriggeredActionResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = fireTriggeredActionResponse.success;
        String str = fireTriggeredActionResponse.error_msg;
        String str2 = fireTriggeredActionResponse.execution_session_id;
        byteString.getClass();
        return new FireTriggeredActionResponse(bool, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FireTriggeredActionResponse fireTriggeredActionResponse = (FireTriggeredActionResponse) obj;
        fireTriggeredActionResponse.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, fireTriggeredActionResponse.success);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, fireTriggeredActionResponse.error_msg);
        protoAdapter.encodeWithTag(protoWriter, 3, fireTriggeredActionResponse.execution_session_id);
        protoWriter.writeBytes(fireTriggeredActionResponse.unknownFields());
    }
}
