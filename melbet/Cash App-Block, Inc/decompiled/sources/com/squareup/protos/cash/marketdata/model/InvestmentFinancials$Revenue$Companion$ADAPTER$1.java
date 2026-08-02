package com.squareup.protos.cash.marketdata.model;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.marketdata.model.InvestmentFinancials;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InvestmentFinancials$Revenue$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new InvestmentFinancials.Revenue((String) obj, (String) obj2, (Money) obj3, (Money) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        InvestmentFinancials.Revenue revenue = (InvestmentFinancials.Revenue) obj;
        reverseProtoWriter.getClass();
        revenue.getClass();
        reverseProtoWriter.writeBytes(revenue.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, revenue.profit);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, revenue.revenue);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, revenue.year);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, revenue.quarter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestmentFinancials.Revenue revenue = (InvestmentFinancials.Revenue) obj;
        revenue.getClass();
        int size$okio = revenue.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, revenue.year) + protoAdapter.encodedSizeWithTag(1, revenue.quarter) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(4, revenue.profit) + protoAdapter2.encodedSizeWithTag(3, revenue.revenue) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestmentFinancials.Revenue revenue = (InvestmentFinancials.Revenue) obj;
        revenue.getClass();
        Money money = revenue.revenue;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = revenue.profit;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = revenue.quarter;
        String str2 = revenue.year;
        byteString.getClass();
        return new InvestmentFinancials.Revenue(str, str2, money2, money4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestmentFinancials.Revenue revenue = (InvestmentFinancials.Revenue) obj;
        revenue.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, revenue.quarter);
        protoAdapter.encodeWithTag(protoWriter, 2, revenue.year);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, revenue.revenue);
        protoAdapter2.encodeWithTag(protoWriter, 4, revenue.profit);
        protoWriter.writeBytes(revenue.unknownFields());
    }
}
