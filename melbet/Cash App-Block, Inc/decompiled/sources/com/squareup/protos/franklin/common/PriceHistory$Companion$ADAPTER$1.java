package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class PriceHistory$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PriceHistory((Long) obj, (Long) obj2, (Long) obj3, (String) obj4, (String) obj5, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    m.add(PriceTick.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PriceHistory priceHistory = (PriceHistory) obj;
        reverseProtoWriter.getClass();
        priceHistory.getClass();
        reverseProtoWriter.writeBytes(priceHistory.unknownFields());
        PriceTick.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, priceHistory.price_ticks);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, priceHistory.quote_currency_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, priceHistory.base_currency_code);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, priceHistory.tick_frequency_ms);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, priceHistory.end_time);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, priceHistory.start_time);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PriceHistory priceHistory = (PriceHistory) obj;
        priceHistory.getClass();
        int size$okio = priceHistory.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, priceHistory.tick_frequency_ms) + protoAdapter.encodedSizeWithTag(2, priceHistory.end_time) + protoAdapter.encodedSizeWithTag(1, priceHistory.start_time) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return PriceTick.ADAPTER.asRepeated().encodedSizeWithTag(6, priceHistory.price_ticks) + protoAdapter2.encodedSizeWithTag(5, priceHistory.quote_currency_code) + protoAdapter2.encodedSizeWithTag(4, priceHistory.base_currency_code) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PriceHistory priceHistory = (PriceHistory) obj;
        priceHistory.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(priceHistory.price_ticks, PriceTick.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Long l = priceHistory.start_time;
        Long l2 = priceHistory.end_time;
        Long l3 = priceHistory.tick_frequency_ms;
        String str = priceHistory.base_currency_code;
        String str2 = priceHistory.quote_currency_code;
        byteString.getClass();
        return new PriceHistory(l, l2, l3, str, str2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PriceHistory priceHistory = (PriceHistory) obj;
        priceHistory.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, priceHistory.start_time);
        protoAdapter.encodeWithTag(protoWriter, 2, priceHistory.end_time);
        protoAdapter.encodeWithTag(protoWriter, 3, priceHistory.tick_frequency_ms);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, priceHistory.base_currency_code);
        protoAdapter2.encodeWithTag(protoWriter, 5, priceHistory.quote_currency_code);
        PriceTick.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, priceHistory.price_ticks);
        protoWriter.writeBytes(priceHistory.unknownFields());
    }
}
