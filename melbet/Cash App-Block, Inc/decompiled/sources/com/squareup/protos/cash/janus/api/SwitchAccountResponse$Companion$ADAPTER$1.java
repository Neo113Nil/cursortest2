package com.squareup.protos.cash.janus.api;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SwitchAccountResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SwitchAccountResponse((ResponseContext) obj, (AuthorizationContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(AuthorizationContext.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SwitchAccountResponse switchAccountResponse = (SwitchAccountResponse) obj;
        reverseProtoWriter.getClass();
        switchAccountResponse.getClass();
        reverseProtoWriter.writeBytes(switchAccountResponse.unknownFields());
        AuthorizationContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, switchAccountResponse.authorization_context);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, switchAccountResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SwitchAccountResponse switchAccountResponse = (SwitchAccountResponse) obj;
        switchAccountResponse.getClass();
        return AuthorizationContext.ADAPTER.encodedSizeWithTag(2, switchAccountResponse.authorization_context) + ResponseContext.ADAPTER.encodedSizeWithTag(1, switchAccountResponse.response_context) + switchAccountResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SwitchAccountResponse switchAccountResponse = (SwitchAccountResponse) obj;
        switchAccountResponse.getClass();
        ResponseContext responseContext = switchAccountResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        AuthorizationContext authorizationContext = switchAccountResponse.authorization_context;
        AuthorizationContext authorizationContext2 = authorizationContext != null ? (AuthorizationContext) AuthorizationContext.ADAPTER.redact(authorizationContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SwitchAccountResponse(responseContext2, authorizationContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SwitchAccountResponse switchAccountResponse = (SwitchAccountResponse) obj;
        switchAccountResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, switchAccountResponse.response_context);
        AuthorizationContext.ADAPTER.encodeWithTag(protoWriter, 2, switchAccountResponse.authorization_context);
        protoWriter.writeBytes(switchAccountResponse.unknownFields());
    }
}
