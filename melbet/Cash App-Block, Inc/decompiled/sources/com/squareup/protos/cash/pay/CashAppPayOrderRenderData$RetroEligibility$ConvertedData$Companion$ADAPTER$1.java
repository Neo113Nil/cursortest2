package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayOrderRenderData$RetroEligibility$ConvertedData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashAppPayOrderRenderData.RetroEligibility.ConvertedData((String) obj, (String) obj2, (Money) obj3, (Money) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayOrderRenderData.RetroEligibility.ConvertedData convertedData = (CashAppPayOrderRenderData.RetroEligibility.ConvertedData) obj;
        reverseProtoWriter.getClass();
        convertedData.getClass();
        reverseProtoWriter.writeBytes(convertedData.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, convertedData.drawdown_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, convertedData.downpayment_amount);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, convertedData.loan_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, convertedData.view_payment_plan_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayOrderRenderData.RetroEligibility.ConvertedData convertedData = (CashAppPayOrderRenderData.RetroEligibility.ConvertedData) obj;
        convertedData.getClass();
        int size$okio = convertedData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, convertedData.loan_token) + protoAdapter.encodedSizeWithTag(1, convertedData.view_payment_plan_url) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(4, convertedData.drawdown_amount) + protoAdapter2.encodedSizeWithTag(3, convertedData.downpayment_amount) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayOrderRenderData.RetroEligibility.ConvertedData convertedData = (CashAppPayOrderRenderData.RetroEligibility.ConvertedData) obj;
        convertedData.getClass();
        Money money = convertedData.downpayment_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = convertedData.drawdown_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = convertedData.view_payment_plan_url;
        String str2 = convertedData.loan_token;
        byteString.getClass();
        return new CashAppPayOrderRenderData.RetroEligibility.ConvertedData(str, str2, money2, money4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayOrderRenderData.RetroEligibility.ConvertedData convertedData = (CashAppPayOrderRenderData.RetroEligibility.ConvertedData) obj;
        convertedData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, convertedData.view_payment_plan_url);
        protoAdapter.encodeWithTag(protoWriter, 2, convertedData.loan_token);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, convertedData.downpayment_amount);
        protoAdapter2.encodeWithTag(protoWriter, 4, convertedData.drawdown_amount);
        protoWriter.writeBytes(convertedData.unknownFields());
    }
}
