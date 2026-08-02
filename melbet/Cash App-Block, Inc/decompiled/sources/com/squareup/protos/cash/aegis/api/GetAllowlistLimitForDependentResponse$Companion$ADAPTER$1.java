package com.squareup.protos.cash.aegis.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetAllowlistLimitForDependentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAllowlistLimitForDependentResponse((Integer) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAllowlistLimitForDependentResponse getAllowlistLimitForDependentResponse = (GetAllowlistLimitForDependentResponse) obj;
        reverseProtoWriter.getClass();
        getAllowlistLimitForDependentResponse.getClass();
        reverseProtoWriter.writeBytes(getAllowlistLimitForDependentResponse.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, getAllowlistLimitForDependentResponse.allowlist_limit);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAllowlistLimitForDependentResponse getAllowlistLimitForDependentResponse = (GetAllowlistLimitForDependentResponse) obj;
        getAllowlistLimitForDependentResponse.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(1, getAllowlistLimitForDependentResponse.allowlist_limit) + getAllowlistLimitForDependentResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAllowlistLimitForDependentResponse getAllowlistLimitForDependentResponse = (GetAllowlistLimitForDependentResponse) obj;
        getAllowlistLimitForDependentResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = getAllowlistLimitForDependentResponse.allowlist_limit;
        byteString.getClass();
        return new GetAllowlistLimitForDependentResponse(num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAllowlistLimitForDependentResponse getAllowlistLimitForDependentResponse = (GetAllowlistLimitForDependentResponse) obj;
        getAllowlistLimitForDependentResponse.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getAllowlistLimitForDependentResponse.allowlist_limit);
        protoWriter.writeBytes(getAllowlistLimitForDependentResponse.unknownFields());
    }
}
