package com.squareup.protos.cash.marketprices;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class CurrentPrice$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CurrentPrice((String) obj, (Money) obj2, (Money) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CurrentPrice currentPrice = (CurrentPrice) obj;
        reverseProtoWriter.getClass();
        currentPrice.getClass();
        reverseProtoWriter.writeBytes(currentPrice.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 4, currentPrice.time_sec);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, currentPrice.price_at_market_open);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, currentPrice.current_price);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, currentPrice.investment_entity_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CurrentPrice currentPrice = (CurrentPrice) obj;
        currentPrice.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, currentPrice.investment_entity_token) + currentPrice.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return ProtoAdapter.INT64.encodedSizeWithTag(4, currentPrice.time_sec) + protoAdapter.encodedSizeWithTag(3, currentPrice.price_at_market_open) + protoAdapter.encodedSizeWithTag(2, currentPrice.current_price) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CurrentPrice currentPrice = (CurrentPrice) obj;
        currentPrice.getClass();
        Money money = currentPrice.current_price;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = currentPrice.price_at_market_open;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = currentPrice.investment_entity_token;
        Long l = currentPrice.time_sec;
        byteString.getClass();
        return new CurrentPrice(str, money2, money4, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CurrentPrice currentPrice = (CurrentPrice) obj;
        currentPrice.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, currentPrice.investment_entity_token);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, currentPrice.current_price);
        protoAdapter.encodeWithTag(protoWriter, 3, currentPrice.price_at_market_open);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, currentPrice.time_sec);
        protoWriter.writeBytes(currentPrice.unknownFields());
    }
}
