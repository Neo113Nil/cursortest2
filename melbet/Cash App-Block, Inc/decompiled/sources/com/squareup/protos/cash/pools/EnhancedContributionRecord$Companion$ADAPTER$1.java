package com.squareup.protos.cash.pools;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class EnhancedContributionRecord$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EnhancedContributionRecord((String) obj4, (Long) obj5, (Long) obj6, (String) obj7, (TransactionType) obj8, (PoolContributionStatus) obj9, (String) obj10, (String) obj11, (String) obj12, (String) obj13, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 3:
                    obj6 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj = obj4;
                    obj2 = obj5;
                    try {
                        obj4 = obj;
                        obj8 = TransactionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj3 = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj5 = obj2;
                    break;
                case 6:
                    try {
                        obj9 = PoolContributionStatus.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj4;
                        obj2 = obj5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 7:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj12 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    obj13 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    obj4 = obj;
                    obj6 = obj3;
                    obj5 = obj2;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EnhancedContributionRecord enhancedContributionRecord = (EnhancedContributionRecord) obj;
        reverseProtoWriter.getClass();
        enhancedContributionRecord.getClass();
        reverseProtoWriter.writeBytes(enhancedContributionRecord.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, enhancedContributionRecord.owner_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, enhancedContributionRecord.pool_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, enhancedContributionRecord.pool_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, enhancedContributionRecord.contributor_comment);
        PoolContributionStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 6, enhancedContributionRecord.status);
        TransactionType.ADAPTER.encodeWithTag(reverseProtoWriter, 5, enhancedContributionRecord.transaction_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, enhancedContributionRecord.contributor_identifier);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, enhancedContributionRecord.amount_cents);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, enhancedContributionRecord.created_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, enhancedContributionRecord.transaction_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EnhancedContributionRecord enhancedContributionRecord = (EnhancedContributionRecord) obj;
        enhancedContributionRecord.getClass();
        int size$okio = enhancedContributionRecord.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, enhancedContributionRecord.transaction_token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(10, enhancedContributionRecord.owner_token) + protoAdapter.encodedSizeWithTag(9, enhancedContributionRecord.pool_name) + protoAdapter.encodedSizeWithTag(8, enhancedContributionRecord.pool_token) + protoAdapter.encodedSizeWithTag(7, enhancedContributionRecord.contributor_comment) + PoolContributionStatus.ADAPTER.encodedSizeWithTag(6, enhancedContributionRecord.status) + TransactionType.ADAPTER.encodedSizeWithTag(5, enhancedContributionRecord.transaction_type) + protoAdapter.encodedSizeWithTag(4, enhancedContributionRecord.contributor_identifier) + protoAdapter2.encodedSizeWithTag(3, enhancedContributionRecord.amount_cents) + protoAdapter2.encodedSizeWithTag(2, enhancedContributionRecord.created_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EnhancedContributionRecord enhancedContributionRecord = (EnhancedContributionRecord) obj;
        enhancedContributionRecord.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = enhancedContributionRecord.transaction_token;
        Long l = enhancedContributionRecord.created_at;
        Long l2 = enhancedContributionRecord.amount_cents;
        String str2 = enhancedContributionRecord.contributor_identifier;
        TransactionType transactionType = enhancedContributionRecord.transaction_type;
        PoolContributionStatus poolContributionStatus = enhancedContributionRecord.status;
        String str3 = enhancedContributionRecord.pool_token;
        String str4 = enhancedContributionRecord.owner_token;
        byteString.getClass();
        return new EnhancedContributionRecord(str, l, l2, str2, transactionType, poolContributionStatus, null, str3, null, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EnhancedContributionRecord enhancedContributionRecord = (EnhancedContributionRecord) obj;
        enhancedContributionRecord.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, enhancedContributionRecord.transaction_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, enhancedContributionRecord.created_at);
        protoAdapter2.encodeWithTag(protoWriter, 3, enhancedContributionRecord.amount_cents);
        protoAdapter.encodeWithTag(protoWriter, 4, enhancedContributionRecord.contributor_identifier);
        TransactionType.ADAPTER.encodeWithTag(protoWriter, 5, enhancedContributionRecord.transaction_type);
        PoolContributionStatus.ADAPTER.encodeWithTag(protoWriter, 6, enhancedContributionRecord.status);
        protoAdapter.encodeWithTag(protoWriter, 7, enhancedContributionRecord.contributor_comment);
        protoAdapter.encodeWithTag(protoWriter, 8, enhancedContributionRecord.pool_token);
        protoAdapter.encodeWithTag(protoWriter, 9, enhancedContributionRecord.pool_name);
        protoAdapter.encodeWithTag(protoWriter, 10, enhancedContributionRecord.owner_token);
        protoWriter.writeBytes(enhancedContributionRecord.unknownFields());
    }
}
