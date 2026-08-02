package com.squareup.protos.hieroglyph;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ClientPublicKey$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClientPublicKey(m, (ByteString) obj, (ByteString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ProtoAdapter.BYTES.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClientPublicKey clientPublicKey = (ClientPublicKey) obj;
        reverseProtoWriter.getClass();
        clientPublicKey.getClass();
        reverseProtoWriter.writeBytes(clientPublicKey.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, clientPublicKey.attestation_certs);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, clientPublicKey.key_attestation_cert);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, clientPublicKey.public_key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClientPublicKey clientPublicKey = (ClientPublicKey) obj;
        clientPublicKey.getClass();
        int size$okio = clientPublicKey.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        return protoAdapter.asRepeated().encodedSizeWithTag(3, clientPublicKey.attestation_certs) + protoAdapter.encodedSizeWithTag(2, clientPublicKey.key_attestation_cert) + protoAdapter.encodedSizeWithTag(1, clientPublicKey.public_key) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClientPublicKey clientPublicKey = (ClientPublicKey) obj;
        clientPublicKey.getClass();
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = clientPublicKey.public_key;
        ByteString byteString3 = clientPublicKey.key_attestation_cert;
        List list = clientPublicKey.attestation_certs;
        list.getClass();
        byteString.getClass();
        return new ClientPublicKey(list, byteString2, byteString3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClientPublicKey clientPublicKey = (ClientPublicKey) obj;
        clientPublicKey.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.encodeWithTag(protoWriter, 1, clientPublicKey.public_key);
        protoAdapter.encodeWithTag(protoWriter, 2, clientPublicKey.key_attestation_cert);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, clientPublicKey.attestation_certs);
        protoWriter.writeBytes(clientPublicKey.unknownFields());
    }
}
