package com.squareup.protos.cash.portfolios;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class BalanceHistory$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BalanceHistory((Long) obj, (Long) obj2, (CurrencyCode) obj3, m, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj3 = CurrencyCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 4) {
                m.add(BalanceTick.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BalanceHistory balanceHistory = (BalanceHistory) obj;
        reverseProtoWriter.getClass();
        balanceHistory.getClass();
        reverseProtoWriter.writeBytes(balanceHistory.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, balanceHistory.end_time);
        BalanceTick.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, balanceHistory.balance_ticks);
        CurrencyCode.ADAPTER.encodeWithTag(reverseProtoWriter, 3, balanceHistory.currency_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, balanceHistory.tick_frequency_ms);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, balanceHistory.start_time);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BalanceHistory balanceHistory = (BalanceHistory) obj;
        balanceHistory.getClass();
        int size$okio = balanceHistory.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(5, balanceHistory.end_time) + BalanceTick.ADAPTER.asRepeated().encodedSizeWithTag(4, balanceHistory.balance_ticks) + CurrencyCode.ADAPTER.encodedSizeWithTag(3, balanceHistory.currency_code) + protoAdapter.encodedSizeWithTag(2, balanceHistory.tick_frequency_ms) + protoAdapter.encodedSizeWithTag(1, balanceHistory.start_time) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BalanceHistory balanceHistory = (BalanceHistory) obj;
        balanceHistory.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(balanceHistory.balance_ticks, BalanceTick.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Long l = balanceHistory.start_time;
        Long l2 = balanceHistory.tick_frequency_ms;
        CurrencyCode currencyCode = balanceHistory.currency_code;
        Long l3 = balanceHistory.end_time;
        byteString.getClass();
        return new BalanceHistory(l, l2, currencyCode, m1169redactElements, l3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BalanceHistory balanceHistory = (BalanceHistory) obj;
        balanceHistory.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, balanceHistory.start_time);
        protoAdapter.encodeWithTag(protoWriter, 2, balanceHistory.tick_frequency_ms);
        CurrencyCode.ADAPTER.encodeWithTag(protoWriter, 3, balanceHistory.currency_code);
        BalanceTick.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, balanceHistory.balance_ticks);
        protoAdapter.encodeWithTag(protoWriter, 5, balanceHistory.end_time);
        protoWriter.writeBytes(balanceHistory.unknownFields());
    }
}
