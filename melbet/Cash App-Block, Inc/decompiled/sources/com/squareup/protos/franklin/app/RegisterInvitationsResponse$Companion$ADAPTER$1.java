package com.squareup.protos.franklin.app;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.RegisterInvitationsResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RegisterInvitationsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RegisterInvitationsResponse((RegisterInvitationsResponse.Status) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = RegisterInvitationsResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RegisterInvitationsResponse registerInvitationsResponse = (RegisterInvitationsResponse) obj;
        reverseProtoWriter.getClass();
        registerInvitationsResponse.getClass();
        reverseProtoWriter.writeBytes(registerInvitationsResponse.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 2, registerInvitationsResponse.invitation_tokens);
        RegisterInvitationsResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, registerInvitationsResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RegisterInvitationsResponse registerInvitationsResponse = (RegisterInvitationsResponse) obj;
        registerInvitationsResponse.getClass();
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, registerInvitationsResponse.invitation_tokens) + RegisterInvitationsResponse.Status.ADAPTER.encodedSizeWithTag(1, registerInvitationsResponse.status) + registerInvitationsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RegisterInvitationsResponse registerInvitationsResponse = (RegisterInvitationsResponse) obj;
        registerInvitationsResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        RegisterInvitationsResponse.Status status = registerInvitationsResponse.status;
        List list = registerInvitationsResponse.invitation_tokens;
        list.getClass();
        byteString.getClass();
        return new RegisterInvitationsResponse(status, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RegisterInvitationsResponse registerInvitationsResponse = (RegisterInvitationsResponse) obj;
        registerInvitationsResponse.getClass();
        RegisterInvitationsResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, registerInvitationsResponse.status);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, registerInvitationsResponse.invitation_tokens);
        protoWriter.writeBytes(registerInvitationsResponse.unknownFields());
    }
}
