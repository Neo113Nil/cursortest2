package com.squareup.protos.cash.local.activity;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.protos.cash.local.common.values.LocalCash;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppLocalOrderRenderData$LocalCashData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppLocalOrderRenderData.LocalCashData((Money) obj, (LocalCash) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalCash.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppLocalOrderRenderData.LocalCashData localCashData = (CashAppLocalOrderRenderData.LocalCashData) obj;
        reverseProtoWriter.getClass();
        localCashData.getClass();
        reverseProtoWriter.writeBytes(localCashData.unknownFields());
        LocalCash.ADAPTER.encodeWithTag(reverseProtoWriter, 2, localCashData.local_cash_earnings);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, localCashData.local_cash_order_redemption_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppLocalOrderRenderData.LocalCashData localCashData = (CashAppLocalOrderRenderData.LocalCashData) obj;
        localCashData.getClass();
        return LocalCash.ADAPTER.encodedSizeWithTag(2, localCashData.local_cash_earnings) + Money.ADAPTER.encodedSizeWithTag(1, localCashData.local_cash_order_redemption_amount) + localCashData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppLocalOrderRenderData.LocalCashData localCashData = (CashAppLocalOrderRenderData.LocalCashData) obj;
        localCashData.getClass();
        Money money = localCashData.local_cash_order_redemption_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        LocalCash localCash = localCashData.local_cash_earnings;
        LocalCash localCash2 = localCash != null ? (LocalCash) LocalCash.ADAPTER.redact(localCash) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashAppLocalOrderRenderData.LocalCashData(money2, localCash2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppLocalOrderRenderData.LocalCashData localCashData = (CashAppLocalOrderRenderData.LocalCashData) obj;
        localCashData.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, localCashData.local_cash_order_redemption_amount);
        LocalCash.ADAPTER.encodeWithTag(protoWriter, 2, localCashData.local_cash_earnings);
        protoWriter.writeBytes(localCashData.unknownFields());
    }
}
