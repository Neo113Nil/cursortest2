package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/DeleteUserSessionResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/DeleteUserSessionResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeleteUserSessionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DeleteUserSessionResponse((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DeleteUserSessionResponse deleteUserSessionResponse = (DeleteUserSessionResponse) obj;
        reverseProtoWriter.getClass();
        deleteUserSessionResponse.getClass();
        reverseProtoWriter.writeBytes(deleteUserSessionResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, deleteUserSessionResponse.session_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DeleteUserSessionResponse deleteUserSessionResponse = (DeleteUserSessionResponse) obj;
        deleteUserSessionResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, deleteUserSessionResponse.session_id) + deleteUserSessionResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DeleteUserSessionResponse deleteUserSessionResponse = (DeleteUserSessionResponse) obj;
        deleteUserSessionResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = deleteUserSessionResponse.session_id;
        byteString.getClass();
        return new DeleteUserSessionResponse(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DeleteUserSessionResponse deleteUserSessionResponse = (DeleteUserSessionResponse) obj;
        deleteUserSessionResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteUserSessionResponse.session_id);
        protoWriter.writeBytes(deleteUserSessionResponse.unknownFields());
    }
}
