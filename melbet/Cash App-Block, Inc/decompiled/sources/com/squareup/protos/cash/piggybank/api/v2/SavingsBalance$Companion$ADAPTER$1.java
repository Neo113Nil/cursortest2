package com.squareup.protos.cash.piggybank.api.v2;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SavingsBalance$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SavingsBalance((String) obj, (String) obj3, (Money) obj2, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
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
        SavingsBalance savingsBalance = (SavingsBalance) obj;
        reverseProtoWriter.getClass();
        savingsBalance.getClass();
        reverseProtoWriter.writeBytes(savingsBalance.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, savingsBalance.customer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, savingsBalance.stored_value_balance_token);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, savingsBalance.amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, savingsBalance.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsBalance savingsBalance = (SavingsBalance) obj;
        savingsBalance.getClass();
        int size$okio = savingsBalance.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, savingsBalance.customer_token) + protoAdapter.encodedSizeWithTag(3, savingsBalance.stored_value_balance_token) + Money.ADAPTER.encodedSizeWithTag(2, savingsBalance.amount) + protoAdapter.encodedSizeWithTag(1, savingsBalance.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsBalance savingsBalance = (SavingsBalance) obj;
        savingsBalance.getClass();
        Money money = savingsBalance.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = savingsBalance.token;
        String str2 = savingsBalance.stored_value_balance_token;
        String str3 = savingsBalance.customer_token;
        byteString.getClass();
        return new SavingsBalance(str, str2, money2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsBalance savingsBalance = (SavingsBalance) obj;
        savingsBalance.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, savingsBalance.token);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, savingsBalance.amount);
        protoAdapter.encodeWithTag(protoWriter, 3, savingsBalance.stored_value_balance_token);
        protoAdapter.encodeWithTag(protoWriter, 4, savingsBalance.customer_token);
        protoWriter.writeBytes(savingsBalance.unknownFields());
    }
}
