package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$ShadowAccount$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.ShadowAccount((Action.ShadowAccount.Integration) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Action.ShadowAccount.Integration.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.ShadowAccount shadowAccount = (Action.ShadowAccount) obj;
        reverseProtoWriter.getClass();
        shadowAccount.getClass();
        reverseProtoWriter.writeBytes(shadowAccount.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, shadowAccount.requester_profile_scope_id);
        Action.ShadowAccount.Integration.ADAPTER.encodeWithTag(reverseProtoWriter, 1, shadowAccount.integration);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.ShadowAccount shadowAccount = (Action.ShadowAccount) obj;
        shadowAccount.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, shadowAccount.requester_profile_scope_id) + Action.ShadowAccount.Integration.ADAPTER.encodedSizeWithTag(1, shadowAccount.integration) + shadowAccount.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.ShadowAccount shadowAccount = (Action.ShadowAccount) obj;
        shadowAccount.getClass();
        ByteString byteString = ByteString.EMPTY;
        Action.ShadowAccount.Integration integration = shadowAccount.integration;
        String str = shadowAccount.requester_profile_scope_id;
        byteString.getClass();
        return new Action.ShadowAccount(integration, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.ShadowAccount shadowAccount = (Action.ShadowAccount) obj;
        shadowAccount.getClass();
        Action.ShadowAccount.Integration.ADAPTER.encodeWithTag(protoWriter, 1, shadowAccount.integration);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, shadowAccount.requester_profile_scope_id);
        protoWriter.writeBytes(shadowAccount.unknownFields());
    }
}
