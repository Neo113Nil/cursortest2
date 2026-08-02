package com.squareup.protos.payrollconnector.common;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Employer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Employer((String) obj, (String) obj2, (SourceIdentifier) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(SourceIdentifier.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Employer employer = (Employer) obj;
        reverseProtoWriter.getClass();
        employer.getClass();
        reverseProtoWriter.writeBytes(employer.unknownFields());
        SourceIdentifier.ADAPTER.encodeWithTag(reverseProtoWriter, 3, employer.source_id);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, employer.canonical_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, employer.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Employer employer = (Employer) obj;
        employer.getClass();
        int size$okio = employer.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return SourceIdentifier.ADAPTER.encodedSizeWithTag(3, employer.source_id) + protoAdapter.encodedSizeWithTag(2, employer.canonical_name) + protoAdapter.encodedSizeWithTag(1, employer.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Employer employer = (Employer) obj;
        employer.getClass();
        SourceIdentifier sourceIdentifier = employer.source_id;
        SourceIdentifier sourceIdentifier2 = sourceIdentifier != null ? (SourceIdentifier) SourceIdentifier.ADAPTER.redact(sourceIdentifier) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = employer.token;
        String str2 = employer.canonical_name;
        byteString.getClass();
        return new Employer(str, str2, sourceIdentifier2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Employer employer = (Employer) obj;
        employer.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, employer.token);
        protoAdapter.encodeWithTag(protoWriter, 2, employer.canonical_name);
        SourceIdentifier.ADAPTER.encodeWithTag(protoWriter, 3, employer.source_id);
        protoWriter.writeBytes(employer.unknownFields());
    }
}
