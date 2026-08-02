package com.squareup.protos.cash.janus.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.janus.api.GetWebAuthnCredentialsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetWebAuthnCredentialsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetWebAuthnCredentialsResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(GetWebAuthnCredentialsResponse.Credential.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetWebAuthnCredentialsResponse getWebAuthnCredentialsResponse = (GetWebAuthnCredentialsResponse) obj;
        reverseProtoWriter.getClass();
        getWebAuthnCredentialsResponse.getClass();
        reverseProtoWriter.writeBytes(getWebAuthnCredentialsResponse.unknownFields());
        GetWebAuthnCredentialsResponse.Credential.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getWebAuthnCredentialsResponse.credentials);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetWebAuthnCredentialsResponse getWebAuthnCredentialsResponse = (GetWebAuthnCredentialsResponse) obj;
        getWebAuthnCredentialsResponse.getClass();
        return GetWebAuthnCredentialsResponse.Credential.ADAPTER.asRepeated().encodedSizeWithTag(1, getWebAuthnCredentialsResponse.credentials) + getWebAuthnCredentialsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetWebAuthnCredentialsResponse getWebAuthnCredentialsResponse = (GetWebAuthnCredentialsResponse) obj;
        getWebAuthnCredentialsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getWebAuthnCredentialsResponse.credentials, GetWebAuthnCredentialsResponse.Credential.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetWebAuthnCredentialsResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetWebAuthnCredentialsResponse getWebAuthnCredentialsResponse = (GetWebAuthnCredentialsResponse) obj;
        getWebAuthnCredentialsResponse.getClass();
        GetWebAuthnCredentialsResponse.Credential.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getWebAuthnCredentialsResponse.credentials);
        protoWriter.writeBytes(getWebAuthnCredentialsResponse.unknownFields());
    }
}
