package com.squareup.protos.cash.disputron.core;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ClaimResolutionStatus$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj14 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClaimResolutionStatus((String) obj4, (String) obj5, (Money) obj6, (String) obj7, (Long) obj8, (Long) obj9, (TransactionType) obj10, (String) obj11, (String) obj12, (Long) obj13, (ListClaimDSL3Data) obj14, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    continue;
                case 4:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 5:
                    obj8 = ProtoAdapter.INT64.decode(protoReader);
                    continue;
                case 6:
                    obj9 = ProtoAdapter.INT64.decode(protoReader);
                    continue;
                case 7:
                    try {
                        obj10 = TransactionType.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj4;
                        obj2 = obj7;
                        obj3 = obj8;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 8:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 9:
                    obj12 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 10:
                    obj13 = ProtoAdapter.INT64.decode(protoReader);
                    continue;
                case 11:
                    obj14 = TransactorKt.decodeMessageOrMerge(ListClaimDSL3Data.ADAPTER, protoReader, obj14);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj7;
                    obj3 = obj8;
                    break;
            }
            obj4 = obj;
            obj7 = obj2;
            obj8 = obj3;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClaimResolutionStatus claimResolutionStatus = (ClaimResolutionStatus) obj;
        reverseProtoWriter.getClass();
        claimResolutionStatus.getClass();
        reverseProtoWriter.writeBytes(claimResolutionStatus.unknownFields());
        ListClaimDSL3Data.ADAPTER.encodeWithTag(reverseProtoWriter, 11, claimResolutionStatus.dsl3_data);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, claimResolutionStatus.transaction_initiated_at);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, claimResolutionStatus.icon_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, claimResolutionStatus.counterparty_name);
        TransactionType.ADAPTER.encodeWithTag(reverseProtoWriter, 7, claimResolutionStatus.transaction_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, claimResolutionStatus.claim_resolved_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, claimResolutionStatus.claim_submitted_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, claimResolutionStatus.status);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, claimResolutionStatus.amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, claimResolutionStatus.transaction_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, claimResolutionStatus.claim_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClaimResolutionStatus claimResolutionStatus = (ClaimResolutionStatus) obj;
        claimResolutionStatus.getClass();
        int size$okio = claimResolutionStatus.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, claimResolutionStatus.status) + Money.ADAPTER.encodedSizeWithTag(3, claimResolutionStatus.amount) + protoAdapter.encodedSizeWithTag(2, claimResolutionStatus.transaction_token) + protoAdapter.encodedSizeWithTag(1, claimResolutionStatus.claim_token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return ListClaimDSL3Data.ADAPTER.encodedSizeWithTag(11, claimResolutionStatus.dsl3_data) + protoAdapter2.encodedSizeWithTag(10, claimResolutionStatus.transaction_initiated_at) + protoAdapter.encodedSizeWithTag(9, claimResolutionStatus.icon_url) + protoAdapter.encodedSizeWithTag(8, claimResolutionStatus.counterparty_name) + TransactionType.ADAPTER.encodedSizeWithTag(7, claimResolutionStatus.transaction_type) + protoAdapter2.encodedSizeWithTag(6, claimResolutionStatus.claim_resolved_at) + protoAdapter2.encodedSizeWithTag(5, claimResolutionStatus.claim_submitted_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClaimResolutionStatus claimResolutionStatus = (ClaimResolutionStatus) obj;
        claimResolutionStatus.getClass();
        Money money = claimResolutionStatus.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ListClaimDSL3Data listClaimDSL3Data = claimResolutionStatus.dsl3_data;
        ListClaimDSL3Data listClaimDSL3Data2 = listClaimDSL3Data != null ? (ListClaimDSL3Data) ListClaimDSL3Data.ADAPTER.redact(listClaimDSL3Data) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = claimResolutionStatus.claim_token;
        String str2 = claimResolutionStatus.transaction_token;
        String str3 = claimResolutionStatus.status;
        Long l = claimResolutionStatus.claim_submitted_at;
        Long l2 = claimResolutionStatus.claim_resolved_at;
        TransactionType transactionType = claimResolutionStatus.transaction_type;
        String str4 = claimResolutionStatus.counterparty_name;
        String str5 = claimResolutionStatus.icon_url;
        Long l3 = claimResolutionStatus.transaction_initiated_at;
        byteString.getClass();
        return new ClaimResolutionStatus(str, str2, money2, str3, l, l2, transactionType, str4, str5, l3, listClaimDSL3Data2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClaimResolutionStatus claimResolutionStatus = (ClaimResolutionStatus) obj;
        claimResolutionStatus.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, claimResolutionStatus.claim_token);
        protoAdapter.encodeWithTag(protoWriter, 2, claimResolutionStatus.transaction_token);
        Money.ADAPTER.encodeWithTag(protoWriter, 3, claimResolutionStatus.amount);
        protoAdapter.encodeWithTag(protoWriter, 4, claimResolutionStatus.status);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 5, claimResolutionStatus.claim_submitted_at);
        protoAdapter2.encodeWithTag(protoWriter, 6, claimResolutionStatus.claim_resolved_at);
        TransactionType.ADAPTER.encodeWithTag(protoWriter, 7, claimResolutionStatus.transaction_type);
        protoAdapter.encodeWithTag(protoWriter, 8, claimResolutionStatus.counterparty_name);
        protoAdapter.encodeWithTag(protoWriter, 9, claimResolutionStatus.icon_url);
        protoAdapter2.encodeWithTag(protoWriter, 10, claimResolutionStatus.transaction_initiated_at);
        ListClaimDSL3Data.ADAPTER.encodeWithTag(protoWriter, 11, claimResolutionStatus.dsl3_data);
        protoWriter.writeBytes(claimResolutionStatus.unknownFields());
    }
}
