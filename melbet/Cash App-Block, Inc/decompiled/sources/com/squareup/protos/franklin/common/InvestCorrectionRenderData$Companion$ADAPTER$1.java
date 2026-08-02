package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InvestCorrectionRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj8 = null;
        Object obj9 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InvestCorrectionRenderData((String) obj, (String) obj2, (Money) obj3, (Money) obj4, (Money) obj5, (Money) obj6, (Money) obj7, (Long) obj8, (String) obj9, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 9:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvestCorrectionRenderData investCorrectionRenderData = (InvestCorrectionRenderData) obj;
        reverseProtoWriter.getClass();
        investCorrectionRenderData.getClass();
        reverseProtoWriter.writeBytes(investCorrectionRenderData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, investCorrectionRenderData.investment_entity_token);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 8, investCorrectionRenderData.settlement_date);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, investCorrectionRenderData.amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, investCorrectionRenderData.updated_total_cost);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, investCorrectionRenderData.original_total_cost);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, investCorrectionRenderData.updated_share_price);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, investCorrectionRenderData.original_share_price);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, investCorrectionRenderData.original_payment_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, investCorrectionRenderData.symbol_display_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestCorrectionRenderData investCorrectionRenderData = (InvestCorrectionRenderData) obj;
        investCorrectionRenderData.getClass();
        int size$okio = investCorrectionRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, investCorrectionRenderData.original_payment_token) + protoAdapter.encodedSizeWithTag(1, investCorrectionRenderData.symbol_display_name) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(9, investCorrectionRenderData.investment_entity_token) + ProtoAdapter.INT64.encodedSizeWithTag(8, investCorrectionRenderData.settlement_date) + protoAdapter2.encodedSizeWithTag(7, investCorrectionRenderData.amount) + protoAdapter2.encodedSizeWithTag(6, investCorrectionRenderData.updated_total_cost) + protoAdapter2.encodedSizeWithTag(5, investCorrectionRenderData.original_total_cost) + protoAdapter2.encodedSizeWithTag(4, investCorrectionRenderData.updated_share_price) + protoAdapter2.encodedSizeWithTag(3, investCorrectionRenderData.original_share_price) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestCorrectionRenderData investCorrectionRenderData = (InvestCorrectionRenderData) obj;
        investCorrectionRenderData.getClass();
        Money money = investCorrectionRenderData.original_share_price;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = investCorrectionRenderData.updated_share_price;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = investCorrectionRenderData.original_total_cost;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = investCorrectionRenderData.updated_total_cost;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        Money money9 = investCorrectionRenderData.amount;
        Money money10 = money9 != null ? (Money) Money.ADAPTER.redact(money9) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = investCorrectionRenderData.symbol_display_name;
        String str2 = investCorrectionRenderData.original_payment_token;
        Long l = investCorrectionRenderData.settlement_date;
        String str3 = investCorrectionRenderData.investment_entity_token;
        byteString.getClass();
        return new InvestCorrectionRenderData(str, str2, money2, money4, money6, money8, money10, l, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestCorrectionRenderData investCorrectionRenderData = (InvestCorrectionRenderData) obj;
        investCorrectionRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, investCorrectionRenderData.symbol_display_name);
        protoAdapter.encodeWithTag(protoWriter, 2, investCorrectionRenderData.original_payment_token);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, investCorrectionRenderData.original_share_price);
        protoAdapter2.encodeWithTag(protoWriter, 4, investCorrectionRenderData.updated_share_price);
        protoAdapter2.encodeWithTag(protoWriter, 5, investCorrectionRenderData.original_total_cost);
        protoAdapter2.encodeWithTag(protoWriter, 6, investCorrectionRenderData.updated_total_cost);
        protoAdapter2.encodeWithTag(protoWriter, 7, investCorrectionRenderData.amount);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, investCorrectionRenderData.settlement_date);
        protoAdapter.encodeWithTag(protoWriter, 9, investCorrectionRenderData.investment_entity_token);
        protoWriter.writeBytes(investCorrectionRenderData.unknownFields());
    }
}
