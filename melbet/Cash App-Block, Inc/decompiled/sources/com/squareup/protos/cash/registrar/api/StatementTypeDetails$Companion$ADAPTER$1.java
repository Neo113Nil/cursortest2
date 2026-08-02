package com.squareup.protos.cash.registrar.api;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class StatementTypeDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StatementTypeDetails((String) obj, (StatementType) obj2, (Boolean) obj3, (String) obj4, (Boolean) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = StatementType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StatementTypeDetails statementTypeDetails = (StatementTypeDetails) obj;
        reverseProtoWriter.getClass();
        statementTypeDetails.getClass();
        reverseProtoWriter.writeBytes(statementTypeDetails.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, statementTypeDetails.is_active_sponsored_account);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, statementTypeDetails.display_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, statementTypeDetails.is_sponsored_account);
        StatementType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, statementTypeDetails.statement_type);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, statementTypeDetails.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StatementTypeDetails statementTypeDetails = (StatementTypeDetails) obj;
        statementTypeDetails.getClass();
        int size$okio = statementTypeDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = StatementType.ADAPTER.encodedSizeWithTag(2, statementTypeDetails.statement_type) + protoAdapter.encodedSizeWithTag(1, statementTypeDetails.customer_token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(5, statementTypeDetails.is_active_sponsored_account) + protoAdapter.encodedSizeWithTag(4, statementTypeDetails.display_name) + protoAdapter2.encodedSizeWithTag(3, statementTypeDetails.is_sponsored_account) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StatementTypeDetails statementTypeDetails = (StatementTypeDetails) obj;
        statementTypeDetails.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = statementTypeDetails.customer_token;
        StatementType statementType = statementTypeDetails.statement_type;
        Boolean bool = statementTypeDetails.is_sponsored_account;
        String str2 = statementTypeDetails.display_name;
        Boolean bool2 = statementTypeDetails.is_active_sponsored_account;
        byteString.getClass();
        return new StatementTypeDetails(str, statementType, bool, str2, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StatementTypeDetails statementTypeDetails = (StatementTypeDetails) obj;
        statementTypeDetails.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, statementTypeDetails.customer_token);
        StatementType.ADAPTER.encodeWithTag(protoWriter, 2, statementTypeDetails.statement_type);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 3, statementTypeDetails.is_sponsored_account);
        protoAdapter.encodeWithTag(protoWriter, 4, statementTypeDetails.display_name);
        protoAdapter2.encodeWithTag(protoWriter, 5, statementTypeDetails.is_active_sponsored_account);
        protoWriter.writeBytes(statementTypeDetails.unknownFields());
    }
}
