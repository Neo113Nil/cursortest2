package com.squareup.protos.cash.janus.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.janus.api.RegisterProspectTokenResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RegisterProspectTokenResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RegisterProspectTokenResponse((ResponseContext) obj, (RegisterProspectTokenResponse.Status) obj2, (String) obj3, (RegisterProspectTokenResponse.AliasType) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                try {
                    obj2 = RegisterProspectTokenResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = RegisterProspectTokenResponse.AliasType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RegisterProspectTokenResponse registerProspectTokenResponse = (RegisterProspectTokenResponse) obj;
        reverseProtoWriter.getClass();
        registerProspectTokenResponse.getClass();
        reverseProtoWriter.writeBytes(registerProspectTokenResponse.unknownFields());
        RegisterProspectTokenResponse.AliasType.ADAPTER.encodeWithTag(reverseProtoWriter, 4, registerProspectTokenResponse.alias_type);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, registerProspectTokenResponse.redacted_alias);
        RegisterProspectTokenResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 2, registerProspectTokenResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, registerProspectTokenResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RegisterProspectTokenResponse registerProspectTokenResponse = (RegisterProspectTokenResponse) obj;
        registerProspectTokenResponse.getClass();
        return RegisterProspectTokenResponse.AliasType.ADAPTER.encodedSizeWithTag(4, registerProspectTokenResponse.alias_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, registerProspectTokenResponse.redacted_alias) + RegisterProspectTokenResponse.Status.ADAPTER.encodedSizeWithTag(2, registerProspectTokenResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(1, registerProspectTokenResponse.response_context) + registerProspectTokenResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RegisterProspectTokenResponse registerProspectTokenResponse = (RegisterProspectTokenResponse) obj;
        registerProspectTokenResponse.getClass();
        ResponseContext responseContext = registerProspectTokenResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        RegisterProspectTokenResponse.Status status = registerProspectTokenResponse.status;
        RegisterProspectTokenResponse.AliasType aliasType = registerProspectTokenResponse.alias_type;
        byteString.getClass();
        return new RegisterProspectTokenResponse(responseContext2, status, null, aliasType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RegisterProspectTokenResponse registerProspectTokenResponse = (RegisterProspectTokenResponse) obj;
        registerProspectTokenResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, registerProspectTokenResponse.response_context);
        RegisterProspectTokenResponse.Status.ADAPTER.encodeWithTag(protoWriter, 2, registerProspectTokenResponse.status);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, registerProspectTokenResponse.redacted_alias);
        RegisterProspectTokenResponse.AliasType.ADAPTER.encodeWithTag(protoWriter, 4, registerProspectTokenResponse.alias_type);
        protoWriter.writeBytes(registerProspectTokenResponse.unknownFields());
    }
}
