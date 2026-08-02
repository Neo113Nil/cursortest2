package com.squareup.protos.cash.investcrypto.resources;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Order$FundingSource$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002f. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        long j;
        Object obj2;
        Object obj3;
        Object obj4;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
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
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        Object obj21 = null;
        Object obj22 = null;
        Object obj23 = null;
        Object obj24 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Order.FundingSource((Money) obj6, (String) obj5, (CashInInstrumentType) obj18, (Money) obj9, (String) obj19, (String) obj20, (String) obj21, (String) obj22, (Money) obj14, (String) obj24, (String) obj15, (String) obj16, (String) obj17, (Money) obj7, (Money) obj8, (Money) obj10, (Money) obj11, (Money) obj12, (Money) obj13, (TransactionOrchestrator) obj23, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    j = beginMessage;
                    obj = obj15;
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    obj15 = obj;
                    obj4 = obj5;
                    break;
                case 2:
                    j = beginMessage;
                    obj = obj15;
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    obj15 = obj;
                    break;
                case 3:
                    j = beginMessage;
                    obj = obj15;
                    try {
                        obj18 = CashInInstrumentType.ADAPTER.decode(protoReader);
                        obj15 = obj;
                        obj4 = obj5;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj2 = obj7;
                        obj3 = obj8;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    j = beginMessage;
                    obj9 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj9);
                    obj4 = obj5;
                    break;
                case 5:
                    j = beginMessage;
                    obj19 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 6:
                    j = beginMessage;
                    obj20 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 7:
                    j = beginMessage;
                    obj21 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 8:
                    j = beginMessage;
                    obj22 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 9:
                    j = beginMessage;
                    obj14 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj14);
                    obj4 = obj5;
                    break;
                case 10:
                    j = beginMessage;
                    obj24 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 11:
                    j = beginMessage;
                    obj15 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 12:
                    j = beginMessage;
                    obj16 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 13:
                    j = beginMessage;
                    obj17 = ProtoAdapter.STRING.decode(protoReader);
                    obj4 = obj5;
                    break;
                case 14:
                    j = beginMessage;
                    obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                    obj4 = obj5;
                    break;
                case 15:
                    j = beginMessage;
                    obj8 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj8);
                    obj4 = obj5;
                    break;
                case 16:
                    j = beginMessage;
                    obj10 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj10);
                    obj4 = obj5;
                    break;
                case 17:
                    j = beginMessage;
                    obj11 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj11);
                    obj4 = obj5;
                    break;
                case 18:
                    j = beginMessage;
                    obj12 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj12);
                    obj4 = obj5;
                    break;
                case 19:
                    j = beginMessage;
                    obj13 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj13);
                    obj4 = obj5;
                    break;
                case 20:
                    try {
                        obj23 = TransactionOrchestrator.ADAPTER.decode(protoReader);
                        j = beginMessage;
                        obj4 = obj5;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj15;
                        j = beginMessage;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        obj2 = obj7;
                        obj3 = obj8;
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    j = beginMessage;
                    obj3 = obj8;
                    obj = obj15;
                    obj2 = obj7;
                    obj4 = obj5;
                    obj8 = obj3;
                    obj7 = obj2;
                    obj15 = obj;
                    break;
            }
            obj5 = obj4;
            beginMessage = j;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Order.FundingSource fundingSource = (Order.FundingSource) obj;
        reverseProtoWriter.getClass();
        fundingSource.getClass();
        reverseProtoWriter.writeBytes(fundingSource.unknownFields());
        TransactionOrchestrator.ADAPTER.encodeWithTag(reverseProtoWriter, 20, fundingSource.transaction_orchestrator);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 19, fundingSource.restricted_target_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 18, fundingSource.restricted_source_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 17, fundingSource.unrestricted_target_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 16, fundingSource.unrestricted_source_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, fundingSource.restricted_fee);
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, fundingSource.unrestricted_fee);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, fundingSource.restricted_target_transaction_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, fundingSource.restricted_target_instrument_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, fundingSource.restricted_source_transaction_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, fundingSource.restricted_source_instrument_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, fundingSource.restricted_amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, fundingSource.unrestricted_target_transaction_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, fundingSource.unrestricted_target_instrument_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, fundingSource.unrestricted_source_transaction_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, fundingSource.unrestricted_source_instrument_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, fundingSource.unrestricted_amount);
        CashInInstrumentType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, fundingSource.cash_in_instrument_type);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, fundingSource.cash_in_instrument_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, fundingSource.cash_in_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Order.FundingSource fundingSource = (Order.FundingSource) obj;
        fundingSource.getClass();
        int size$okio = fundingSource.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, fundingSource.cash_in_amount) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return TransactionOrchestrator.ADAPTER.encodedSizeWithTag(20, fundingSource.transaction_orchestrator) + protoAdapter.encodedSizeWithTag(19, fundingSource.restricted_target_amount) + protoAdapter.encodedSizeWithTag(18, fundingSource.restricted_source_amount) + protoAdapter.encodedSizeWithTag(17, fundingSource.unrestricted_target_amount) + protoAdapter.encodedSizeWithTag(16, fundingSource.unrestricted_source_amount) + protoAdapter.encodedSizeWithTag(15, fundingSource.restricted_fee) + protoAdapter.encodedSizeWithTag(14, fundingSource.unrestricted_fee) + protoAdapter2.encodedSizeWithTag(13, fundingSource.restricted_target_transaction_token) + protoAdapter2.encodedSizeWithTag(12, fundingSource.restricted_target_instrument_token) + protoAdapter2.encodedSizeWithTag(11, fundingSource.restricted_source_transaction_token) + protoAdapter2.encodedSizeWithTag(10, fundingSource.restricted_source_instrument_token) + protoAdapter.encodedSizeWithTag(9, fundingSource.restricted_amount) + protoAdapter2.encodedSizeWithTag(8, fundingSource.unrestricted_target_transaction_token) + protoAdapter2.encodedSizeWithTag(7, fundingSource.unrestricted_target_instrument_token) + protoAdapter2.encodedSizeWithTag(6, fundingSource.unrestricted_source_transaction_token) + protoAdapter2.encodedSizeWithTag(5, fundingSource.unrestricted_source_instrument_token) + protoAdapter.encodedSizeWithTag(4, fundingSource.unrestricted_amount) + CashInInstrumentType.ADAPTER.encodedSizeWithTag(3, fundingSource.cash_in_instrument_type) + protoAdapter2.encodedSizeWithTag(2, fundingSource.cash_in_instrument_token) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Order.FundingSource fundingSource = (Order.FundingSource) obj;
        fundingSource.getClass();
        Money money = fundingSource.cash_in_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = fundingSource.unrestricted_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = fundingSource.restricted_amount;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = fundingSource.unrestricted_fee;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        Money money9 = fundingSource.restricted_fee;
        Money money10 = money9 != null ? (Money) Money.ADAPTER.redact(money9) : null;
        Money money11 = fundingSource.unrestricted_source_amount;
        Money money12 = money11 != null ? (Money) Money.ADAPTER.redact(money11) : null;
        Money money13 = fundingSource.unrestricted_target_amount;
        Money money14 = money13 != null ? (Money) Money.ADAPTER.redact(money13) : null;
        Money money15 = fundingSource.restricted_source_amount;
        Money money16 = money15 != null ? (Money) Money.ADAPTER.redact(money15) : null;
        Money money17 = fundingSource.restricted_target_amount;
        Money money18 = money17 != null ? (Money) Money.ADAPTER.redact(money17) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = fundingSource.cash_in_instrument_token;
        CashInInstrumentType cashInInstrumentType = fundingSource.cash_in_instrument_type;
        String str2 = fundingSource.unrestricted_source_instrument_token;
        String str3 = fundingSource.unrestricted_source_transaction_token;
        String str4 = fundingSource.unrestricted_target_instrument_token;
        String str5 = fundingSource.unrestricted_target_transaction_token;
        String str6 = fundingSource.restricted_source_instrument_token;
        String str7 = fundingSource.restricted_source_transaction_token;
        String str8 = fundingSource.restricted_target_instrument_token;
        String str9 = fundingSource.restricted_target_transaction_token;
        TransactionOrchestrator transactionOrchestrator = fundingSource.transaction_orchestrator;
        byteString.getClass();
        return new Order.FundingSource(money2, str, cashInInstrumentType, money4, str2, str3, str4, str5, money6, str6, str7, str8, str9, money8, money10, money12, money14, money16, money18, transactionOrchestrator, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Order.FundingSource fundingSource = (Order.FundingSource) obj;
        fundingSource.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, fundingSource.cash_in_amount);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 2, fundingSource.cash_in_instrument_token);
        CashInInstrumentType.ADAPTER.encodeWithTag(protoWriter, 3, fundingSource.cash_in_instrument_type);
        protoAdapter.encodeWithTag(protoWriter, 4, fundingSource.unrestricted_amount);
        protoAdapter2.encodeWithTag(protoWriter, 5, fundingSource.unrestricted_source_instrument_token);
        protoAdapter2.encodeWithTag(protoWriter, 6, fundingSource.unrestricted_source_transaction_token);
        protoAdapter2.encodeWithTag(protoWriter, 7, fundingSource.unrestricted_target_instrument_token);
        protoAdapter2.encodeWithTag(protoWriter, 8, fundingSource.unrestricted_target_transaction_token);
        protoAdapter.encodeWithTag(protoWriter, 9, fundingSource.restricted_amount);
        protoAdapter2.encodeWithTag(protoWriter, 10, fundingSource.restricted_source_instrument_token);
        protoAdapter2.encodeWithTag(protoWriter, 11, fundingSource.restricted_source_transaction_token);
        protoAdapter2.encodeWithTag(protoWriter, 12, fundingSource.restricted_target_instrument_token);
        protoAdapter2.encodeWithTag(protoWriter, 13, fundingSource.restricted_target_transaction_token);
        protoAdapter.encodeWithTag(protoWriter, 14, fundingSource.unrestricted_fee);
        protoAdapter.encodeWithTag(protoWriter, 15, fundingSource.restricted_fee);
        protoAdapter.encodeWithTag(protoWriter, 16, fundingSource.unrestricted_source_amount);
        protoAdapter.encodeWithTag(protoWriter, 17, fundingSource.unrestricted_target_amount);
        protoAdapter.encodeWithTag(protoWriter, 18, fundingSource.restricted_source_amount);
        protoAdapter.encodeWithTag(protoWriter, 19, fundingSource.restricted_target_amount);
        TransactionOrchestrator.ADAPTER.encodeWithTag(protoWriter, 20, fundingSource.transaction_orchestrator);
        protoWriter.writeBytes(fundingSource.unknownFields());
    }
}
