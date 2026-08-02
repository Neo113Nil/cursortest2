package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ExchangeRate$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ExchangeRate((Money) obj, (Long) obj2, (Long) obj3, (Long) obj4, (CurrencyCode) obj5, (Long) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 5:
                    try {
                        obj5 = CurrencyCode.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    obj6 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ExchangeRate exchangeRate = (ExchangeRate) obj;
        reverseProtoWriter.getClass();
        exchangeRate.getClass();
        reverseProtoWriter.writeBytes(exchangeRate.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, exchangeRate.created_at_seconds);
        CurrencyCode.ADAPTER.encodeWithTag(reverseProtoWriter, 5, exchangeRate.currency_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, exchangeRate.base_value_cents);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, exchangeRate.change_cents);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, exchangeRate.change_bps);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, exchangeRate.market_value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExchangeRate exchangeRate = (ExchangeRate) obj;
        exchangeRate.getClass();
        int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(1, exchangeRate.market_value) + exchangeRate.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(6, exchangeRate.created_at_seconds) + CurrencyCode.ADAPTER.encodedSizeWithTag(5, exchangeRate.currency_code) + protoAdapter.encodedSizeWithTag(4, exchangeRate.base_value_cents) + protoAdapter.encodedSizeWithTag(3, exchangeRate.change_cents) + protoAdapter.encodedSizeWithTag(2, exchangeRate.change_bps) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExchangeRate exchangeRate = (ExchangeRate) obj;
        exchangeRate.getClass();
        Money money = exchangeRate.market_value;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = exchangeRate.change_bps;
        Long l2 = exchangeRate.change_cents;
        Long l3 = exchangeRate.base_value_cents;
        CurrencyCode currencyCode = exchangeRate.currency_code;
        Long l4 = exchangeRate.created_at_seconds;
        byteString.getClass();
        return new ExchangeRate(money2, l, l2, l3, currencyCode, l4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExchangeRate exchangeRate = (ExchangeRate) obj;
        exchangeRate.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, exchangeRate.market_value);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 2, exchangeRate.change_bps);
        protoAdapter.encodeWithTag(protoWriter, 3, exchangeRate.change_cents);
        protoAdapter.encodeWithTag(protoWriter, 4, exchangeRate.base_value_cents);
        CurrencyCode.ADAPTER.encodeWithTag(protoWriter, 5, exchangeRate.currency_code);
        protoAdapter.encodeWithTag(protoWriter, 6, exchangeRate.created_at_seconds);
        protoWriter.writeBytes(exchangeRate.unknownFields());
    }
}
