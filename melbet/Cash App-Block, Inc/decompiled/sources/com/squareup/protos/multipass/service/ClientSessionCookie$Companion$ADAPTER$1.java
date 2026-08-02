package com.squareup.protos.multipass.service;

import com.squareup.protos.multipass.common.ScopedSession;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ClientSessionCookie$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClientSessionCookie((String) obj, (ScopedSession) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = ScopedSession.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClientSessionCookie clientSessionCookie = (ClientSessionCookie) obj;
        reverseProtoWriter.getClass();
        clientSessionCookie.getClass();
        reverseProtoWriter.writeBytes(clientSessionCookie.unknownFields());
        ScopedSession.ADAPTER.encodeWithTag(reverseProtoWriter, 2, clientSessionCookie.scope);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, clientSessionCookie.value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClientSessionCookie clientSessionCookie = (ClientSessionCookie) obj;
        clientSessionCookie.getClass();
        return ScopedSession.ADAPTER.encodedSizeWithTag(2, clientSessionCookie.scope) + ProtoAdapter.STRING.encodedSizeWithTag(1, clientSessionCookie.value) + clientSessionCookie.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClientSessionCookie clientSessionCookie = (ClientSessionCookie) obj;
        clientSessionCookie.getClass();
        ByteString byteString = ByteString.EMPTY;
        ScopedSession scopedSession = clientSessionCookie.scope;
        byteString.getClass();
        return new ClientSessionCookie(null, scopedSession, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClientSessionCookie clientSessionCookie = (ClientSessionCookie) obj;
        clientSessionCookie.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, clientSessionCookie.value);
        ScopedSession.ADAPTER.encodeWithTag(protoWriter, 2, clientSessionCookie.scope);
        protoWriter.writeBytes(clientSessionCookie.unknownFields());
    }
}
