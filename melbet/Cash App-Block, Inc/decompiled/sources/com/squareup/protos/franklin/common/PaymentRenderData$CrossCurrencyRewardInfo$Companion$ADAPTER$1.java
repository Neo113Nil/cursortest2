package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.PaymentRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaymentRenderData$CrossCurrencyRewardInfo$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PaymentRenderData.CrossCurrencyRewardInfo((Money) obj, (Money) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 9) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 10) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 12) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentRenderData.CrossCurrencyRewardInfo crossCurrencyRewardInfo = (PaymentRenderData.CrossCurrencyRewardInfo) obj;
        reverseProtoWriter.getClass();
        crossCurrencyRewardInfo.getClass();
        reverseProtoWriter.writeBytes(crossCurrencyRewardInfo.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 12, crossCurrencyRewardInfo.reward_transaction_token);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, crossCurrencyRewardInfo.reward_exchange_rate);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, crossCurrencyRewardInfo.reward_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentRenderData.CrossCurrencyRewardInfo crossCurrencyRewardInfo = (PaymentRenderData.CrossCurrencyRewardInfo) obj;
        crossCurrencyRewardInfo.getClass();
        int size$okio = crossCurrencyRewardInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(12, crossCurrencyRewardInfo.reward_transaction_token) + protoAdapter.encodedSizeWithTag(10, crossCurrencyRewardInfo.reward_exchange_rate) + protoAdapter.encodedSizeWithTag(9, crossCurrencyRewardInfo.reward_amount) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentRenderData.CrossCurrencyRewardInfo crossCurrencyRewardInfo = (PaymentRenderData.CrossCurrencyRewardInfo) obj;
        crossCurrencyRewardInfo.getClass();
        Money money = crossCurrencyRewardInfo.reward_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = crossCurrencyRewardInfo.reward_exchange_rate;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = crossCurrencyRewardInfo.reward_transaction_token;
        byteString.getClass();
        return new PaymentRenderData.CrossCurrencyRewardInfo(money2, money4, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentRenderData.CrossCurrencyRewardInfo crossCurrencyRewardInfo = (PaymentRenderData.CrossCurrencyRewardInfo) obj;
        crossCurrencyRewardInfo.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 9, crossCurrencyRewardInfo.reward_amount);
        protoAdapter.encodeWithTag(protoWriter, 10, crossCurrencyRewardInfo.reward_exchange_rate);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, crossCurrencyRewardInfo.reward_transaction_token);
        protoWriter.writeBytes(crossCurrencyRewardInfo.unknownFields());
    }
}
