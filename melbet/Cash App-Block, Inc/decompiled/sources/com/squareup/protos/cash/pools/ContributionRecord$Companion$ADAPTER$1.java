package com.squareup.protos.cash.pools;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ContributionRecord$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ContributionRecord((String) obj, (Long) obj2, (Long) obj3, (String) obj4, (TransactionType) obj5, (PoolContributionStatus) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    try {
                        obj5 = TransactionType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    try {
                        obj6 = PoolContributionStatus.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ContributionRecord contributionRecord = (ContributionRecord) obj;
        reverseProtoWriter.getClass();
        contributionRecord.getClass();
        reverseProtoWriter.writeBytes(contributionRecord.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, contributionRecord.contributor_comment);
        PoolContributionStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 6, contributionRecord.status);
        TransactionType.ADAPTER.encodeWithTag(reverseProtoWriter, 5, contributionRecord.transaction_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, contributionRecord.contributor_identifier);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, contributionRecord.amount_cents);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, contributionRecord.created_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, contributionRecord.transaction_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ContributionRecord contributionRecord = (ContributionRecord) obj;
        contributionRecord.getClass();
        int size$okio = contributionRecord.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, contributionRecord.transaction_token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(7, contributionRecord.contributor_comment) + PoolContributionStatus.ADAPTER.encodedSizeWithTag(6, contributionRecord.status) + TransactionType.ADAPTER.encodedSizeWithTag(5, contributionRecord.transaction_type) + protoAdapter.encodedSizeWithTag(4, contributionRecord.contributor_identifier) + protoAdapter2.encodedSizeWithTag(3, contributionRecord.amount_cents) + protoAdapter2.encodedSizeWithTag(2, contributionRecord.created_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ContributionRecord contributionRecord = (ContributionRecord) obj;
        contributionRecord.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = contributionRecord.transaction_token;
        Long l = contributionRecord.created_at;
        Long l2 = contributionRecord.amount_cents;
        String str2 = contributionRecord.contributor_identifier;
        TransactionType transactionType = contributionRecord.transaction_type;
        PoolContributionStatus poolContributionStatus = contributionRecord.status;
        byteString.getClass();
        return new ContributionRecord(str, l, l2, str2, transactionType, poolContributionStatus, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ContributionRecord contributionRecord = (ContributionRecord) obj;
        contributionRecord.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, contributionRecord.transaction_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 2, contributionRecord.created_at);
        protoAdapter2.encodeWithTag(protoWriter, 3, contributionRecord.amount_cents);
        protoAdapter.encodeWithTag(protoWriter, 4, contributionRecord.contributor_identifier);
        TransactionType.ADAPTER.encodeWithTag(protoWriter, 5, contributionRecord.transaction_type);
        PoolContributionStatus.ADAPTER.encodeWithTag(protoWriter, 6, contributionRecord.status);
        protoAdapter.encodeWithTag(protoWriter, 7, contributionRecord.contributor_comment);
        protoWriter.writeBytes(contributionRecord.unknownFields());
    }
}
