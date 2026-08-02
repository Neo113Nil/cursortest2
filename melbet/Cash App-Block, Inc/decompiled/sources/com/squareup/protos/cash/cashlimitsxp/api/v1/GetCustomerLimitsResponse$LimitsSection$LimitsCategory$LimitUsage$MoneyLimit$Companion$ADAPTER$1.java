package com.squareup.protos.cash.cashlimitsxp.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetCustomerLimitsResponse$LimitsSection$LimitsCategory$LimitUsage$MoneyLimit$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit((Money) obj, (Money) obj2, (Money) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit moneyLimit = (GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit) obj;
        reverseProtoWriter.getClass();
        moneyLimit.getClass();
        reverseProtoWriter.writeBytes(moneyLimit.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, moneyLimit.limit_threshold_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, moneyLimit.amount_remaining);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, moneyLimit.amount_used);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit moneyLimit = (GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit) obj;
        moneyLimit.getClass();
        int size$okio = moneyLimit.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, moneyLimit.limit_threshold_amount) + protoAdapter.encodedSizeWithTag(2, moneyLimit.amount_remaining) + protoAdapter.encodedSizeWithTag(1, moneyLimit.amount_used) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit moneyLimit = (GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit) obj;
        moneyLimit.getClass();
        Money money = moneyLimit.amount_used;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = moneyLimit.amount_remaining;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = moneyLimit.limit_threshold_amount;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit(money2, money4, money6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit moneyLimit = (GetCustomerLimitsResponse.LimitsSection.LimitsCategory.LimitUsage.MoneyLimit) obj;
        moneyLimit.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, moneyLimit.amount_used);
        protoAdapter.encodeWithTag(protoWriter, 2, moneyLimit.amount_remaining);
        protoAdapter.encodeWithTag(protoWriter, 3, moneyLimit.limit_threshold_amount);
        protoWriter.writeBytes(moneyLimit.unknownFields());
    }
}
