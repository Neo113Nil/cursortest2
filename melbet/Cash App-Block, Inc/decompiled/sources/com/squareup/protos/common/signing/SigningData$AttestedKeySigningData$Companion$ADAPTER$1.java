package com.squareup.protos.common.signing;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.signing.SigningData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SigningData$AttestedKeySigningData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SigningData.AttestedKeySigningData((ByteString) obj, (String) obj2, m, (AttestedKeyClientError) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                m.add(ProtoAdapter.BYTES.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(AttestedKeyClientError.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SigningData.AttestedKeySigningData attestedKeySigningData = (SigningData.AttestedKeySigningData) obj;
        reverseProtoWriter.getClass();
        attestedKeySigningData.getClass();
        reverseProtoWriter.writeBytes(attestedKeySigningData.unknownFields());
        AttestedKeyClientError.ADAPTER.encodeWithTag(reverseProtoWriter, 4, attestedKeySigningData.client_error);
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, attestedKeySigningData.certificate_chain);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, attestedKeySigningData.key_alias);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, attestedKeySigningData.signature);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SigningData.AttestedKeySigningData attestedKeySigningData = (SigningData.AttestedKeySigningData) obj;
        attestedKeySigningData.getClass();
        int size$okio = attestedKeySigningData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        return AttestedKeyClientError.ADAPTER.encodedSizeWithTag(4, attestedKeySigningData.client_error) + protoAdapter.asRepeated().encodedSizeWithTag(3, attestedKeySigningData.certificate_chain) + ProtoAdapter.STRING.encodedSizeWithTag(2, attestedKeySigningData.key_alias) + protoAdapter.encodedSizeWithTag(1, attestedKeySigningData.signature) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SigningData.AttestedKeySigningData attestedKeySigningData = (SigningData.AttestedKeySigningData) obj;
        attestedKeySigningData.getClass();
        AttestedKeyClientError attestedKeyClientError = attestedKeySigningData.client_error;
        AttestedKeyClientError attestedKeyClientError2 = attestedKeyClientError != null ? (AttestedKeyClientError) AttestedKeyClientError.ADAPTER.redact(attestedKeyClientError) : null;
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = attestedKeySigningData.signature;
        String str = attestedKeySigningData.key_alias;
        List list = attestedKeySigningData.certificate_chain;
        list.getClass();
        byteString.getClass();
        return new SigningData.AttestedKeySigningData(byteString2, str, list, attestedKeyClientError2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SigningData.AttestedKeySigningData attestedKeySigningData = (SigningData.AttestedKeySigningData) obj;
        attestedKeySigningData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.encodeWithTag(protoWriter, 1, attestedKeySigningData.signature);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, attestedKeySigningData.key_alias);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, attestedKeySigningData.certificate_chain);
        AttestedKeyClientError.ADAPTER.encodeWithTag(protoWriter, 4, attestedKeySigningData.client_error);
        protoWriter.writeBytes(attestedKeySigningData.unknownFields());
    }
}
