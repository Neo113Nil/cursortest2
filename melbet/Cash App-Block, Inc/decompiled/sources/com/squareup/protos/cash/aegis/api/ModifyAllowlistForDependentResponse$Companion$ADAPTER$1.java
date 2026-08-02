package com.squareup.protos.cash.aegis.api;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ModifyAllowlistForDependentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ModifyAllowlistForDependentResponse((ResponseContext) obj, (Boolean) obj2, (Integer) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ModifyAllowlistForDependentResponse modifyAllowlistForDependentResponse = (ModifyAllowlistForDependentResponse) obj;
        reverseProtoWriter.getClass();
        modifyAllowlistForDependentResponse.getClass();
        reverseProtoWriter.writeBytes(modifyAllowlistForDependentResponse.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 3, modifyAllowlistForDependentResponse.allowlist_limit);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, modifyAllowlistForDependentResponse.is_successful);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, modifyAllowlistForDependentResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ModifyAllowlistForDependentResponse modifyAllowlistForDependentResponse = (ModifyAllowlistForDependentResponse) obj;
        modifyAllowlistForDependentResponse.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(3, modifyAllowlistForDependentResponse.allowlist_limit) + ProtoAdapter.BOOL.encodedSizeWithTag(2, modifyAllowlistForDependentResponse.is_successful) + ResponseContext.ADAPTER.encodedSizeWithTag(1, modifyAllowlistForDependentResponse.response_context) + modifyAllowlistForDependentResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ModifyAllowlistForDependentResponse modifyAllowlistForDependentResponse = (ModifyAllowlistForDependentResponse) obj;
        modifyAllowlistForDependentResponse.getClass();
        ResponseContext responseContext = modifyAllowlistForDependentResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = modifyAllowlistForDependentResponse.is_successful;
        Integer num = modifyAllowlistForDependentResponse.allowlist_limit;
        byteString.getClass();
        return new ModifyAllowlistForDependentResponse(responseContext2, bool, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ModifyAllowlistForDependentResponse modifyAllowlistForDependentResponse = (ModifyAllowlistForDependentResponse) obj;
        modifyAllowlistForDependentResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, modifyAllowlistForDependentResponse.response_context);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, modifyAllowlistForDependentResponse.is_successful);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, modifyAllowlistForDependentResponse.allowlist_limit);
        protoWriter.writeBytes(modifyAllowlistForDependentResponse.unknownFields());
    }
}
