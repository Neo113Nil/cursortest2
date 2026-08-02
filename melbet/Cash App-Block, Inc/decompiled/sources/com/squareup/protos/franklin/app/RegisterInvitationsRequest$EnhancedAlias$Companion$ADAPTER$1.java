package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.RegisterInvitationsRequest;
import com.squareup.protos.franklin.common.scenarios.InvitationConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RegisterInvitationsRequest$EnhancedAlias$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new RegisterInvitationsRequest.EnhancedAlias((RegisterInvitationsRequest.EnhancedAlias.Type) obj, (String) obj2, (String) obj3, (InvitationConfig.InvitationTreatment) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = RegisterInvitationsRequest.EnhancedAlias.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = InvitationConfig.InvitationTreatment.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RegisterInvitationsRequest.EnhancedAlias enhancedAlias = (RegisterInvitationsRequest.EnhancedAlias) obj;
        reverseProtoWriter.getClass();
        enhancedAlias.getClass();
        reverseProtoWriter.writeBytes(enhancedAlias.unknownFields());
        InvitationConfig.InvitationTreatment.ADAPTER.encodeWithTag(reverseProtoWriter, 4, enhancedAlias.invitation_treatment);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, enhancedAlias.unhashed_alias);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, enhancedAlias.hashed_alias);
        RegisterInvitationsRequest.EnhancedAlias.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, enhancedAlias.f1365type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RegisterInvitationsRequest.EnhancedAlias enhancedAlias = (RegisterInvitationsRequest.EnhancedAlias) obj;
        enhancedAlias.getClass();
        int encodedSizeWithTag = RegisterInvitationsRequest.EnhancedAlias.Type.ADAPTER.encodedSizeWithTag(1, enhancedAlias.f1365type) + enhancedAlias.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return InvitationConfig.InvitationTreatment.ADAPTER.encodedSizeWithTag(4, enhancedAlias.invitation_treatment) + protoAdapter.encodedSizeWithTag(3, enhancedAlias.unhashed_alias) + protoAdapter.encodedSizeWithTag(2, enhancedAlias.hashed_alias) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RegisterInvitationsRequest.EnhancedAlias enhancedAlias = (RegisterInvitationsRequest.EnhancedAlias) obj;
        enhancedAlias.getClass();
        ByteString byteString = ByteString.EMPTY;
        RegisterInvitationsRequest.EnhancedAlias.Type type2 = enhancedAlias.f1365type;
        InvitationConfig.InvitationTreatment invitationTreatment = enhancedAlias.invitation_treatment;
        byteString.getClass();
        return new RegisterInvitationsRequest.EnhancedAlias(type2, null, null, invitationTreatment, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RegisterInvitationsRequest.EnhancedAlias enhancedAlias = (RegisterInvitationsRequest.EnhancedAlias) obj;
        enhancedAlias.getClass();
        RegisterInvitationsRequest.EnhancedAlias.Type.ADAPTER.encodeWithTag(protoWriter, 1, enhancedAlias.f1365type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, enhancedAlias.hashed_alias);
        protoAdapter.encodeWithTag(protoWriter, 3, enhancedAlias.unhashed_alias);
        InvitationConfig.InvitationTreatment.ADAPTER.encodeWithTag(protoWriter, 4, enhancedAlias.invitation_treatment);
        protoWriter.writeBytes(enhancedAlias.unknownFields());
    }
}
