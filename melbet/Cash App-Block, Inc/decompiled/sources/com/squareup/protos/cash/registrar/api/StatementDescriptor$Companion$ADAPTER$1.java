package com.squareup.protos.cash.registrar.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class StatementDescriptor$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new StatementDescriptor((String) obj, (StatementCoverage) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(StatementCoverage.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StatementDescriptor statementDescriptor = (StatementDescriptor) obj;
        reverseProtoWriter.getClass();
        statementDescriptor.getClass();
        reverseProtoWriter.writeBytes(statementDescriptor.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, statementDescriptor.statement_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, statementDescriptor.statement_url);
        StatementCoverage.ADAPTER.encodeWithTag(reverseProtoWriter, 2, statementDescriptor.statement_coverage);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, statementDescriptor.display_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StatementDescriptor statementDescriptor = (StatementDescriptor) obj;
        statementDescriptor.getClass();
        int size$okio = statementDescriptor.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, statementDescriptor.statement_token) + protoAdapter.encodedSizeWithTag(3, statementDescriptor.statement_url) + StatementCoverage.ADAPTER.encodedSizeWithTag(2, statementDescriptor.statement_coverage) + protoAdapter.encodedSizeWithTag(1, statementDescriptor.display_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StatementDescriptor statementDescriptor = (StatementDescriptor) obj;
        statementDescriptor.getClass();
        StatementCoverage statementCoverage = statementDescriptor.statement_coverage;
        StatementCoverage statementCoverage2 = statementCoverage != null ? (StatementCoverage) StatementCoverage.ADAPTER.redact(statementCoverage) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = statementDescriptor.display_name;
        String str2 = statementDescriptor.statement_url;
        String str3 = statementDescriptor.statement_token;
        byteString.getClass();
        return new StatementDescriptor(str, statementCoverage2, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StatementDescriptor statementDescriptor = (StatementDescriptor) obj;
        statementDescriptor.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, statementDescriptor.display_name);
        StatementCoverage.ADAPTER.encodeWithTag(protoWriter, 2, statementDescriptor.statement_coverage);
        protoAdapter.encodeWithTag(protoWriter, 3, statementDescriptor.statement_url);
        protoAdapter.encodeWithTag(protoWriter, 4, statementDescriptor.statement_token);
        protoWriter.writeBytes(statementDescriptor.unknownFields());
    }
}
