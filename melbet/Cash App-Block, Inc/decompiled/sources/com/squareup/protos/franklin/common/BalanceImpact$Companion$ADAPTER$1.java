package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BalanceImpact$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BalanceImpact((Money) obj2, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BalanceImpact balanceImpact = (BalanceImpact) obj;
        reverseProtoWriter.getClass();
        balanceImpact.getClass();
        reverseProtoWriter.writeBytes(balanceImpact.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, balanceImpact.amount);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, balanceImpact.balance_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BalanceImpact balanceImpact = (BalanceImpact) obj;
        balanceImpact.getClass();
        return Money.ADAPTER.encodedSizeWithTag(2, balanceImpact.amount) + ProtoAdapter.STRING.encodedSizeWithTag(1, balanceImpact.balance_name) + balanceImpact.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BalanceImpact balanceImpact = (BalanceImpact) obj;
        balanceImpact.getClass();
        Money money = balanceImpact.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = balanceImpact.balance_name;
        byteString.getClass();
        return new BalanceImpact(money2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BalanceImpact balanceImpact = (BalanceImpact) obj;
        balanceImpact.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, balanceImpact.balance_name);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, balanceImpact.amount);
        protoWriter.writeBytes(balanceImpact.unknownFields());
    }
}
